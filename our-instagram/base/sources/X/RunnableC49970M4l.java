package X;

import android.os.SystemClock;
import android.view.View;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.M4l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49970M4l implements Runnable {
    public final /* synthetic */ C149216nV A00;
    public final /* synthetic */ Integer A01;

    public RunnableC49970M4l(C149216nV c149216nV, Integer num) {
        this.A00 = c149216nV;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C149216nV c149216nV = this.A00;
        Integer num = this.A01;
        View view = c149216nV.A09;
        if (view != null) {
            view.setVisibility(8);
            c149216nV.A0F = C05F.A00;
            C145166gb c145166gb = c149216nV.A0E;
            if (c145166gb != null) {
                double elapsedRealtime = (SystemClock.elapsedRealtime() - c149216nV.A06) / 1000.0d;
                C14360o3.A0A(c145166gb);
                C14360o3.A0B(num, 1);
                C145126gX c145126gX = c145166gb.A00;
                ReelViewerFragment reelViewerFragment = (ReelViewerFragment) c145126gX.A0U;
                ((C147256kA) reelViewerFragment.mViewPager).A04.setDraggingEnabled(true);
                c145126gX.Dtn();
                C148776mm c148776mm = c145126gX.A05;
                if (c148776mm == null) {
                    C14360o3.A0F("reelViewerNuxLogger");
                    throw C00O.createAndThrow();
                }
                C41551w4 c41551w4 = reelViewerFragment.A0a;
                if (c41551w4 != null) {
                    c148776mm.A00(c41551w4, C6OZ.A00(num), elapsedRealtime);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
