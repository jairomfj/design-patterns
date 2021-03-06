package br.com.patterns.template


/**
 * Template Method Design Pattern Important Points
 *
 * Template method should consists of certain steps whose order is fixed and for some of the
 * methods, implementation differs from base class to subclass. Template method should be final.
 * Most of the times, subclasses calls methods from super class but in template pattern, superclass
 * template method calls methods from subclasses, this is known as Hollywood Principle – “don’t call
 * us, we’ll call you.”.
 * Methods in base class with default implementation are referred as Hooks and they are intended
 * to be overridden by subclasses, if you want some of the methods to be not overridden, you can make
 * them final, for example in our case we can make buildFoundation() method final because if we don’t
 * want subclasses to override it.
 *
 * source: https://www.journaldev.com/1763/template-method-design-pattern-in-java
 * code source: https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */

fun main(args: Array<String>) {
    Cricket().play()
    Football().play()
}