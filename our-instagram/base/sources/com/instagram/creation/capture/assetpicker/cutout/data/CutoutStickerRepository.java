package com.instagram.creation.capture.assetpicker.cutout.data;

import X.AbstractC111324zv;
import X.AbstractC167007dF;
import X.C006802i;
import X.C06090Tz;
import X.C18U;
import X.C1ON;
import X.C4A7;
import X.C4A8;
import X.C54679ODf;
import X.C72800XnN;
import X.InterfaceC16660sJ;
import X.OML;
import android.content.Context;
import android.graphics.Bitmap;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.cutout.services.CutoutStickerUploadService;

/* loaded from: classes9.dex */
public final class CutoutStickerRepository extends C4A7 {
    public Bitmap A00;
    public final Context A01;
    public final UserSession A02;
    public final CutoutStickerUploadService A03;
    public final C72800XnN A04;
    public final C54679ODf A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutoutStickerRepository(Context context, UserSession userSession) {
        super(AbstractC111324zv.A00(4237), C4A8.A00(483880845));
        CutoutStickerUploadService cutoutStickerUploadService = new CutoutStickerUploadService(userSession, context);
        C72800XnN c72800XnN = new C72800XnN(context, userSession);
        C54679ODf c54679ODf = new C54679ODf(context, userSession);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = cutoutStickerUploadService;
        this.A04 = c72800XnN;
        this.A05 = c54679ODf;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(android.graphics.Bitmap r14, X.C40121td r15, java.lang.String r16, java.lang.String r17, X.InterfaceC23621Ds r18) {
        /*
            r13 = this;
            r3 = 38
            r5 = r18
            boolean r0 = X.MAS.A03(r5, r3)
            r8 = r13
            if (r0 == 0) goto L4b
            r4 = r5
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r4.A00 = r2
        L19:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L53
            X.AbstractC09560e7.A00(r3)
        L27:
            X.0e6 r3 = (X.C09550e6) r3
            java.lang.Object r0 = r3.A00
            return r0
        L2c:
            X.AbstractC09560e7.A00(r3)
            X.19L r0 = r13.A01
            X.12W r0 = r0.Arv()
            r11 = 0
            r12 = 3
            X.JZ1 r5 = new X.JZ1
            r7 = r14
            r6 = r15
            r10 = r16
            r9 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.A00 = r1
            java.lang.Object r3 = X.AbstractC23641Du.A00(r4, r0, r5)
            if (r3 != r2) goto L27
            return r2
        L4b:
            r0 = 42
            X.MAS r4 = new X.MAS
            r4.<init>(r13, r5, r3, r0)
            goto L19
        L53:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository.A00(android.graphics.Bitmap, X.1td, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final void A01() {
        InterfaceC16660sJ interfaceC16660sJ;
        C54679ODf c54679ODf = this.A05;
        if (C18U.A06(C06090Tz.A05, c54679ODf.A04, 36320034460344273L)) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = c54679ODf.A01;
            videoStickerAnythingProcessorV2.A01 = 15;
            videoStickerAnythingProcessorV2.A0G = true;
            interfaceC16660sJ = null;
            videoStickerAnythingProcessorV2.A0E = null;
            videoStickerAnythingProcessorV2.A0D = null;
            OML oml = videoStickerAnythingProcessorV2.A06;
            if (oml != null) {
                oml.A00("exit_creation");
            }
            C1ON c1on = videoStickerAnythingProcessorV2.A0A;
            if (c1on != null) {
                c1on.onCancel();
            }
            videoStickerAnythingProcessorV2.A03.removeCallbacksAndMessages(null);
        } else {
            VideoStickerAnythingProcessor videoStickerAnythingProcessor = c54679ODf.A00;
            videoStickerAnythingProcessor.A02 = 15;
            videoStickerAnythingProcessor.A01 = 15;
            videoStickerAnythingProcessor.A0F = false;
            videoStickerAnythingProcessor.A0E = true;
            videoStickerAnythingProcessor.A0L.clear();
            interfaceC16660sJ = null;
            videoStickerAnythingProcessor.A0D = null;
            videoStickerAnythingProcessor.A0C = null;
            VideoStickerAnythingProcessor.A03(AbstractC167007dF.A0n("cancel_reason", "exit_creation"));
            C006802i.A0p.markerEnd(900937655, (short) 4);
            C1ON c1on2 = videoStickerAnythingProcessor.A09;
            if (c1on2 != null) {
                c1on2.onCancel();
            }
            videoStickerAnythingProcessor.A09 = null;
            videoStickerAnythingProcessor.A04.removeCallbacksAndMessages(null);
            videoStickerAnythingProcessor.A05.removeCallbacksAndMessages(null);
        }
        c54679ODf.A02 = interfaceC16660sJ;
    }
}
