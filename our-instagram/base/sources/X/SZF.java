package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.Random;

/* loaded from: classes10.dex */
public final class SZF {
    public boolean A00;
    public final Random A01;
    public final TWX A04;
    public final InterfaceC65700TsM A05;
    public final boolean A06;
    public final THO A07;
    public final byte[] A08;
    public final TWX A03 = new Object();
    public final TWY A02 = new TWY(this);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TWX, java.lang.Object] */
    public SZF(Random random, InterfaceC65700TsM interfaceC65700TsM) {
        if (interfaceC65700TsM != null) {
            if (random != null) {
                this.A06 = true;
                this.A05 = interfaceC65700TsM;
                this.A04 = interfaceC65700TsM.AEK();
                this.A01 = random;
                this.A08 = new byte[4];
                this.A07 = new THO();
                return;
            }
            throw AbstractC166987dD.A15("random == null");
        }
        throw AbstractC166987dD.A15("sink == null");
    }

    public static void A00(SZF szf, C64531TIl c64531TIl, int i) {
        if (!szf.A00) {
            int A05 = c64531TIl.A05();
            if (A05 <= 125) {
                TWX twx = szf.A04;
                twx.A0B(i | 128);
                if (szf.A06) {
                    twx.A0B(A05 | 128);
                    Random random = szf.A01;
                    byte[] bArr = szf.A08;
                    random.nextBytes(bArr);
                    twx.A0I(bArr);
                    if (A05 > 0) {
                        long j = twx.A00;
                        c64531TIl.A0A(twx);
                        THO tho = szf.A07;
                        if (tho.A03 == null) {
                            tho.A03 = twx;
                            tho.A04 = true;
                            tho.A00(j);
                            AbstractC62285S5e.A00(tho, bArr);
                            tho.close();
                        } else {
                            throw AbstractC166987dD.A14("already attached to a buffer");
                        }
                    }
                } else {
                    twx.A0B(A05);
                    c64531TIl.A0A(twx);
                }
                szf.A05.flush();
                return;
            }
            throw AbstractC166987dD.A12("Payload size must be less than or equal to 125");
        }
        throw AbstractC58321PtD.A0g();
    }

    public final void A01(long j, boolean z) {
        if (!this.A00) {
            int i = 0;
            int i2 = 0;
            if (z) {
                i2 = 128;
            }
            TWX twx = this.A04;
            twx.A0B(i2);
            boolean z2 = this.A06;
            if (z2) {
                i = 128;
            }
            if (j <= 125) {
                twx.A0B(((int) j) | i);
            } else if (j <= 65535) {
                twx.A0B(i | 126);
                twx.A0D((int) j);
            } else {
                twx.A0B(i | StringTreeSet.MAX_SYMBOL_COUNT);
                C63304ShA A09 = twx.A09(8);
                byte[] bArr = A09.A06;
                int i3 = A09.A00;
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((j >>> 56) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((j >>> 48) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((j >>> 40) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((j >>> 32) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((j >>> 24) & 255);
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((j >>> 16) & 255);
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((j >>> 8) & 255);
                bArr[i10] = (byte) (j & 255);
                A09.A00 = i10 + 1;
                twx.A00 += 8;
            }
            if (z2) {
                Random random = this.A01;
                byte[] bArr2 = this.A08;
                random.nextBytes(bArr2);
                twx.A0I(bArr2);
                if (j > 0) {
                    long j2 = twx.A00;
                    twx.FEM(this.A03, j);
                    THO tho = this.A07;
                    if (tho.A03 == null) {
                        tho.A03 = twx;
                        tho.A04 = true;
                        tho.A00(j2);
                        AbstractC62285S5e.A00(tho, bArr2);
                        tho.close();
                    } else {
                        throw AbstractC166987dD.A14("already attached to a buffer");
                    }
                }
            } else {
                twx.FEM(this.A03, j);
            }
            this.A05.ARO();
            return;
        }
        throw AbstractC58321PtD.A0g();
    }
}
