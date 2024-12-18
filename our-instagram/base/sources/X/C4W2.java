package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4W2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W2 {
    public static final C4W2 A07 = new C96614Vw().A00();
    public final C4W4 A00;

    @Deprecated
    public final C4W3 A01;
    public final C4W5 A02;
    public final C4W1 A03;

    @Deprecated
    public final C4W0 A04;
    public final C4W6 A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4W2)) {
            return false;
        }
        C4W2 c4w2 = (C4W2) obj;
        return Util.A0I(this.A06, c4w2.A06) && this.A00.equals(c4w2.A00) && Util.A0I(this.A03, c4w2.A03) && Util.A0I(this.A02, c4w2.A02) && Util.A0I(this.A05, c4w2.A05);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A06.hashCode() * 31;
        C4W1 c4w1 = this.A03;
        if (c4w1 != null) {
            i = c4w1.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A05.hashCode();
    }

    public C4W2(C4W3 c4w3, C4W5 c4w5, C4W0 c4w0, C4W6 c4w6, String str) {
        this.A06 = str;
        this.A03 = c4w0;
        this.A04 = c4w0;
        this.A02 = c4w5;
        this.A05 = c4w6;
        this.A00 = c4w3;
        this.A01 = c4w3;
    }
}
