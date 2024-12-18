package X;

import android.view.View;
import java.util.Arrays;

/* renamed from: X.04b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C011304b {
    public static final C011504d A01 = new C04Z().A00.A00().A00.A08().A00.A09().A00.A0A();
    public final C011504d A00;

    public C007402o A07() {
        return null;
    }

    public void A0C(View view) {
    }

    public void A0D(C02I c02i) {
    }

    public void A0E(C011504d c011504d) {
    }

    public void A0F(C02I[] c02iArr) {
    }

    public boolean A0G() {
        return false;
    }

    public boolean A0H() {
        return false;
    }

    public boolean A0I(int i) {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C011304b)) {
            return false;
        }
        C011304b c011304b = (C011304b) obj;
        return A0H() == c011304b.A0H() && A0G() == c011304b.A0G() && C02O.A00(A03(), c011304b.A03()) && C02O.A00(A01(), c011304b.A01()) && C02O.A00(A07(), c011304b.A07());
    }

    public C02I A01() {
        return C02I.A04;
    }

    public C02I A03() {
        return C02I.A04;
    }

    public C02I A05(int i) {
        return C02I.A04;
    }

    public C02I A06(int i) {
        if ((i & 8) == 0) {
            return C02I.A04;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public C011504d A08() {
        return this.A00;
    }

    public C011504d A09() {
        return this.A00;
    }

    public C011504d A0A() {
        return this.A00;
    }

    public C011304b(C011504d c011504d) {
        this.A00 = c011504d;
    }

    public C02I A00() {
        return A03();
    }

    public C02I A02() {
        return A03();
    }

    public C02I A04() {
        return A03();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(A0H()), Boolean.valueOf(A0G()), A03(), A01(), A07()});
    }

    public C011504d A0B(int i, int i2, int i3, int i4) {
        return A01;
    }
}
