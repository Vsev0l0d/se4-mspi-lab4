// var. 31572
class Lab4 {
    public static void main(String[] args) {
        E a = new E();
        E b = new D();
        D c = new D();
        b.n17();
        c.n26();
        a.n41();
        a.n36();
        c.n30();
        c.n39();
        b.n47();
        b.n28();
        b.n34();
        c.n19();
        c.n50();
        b.n16();
        b.n2();
        b.n37();
        a.n10();
        c.n13();
        b.n44(a);
        b.n44(b);
        a.n44(c);
        c.n29();
        c.n1();
        c.n42();
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        D d = new D();
                        d.n22();
                        Thread.sleep(7);
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
}
class E {
    int n4;
    int n15;
    int n32;
    int n8;
    int n25;
    long n24;
    long n9;
    long n31;
    java.io.ObjectOutputStream stringsWriter;
    java.io.ObjectOutputStream testStream;
    int[] n40 = {0, 3, 0, 1, 2};
    int[] n45 = {-1, -1, -1, -1};
    int[] n11 = {1, -1, 2, -1, 1};
    static String stack = "";
    static java.util.Map<java.net.URI,byte[]> cache = new java.util.HashMap<>();
    static int n5;
    static int n48;
    static int n38;
    static int n49;
    static int n43;
    java.util.List<String> n20 = new java.util.ArrayList<>();
    java.util.List<String> n12 = new java.util.ArrayList<>();
    java.util.List<String> n21 = new java.util.ArrayList<>();
    public E() {
        n4 = 2;
        n15 = 9;
        n32 = 8;
        n8 = 7;
        n25 = 6;
        n24 = 1L;
        n9 = 9L;
        n31 = 4L;
        try {
            stringsWriter = new java.io.ObjectOutputStream(new java.io.FileOutputStream("stringsWriter.txt"));
            testStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream("testStream.txt"));
        } catch (java.lang.Exception e) {
            // Do nothing
        }
    }
    public void init() {
        try {
            if (stringsWriter == null) stringsWriter = new java.io.ObjectOutputStream(new java.io.FileOutputStream("stringsWriter.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", stringsWriter = " + stringsWriter);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (testStream == null) testStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream("testStream.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", testStream = " + testStream);
        } catch(Exception e) {
            // Ignore it
        }
    }
    public byte[] getValueFromCache(String s) {
        try {
            java.net.URI url = new java.net.URI(s);
            if(!cache.containsKey(url)) {
                cache.put(url, new byte[1048576]);
            }
            return cache.get(url);
        } catch (Exception e) {
            System.out.println("Error: invalid URL!");
            return null;
        }
    }
    public void n17() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStream) {
                            testStream.writeObject("метод n17 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            testStream.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n26() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsWriter) {
                            stringsWriter.writeObject("метод n26 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            stringsWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n41() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsWriter) {
                            stringsWriter.writeObject("метод n41 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            stringsWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n36() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsWriter) {
                            stringsWriter.writeObject("метод n36 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            stringsWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n30() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsWriter) {
                            stringsWriter.writeObject("метод n30 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            stringsWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n39() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStream) {
                            testStream.writeObject("метод n39 в классе E (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            testStream.flush();
                            testStream.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n13() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack = stack.substring(0, stack.length() - 1);
                            Thread.sleep(5);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n16() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack = stack.substring(0, stack.length() - 1);
                            Thread.sleep(5);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n37() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack += "9";
                            Thread.sleep(5);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n2() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack = stack.substring(0, stack.length() - 1);
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n50() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack += "9";
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n10() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack = stack.substring(0, stack.length() - 1);
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void n47() {
        System.out.println("метод n47 в классе E");
        System.out.println(n5);
    }
    public static void n28() {
        System.out.println("метод n28 в классе E");
        System.out.println((n5 - 2));
    }
    public static void n34() {
        System.out.println("метод n34 в классе E");
        System.out.println(n48);
    }
    public static void n19() {
        System.out.println("метод n19 в классе E");
        System.out.println((n48 + 1));
    }
    public void n44(E r) {
        r.n17();
    }
    public void n44(D r) {
        r.n26();
    }
}
class D extends E {
    public D() {
        n15 = 8;
        n8 = 6;
        n25 = 7;
        n24 = 0L;
        n31 = 9L;
    }
    public void n26() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsWriter) {
                            stringsWriter.writeObject("метод n26 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(13);
                            stringsWriter.flush();
                            stringsWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n29() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n1() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(13);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void n42() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void n47() {
        System.out.println("метод n47 в классе D");
        System.out.println(n5--);
    }
    public static void n28() {
        System.out.println("метод n28 в классе D");
        System.out.println(n48);
    }
    public static void n34() {
        System.out.println("метод n34 в классе D");
        System.out.println((n48 - 1));
    }
    public static void n19() {
        System.out.println("метод n19 в классе D");
        System.out.println(n48);
    }
    public void n14() {
        for(int i = 0; i < 5; i++) {
            this.n12.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.n12.size());
        }
    }
    public void n33() {
        for(int i = 0; i < 5; i++) {
            this.n20.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.n20.size());
        }
    }
    public void n22() {
        for(int i = 0; i < 7; i++) {
            this.n20.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.n20.size());
        }
    }
    public void n27() {
        for(int i = 0; i < 7; i++) {
            this.n12.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.n12.size());
        }
    }
    public void n44(E r) {
        r.n41();
    }
    public void n44(D r) {
        r.n36();
    }
}