package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CgF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28409CgF {
    public static final C25564BSb A00(Context context, C09530e4 c09530e4) {
        C14360o3.A0B(c09530e4, 1);
        int i = 0;
        int i2 = 1;
        if (AbstractC166987dD.A09(c09530e4.A01) <= AbstractC13880nE.A00(context, 158.0f)) {
            i2 = 0;
        }
        Number number = (Number) c09530e4.A00;
        if (number.floatValue() > AbstractC13880nE.A00(context, 98.0f)) {
            i = 1;
            if (number.floatValue() >= AbstractC13890nF.A01(context) - AbstractC13880nE.A00(context, 98.0f)) {
                i = 2;
            }
        }
        return (C25564BSb) AbstractC25225BEi.A13(BSP.A06.get(i2), i);
    }

    public static final EnumC27401C7e A01(C37644Ghd c37644Ghd, int i, boolean z) {
        if (i == 2) {
            return EnumC27401C7e.A09;
        }
        if (i == 3) {
            if (c37644Ghd.A0R) {
                return EnumC27401C7e.A07;
            }
            return EnumC27401C7e.A06;
        }
        if (i == 4) {
            if (z) {
                return EnumC27401C7e.A0A;
            }
            return EnumC27401C7e.A08;
        }
        if (i == 5) {
            return EnumC27401C7e.A05;
        }
        return null;
    }

    public static final List A02(C25564BSb c25564BSb, int i) {
        C14360o3.A0B(c25564BSb, 0);
        double d = c25564BSb.A00 + ((i * 1.0471975511965976d) / 2.0d);
        ArrayList A1E = AbstractC166987dD.A1E();
        int A00 = C17x.A00(1, i * 2, 2);
        if (1 <= A00) {
            int i2 = 1;
            while (true) {
                double d2 = (d - (i2 * 0.5235987755982988d)) % 6.283185307179586d;
                if (d2 != 0.0d && Math.signum(d2) != Math.signum(6.283185307179586d)) {
                    d2 += 6.283185307179586d;
                }
                A1E.add(Double.valueOf(d2));
                if (i2 == A00) {
                    break;
                }
                i2 += 2;
            }
        }
        if (c25564BSb.A01) {
            return AbstractC001800i.A0Y(A1E);
        }
        return A1E;
    }

    public static final C09530e4 A03(Context context, C09530e4 c09530e4, double d, boolean z) {
        C14360o3.A0B(c09530e4, 3);
        C09530e4 A1L = AbstractC166987dD.A1L(Double.valueOf((106.0d + (Math.cos(d) * 72.0d)) - 26.0d), Double.valueOf((50.0d + (72.0d * Math.sin(d))) - 26.0d));
        if (z) {
            return AbstractC166987dD.A1L(Double.valueOf(AbstractC166987dD.A09(c09530e4.A00) + AbstractC13880nE.A00(context, (float) r0)), Double.valueOf(AbstractC166987dD.A09(c09530e4.A01) - AbstractC13880nE.A00(context, (float) r4)));
        }
        return A1L;
    }
}
