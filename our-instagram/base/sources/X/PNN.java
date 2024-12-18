package X;

import com.instagram.music.search.MusicOverlayResultsListController;

/* loaded from: classes9.dex */
public final class PNN implements Runnable {
    public final /* synthetic */ MusicOverlayResultsListController A00;

    public PNN(MusicOverlayResultsListController musicOverlayResultsListController) {
        this.A00 = musicOverlayResultsListController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0C.notifyDataSetChanged();
    }
}
