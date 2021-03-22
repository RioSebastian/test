package umn.ac.id.uts_26656;

class MusicViewHolder extends RecyclerView.ViewHolder{
    public final TextView kataItemView;
    final MusicList mAdapter;
    public MusicViewHolder(@NonNull View itemView,
                          MusicList adapter) {
        super(itemView);
        kataItemView = itemView.findViewById(R.id.kata);
        this.mAdapter = adapter;
    }
}
