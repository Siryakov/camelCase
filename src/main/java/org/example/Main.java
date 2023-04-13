package org.example;

import static sun.util.locale.LocaleUtils.isEmpty;

class camelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("heeloAAAAA"));

    }


    public static String camelCase(String input) {
        if (input == null || input.length() == 0) {  // проверяем, что входная строка не null и не пустая
            return "";
        }
        StringBuilder result = new StringBuilder();  // создаем объект StringBuilder, который будем использовать для создания результирующей строки
        int start = 0;  // задаем начальную позицию для поиска слов в строке
        for (int i = 0; i < input.length(); i++) {  // проходим по всей строке
            if (Character.isUpperCase(input.charAt(i))) {  // если текущий символ в верхнем регистре, то это начало нового слова
                if (i > start) {  // если это не первое слово, то добавляем предыдущее слово в результирующую строку с пробелом в конце
                    result.append(input.substring(start, i)).append(" ");
                }
                start = i;  // задаем новую начальную позицию для поиска следующего слова
            }
        }
        if (start < input.length()) {  // добавляем последнее слово в результирующую строку без пробела в конце
            result.append(input.substring(start)).append(" ");
        }
        return result.toString().trim();  // возвращаем результирующую строку без пробелов в начале и конце
    }
}

