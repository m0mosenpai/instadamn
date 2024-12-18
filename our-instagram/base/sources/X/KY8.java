package X;

/* loaded from: classes8.dex */
public final class KY8 extends C74P {
    public final L8Q A00;
    public final String A01;
    public final boolean A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KY8(android.content.Context r18, com.instagram.common.session.UserSession r19, X.C148286ly r20, boolean r21) {
        /*
            r17 = this;
            r7 = r19
            boolean r2 = X.AbstractC167007dF.A1V(r7)
            r5 = r20
            com.instagram.common.typedurl.ImageUrl r0 = r5.A0H
            java.lang.String r10 = X.AbstractC43592JPx.A0w(r0)
            java.lang.String r11 = r5.A0S
            X.C14360o3.A07(r11)
            r6 = r18
            int r0 = X.AbstractC43594JPz.A04(r6)
            float r13 = (float) r0
            float r1 = r5.A01
            float r0 = r5.A00
            float r4 = r1 / r0
            float r0 = X.AbstractC13880nE.A00(r6, r1)
            int r3 = (int) r0
            float r0 = r5.A00
            float r0 = X.AbstractC13880nE.A00(r6, r0)
            int r1 = (int) r0
            r16 = 0
            r12 = 0
            r0 = -1
            X.74V r8 = X.C74U.A00(r4, r3, r1, r0)
            r0 = 2130971278(0x7f040a8e, float:1.755129E38)
            int r14 = X.AbstractC167007dF.A09(r6, r0)
            r0 = 2130971277(0x7f040a8d, float:1.7551288E38)
            int r15 = X.AbstractC167007dF.A09(r6, r0)
            java.lang.Integer r9 = X.C05F.A01
            r5 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = r21
            r5.A02 = r3
            java.lang.String r1 = X.AbstractC167017dG.A0j()
            r5.A01 = r1
            X.L8Q r0 = X.C50252MHh.A00(r7)
            r5.A00 = r0
            if (r21 == 0) goto L5e
            r0.A01(r1, r2)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KY8.<init>(android.content.Context, com.instagram.common.session.UserSession, X.6ly, boolean):void");
    }

    @Override // X.C74P, X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        AbstractC167017dG.A1N(str, xec);
        C14360o3.A0B(str2, 2);
        super.DQ3(xec, str, str2);
        if (this.A02) {
            L8Q l8q = this.A00;
            String str3 = this.A01;
            C14360o3.A0B(str3, 0);
            l8q.A00.markerEnd(944511429, str3.hashCode(), (short) 2);
        }
    }

    @Override // X.C74P, X.C74M
    public final void onError(String str) {
        super.onError(str);
        if (this.A02) {
            L8Q l8q = this.A00;
            String str2 = this.A01;
            C14360o3.A0B(str2, 0);
            JQ0.A1G(l8q.A00, "error", "Failed to load animated sticker", 944511429, str2.hashCode());
        }
    }
}
