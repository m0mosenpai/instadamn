package X;

/* renamed from: X.VBz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68116VBz extends VC1 {
    public final Integer A00;
    public final String A01;
    public final C69739VuZ A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68116VBz) {
                C68116VBz c68116VBz = (C68116VBz) obj;
                if (this.A03 != c68116VBz.A03 || !C14360o3.A0K(this.A02, c68116VBz.A02) || !C14360o3.A0K(this.A00, c68116VBz.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, (215180831 + this.A03.intValue()) * 31) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append('_');
        return AbstractC166997dE.A0v(this.A00, sb);
    }

    public C68116VBz(C69739VuZ c69739VuZ, Integer num, Integer num2) {
        this.A03 = num;
        this.A02 = c69739VuZ;
        this.A00 = num2;
        this.A01 = AnonymousClass001.A0J("s", 'x', c69739VuZ.A01, c69739VuZ.A00);
    }
}
