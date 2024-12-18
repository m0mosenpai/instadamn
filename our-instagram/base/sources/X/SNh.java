package X;

/* loaded from: classes10.dex */
public final class SNh {
    public final boolean A00;
    public final Class A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SNh)) {
            return false;
        }
        SNh sNh = (SNh) obj;
        if (!sNh.A01.equals(this.A01) || sNh.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A00).hashCode();
    }

    public SNh(Class cls, boolean z) {
        this.A01 = cls;
        this.A00 = z;
    }
}
