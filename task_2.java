@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}

// Напиши код здесь
@Test 
public void checkIsAdultWhenAgeIsLessThan18False (){
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
    boolean expected = false;
    assertEquals("Возраст меньше 18", expected, isAdult );
}

@Test
public void checkIsAdultWhenAgeIs18True(){
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    boolean expected = true;
    assertEquals("Возраст 18", expected, isAdult);
}
