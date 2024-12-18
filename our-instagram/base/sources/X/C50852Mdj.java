package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50852Mdj extends C9U7 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r4.A00.A00 == null) goto L13;
     */
    @Override // X.C9U7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC52922bZ A02(X.C152406tQ r21, java.lang.Class r22, java.lang.String r23) {
        /*
            r20 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            boolean r3 = X.AbstractC25233BEq.A1b(r0, r2, r1)
            java.lang.String r6 = "formID"
            java.lang.Object r2 = r1.A00(r6)
            java.lang.String r5 = "Required value was null."
            if (r2 == 0) goto L88
            java.lang.String r2 = (java.lang.String) r2
            X.OVX r0 = X.OVX.A01
            X.OLJ r4 = r0.A00(r2)
            r2 = r20
            com.instagram.common.session.UserSession r8 = r2.A01
            X.0iw r7 = r2.A00
            java.lang.String r0 = "adID"
            java.lang.Object r9 = r1.A00(r0)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "trackingToken"
            java.lang.Object r10 = r1.A00(r0)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.A00(r6)
            if (r11 == 0) goto L83
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "ad_creation_source"
            java.lang.String r12 = X.AbstractC50522MSa.A0h(r1, r0)
            if (r12 != 0) goto L44
            java.lang.String r12 = "UNKNOWN"
        L44:
            java.lang.String r13 = X.AbstractC50523MSb.A0S(r1)
            boolean r16 = X.C55226Oet.A08(r4)
            if (r4 == 0) goto L80
            boolean r17 = r4.A02()
            X.Vny r0 = r4.A00
            X.MtY r0 = r0.A00
            r18 = 1
            if (r0 != 0) goto L5c
        L5a:
            r18 = 0
        L5c:
            java.lang.String r0 = "is_form_extension"
            java.lang.Object r0 = r1.A00(r0)
            boolean r19 = X.AbstractC166997dE.A1Z(r0, r3)
            java.lang.String r0 = "advertiser_fbidv2"
            java.lang.Object r14 = r1.A00(r0)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r2.A02
            X.P4V r6 = new X.P4V
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.instagram.leadads.repository.LeadFormRepository r2 = new com.instagram.leadads.repository.LeadFormRepository
            r2.<init>(r8)
            X.NOX r0 = new X.NOX
            r0.<init>(r1, r8, r6, r2)
            return r0
        L80:
            r17 = 0
            goto L5a
        L83:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r5)
            throw r0
        L88:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50852Mdj.A02(X.6tQ, java.lang.Class, java.lang.String):X.2bZ");
    }

    public C50852Mdj(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, InterfaceC11380iw interfaceC11380iw) {
        super(bundle, interfaceC08430c6);
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC31171DnF.A0G(bundle);
        this.A02 = C55226Oet.A03(bundle);
    }
}
