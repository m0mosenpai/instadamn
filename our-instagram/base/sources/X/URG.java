package X;

/* loaded from: classes11.dex */
public final class URG extends C0T6 implements XFP {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof URG) && this.A00 == ((URG) obj).A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public URG(boolean z) {
        this.A00 = z;
    }
}
