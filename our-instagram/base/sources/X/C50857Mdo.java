package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Mdo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50857Mdo extends C9U7 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final ImageUrl A02;
    public final String A03;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if (r4.A00.A00 == null) goto L11;
     */
    @Override // X.C9U7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC52922bZ A02(X.C152406tQ r19, java.lang.Class r20, java.lang.String r21) {
        /*
            r18 = this;
            r1 = r19
            r2 = r20
            r0 = r21
            boolean r3 = X.AbstractC25233BEq.A1b(r0, r2, r1)
            java.lang.String r0 = "formID"
            java.lang.Object r9 = r1.A00(r0)
            if (r9 == 0) goto L75
            java.lang.String r9 = (java.lang.String) r9
            X.OVX r0 = X.OVX.A01
            X.OLJ r4 = r0.A00(r9)
            r0 = r18
            com.instagram.common.session.UserSession r6 = r0.A01
            X.0iw r5 = r0.A00
            java.lang.String r2 = "adID"
            java.lang.Object r7 = r1.A00(r2)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r2 = "trackingToken"
            java.lang.Object r8 = r1.A00(r2)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r2 = "ad_creation_source"
            java.lang.String r10 = X.AbstractC50522MSa.A0h(r1, r2)
            if (r10 != 0) goto L3a
            java.lang.String r10 = "UNKNOWN"
        L3a:
            java.lang.String r11 = X.AbstractC50523MSb.A0S(r1)
            boolean r14 = X.C55226Oet.A08(r4)
            if (r4 == 0) goto L73
            boolean r15 = r4.A02()
            X.Vny r2 = r4.A00
            X.MtY r2 = r2.A00
            r16 = 1
            if (r2 != 0) goto L52
        L50:
            r16 = 0
        L52:
            java.lang.String r2 = "is_form_extension"
            java.lang.Object r2 = r1.A00(r2)
            boolean r17 = X.AbstractC166997dE.A1Z(r2, r3)
            java.lang.String r2 = "advertiser_fbidv2"
            java.lang.Object r12 = r1.A00(r2)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = r0.A03
            X.P4V r4 = new X.P4V
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.typedurl.ImageUrl r2 = r0.A02
            X.NOV r0 = new X.NOV
            r0.<init>(r1, r6, r2, r4)
            return r0
        L73:
            r15 = 0
            goto L50
        L75:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50857Mdo.A02(X.6tQ, java.lang.Class, java.lang.String):X.2bZ");
    }

    public C50857Mdo(Context context, Bundle bundle, InterfaceC08430c6 interfaceC08430c6, InterfaceC11380iw interfaceC11380iw) {
        super(bundle, interfaceC08430c6);
        ExtendedImageUrl extendedImageUrl;
        this.A00 = interfaceC11380iw;
        UserSession A0G = AbstractC31171DnF.A0G(bundle);
        this.A01 = A0G;
        this.A03 = C55226Oet.A03(bundle);
        C38321qM A0h = AbstractC25229BEm.A0h(A0G, bundle.getString("mediaID"));
        if (A0h != null) {
            extendedImageUrl = A0h.A1q(context);
        } else {
            extendedImageUrl = null;
        }
        this.A02 = extendedImageUrl;
    }
}
