package X;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class WSZ implements XE2 {
    public XG2 A00;
    public W3F A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public long A06;
    public final C69539Vr3 A0B;
    public final boolean[] A0C = new boolean[3];
    public final C69768Vv5 A0A = new C69768Vv5(7);
    public final C69768Vv5 A08 = new C69768Vv5(8);
    public final C69768Vv5 A09 = new C69768Vv5(6);
    public long A05 = -9223372036854775807L;
    public final WFa A07 = new WFa();

    @Override // X.XE2
    public final void AJY(WFa wFa) {
        XG2 xg2 = this.A00;
        WDn.A00(xg2);
        int i = wFa.A01;
        int i2 = i;
        int i3 = wFa.A00;
        byte[] bArr = wFa.A02;
        int i4 = i3 - i;
        this.A06 += i4;
        xg2.ELL(wFa, i4);
        while (true) {
            int A01 = WFG.A01(bArr, this.A0C, i, i3);
            if (A01 == i3) {
                break;
            }
            i = A01 + 3;
            int i5 = bArr[i] & 31;
            int i6 = A01 - i2;
            if (i6 > 0) {
                if (!this.A03) {
                    this.A0A.A01(bArr, i2, A01);
                    this.A08.A01(bArr, i2, A01);
                }
                this.A09.A01(bArr, i2, A01);
            }
            int i7 = i3 - A01;
            long j = this.A06 - i7;
            int i8 = 0;
            if (i6 < 0) {
                i8 = -i6;
            }
            long j2 = this.A05;
            if (!this.A03) {
                C69768Vv5 c69768Vv5 = this.A0A;
                c69768Vv5.A02(i8);
                C69768Vv5 c69768Vv52 = this.A08;
                c69768Vv52.A02(i8);
                if (c69768Vv5.A01 && c69768Vv52.A01) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(c69768Vv5.A03, c69768Vv5.A00));
                    arrayList.add(Arrays.copyOf(c69768Vv52.A03, c69768Vv52.A00));
                    C69455Vne A03 = WFG.A03(c69768Vv5.A03, 4, c69768Vv5.A00);
                    C70173WEv c70173WEv = new C70173WEv(c69768Vv52.A03, 4, c69768Vv52.A00);
                    int A00 = C70173WEv.A00(c70173WEv);
                    C70173WEv.A00(c70173WEv);
                    c70173WEv.A04();
                    c70173WEv.A04();
                    C68649VZh c68649VZh = new C68649VZh(A00);
                    String format = String.format("avc1.%02X%02X%02X", AbstractC58320PtC.A1a(Integer.valueOf(A03.A0A), A03.A06, A03.A08));
                    XG2 xg22 = this.A00;
                    C70116W4o c70116W4o = new C70116W4o();
                    c70116W4o.A0T = this.A02;
                    c70116W4o.A00("video/avc");
                    c70116W4o.A0R = format;
                    c70116W4o.A0L = A03.A0C;
                    c70116W4o.A09 = A03.A07;
                    c70116W4o.A0N = new C70171WEr(null, A03.A04, A03.A03, A03.A05, A03.A02 + 8, A03.A01 + 8);
                    c70116W4o.A01 = A03.A00;
                    c70116W4o.A0X = arrayList;
                    c70116W4o.A0B = A03.A09;
                    XG2.A00(c70116W4o, xg22);
                    this.A03 = true;
                    W3F w3f = this.A01;
                    w3f.A0A.append(A03.A0B, A03);
                    w3f.A09.append(c68649VZh.A00, c68649VZh);
                    c69768Vv5.A02 = false;
                    c69768Vv5.A01 = false;
                    c69768Vv52.A02 = false;
                    c69768Vv52.A01 = false;
                }
            }
            C69768Vv5 c69768Vv53 = this.A09;
            if (c69768Vv53.A02(i8)) {
                int A002 = WFG.A00(c69768Vv53.A03, c69768Vv53.A00);
                WFa wFa2 = this.A07;
                wFa2.A0Q(c69768Vv53.A03, A002);
                wFa2.A0O(4);
                AbstractC69806Vvs.A00(wFa2, this.A0B.A00, j2);
            }
            W3F w3f2 = this.A01;
            boolean z = this.A03;
            if (w3f2.A00 == 9) {
                if (z && w3f2.A06) {
                    W3F.A00(w3f2, i7 + ((int) (j - w3f2.A01)));
                }
                w3f2.A03 = w3f2.A01;
                w3f2.A04 = w3f2.A02;
                w3f2.A07 = false;
                w3f2.A06 = true;
            }
            boolean z2 = w3f2.A05;
            boolean z3 = w3f2.A07;
            int i9 = w3f2.A00;
            boolean z4 = true;
            if (i9 != 5 && (!z2 || i9 != 1)) {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            w3f2.A07 = z5;
            if (z5) {
                this.A04 = false;
            }
            long j3 = this.A05;
            if (!this.A03) {
                this.A0A.A00(i5);
                this.A08.A00(i5);
            }
            c69768Vv53.A00(i5);
            W3F w3f3 = this.A01;
            boolean z6 = this.A04;
            w3f3.A00 = i5;
            w3f3.A02 = j3;
            w3f3.A01 = j;
            w3f3.A05 = z6;
            i2 = i;
        }
        if (!this.A03) {
            this.A0A.A01(bArr, i, i3);
            this.A08.A01(bArr, i, i3);
        }
        this.A09.A01(bArr, i, i3);
    }

    @Override // X.XE2
    public final void E3B(boolean z) {
        WDn.A00(this.A00);
        if (z) {
            W3F w3f = this.A01;
            long j = this.A06;
            boolean z2 = w3f.A05;
            boolean z3 = w3f.A07;
            int i = w3f.A00;
            boolean z4 = true;
            if (i != 5 && (!z2 || i != 1)) {
                z4 = false;
            }
            w3f.A07 = z3 | z4;
            w3f.A01 = j;
            W3F.A00(w3f, 0);
            w3f.A06 = false;
        }
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        this.A05 = j;
        this.A04 |= AbstractC167007dF.A1M(i & 2);
    }

    @Override // X.XE2
    public final void EMb() {
        this.A06 = 0L;
        this.A04 = false;
        this.A05 = -9223372036854775807L;
        boolean[] zArr = this.A0C;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        C69768Vv5 c69768Vv5 = this.A0A;
        c69768Vv5.A02 = false;
        c69768Vv5.A01 = false;
        C69768Vv5 c69768Vv52 = this.A08;
        c69768Vv52.A02 = false;
        c69768Vv52.A01 = false;
        C69768Vv5 c69768Vv53 = this.A09;
        c69768Vv53.A02 = false;
        c69768Vv53.A01 = false;
        W3F w3f = this.A01;
        if (w3f != null) {
            w3f.A06 = false;
        }
    }

    public WSZ(C69539Vr3 c69539Vr3) {
        this.A0B = c69539Vr3;
    }

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        w4q.A01();
        W4Q.A00(w4q);
        this.A02 = w4q.A01;
        W4Q.A00(w4q);
        XG2 F87 = interfaceC72026XFo.F87(w4q.A00, 2);
        this.A00 = F87;
        this.A01 = new W3F(F87);
        this.A0B.A00(interfaceC72026XFo, w4q);
    }
}
