package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class Wm4 implements C5NL {
    public EnumC209229Ne A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    public Wm4(EnumC209229Ne enumC209229Ne, Integer num, String str, String str2, String str3, List list, List list2, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        AbstractC25233BEq.A0y(6, list, str3, enumC209229Ne);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = num;
        this.A07 = z;
        this.A08 = z2;
        this.A06 = list;
        this.A05 = list2;
        this.A02 = str3;
        this.A00 = enumC209229Ne;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A06;
        c5ng.A06 = C148276lx.A1G.A01();
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0J;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Wm4() {
        /*
            r10 = this;
            r2 = 0
            java.lang.String r3 = ""
            r8 = 0
            X.0sl r6 = X.C16930sl.A00
            java.util.ArrayList r1 = X.A4H.A03
            int r0 = r1.size()
            if (r0 <= 0) goto L1d
            java.lang.Object r1 = r1.get(r8)
        L12:
            X.9Ne r1 = (X.EnumC209229Ne) r1
            r0 = r10
            r4 = r2
            r5 = r3
            r7 = r2
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L1d:
            X.9Ne r1 = X.EnumC209229Ne.A0B
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Wm4.<init>():void");
    }
}
