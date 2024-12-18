package X;

/* loaded from: classes11.dex */
public final class W5N {
    public static final W5N A02 = new W5N(0, 0);
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            W5N w5n = (W5N) obj;
            if (this.A01 != w5n.A01 || this.A00 != w5n.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0t("[timeUs=", AbstractC43591JPw.A00(58), "]", this.A01, this.A00);
    }

    public W5N(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
