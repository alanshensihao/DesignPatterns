# simple factory
# factory pattern
# abstract factory

from abc import ABCMeta, abstractmethod

class Animal(metaclass = ABCMeta):
    @abstractmethod
    def do_say(self):
        pass

class Dog(Animal):
    def do_say(self):
        print("Bhow Bhow!!")

class Cat(Animal):
    def do_say(self):
        print("Meow Meow!")

class ForestFactory(object):
    def make_sound(self, object_type):
        return eval(object_type)().do_say()

if __name__ == "__main__":
    ff = ForestFactory()
    animal  = input("Which animal Dog or Cat?")
    ff.make_sound(animal)


class Section(metaclass=ABCMeta):
    @abstractmethod
    def describe(self):
        pass

class PersonalSection(Section):
    def describe(self):
        print("Personal Section")

class AlbumSection(Section):
    def describe(self):
        print("Album Section")

class PatentSection(Section):
    def describe(self):
        print("Patent Section")

class PublicationSection(Section):
    def describe(self):
        print("Publication Section")

class Profile(metaclass=ABCMeta):
    def __init__(self):
        self.sections = []
        self.createProfile()
    
    @abstractmethod
    def createProfile(self):
        pass

    def getSections(self):
        return self.sections

    def addSection(self, section):
        self.sections.append(section)


class Linkedin(Profile):
    def createProfile(self):
        self.addSection(PersonalSection())
        self.addSection(PatentSection())

class Facebook(Profile):
    def createProfile(self):
        self.addSection(PersonalSection())
        self.addSection(AlbumSection())


if __name__ == "__main__":
    profile_type = input("[Linkedin or Facebook]")
    profile: Profile = eval(profile_type)()
    print("Creating Profile.", type(profile).__name__)
    print("Profile has sections.", profile.getSections())
