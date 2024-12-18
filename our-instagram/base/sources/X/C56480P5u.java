package X;

import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.HashMap;

/* renamed from: X.P5u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56480P5u implements InterfaceC57962Pn8 {
    public final int A00;
    public final Object A01;

    public C56480P5u(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC57962Pn8
    public final void CP6(String str) {
        C63397SjR c63397SjR;
        String str2;
        switch (this.A00) {
            case 0:
            case 1:
                C14360o3.A0B(str, 0);
                C56344P0f c56344P0f = (C56344P0f) this.A01;
                UserSession userSession = c56344P0f.A03;
                AnonymousClass229.A01(userSession).A1Y(c56344P0f.A01);
                c63397SjR = new C63397SjR(c56344P0f.A02.requireActivity(), userSession, C2Fb.A25, str, false);
                str2 = "ShareReelsAdvancedSettingsFragment";
                c63397SjR.A0S = str2;
                c63397SjR.A0A();
                return;
            case 2:
            case 3:
            case 4:
            default:
                C14360o3.A0B(str, 0);
                NMW nmw = (NMW) this.A01;
                c63397SjR = new C63397SjR(nmw.requireActivity(), AbstractC166987dD.A0r(nmw.A0Y), C2Fb.A25, str, false);
                str2 = "video_edit_metadata_fragment";
                c63397SjR.A0S = str2;
                c63397SjR.A0A();
                return;
            case 5:
                C14360o3.A0B(str, 0);
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                c63397SjR = new C63397SjR(clipsEditMetadataController.A0n, clipsEditMetadataController.A0s, C2Fb.A25, str, false);
                str2 = "ClipsEditMetadataController";
                c63397SjR.A0S = str2;
                c63397SjR.A0A();
                return;
            case 6:
                ClipsEditMetadataController clipsEditMetadataController2 = (ClipsEditMetadataController) this.A01;
                HashMap A1G = AbstractC166987dD.A1G();
                C38321qM c38321qM = clipsEditMetadataController2.A0D;
                if (c38321qM != null) {
                    String A2u = c38321qM.A2u();
                    if (A2u != null) {
                        A1G.put("media_igid", A2u);
                        C67858Uzp c67858Uzp = new C67858Uzp();
                        c67858Uzp.A0D(false);
                        AbstractC59962oe abstractC59962oe = clipsEditMetadataController2.A0q;
                        c67858Uzp.A0B(abstractC59962oe.getChildFragmentManager(), null);
                        AbstractC192798gL A02 = C192108fB.A02(null, clipsEditMetadataController2.A0s, "com.instagram.insights.media_refresh.revshare.monetization_status_detail", A1G);
                        A02.A00(new C32394EOv(22, c67858Uzp, clipsEditMetadataController2));
                        abstractC59962oe.schedule(A02);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
