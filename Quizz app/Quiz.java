        import java.util.Scanner;

        public class Quiz {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String[] topics = {"South African History", "Geography", "Culture", "Sports"};
                int score = 0;
                int totalQuestions = 0;

                // Display main menu
                System.out.println("Welcome to the South African Quiz!");
                System.out.println("Please select a topic:");

                for (int i = 0; i < topics.length; i++) {
                    System.out.println((i+1) + ". " + topics[i]);
                }

                int topicIndex = scanner.nextInt() - 1;
                Topic topic = new Topic(topicIndex);

                // Ask questions
                for (Question question : topic.questions) {
                    System.out.println(question.text);

                    for (int i = 0; i < question.choices.length; i++) {
                        System.out.println((i+1) + ". " + question.choices[i]);
                    }

                    int answer = scanner.nextInt();
                    totalQuestions++;

                    if (answer == question.correctAnswer) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Incorrect. The correct answer is: " + question.choices[question.correctAnswer]);
                    }
                }

                // Display score
                System.out.println("You scored " + score + " out of " + totalQuestions);
            }
        }

        class Topic {
            Question[] questions;

            public Topic(int index) {
                switch (index) {
                    case 0:
                        // South African History
                        questions = new Question[] {
                            new Question("Who was the first black president of South Africa?", new String[]{"Nelson Mandela", "Thabo Mbeki", "Jacob Zuma", "Cyril Ramaphosa"}, 0),
                            new Question("In what year was the Sharpeville massacre?", new String[]{"1960", "1976", "1994", "2002"}, 0),
                            new Question("Who led the Great Trek?", new String[]{"Piet Retief", "Jan van Riebeeck", "Shaka Zulu", "Nelson Mandela"}, 0),
                        };
                        break;
                    case 1:
                        // Geography
                        questions = new Question[] {
                            new Question("What is the capital of South Africa?", new String[]{"Cape Town", "Johannesburg", "Pretoria", "Durban"}, 2),
                            new Question("What is the highest mountain in South Africa?", new String[]{"Table Mountain", "Drakensberg", "Kilimanjaro", "Kalahari"}, 1),
                            new Question("What is the longest river in South Africa?", new String[]{"Limpopo River", "Orange River", "Zambezi River", "Nile River"}, 1),
                            };
                            break;
                    case 2:
                            // Culture
                            questions = new Question[] {
                                new Question("What is the traditional Zulu dance called?", new String[]{"Gumboot Dance", "Pantsula Dance", "Indlamu Dance", "Sbujwa Dance"}, 2),
                                new Question("What is the national flower of South Africa?", new String[]{"Protea", "Daisy", "Rose", "Lily"}, 0),
                                new Question("What is the South African traditional meat dish called?", new String[]{"Braai", "Boerewors", "Potjiekos", "Bunny Chow"}, 1),
                            };
                            break;
                    case 3:
                            // Sports
                            questions = new Question[] {
                                new Question("What is the national sport of South Africa?", new String[]{"Cricket", "Football", "Rugby", "Tennis"}, 2),
                                new Question("What is the nickname of the South African rugby team?", new String[]{"The Springboks", "The Proteas", "The Bafana Bafana", "The Amajita"}, 0),
                                new Question("What is the name of South Africa's most famous sprinter?", new String[]{"Wayde van Niekerk", "Caster Semenya", "Chad le Clos", "Oscar Pistorius"}, 0),
                            };
                            break;
                            default:
                            System.out.println("Invalid topic selected.");
                            questions = new Question[0];
                            break;
                            }
                            }
                            }

         class Question {
                        String text;
                        String[] choices;
                        int correctAnswer;

    public Question(String text, String[] choices, int correctAnswer) {
                            this.text = text;
                            this.choices = choices;
                            this.correctAnswer = correctAnswer;
                            }
                }
