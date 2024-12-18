package X;

import java.math.BigDecimal;

/* renamed from: X.RBs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60601RBs extends C54y {
    public final BigDecimal A00;
    public static final C60601RBs A01 = new C60601RBs(BigDecimal.ZERO);
    public static final BigDecimal A04 = BigDecimal.valueOf(-2147483648L);
    public static final BigDecimal A02 = BigDecimal.valueOf(2147483647L);
    public static final BigDecimal A05 = BigDecimal.valueOf(Long.MIN_VALUE);
    public static final BigDecimal A03 = BigDecimal.valueOf(Long.MAX_VALUE);

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && (obj instanceof C60601RBs) && ((C60601RBs) obj).A00.compareTo(this.A00) == 0;
        }
        return true;
    }

    @Override // X.AbstractC911344p
    public final String A07() {
        return this.A00.toString();
    }

    @Override // X.AbstractC1122454w
    public final C16R A0C() {
        return C16R.A0H;
    }

    @Override // X.C54y
    public final int A0D() {
        return this.A00.intValue();
    }

    @Override // X.C54u, X.InterfaceC911544r
    public final void EOr(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m) {
        anonymousClass182.A0v(this.A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        return Double.valueOf(this.A00.doubleValue()).hashCode();
    }

    public C60601RBs(BigDecimal bigDecimal) {
        this.A00 = bigDecimal;
    }
}
