package com.instagram.settings2.extension.customstorage.savestorytogallery;

import X.AbstractC166987dD;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.C38687GzS;
import X.C3NX;
import X.InterfaceC23621Ds;
import X.InterfaceC58071Pow;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class SaveStoryToGalleryCustomStorageHandler implements InterfaceC58071Pow {
    public final UserSession A00;
    public final NetworkInteractor A01;

    /* loaded from: classes9.dex */
    public final class NetworkInteractor {
        public final UserSession A00;

        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A00(X.InterfaceC23621Ds r7, boolean r8) {
            /*
                r6 = this;
                r3 = 44
                boolean r0 = X.PXC.A03(r7, r3)
                if (r0 == 0) goto L77
                r4 = r7
                X.PXC r4 = (X.PXC) r4
                int r2 = r4.A00
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L77
                int r2 = r2 - r1
                r4.A00 = r2
            L16:
                java.lang.Object r1 = r4.A01
                X.1JX r5 = X.C1JX.A02
                int r0 = r4.A00
                r3 = 1
                if (r0 == 0) goto L44
                if (r0 != r3) goto L7c
                X.AbstractC09560e7.A00(r1)
            L24:
                X.3NY r1 = (X.C3NY) r1
                boolean r0 = r1 instanceof X.C3NX
                if (r0 == 0) goto L3b
                X.3NX r1 = (X.C3NX) r1
                java.lang.Object r0 = r1.A00
                X.XZE r0 = (X.XZE) r0
                X.Mr8 r0 = r0.F7f()
                boolean r0 = r0.A02
                X.3NX r1 = X.AbstractC25235BEs.A0f(r0)
            L3a:
                return r1
            L3b:
                boolean r0 = r1 instanceof X.C194848jk
                if (r0 != 0) goto L3a
                X.B4Z r0 = X.B4Z.A00()
                throw r0
            L44:
                X.AbstractC09560e7.A00(r1)
                com.instagram.common.session.UserSession r0 = r6.A00
                X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
                java.lang.String r0 = "settings/set_bool/"
                r2.A0B(r0)
                java.lang.Class<X.XZE> r1 = X.XZE.class
                java.lang.Class<X.XqL> r0 = X.C72886XqL.class
                r2.A0R(r1, r0)
                com.instagram.api.schemas.RemoteBooleanSettingId r0 = com.instagram.api.schemas.RemoteBooleanSettingId.A0H
                java.lang.String r1 = r0.A00
                java.lang.String r0 = "setting_id"
                r2.A9s(r0, r1)
                java.lang.String r0 = "value"
                r2.A0I(r0, r8)
                X.1ON r1 = r2.A0N()
                r4.A00 = r3
                r0 = 351963398(0x14fa8906, float:2.5297595E-26)
                java.lang.Object r1 = r1.A00(r0, r4)
                if (r1 != r5) goto L24
                return r5
            L77:
                X.PXC r4 = X.PXC.A00(r6, r7, r3)
                goto L16
            L7c:
                java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler.NetworkInteractor.A00(X.1Ds, boolean):java.lang.Object");
        }

        public NetworkInteractor(UserSession userSession) {
            this.A00 = userSession;
        }
    }

    public /* synthetic */ SaveStoryToGalleryCustomStorageHandler(UserSession userSession) {
        NetworkInteractor networkInteractor = new NetworkInteractor(userSession);
        this.A00 = userSession;
        this.A01 = networkInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r6, boolean r7) {
        /*
            r5 = this;
            r4 = 8
            boolean r0 = X.C57146PWy.A01(r6, r4)
            if (r0 == 0) goto L66
            r3 = r6
            X.PWy r3 = (X.C57146PWy) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r4 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L54
            if (r0 != r1) goto L6c
            java.lang.Object r3 = r3.A01
            com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler r3 = (com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler) r3
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L4b
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r2 = r4.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1Ai r0 = X.AbstractC23021Ah.A00(r0)
            r0.A1F(r1)
            X.GzS r0 = new X.GzS
            r0.<init>(r2)
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
        L4a:
            return r4
        L4b:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L4a
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L54:
            X.AbstractC09560e7.A00(r4)
            com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler$NetworkInteractor r0 = r5.A01
            r3.A01 = r5
            r3.A00 = r1
            java.lang.Object r4 = r0.A00(r3, r7)
            if (r4 != r2) goto L64
            return r2
        L64:
            r3 = r5
            goto L28
        L66:
            X.PWy r3 = new X.PWy
            r3.<init>(r5, r6, r4)
            goto L16
        L6c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler.A00(X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC58071Pow
    public final C3NX Btx(InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC25225BEi.A0z(new C38687GzS(Boolean.valueOf(AbstractC23021Ah.A00(this.A00).A1j())));
    }

    @Override // X.InterfaceC58071Pow
    public final /* bridge */ /* synthetic */ Object FC8(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return A00(interfaceC23621Ds, AbstractC166987dD.A1a(obj));
    }
}
