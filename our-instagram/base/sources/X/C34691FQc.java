package X;

/* renamed from: X.FQc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34691FQc {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Login failure with reason: ");
        if (this.A01) {
            sb.append("has error;");
        }
        if (this.A02) {
            sb.append(" bad password;");
        }
        if (this.A03) {
            sb.append(" checkpoint required;");
        }
        if (this.A04) {
            sb.append(" inactive user error;");
        }
        if (this.A06) {
            sb.append("invalid one tap nonce error;");
        }
        if (this.A08) {
            sb.append("invalid user error;");
        }
        if (this.A05) {
            sb.append("invalid Google token nonce;");
        }
        if (this.A07) {
            sb.append("invalid trusted device nonce;");
        }
        if (this.A0A) {
            sb.append("unusable password, forced password reset;");
        }
        return AbstractC166987dD.A19(sb);
    }

    public C34691FQc(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A01 = z;
        this.A09 = z2;
        this.A04 = z3;
        this.A08 = z4;
        this.A05 = z5;
        this.A02 = z6;
        this.A06 = z7;
        this.A03 = z8;
        this.A07 = z9;
        this.A0A = z10;
        this.A00 = str;
    }
}
