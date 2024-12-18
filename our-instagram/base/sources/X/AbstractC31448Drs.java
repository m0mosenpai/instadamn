package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Drs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31448Drs {
    public static final void A00(C57012jc c57012jc, C43768JXh c43768JXh, C31243DoR c31243DoR) {
        int i;
        AbstractC167007dF.A1K(c57012jc, c43768JXh);
        if (c31243DoR == null) {
            c57012jc.A02();
            return;
        }
        c57012jc.A03(0);
        boolean z = c31243DoR.A03;
        boolean z2 = c31243DoR.A04;
        c43768JXh.A02 = z;
        c43768JXh.A03 = z2;
        int i2 = c31243DoR.A00;
        int i3 = c31243DoR.A02;
        c43768JXh.A00 = i2;
        c43768JXh.A01 = i3;
        c57012jc.A01().setBackground(c43768JXh);
        View A01 = c57012jc.A01();
        if (z2) {
            i = R.id.thread_indicator_status_circle_and_dot;
            if (!z) {
                i = R.id.thread_indicator_status_circle;
            }
        } else {
            i = R.id.thread_indicator_status_nothing;
            if (z) {
                i = R.id.thread_indicator_status_dot;
            }
        }
        A01.setId(i);
        View A012 = c57012jc.A01();
        C14360o3.A07(A012);
        ViewGroup.MarginLayoutParams A0H = AbstractC31177DnL.A0H(A012);
        A0H.setMargins(0, 0, c31243DoR.A01, 0);
        A012.setLayoutParams(A0H);
    }
}
