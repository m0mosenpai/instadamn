package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.graphql.IGDirectItemSeenMutationResponseImpl;
import java.util.ArrayList;

/* renamed from: X.1f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31631f6 implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1f7
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1986718945);
            int A032 = C0f9.A03(456326790);
            C31631f6 c31631f6 = new C31631f6(userSession);
            C0f9.A0A(1953272379, A032);
            C0f9.A0A(-2040153605, A03);
            return c31631f6;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        String str2;
        C31601f3 c31601f3 = (C31601f3) c1ow;
        C80993jT c80993jT = c31601f3.A00;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        Integer num = C05F.A00;
        UserSession userSession = this.A00;
        String str3 = null;
        if (C18U.A06(C06090Tz.A05, userSession, 36325501949785214L)) {
            C9CG c9cg = c31601f3.A00.A01;
            if (c9cg != null && Boolean.TRUE.equals(c9cg.A00)) {
                str = c9cg.A02;
                str2 = c9cg.A03;
            } else {
                str = null;
                str2 = null;
            }
            String str4 = c31601f3.A05;
            String str5 = c80993jT.A04;
            String str6 = ((AbstractC81003jU) c80993jT).A02;
            if (c31601f3.A03) {
                str3 = c31601f3.A01;
            }
            boolean z = ((C1OW) c31601f3).A02.A09;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str6, 3);
            C14360o3.A0B(interfaceC37261GbE, 8);
            if (str5 == null) {
                interfaceC37261GbE.DUq(C114675Fx.A0c, null);
            } else {
                C04060Jx c04060Jx = GraphQlCallInput.A02;
                C0CA A02 = c04060Jx.A02();
                C0CA.A00(A02, str6, "item_id");
                C0CA.A00(A02, str3, "shh_item_id");
                C0CA.A00(A02, str, "disappearing_messages_item_id");
                C0CA.A00(A02, str2, "disappearing_messages_otid");
                C0CA A022 = c04060Jx.A02();
                C0CA.A00(A022, str5, "ig_thread_igid");
                C0CA.A00(A022, str4, "offline_threading_id");
                C0CA.A00(A022, Boolean.valueOf(z), "sampled");
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                C2JO c2jo = c2jm.A00;
                c2jo.A02().A0E(A022, "metadata");
                c2jo.A02().A0E(A02, "data");
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDirectItemSeenMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), IGDirectItemSeenMutationResponseImpl.class, true, null, 0, null, "xig_direct_item_seen", new ArrayList());
                C40701ud A012 = AbstractC40691uc.A01(userSession);
                C43672JTg c43672JTg = new C43672JTg(userSession, interfaceC37261GbE);
                A012.ATV(new C43675JTj(userSession, c43672JTg), new C43674JTi(userSession, c43672JTg), pandoGraphQLRequest);
            }
        } else {
            String str7 = c31601f3.A05;
            String str8 = c80993jT.A04;
            String str9 = ((AbstractC81003jU) c80993jT).A02;
            if (c31601f3.A03) {
                str3 = c31601f3.A01;
            }
            boolean z2 = ((C1OW) c31601f3).A02.A09;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            c25621Ms.A0B(AbstractC13670mt.A06("direct_v2/threads/%s/items/%s/seen/", str8, str9));
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            c25621Ms.A9s("action", "mark_seen");
            c25621Ms.A9s("offline_threading_id", str7);
            c25621Ms.A9s("client_context", str7);
            c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str8);
            c25621Ms.A9s("last_seen_shh_item_id", str3);
            if (z2) {
                c25621Ms.A9s("sampled", "true");
            }
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new EE4(userSession, c31281Dp3);
            C1GJ.A03(A0N);
        }
        C162337Ov.A0Y(c19260xA, num);
    }

    public C31631f6(UserSession userSession) {
        this.A00 = userSession;
    }
}
