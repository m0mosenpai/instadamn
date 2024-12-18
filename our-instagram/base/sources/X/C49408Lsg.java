package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* renamed from: X.Lsg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49408Lsg implements InterfaceC80653iu {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C45093JxN A01;
    public final /* synthetic */ C47946LGa A02;
    public final /* synthetic */ C49574LvT A03;
    public final /* synthetic */ boolean A04;

    public C49408Lsg(C45093JxN c45093JxN, C47946LGa c47946LGa, C49574LvT c49574LvT, int i, boolean z) {
        this.A04 = z;
        this.A03 = c49574LvT;
        this.A02 = c47946LGa;
        this.A00 = i;
        this.A01 = c45093JxN;
    }

    @Override // X.InterfaceC80653iu
    public final /* synthetic */ void DFp() {
    }

    @Override // X.InterfaceC80653iu
    public final void DPX(C73083Pj c73083Pj) {
        C14360o3.A0B(c73083Pj, 0);
        if (c73083Pj.A02 != null) {
            if (!this.A04) {
                C49574LvT c49574LvT = this.A03;
                DirectVisualMessageViewerController.A07(this.A01, this.A02, c49574LvT.A00, this.A00);
                return;
            }
            return;
        }
        C49574LvT c49574LvT2 = this.A03;
        C45093JxN c45093JxN = this.A01;
        if (!AbstractC167007dF.A1X(c45093JxN.A0B, EnumC40111tc.A0a)) {
            C9GR.A01(c49574LvT2.A00.A0e, "failed_to_load_photo_toast", 2131962085, 0);
        }
        DirectVisualMessageViewerController directVisualMessageViewerController = c49574LvT2.A00;
        MRJ mrj = directVisualMessageViewerController.A0D;
        if (mrj != null) {
            mrj.DfR();
        }
        String A06 = JRE.A06(directVisualMessageViewerController.A0x);
        UserSession userSession = directVisualMessageViewerController.A0m;
        AbstractC59962oe abstractC59962oe = directVisualMessageViewerController.A0f;
        if (A06 != null) {
            String A01 = c45093JxN.A01();
            String str = c45093JxN.A0I;
            AbstractC37302Gc3.A1U(A01, str);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC59962oe, userSession), "photo_cant_load");
            A0f.AAP("m_pk", str);
            A0f.AAP("item_id", A01);
            AbstractC31171DnF.A1F(A0f, A06);
            A0f.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
