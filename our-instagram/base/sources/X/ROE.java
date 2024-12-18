package X;

import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public class ROE extends ROF {
    public final byte[] A00;

    @Override // X.AbstractC64539TIv
    public int A05() {
        return this.A00.length;
    }

    @Override // X.AbstractC64539TIv
    public final boolean equals(Object obj) {
        int A05;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof AbstractC64539TIv) || (A05 = A05()) != ((AbstractC64539TIv) obj).A05()) {
            return false;
        }
        if (A05 == 0) {
            return true;
        }
        if (obj instanceof ROE) {
            ROE roe = (ROE) obj;
            int A04 = A04();
            int A042 = roe.A04();
            if (A04 != 0 && A042 != 0 && A04 != A042) {
                return false;
            }
            if (A05 <= roe.A05()) {
                byte[] bArr = this.A00;
                byte[] bArr2 = roe.A00;
                int i2 = 0;
                while (i2 < A05) {
                    if (bArr[i2] != bArr2[i]) {
                        return false;
                    }
                    i2++;
                    i++;
                }
                return true;
            }
            throw AbstractC58321PtD.A0j(A05);
        }
        return obj.equals(this);
    }

    @Override // X.AbstractC64539TIv
    public byte A02(int i) {
        return this.A00[i];
    }

    @Override // X.AbstractC64539TIv
    public final byte A03(int i) {
        return this.A00[i];
    }

    @Override // X.AbstractC64539TIv
    public final int A06(int i, int i2, int i3) {
        return AbstractC63328Shc.A01(this.A00, i, i3);
    }

    @Override // X.AbstractC64539TIv
    public final AbstractC64539TIv A07(int i, int i2) {
        int A00 = AbstractC64539TIv.A00(0, 47, A05());
        if (A00 == 0) {
            return AbstractC64539TIv.A01;
        }
        return new ROD(this.A00, A00);
    }

    public ROE(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }

    @Override // X.AbstractC64539TIv
    public final String A09(Charset charset) {
        return AbstractC58318PtA.A0n(charset, this.A00, 0, A05());
    }

    @Override // X.AbstractC64539TIv
    public final void A0A(SSM ssm) {
        ((ROC) ssm).A0R(this.A00, A05());
    }

    @Override // X.AbstractC64539TIv
    public final boolean A0B() {
        return AbstractC63353SiA.A04(this.A00, 0, A05());
    }
}
