package X;

/* loaded from: classes9.dex */
public final class NXB extends AbstractC53537Nm4 {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NXB) {
                NXB nxb = (NXB) obj;
                if (!C14360o3.A0K(this.A00, nxb.A00) || !C14360o3.A0K(this.A01, nxb.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public NXB(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }
}
