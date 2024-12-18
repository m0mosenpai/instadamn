package X;

import java.util.List;

/* renamed from: X.AeC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23677AeC implements InterfaceC25177BCa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C23677AeC(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A01 = i;
    }

    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        switch (this.A00) {
            case 0:
                C216239hg c216239hg = (C216239hg) this.A05;
                c216239hg.EFh(this);
                C218079kf c218079kf = (C218079kf) this.A02;
                C88Y c88y = c218079kf.A08;
                c88y.A0C(c216239hg, AMV.A01(), true);
                C218079kf.A01(c218079kf);
                C38321qM c38321qM = (C38321qM) this.A03;
                C218079kf.A02(c218079kf, c38321qM);
                AA0 A00 = C88Y.A00(c88y, c38321qM);
                A00.A03 = C218079kf.A00(c218079kf.A03, c216239hg.A01.A01, c218079kf.A07);
                c218079kf.A01.add(A00);
                C218079kf.A03(c218079kf, (List) this.A04, this.A01 + 1);
                return;
            case 1:
                C216239hg c216239hg2 = (C216239hg) this.A04;
                c216239hg2.EFh(this);
                C218099kh c218099kh = (C218099kh) this.A05;
                C88Y c88y2 = c218099kh.A0B;
                c88y2.A0C(c216239hg2, AMV.A01(), true);
                C218099kh.A00(c218099kh);
                C38321qM c38321qM2 = (C38321qM) this.A02;
                String id = c38321qM2.getId();
                if (id != null) {
                    C199008r1 A03 = c88y2.A03(null, id);
                    C14360o3.A07(A03);
                    String id2 = c38321qM2.getId();
                    if (id2 != null) {
                        AA0 aa0 = new AA0(A03, id2);
                        aa0.A00 = c218099kh.A00;
                        List list = (List) this.A03;
                        int i = this.A01;
                        if (c218099kh.A04) {
                            c218099kh.A03.add(aa0);
                            i++;
                        } else {
                            c218099kh.A04 = true;
                        }
                        C218099kh.A03(c218099kh, list, i);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            default:
                ((C5RP) this.A03).EFh(this);
                C218099kh c218099kh2 = (C218099kh) this.A05;
                C88Y c88y3 = c218099kh2.A0B;
                c88y3.A08(c218099kh2.A01);
                C38321qM c38321qM3 = (C38321qM) this.A02;
                String id3 = c38321qM3.getId();
                if (id3 != null) {
                    C199008r1 A032 = c88y3.A03(null, id3);
                    C14360o3.A07(A032);
                    String id4 = c38321qM3.getId();
                    if (id4 != null) {
                        AA0 aa02 = new AA0(A032, id4);
                        aa02.A00 = c218099kh2.A00;
                        c218099kh2.A03.add(aa02);
                        C218099kh.A03(c218099kh2, (List) this.A04, this.A01 + 1);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
    }
}
