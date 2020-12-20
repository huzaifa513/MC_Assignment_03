package com.example.drawerassignment;

public class MockData {

    Question [] questions;

    MockData(){
        questions = new Question[13];

        for(int i = 0; i < 13; i++){
            questions[i] = new Question("1", "1", "1", "1", "1", "1");
        }
    }
    public void LoadQuestions(){

        String [] qtns = {
                "1. Mouse is a / an:",
                "2. C# is a:",
                "3. OOP stands for:",
                "4. SQLite is:",
                "5. Latest version of Windows:",
                "6. Speakers are:",
                "7. RAM is:",
                "8. RAM is:",
                "9. HDD stands for:",
                "10. Which of the following is true?",
                "11. Is SDD:",
                "12. Flutter is:",
                "13. HTML is:"
        };


        for(int i = 0; i < 13; i++){
            questions[i].setQuestion(qtns[i]);
        }

        questions[0].setFirstOption("Input Device");
        questions[0].setSecondOption("Output Device");
        questions[0].setThirdOption("Both");
        questions[0].setFourthOption("None");
        questions[0].setCorrectOption("1");

        questions[1].setFirstOption("Operating System");
        questions[1].setSecondOption("Programming Language");
        questions[1].setThirdOption("Data Structure");
        questions[1].setFourthOption("Database");
        questions[1].setCorrectOption("2");

        questions[2].setFirstOption("Object Oriented Programming");
        questions[2].setSecondOption("Object Oriented Parameters");
        questions[2].setThirdOption("Out Of Permissions");
        questions[2].setFourthOption("None");
        questions[2].setCorrectOption("1");

        questions[3].setFirstOption("Operating System");
        questions[3].setSecondOption("SDK");
        questions[3].setThirdOption("Data Structure");
        questions[3].setFourthOption("Database");
        questions[3].setCorrectOption("4");

        questions[4].setFirstOption("WindowsXP");
        questions[4].setSecondOption("Windows7");
        questions[4].setThirdOption("Windows10");
        questions[4].setFourthOption("Windows12");
        questions[4].setCorrectOption("3");

        questions[5].setFirstOption("Output Device");
        questions[5].setSecondOption("Input Device");
        questions[5].setThirdOption("Both");
        questions[5].setFourthOption("None");
        questions[5].setCorrectOption("1");

        questions[6].setFirstOption("Read Access Memory");
        questions[6].setSecondOption("Random Access Memory");
        questions[6].setThirdOption("Right Accessbile Memory");
        questions[6].setFourthOption("Runtime Address Monitization");
        questions[6].setCorrectOption("2");

        questions[7].setFirstOption("Temporary Memory");
        questions[7].setSecondOption("Primary Memory");
        questions[7].setThirdOption("Secondary Memory");
        questions[7].setFourthOption("Both a & b");
        questions[7].setCorrectOption("4");

        questions[8].setFirstOption("Hard Disk Drive");
        questions[8].setSecondOption("High Dedicated Drive");
        questions[8].setThirdOption("Hard Disk Distortion");
        questions[8].setFourthOption("None");
        questions[8].setCorrectOption("1");

        questions[9].setFirstOption("");
        questions[9].setSecondOption("");
        questions[9].setThirdOption("");
        questions[9].setFourthOption("");
        questions[9].setCorrectOption("2");

        questions[10].setFirstOption("SSD is slower than HDD");
        questions[10].setSecondOption("SSD is faster than HDD");
        questions[10].setThirdOption("They have same speed");
        questions[10].setFourthOption("Cannot compare");
        questions[10].setCorrectOption("1");

        questions[11].setFirstOption("Faster than HDD");
        questions[11].setSecondOption("Slower than HDD");
        questions[11].setThirdOption("Same speed");
        questions[11].setFourthOption("None");
        questions[11].setCorrectOption("1");

        questions[12].setFirstOption("Programming Language");
        questions[12].setSecondOption("Only for Android");
        questions[12].setThirdOption("Only for IOS");
        questions[12].setFourthOption("For Windows");
        questions[12].setCorrectOption("2");


        for (int i = 0; i < 13; i++){
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getFirstOption());
            System.out.println(questions[i].getSecondOption());
            System.out.println(questions[i].getThirdOption());
            System.out.println(questions[i].getFourthOption());
            System.out.println(questions[i].getCorrectOption());

        }

        for (int k = 0; k < 13; k++){
            questions[k] = new Question (questions[k].getQuestion(), questions[k].getFirstOption(), questions[k].getSecondOption(), questions[k].getThirdOption(), questions[k].getFourthOption(), questions[k].getCorrectOption());
        }


    }
}
