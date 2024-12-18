package com.instagram.genai.imageservice.upload;

import X.AbstractC166177bl;
import X.AbstractC167017dG;
import X.C47452Kxh;
import X.C51758Mth;
import X.C92674Dc;
import X.C92694De;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class GenAIImageUploadService {
    public final Context A00;
    public final C51758Mth A01;
    public final C47452Kxh A02;
    public final C92694De A03;
    public final UserSession A04;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.genai.imageservice.upload.GenAIImageUploadService r16, java.lang.String r17, X.InterfaceC23621Ds r18, int r19) {
        /*
            r3 = 3
            r4 = r18
            boolean r0 = X.PX9.A03(r4, r3)
            r5 = r16
            if (r0 == 0) goto L96
            r13 = r4
            X.PX9 r13 = (X.PX9) r13
            int r2 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r13.A00 = r2
        L19:
            java.lang.Object r4 = r13.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r13.A00
            r3 = 1
            if (r0 == 0) goto L58
            if (r0 != r3) goto La4
            X.AbstractC09560e7.A00(r4)
        L27:
            X.Nle r4 = (X.AbstractC53512Nle) r4
            boolean r0 = r4 instanceof X.NRT
            r1 = 0
            if (r0 == 0) goto L38
            X.NRT r4 = (X.NRT) r4
            java.lang.String r0 = r4.A00
        L32:
            X.KY5 r2 = new X.KY5
            r2.<init>(r0, r1)
            return r2
        L38:
            boolean r0 = r4 instanceof X.NRU
            if (r0 == 0) goto L43
            X.NRU r4 = (X.NRU) r4
            java.lang.Throwable r1 = r4.A00
            java.lang.String r0 = "Media Upload Failure"
            goto L32
        L43:
            boolean r0 = r4 instanceof X.NRV
            if (r0 == 0) goto L9f
            X.NRV r4 = (X.NRV) r4
            X.W63 r0 = r4.A00
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L55
            X.KY4 r2 = new X.KY4
            r2.<init>(r0)
            return r2
        L55:
            java.lang.String r0 = "Successful response, but missing file handle"
            goto L32
        L58:
            X.AbstractC09560e7.A00(r4)
            java.lang.String r11 = X.AbstractC43593JPy.A0x()
            com.instagram.pendingmedia.service.upload.FbUploaderUtil r6 = com.instagram.pendingmedia.service.upload.FbUploaderUtil.A00
            com.instagram.common.session.UserSession r14 = r5.A04
            X.OVd r0 = new X.OVd
            r0.<init>(r14)
            X.WVG r7 = new X.WVG
            r7.<init>(r0)
            X.Onf r8 = new X.Onf
            r8.<init>()
            X.1tc r1 = X.EnumC40111tc.A0F
            java.lang.String r16 = "ig_sharing_genai"
            X.Mth r0 = r5.A01
            boolean r0 = r0.A01
            r10 = r17
            r18 = r19
            r15 = r11
            r19 = r0
            X.OUc r0 = X.AbstractC54105Nw3.A00(r14, r15, r16, r17, r18, r19)
            X.O8O r9 = new X.O8O
            r9.<init>(r0, r1)
            r13.A00 = r3
            r14 = 0
            java.lang.String r12 = ""
            java.lang.Object r4 = r6.A04(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r4 != r2) goto L27
            return r2
        L96:
            r0 = 42
            X.PX9 r13 = new X.PX9
            r13.<init>(r5, r4, r3, r0)
            goto L19
        L9f:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.upload.GenAIImageUploadService.A00(com.instagram.genai.imageservice.upload.GenAIImageUploadService, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(android.graphics.Bitmap r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r11 = this;
            r10 = 2
            boolean r0 = X.PX9.A03(r14, r10)
            r6 = r11
            if (r0 == 0) goto L45
            r4 = r14
            X.PX9 r4 = (X.PX9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            r9 = 0
            if (r0 == 0) goto L30
            if (r0 != r1) goto L52
            X.AbstractC09560e7.A00(r3)
        L25:
            X.5ud r3 = (X.AbstractC130335ud) r3
            boolean r0 = r3 instanceof X.C130325uc
            if (r0 == 0) goto L4d
            X.5uc r3 = (X.C130325uc) r3
            java.lang.Object r2 = r3.A00
            return r2
        L30:
            X.AbstractC09560e7.A00(r3)
            X.4De r0 = r11.A03
            X.MAX r5 = new X.MAX
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r13, r4, r5)
            if (r3 != r2) goto L25
            return r2
        L45:
            r0 = 42
            X.PX9 r4 = new X.PX9
            r4.<init>(r11, r14, r10, r0)
            goto L16
        L4d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L52:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.upload.GenAIImageUploadService.A01(android.graphics.Bitmap, java.lang.String, X.1Ds):java.lang.Object");
    }

    public GenAIImageUploadService(Context context, C51758Mth c51758Mth, UserSession userSession, C47452Kxh c47452Kxh) {
        AbstractC167017dG.A1Q(context, c51758Mth);
        this.A00 = context;
        this.A04 = userSession;
        this.A01 = c51758Mth;
        this.A02 = c47452Kxh;
        this.A03 = AbstractC166177bl.A00(C92674Dc.A00);
    }
}
