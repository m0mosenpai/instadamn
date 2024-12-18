package X;

import com.instagram.model.direct.DirectSearchResharedContent;

/* renamed from: X.GyS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38625GyS extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final DirectSearchResharedContent A05;

    public C38625GyS(DirectSearchResharedContent directSearchResharedContent, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(directSearchResharedContent, 1);
        this.A05 = directSearchResharedContent;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A03 = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38625GyS) {
                C38625GyS c38625GyS = (C38625GyS) obj;
                if (!C14360o3.A0K(this.A05, c38625GyS.A05) || this.A02 != c38625GyS.A02 || this.A00 != c38625GyS.A00 || this.A01 != c38625GyS.A01 || this.A04 != c38625GyS.A04 || this.A03 != c38625GyS.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC166987dD.A0G(this.A05) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + this.A04) * 31) + this.A03;
    }
}
