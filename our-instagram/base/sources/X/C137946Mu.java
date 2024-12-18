package X;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: X.6Mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137946Mu {
    public long A00 = 0;
    public EdgeEffect A01;
    public EdgeEffect A02;
    public EdgeEffect A03;
    public EdgeEffect A04;
    public EdgeEffect A05;
    public EdgeEffect A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public final int A09;
    public final Context A0A;

    public static final boolean A01(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(AbstractC65751TtQ.A00(edgeEffect) == 0.0f);
    }

    public static final EdgeEffect A00(C137946Mu c137946Mu) {
        EdgeEffect A02 = AbstractC65751TtQ.A02(c137946Mu.A0A);
        A02.setColor(c137946Mu.A09);
        long j = c137946Mu.A00;
        if (j != 0) {
            A02.setSize((int) (j >> 32), C119055aN.A00(j));
        }
        return A02;
    }

    public C137946Mu(Context context, int i) {
        this.A0A = context;
        this.A09 = i;
    }
}
