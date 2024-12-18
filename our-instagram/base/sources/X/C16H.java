package X;

/* renamed from: X.16H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16H {
    public Integer A00;
    public byte[] A01;
    public byte[] A02;
    public char[] A03;
    public char[] A04;
    public char[] A05;
    public byte[] A06;
    public final C16D A07;
    public final C16G A08;
    public final boolean A09;

    @Deprecated
    public final Object A0A;

    public static final void A00(Object obj) {
        if (obj == null) {
        } else {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final void A01(byte[] bArr) {
        byte[] bArr2 = this.A06;
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        this.A06 = null;
        this.A08.A00.set(3, bArr);
    }

    public final void A02(byte[] bArr) {
        byte[] bArr2 = this.A01;
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        this.A01 = null;
        this.A08.A00.set(0, bArr);
    }

    public final void A03(byte[] bArr) {
        byte[] bArr2 = this.A02;
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        this.A02 = null;
        this.A08.A00.set(1, bArr);
    }

    public final void A04(char[] cArr) {
        char[] cArr2 = this.A03;
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        this.A03 = null;
        this.A08.A01.set(1, cArr);
    }

    public final byte[] A05() {
        A00(this.A06);
        byte[] A00 = this.A08.A00(3);
        this.A06 = A00;
        return A00;
    }

    public C16H(C16D c16d, C16G c16g, boolean z) {
        this.A08 = c16g;
        this.A07 = c16d;
        this.A0A = c16d.A01;
        this.A09 = z;
    }
}
