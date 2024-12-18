package X;

/* loaded from: classes11.dex */
public final class VC0 extends VC1 {
    public final int A00;
    public final String A01;
    public final int A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VC0) {
                VC0 vc0 = (VC0) obj;
                if (this.A03 != vc0.A03 || this.A02 != vc0.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((215180831 + this.A03.intValue()) * 31) + this.A02;
    }

    public final String toString() {
        return this.A01;
    }

    public VC0(int i, Integer num) {
        this.A03 = num;
        this.A02 = i;
        this.A00 = i;
        this.A01 = AnonymousClass001.A0J("s", 'x', i, i);
    }
}
