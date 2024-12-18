package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.WSi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70354WSi implements XE2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C70130W5r A05;
    public XG2 A06;
    public String A07;
    public final int A0C;
    public final WFa A0D;
    public final String A0E;
    public int A09 = 0;
    public long A0B = -9223372036854775807L;
    public final AtomicInteger A0F = new AtomicInteger();
    public int A08 = -1;
    public int A0A = -1;

    @Override // X.XE2
    public final void E3B(boolean z) {
    }

    @Override // X.XE2
    public final void EMb() {
        this.A09 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A0B = -9223372036854775807L;
        this.A0F.set(0);
    }

    private boolean A01(WFa wFa, byte[] bArr, int i) {
        int i2 = wFa.A00 - wFa.A01;
        int i3 = this.A00;
        int min = Math.min(i2, i - i3);
        wFa.A0R(bArr, i3, min);
        int i4 = this.A00 + min;
        this.A00 = i4;
        return AbstractC167007dF.A1P(i4, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x048c, code lost:
    
        r2 = "Multiple audio presentations or assets not supported";
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04c7, code lost:
    
        throw new X.VCM(r2, null, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r1 == (-398277519)) goto L35;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e5  */
    @Override // X.XE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJY(X.WFa r21) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70354WSi.AJY(X.WFa):void");
    }

    public C70354WSi(String str, int i, int i2) {
        this.A0D = new WFa(new byte[i2]);
        this.A0E = str;
        this.A0C = i;
    }

    public static void A00(C70354WSi c70354WSi, String str, int i, int i2) {
        C70116W4o c70116W4o;
        if (i2 != -2147483647 && i != -1) {
            C70130W5r c70130W5r = c70354WSi.A05;
            if (c70130W5r != null) {
                if (i != c70130W5r.A06 || i2 != c70130W5r.A0I || !str.equals(c70130W5r.A0Y)) {
                    c70116W4o = new C70116W4o(c70130W5r);
                } else {
                    return;
                }
            } else {
                c70116W4o = new C70116W4o();
            }
            c70116W4o.A0T = c70354WSi.A07;
            c70116W4o.A00(str);
            c70116W4o.A04 = i;
            c70116W4o.A0G = i2;
            c70116W4o.A0V = c70354WSi.A0E;
            c70116W4o.A0E = c70354WSi.A0C;
            C70130W5r c70130W5r2 = new C70130W5r(c70116W4o);
            c70354WSi.A05 = c70130W5r2;
            c70354WSi.A06.AWZ(c70130W5r2);
        }
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A07 = w4q.A01;
        W4Q.A00(w4q);
        this.A06 = interfaceC72026XFo.F87(w4q.A00, 1);
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A0B = j;
    }
}
