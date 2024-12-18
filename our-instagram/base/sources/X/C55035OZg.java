package X;

import com.facebook.expression.effect.avatar.AvatarLoadingProgressManager$runLoaderProgress$1;

/* renamed from: X.OZg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55035OZg {
    public O4W A00;
    public Integer A01;
    public InterfaceC50122Sb A02;
    public boolean A03;
    public final C19L A04 = AbstractC25236BEt.A0e(C12L.A00.A04);

    public static final void A00(C55035OZg c55035OZg, int i, int i2) {
        int i3 = 101 - i;
        AbstractC25229BEm.A1R(c55035OZg.A02);
        c55035OZg.A02 = MSW.A1H(new AvatarLoadingProgressManager$runLoaderProgress$1(c55035OZg, null, i3, i2 / i3), c55035OZg.A04);
    }

    public static final void A01(C55035OZg c55035OZg, Integer num) {
        Integer num2;
        Integer num3;
        C51887MwV A00;
        c55035OZg.A01 = num;
        O4W o4w = c55035OZg.A00;
        if (o4w != null) {
            NU5 nu5 = o4w.A00;
            C51887MwV A002 = NU5.A00(nu5);
            C55035OZg c55035OZg2 = nu5.A05;
            if (c55035OZg2 != null) {
                num3 = c55035OZg2.A01;
            } else {
                num3 = null;
            }
            A00 = C51887MwV.A00(null, null, null, null, null, null, A002, null, null, null, num3, null, null, null, null, null, null, null, null, 0.0f, -1073741825, false, false, false, false, false, false, false, false, false, false, false, false, false);
            NU5.A0A(nu5, A00);
        }
        if (num != null && num.intValue() == 80 && !c55035OZg.A03 && (num2 = c55035OZg.A01) != null) {
            int intValue = num2.intValue();
            A00(c55035OZg, intValue, (101 - intValue) * 104 * 10);
        }
    }
}
