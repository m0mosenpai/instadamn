package X;

import android.util.Pair;
import java.util.Locale;

/* renamed from: X.4au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98154au {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public long A0F;

    public final void A00(Pair pair) {
        int i;
        int i2 = this.A0C;
        long j = i2 * this.A00;
        int intValue = i2 + ((Number) pair.second).intValue();
        this.A0C = intValue;
        long longValue = j + ((Number) pair.first).longValue();
        if (intValue == 0) {
            i = -1;
        } else {
            i = (int) (longValue / intValue);
        }
        this.A00 = i;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A08), Integer.valueOf(this.A0A), Integer.valueOf(this.A09), Integer.valueOf(this.A0B), Integer.valueOf(this.A04), Integer.valueOf(this.A05), Integer.valueOf(this.A07), Integer.valueOf(this.A06), Long.valueOf(this.A0F), Integer.valueOf(this.A0D)};
        return String.format(Locale.US, AbstractC111324zv.A00(1568), objArr);
    }
}
