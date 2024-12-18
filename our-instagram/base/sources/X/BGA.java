package X;

/* loaded from: classes5.dex */
public final class BGA {
    public final int A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGA) {
                long j = this.A02;
                BGA bga = (BGA) obj;
                long j2 = bga.A02;
                long j3 = C118135Vx.A01;
                if (j != j2 || this.A01 != bga.A01 || this.A00 != bga.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = C118135Vx.A01;
        return AbstractC167007dF.A07(this.A01, AbstractC25227BEk.A03(j)) + this.A00;
    }

    public BGA(long j, long j2, int i) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        if (!AbstractC118155Vz.A02(j)) {
            if (!AbstractC118155Vz.A02(j2)) {
                return;
            } else {
                throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
            }
        }
        throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Placeholder(width=");
        A1C.append((Object) C118135Vx.A02(this.A02));
        A1C.append(", height=");
        A1C.append((Object) C118135Vx.A02(this.A01));
        A1C.append(", placeholderVerticalAlign=");
        int i = this.A00;
        if (i == 4) {
            str = "Center";
        } else if (i == 5) {
            str = "TextTop";
        } else if (i == 6) {
            str = "TextBottom";
        } else {
            str = "TextCenter";
        }
        return AbstractC167017dG.A0o(str, A1C);
    }
}
