package com.company;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        title();
        menue();

        boolean run = true;
        while (run) {

            System.out.print(">>>");
            String command = scanner.nextLine().replaceAll("\\s","");

            //to catch empty Enter
            if(command.equals("")){
                boolean nothing = true;
                while(nothing){
                    if(command.equals("")) {
                        System.out.print(">>>");
                        command = scanner.nextLine().replaceAll("\\s", "");
                        continue;
                    }else{
                        nothing = false;
                    }
                }
            }

            String yes_no_ask = "Do you want to continue ? y or n";

            if(command.equals("1")) {
                ascii("negation");

                System.out.println("you have to use verb like: is/are/was/were/have/has/had/will/want/etc...");
                while(true) {
                    System.out.print("Please Enter Your Sentence: ");
                    String negation_sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
                    System.out.println("Answer: " + negation(negation_sentence));
                    System.out.println();

                    System.out.println(yes_no_ask);
                    String yes_no = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if(yes_no.equals("no") || yes_no.equals("n")){
                        break;
                    }
                }
                menue();
                clear(13);

            }else if(command.equals("2")) {
                ascii("conjunction");

                System.out.println("NOTE: you have to use ( and ).");
                while(true) {
                    System.out.print("Please Enter Your Sentence: ");
                    String conjunction_sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
                    conjunction(conjunction_sentence);
                    System.out.println();

                    System.out.println(yes_no_ask);
                    String yes_no = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if(yes_no.equals("no") || yes_no.equals("n")){
                        break;
                    }
                }
                menue();
                clear(13);

            }else if(command.equals("3")) {
                ascii("Disjunction");

                System.out.println("NOTE: you have to use ( or ).");
                while(true) {
                    System.out.print("Please Enter Your Sentence: ");
                    String Disjunction_sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
                    Disjunction(Disjunction_sentence);
                    System.out.println();

                    System.out.println(yes_no_ask);
                    String yes_no = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if(yes_no.equals("no") || yes_no.equals("n")){
                        break;
                    }
                }
                menue();
                clear(13);

            }else if(command.equals("4")) {
                ascii("implication");

                System.out.println("Please Enter Your Sentence Bellow: ");

                while (true) {
                    System.out.print("If p denotes: ");
                    String implication_sentence_p = scanner.nextLine().toLowerCase(Locale.ROOT);
                    System.out.print("and q denotes: ");
                    String implication_sentence_q = scanner.nextLine().toLowerCase(Locale.ROOT);
                    System.out.println();

                    implication(implication_sentence_p, implication_sentence_q);
                    System.out.println();

                    System.out.println(yes_no_ask);
                    String yes_no = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if(yes_no.equals("no") || yes_no.equals("n")){
                        break;
                    }

                }
                menue();
                clear(15);

            }else if(command.equals("5")){
                ascii("converse");
                System.out.println("NOTE, Your sentence must be include -> is/are/was/were/have/has/had/will");
                System.out.println("separate sentence by comma ( , )");

                while (true) {
                    System.out.print("Please Enter Your Sentence: ");
                    String converse_sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
                    converse(converse_sentence);
                    System.out.println();

                    System.out.println(yes_no_ask);
                    String yes_no = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if(yes_no.equals("no") || yes_no.equals("n")){
                        break;
                    }
                }
                menue();
                clear(13);

            }else if(command.equals("6")){
                ascii("contrapositive");
                System.out.println("NOTE, Your sentence must be include -> is/are/was/were/have/has/had/will");
                System.out.println("separate sentence by comma ( , )");

                while (true) {
                    System.out.print("Please Enter Your Sentence: ");
                    String contrapositive_sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
                    contrapositive(contrapositive_sentence);
                    System.out.println();

                    System.out.println(yes_no_ask);
                    String yes_no = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if(yes_no.equals("no") || yes_no.equals("n")){
                        break;
                    }
                }
                menue();
                clear(13);

            }else if(command.equals("7")){
                ascii("inverse");
                System.out.println("NOTE, Your sentence must be include -> is/are/was/were/have/has/had/will");
                System.out.println("separate sentence by comma ( , )");

                while(true) {
                    System.out.print("Please Enter Your Sentence: ");
                    String inverse_sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
                    inverse(inverse_sentence);
                    System.out.println();

                    System.out.println(yes_no_ask);
                    String yes_no = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if(yes_no.equals("no") || yes_no.equals("n")){
                        break;
                    }
                }
                menue();
                clear(13);

            }else if(command.equals("8")){

                ascii("Biconditional");
                    System.out.println("Please Enter Your Sentence Bellow: ");
                while(true) {
                    System.out.print("If p denotes: ");
                    String p = scanner.nextLine().toLowerCase(Locale.ROOT);
                    System.out.print("and q denotes: ");
                    String q = scanner.nextLine().toLowerCase(Locale.ROOT);
                    Biconditional(p, q);
                    System.out.println();

                    System.out.println(yes_no_ask);
                    String yes_no = scanner.nextLine().toLowerCase(Locale.ROOT);

                    if(yes_no.equals("no") || yes_no.equals("n")){
                        break;
                    }
                }
                menue();
                clear(13);

            } else if(command.equals("0")){
                break;
            }else if(command.equals("clear")){
                clear(30);
            }else if(command.equals("help")){
                menue();
                clear(14);
            }else if(command.equals("title")){
                title();
                clear(18);
            } else{
                System.out.println("WRONG OPTION!!! TRY AGAIN");
            }

        }


    }

    public static Boolean Flage = false;

    public static String negation(String insert_negation) {

        List<String> negation_arraylist = new ArrayList<>(Arrays.asList(insert_negation.split(" ")));

        boolean c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
        boolean c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
        boolean c21, c22, c23, c24 , c25, c26;


        c1 = negation_arraylist.contains("isn't");
        c2 = negation_arraylist.contains("aren't");
        c3 = negation_arraylist.contains("haven't");
        c4 = negation_arraylist.contains("hasn't");
        c5 = negation_arraylist.contains("hadn't");
        c6 = negation_arraylist.contains("wasn't");
        c7 = negation_arraylist.contains("weren't");
        c8 = negation_arraylist.contains("won't");
        c9 = negation_arraylist.contains("amn't");
        c10 = negation_arraylist.contains("can't");

        c11 = negation_arraylist.contains("isnt");
        c12 = negation_arraylist.contains("arent");
        c13 = negation_arraylist.contains("havent");
        c14 = negation_arraylist.contains("hasnt");
        c15 = negation_arraylist.contains("hadnt");
        c16 = negation_arraylist.contains("wasnt");
        c17 = negation_arraylist.contains("werent");
        c18 = negation_arraylist.contains("wont");
        c19 = negation_arraylist.contains("amnt");
        c20 = negation_arraylist.contains("cant");

        c21 = negation_arraylist.contains("don't");
        c22 = negation_arraylist.contains("doesn't");
        c23 = negation_arraylist.contains("didn't");
        c24 = negation_arraylist.contains("dont");
        c25 = negation_arraylist.contains("doesnt");
        c26 = negation_arraylist.contains("didnt");




        int in1 = negation_arraylist.indexOf("isn't");
        int in2 = negation_arraylist.indexOf("aren't");
        int in3 = negation_arraylist.indexOf("haven't");
        int in4 = negation_arraylist.indexOf("hasn't");
        int in5 = negation_arraylist.indexOf("hadn't");
        int in6 = negation_arraylist.indexOf("wasn't");
        int in7 = negation_arraylist.indexOf("weren't");
        int in8 = negation_arraylist.indexOf("won't");
        int in9 = negation_arraylist.indexOf("amn't");
        int in10 = negation_arraylist.indexOf("can't");

        int in11 = negation_arraylist.indexOf("isnt");
        int in12 = negation_arraylist.indexOf("arent");
        int in13 = negation_arraylist.indexOf("havent");
        int in14 = negation_arraylist.indexOf("hasnt");
        int in15 = negation_arraylist.indexOf("hadnt");
        int in16 = negation_arraylist.indexOf("wasnt");
        int in17 = negation_arraylist.indexOf("werent");
        int in18 = negation_arraylist.indexOf("wont");
        int in19 = negation_arraylist.indexOf("amnt");
        int in20 = negation_arraylist.indexOf("cant");

        int in21 = negation_arraylist.indexOf("don't");
        int in22 = negation_arraylist.indexOf("doesn't");
        int in23 = negation_arraylist.indexOf("didn't");
        int in24 = negation_arraylist.indexOf("dont");
        int in25 = negation_arraylist.indexOf("doesnt");
        int in26 = negation_arraylist.indexOf("didnt");




        if (negation_arraylist.contains("not") ) {
            negation_arraylist.remove("not");

        }else if(c1||c2||c3||c4||c5||c6||c7||c8||c9||c10||c11||c12||c13||c14||c15||c16||c17||c18||c19||c20||c21||c22|c23||c24||c25||c26){

            if(c1){
                negation_arraylist.set(in1,"is");

            }else if(c2){
                negation_arraylist.set(in2,"are");

            }else if(c3){
                negation_arraylist.set(in3,"have");

            }else if(c4){
                negation_arraylist.set(in4,"has");

            }else if(c5){
                negation_arraylist.set(in5,"had");

            }else if(c6){
                negation_arraylist.set(in6,"was");

            }else if(c7){
                negation_arraylist.set(in7,"were");

            }else if(c8){
                negation_arraylist.set(in8,"will");

            }else if(c9){
                negation_arraylist.set(in9,"am");

            }else if(c10){
                negation_arraylist.set(in10,"can");

            }else if(c11){
                negation_arraylist.set(in11,"is");

            }else if(c12){
                negation_arraylist.set(in12,"are");

            }else if(c13){
                negation_arraylist.set(in13,"have");

            }else if(c14){
                negation_arraylist.set(in14,"has");

            }else if(c15){
                negation_arraylist.set(in15,"had");

            }else if(c16){
                negation_arraylist.set(in16,"was");

            }else if(c17){
                negation_arraylist.set(in17,"were");

            }else if(c18){
                negation_arraylist.set(in18,"will");

            }else if(c19){
                negation_arraylist.set(in19,"am");

            }else if(c20){
                negation_arraylist.set(in20,"can");

            }else if(c21){
                negation_arraylist.set(in21,"do");

            }else if(c22){
                negation_arraylist.set(in22,"does");

            }else if(c23){
                negation_arraylist.set(in23,"did");

            }else if(c24){
                negation_arraylist.set(in24,"do");

            }else if(c25){
                negation_arraylist.set(in25,"does");

            }else if(c26){
                negation_arraylist.set(in26,"did");

            }




        } else {
            boolean condintion1, condintion2, condintion3, condintion4, condintion5, condintion6, condintion7, condintion8, condintion9;
            boolean  condintion10, condintion11, condintion12, condintion13 ;
            condintion1 = negation_arraylist.contains("is");
            condintion2 = negation_arraylist.contains("are");
            condintion3 = negation_arraylist.contains("have");
            condintion4 = negation_arraylist.contains("has");
            condintion5 = negation_arraylist.contains("had");
            condintion6 = negation_arraylist.contains("was");
            condintion7 = negation_arraylist.contains("were");
            condintion8 = negation_arraylist.contains("will");
            condintion9 = negation_arraylist.contains("am");
            condintion10 = negation_arraylist.contains("can");
            condintion11 = negation_arraylist.contains("do");
            condintion12 = negation_arraylist.contains("did");
            condintion13 = negation_arraylist.contains("want");


            int index1 = negation_arraylist.indexOf("is");
            int index2 = negation_arraylist.indexOf("are");
            int index3 = negation_arraylist.indexOf("have");
            int index4 = negation_arraylist.indexOf("has");
            int index5 = negation_arraylist.indexOf("had");
            int index6 = negation_arraylist.indexOf("was");
            int index7 = negation_arraylist.indexOf("were");
            int index8 = negation_arraylist.indexOf("will");
            int index9 = negation_arraylist.indexOf("am");
            int index10 = negation_arraylist.indexOf("can");
            int index11 = negation_arraylist.indexOf("do");
            int index12 = negation_arraylist.indexOf("did");
            int index13 = negation_arraylist.indexOf("want");


            if (condintion1) {
                negation_arraylist.add(index1 + 1, "not");
            } else if (condintion2) {
                negation_arraylist.add(index2 + 1, "not");
            } else if (condintion3) {
                negation_arraylist.add(index3 , "don't");
            } else if (condintion4) {
                negation_arraylist.add(index4 , "doesn't");
            } else if (condintion5) {
                negation_arraylist.add(index5 , "didn't");
            } else if (condintion6) {
                negation_arraylist.add(index6 + 1, "not");
            } else if (condintion7) {
                negation_arraylist.add(index7 + 1, "not");
            } else if (condintion8) {
                negation_arraylist.add(index8 + 1, "not");
            } else if (condintion9) {
                negation_arraylist.add(index9 + 1, "not");
            }  else if (condintion10) {
                negation_arraylist.add(index10 + 1, "not");
            }else if(condintion11){
                negation_arraylist.add(index11 + 1, "not");
            }else if(condintion12){
                negation_arraylist.add(index12 + 1, "not");
            }else if(condintion13){
                negation_arraylist.add(index13 , "don't");
            }else {
                Flage = true;
            }

        }

        return String.join(" ", negation_arraylist);

    }

    public static void conjunction(String conjunction) {

        for(int x=1; x<=1; x++){

        String conjunction_strip = conjunction.replaceAll("\\s+", " ");
        if(conjunction_strip.contains("and")){
        }else{
            System.out.println("pleas use (and) !!!");
            return;
        }

        List<String> conjunction_arraylist = new ArrayList<>(Arrays.asList(conjunction_strip.split("and")));

        List<String> conjunction_arraylist1 = new ArrayList<>(Arrays.asList(conjunction_arraylist.get(0).split(" ")));
        List<String> conjunction_arraylist2 = new ArrayList<>(Arrays.asList(conjunction_arraylist.get(1).split(" ")));

        String line1 = String.join(" ", conjunction_arraylist1).strip();
        String line2 = String.join(" ", conjunction_arraylist2).strip();

        boolean bool1 = negation_not(line1);
        boolean bool2 = negation_not(line2);



        if (bool1 && bool2 ) {
            System.out.println("Answer is (False) because:");
            System.out.println(line1 + " = False");
            System.out.println(line2 + " = False");

        } else if (bool1) {
            System.out.println("Answer is (False) because:");
            System.out.println(line1 + " = False");
            System.out.println(line2 + " = True");

        } else if (bool2) {
            System.out.println("Answer is (False) because:");
            System.out.println(line1 + " = True");
            System.out.println(line2 + " = False");
        } else {
            System.out.println("Answer is (True) because:");
            System.out.println(line1 + " = True");
            System.out.println(line2 + " = True");
        }


        }
    }

    public static void Disjunction(String Disjunction) {
        String conjunction_strip = Disjunction.replaceAll("\\s+", " ");
        for(int x=1; x<=1; x++) {
            if(conjunction_strip.contains("or")){
            }else{
                System.out.println("please use (or) !!!");

                return;
            }

            List<String> Disjunction_arraylist = new ArrayList<>(Arrays.asList(conjunction_strip.split("or")));
            List<String> Disjunction_arraylist1 = new ArrayList<>(Arrays.asList(Disjunction_arraylist.get(0).split(" ")));
            List<String> Disjunction_arraylist2 = new ArrayList<>(Arrays.asList(Disjunction_arraylist.get(1).split(" ")));

            String line1 = String.join(" ", Disjunction_arraylist1).strip();
            String line2 = String.join(" ", Disjunction_arraylist2).strip();

            boolean bool1 = negation_not(line1);
            boolean bool2 = negation_not(line2);


            if (bool1 && bool2) {
                System.out.println("Answer is (False) because:");
                System.out.println(line1 + " = False");
                System.out.println(line2 + " = False");

            } else if (bool1) {
                System.out.println("Answer is (True) because:");
                System.out.println(line1 + " = False");
                System.out.println(line2 + " = True");

            } else if (bool2) {
                System.out.println("Answer is (True) because:");
                System.out.println(line1 + " = True");
                System.out.println(line2 + " = False");
            } else {
                System.out.println("Answer is (True) because:");
                System.out.println(line1 + " = True");
                System.out.println(line2 + " = True");
            }
        }

    }

    public static void implication(String p, String q) {


        String q_line = q.replaceAll("\\s+", " ").strip();
        String p_line = p.replaceAll("\\s+", " ").strip();;
        boolean bool1_p = negation_not(p_line);
        boolean bool2_q = negation_not(q_line);

        if (bool1_p && bool2_q) {
            System.out.println("Answer is TRUE: " + "if " + p_line + " then " + q_line);
            System.out.println("Truth Table:");
            System.out.println("|   p   |   q   |" + " p --> q |");
            System.out.println("|-------|-------|" + "---------|");
            System.out.println("| False | False |" + "  True   |");

        } else if (bool1_p) {
            System.out.println("Answer is TRUE: " + "if " + p_line + " then " + q_line);
            System.out.println("Truth Table:");
            System.out.println("|   p   |   q   |" + " p --> q |");
            System.out.println("|-------|-------|" + "---------|");
            System.out.println("| False |  True |" + "  True   |");

        } else if (bool2_q) {
            System.out.println("Answer is FALSE: " + "if " + p_line + " then " + q_line);
            System.out.println("Truth Table:");
            System.out.println("|   p   |   q   |" + " p --> q |");
            System.out.println("|-------|-------|" + "---------|");
            System.out.println("| True  | False |" + "  False  |");

        } else {
            System.out.println("Answer is TRUE: " + "if " + p_line + " then " + q_line);
            System.out.println("Truth Table:");
            System.out.println("|   p   |   q   |" + " p --> q |");
            System.out.println("|-------|-------|" + "---------|");
            System.out.println("| True  | True  |" + "  True   |");

        }
    }

    public static void converse(String coverse){


        for(int x=1; x<=1; x++){
            if(!comma(coverse)){
                return;
            }
        }
            List<String> coverse_arraylist = new ArrayList<>(Arrays.asList(coverse.split(",")));

            String converse_p = String.join(" ", coverse_arraylist.get(0)).replaceAll("\\s+", " ").strip();
            String coverese_q = String.join(" ", coverse_arraylist.get(1)).replaceAll("\\s+", " ").strip();

            System.out.println("if " + coverese_q + ", then " + converse_p);


    }

    public static void contrapositive(String contrapositive_text){

        for(int x=1; x<=1; x++){
            if(!comma(contrapositive_text)){
                return;
            }
        }
             List<String> contrapositive_arraylist = new ArrayList<>(Arrays.asList(contrapositive_text.split(",")));

            String contrapositive_p = String.join(" ", contrapositive_arraylist.get(0)).replaceAll("\\s+", " ").strip();
            String contrapositive_q = String.join(" ", contrapositive_arraylist.get(1)).replaceAll("\\s+", " ").strip();

            String contrapositive_p_negation = negation(contrapositive_p);
            String contrapositive_q_negation = negation(contrapositive_q);

//            if (!Flage) {
                System.out.println("if " + contrapositive_q_negation + ", then " + contrapositive_p_negation);
//            } else {
//                System.out.println("Sorry, Your sentence is wrong!! must be include -> is/are/was/were/have/has/had/will");
//            }
        }

    public static void inverse(String inverse_text ){

        for(int x=1; x<=1; x++){
            if(!comma(inverse_text)){
                return;
            }
        }

        List<String> inverse_arraylist = new ArrayList<>(Arrays.asList(inverse_text.split(",")));

        String inverse_p = String.join(" ", inverse_arraylist.get(0)).replaceAll("\\s+", " ").strip();
        String inverse_q = String.join(" ", inverse_arraylist.get(1)).replaceAll("\\s+", " ").strip();

        String inverse_p_negation = negation(inverse_p);
        String inverse_q_negation = negation(inverse_q);

//        if(!Flage){
            System.out.println("if "+ inverse_p_negation + ", then " + inverse_q_negation);
//        }else{
//            System.out.println("Sorry, Your sentence is wrong!! must be include -> is/are/was/were/have/has/had/will");
//        }

    }

    public static void Biconditional(String p_line, String q_line){

        boolean bool_p = negation_not(p_line);
        boolean bool_q = negation_not(q_line);

        p_line.replaceAll("\\s", " ");
        q_line.replaceAll("\\s", " ");

        if(bool_p && bool_q){
            System.out.println("Answer is TRUE: " + p_line + " if and only if " + q_line);
            System.out.println("Truth Table:");
            System.out.println("|   p   |   q   |" + " p --> q |");
            System.out.println("|-------|-------|" + "---------|");
            System.out.println("| False | False |" + "  True   |");
        }else if(bool_p){
            System.out.println("Answer is FALSE: " + p_line + " if and only if " + q_line);
            System.out.println("Truth Table:");
            System.out.println("|   p   |   q   |" + " p --> q |");
            System.out.println("|-------|-------|" + "---------|");
            System.out.println("| False |  True |" + "  True   |");
        }else if(bool_q){
            System.out.println("Answer is FALSE: " + p_line + " if and only if " + q_line);
            System.out.println("Truth Table:");
            System.out.println("|   p   |   q   |" + " p --> q |");
            System.out.println("|-------|-------|" + "---------|");
            System.out.println("| True  | False |" + "  False  |");
        }else{
            System.out.println("Answer is TRUE: " + p_line + " if and only if " + q_line);
            System.out.println("Truth Table:");
            System.out.println("|   p   |   q   |" + " p --> q |");
            System.out.println("|-------|-------|" + "---------|");
            System.out.println("| True  | True  |" + "  True   |");
        }

    }

    public static boolean negation_not(String bool){
        boolean c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
        boolean c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
        boolean c21, c22, c23, c24 , c25, c26;


        c1 = bool.contains("isn't");
        c2 = bool.contains("aren't");
        c3 = bool.contains("haven't");
        c4 = bool.contains("hasn't");
        c5 = bool.contains("hadn't");
        c6 = bool.contains("wasn't");
        c7 = bool.contains("weren't");
        c8 = bool.contains("won't");
        c9 = bool.contains("amn't");
        c10 = bool.contains("can't");

        c11 = bool.contains("isnt");
        c12 = bool.contains("arent");
        c13 = bool.contains("havent");
        c14 = bool.contains("hasnt");
        c15 = bool.contains("hadnt");
        c16 = bool.contains("wasnt");
        c17 = bool.contains("werent");
        c18 = bool.contains("wont");
        c19 = bool.contains("amnt");
        c20 = bool.contains("cant");

        c21 = bool.contains("don't");
        c22 = bool.contains("doesn't");
        c23 = bool.contains("didn't");
        c24 = bool.contains("dont");
        c25 = bool.contains("doesnt");
        c26 = bool.contains("didnt");

        if (bool.contains("not") ) {
            return true;

        }else if(c1||c2||c3||c4||c5||c6||c7||c8||c9||c10||c11||c12||c13||c14||c15||c16||c17||c18||c19||c20||c21||c22|c23||c24||c25||c26){
            return true;
        }else{
            return false;
        }

    }

    public static  void clear(int line){
        for(int x=0; x<line; x++){
            System.out.println(">>>");
        }
    }

    public static void title(){
        Random random = new Random();

        ArrayList<String> random_title = new ArrayList<String>();


        String a ="██████╗ ██╗███████╗ ██████╗██████╗ ███████╗████████╗███████╗    ███╗   ███╗ █████╗ ████████╗██╗  ██╗███████╗███╗   ███╗ █████╗ ████████╗██╗ ██████╗███████╗    \n" +
                "██╔══██╗██║██╔════╝██╔════╝██╔══██╗██╔════╝╚══██╔══╝██╔════╝    ████╗ ████║██╔══██╗╚══██╔══╝██║  ██║██╔════╝████╗ ████║██╔══██╗╚══██╔══╝██║██╔════╝██╔════╝    \n" +
                "██║  ██║██║███████╗██║     ██████╔╝█████╗     ██║   █████╗      ██╔████╔██║███████║   ██║   ███████║█████╗  ██╔████╔██║███████║   ██║   ██║██║     ███████╗    \n" +
                "██║  ██║██║╚════██║██║     ██╔══██╗██╔══╝     ██║   ██╔══╝      ██║╚██╔╝██║██╔══██║   ██║   ██╔══██║██╔══╝  ██║╚██╔╝██║██╔══██║   ██║   ██║██║     ╚════██║    \n" +
                "██████╔╝██║███████║╚██████╗██║  ██║███████╗   ██║   ███████╗    ██║ ╚═╝ ██║██║  ██║   ██║   ██║  ██║███████╗██║ ╚═╝ ██║██║  ██║   ██║   ██║╚██████╗███████║    \n" +
                "╚═════╝ ╚═╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝   ╚══════╝    ╚═╝     ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝ ╚═════╝╚══════╝    \n";

        String b = " ▄▄▄▄▄▄  ▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄   ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄    ▄▄   ▄▄ ▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄   ▄▄ ▄▄▄▄▄▄▄ ▄▄   ▄▄ ▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄    \n" +
                "█      ██   █       █       █   ▄  █ █       █       █       █  █  █▄█  █      █       █  █ █  █       █  █▄█  █      █       █   █       █       █   \n" +
                "█  ▄    █   █  ▄▄▄▄▄█       █  █ █ █ █    ▄▄▄█▄     ▄█    ▄▄▄█  █       █  ▄   █▄     ▄█  █▄█  █    ▄▄▄█       █  ▄   █▄     ▄█   █       █  ▄▄▄▄▄█   \n" +
                "█ █ █   █   █ █▄▄▄▄▄█     ▄▄█   █▄▄█▄█   █▄▄▄  █   █ █   █▄▄▄   █       █ █▄█  █ █   █ █       █   █▄▄▄█       █ █▄█  █ █   █ █   █     ▄▄█ █▄▄▄▄▄    \n" +
                "█ █▄█   █   █▄▄▄▄▄  █    █  █    ▄▄  █    ▄▄▄█ █   █ █    ▄▄▄█  █       █      █ █   █ █   ▄   █    ▄▄▄█       █      █ █   █ █   █    █  █▄▄▄▄▄  █   \n" +
                "█       █   █▄▄▄▄▄█ █    █▄▄█   █  █ █   █▄▄▄  █   █ █   █▄▄▄   █ ██▄██ █  ▄   █ █   █ █  █ █  █   █▄▄▄█ ██▄██ █  ▄   █ █   █ █   █    █▄▄ ▄▄▄▄▄█ █   \n" +
                "█▄▄▄▄▄▄██▄▄▄█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█▄▄▄█  █▄█▄▄▄▄▄▄▄█ █▄▄▄█ █▄▄▄▄▄▄▄█  █▄█   █▄█▄█ █▄▄█ █▄▄▄█ █▄▄█ █▄▄█▄▄▄▄▄▄▄█▄█   █▄█▄█ █▄▄█ █▄▄▄█ █▄▄▄█▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█   \n";

        String c = "▀██▀▀█▄    ██                                   ▄              ▀██    ██▀           ▄   ▀██                                   ▄    ██                    \n" +
                " ██   ██  ▄▄▄   ▄▄▄▄    ▄▄▄▄  ▄▄▄ ▄▄    ▄▄▄▄  ▄██▄    ▄▄▄▄      ███  ███   ▄▄▄▄   ▄██▄   ██ ▄▄     ▄▄▄▄  ▄▄ ▄▄ ▄▄    ▄▄▄▄   ▄██▄  ▄▄▄    ▄▄▄▄   ▄▄▄▄     \n" +
                " ██    ██  ██  ██▄ ▀  ▄█   ▀▀  ██▀ ▀▀ ▄█▄▄▄██  ██   ▄█▄▄▄██     █▀█▄▄▀██  ▀▀ ▄██   ██    ██▀ ██  ▄█▄▄▄██  ██ ██ ██  ▀▀ ▄██   ██    ██  ▄█   ▀▀ ██▄ ▀     \n" +
                " ██    ██  ██  ▄ ▀█▄▄ ██       ██     ██       ██   ██          █ ▀█▀ ██  ▄█▀ ██   ██    ██  ██  ██       ██ ██ ██  ▄█▀ ██   ██    ██  ██      ▄ ▀█▄▄    \n" +
                "▄██▄▄▄█▀  ▄██▄ █▀▄▄█▀  ▀█▄▄▄▀ ▄██▄     ▀█▄▄▄▀  ▀█▄▀  ▀█▄▄▄▀    ▄█▄ █ ▄██▄ ▀█▄▄▀█▀  ▀█▄▀ ▄██▄ ██▄  ▀█▄▄▄▀ ▄██ ██ ██▄ ▀█▄▄▀█▀  ▀█▄▀ ▄██▄  ▀█▄▄▄▀ █▀▄▄█▀    \n" +
                "                                                                                                                                                         \n" ;
        String d = " _______  __                                       __                   __       __            __     __                                        __     __                   \n" +
                "|       \\|  \\                                     |  \\                 |  \\     /  \\          |  \\   |  \\                                      |  \\   |  \\                  \n" +
                "| ▓▓▓▓▓▓▓\\\\▓▓ _______  _______  ______   ______  _| ▓▓_    ______      | ▓▓\\   /  ▓▓ ______  _| ▓▓_  | ▓▓____   ______  ______ ____   ______  _| ▓▓_   \\▓▓ _______  _______ \n" +
                "| ▓▓  | ▓▓  \\/       \\/       \\/      \\ /      \\|   ▓▓ \\  /      \\     | ▓▓▓\\ /  ▓▓▓|      \\|   ▓▓ \\ | ▓▓    \\ /      \\|      \\    \\ |      \\|   ▓▓ \\ |  \\/       \\/       \\\n" +
                "| ▓▓  | ▓▓ ▓▓  ▓▓▓▓▓▓▓  ▓▓▓▓▓▓▓  ▓▓▓▓▓▓\\  ▓▓▓▓▓▓\\\\▓▓▓▓▓▓ |  ▓▓▓▓▓▓\\    | ▓▓▓▓\\  ▓▓▓▓ \\▓▓▓▓▓▓\\\\▓▓▓▓▓▓ | ▓▓▓▓▓▓▓\\  ▓▓▓▓▓▓\\ ▓▓▓▓▓▓\\▓▓▓▓\\ \\▓▓▓▓▓▓\\\\▓▓▓▓▓▓ | ▓▓  ▓▓▓▓▓▓▓  ▓▓▓▓▓▓▓\n" +
                "| ▓▓  | ▓▓ ▓▓\\▓▓    \\| ▓▓     | ▓▓   \\▓▓ ▓▓    ▓▓ | ▓▓ __| ▓▓    ▓▓    | ▓▓\\▓▓ ▓▓ ▓▓/      ▓▓ | ▓▓ __| ▓▓  | ▓▓ ▓▓    ▓▓ ▓▓ | ▓▓ | ▓▓/      ▓▓ | ▓▓ __| ▓▓ ▓▓      \\▓▓    \\ \n" +
                "| ▓▓__/ ▓▓ ▓▓_\\▓▓▓▓▓▓\\ ▓▓_____| ▓▓     | ▓▓▓▓▓▓▓▓ | ▓▓|  \\ ▓▓▓▓▓▓▓▓    | ▓▓ \\▓▓▓| ▓▓  ▓▓▓▓▓▓▓ | ▓▓|  \\ ▓▓  | ▓▓ ▓▓▓▓▓▓▓▓ ▓▓ | ▓▓ | ▓▓  ▓▓▓▓▓▓▓ | ▓▓|  \\ ▓▓ ▓▓_____ _\\▓▓▓▓▓▓\\\n" +
                "| ▓▓    ▓▓ ▓▓       ▓▓\\▓▓     \\ ▓▓      \\▓▓     \\  \\▓▓  ▓▓\\▓▓     \\    | ▓▓  \\▓ | ▓▓\\▓▓    ▓▓  \\▓▓  ▓▓ ▓▓  | ▓▓\\▓▓     \\ ▓▓ | ▓▓ | ▓▓\\▓▓    ▓▓  \\▓▓  ▓▓ ▓▓\\▓▓     \\       ▓▓\n" +
                " \\▓▓▓▓▓▓▓ \\▓▓\\▓▓▓▓▓▓▓  \\▓▓▓▓▓▓▓\\▓▓       \\▓▓▓▓▓▓▓   \\▓▓▓▓  \\▓▓▓▓▓▓▓     \\▓▓      \\▓▓ \\▓▓▓▓▓▓▓   \\▓▓▓▓ \\▓▓   \\▓▓ \\▓▓▓▓▓▓▓\\▓▓  \\▓▓  \\▓▓ \\▓▓▓▓▓▓▓   \\▓▓▓▓ \\▓▓ \\▓▓▓▓▓▓▓\\▓▓▓▓▓▓▓ \n" ;




        random_title.add(a);
        random_title.add(b);
        random_title.add(c);
        random_title.add(d);
        int random_number = random.nextInt(0,4);
        System.out.println(random_title.get(random_number));

    }

    public static void menue(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("| press '0' for Quit                                        |");
        System.out.println("| press '1' for Negation                                    |");
        System.out.println("| press '2' to Conjunction                                  |");
        System.out.println("| press '3' to Disjunction                                  |");
        System.out.println("| press '4' to Implication                                  |");
        System.out.println("| press '5' to Converse                                     |");
        System.out.println("| press '6' to Contrapositive                               |");
        System.out.println("| press '7' to Inverse                                      |");
        System.out.println("| press '8' to Biconditional                                |");
        System.out.println("| Enter 'help' to show up menu                              |");
        System.out.println("| Enter 'title' to change title                             |");
        System.out.println("| Enter 'clear' to clear Display                            |");
        System.out.println("-------------------------------------------------------------");


    }

    public static void ascii(String item){

        if(item.equals("negation")){
            System.out.println("                                 _     _                 \n" +
                    "                                | |   (_)                \n" +
                    "  _ __     ___    __ _    __ _  | |_   _    ___    _ __  \n" +
                    " | '_ \\   / _ \\  / _` |  / _` | | __| | |  / _ \\  | '_ \\ \n" +
                    " | | | | |  __/ | (_| | | (_| | | |_  | | | (_) | | | | |\n" +
                    " |_| |_|  \\___|  \\__, |  \\__,_|  \\__| |_|  \\___/  |_| |_|\n" +
                    "                  __/ |                                  \n" +
                    "                 |___/                                   ");
            System.out.println();

        }else if(item.equals("conjunction")){
            System.out.println("                           _                          _     _                 \n" +
                    "                          (_)                        | |   (_)                \n" +
                    "   ___    ___    _ __      _   _   _   _ __     ___  | |_   _    ___    _ __  \n" +
                    "  / __|  / _ \\  | '_ \\    | | | | | | | '_ \\   / __| | __| | |  / _ \\  | '_ \\ \n" +
                    " | (__  | (_) | | | | |   | | | |_| | | | | | | (__  | |_  | | | (_) | | | | |\n" +
                    "  \\___|  \\___/  |_| |_|   | |  \\__,_| |_| |_|  \\___|  \\__| |_|  \\___/  |_| |_|\n" +
                    "                         _/ |                                                 \n" +
                    "                        |__/                                                  ");
            System.out.println();

        }else if(item.equals("Disjunction")){
            System.out.println("  _____    _           _                          _     _                 \n" +
                    " |  __ \\  (_)         (_)                        | |   (_)                \n" +
                    " | |  | |  _   ___     _   _   _   _ __     ___  | |_   _    ___    _ __  \n" +
                    " | |  | | | | / __|   | | | | | | | '_ \\   / __| | __| | |  / _ \\  | '_ \\ \n" +
                    " | |__| | | | \\__ \\   | | | |_| | | | | | | (__  | |_  | | | (_) | | | | |\n" +
                    " |_____/  |_| |___/   | |  \\__,_| |_| |_|  \\___|  \\__| |_|  \\___/  |_| |_|\n" +
                    "                     _/ |                                                 \n" +
                    "                    |__/                                                  ");
            System.out.println();

        }else if(item.equals("implication")){
            System.out.println("  _                       _   _                  _     _                 \n" +
                    " (_)                     | | (_)                | |   (_)                \n" +
                    "  _   _ __ ___    _ __   | |  _    ___    __ _  | |_   _    ___    _ __  \n" +
                    " | | | '_ ` _ \\  | '_ \\  | | | |  / __|  / _` | | __| | |  / _ \\  | '_ \\ \n" +
                    " | | | | | | | | | |_) | | | | | | (__  | (_| | | |_  | | | (_) | | | | |\n" +
                    " |_| |_| |_| |_| | .__/  |_| |_|  \\___|  \\__,_|  \\__| |_|  \\___/  |_| |_|\n" +
                    "                 | |                                                     \n" +
                    "                 |_|                                                     ");
            System.out.println();

        }else if(item.equals("converse")){
            System.out.println("                                                          \n" +
                    "                                                          \n" +
                    "   ___    ___    _ __   __   __   ___   _ __   ___    ___ \n" +
                    "  / __|  / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| / __|  / _ \\\n" +
                    " | (__  | (_) | | | | |  \\ V /  |  __/ | |    \\__ \\ |  __/\n" +
                    "  \\___|  \\___/  |_| |_|   \\_/    \\___| |_|    |___/  \\___|\n" +
                    "                                                          \n" +
                    "                                                          ");
            System.out.println();

        }else if(item.equals("contrapositive")){
            System.out.println("                         _                                          _   _     _                \n" +
                    "                        | |                                        (_) | |   (_)               \n" +
                    "   ___    ___    _ __   | |_   _ __    __ _   _ __     ___    ___   _  | |_   _  __   __   ___ \n" +
                    "  / __|  / _ \\  | '_ \\  | __| | '__|  / _` | | '_ \\   / _ \\  / __| | | | __| | | \\ \\ / /  / _ \\\n" +
                    " | (__  | (_) | | | | | | |_  | |    | (_| | | |_) | | (_) | \\__ \\ | | | |_  | |  \\ V /  |  __/\n" +
                    "  \\___|  \\___/  |_| |_|  \\__| |_|     \\__,_| | .__/   \\___/  |___/ |_|  \\__| |_|   \\_/    \\___|\n" +
                    "                                             | |                                               \n" +
                    "                                             |_|                                               ");
            System.out.println();

        }else if(item.equals("inverse")){
            System.out.println("  _                                            \n" +
                    " (_)                                           \n" +
                    "  _   _ __   __   __   ___   _ __   ___    ___ \n" +
                    " | | | '_ \\  \\ \\ / /  / _ \\ | '__| / __|  / _ \\\n" +
                    " | | | | | |  \\ V /  |  __/ | |    \\__ \\ |  __/\n" +
                    " |_| |_| |_|   \\_/    \\___| |_|    |___/  \\___|\n" +
                    "                                               ");
            System.out.println();

        }else if(item.equals("Biconditional")){

            System.out.println("  ____    _                              _   _   _     _                           _ \n" +
                    " |  _ \\  (_)                            | | (_) | |   (_)                         | |\n" +
                    " | |_) |  _    ___    ___    _ __     __| |  _  | |_   _    ___    _ __     __ _  | |\n" +
                    " |  _ <  | |  / __|  / _ \\  | '_ \\   / _` | | | | __| | |  / _ \\  | '_ \\   / _` | | |\n" +
                    " | |_) | | | | (__  | (_) | | | | | | (_| | | | | |_  | | | (_) | | | | | | (_| | | |\n" +
                    " |____/  |_|  \\___|  \\___/  |_| |_|  \\__,_| |_|  \\__| |_|  \\___/  |_| |_|  \\__,_| |_|\n" +
                    "                                                                                     ");
            System.out.println();

        }

    }

    public static boolean comma(String text){
        for (int x = 0; x < text.length(); x++) {
            if (text.charAt(x) == ',') {
                return true;
            }
        }
        System.out.println("please use comma (,) !!!");
        return false;
    }

}


