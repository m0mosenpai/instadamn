package X;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class OKn {
    public int A00;
    public int A01;
    public final JIN A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && AbstractC167017dG.A1Z(this, obj) && C14360o3.A0K(this.A02.BgD(), ((OKn) obj).A02.BgD()));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02.BgD()});
    }

    public OKn(JIN jin, Integer num, int i, int i2) {
        this.A02 = jin;
        this.A03 = num;
        this.A01 = i;
        this.A00 = i2;
    }
}
