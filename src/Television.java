import java.util.Arrays;

public class Television {
    private Kanal currentChannel;
    private Kanal[] maxChannels;

    public Television() {
    }

    public Television(Kanal currentChannel, Kanal[] maxChannels) {
        this.currentChannel = currentChannel;
        this.maxChannels = maxChannels;
    }

    public void nextKanal() {
        for (Kanal d : maxChannels) {
            if (d.getNumber() == d.getNumber()+1) {
                System.out.println(d);
            }
        }
    }
    public void beforeKanal(){
        for (Kanal G:maxChannels) {
            if(G.getNumber()==currentChannel.getNumber()- 1 ){
                System.out.println(G);
            }
        }
    }
    public void numberKanal(int number){
        for (Kanal a:maxChannels) {
            if (a.getNumber()==number){
                System.out.println(a);
            }
        }
    }
    public void currentKanal(){
        System.out.println(currentChannel);
    }
    public void shawNameOfKanal(int number){
        for (Kanal f:maxChannels) {
            if ( f.getNumber()==number){
                System.out.println(f.getName());
            }
        }
    }


        public Kanal getCurrentChannel() {
            return currentChannel;
        }

        public void setCurrentChannel(Kanal currentChannel){
            this.currentChannel = currentChannel;
        }

        public Kanal[] getMaxChannels () {
            return maxChannels;
        }

        public void setMaxChannels (Kanal[]maxChannels){
            this.maxChannels = maxChannels;
        }

        @Override
        public String toString () {
            return "Television{" +
                    "currentChannel=" + currentChannel +
                    ", maxChannels=" + Arrays.toString(maxChannels) +
                    '}';
        }

        public int methodMaxChannls () {
            return maxChannels.length;

        }
    }
