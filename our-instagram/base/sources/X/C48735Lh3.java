package X;

import com.instagram.direct.visual.DirectVisualMessageViewerController;
import java.util.List;

/* renamed from: X.Lh3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48735Lh3 implements InterfaceC50476MQe {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47946LGa A01;
    public final /* synthetic */ DirectVisualMessageViewerController A02;

    public C48735Lh3(C47946LGa c47946LGa, DirectVisualMessageViewerController directVisualMessageViewerController, int i) {
        this.A01 = c47946LGa;
        this.A00 = i;
        this.A02 = directVisualMessageViewerController;
    }

    @Override // X.InterfaceC50476MQe
    public final void DRV() {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A02;
        MRJ mrj = directVisualMessageViewerController.A0D;
        if (mrj != null) {
            mrj.DfR();
        }
        C9GR.A0F(directVisualMessageViewerController.A0e, "failed_to_load_video_toast", 2131962086);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.A0S != false) goto L8;
     */
    @Override // X.InterfaceC50476MQe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DS0() {
        /*
            r5 = this;
            X.LGa r0 = r5.A01
            int r4 = r5.A00
            X.JxN r3 = r0.A01(r4)
            if (r3 == 0) goto L19
            com.instagram.direct.visual.DirectVisualMessageViewerController r2 = r5.A02
            boolean r0 = r2.A0R
            if (r0 == 0) goto L15
            boolean r1 = r2.A0S
            r0 = 1
            if (r1 == 0) goto L16
        L15:
            r0 = 0
        L16:
            com.instagram.direct.visual.DirectVisualMessageViewerController.A09(r3, r2, r4, r0)
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48735Lh3.DS0():void");
    }

    @Override // X.InterfaceC50476MQe
    public final void DSE(C45093JxN c45093JxN, C45093JxN c45093JxN2) {
        List list = this.A01.A03;
        int indexOf = list.indexOf(c45093JxN);
        if (indexOf != -1) {
            list.set(indexOf, c45093JxN2);
        }
    }
}
