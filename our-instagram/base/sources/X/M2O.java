package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* loaded from: classes8.dex */
public final class M2O implements Runnable {
    public final /* synthetic */ C149216nV A00;

    public M2O(C149216nV c149216nV) {
        this.A00 = c149216nV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C149216nV c149216nV = this.A00;
        c149216nV.A0F = C05F.A0C;
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(c149216nV.A0L));
        A0w.E7D("reel_viewer_gestures_nux_impression_count", 1);
        A0w.apply();
        C145166gb c145166gb = c149216nV.A0E;
        if (c145166gb != null) {
            C145126gX c145126gX = c145166gb.A00;
            C148776mm c148776mm = c145126gX.A05;
            if (c148776mm == null) {
                C14360o3.A0F("reelViewerNuxLogger");
                throw C00O.createAndThrow();
            }
            C41551w4 c41551w4 = ((ReelViewerFragment) c145126gX.A0U).A0a;
            if (c41551w4 != null) {
                c148776mm.A00(c41551w4, "shown", 0.0d);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
