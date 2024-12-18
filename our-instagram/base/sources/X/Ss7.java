package X;

import android.graphics.Color;

/* loaded from: classes10.dex */
public final class Ss7 implements InterfaceC65311Thn {
    public static final Ss7 A00 = new Object();

    @Override // X.InterfaceC65311Thn
    public final /* bridge */ /* synthetic */ Object E3O(THX thx, float f) {
        double d;
        boolean z = false;
        if (thx.A0E() == C05F.A00) {
            z = true;
            thx.A0I();
        }
        double A0B = thx.A0B();
        double A0B2 = thx.A0B();
        double A0B3 = thx.A0B();
        if (thx.A0E() == C05F.A0u) {
            d = thx.A0B();
        } else {
            d = 1.0d;
        }
        if (z) {
            thx.A0K();
        }
        if (A0B <= 1.0d && A0B2 <= 1.0d && A0B3 <= 1.0d) {
            A0B *= 255.0d;
            A0B2 *= 255.0d;
            A0B3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) A0B, (int) A0B2, (int) A0B3));
    }
}
