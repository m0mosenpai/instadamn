package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FRF {
    public C34593FMc A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof FRF) || hashCode() != obj.hashCode()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr;
        C34593FMc c34593FMc = this.A00;
        if (c34593FMc != null) {
            objArr = new Object[]{this.A05, this.A03, Integer.valueOf(c34593FMc.A00), Integer.valueOf(c34593FMc.A01)};
        } else {
            objArr = new Object[]{this.A05, this.A03};
        }
        return Arrays.hashCode(objArr);
    }
}
