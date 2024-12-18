package X;

import android.view.View;

/* loaded from: classes5.dex */
public final class BST implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C37582Ggd A01;

    public BST(C37582Ggd c37582Ggd, int i) {
        this.A01 = c37582Ggd;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View A07;
        View findViewWithTag;
        C37582Ggd c37582Ggd = this.A01;
        C37556GgC c37556GgC = ((AbstractC37623GhI) c37582Ggd).A02;
        if (c37556GgC != null && (A07 = c37556GgC.A07(c37582Ggd.A00)) != null && (findViewWithTag = A07.findViewWithTag("clips_attached_scrubber_view_tag")) != null) {
            findViewWithTag.setVisibility(this.A00);
        }
    }
}
