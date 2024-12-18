package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6hV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145726hV {
    public final /* synthetic */ ReelViewerFragment A00;

    public C145726hV(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void A00() {
        ReelViewerFragment reelViewerFragment = this.A00;
        ReelViewerFragment.A0I(reelViewerFragment, false);
        C41551w4 c41551w4 = reelViewerFragment.A0a;
        if (c41551w4 != null) {
            C141596ac C00 = reelViewerFragment.A1C.C00(c41551w4.A08(reelViewerFragment.getSession()));
            double currentTimeMillis = System.currentTimeMillis();
            double d = C00.A02;
            if (d != -1.0d) {
                C00.A04 += currentTimeMillis - d;
            }
            C00.A02 = -1.0d;
        }
    }

    public final void A01() {
        ReelViewerFragment reelViewerFragment = this.A00;
        ReelViewerFragment.A0G(reelViewerFragment, "context_sheet");
        C41551w4 c41551w4 = reelViewerFragment.A0a;
        if (c41551w4 != null) {
            C141596ac C00 = reelViewerFragment.A1C.C00(c41551w4.A08(reelViewerFragment.getSession()));
            double currentTimeMillis = System.currentTimeMillis();
            if (C00.A02 == -1.0d) {
                C00.A02 = currentTimeMillis;
            }
        }
        C6k4 c6k4 = reelViewerFragment.A16;
        C31349DqE c31349DqE = c6k4.A00;
        if (c31349DqE != null) {
            C41451vu.A01.E4s(new C3KF(c31349DqE));
        }
        c6k4.A00 = null;
    }
}
