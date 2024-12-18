package com.instagram.direct.send.mutation.armadilloexpresstransport;

import X.AbstractC25225BEi;
import X.AbstractC43594JPz;
import X.C12L;
import X.C19L;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class ArmadilloExpressNoteReplySender {
    public final Context A00;
    public final UserSession A01;
    public final C19L A02;
    public final C12L A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.C44920JuY r9, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r10, X.C33851il r11, X.InterfaceC23621Ds r12) {
        /*
            r7 = r9
            r3 = 43
            boolean r0 = X.MAL.A01(r12, r3)
            if (r0 == 0) goto Lc6
            r5 = r12
            X.MAL r5 = (X.MAL) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc6
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A04
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r9 = 0
            r4 = 1
            if (r0 == 0) goto L91
            if (r0 != r4) goto Lcd
            java.lang.Object r7 = r5.A03
            X.JuY r7 = (X.C44920JuY) r7
            java.lang.Object r11 = r5.A02
            X.1il r11 = (X.C33851il) r11
            java.lang.Object r10 = r5.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r10 = (com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender) r10
            X.AbstractC09560e7.A00(r1)
        L32:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Ld2
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = X.LLT.A03(r1)
            if (r0 == 0) goto L86
            X.K6k r1 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.A00(r0)
            java.lang.String r0 = "image/webp"
            r1.A06(r0)
            X.RYn r1 = r1.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r1
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r0 = com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker.DEFAULT_INSTANCE
            X.RXa r2 = r0.A0I()
            X.K6r r2 = (X.C45384K6r) r2
            r2.A06(r1)
            r2.A09(r4)
            com.instagram.common.session.UserSession r0 = r10.A01
            X.7Cz r1 = X.AbstractC159387Cy.A01(r0, r11)
            X.7Cz r0 = X.EnumC159397Cz.A05
            if (r1 != r0) goto L75
            X.6ly r0 = r11.A00
            if (r0 == 0) goto Ld3
            java.lang.String r0 = r0.A0S
            r2.A07(r0)
            X.6ly r0 = r11.A00
            if (r0 == 0) goto Ld3
            java.lang.String r0 = r0.A0a
            r2.A08(r0)
        L75:
            com.instagram.direct.armadilloexpress.transportpayload.Media r0 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE
            X.RXa r0 = r0.A0I()
            X.K6n r0 = (X.C45380K6n) r0
            r0.A06(r2)
            X.RYn r9 = r0.A02()
            com.instagram.direct.armadilloexpress.transportpayload.Media r9 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r9
        L86:
            X.LGK r6 = X.LGK.A00
            com.instagram.common.session.UserSession r8 = r10.A01
            r10 = 0
            r12 = r10
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r6 = r6.A00(r7, r8, r9, r10, r11, r12)
            return r6
        L91:
            X.AbstractC09560e7.A00(r1)
            X.6ly r0 = r11.A00
            if (r0 == 0) goto Ld3
            com.instagram.common.typedurl.ImageUrl r3 = r0.A0H
            X.C14360o3.A07(r3)
            X.1No r2 = X.C25821No.A00()
            com.instagram.common.session.UserSession r1 = r10.A01
            java.lang.String r0 = "SendReceiverFetchXma"
            X.3Pe r0 = r2.A0K(r1, r3, r0)
            if (r0 == 0) goto Ld2
            android.graphics.Bitmap r2 = r0.A01
            if (r2 == 0) goto Ld2
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            r5.A01 = r10
            r5.A02 = r11
            r5.A03 = r7
            r5.A00 = r4
            java.lang.Object r1 = A00(r2, r10, r5, r1, r0)
            if (r1 != r6) goto L32
            return r6
        Lc6:
            X.MAL r5 = new X.MAL
            r5.<init>(r10, r12, r3)
            goto L17
        Lcd:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Ld2:
            return r9
        Ld3:
            java.lang.String r0 = "avatarSticker"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender.A02(X.JuY, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender, X.1il, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.graphics.Bitmap r10, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r11, X.InterfaceC23621Ds r12, int r13, int r14) {
        /*
            r4 = 40
            boolean r0 = X.MAF.A01(r12, r4)
            if (r0 == 0) goto L7d
            r1 = r12
            X.MAF r1 = (X.MAF) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L7d
            int r3 = r3 - r2
            r1.A00 = r3
        L16:
            java.lang.Object r4 = r1.A02
            X.1JX r3 = X.C1JX.A02
            int r5 = r1.A00
            r0 = 0
            r2 = 1
            if (r5 == 0) goto L30
            if (r5 != r2) goto L83
            java.lang.Object r9 = r1.A01
            X.47Z r9 = (X.C47Z) r9
            X.AbstractC09560e7.A00(r4)
        L29:
            boolean r1 = r4 instanceof X.NRL
            if (r1 == 0) goto L2f
            java.lang.String r0 = r9.A2N
        L2f:
            return r0
        L30:
            X.AbstractC09560e7.A00(r4)
            java.lang.String r4 = X.AbstractC43593JPy.A0x()
            X.47Z r9 = X.AbstractC209399Nx.A01(r4)
            android.content.Context r7 = r11.A00
            java.io.File r6 = X.AbstractC13530mf.A04(r7)
            X.C14360o3.A07(r6)
            r6.deleteOnExit()
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG
            r4 = 100
            X.C1NC.A0L(r5, r10, r6, r4)
            java.lang.String r4 = X.AbstractC43592JPx.A0x(r6)
            r9.A33 = r4
            r9.A0S = r13
            r9.A0R = r14
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader r4 = com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader.A00
            com.instagram.common.session.UserSession r8 = r11.A01
            X.3Du r10 = X.C70343Ds.A00(r7, r8)
            X.1CM r12 = new X.1CM
            r12.<init>(r7)
            java.lang.String r13 = "ArmadilloExpressNoteReplySender"
            X.Luy r11 = X.C49545Luy.A00
            X.0sk r14 = X.AbstractC06930Yk.A0E()
            X.OXD r6 = new X.OXD
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A01 = r9
            r1.A00 = r2
            java.lang.Object r4 = r4.A00(r6, r1)
            if (r4 != r3) goto L29
            return r3
        L7d:
            X.MAF r1 = new X.MAF
            r1.<init>(r11, r12, r4)
            goto L16
        L83:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender.A00(android.graphics.Bitmap, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender, X.1Ds, int, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C44920JuY r15, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r16, X.C33811ih r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender.A01(X.JuY, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender, X.1ih, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender r8, java.lang.String r9, X.InterfaceC23621Ds r10, int r11, int r12, boolean r13) {
        /*
            r4 = 39
            boolean r0 = X.MAF.A01(r10, r4)
            if (r0 == 0) goto L6a
            r0 = r10
            X.MAF r0 = (X.MAF) r0
            int r3 = r0.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L6a
            int r3 = r3 - r2
            r0.A00 = r3
        L16:
            java.lang.Object r3 = r0.A02
            X.1JX r1 = X.C1JX.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L2f
            if (r4 != r2) goto L72
            java.lang.Object r7 = r0.A01
            X.47Z r7 = (X.C47Z) r7
            X.AbstractC09560e7.A00(r3)
        L28:
            boolean r0 = r3 instanceof X.NRL
            if (r0 == 0) goto L70
            java.lang.String r1 = r7.A2N
            return r1
        L2f:
            X.AbstractC09560e7.A00(r3)
            X.47Z r7 = X.AbstractC43594JPz.A0i()
            X.1tc r3 = X.EnumC40111tc.A06
            r7.A0T(r3)
            r7.A33 = r9
            r7.A0S = r12
            r7.A0R = r11
            r7.A57 = r13
            com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader r3 = com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader.A00
            android.content.Context r5 = r8.A00
            com.instagram.common.session.UserSession r6 = r8.A01
            X.3Du r8 = X.C70343Ds.A00(r5, r6)
            X.1CM r10 = new X.1CM
            r10.<init>(r5)
            java.lang.String r11 = "ArmadilloExpressNoteReplySender"
            X.Luy r9 = X.C49545Luy.A00
            X.0sk r12 = X.AbstractC06930Yk.A0E()
            X.OXD r4 = new X.OXD
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.A01 = r7
            r0.A00 = r2
            java.lang.Object r3 = r3.A00(r4, r0)
            if (r3 != r1) goto L28
            return r1
        L6a:
            X.MAF r0 = new X.MAF
            r0.<init>(r8, r10, r4)
            goto L16
        L70:
            r1 = 0
            return r1
        L72:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender.A03(com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender, java.lang.String, X.1Ds, int, int, boolean):java.lang.Object");
    }

    public ArmadilloExpressNoteReplySender(UserSession userSession) {
        this.A01 = userSession;
        C12L c12l = C12L.A00;
        this.A03 = c12l;
        this.A02 = AbstractC43594JPz.A13(c12l, 319);
        this.A00 = AbstractC25225BEi.A0F(userSession);
    }
}
