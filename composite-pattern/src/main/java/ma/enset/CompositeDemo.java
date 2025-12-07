package ma.enset;

public class CompositeDemo {

    static void main() {

        Folder root = new Folder("/");
        Folder home = new Folder("/home");
        root.add(home);
        home.add(new File("picture.png"));
        home.add(new File("note.txt"));
        Folder downloads = new Folder("/Downloads");
        home.add(downloads);
        downloads.add(new File("picture.png"));
        downloads.add(new File("note.txt"));
        Folder usr = new Folder("/usr");
        root.add(usr);
        Folder bin = new Folder("/bin");
        usr.add(bin);
        bin.add(new File("ls"));
        bin.add(new File("cat"));
        bin.add(new File("mv"));
        root.print();

    }
}
