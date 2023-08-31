package getPacked;

import java.util.List;
import java.util.Scanner;

public class GetPacked {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println();
		System.out.println(
				"This program will help you pack for your trip, by ensuring you will not forget the most necessary items. ");
		System.out.println("\n************** REMINDER **************");
		System.out.println(
				"The purpose of the program is not to make sure that you pack everything that you want for the trip, but rather to ensure that you pack the most important items!");
		System.out.println(
				"\nThe program will take you through steps 1 to 3, and then you will be able to receive a summary of your final checklist or exit the program.");
		System.out.println("Here are the steps you will go through:");
		System.out.println();
		System.out.println("1. Basic Information");
		System.out.println("2. Packing checklist");
		System.out.println("3. Transport checklist");
		System.out.println("4. Final checklist");
		System.out.println("5. Exit program");
		System.out.println("\nPlease press 'Enter' to continue: ");

		scanner.nextLine();

		String name = "";
		String transport = "";
		String documents = "";
		String laptop = "";
		String glasses = "";
		String pet = "";
		String kids = "";
		String drlicence = "";

		System.out.println("What is your name");
		name = scanner.next();

		transport = getAnswer("How will you be travelling " + name + " ?",
				List.of("airplane", "ship", "train", "bus", "car", "motorcycle"));

		documents = getAnswer("Which document from the ones bellow do you need in order to travel to your destination?",
				List.of("id", "passport", "visa"));
		
		if(isValidResponse(List.of("airplane", "ship", "train", "bus"), transport)) {
			drlicence = getAnswer("Do you need a driving licence with you?",
					List.of("y", "n", "yes", "no"));
		}
		
		laptop = getAnswer("Will you be carrying a laptop with you?",
				List.of("y", "n", "yes", "no"));
		
		glasses = getAnswer("Do you wear glasses for vision?",
				List.of("y", "n", "yes", "no"));
		
		pet = getAnswer("Will you be travelling with a pet?",
				List.of("y", "n", "yes", "no"));
		
		kids = getAnswer("Will you be travelling with kids?",
				List.of("y", "n", "yes", "no"));

		System.out.println("\n***********************");
		System.out.println(
				"\nAmazing! We have all the necessary information needed in order to get you ready for your trip!");

		System.out.println(
				"\nNext step is to make sure that you packed the most important items. The program will be asking you if you packed those items one by one.");
		System.out.println(
				"\nIf you have packed the item type 'y' or 'yes'. If you still haven't packed the item or you are planning on packing it later type 'n' or 'no'.");
		System.out.println("\nPress 'Enter' to contrinue:");

		scanner.nextLine();
		scanner.nextLine();

		String documentsC = "";
		String insuranceC = "";
		String drlicenceC = "";
		String glassesC = "";
		String petC = "";
		String kidsC = "";
		String laptopC = "";
		String phoneC = "";
		String moneyC = "";
		String toothbrushC = "";
		
		if(isValidResponse(List.of("id"), documents)) {
			documentsC = getAnswer("Did you pack your ID? ",
					List.of("y", "n", "yes", "no"));
		}
		else if(isValidResponse(List.of("passport"), documents)) {
			documentsC = getAnswer("Did you pack your Passport?",
					List.of("y", "n", "yes", "no"));
		}
		else if(isValidResponse(List.of("visa"), documents)) {
			documentsC = getAnswer("Did you pack your passport AND your visa?",
					List.of("y", "n", "yes", "no"));
		}
		
		insuranceC = getAnswer("Did you pack your health insurance card?",
				List.of("y", "n", "yes", "no"));
		
		if(isValidResponse(List.of("y", "yes"), drlicence)) {
			drlicenceC = getAnswer("Did you pack your driving licence?",
					List.of("y", "n", "yes", "no"));
		}
		else if (isValidResponse(List.of("car", "motorcycle"), transport)) {
			drlicenceC = getAnswer("Did you pack your driving licence?",
					List.of("y", "n", "yes", "no"));
		}
		
		if(isValidResponse(List.of("y", "yes"), glasses)) {
			glassesC = getAnswer("Did you pack your glasses?",
					List.of("y", "n", "yes", "no"));
		}
		
		if(isValidResponse(List.of("y", "yes"), pet)) {
			petC = getAnswer("Did you pack your pet's documents?",
					List.of("y", "n", "yes", "no"));
		}
		
		if(isValidResponse(List.of("y", "yes"), kids) && isValidResponse(List.of("id"), documents)) {
			kidsC = getAnswer("Did you pack your kids' ID?",
					List.of("y", "n", "yes", "no"));
		}
		else if(isValidResponse(List.of("y", "yes"), kids) && isValidResponse(List.of("passport"), documents)) {
			kidsC = getAnswer("Did you pack your kids' passport?",
					List.of("y", "n", "yes", "no"));
		}
		else if(isValidResponse(List.of("y", "yes"), kids) && isValidResponse(List.of("visa"), documents)) {
			kidsC = getAnswer("Did you pack your kids' passport AND visa?",
					List.of("y", "n", "yes", "no"));
		}
		
		if(isValidResponse(List.of("y", "yes"), laptop)) {
			laptopC = getAnswer("Did you pack your laptop AND its charger? ",
					List.of("y", "n", "yes", "no"));
		}
		
		phoneC = getAnswer("Did you pack your phone charger?",
				List.of("y", "n", "yes", "no"));
		
		moneyC = getAnswer("Did you pack your bank cards/cash?",
				List.of("y", "n", "yes", "no"));
		
		toothbrushC = getAnswer("Did you pack your toothbrush?",
				List.of("y", "n", "yes", "no"));

		System.out.println("\n***** Amazing " + name + " ! *****");
		System.out.println("We checked if you have packed the most important items for your trip!");
		System.out.println("The next step is to make sure everything is ready for your transportation.");
		System.out.println("\nPress 'Enter' to contrinue:");

		scanner.nextLine();
		scanner.nextLine();

		String flighttime = "";
		String checkin = "";
		String boardingpass = "";
		String luggageweight = "";
		String shipdeptime = "";
		String shipticket = "";
		String traindeptime = "";
		String trainticket = "";
		String busdeptime = "";
		String busticket = "";
		String cartirepress = "";
		String windshield = "";
		String carlicense = "";
		String carinsurance = "";
		String cartuv = "";
		String carfirstaidkit = "";
		String caroil = "";
		String mototirepress = "";
		String motoroil = "";
		String motorlicense = "";
		String motorinsurance = "";
		String motortuv = "";
		String motorfirstaidkit = "";
		
		if(isValidResponse(List.of("airplane"), transport)) {
			flighttime = getAnswer("Did you check if your flight will take off on time or if there are any delays? ",
					List.of("y", "n", "yes", "no"));
			checkin = getAnswer("Did you do your online check-in?",
					List.of("y", "n", "yes", "no"));
			boardingpass = getAnswer("Did you pack your boarding pass or have it in electronic form?",
					List.of("y", "n", "yes", "no"));
			luggageweight = getAnswer("Did you check if your luggage weight/size is compatible?",
					List.of("y", "n", "yes", "no"));
		}
		
		else if(isValidResponse(List.of("ship"), transport)) {
			shipdeptime = getAnswer("Did you check if your departure will be on time or if there are any delays? ",
					List.of("y", "n", "yes", "no"));
			shipticket = getAnswer("Have you packed your boarding ticket or received your electronic ticket?",
					List.of("y", "n", "yes", "no"));

		} else if(isValidResponse(List.of("train"), transport)) {
			traindeptime = getAnswer("Did you check if your train departure will be on time or if there are any delays? ",
					List.of("y", "n", "yes", "no"));
			trainticket = getAnswer("Have you packed your train ticket or received your electronic ticket?",
					List.of("y", "n", "yes", "no"));
		
		} else if(isValidResponse(List.of("bus"), transport)) {
			busdeptime = getAnswer("Did you check if your bus departure will be on time or if there are any delays? ",
					List.of("y", "n", "yes", "no"));
			busticket = getAnswer("Have you packed your bus ticket or received your electronic ticket?",
					List.of("y", "n", "yes", "no"));
		
		} else if(isValidResponse(List.of("car"), transport)) {
			cartirepress = getAnswer("Did you check the car's tire pressure?",
					List.of("y", "n", "yes", "no"));
			windshield = getAnswer("Did you check the windshield washer fluid level?",
					List.of("y", "n", "yes", "no"));
			caroil = getAnswer("Did you check the car's motor oil level?",
					List.of("y", "n", "yes", "no"));
			carlicense = getAnswer("Did you check if you have the car's license?",
					List.of("y", "n", "yes", "no"));
			carinsurance = getAnswer("Did you check if you have your car's insurance AND a green card if needed?",
					List.of("y", "n", "yes", "no"));
			cartuv = getAnswer("Did you check if the car's technical inspection certificate is valid?",
					List.of("y", "n", "yes", "no"));
			carfirstaidkit = getAnswer("Did you check if you have a first aid kit in your car?",
					List.of("y", "n", "yes", "no"));
		
		}else if(isValidResponse(List.of("motorcycle"), transport)) {
			mototirepress = getAnswer("Did you check the motorcycle's tire pressure?",
					List.of("y", "n", "yes", "no"));
			motoroil = getAnswer("Did you check the motorcycle's motor oil level?",
					List.of("y", "n", "yes", "no"));
			motorlicense = getAnswer("Did you check if you have your motorcycle's license?",
					List.of("y", "n", "yes", "no"));
			motorinsurance = getAnswer("Did you check if you have your motorcycle's insurance AND a green card if needed?",
					List.of("y", "n", "yes", "no"));
			motortuv = getAnswer("Did you check if the motorcycle's technical inspection certificate is valid?",
					List.of("y", "n", "yes", "no"));
			motorfirstaidkit = getAnswer("Did you check if you have a first aid kit on your motorcycle?",
					List.of("y", "n", "yes", "no"));
		}

		String option = "";

		System.out.println("\n***** Amazing " + name + " ! *****");
		System.out.println("Your packing checklist as well as your transport checklist is completed.");
		System.out.println(
				"You can now either review a list with all the items you haven't packed, as well as with all the transport checks you haven't completed, or you can exit the program.");
		System.out.println("\nPress '1' to choose the first option or '2' to choose the second option:");
		System.out.println("\n1. Final checklist");
		System.out.println("2. Exit the program");

		option = scanner.next();

		while (!option.equals("1") && !option.equals("2")) {
			System.out.println("\\n*** The value you entered is not valid! ***\"");
			System.out.println(
					"Please press '1' to choose the first option or '2' to choose the second option and then press 'Enter':");
			System.out.println("\n1. Final checklist");
			System.out.println("2. Exit the program");
			option = scanner.next();
		}

		if (option.equals("1")) {
			System.out.println(
					"Here is the list of items you haven't packed or the actions you need to take for your transportation:");
			if (isValidResponse(List.of("n", "no"), documentsC)) {
				System.out.println("\n- " + documents);
			}
			if (isValidResponse(List.of("n", "no"), insuranceC)) {
				System.out.println("\n- Health insurance");
			}
			if (isValidResponse(List.of("n", "no"), drlicenceC)) {
				System.out.println("\n- Driving licence");
			}
			if (isValidResponse(List.of("n", "no"), glassesC)) {
				System.out.println("\n- Glasses");
			}
			if (isValidResponse(List.of("n", "no"), petC)) {
				System.out.println("\n- Pet's documents");
			}
			if (isValidResponse(List.of("n", "no"), kidsC)) {
				System.out.println("\n- Kids' documents");
			}
			if (isValidResponse(List.of("n", "no"), laptopC)){
				System.out.println("\n- Laptop AND laptop charger");
			}
			if (isValidResponse(List.of("n", "no"), phoneC)){
				System.out.println("\n- Mobile phone charger");
			}
			if (isValidResponse(List.of("n", "no"), moneyC)){
				System.out.println("\n- Bank cards or cash");
			}
			if (isValidResponse(List.of("n", "no"), toothbrushC)) {
				System.out.println("\n- Toothbrush");
			}
			if (isValidResponse(List.of("n", "no"), flighttime)) {
				System.out.println("\n- Don't forget to check if your flight departs on time.");
			}
			if (isValidResponse(List.of("n", "no"), checkin)){
				System.out.println("\n- Don't forget to do your online check-in ");
			}
			if (isValidResponse(List.of("n", "no"), boardingpass)) {
				System.out.println("\n- Don't forget to pack your boarding pass or to have it in electronic form");
			}
			if (isValidResponse(List.of("n", "no"), luggageweight)) {
				System.out.println("\n- Don't forget to check if your luggage weight/size is compatible");
			}
			if (isValidResponse(List.of("n", "no"), shipdeptime)) {
				System.out.println("\n- Don't forget to check if your ship departs on time.");
			}
			if (isValidResponse(List.of("n", "no"), shipticket)) {
				System.out.println("\n- Don't forget to pack your ship's boarding pass or to have it in electronic form.");
			}
			if (isValidResponse(List.of("n", "no"), traindeptime)) {
				System.out.println("\n- Don't forget to check if your train departs on time.");
			}
			if (isValidResponse(List.of("n", "no"), trainticket)) {
				System.out.println("\n- Don't forget to pack your train ticket or to have it in electronic form.");
			}
			if (isValidResponse(List.of("n", "no"), busdeptime)) {
				System.out.println("\n- Don't forget to check if your bus departs on time.");
			}
			if (isValidResponse(List.of("n", "no"), busticket)) {
				System.out.println("\n- Don't forget to pack your bus ticket or to have it in electronic form.");
			}
			if (isValidResponse(List.of("n", "no"), cartirepress)) {
				System.out.println("\n- Don't forget to check your car's tire pressure");
			}
			if (isValidResponse(List.of("n", "no"), windshield)) {
				System.out.println("\n- Don't forget to check your car's windshield wash fluid level");
			}
			if (isValidResponse(List.of("n", "no"), carlicense)) {
				System.out.println("\n- Don't forget to pack your car's license");
			}
			if (isValidResponse(List.of("n", "no"), carinsurance)) {
				System.out.println("\n- Don't forget to pack your car's insurance (AND green card if needed)");
			}
			if (isValidResponse(List.of("n", "no"), cartuv)) {
				System.out.println("\n- Don't forget to check your car's technical inspection validity");
			}
			if (isValidResponse(List.of("n", "no"), carfirstaidkit)) {
				System.out.println("\n- Don't forget to pack a first aid kit in your car.");
			}
			if (isValidResponse(List.of("n", "no"), caroil)) {
				System.out.println("\n- Don't forget to check your car's oil level");
			}
			if (isValidResponse(List.of("n", "no"), mototirepress)) {
				System.out.println("\n- Don't forget to check your motorcycle's tire pressure");
			}
			if (isValidResponse(List.of("n", "no"), motoroil)) {
				System.out.println("\n- Don't forget to check your motorcycle's oil level");
			}
			if (isValidResponse(List.of("n", "no"), motorlicense)) {
				System.out.println("\n- Don't forget to pack your motorcycle's license");
			}
			if (isValidResponse(List.of("n", "no"), motorinsurance)) {
				System.out.println("\n- Don't forget to pack your motorcycle's insurance (AND green card if needed");
			}
			if (isValidResponse(List.of("n", "no"), motortuv)) {
				System.out.println("\n- Don't forget to check your motorcycle's technical inspection validity");
			}
			if (isValidResponse(List.of("n", "no"), motorfirstaidkit)) {
				System.out.println("\n- Don't forget to pack a first aid kit on your motorcycle.");
			}
			System.out.println("\nDo you wish to exit the program?");
			System.out.println("If you do, press 'y' ");
			option = scanner.next();
			
			while (!isValidResponse(List.of("y", "yes"), option)) {
				System.out.println("\\n*** The value you entered is not valid! ***\"");
				System.out.println("Please press 'y' to exit the program and then press 'Enter':");
				option = scanner.next();
			}
			System.out.println("***** Have a safe and pleasant trip " + name + " ! *****");
			
		} else if (option.equals("2")) {
			System.out.println("***** Have a safe and pleasant trip " + name + " ! *****");
		} 

	}

	private static String getAnswer(String question, List<String> validResponses) {
		System.out.println(question + " " + validResponses.toString());
		String answer = scanner.next();
		while (!isValidResponse(validResponses, answer)) {
			System.out.println("\n*** The value you entered is not valid! ***");
			System.out.println(question + " " + validResponses.toString());
			answer = scanner.next();
		}
		return answer.toLowerCase();
	}

	// if(isValidResponse(List.of("y", "n", "yes", "no"), documentsC)) {
	private static boolean isValidResponse(List<String> validResponses, String response) {
		return validResponses.contains(response.toLowerCase());
	}

}
