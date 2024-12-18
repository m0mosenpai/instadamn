package com.aiplatform.processors.stickeranything.ig;

import X.AbstractC167017dG;
import X.AbstractC53631Nnc;
import X.C00O;
import X.C14360o3;
import X.C1ON;
import X.C25621Ms;
import X.C26461Qb;
import X.C47Z;
import X.C53640Nnl;
import X.C54993OUc;
import X.C55596Oma;
import X.C55787Opw;
import X.C57283Pc5;
import X.InterfaceC57895Plz;
import X.InterfaceC58013Pnx;
import X.InterfaceC58097PpM;
import X.InterfaceC58135Ppy;
import X.MSY;
import X.OIG;
import X.OML;
import X.OVd;
import X.PPL;
import X.RunnableC56842PKm;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import com.instagram.common.session.UserSession;
import java.net.URI;

/* loaded from: classes9.dex */
public final class VideoStickerAnythingProcessorV2 extends AbstractC53631Nnc implements InterfaceC57895Plz {
    public Handler A03;
    public InterfaceC58097PpM A04;
    public InterfaceC58135Ppy A05;
    public OML A06;
    public InterfaceC58013Pnx A07;
    public OIG A08;
    public C54993OUc A09;
    public C1ON A0A;
    public C47Z A0B;
    public OVd A0C;
    public String A0D;
    public String A0E;
    public URI A0F;
    public final Context A0H;
    public final HandlerThread A0I;
    public final C53640Nnl A0J;
    public final C55787Opw A0K;
    public final UserSession A0L;
    public int A00 = 1;
    public int A01 = 15;
    public RectF A02 = new RectF(1.0E-4f, 1.0E-4f, 0.9999f, 0.9999f);
    public boolean A0G = true;

    public VideoStickerAnythingProcessorV2(Context context, C53640Nnl c53640Nnl, UserSession userSession) {
        this.A0H = context;
        this.A0L = userSession;
        this.A0J = c53640Nnl;
        HandlerThread A0A = MSY.A0A("polling_thread_segment_anything");
        this.A0I = A0A;
        this.A0K = new C55787Opw(this);
        A0A.start();
        this.A03 = MSY.A09(A0A);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.OLe r9, com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2 r10, X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r7 = 1
            boolean r0 = X.PX0.A01(r11, r7)
            if (r0 == 0) goto L9a
            r6 = r11
            X.PX0 r6 = (X.PX0) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r1 = r6.A03
            X.1JX r8 = X.C1JX.A02
            int r0 = r6.A00
            if (r0 == 0) goto L52
            if (r0 != r7) goto La1
            boolean r12 = r6.A05
            java.lang.Object r9 = r6.A02
            X.OLe r9 = (X.OLe) r9
            java.lang.Object r10 = r6.A01
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2 r10 = (com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2) r10
            X.AbstractC09560e7.A00(r1)
        L2c:
            boolean r0 = r1 instanceof X.KY4
            if (r0 == 0) goto L49
            java.util.List r2 = r9.A01
            java.lang.String r0 = r10.A0E
            if (r0 == 0) goto L46
            r10.A0E = r0
            android.os.HandlerThread r0 = r10.A0I
            android.os.Handler r1 = X.MSY.A09(r0)
            X.PS3 r0 = new X.PS3
            r0.<init>(r10, r2, r12)
            r1.post(r0)
        L46:
            X.0eB r8 = X.C0eB.A00
            return r8
        L49:
            boolean r0 = r1 instanceof X.KY5
            if (r0 != 0) goto L90
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L52:
            X.AbstractC09560e7.A00(r1)
            X.OML r2 = r10.A06
            if (r2 == 0) goto L60
            java.lang.String r1 = "upload_mask_start"
            X.Pc9 r0 = X.C57287Pc9.A00
            r2.A02(r1, r0)
        L60:
            android.graphics.Bitmap r5 = r9.A00
            if (r5 == 0) goto L90
            com.instagram.common.session.UserSession r4 = r10.A0L
            android.content.Context r3 = r10.A0H
            r1 = 0
            r0 = 12
            com.instagram.genai.imageservice.service.GenAIImageService r2 = new com.instagram.genai.imageservice.service.GenAIImageService
            r2.<init>(r3, r1, r4, r0)
            java.lang.String r0 = X.AbstractC25231BEo.A0p()
            X.C14360o3.A0A(r5)
            X.GzS r1 = new X.GzS
            r1.<init>(r5, r0)
            X.Mte r0 = new X.Mte
            r0.<init>(r1)
            r6.A01 = r10
            r6.A02 = r9
            r6.A05 = r12
            r6.A00 = r7
            java.lang.Object r1 = r2.FDC(r0, r6)
            if (r1 != r8) goto L2c
            return r8
        L90:
            X.OML r1 = r10.A06
            if (r1 == 0) goto L46
            java.lang.String r0 = "upload_mask_start"
            r1.A01(r0)
            goto L46
        L9a:
            X.PX0 r6 = new X.PX0
            r6.<init>(r10, r11, r7)
            goto L15
        La1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2.A00(X.OLe, com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC57895Plz
    public final void DiA(String str, String str2) {
        C14360o3.A0B(str2, 1);
        OML oml = this.A06;
        if (oml != null) {
            oml.A02("configure_sticker_start", C57283Pc5.A00);
        }
        C25621Ms A0c = AbstractC167017dG.A0c(this.A0L);
        A0c.A0R = true;
        A0c.A0B("media/configure_to_cutout_sticker/");
        A0c.A0D("upload_engine_config_enum", 6);
        A0c.A9s("upload_id", str2);
        C26461Qb A0O = A0c.A0O();
        if (str != null) {
            A0O.A02.A01("retry_context", str);
        }
        this.A03.post(new PPL(this, A0O));
    }

    public static final void A01(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2) {
        URI uri = videoStickerAnythingProcessorV2.A0F;
        if (uri != null) {
            videoStickerAnythingProcessorV2.A01--;
            OIG oig = videoStickerAnythingProcessorV2.A08;
            if (oig == null || !uri.equals(oig.A02)) {
                videoStickerAnythingProcessorV2.A08 = new OIG(videoStickerAnythingProcessorV2.A07, new C55596Oma(videoStickerAnythingProcessorV2, uri), uri);
            }
            OIG oig2 = videoStickerAnythingProcessorV2.A08;
            if (oig2 != null) {
                videoStickerAnythingProcessorV2.A0A = oig2.A00();
                videoStickerAnythingProcessorV2.A03.postDelayed(new RunnableC56842PKm(videoStickerAnythingProcessorV2), videoStickerAnythingProcessorV2.A00 * 1000);
            } else {
                C14360o3.A0F("oilDownloadProcess");
                throw C00O.createAndThrow();
            }
        }
    }
}
