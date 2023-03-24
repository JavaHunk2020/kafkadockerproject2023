package com.pykube.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataEater {
	
		private String[] topicName= {"pykube02"};
		
		@Value("${group.name:thothit}")
		public  String groupName;

		@PostConstruct
		public void init() {
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			System.out.println("###############################################");
			System.out.println("###############################################");
			System.out.println("###############################################");
			System.out.println("-------"+topicName+"----------");
			System.out.println("-------"+groupName+"----------");
			System.out.println("###############################################");
			System.out.println("###############################################");
			System.out.println("###############################################");
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			
		}
		
		
		/**
		 * This will eat data from topic - pukube02
		 * @param message
		 */
		@KafkaListener(topics = {"pykube02"},groupId="group-1",containerFactory = "concurrentKafkaListenerContainer")
		public void consumer1(String message) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!###############################################");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!###############################################");
			System.out.println("Reading message from topic pukube02 = " + message);
		}

		/*@KafkaListener(topicPartitions = @TopicPartition(topic = "pukube02", partitionOffsets = {
				@PartitionOffset(partition = "0", initialOffset = "0", relativeToCurrent = "true") }), containerFactory = "concurrentKafkaListenerContainer", groupId = "thothit")
		public void consumer1(String message) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!###############################################");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!###############################################");
			System.out.println("Reading message from topic partition 0= " + message);
		}*/


}
