package X;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class SZL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A06;
    public SJM A07;
    public Boolean A08;
    public ByteBuffer A09;
    public boolean A0A;
    public byte[] A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E;
    public int[] A0F;
    public int[] A0G;
    public short[] A0H;
    public final SDH A0I;
    public final int[] A0J = new int[256];
    public Bitmap.Config A05 = Bitmap.Config.ARGB_8888;

    public SZL(SJM sjm, SDH sdh, ByteBuffer byteBuffer, int i) {
        byte[] bArr;
        int[] iArr;
        this.A0I = sdh;
        this.A07 = new SJM();
        synchronized (this) {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.A04 = 0;
                this.A07 = sjm;
                this.A02 = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.A09 = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.A09.order(ByteOrder.LITTLE_ENDIAN);
                this.A0A = false;
                Iterator it = sjm.A0A.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((SJL) it.next()).A02 == 3) {
                        this.A0A = true;
                        break;
                    }
                }
                this.A03 = highestOneBit;
                int i2 = sjm.A06;
                this.A01 = i2 / highestOneBit;
                int i3 = sjm.A04;
                this.A00 = i3 / highestOneBit;
                int i4 = i2 * i3;
                C63361SiK c63361SiK = this.A0I.A01;
                if (c63361SiK == null) {
                    bArr = new byte[i4];
                } else {
                    bArr = (byte[]) c63361SiK.A04(i4, byte[].class);
                }
                this.A0C = bArr;
                int i5 = this.A01 * this.A00;
                if (c63361SiK != null) {
                    iArr = (int[]) c63361SiK.A04(i5, int[].class);
                } else {
                    iArr = new int[i5];
                }
                this.A0G = iArr;
            } else {
                throw AbstractC25230BEn.A0n("Sample size must be >=0, not: ", i);
            }
        }
    }

    private Bitmap A00() {
        Bitmap.Config config;
        Boolean bool = this.A08;
        if (bool != null && !bool.booleanValue()) {
            config = this.A05;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        SDH sdh = this.A0I;
        Bitmap Axk = sdh.A00.Axk(this.A01, this.A00, config);
        Axk.setHasAlpha(true);
        return Axk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0382, code lost:
    
        r1 = ((((r21 / r17) << 24) | ((r20 / r17) << 16)) | ((r19 / r17) << 8)) | (r18 / r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0394, code lost:
    
        if (r1 == 0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0396, code lost:
    
        r0[r15] = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap A01() {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SZL.A01():android.graphics.Bitmap");
    }
}
