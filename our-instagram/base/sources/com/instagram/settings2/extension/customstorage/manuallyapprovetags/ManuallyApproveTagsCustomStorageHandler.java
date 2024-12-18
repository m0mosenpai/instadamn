package com.instagram.settings2.extension.customstorage.manuallyapprovetags;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C17060sy;
import X.C38687GzS;
import X.C3NX;
import X.InterfaceC23621Ds;
import X.InterfaceC58071Pow;
import X.O5Z;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ManuallyApproveTagsCustomStorageHandler implements InterfaceC58071Pow {
    public final UserSession A00;
    public final O5Z A01;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r6, boolean r7) {
        /*
            r5 = this;
            r3 = 6
            boolean r0 = X.MUF.A00(r6, r3)
            if (r0 == 0) goto La5
            r4 = r6
            X.MUF r4 = (X.MUF) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r2 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L73
            if (r0 != r1) goto Lb1
            boolean r7 = r4.A04
            java.lang.Object r4 = r4.A01
            com.instagram.settings2.extension.customstorage.manuallyapprovetags.ManuallyApproveTagsCustomStorageHandler r4 = (com.instagram.settings2.extension.customstorage.manuallyapprovetags.ManuallyApproveTagsCustomStorageHandler) r4
            X.AbstractC09560e7.A00(r2)
        L29:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L6a
            com.instagram.common.session.UserSession r0 = r4.A00
            X.18A r3 = X.AnonymousClass189.A00(r0)
            com.instagram.user.model.User r2 = X.AbstractC166987dD.A10(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            X.17P r0 = r2.A03
            r0.Ege(r1)
            r3.A03(r2)
            X.GzS r0 = new X.GzS
            r0.<init>(r1)
            X.3NX r2 = X.AbstractC25225BEi.A0z(r0)
        L4c:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L69
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto Lac
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r4.A00
            com.instagram.user.model.User r0 = r1.A01(r0)
            java.lang.Boolean r1 = X.AbstractC31172DnG.A0s(r7)
            X.17P r0 = r0.A03
            r0.Ege(r1)
            X.8jk r2 = X.AbstractC25227BEk.A0h()
        L69:
            return r2
        L6a:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L4c
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L73:
            X.AbstractC09560e7.A00(r2)
            X.O5Z r0 = r5.A01
            r4.A01 = r5
            r4.A04 = r7
            r4.A00 = r1
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "usertags/review_preference/"
            r2.A0B(r0)
            X.AbstractC31173DnH.A1N(r2)
            if (r7 == 0) goto La0
            java.lang.String r1 = "1"
        L90:
            java.lang.String r0 = "enabled"
            X.1ON r1 = X.MSY.A0I(r2, r0, r1)
            r0 = 351963398(0x14fa8906, float:2.5297595E-26)
            java.lang.Object r2 = r1.A00(r0, r4)
            if (r2 != r3) goto La3
            return r3
        La0:
            java.lang.String r1 = "0"
            goto L90
        La3:
            r4 = r5
            goto L29
        La5:
            X.MUF r4 = new X.MUF
            r4.<init>(r5, r6, r3)
            goto L15
        Lac:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.extension.customstorage.manuallyapprovetags.ManuallyApproveTagsCustomStorageHandler.A00(X.1Ds, boolean):java.lang.Object");
    }

    public /* synthetic */ ManuallyApproveTagsCustomStorageHandler(UserSession userSession) {
        O5Z o5z = new O5Z(userSession);
        this.A00 = userSession;
        this.A01 = o5z;
    }

    @Override // X.InterfaceC58071Pow
    public final C3NX Btx(InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC25225BEi.A0z(new C38687GzS(Boolean.valueOf(C17060sy.A01.A01(this.A00).A1h())));
    }

    @Override // X.InterfaceC58071Pow
    public final /* bridge */ /* synthetic */ Object FC8(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return A00(interfaceC23621Ds, AbstractC166987dD.A1a(obj));
    }
}
