package org.jolokia.it;

/*
 * Copyright 2009-2011 Roland Huss
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import java.util.*;

/**
 * Test data for MXBeans
 * @author roland
 * @since 07.08.11
 */
public class ComplexTestData {
    private int number;
    private String string;
    private Map<String,Boolean> map;
    private Set<Integer> set;
    private String[] stringArray;
    private List<Boolean> list;
    private Map<String,List<Map<String,String>>> complex;


    public int getNumber() {
        return number;
    }

    public String getString() {
        return string;
    }

    public Map<String, Boolean> getMap() {
        return map;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public List<Boolean> getList() {
        return list;
    }

    public Map<String, List<Map<String, String>>> getComplex() {
        return complex;
    }

    public void setNumber(int pNumber) {
        number = pNumber;
    }

    public void setString(String pString) {
        string = pString;
    }

    public void setMap(Map<String, Boolean> pMap) {
        map = pMap;
    }

    public void setSet(Set<Integer> pSet) {
        set = pSet;
    }

    public void setStringArray(String[] pStringArray) {
        stringArray = pStringArray;
    }

    public void setList(List<Boolean> pList) {
        list = pList;
    }

    public void setComplex(Map<String, List<Map<String, String>>> pComplex) {
        complex = pComplex;
    }
}
