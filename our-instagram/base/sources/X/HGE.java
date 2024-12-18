package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* loaded from: classes7.dex */
public final class HGE extends C1P1 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C6WQ A02;
    public final /* synthetic */ C145176gc A03;

    public HGE(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, C6WQ c6wq, C145176gc c145176gc) {
        this.A02 = c6wq;
        this.A03 = c145176gc;
        this.A00 = fragmentActivity;
        this.A01 = abstractC59962oe;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 139709656);
        Throwable A01 = abstractC115105If.A01();
        if (A01 == null || (str = A01.getMessage()) == null) {
            str = "";
        }
        C0w9.A03("Superlative", AnonymousClass001.A0R("See Yours : Fetch Superlative fail - ", str));
        InterfaceC1118853a interfaceC1118853a = this.A03.A18;
        if (!((ReelViewerFragment) interfaceC1118853a).A2r) {
            this.A02.dismiss();
            interfaceC1118853a.EJJ();
            C9GR.A0D(this.A00, "superlative_see_yours_api_network_error");
        }
        C0f9.A0A(1959994089, A0N);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1835919266);
        super.onStart();
        C0fJ.A00(this.A02);
        this.A03.A18.EJE("dialog");
        C0f9.A0A(1529111397, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(-1573637369);
        C38829H8d c38829H8d = (C38829H8d) obj;
        int A0N = AbstractC167017dG.A0N(c38829H8d, 1022723676);
        C145176gc c145176gc = this.A03;
        InterfaceC1118853a interfaceC1118853a = c145176gc.A18;
        if (!((ReelViewerFragment) interfaceC1118853a).A2r) {
            this.A02.dismiss();
            interfaceC1118853a.EJJ();
            InterfaceC43469JIh interfaceC43469JIh = c38829H8d.A00;
            if (interfaceC43469JIh == null) {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
            } else {
                C37771pE c37771pE = ((C42134Ili) interfaceC43469JIh).A00;
                C37771pE c37771pE2 = null;
                if (c37771pE != null) {
                    UserSession userSession = c145176gc.A09;
                    if (userSession != null) {
                        c37771pE2 = c37771pE.F5S(C1DS.A00(userSession));
                    }
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                str = "reelViewerBottomSheetManager";
                if (c37771pE2 != null) {
                    Long l = c37771pE2.A1L;
                    if (l != null && l.longValue() != 0) {
                        OWL.A01.A01(c37771pE2.A0F);
                        AbstractC149546o6 abstractC149546o6 = c145176gc.A0N;
                        if (abstractC149546o6 != null) {
                            abstractC149546o6.A03(this.A00, c37771pE2, C3G2.A20);
                        }
                    } else {
                        UserSession userSession2 = c145176gc.A09;
                        if (userSession2 != null) {
                            C0w9.A03("Superlative", AnonymousClass001.A0R("See Yours : latestReelMedia is null ", AbstractC37741pB.A03(userSession2, c37771pE2)));
                        }
                        C14360o3.A0F("userSession");
                        throw C00O.createAndThrow();
                    }
                }
                AbstractC149546o6 abstractC149546o62 = c145176gc.A0N;
                if (abstractC149546o62 != null) {
                    abstractC149546o62.A04(this.A00, C3G2.A20);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A0A(1174846879, A0N);
        C0f9.A0A(-1913851632, A03);
    }
}
