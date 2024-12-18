package X;

import java.util.List;

/* renamed from: X.Eai, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32717Eai extends G48 implements InterfaceC66482zP {
    public final int A00;
    public final C59626Qiq A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32717Eai(X.C59626Qiq r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, int r18) {
        /*
            r9 = this;
            r0 = 2
            r8 = r16
            X.AbstractC167007dF.A1J(r11, r0, r8)
            r5 = 0
            if (r10 == 0) goto L3f
            java.lang.String r0 = "igid"
            java.lang.String r4 = r10.A08(r0)
        Lf:
            r2 = r17
            X.2JS r1 = X.AbstractC31176DnK.A0G(r2)
            if (r1 == 0) goto L1d
            java.lang.String r0 = "igid"
            java.lang.String r5 = r1.A08(r0)
        L1d:
            java.lang.Object r0 = X.AbstractC001800i.A0I(r2)
            X.Bg8 r0 = (X.C26079Bg8) r0
            java.lang.String r6 = r0.A04
            r3 = r9
            r7 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            r9.A01 = r10
            r9.A02 = r11
            r9.A03 = r12
            r9.A04 = r13
            r9.A08 = r14
            r9.A06 = r2
            r0 = r18
            r9.A00 = r0
            r9.A07 = r15
            r9.A05 = r8
            return
        L3f:
            r4 = r5
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32717Eai.<init>(X.Qiq, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32717Eai) {
                C32717Eai c32717Eai = (C32717Eai) obj;
                if (!C14360o3.A0K(this.A01, c32717Eai.A01) || this.A02 != c32717Eai.A02 || !C14360o3.A0K(this.A03, c32717Eai.A03) || !C14360o3.A0K(this.A04, c32717Eai.A04) || !C14360o3.A0K(this.A08, c32717Eai.A08) || !C14360o3.A0K(this.A06, c32717Eai.A06) || this.A00 != c32717Eai.A00 || !C14360o3.A0K(this.A07, c32717Eai.A07) || !C14360o3.A0K(this.A05, c32717Eai.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        List list = this.A06;
        String str2 = ((C26079Bg8) AbstractC001800i.A0I(list)).A03;
        C2JS A0G = AbstractC31176DnK.A0G(list);
        if (A0G != null) {
            str = A0G.A07("strong_id__");
        } else {
            str = null;
        }
        return AnonymousClass001.A0R(str2, str);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, AbstractC166997dE.A0K(this.A07, (AbstractC166997dE.A0J(this.A06, ((((((((AbstractC167017dG.A0M(this.A01) * 31) + F2B.A00(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A08)) * 31) + this.A00) * 31));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        List list;
        C32717Eai c32717Eai = (C32717Eai) obj;
        List list2 = this.A06;
        if (c32717Eai != null) {
            list = c32717Eai.A06;
        } else {
            list = null;
        }
        return C14360o3.A0K(list2, list);
    }
}
