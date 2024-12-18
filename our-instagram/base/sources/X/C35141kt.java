package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.1kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35141kt implements InterfaceC29301b7 {
    public static final C0KV A01 = C35151ku.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        String str2;
        C35131ks c35131ks = (C35131ks) c1ow;
        C14360o3.A0B(c35131ks, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str3 = c35131ks.A01;
        if (str3 != null) {
            String str4 = c35131ks.A02;
            if (str4 != null) {
                DirectThreadKey A02 = JRE.A02(c35131ks.C7Q());
                if (A02 == null || (str2 = A02.A00) == null) {
                    str2 = "";
                }
                ESY esy = new ESY(interfaceC37261GbE, c35131ks);
                String obj = UUID.randomUUID().toString();
                C0CA A022 = GraphQlCallInput.A02.A02();
                C0CA.A00(A022, obj, "client_mutation_id");
                C0CA.A00(A022, str3, "item_id");
                C0CA.A00(A022, str4, "otid");
                C0CA.A00(A022, str2, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                c2jm.A00.A02().A0E(A022, "input");
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGHideOneClickUpsellOnMessageMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59415QeC.class, true, null, 64, null, "xig_hide_one_click_upsell_on_message", new ArrayList()), esy);
                return;
            }
            str = "otid";
        } else {
            str = "itemId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C35141kt(UserSession userSession) {
        this.A00 = userSession;
    }
}
