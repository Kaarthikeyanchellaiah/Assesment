package com.kctech.five;

import java.util.LinkedList;

public class Testtwo {
	

	public static void main(String[] args) {
		
	    String special []= { ")(){}", "", "([])", "{()[]}", "([)]","{}","))"};
	    		
	        for (String expr : special) {
	            if (isValid(expr))
	                System.out.println("1");
	            else
	                System.out.println("0");
	        }
	}
	        public static char close(char sp) {
	            switch (sp) {
	                case '(':
	                    return ')';
	                case '[':
	                    return ']';
	                case '{':
	                    return '}';
	                default:
	                    throw new IllegalArgumentException(String.valueOf(sp));
	            }
	        }

	        public static boolean isValid(String s) {
	            LinkedList<Character> stack = new LinkedList<>();
	            int l = s.length();
	            for (int i = 0; i < l; i++) {
	                char sp = s.charAt(i);
	                switch (sp) {
	                    case '(':
	                    case '[':
	                    case '{':
	                        stack.push(sp);
	                    break;
	                    default:
	                        if (stack.isEmpty() || sp != close(stack.pop()))
	                            return false;
	                    break;
	                }
	            }
	            if (!stack.isEmpty())
	                return false;
	            return true;
	        }       
		

	}


