package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CTm {
    public final UserSession A00;
    public final C40701ud A01;

    public final Object A00(String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A03("section_content_at_stream_initial_count", 0);
        A0b.A01("enable_section_content_at_stream");
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "creator_inspiration_hub_type");
        C0CA.A00(A0T, str2, "max_id");
        AbstractC25231BEo.A18(A0T, A0b);
        A0b.A01("enable_section_content_at_stream");
        PandoGraphQLRequest A00 = AbstractC28917CpR.A00(A0b, A0b2);
        if (z) {
            CIN.A00(this.A00).A02(str);
        }
        C40701ud c40701ud = this.A01;
        C14360o3.A0A(A00);
        return c40701ud.A04(A00, interfaceC23621Ds);
    }

    public CTm(UserSession userSession, C40701ud c40701ud) {
        AbstractC167017dG.A1P(userSession, c40701ud);
        this.A00 = userSession;
        this.A01 = c40701ud;
    }
}
