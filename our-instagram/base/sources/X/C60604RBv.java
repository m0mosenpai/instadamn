package X;

import java.util.Arrays;

/* renamed from: X.RBv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60604RBv extends AbstractC1122454w {
    public static final C60604RBv A01 = new C60604RBv(new byte[0]);
    public final byte[] A00;

    @Override // X.AbstractC911344p
    public final String A07() {
        return C911944v.A01.A05(this.A00);
    }

    @Override // X.AbstractC1122454w
    public final C16R A0C() {
        return C16R.A0E;
    }

    @Override // X.C54u, X.InterfaceC911544r
    public final void EOr(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m) {
        C912044w c912044w = ((C45T) abstractC913345m.A05).A01.A00;
        byte[] bArr = this.A00;
        anonymousClass182.A0j(c912044w, bArr, 0, bArr.length);
    }

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C60604RBv)) {
            return false;
        }
        return Arrays.equals(((C60604RBv) obj).A00, this.A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    public C60604RBv(byte[] bArr) {
        this.A00 = bArr;
    }
}
