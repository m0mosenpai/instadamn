package X;

import android.graphics.RectF;

/* renamed from: X.6PN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PN {
    public float A00;
    public final RectF A01;
    public final RectF A02;
    public final boolean A03;

    public static C6PN A00() {
        float A0A = AbstractC13880nE.A0A(AbstractC12290kX.A00) / 2.0f;
        float A09 = AbstractC13880nE.A09(AbstractC12290kX.A00) / 2.0f;
        return A03(new RectF(A0A, A09, A0A, A09));
    }

    public static C6PN A01() {
        float A0A = AbstractC13880nE.A0A(AbstractC12290kX.A00) / 2.0f;
        float A09 = AbstractC13880nE.A09(AbstractC12290kX.A00);
        return A03(new RectF(A0A, A09, A0A, A09));
    }

    public static C6PN A02() {
        float A0A = AbstractC13880nE.A0A(AbstractC12290kX.A00);
        float A09 = AbstractC13880nE.A09(AbstractC12290kX.A00);
        return A03(new RectF(0.0f, A09, A0A, 2.0f * A09));
    }

    public static C6PN A03(RectF rectF) {
        return new C6PN(new RectF(-1.0f, -1.0f, -1.0f, -1.0f), rectF, true);
    }

    public C6PN(RectF rectF, RectF rectF2, boolean z) {
        RectF rectF3 = new RectF();
        this.A01 = rectF3;
        RectF rectF4 = new RectF();
        this.A02 = rectF4;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        this.A03 = z;
        this.A00 = 1.0f;
    }

    public static C6PN A04(RectF rectF) {
        return new C6PN(rectF, new RectF(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY()), false);
    }
}
