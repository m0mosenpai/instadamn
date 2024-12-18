package X;

import java.util.Arrays;

/* renamed from: X.BfN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26034BfN extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    public C26034BfN(short[] sArr, int i) {
        this.A00 = 0;
        this.A04 = sArr;
        this.A03 = 16000;
        this.A01 = 1;
        this.A02 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26034BfN) {
                    C26034BfN c26034BfN = (C26034BfN) obj;
                    if (c26034BfN.A00 != 1 || this.A01 != c26034BfN.A01 || this.A03 != c26034BfN.A03 || this.A02 != c26034BfN.A02 || this.A04 != c26034BfN.A04) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C26034BfN)) {
                return false;
            }
            C26034BfN c26034BfN2 = (C26034BfN) obj;
            if (c26034BfN2.A00 != 0 || !C14360o3.A0K(this.A04, c26034BfN2.A04) || this.A03 != c26034BfN2.A03 || this.A01 != c26034BfN2.A01 || this.A02 != c26034BfN2.A02) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        if (this.A00 != 0) {
            hashCode = ((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31;
            i = this.A04.hashCode();
        } else {
            hashCode = ((((Arrays.hashCode((short[]) this.A04) * 31) + this.A03) * 31) + this.A01) * 31;
            i = this.A02;
        }
        return hashCode + i;
    }

    public C26034BfN(C7R c7r, int i, int i2, int i3) {
        this.A00 = 1;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = c7r;
    }
}
