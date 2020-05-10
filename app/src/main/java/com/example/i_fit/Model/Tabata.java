package com.example.i_fit.Model;

import com.example.i_fit.Model.Circuit;
import com.example.i_fit.Model.Workout;
import com.example.i_fit.R;

import java.util.ArrayList;
import java.util.HashMap;

public class Tabata{
    public HashMap<Integer, ArrayList<Circuit>> getTraining() {
        return training;
    }

    public void setTraining(HashMap<Integer, ArrayList<Circuit>> training) {
        this.training = training;
    }

    private HashMap<Integer, ArrayList<Circuit>> training=new HashMap<>();
    public Tabata(){
          createDays();
    }



    public void createDays(){
        createDay1();
        createDay2();
        createDay3();
        createDay4();
        createDay5();
    }



    private void createDay1(){
        ArrayList<Circuit> circuits=new ArrayList<>();
        // Circuit 1
        ArrayList<Workout> w1=new ArrayList<>();
         w1.add(new Workout("flying jumping jacks", R.drawable.jumpingjacks));
         w1.add(new Workout("Squats with Knee raise",R.drawable.squatswithkneeraise));
         w1.add(new Workout("Plank shoulder Taps",R.drawable.plankshouldertaps));
        Circuit circuit1=new Circuit(w1,3);
        circuits.add(circuit1);

        //com.example.i_fit.Model.Circuit 2

        ArrayList<Workout> w2=new ArrayList<>();
        w2.add(new Workout("Shoulder tap Push Ups",R.drawable.shouldertappushups));
        w2.add(new Workout("Squat Jumps",R.drawable.squatjumps));
        Circuit circuit2=new Circuit(w2,3);
        circuits.add(circuit2);

        // com.example.i_fit.Model.Circuit 3
        ArrayList<Workout> w3=new ArrayList<>();
        w3.add(new Workout("Hand Release Push Ups",R.drawable.handreleasepushups));
        w3.add(new Workout("Lunge Jumps",R.drawable.lungejumps));
        w3.add(new Workout("Diamond Pushups",R.drawable.diamondpushups));
        w3.add(new Workout("Pop Squats",R.drawable.popsquats));
        Circuit circuit3=new Circuit(w3,3);
        circuits.add(circuit3);

//        // com.example.i_fit.Model.Circuit 4

        ArrayList<Workout> w4=new ArrayList<>();
        w4.add(new Workout("Push up to Burpee",R.drawable.pushuptoburpee));
        w4.add(new Workout("High Low Plank",R.drawable.highlowplanks));
        Circuit circuit4=new Circuit(w4,4);
        circuits.add(circuit4);

//        // com.example.i_fit.Model.Circuit 5
//
        ArrayList<Workout> w5=new ArrayList<>();
        w5.add(new Workout("Low Plank Hold",R.drawable.lowplankhold));
        w5.add(new Workout("Squat Hold",R.drawable.squathold));
        w5.add(new Workout("Lunge Hold",R.drawable.lungehold));
        Circuit circuit5=new Circuit(w5,2);
        circuits.add(circuit5);

//        // com.example.i_fit.Model.Circuit 6

        ArrayList<Workout> w6=new ArrayList<>();
        w6.add(new Workout("Push ups",R.drawable.pushups));
        w6.add(new Workout("Squats",R.drawable.squats));
        w6.add(new Workout("High Low Planks",R.drawable.highlowplanks));
        w6.add(new Workout("Squat Thrust",R.drawable.squatthrust));
        Circuit circuit6=new Circuit(w5,1);
        circuits.add(circuit6);


        training.put(1,circuits);

    }


    private void createDay2(){

        ArrayList<Circuit> circuits=new ArrayList<>();

        //circuit 1

        ArrayList<Workout> w1=new ArrayList<>();
        w1.add(new Workout("Walk out to Shoulder Taps",R.drawable.walkouttoshouldertap));
        w1.add(new Workout("Half Jacks",R.drawable.halfjacks));
        w1.add(new Workout("Jump Squats",R.drawable.squatjumps));
        Circuit circuit1=new Circuit(w1,3);
        circuits.add(circuit1);

        //Circuit 2

        ArrayList<Workout> w2=new ArrayList<>();
        w2.add(new Workout("Plank jacks to In-Out Abs",R.drawable.plankjackstoinoutabs));
        w2.add(new Workout("Vertical Jumps",R.drawable.standingjackstoverticaljumps));
        Circuit circuit2=new Circuit(w2,4);
        circuits.add(circuit2);

        //Circuit 3

        ArrayList<Workout> w3=new ArrayList<>();
        w3.add(new Workout("Mountain Climbers",R.drawable.mountainclimbers));
        w3.add(new Workout("High Knees",R.drawable.highknees));
        w3.add(new Workout("2 Squats to jump squats",R.drawable.squatjumps));
        w3.add(new Workout("2 Wide pike ups tp Burpees",R.drawable.widepikeups));
        Circuit circuit3=new Circuit(w3,2);
        circuits.add(circuit3);

        //Circuit 4

        ArrayList<Workout> w4=new ArrayList<>();
        w4.add(new Workout("Butt kicks",R.drawable.buttkicks));
        w4.add(new Workout("Donkey Kicks",R.drawable.donkeykicks));
        Circuit circuit4=new Circuit(w4,4);
        circuits.add(circuit4);

        //Circuit 5

        ArrayList<Workout> w5=new ArrayList<>();
        w5.add(new Workout("High Low Planks",R.drawable.highlowplanks));
        w5.add(new Workout("Jump Squats",R.drawable.squatjumps));
        w5.add(new Workout("Jumping Jacks",R.drawable.jumpingjacks));
        w5.add(new Workout("Plank Arm and Leg Jacks",R.drawable.plankjackstoinoutabs));
        Circuit circuit5=new Circuit(w5,2);
        circuits.add(circuit5);


        //circuit 6

        ArrayList<Workout> w6=new ArrayList<>();
        w6.add(new Workout("Ski Abs",R.drawable.skiabs));
        w6.add(new Workout("Ski Jumps",R.drawable.skijumps));
        Circuit circuit6=new Circuit(w6,4);
        circuits.add(circuit6);


        //circuit 7

        ArrayList<Workout> w7=new ArrayList<>();
        w7.add(new Workout("Plank Jacks",R.drawable.plankjackstoinoutabs));
        w7.add(new Workout("Jump Squats",R.drawable.squatjumps));
        w7.add(new Workout("Butt Kicks",R.drawable.buttkicks));
        w7.add(new Workout("Ski Jump",R.drawable.skijumps));
        Circuit circuit7=new Circuit(w7,2);
        circuits.add(circuit7);


        training.put(2,circuits);



    }


    private void createDay3(){


        ArrayList<Circuit> circuits=new ArrayList<>();

        //circuit 1

        ArrayList<Workout> w1=new ArrayList<>();
        w1.add(new Workout("Squats",R.drawable.squats));
        w1.add(new Workout("Jog in Place",R.drawable.jog));
        w1.add(new Workout("lunges",R.drawable.lungehold));
        Circuit circuit1=new Circuit(w1,3);
        circuits.add(circuit1);

        //Circuit 2

        ArrayList<Workout> w2=new ArrayList<>();
        w2.add(new Workout("2 Squat-pulses to squats",R.drawable.squatpulses));
        w2.add(new Workout("2 squat-pulses to jump squats",R.drawable.squatpulses));
        w2.add(new Workout("Squat Pulses",R.drawable.squatpulses));
        w2.add(new Workout("2 squat pulses to Ski Jumps",R.drawable.skijumps));
        Circuit circuit2=new Circuit(w2,2);
        circuits.add(circuit2);

        //Circuit 3

        ArrayList<Workout> w3=new ArrayList<>();
        w3.add(new Workout("Leg Raises",R.drawable.legraise));
        w3.add(new Workout("Flutter Kicks",R.drawable.flutterkicks));
        w3.add(new Workout("Leg Crosses",R.drawable.crosses));
        w3.add(new Workout("Six Inch Holds",R.drawable.sixinchhod));
        Circuit circuit3=new Circuit(w3,2);
        circuits.add(circuit3);


        //Circuit 4

        ArrayList<Workout> w4=new ArrayList<>();
        w4.add(new Workout("lunge Hold ",R.drawable.lungehold));
        w4.add(new Workout("Lunge Jumps",R.drawable.lungejumps));
       // w4.add(new Workout(" Skip Lunges",R.drawable.skiplunges));
        w4.add(new Workout("Squat Jumps",R.drawable.squatjumps));
        Circuit circuit4=new Circuit(w4,2);
        circuits.add(circuit4);


        //Circuit 5

        ArrayList<Workout> w5=new ArrayList<>();
        w5.add(new Workout("Low Plank",R.drawable.lowplankhold));
        w5.add(new Workout("High plank",R.drawable.highplank));
        w5.add(new Workout("Side Plank",R.drawable.sideplank));
        w5.add(new Workout("Plank Toe Taps",R.drawable.planktoetaps));
        Circuit circuit5=new Circuit(w5,2);
        circuits.add(circuit5);


        //Circuit 6

        ArrayList<Workout> w6=new ArrayList<>();
        w6.add(new Workout("Lunge Squat",R.drawable.lungesquat));
        w6.add(new Workout("Lunge, Lunge, Squat",R.drawable.squats));
        w6.add(new Workout("Lunge, Lunge, Floor Touch, Squat",R.drawable.lungejumps));
        Circuit circuit6=new Circuit(w6,2);
        circuits.add(circuit6);

        //Circuit 7


        ArrayList<Workout> w7=new ArrayList<>();
        w7.add(new Workout("Squats",R.drawable.squats));
        w7.add(new Workout("Leg Raise",R.drawable.legraise));
        w7.add(new Workout("Lunges",R.drawable.lungehold));
        w7.add(new Workout("Calf Raise",R.drawable.calfraise));
        Circuit circuit7=new Circuit(w7,2);
        circuits.add(circuit7);



        training.put(3,circuits);

    }


    private void createDay4(){

        ArrayList<Circuit> circuits=new ArrayList<>();

        //circuit 1

        ArrayList<Workout> w1=new ArrayList<>();
        w1.add(new Workout("plank shoulder taps",R.drawable.plankshouldertaps));
        w1.add(new Workout("Jog in Place",R.drawable.jog));
        w1.add(new Workout("Arm Circles",R.drawable.armcircles));
        Circuit circuit1=new Circuit(w1,3);
        circuits.add(circuit1);

        //Circuit 2

        ArrayList<Workout> w2=new ArrayList<>();
            w2.add(new Workout("Push up with Row",R.drawable.pushupwithrow));
        w2.add(new Workout("push ups",R.drawable.pushups));
        w2.add(new Workout("Balance Row",R.drawable.balancerow));
        w2.add(new Workout("Back extension to push up",R.drawable.backextension));
        Circuit circuit2=new Circuit(w2,2);
        circuits.add(circuit2);

        //Circuit 3

        ArrayList<Workout> w3=new ArrayList<>();
        w3.add(new Workout("Half sits",R.drawable.halfsits));
        w3.add(new Workout("Leg crosses",R.drawable.crosses));
        w3.add(new Workout("Knee Crunch",R.drawable.kneecrunches));
        w3.add(new Workout("plank punches",R.drawable.plankpunches));
        Circuit circuit3=new Circuit(w3,2);
        circuits.add(circuit3);


        //Circuit 4

        ArrayList<Workout> w4=new ArrayList<>();
        w4.add(new Workout("push ups to Burpees",R.drawable.pushuptoburpee));
        w4.add(new Workout("Diamond Pushups",R.drawable.diamondpushups));
        w4.add(new Workout("Plank Shoulder Taps",R.drawable.plankshouldertaps));
        w4.add(new Workout("Tricep Dips",R.drawable.tricepdips));
        Circuit circuit4=new Circuit(w4,2);
        circuits.add(circuit4);


        //Circuit 5

        ArrayList<Workout> w5=new ArrayList<>();
        w5.add(new Workout("Oblique Twist",R.drawable.obliquetwist));
        w5.add(new Workout("Tuck Ins",R.drawable.tuckins));
        w5.add(new Workout("Knee Crunchs",R.drawable.kneecrunches));
        Circuit circuit5=new Circuit(w5,2);
        circuits.add(circuit5);


        //Circuit 6

        ArrayList<Workout> w6=new ArrayList<>();
        w6.add(new Workout("Hand Release Push ups",R.drawable.handreleasepushups));
        w6.add(new Workout("High Plank",R.drawable.highplank));
        w6.add(new Workout("Military Press",R.drawable.militarypress));
        w6.add(new Workout("Explosive Push ups",R.drawable.explosivepushup));
        Circuit circuit6=new Circuit(w6,2);
        circuits.add(circuit6);

        //Circuit 7


        ArrayList<Workout> w7=new ArrayList<>();
        w7.add(new Workout("push ups",R.drawable.pushups));
        w7.add(new Workout("knee crunchs",R.drawable.kneecrunches));
        w7.add(new Workout("High Knees",R.drawable.highknees));
        Circuit circuit7=new Circuit(w7,2);
        circuits.add(circuit7);


        training.put(4,circuits);




    }


    public void createDay5(){
        ArrayList<Circuit> circuits=new ArrayList<>();

        //circuit 1

        ArrayList<Workout> w1=new ArrayList<>();
        w1.add(new Workout("Jumping Jacks",R.drawable.jumpingjacks));
        w1.add(new Workout("Hollow Man",R.drawable.hollowman));
        w1.add(new Workout("Heel Taps",R.drawable.heeltaps));
        Circuit circuit1=new Circuit(w1,3);
        circuits.add(circuit1);

        //Circuit 2

        ArrayList<Workout> w2=new ArrayList<>();
        w2.add(new Workout("Push up to Burpees",R.drawable.pushuptoburpee));
        w2.add(new Workout("180* Jump Squats",R.drawable.oejumpsquat));
        w2.add(new Workout("Suicide Runs",R.drawable.suicideruns));
        w2.add(new Workout("Jack Squats",R.drawable.squatjacks));
        Circuit circuit2=new Circuit(w2,4);
        circuits.add(circuit2);

        //Circuit 3

        ArrayList<Workout> w3=new ArrayList<>();
        w3.add(new Workout("Fast Feet",R.drawable.fastfeet));
        w3.add(new Workout("Push Ups",R.drawable.pushups));
        w3.add(new Workout(" Jump Squats",R.drawable.squatjumps));
        w3.add(new Workout("Mountain Climbers",R.drawable.mountainclimbers));
        Circuit circuit3=new Circuit(w3,4);
        circuits.add(circuit3);


        //Circuit 4

        ArrayList<Workout> w4=new ArrayList<>();
        w4.add(new Workout("Speed Skater",R.drawable.speedskater));
        w4.add(new Workout("Pop Squats",R.drawable.popsquats));
        w4.add(new Workout("Sit-Ups",R.drawable.situps));
        w4.add(new Workout("Butt Kicks",R.drawable.buttkicks));
        Circuit circuit4=new Circuit(w4,2);
        circuits.add(circuit4);


        //Circuit 5

        ArrayList<Workout> w5=new ArrayList<>();
        w5.add(new Workout("High Low Planks  To Shoulder Taps",R.drawable.highlowplanks));
        w5.add(new Workout("Superman",R.drawable.superman));
        w5.add(new Workout("Half Sits",R.drawable.halfsits));
        w4.add(new Workout("Low Crunches",R.drawable.crunches));
        Circuit circuit5=new Circuit(w5,2);
        circuits.add(circuit5);


        //Circuit 6

        ArrayList<Workout> w6=new ArrayList<>();
        w6.add(new Workout("T Push Ups",R.drawable.tpushups));
        w6.add(new Workout("Downward to Upward Dog",R.drawable.downwarddog));
        w6.add(new Workout("Pop//Punch Lunges(Alternating)",R.drawable.poplunge));
        w6.add(new Workout("Squats",R.drawable.squats));
        w6.add(new Workout("Plank",R.drawable.lowplankhold));

        Circuit circuit6=new Circuit(w6,2);
        circuits.add(circuit6);




        training.put(5,circuits);

    }

}
