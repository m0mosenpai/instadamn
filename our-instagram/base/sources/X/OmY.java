package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OmY implements InterfaceC58135Ppy, InterfaceC58013Pnx {
    public int A00;
    public boolean A01;
    public final OJO A02;
    public final AbstractC53631Nnc A03;
    public final C53640Nnl A04;
    public final OML A05;
    public final O1G A06;
    public final Integer A07;
    public final Queue A08;

    @Override // X.InterfaceC58135Ppy
    public final void ARE(java.net.URI uri, JSONObject jSONObject) {
        AbstractC167017dG.A1N(uri, jSONObject);
        AbstractC53631Nnc abstractC53631Nnc = this.A03;
        int i = this.A00;
        if (abstractC53631Nnc instanceof VideoStickerAnythingProcessorV2) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) abstractC53631Nnc;
            C54509O6m A01 = AbstractC1126356r.A01(jSONObject);
            OVd oVd = videoStickerAnythingProcessorV2.A0C;
            if (oVd != null) {
                oVd.A01(new C51511Mox(videoStickerAnythingProcessorV2.A05, videoStickerAnythingProcessorV2.A06, uri, jSONObject, i), A01, C05F.A01, uri, AbstractC166987dD.A1I());
            } else {
                C14360o3.A0F("httpRequestExecutor");
                throw C00O.createAndThrow();
            }
        }
        this.A00--;
    }

    @Override // X.InterfaceC58135Ppy
    public final void DCo(String str, java.net.URI uri) {
        C14360o3.A0B(str, 1);
        OML oml = this.A05;
        C09530e4 A1L = AbstractC166987dD.A1L("edit_id", new C51397Mn3(str));
        oml.A03(AbstractC25233BEq.A0p(AbstractC111324zv.A00(255), new C51397Mn3(AbstractC166987dD.A19(uri)), A1L));
        Dca(EnumC53262Nh0.A0C);
        AbstractC53631Nnc abstractC53631Nnc = this.A03;
        if (abstractC53631Nnc instanceof VideoStickerAnythingProcessorV2) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) abstractC53631Nnc;
            videoStickerAnythingProcessorV2.A0F = uri;
            videoStickerAnythingProcessorV2.A0D = str;
            VideoStickerAnythingProcessorV2.A01(videoStickerAnythingProcessorV2);
        }
    }

    @Override // X.InterfaceC58135Ppy
    public final void DCp(String str) {
        C14360o3.A0B(str, 0);
        Dcb(EnumC53262Nh0.A0D, str);
    }

    @Override // X.InterfaceC58013Pnx
    public final void Dca(EnumC53262Nh0 enumC53262Nh0) {
        C14360o3.A0B(enumC53262Nh0, 0);
        this.A05.A02(enumC53262Nh0.A01, C57279Pc1.A00);
    }

    @Override // X.InterfaceC58135Ppy
    public final void DxJ(String str) {
        this.A01 = true;
        AbstractC53631Nnc abstractC53631Nnc = this.A03;
        if (abstractC53631Nnc instanceof VideoStickerAnythingProcessorV2) {
            ((VideoStickerAnythingProcessorV2) abstractC53631Nnc).A0E = str;
        }
        this.A05.A02("upload_finish", C57280Pc2.A00);
        Queue queue = this.A08;
        if (!queue.isEmpty()) {
            ((Runnable) queue.poll()).run();
        }
    }

    public final void A00(OLS ols, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        Queue queue = this.A08;
        if (!(!queue.isEmpty())) {
            if (!this.A01) {
                queue.add(new PT5(ols, this, interfaceC16660sJ, interfaceC16660sJ2));
            } else {
                this.A02.A00(ols, interfaceC16660sJ, interfaceC16660sJ2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01cb, code lost:
    
        if (X.C14360o3.A0K(r9, "270") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ee  */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.Object, X.Po5] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.PpU, X.WZ3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.Object r62, X.InterfaceC16660sJ r63, long r64, long r66, boolean r68) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OmY.A01(java.lang.Object, X.0sJ, long, long, boolean):void");
    }

    public OmY(C53640Nnl c53640Nnl, AbstractC53631Nnc abstractC53631Nnc, Integer num) {
        this.A03 = abstractC53631Nnc;
        this.A04 = c53640Nnl;
        this.A07 = num;
        OML oml = new OML(((long) c53640Nnl.A00) * 1000);
        this.A05 = oml;
        this.A02 = new OJO(c53640Nnl, oml, abstractC53631Nnc);
        this.A06 = new O1G(abstractC53631Nnc);
        this.A08 = new LinkedList();
        this.A00 = 15;
        boolean z = abstractC53631Nnc instanceof VideoStickerAnythingProcessorV2;
        if (z) {
            ((VideoStickerAnythingProcessorV2) abstractC53631Nnc).A06 = oml;
        } else {
            if (!(abstractC53631Nnc instanceof VideoStickerAnythingProcessor)) {
                ((C51398Mn5) abstractC53631Nnc).A02 = oml;
            }
            throw C00O.createAndThrow();
        }
        if (z) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) abstractC53631Nnc;
            videoStickerAnythingProcessorV2.A05 = this;
            videoStickerAnythingProcessorV2.A07 = this;
        } else {
            if (!(abstractC53631Nnc instanceof VideoStickerAnythingProcessor)) {
                C51398Mn5 c51398Mn5 = (C51398Mn5) abstractC53631Nnc;
                c51398Mn5.A01 = this;
                c51398Mn5.A03 = this;
                return;
            }
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC58013Pnx
    public final void Dcb(EnumC53262Nh0 enumC53262Nh0, String str) {
        InterfaceC58097PpM interfaceC58097PpM;
        AbstractC167017dG.A1N(enumC53262Nh0, str);
        AbstractC53631Nnc abstractC53631Nnc = this.A03;
        abstractC53631Nnc.A05(enumC53262Nh0);
        this.A05.A01(enumC53262Nh0.A01);
        if (abstractC53631Nnc instanceof VideoStickerAnythingProcessorV2) {
            interfaceC58097PpM = ((VideoStickerAnythingProcessorV2) abstractC53631Nnc).A04;
        } else if (!(abstractC53631Nnc instanceof VideoStickerAnythingProcessor)) {
            return;
        } else {
            interfaceC58097PpM = ((VideoStickerAnythingProcessor) abstractC53631Nnc).A06;
        }
        if (interfaceC58097PpM != null) {
            interfaceC58097PpM.DG8(enumC53262Nh0, str);
        }
    }
}
