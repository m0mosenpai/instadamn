package com.aiplatform.processors.stickeranything.ig;

import X.AbstractC111324zv;
import X.AbstractC1126356r;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.AbstractC31172DnG;
import X.AbstractC53631Nnc;
import X.C006802i;
import X.C00O;
import X.C05F;
import X.C09530e4;
import X.C14360o3;
import X.C1ON;
import X.C25621Ms;
import X.C26461Qb;
import X.C47Z;
import X.C51512Moy;
import X.C53640Nnl;
import X.C54509O6m;
import X.C54993OUc;
import X.C55595OmZ;
import X.C55786Opv;
import X.EnumC53262Nh0;
import X.InterfaceC57895Plz;
import X.InterfaceC58013Pnx;
import X.InterfaceC58097PpM;
import X.InterfaceC58135Ppy;
import X.MSY;
import X.OIG;
import X.OVd;
import X.PPI;
import X.PPJ;
import X.PS2;
import X.RunnableC56840PKk;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import com.instagram.common.session.UserSession;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class VideoStickerAnythingProcessor extends AbstractC53631Nnc implements InterfaceC58135Ppy, InterfaceC58013Pnx, InterfaceC57895Plz {
    public Handler A04;
    public Handler A05;
    public InterfaceC58097PpM A06;
    public OIG A07;
    public C54993OUc A08;
    public C1ON A09;
    public C47Z A0A;
    public OVd A0B;
    public String A0C;
    public String A0D;
    public boolean A0F;
    public URI A0G;
    public final Context A0H;
    public final C53640Nnl A0I;
    public final C55786Opv A0J;
    public final UserSession A0K;
    public final HandlerThread A0M;
    public final HandlerThread A0N;
    public int A00 = 1;
    public int A02 = 15;
    public int A01 = 15;
    public RectF A03 = new RectF(1.0E-4f, 1.0E-4f, 0.9999f, 0.9999f);
    public boolean A0E = true;
    public final Queue A0L = new LinkedList();

    public VideoStickerAnythingProcessor(Context context, C53640Nnl c53640Nnl, UserSession userSession) {
        this.A0H = context;
        this.A0K = userSession;
        this.A0I = c53640Nnl;
        HandlerThread A0A = MSY.A0A("polling_thread_segment_anything");
        this.A0M = A0A;
        HandlerThread A0A2 = MSY.A0A("creation_timeout_segment_anything");
        this.A0N = A0A2;
        this.A0J = new C55786Opv(this);
        A0A.start();
        A0A2.start();
        this.A05 = MSY.A09(A0A2);
        this.A04 = MSY.A09(A0A);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.OLe r9, com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor r10, X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r3 = 0
            boolean r0 = X.PX0.A01(r11, r3)
            if (r0 == 0) goto L8d
            r7 = r11
            X.PX0 r7 = (X.PX0) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r3 = r7.A03
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L4f
            if (r0 != r6) goto L98
            boolean r12 = r7.A05
            java.lang.Object r9 = r7.A02
            X.OLe r9 = (X.OLe) r9
            java.lang.Object r10 = r7.A01
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor r10 = (com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor) r10
            X.AbstractC09560e7.A00(r3)
        L2d:
            X.KhW r3 = (X.AbstractC46472KhW) r3
            boolean r0 = r3 instanceof X.KY4
            if (r0 == 0) goto L3b
            java.util.List r0 = r9.A01
            A02(r10, r0, r12)
        L38:
            X.0eB r8 = X.C0eB.A00
            return r8
        L3b:
            boolean r0 = r3 instanceof X.KY5
            if (r0 == 0) goto L93
            X.Nh0 r2 = X.EnumC53262Nh0.A0I
            java.lang.String r1 = "Mask bitmap upload failure "
            X.KY5 r3 = (X.KY5) r3
            java.lang.String r0 = r3.A00
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            r10.Dcb(r2, r0)
            goto L38
        L4f:
            X.AbstractC09560e7.A00(r3)
            X.Nh0 r1 = X.EnumC53262Nh0.A0I
            r10.Dca(r1)
            android.graphics.Bitmap r5 = r9.A00
            if (r5 == 0) goto L87
            com.instagram.common.session.UserSession r4 = r10.A0K
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
            r7.A01 = r10
            r7.A02 = r9
            r7.A05 = r12
            r7.A00 = r6
            java.lang.Object r3 = r2.FDC(r0, r7)
            if (r3 != r8) goto L2d
            return r8
        L87:
            java.lang.String r0 = "Mask Bitmap not found"
            r10.Dcb(r1, r0)
            goto L38
        L8d:
            X.PX0 r7 = new X.PX0
            r7.<init>(r10, r11, r3)
            goto L15
        L93:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L98:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor.A00(X.OLe, com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC58135Ppy
    public final void ARE(URI uri, JSONObject jSONObject) {
        AbstractC167017dG.A1N(uri, jSONObject);
        C54509O6m A01 = AbstractC1126356r.A01(jSONObject);
        OVd oVd = this.A0B;
        if (oVd != null) {
            oVd.A01(new C51512Moy(this, this.A0K, uri, jSONObject, this.A01), A01, C05F.A01, uri, AbstractC166987dD.A1I());
            this.A01--;
            return;
        }
        C14360o3.A0F("httpRequestExecutor");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58135Ppy
    public final void DCo(String str, URI uri) {
        C14360o3.A0B(str, 1);
        C09530e4 A1L = AbstractC166987dD.A1L("edit_id", str);
        A03(AbstractC25233BEq.A0p(AbstractC111324zv.A00(255), uri.toString(), A1L));
        this.A0G = uri;
        this.A0C = str;
        this.A00 = 1;
        Dca(EnumC53262Nh0.A0C);
        A01(this);
    }

    @Override // X.InterfaceC58135Ppy
    public final void DCp(String str) {
        C14360o3.A0B(str, 0);
        Dcb(EnumC53262Nh0.A0D, str);
    }

    @Override // X.InterfaceC58013Pnx
    public final void Dca(EnumC53262Nh0 enumC53262Nh0) {
        long j;
        C14360o3.A0B(enumC53262Nh0, 0);
        C006802i.A0p.markerPoint(900937655, enumC53262Nh0.A01);
        Handler handler = this.A05;
        handler.removeCallbacksAndMessages(null);
        PPJ ppj = new PPJ(enumC53262Nh0, this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (enumC53262Nh0.ordinal() == 7) {
            j = 72;
        } else {
            j = (long) this.A0I.A00;
        }
        handler.postDelayed(ppj, timeUnit.toMillis(j));
    }

    @Override // X.InterfaceC57895Plz
    public final void DiA(String str, String str2) {
        C14360o3.A0B(str2, 1);
        Dca(EnumC53262Nh0.A05);
        C25621Ms A0c = AbstractC167017dG.A0c(this.A0K);
        A0c.A0R = true;
        A0c.A0B("media/configure_to_cutout_sticker/");
        A0c.A0D("upload_engine_config_enum", 6);
        A0c.A9s("upload_id", str2);
        C26461Qb A0O = A0c.A0O();
        if (str != null) {
            A0O.A02.A01("retry_context", str);
        }
        this.A04.post(new PPI(this, A0O));
    }

    @Override // X.InterfaceC58135Ppy
    public final void DxJ(String str) {
        this.A0F = true;
        this.A0D = str;
        this.A05.removeCallbacksAndMessages(null);
        Queue queue = this.A0L;
        if (!queue.isEmpty()) {
            ((Runnable) queue.poll()).run();
        }
    }

    public static final void A01(VideoStickerAnythingProcessor videoStickerAnythingProcessor) {
        URI uri = videoStickerAnythingProcessor.A0G;
        if (uri != null) {
            videoStickerAnythingProcessor.A02--;
            OIG oig = videoStickerAnythingProcessor.A07;
            if (oig == null || !uri.equals(oig.A02)) {
                videoStickerAnythingProcessor.A07 = new OIG(videoStickerAnythingProcessor, new C55595OmZ(videoStickerAnythingProcessor, uri), uri);
            }
            OIG oig2 = videoStickerAnythingProcessor.A07;
            if (oig2 != null) {
                videoStickerAnythingProcessor.A09 = oig2.A00();
                videoStickerAnythingProcessor.A04.postDelayed(new RunnableC56840PKk(videoStickerAnythingProcessor), videoStickerAnythingProcessor.A00 * 1000);
            } else {
                C14360o3.A0F("oilDownloadProcess");
                throw C00O.createAndThrow();
            }
        }
    }

    public static final void A02(VideoStickerAnythingProcessor videoStickerAnythingProcessor, List list, boolean z) {
        String str = videoStickerAnythingProcessor.A0D;
        if (str != null) {
            videoStickerAnythingProcessor.A0D = str;
            MSY.A09(videoStickerAnythingProcessor.A0M).post(new PS2(videoStickerAnythingProcessor, list, z));
        }
    }

    public static final void A03(Map map) {
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            C006802i.A0p.markerAnnotate(900937655, AbstractC31172DnG.A17(A1K), (String) A1K.getValue());
        }
    }

    @Override // X.InterfaceC58013Pnx
    public final void Dcb(EnumC53262Nh0 enumC53262Nh0, String str) {
        AbstractC167017dG.A1N(enumC53262Nh0, str);
        A05(enumC53262Nh0);
        C006802i.A0p.markerEndAtPoint(900937655, 0, (short) 3, enumC53262Nh0.A01);
        this.A05.removeCallbacksAndMessages(null);
        InterfaceC58097PpM interfaceC58097PpM = this.A06;
        if (interfaceC58097PpM != null) {
            interfaceC58097PpM.DG8(enumC53262Nh0, str);
        }
    }
}
