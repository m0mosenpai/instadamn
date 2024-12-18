package X;

import android.view.inputmethod.CursorAnchorInfo;

/* loaded from: classes5.dex */
public abstract class CBZ {
    public static final void A00(CursorAnchorInfo.Builder builder, C114205Dh c114205Dh, C127055oj c127055oj) {
        C127035oh c127035oh;
        int A05;
        int A052;
        if (c114205Dh.A01 < c114205Dh.A02) {
            float f = c114205Dh.A03;
            float f2 = c114205Dh.A00;
            if (f >= f2 || (A05 = (c127035oh = c127055oj.A03).A05(f)) > (A052 = c127035oh.A05(f2))) {
                return;
            }
            while (true) {
                builder.addVisibleLineBounds(c127055oj.A00(A05), c127035oh.A04(A05), c127055oj.A01(A05), c127035oh.A03(A05));
                if (A05 != A052) {
                    A05++;
                } else {
                    return;
                }
            }
        }
    }
}
