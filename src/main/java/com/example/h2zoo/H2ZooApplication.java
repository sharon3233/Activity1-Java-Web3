package com.example.h2zoo;

import com.example.h2zoo.model.Bird;
import com.example.h2zoo.model.Fish;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.BirdRepository;
import com.example.h2zoo.repository.FishRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2ZooApplication.class, args);

		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);
		FishRepository fishRepository =
				configurableApplicationContext.getBean(FishRepository.class);
		BirdRepository birdRepository =
				configurableApplicationContext.getBean(BirdRepository.class);

		Reptile kingCobra = new Reptile("Slither", "Snake", "Black & Yellow", "Carnivore");
		Reptile komodoDragon = new Reptile("Dennis", "Lizard", "Brown", "Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, komodoDragon));


		Fish goldFish = new Fish("Mike", "Auratus", "Orange", "Omnivore");
		Fish blueTang = new Fish("Berry", "Paracanthurus", "Blue", "Omnivore");
		fishRepository.saveAll(List.of(goldFish, blueTang));



		Bird baldEagle = new Bird("Daisy", "Haliaeetusleucocephalus", "White & Black", "Carnivores");
		Bird northernCardinal = new Bird("Tweet", "Cardinal", "Red", "Omnivore");
		birdRepository.saveAll(List.of(baldEagle, northernCardinal));


	}
}





