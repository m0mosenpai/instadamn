package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.9Qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210099Qy {
    public final float A00;
    public final float A01;
    public final int A02;

    public C210099Qy(Context context, float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = AbstractC166987dD.A0C(context, 1);
    }

    public static final C22917A8n A00(C210099Qy c210099Qy, EnumC172837mv enumC172837mv) {
        int i = enumC172837mv.A03;
        float f = i;
        float f2 = c210099Qy.A00 / f;
        float f3 = c210099Qy.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        int i2 = 0;
        do {
            A1E.add(new C22918A8o(f3, f2, 0.0f, i2 * f2));
            i2++;
        } while (i2 < i);
        ArrayList A1E2 = AbstractC166987dD.A1E();
        float f4 = 1.0f / f;
        int i3 = 1;
        do {
            C56302iJ c56302iJ = new C56302iJ(0, c210099Qy.A02);
            AbstractC166997dE.A1M(c56302iJ);
            c56302iJ.A09 = i3 * f4;
            A1E2.add(c56302iJ);
            i3++;
        } while (i3 < i);
        ArrayList A1E3 = AbstractC166987dD.A1E();
        int i4 = (int) f2;
        int i5 = (int) f3;
        int i6 = i - 1;
        float f5 = 1.0f / i6;
        C56302iJ c56302iJ2 = new C56302iJ(i5, i4);
        c56302iJ2.A0u = 0;
        c56302iJ2.A0F = -1;
        c56302iJ2.A0s = 0;
        c56302iJ2.A0M = 0;
        A1E3.add(c56302iJ2);
        for (int i7 = 1; i7 < i6; i7++) {
            C56302iJ c56302iJ3 = new C56302iJ(i5, i4);
            AbstractC166997dE.A1M(c56302iJ3);
            c56302iJ3.A09 = i7 * f5;
            A1E3.add(c56302iJ3);
        }
        C56302iJ A0O = AbstractC167007dF.A0O(i5, i4, -1, 0);
        A0O.A0s = 0;
        A0O.A0M = 0;
        A1E3.add(A0O);
        return new C22917A8n(enumC172837mv, A1E, A1E2, A1E3);
    }
}
