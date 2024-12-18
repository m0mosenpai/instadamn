package X;

import java.math.BigInteger;

/* renamed from: X.RBr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60600RBr extends C54y {
    public final BigInteger A00;
    public static final BigInteger A03 = BigInteger.valueOf(-2147483648L);
    public static final BigInteger A01 = BigInteger.valueOf(2147483647L);
    public static final BigInteger A04 = BigInteger.valueOf(Long.MIN_VALUE);
    public static final BigInteger A02 = BigInteger.valueOf(Long.MAX_VALUE);

    @Override // X.AbstractC911344p
    public final String A07() {
        return this.A00.toString();
    }

    @Override // X.AbstractC1122454w
    public final C16R A0C() {
        return C16R.A0I;
    }

    @Override // X.C54y
    public final int A0D() {
        return this.A00.intValue();
    }

    @Override // X.C54u, X.InterfaceC911544r
    public final void EOr(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m) {
        anonymousClass182.A0w(this.A00);
    }

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C60600RBr)) {
            return false;
        }
        return ((C60600RBr) obj).A00.equals(this.A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C60600RBr(BigInteger bigInteger) {
        this.A00 = bigInteger;
    }
}
