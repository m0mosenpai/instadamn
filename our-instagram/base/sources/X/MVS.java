package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MVS extends AbstractC52922bZ {
    public C38321qM A00;
    public C37522Gfe A01;
    public boolean A02;
    public final UserSession A03;
    public final C05A A04;
    public final C0UO A05;

    public final void A00(String str) {
        String str2;
        String str3;
        C14360o3.A0B(str, 0);
        C05A c05a = this.A04;
        c05a.Egh(AbstractC001800i.A0f(AbstractC31172DnG.A0w(c05a), str));
        UserSession userSession = this.A03;
        C37522Gfe c37522Gfe = this.A01;
        if (c37522Gfe != null) {
            String str4 = c37522Gfe.A03.A01;
            boolean isEmpty = MSW.A1A(c05a).isEmpty();
            C14360o3.A0B(str4, 2);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37522Gfe, userSession), "instagram_clips_viewer_organic_tap");
            if (A0f.isSampled()) {
                if (isEmpty) {
                    str3 = "translation_all_remove";
                } else {
                    str3 = "translation_audio_remove";
                }
                A0f.AAP("organic_tap_action", str3);
                A0f.AAP("organic_tap_action_source", AbstractC111324zv.A00(3252));
                A0f.AAP("containermodule", c37522Gfe.getModuleName());
                AbstractC25229BEm.A19(A0f, 0);
                AbstractC25225BEi.A1P(A0f, str4);
                A0f.Cht();
            }
            C38321qM c38321qM = this.A00;
            if (c38321qM != null) {
                String A38 = c38321qM.A38();
                LWP lwp = new LWP(this, 4);
                C53640Nnl A00 = AbstractC53654Nnz.A00();
                A00.A03 = 360L;
                A00.A02 = 30L;
                A00.A00 = 240.0d;
                A00.A01 = 30;
                C51398Mn5 c51398Mn5 = new C51398Mn5(A00, userSession);
                c51398Mn5.A04 = lwp;
                if (A38 != null) {
                    C2JO c2jo = new C2JO();
                    c2jo.A09(str, "language");
                    c2jo.A09(A38, "media_id");
                    C40701ud A01 = AbstractC40691uc.A01(c51398Mn5.A07);
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    A0b.A00(c2jo, "input");
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "RemoveAutodubLanguageMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), QQL.class, true, null, 0, null, "xdt_remove_autodub_language", AbstractC166987dD.A1E());
                    C14360o3.A0A(pandoGraphQLRequest);
                    C55661Onm.A00(new MV7(c51398Mn5, 0), pandoGraphQLRequest, A01, c51398Mn5, 0);
                    return;
                }
                return;
            }
            str2 = "media";
        } else {
            str2 = "analyticsModule";
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public MVS(UserSession userSession) {
        this.A03 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A04 = A0o;
        this.A05 = A0o;
    }
}
