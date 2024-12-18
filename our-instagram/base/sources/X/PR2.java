package X;

import com.instagram.music.search.MusicOverlayResultsListController;

/* loaded from: classes9.dex */
public final class PR2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MusicOverlayResultsListController A01;

    public PR2(MusicOverlayResultsListController musicOverlayResultsListController, int i) {
        this.A01 = musicOverlayResultsListController;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0C.notifyItemChanged(this.A00);
    }
}
