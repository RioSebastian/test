package umn.ac.id.uts_26656;

public class Library extends
        RecyclerView.Adapter<MusicList.MusicViewHolder> {
    private final LinkedList<String> mDaftarKata;
    private LayoutInflater mInflater;
    Library(Context context, LinkedList<String> daftarKata){
        mInflater = LayoutInflater.from(context);
        mDaftarKata = daftarKata;
    }
    @NonNull