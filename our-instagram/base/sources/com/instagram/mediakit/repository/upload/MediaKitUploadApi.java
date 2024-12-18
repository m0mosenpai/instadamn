package com.instagram.mediakit.repository.upload;

import X.AbstractC43594JPz;
import X.C12L;
import X.C14360o3;
import X.C19L;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MediaKitUploadApi {
    public final UserSession A00;
    public final C19L A01;

    public MediaKitUploadApi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC43594JPz.A13(C12L.A00, 2010364072);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.E71 r14, com.instagram.mediakit.repository.upload.MediaKitUploadApi r15, X.C40121td r16, X.InterfaceC23621Ds r17) {
        /*
            r3 = 6
            r4 = r17
            boolean r0 = X.PX6.A02(r4, r3)
            if (r0 == 0) goto Ld4
            r6 = r4
            X.PX6 r6 = (X.PX6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld4
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r1 = r6.A04
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 != r3) goto Ldb
            X.AbstractC09560e7.A00(r1)
        L25:
            return r1
        L26:
            X.AbstractC09560e7.A00(r1)
            java.lang.Object r5 = r14.A01
            com.instagram.common.gallery.Medium r5 = (com.instagram.common.gallery.Medium) r5
            java.lang.String r11 = r5.A0X
            java.lang.String r1 = r14.A02
            boolean r0 = r5.Cff()
            r7 = 0
            X.C14360o3.A0B(r1, r7)
            X.47Z r2 = new X.47Z
            r2.<init>(r1)
            if (r0 == 0) goto Ld0
            X.1tc r0 = X.EnumC40111tc.A0a
        L42:
            r2.A1G = r0
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0L
            r2.A0c(r0)
            boolean r0 = r5.Cff()
            if (r0 == 0) goto Lc5
            int r0 = r5.A03
            long r12 = (long) r0
            com.instagram.common.session.UserSession r10 = r15.A00
            X.0Tz r8 = X.C06090Tz.A05
            r0 = 36597742747913185(0x82057400120be1, double:3.207898108837267E-306)
            int r0 = X.AbstractC25225BEi.A07(r8, r10, r0)
            long r14 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r0
            com.instagram.pendingmedia.model.ClipInfo r10 = X.MY3.A03(r10, r11, r12, r14)
        L67:
            int r9 = r10.A09
            float r8 = (float) r9
            int r1 = r10.A06
            float r0 = (float) r1
            float r8 = r8 / r0
            r10.A00 = r8
            r2.A33 = r11
            r2.A3L = r11
            r2.A02 = r8
            r2.A0H = r9
            r2.A0G = r1
            r2.A0K = r7
            r2.A1N = r10
            boolean r0 = r5.Cff()
            if (r0 == 0) goto La5
            java.lang.String r0 = r5.A0a
            r2.A33 = r0
            java.util.List r0 = X.AbstractC166987dD.A1J(r10)
            r2.A4G = r0
            java.util.HashMap r0 = X.MY4.A03(r11)
            r2.A44 = r0
            java.io.File r0 = X.AbstractC166987dD.A11(r11)
            java.io.File r0 = r0.getParentFile()
            r0.getClass()
            java.lang.String r0 = r0.getName()
            r2.A3w = r0
        La5:
            r7 = r16
            X.PX6.A00(r7, r2, r5, r6, r3)
            X.3yw r1 = X.JQ0.A0r(r6)
            boolean r0 = r5.Cff()
            if (r0 == 0) goto Lc1
            r7.A0D(r2)
        Lb7:
            r7.A0G(r2, r3, r3)
            java.lang.Object r1 = r1.A00()
            if (r1 != r4) goto L25
            return r4
        Lc1:
            r7.A0C(r2)
            goto Lb7
        Lc5:
            com.instagram.pendingmedia.model.ClipInfo r10 = X.AbstractC50522MSa.A0a(r5)
            float r0 = r5.A00()
            r10.A00 = r0
            goto L67
        Ld0:
            X.1tc r0 = X.EnumC40111tc.A0Q
            goto L42
        Ld4:
            X.PX6 r6 = new X.PX6
            r6.<init>(r15, r4, r3)
            goto L17
        Ldb:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.upload.MediaKitUploadApi.A00(X.E71, com.instagram.mediakit.repository.upload.MediaKitUploadApi, X.1td, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C40121td r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r11 = this;
            r3 = 5
            boolean r0 = X.PX6.A02(r14, r3)
            if (r0 == 0) goto L5b
            r4 = r14
            X.PX6 r4 = (X.PX6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A04
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r9 = 1
            if (r0 == 0) goto L24
            if (r0 != r9) goto L61
            X.AbstractC09560e7.A00(r1)
        L23:
            return r1
        L24:
            X.AbstractC09560e7.A00(r1)
            r5 = r12
            X.PX6.A00(r11, r13, r12, r4, r9)
            X.3yw r2 = X.JQ0.A0r(r4)
            com.instagram.common.session.UserSession r0 = r11.A00
            X.47Z r1 = X.AbstractC43593JPy.A0h(r0, r13)
            if (r1 != 0) goto L42
            r0 = 0
            r2.resumeWith(r0)
        L3b:
            java.lang.Object r1 = r2.A00()
            if (r1 != r3) goto L23
            return r3
        L42:
            java.lang.String r6 = r1.A35
            r7 = 0
            r8 = 0
            r10 = r8
            r5.A0K(r6, r7, r8, r9, r10)
            X.P6d r0 = new X.P6d
            r0.<init>(r1, r12, r2)
            r12.A0H(r0)
            X.1tu r0 = new X.1tu
            r0.<init>()
            r12.A0E(r1, r0, r7)
            goto L3b
        L5b:
            X.PX6 r4 = new X.PX6
            r4.<init>(r11, r14, r3)
            goto L15
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.upload.MediaKitUploadApi.A01(X.1td, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C40121td r13, java.util.List r14, X.InterfaceC23621Ds r15) {
        /*
            r12 = this;
            r3 = 5
            boolean r0 = X.C57145PWx.A02(r15, r3)
            r9 = r12
            if (r0 == 0) goto L68
            r4 = r15
            X.PWx r4 = (X.C57145PWx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L3f
            if (r0 != r3) goto L70
            java.lang.Object r1 = r4.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.AbstractC09560e7.A00(r2)
        L28:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r1.next()
            X.2Sb r0 = (X.InterfaceC50122Sb) r0
            r4.A01 = r1
            r4.A00 = r3
            java.lang.Object r0 = X.MSW.A11(r0, r4)
            if (r0 != r5) goto L28
            return r5
        L3f:
            X.AbstractC09560e7.A00(r2)
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r14)
            java.util.Iterator r1 = r14.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r8 = r1.next()
            X.19L r0 = r12.A01
            r10 = 0
            r11 = 28
            X.PZP r6 = new X.PZP
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            X.MSY.A1P(r2, r6, r0)
            goto L4a
        L63:
            java.util.Iterator r1 = r2.iterator()
            goto L28
        L68:
            X.PWx r4 = X.C57145PWx.A00(r12, r15, r3)
            goto L16
        L6d:
            X.0eB r5 = X.C0eB.A00
            return r5
        L70:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.repository.upload.MediaKitUploadApi.A02(X.1td, java.util.List, X.1Ds):java.lang.Object");
    }
}
