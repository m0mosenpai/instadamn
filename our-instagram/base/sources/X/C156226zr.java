package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.archive.api.ProfileSetMyWeekMutationResponseImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156226zr {
    public static final Object A00(UserSession userSession, Boolean bool, Boolean bool2, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        C0CA c0ca = null;
        if (bool != null) {
            Boolean valueOf = Boolean.valueOf(bool.booleanValue());
            c0ca = c04060Jx.A02();
            C0CA.A00(c0ca, valueOf, "my_week_enabled");
        }
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                str = "CARDS";
            } else {
                str = "POGS";
            }
            if (c0ca == null) {
                c0ca = c04060Jx.A02();
            }
            C0CA.A00(c0ca, str, "highlights_tray_type");
        }
        C0CA A02 = c2jm.A00.A02();
        if (c0ca == null) {
            c0ca = c04060Jx.A02();
        }
        A02.A0E(c0ca, "request_data");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return AbstractC209010m.A02(interfaceC23621Ds, AbstractC40691uc.A01(userSession).A05(new PandoGraphQLRequest(AbstractC40511uK.A00(), "ProfileSetMyWeekMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), ProfileSetMyWeekMutationResponseImpl.class, true, null, 0, null, "xdt_update_highlights_settings", new ArrayList())));
    }
}
