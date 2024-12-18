package X;

/* loaded from: classes6.dex */
public final class GNM implements Runnable {
    public final /* synthetic */ C3K4 A00;

    public GNM(C3K4 c3k4) {
        this.A00 = c3k4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3K4 c3k4 = this.A00;
        C60662pp c60662pp = c3k4.A0I;
        if (c60662pp.mView != null) {
            c60662pp.getScrollingViewProxy().EdY(0);
            c3k4.A09.A07();
        }
    }
}
