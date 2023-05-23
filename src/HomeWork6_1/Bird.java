package HomeWork6_1;

abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean hasFeathers() {
        return feathers;
    }

    public boolean laysEggs() {
        return layEggs;
    }

    public abstract void fly();
}

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Flying bird is flying...");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Non-flying bird cannot fly.");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring high in the sky.");
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is flying.");
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Penguin cannot fly.");
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(false, true);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi is a flightless bird that cannot fly.");
    }
}

    class BirdMain {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            bird.fly();

            if (bird instanceof Eagle) {
                System.out.println("This is an Eagle.");
            } else if (bird instanceof Swallow) {
                System.out.println("This is a Swallow.");
            } else if (bird instanceof Penguin) {
                System.out.println("This is a Penguin.");
            } else if (bird instanceof Kiwi) {
                System.out.println("This is a Kiwi.");
            }

            System.out.println("Feathers: " + bird.hasFeathers());
            System.out.println("Lays eggs: " + bird.laysEggs());
            System.out.println();
        }
    }
}
