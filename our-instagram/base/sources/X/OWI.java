package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OWI {
    public static final OWI A00 = new Object();

    public final void A00(ImmutableList immutableList, UserSession userSession, InterfaceC57972PnI interfaceC57972PnI) {
        C14360o3.A0B(userSession, 0);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A05("highlight_ids", immutableList);
        AbstractC40691uc.A01(userSession).A01(null, new MV7(interfaceC57972PnI, 9), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGProfileShareHighlightsToMainGridQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C60129QuR.class, true, null, 0, null, "xdt_share_highlight_to_main_grid", AbstractC166987dD.A1E()));
    }

    public final void A01(ImmutableList immutableList, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 0);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A05("highlight_ids", immutableList);
        AbstractC40691uc.A01(userSession).A01(null, new MV7(interfaceC16820sZ, 11), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGProfileUnShareHighlightsToMainGridQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C60137QuZ.class, true, null, 0, null, "xdt_unshare_highlight_to_main_grid", AbstractC166987dD.A1E()));
    }
}
