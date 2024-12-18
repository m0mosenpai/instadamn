package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.Cb6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28159Cb6 {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final long A05;
    public static final long A06;
    public static final C88 A07 = C88.A0n;
    public static final C88 A08 = C88.A04;
    public static final C88 A09;

    public static final GradientDrawable A00(C2Z1 c2z1, Integer num, float f, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(AbstractC25232BEp.A0o(c2z1, 1.0d), AbstractC25227BEk.A06(num, 0));
        return gradientDrawable;
    }

    static {
        long A0J = AbstractC25229BEm.A0J();
        A03 = A0J;
        A02 = A0J;
        long A0L = AbstractC25230BEn.A0L();
        A01 = A0L;
        A00 = A0L;
        A06 = A0L;
        A09 = C88.A0B;
        A05 = Double.doubleToRawLongBits(168.0d);
        A04 = AbstractC25229BEm.A0F();
    }
}
