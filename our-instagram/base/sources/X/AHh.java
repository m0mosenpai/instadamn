package X;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AHh {
    public static final void A00(C8FC c8fc, BEd bEd) {
        C9LJ c9lj = (C9LJ) bEd;
        c9lj.A0H = c8fc;
        c9lj.A0G = c8fc.A0A;
        c9lj.A0K = c8fc.A0Q;
        c9lj.A0Z = c8fc.A0P;
        c9lj.A0Y = c8fc.A0O;
        c9lj.A0L = c8fc.A0G;
        c9lj.A0O = c8fc.A0R;
        c9lj.A0Q = c8fc.A0K;
        c9lj.A0R = c8fc.A0L;
        c9lj.A0P = c8fc.A0J;
        c9lj.A0S = c8fc.A0M;
        c9lj.A0T = c8fc.A0H;
        c9lj.A0F = c8fc.A0D;
        c9lj.A0X = c8fc.A0I;
        c9lj.A0a = c8fc.A0S;
        float f = c8fc.A01;
        if (f != -1.0f) {
            c9lj.A06 = f;
            c9lj.Ed5(c9lj.A04 * 1.0f);
        }
        float f2 = c8fc.A00;
        if (f2 != -1.0f) {
            c9lj.A05 = f2;
            c9lj.Ed5(c9lj.A04 * 1.0f);
        }
        List list = c8fc.A0E;
        if (list != null) {
            bEd.EZk(AbstractC167007dF.A04(list, 0));
            bEd.EZl(AbstractC167007dF.A04(list, 1));
        }
        float f3 = c8fc.A04;
        if (f3 != -1.0f) {
            c9lj.A07 = f3;
            c9lj.Ed5(f3);
        }
        float f4 = c8fc.A03;
        if (f4 != -1.0f) {
            bEd.Ecu(f4);
        }
        int i = c8fc.A05;
        if (i != c9lj.A08) {
            c9lj.A08 = i;
        }
    }

    public static final void A01(C202278x7 c202278x7, BEd bEd) {
        if (bEd != null) {
            bEd.Ed5(c202278x7.A06);
            bEd.EZk(c202278x7.A01);
            bEd.EZl(c202278x7.A02);
            bEd.Ecu(c202278x7.A05);
        }
    }

    public static final void A02(BEd bEd, float f, float f2) {
        if (bEd != null) {
            Rect A0W = AbstractC166987dD.A0W(((C9LJ) bEd).A0B);
            bEd.EZk(f - A0W.exactCenterX());
            bEd.EZl(f2 - A0W.exactCenterY());
        }
    }
}
