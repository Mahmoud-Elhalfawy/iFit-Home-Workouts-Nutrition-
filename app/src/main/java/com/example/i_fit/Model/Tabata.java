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
         w1.add(new Workout(" Jumping jacks", R.drawable.jumpingjacks,"Stand upright with your legs together, arms at your sides." +
                 " Bend your knees slightly, and jump into the air." +
                 " As you jump, spread your legs to be about shoulder-width apart. Stretch your arms out and over your head then" +
                 " Jump back to starting position."));

         w1.add(new Workout("Squats with Knee raise",R.drawable.squatswithkneeraise,"Stand with your feet wider than shoulder-width apart, elbows bent, and arms held before chest. " +
                 "Flex your knees, sitting back with hips, until your thighs are parallel to the floor. Make sure your knees follow the direction of the toes. " +
                 "As you come up, shift your weight onto the outside of your sole. Lift up one knee as high as you can, tighten the glute on the other side, and twist your upper body towards the raised knee. " +
                 "Switch opposite sides with the same motion"));

         w1.add(new Workout("Plank shoulder Taps",R.drawable.plankshouldertaps,"start in a press-up position and make sure your hands up directly under your shoulders and your feet are in line with your hips." +
                 " Keeping your hips as still as possible, lift one hand and tap it on the opposite shoulder." +
                 " Then repeat on the other side."));
        Circuit circuit1=new Circuit(w1,3);
        circuits.add(circuit1);

        //com.example.i_fit.Model.Circuit 2

        ArrayList<Workout> w2=new ArrayList<>();
        w2.add(new Workout("Shoulder tap Push Ups",R.drawable.shouldertappushups,"Begin in a plank position with hands direction under shoulders and feet hip-width apart. Keeping abdominals and legs tight as you slowly lower your chest toward the ground with elbows bending and pointing behind you." +
                " Exhale as you push back up to lengthen arms into plank then lift you right hand to tap your left shoulder at the top.  Repeat with the other arm tapping."));

        w2.add(new Workout("Squat Jumps",R.drawable.squatjumps,"Stand tall with your feet hip-width apart. " +
                "Hinge at the hips to push your butt back and lower down until your thighs are parallel to the floor. Then press your feet down to explode off the floor and jump as high as you can. " +
                "Allow your knees to bend 45 degrees when you land, and then immediately drop back down into a squat, and jump again."));
        Circuit circuit2=new Circuit(w2,3);
        circuits.add(circuit2);

        // com.example.i_fit.Model.Circuit 3
        ArrayList<Workout> w3=new ArrayList<>();
        w3.add(new Workout("Hand Release Push Ups",R.drawable.handreleasepushups,"Start in a high-plank position with your shoulders stacked over your wrists and core engaged. " +
                "Lower down until your chest hits the floor. Keep elbows at a 45-degree angle from your torso so you look like an arrow from above. " +
                "At the bottom, pick your hands up to hover off the floor a few inches. " +
                "Then, place your palms back down, engage your core, leg and glute muscles, and without arching or rounding your spine, push up in to your high plank."));

        w3.add(new Workout("Lunge Jumps",R.drawable.lungejumps,"Starting standing with feet shoulder-width apart. Jump your left leg forward and your right leg back into a lunge, with both knees at 90 degrees. " +
                "Jump up and switch your legs in midair so that you land in a lunge with your right leg in front. " +
                "Continue jumping back and forth, pausing as little as possible."));

        w3.add(new Workout("Diamond Pushups",R.drawable.diamondpushups,"Assume a high plank position, hands on the floor underneath your chest and feet in line wi" +
                "th your hips. Bring your thumbs and forefingers together almost directly under your chest" +
                " to form a diamond or triangle shape. Squeeze your thighs and glutes for stability. Lower your " +
                "chest toward the ground, ensuring your elbows point back towards your feet. Lower until you’re about" +
                " six inches from the ground, then push the floor away from you to return to the top."));


        w3.add(new Workout("Pop Squats",R.drawable.popsquats,"With your feet slightly wider than shoulder-width apart, lower your hips down and back until you're in a squat position. Keep your hands in front of your chest and your knees behind your toes" +
                ". Push off your heels and pop up on your tippy toes. At the same time, pull your arms straight back behind you." +
                " Return to the starting position. That's one rep."));

        Circuit circuit3=new Circuit(w3,3);
        circuits.add(circuit3);

//        // com.example.i_fit.Model.Circuit 4

        ArrayList<Workout> w4=new ArrayList<>();
        w4.add(new Workout("Push up to Burpee",R.drawable.pushuptoburpee,"Stand with your feet shoulder-width apart. " +
                "Squat as deeply as you can and place your hands on the floor. Kick back into a push-up position. " +
                "Do one push-up. " +

                "Bring your legs back to a squat and jump up, throwing your hands above your head. " +
                "Land and repeat."));

        w4.add(new Workout("High Low Plank",R.drawable.highlowplanks,"Start in the high plank position on your hands and toes with your body in a straight line. " +
                "Lower yourself down to your elbows and then back up to your hands with control."));

        Circuit circuit4=new Circuit(w4,4);
        circuits.add(circuit4);

//        // com.example.i_fit.Model.Circuit 5
//
        ArrayList<Workout> w5=new ArrayList<>();
        w5.add(new Workout("Low Plank Hold",R.drawable.lowplankhold," Plant elbow directly under shoulders (slightly wider than shoulder width). " +
               "Ground toes into the floor and squeeze glutes to stabilize your body. Your legs should be working, too — be careful not to lock or hyperextend your knees. " +
                "Neutralize your neck and spine by looking at a spot on the floor about a foot beyond your hands. Your head should be in line with your back."));

        w5.add(new Workout("Squat Hold",R.drawable.squathold,"Place your feet at shoulder-width or just outside of shoulder-width. Turn your toes out slightly. Brace your core and keep your chest up. " +
                "Swing your arms up to shoulder level as you slowly bend your knees and push your hips backward. Lower yourself until your thighs are parallel with the ground. " +
                "Pause and stay in this position for as long as you can. Return to the starting position by dropping your arms and push your hips forward."));

        w5.add(new Workout("Lunge Hold",R.drawable.lungehold,"Go down in a position of normal lunges exercise and your knees at angle 90." +
                " Hold on this position then repeat with the other leg."));

        Circuit circuit5=new Circuit(w5,2);
        circuits.add(circuit5);

//        // com.example.i_fit.Model.Circuit 6

        ArrayList<Workout> w6=new ArrayList<>();
        w6.add(new Workout("Push ups",R.drawable.pushups,"Get down on all fours, placing your hands slightly wider than your shoulders. " +
                "Straighten your arms and legs. " +

                "Lower your body until your chest nearly touches the floor. " +

                "Pause, then push yourself back up. "));

        w6.add(new Workout("Squats",R.drawable.squats,"Stand with feet a little wider than hip width, toes facing front. " +
                "Drive your hips back—bending at the knees and ankles and pressing your knees slightly open. " +
                "Sit into a squat position while still keeping your heels and toes on the ground, chest up and shoulders back."));

        w6.add(new Workout("High Low Plank",R.drawable.highlowplanks,"Start in the high plank position on your hands and toes with your body in a straight line. " +
                "Lower yourself down to your elbows and then back up to your hands with control."));

        w6.add(new Workout("Squat Thrust",R.drawable.squatthrust,"Begin standing with the feet hip-distance apart. " +
                "Lower into a crouching squat with your hands on the floor. " +
                "Keeping the abs engaged, jump your feet back so you're in plank position. " +
                "Keeping the arms straight, jump your feet forward behind the hands. " +
                "Stand up to complete one rep."));

        Circuit circuit6=new Circuit(w6,1);
        circuits.add(circuit6);


        training.put(1,circuits);

    }


    private void createDay2(){

        ArrayList<Circuit> circuits=new ArrayList<>();

        //circuit 1

        ArrayList<Workout> w1=new ArrayList<>();
        w1.add(new Workout("Walk out to Shoulder Taps",R.drawable.walkouttoshouldertap,"Begin standing, " +
                "lower your arms to the floor and walk your hands forward until you are in push-up position. " +
                "Then, lift one hand and touch the opposite shoulder" +
                ", repeat on the other shoulder and then walk your hands back towards your feet and stand up."));

        w1.add(new Workout("Half Jacks",R.drawable.halfjacks,"Do the same routine as jumping jacks but with only one hand and one leg opened" +
                " (can be done by jumping also)"));
        w1.add(new Workout("Squat Jumps",R.drawable.squatjumps,"Stand tall with your feet hip-width apart. " +
                "Hinge at the hips to push your butt back and lower down until your thighs are parallel to the floor. Then press your feet down to explode off the floor and jump as high as you can. " +
                "Allow your knees to bend 45 degrees when you land, and then immediately drop back down into a squat, and jump again."));
        Circuit circuit1=new Circuit(w1,3);
        circuits.add(circuit1);

        //Circuit 2

        ArrayList<Workout> w2=new ArrayList<>();
        w2.add(new Workout("Plank jacks to In-Out Abs",R.drawable.plankjackstoinoutabs,"Start in high plank position with your" +
                " arms extended directly underneath your shoulders. Dig your toes into the ground and lift your butt to where your shoulders " +
                "line up with your hips." +
                " Keep your abs tight as you jump  legs only out and back to center and your hips up and down with each jump."));

        w2.add(new Workout("Vertical Jumps",R.drawable.standingjackstoverticaljumps,"Standstill and crouch with a small angle, then" +
                "verticall jump as high as you can. Land with a small crouch with your both legs on the ground. "));
        Circuit circuit2=new Circuit(w2,4);
        circuits.add(circuit2);

        //Circuit 3

        ArrayList<Workout> w3=new ArrayList<>();
        w3.add(new Workout("Mountain Climbers",R.drawable.mountainclimbers,"Get into a plank position, making sure to distribute your weight evenly " +
                "between your hands and your toes. " +
                "Check your form—your hands should be about shoulder-width apart, back flat, abs engaged, and head in alignment. " +
                "Pull your right knee into your chest as far as you can. " +
                "Then switch, pulling that knee out and bringing the other knee in.\n" +
                "Keeping your hips down, run your knees in and out as far and as fast as you can. Alternate inhaling and exhaling with each leg change."));

        w3.add(new Workout("High Knees",R.drawable.highknees,"Stand up straight and place your feet about hip-width apart. " +
                "Place your hands, palms down facing the floor, hovering just above your belly button. " +
                "Quickly drive your right knee up to meet your right hand, bring the same leg back to the ground immediately" +
                " bring the left knee coming up to meet your left hand. " +
                "As you are alternating knees, you want to do it with a hopping motion, staying on the balls of your feet the entire time. " +
                "Make sure you are engaging your abdominal muscles as each knee comes up to meet the hands."));
        w3.add(new Workout("2 Squats to jump squats",R.drawable.squatjumps,"Begin the training by doing two squats then" +
                "to jumping squats to complete one cycle"));

        w3.add(new Workout("2 Wide pike ups tp Burpees",R.drawable.widepikeups,"Place your hands on the ground shoulder" +
                " width apart, with your bum in the air and feet on the ground, practitioners of Yoga may recognise this" +
                " as the downward-facing dog position. " +
                "Your arms should be overhead, slightly in-front of your face." +
                "If flexibility is a problem then feel free to bend your knees or place your feet on an elevated object. " +
                "Lower yourself under control, until the top of your head touches the ground. " +
                "Hold for a second, then return to the start position and do it twice followed by a Burpee jump."));
        Circuit circuit3=new Circuit(w3,2);
        circuits.add(circuit3);

        //Circuit 4

        ArrayList<Workout> w4=new ArrayList<>();
        w4.add(new Workout("Butt kicks",R.drawable.buttkicks,"Begin by standing with your feet about hip-distance apart, with your arms at your side.\n" +
                "Slowly bring your right heel to your buttocks by contracting your hamstring muscle. " +
                "Place the ball of your right foot back on the ground, and slowly bring your left heel to your buttocks. " +
                "Perform this motion a few more times — alternating heels and gradually building speed. " +
                "When you’re ready, continue alternating your right and left heels, picking up your pace until it feels like you’re jogging" +
                " in place. " +
                "To work your upper body at the same time, pump your arms while performing this motion. If your left heel is" +
                " kicking your buttocks, pump your right arm forward at a 90-degree angle. If your right heel is kicking, " +
                "pump your left arm forward."));

        w4.add(new Workout("Donkey Kicks",R.drawable.donkeykicks,"Get on all fours, with your hands stacked directly " +
                "under shoulders, and knees under hips. Make sure your back is flat (think: balancing a cup of coffee on your lower back), " +
                "and tuck your chin slightly so the back of your neck is facing the ceiling. Without rounding your spine, engage your lower" +
                " abdominals. Keeping the 90-degree bend in your right knee, slowly lift your leg straight back and up toward the ceiling. " +
                "Your max height is right before your back starts to arch, or your hips begin to rotate. Return to the starting position." +
                " Repeat all reps on one side, then switch legs. (Watch Instagram-famous trainer Anna Victoria demo the move above.)"));

        Circuit circuit4=new Circuit(w4,4);
        circuits.add(circuit4);

        //Circuit 5

        ArrayList<Workout> w5=new ArrayList<>();
        w5.add(new Workout("High Low Planks",R.drawable.highlowplanks));
        w5.add(new Workout("Jump Squats",R.drawable.squatjumps,"Stand tall with your feet hip-width apart. " +
                "Hinge at the hips to push your butt back and lower down until your thighs are parallel to the floor. Then press your feet down to explode off the floor and jump as high as you can. " +
                "Allow your knees to bend 45 degrees when you land, and then immediately drop back down into a squat, and jump again."));

        w5.add(new Workout("Jumping Jacks",R.drawable.jumpingjacks,"Stand upright with your legs together, arms at your sides." +
                " Bend your knees slightly, and jump into the air." +
                " As you jump, spread your legs to be about shoulder-width apart. Stretch your arms out and over your head then" +
                " Jump back to starting position."));

        w5.add(new Workout("Plank Arm and Leg Jacks",R.drawable.plankjackstoinoutabs,"Start in high plank position with your" +
                " arms extended directly underneath your shoulders. Dig your toes into the ground and lift your butt to where your shoulders " +
                "line up with your hips." +
                " Keep your abs tight as you jump both legs and arms out and back to center."));

        Circuit circuit5=new Circuit(w5,2);
        circuits.add(circuit5);


        //circuit 6

        ArrayList<Workout> w6=new ArrayList<>();
        w6.add(new Workout("Ski Abs",R.drawable.skiabs,"Begin in a high plank with your shoulders stacked over your hands. Keep your shoulder, hips, and heels in a straight line. " +
                "Press through your shoulders and lengthen your back. Tuck your hips under to draw your belly in. Avoid dropping your hips to the floor. " +
                "Keep your hands still. Jump both feet forward, drawing your knees towards your chest and landing with your feet together on the floor to the right of your right hand. Align your left knee to the outside of your right elbow. " +
                "Spring back to plank to reset. Then do the same thing on the left side. " +
                "Exhale when you jump forward."));

        w6.add(new Workout("Ski Jumps",R.drawable.skijumps,"Quickly jump from side to side, landing each time with your feet about hip-width apart." +
                " Each time you land is counted as one jump"));
        Circuit circuit6=new Circuit(w6,4);
        circuits.add(circuit6);


        //circuit 7

        ArrayList<Workout> w7=new ArrayList<>();
        w7.add(new Workout("Plank Jacks",R.drawable.plankjackstoinoutabs,"Start in high plank position with your" +
                " arms extended directly underneath your shoulders. Dig your toes into the ground and lift your butt to where your shoulders " +
                "line up with your hips." +
                " Keep your abs tight as you jump  legs only out and back to center."));

        w7.add(new Workout("Squat Jumps",R.drawable.squatjumps,"Stand tall with your feet hip-width apart. " +
                "Hinge at the hips to push your butt back and lower down until your thighs are parallel to the floor. Then press your feet down to explode off the floor and jump as high as you can. " +
                "Allow your knees to bend 45 degrees when you land, and then immediately drop back down into a squat, and jump again."));

        w7.add(new Workout("Butt Kicks",R.drawable.buttkicks,"Begin by standing with your feet about hip-distance apart, with your arms at your side.\n" +
                "Slowly bring your right heel to your buttocks by contracting your hamstring muscle. " +
                "Place the ball of your right foot back on the ground, and slowly bring your left heel to your buttocks. " +
                "Perform this motion a few more times — alternating heels and gradually building speed. " +
                "When you’re ready, continue alternating your right and left heels, picking up your pace until it feels like you’re jogging" +
                " in place. " +
                "To work your upper body at the same time, pump your arms while performing this motion. If your left heel is" +
                " kicking your buttocks, pump your right arm forward at a 90-degree angle. If your right heel is kicking, " +
                "pump your left arm forward."));

        w7.add(new Workout("Ski Jumps",R.drawable.skijumps,"Quickly jump from side to side, landing each time with " +
                "your feet about hip-width apart." +
                " Each time you land is counted as one jump"));
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
