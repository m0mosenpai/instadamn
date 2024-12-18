package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.XRz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72188XRz extends YA6 {
    public XS3 A00;
    public final C72751XmS A01;
    public final C72750XmR A02;
    public final C72750XmR A03;
    public final HashMap A04;
    public final int[] A05;
    public final WFT[] A06;

    @Override // X.InterfaceC58193Pqz
    public final Y0y[] ArL() {
        return this.A02.A02;
    }

    @Override // X.InterfaceC58193Pqz
    public final Y0y[] BUn() {
        C72750XmR c72750XmR = this.A03;
        if (c72750XmR != null) {
            return c72750XmR.A02;
        }
        return null;
    }

    @Override // X.InterfaceC58193Pqz
    public final int BbD(String str) {
        Number A0Q = AbstractC37300Gc1.A0Q("min_bitrate", this.A01.A01);
        if (A0Q == null) {
            return -1;
        }
        return A0Q.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 == (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r7[r4] = r1;
        r14 = (r14 * r21.A05[r4]) + r1;
        r4 = r4 + 1;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.Xf4] */
    @Override // X.InterfaceC58193Pqz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C54504O6h EK7(X.C72772Xmp r22) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72188XRz.EK7(X.Xmp):X.O6h");
    }

    public C72188XRz(C69495VoJ c69495VoJ, OMZ omz, YOn yOn, XS3 xs3, C12320ka c12320ka) {
        super(omz, yOn, xs3);
        C72750XmR c72750XmR;
        this.A04 = AbstractC166987dD.A1G();
        this.A00 = xs3;
        C72750XmR A00 = Y4J.A00(c69495VoJ, c12320ka, xs3.A00);
        this.A02 = A00;
        List list = xs3.A01;
        if (list != null && !list.isEmpty()) {
            c72750XmR = Y4J.A00(c69495VoJ, c12320ka, xs3.A01);
        } else {
            c72750XmR = null;
        }
        this.A03 = c72750XmR;
        C72751XmS A01 = Y4J.A01(xs3.A02);
        this.A01 = A01;
        List list2 = xs3.A04;
        int i = A01.A00;
        WFT[] wftArr = new WFT[i];
        if (list2 != null && list2.size() == i) {
            int i2 = 0;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                wftArr[i2] = new WFT(A01.A02[i2], AbstractC166987dD.A1B(it));
                i2++;
            }
            this.A06 = wftArr;
            int i3 = A00.A00;
            if (xs3.A03 != null) {
                this.A05 = new int[i3];
                int i4 = 0;
                int i5 = 1;
                for (C73306Xzx c73306Xzx : xs3.A00) {
                    List list3 = c73306Xzx.A03;
                    if (list3 != null && !list3.isEmpty()) {
                        this.A05[i4] = c73306Xzx.A03.size();
                        i5 *= this.A05[i4];
                        i4++;
                    } else {
                        throw new VI3("Missing buckets", c73306Xzx.A00);
                    }
                }
                if (xs3.A03.size() == i5 * i) {
                    return;
                } else {
                    throw new Exception("Results vector size mismatch");
                }
            }
            throw new Exception("Missing vector");
        }
        throw new Exception("Missing default value");
    }
}
