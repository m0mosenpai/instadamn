package X;

import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.6Tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139556Tk {
    public final SegmentedProgressBar A00;

    public C139556Tk(SegmentedProgressBar segmentedProgressBar) {
        C14360o3.A0B(segmentedProgressBar, 1);
        this.A00 = segmentedProgressBar;
    }

    public final void A00(C41551w4 c41551w4, C141596ac c141596ac) {
        if (c41551w4.A0H.A0I == null && AbstractC141736aq.A02(c41551w4)) {
            this.A00.A06(c41551w4.A01(), false);
        }
        this.A00.setProgress(c141596ac.A0B);
    }
}
