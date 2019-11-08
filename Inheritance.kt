package com.mykotlin

/*👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽
 * For this inheritance project i decided to make use of old school biology to represent inheritance Animalia Kingdom
 * For this i turned to the the table of how all living organism are arranged am sure u all know the table
 *  this is just a brief or a demo i'll make it more sophisticated when i get around to it
 * But next i'll be doing the Plante Kingdom
 *
  *  👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽👽
 */


fun main(args: Array<String>){
    // You can call the functions or inherited properties of the parent class by creating an object of the child class
}
/*
   This is the parent class where all the child class inherit from, i used things that are common to the animal kingdom
   * In the child class they all have functions particular to their specie
 */
open class Animals {
    var breed: String = ""
    var eyes: String = ""
    var legs: Boolean = true
    var ears: Boolean = true
    var moth: Boolean = true
}
/*
   * The child class below all hold methods containing traits only seen in their breed
   * LIST OF ANIMALS USED ARE:
   * DOG
   * CAT
   * G.O.A.T 🐐
   * BIRD
   * MAN
 */

// The Child Class of Dog inheriting from the Animal Class(Parent Class)
open class Dog: Animals(){
    fun Speed(){
        println("I am faster than a human")
    }
    fun Pet(){
        println("I am man's best friend")
    }
    fun Mate(){
        println("I dont have a fixed mating partner")
    }
}
// The Child Class of Cat inheriting from the Animal Class(Parent Class)
open class Cat: Animals(){
    fun Flexible(){
        println("I am very flexible,i'll always land on my feet")
    }
    fun Stelth() {
        println("Stelth and hunting is my game")
    }
}

// The Child Class of Goat inheriting from the Animal Class(Parent Class)
open class Goat: Animals(){
    fun Stubborn(){
        println("Stubborn is me ")
    }
    fun GOAT(){
        println("I am the Greatest Of All Time")
    }
}


// The Child Class of Bird inheriting from the Animal Class(Parent Class)
open class Bird: Animals(){
    fun Fly(){
        println("I can fly duo not all my family can ")
    }
    fun Sing(){
        println("I sing better than a human")
    }
}

// The Child Class of Humans(MAN) inheriting from the Animal Class(Parent Class)
open class Humans: Animals(){
    fun Inventor(){
        println("I can create but i cannot undo damage ")
    }
    fun Polluter(){
        println("I have managed to destroy the earth with my little time here")
    }
    fun Advance(){
        println("I am the most adanced of the Animal Kingdom")
    }
    fun Fool(){
        println("I am a fool by nature, progress in in my DNA")
    }

}