package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.Gpb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C38108Gpb extends C03E implements InterfaceC16660sJ {
    public C38108Gpb(Object obj) {
        super(1, obj, C38P.class, "launchKeywordSerp", "launchKeywordSerp(Lcom/instagram/model/keyword/Keyword;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Keyword keyword = (Keyword) obj;
        C38089GpI c38089GpI = ((C38P) AbstractC25229BEm.A0o(keyword, this)).A0C;
        if (c38089GpI == null) {
            C14360o3.A0F("exploreGridDelegate");
            throw C00O.createAndThrow();
        }
        UserSession userSession = c38089GpI.A0B;
        if (!C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36330939378320472L)) {
            C140966Yy A0P = AbstractC31173DnH.A0P(c38089GpI.A0G.A00.requireActivity(), userSession);
            U04.A00();
            A0P.A0B(null, U29.A01(keyword, c38089GpI.A0K.getModuleName(), AbstractC167017dG.A0j(), null, null));
            A0P.A04();
        }
        return C0eB.A00;
    }
}
