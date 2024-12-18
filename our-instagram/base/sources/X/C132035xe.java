package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132035xe {
    public final /* synthetic */ C6JR A00;

    public C132035xe(C6JR c6jr) {
        this.A00 = c6jr;
    }

    public final void A00() {
        UserSession userSession = this.A00.A00.A09;
        InterfaceC11380iw interfaceC11380iw = new InterfaceC11380iw() { // from class: X.Cst
            public static final String __redex_internal_original_name = "DirectUserScopedInitializer$9$1$$ExternalSyntheticLambda0";

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return "SCF_App_Start_Service_Android";
            }
        };
        C14360o3.A0B(userSession, 1);
        AbstractC47015KqY.A00(AbstractC12220kQ.A01(interfaceC11380iw, userSession), new C115115Ig(new C9CD(-1, "DirectUserScopedInitializer_maybeInitializeSecureConsent() with exception", "DirectUserScopedInitializer_SCF_loading_error", 1, false)), "SCF_Android_Observer_Error");
    }

    public final void A01() {
        UserSession userSession = this.A00.A00.A09;
        C5zZ c5zZ = new C5zZ(userSession);
        C1341764d c1341764d = c5zZ.A02;
        if (c1341764d.A01(1) && JUW.A02(userSession, false)) {
            new LFw(c5zZ.A01).A00("igd_nudity_detection_model_loading_on_init");
        } else if (c1341764d.A00.get(1) == null && JUW.A02(userSession, true)) {
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36325824072791455L)) {
                c5zZ.A00(new C49353Lrl(c5zZ), true);
            }
        }
        C131305wJ c131305wJ = new C131305wJ(userSession);
        if (c131305wJ.A04() && C14360o3.A0K(c131305wJ.A03.A00.get(108), true)) {
            c131305wJ.A00(null, C17060sy.A01.A01(c131305wJ.A01).A2F());
        }
        if (c131305wJ.A03() && C14360o3.A0K(c131305wJ.A03.A00.get(109), true)) {
            c131305wJ.A02(C17060sy.A01.A01(c131305wJ.A01).A2E());
        }
        if (c131305wJ.A05()) {
            C19K A02 = AnonymousClass194.A02(c131305wJ.A02);
            C206649Cv c206649Cv = new C206649Cv(c131305wJ, null, 16);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, A02);
        }
    }
}
