package X;

/* renamed from: X.49w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C919249w extends C0T6 {
    public final long A00;
    public final C1KS A01;
    public final C1KQ A02;
    public final C1KO A03;
    public final C1KO A04;
    public final String A05;
    public final boolean A06;
    public final C51232Ww A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C919249w) {
                C919249w c919249w = (C919249w) obj;
                if (!C14360o3.A0K(this.A07, c919249w.A07) || !C14360o3.A0K(this.A02, c919249w.A02) || !C14360o3.A0K(this.A01, c919249w.A01) || !C14360o3.A0K(this.A03, c919249w.A03) || this.A06 != c919249w.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Navigation(qeParams=");
        sb.append(this.A07);
        sb.append(", exitEvent=");
        sb.append(this.A02);
        sb.append(", enterEvent=");
        sb.append(this.A01);
        sb.append(", triggerDownEvent=");
        sb.append(this.A03);
        sb.append(", isCold=");
        sb.append(this.A06);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A07.hashCode() * 31;
        C1KQ c1kq = this.A02;
        if (c1kq == null) {
            hashCode = 0;
        } else {
            hashCode = c1kq.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return hashCode3 + i;
    }

    public C919249w(C51232Ww c51232Ww, C1KS c1ks, C1KQ c1kq, C1KO c1ko, boolean z) {
        long j;
        this.A07 = c51232Ww;
        this.A02 = c1kq;
        this.A01 = c1ks;
        this.A03 = c1ko;
        this.A06 = z;
        this.A05 = c1ks.A03;
        C1KO c1ko2 = ((C1KR) c1ks).A00;
        this.A04 = c1ko2;
        if (c51232Ww.A0E) {
            j = ((C1KP) c1ko2).A00;
        } else {
            j = ((C1KP) c1ko).A00;
        }
        this.A00 = j;
    }
}
