package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;

/* renamed from: X.93o, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C93o {
    public static final C1Dk A00(UserSession userSession, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C14360o3.A0B(str, 4);
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        C0CA c0ca = null;
        if (str2 != null) {
            c0ca = c04060Jx.A02();
            C0CA.A00(c0ca, str2, "max_id");
        }
        if (c0ca == null) {
            c0ca = c04060Jx.A02();
        }
        C0CA.A00(c0ca, 12, "count");
        if (z4) {
            C0CA.A00(c0ca, "true", "opal_only");
        }
        if (z7) {
            C0CA.A00(c0ca, true, "fetch_profile_grid_items");
        }
        C0CA.A00(c0ca, str3, "profile_grid_items_cursor");
        C0CA.A00(c0ca, str4, "pinned_profile_grid_items_ids");
        C0CA.A00(c0ca, String.valueOf(z5), "exclude_comment");
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323264271887486L)) {
            C0CA.A00(c0ca, true, AbstractC111324zv.A00(356));
        }
        if (z9) {
            C0CA.A00(c0ca, 1, "is_pull_to_refresh");
        }
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm2.A01("use_defer");
        c2jm2.A01("use_batch_defer");
        c2jm.A01("is_client_hints_enabled");
        c2jm.A01("fetch_profile_grid_items");
        c2jm.A01("include_carousel_media_in_first_chunk");
        c2jm.A04(AbstractC31188DnX.A01(), str);
        c2jm.A00.A02().A0E(c0ca, "request_data");
        c2jm2.A02("use_defer", Boolean.valueOf(z));
        c2jm2.A02("use_batch_defer", Boolean.valueOf(z2));
        c2jm.A02("is_client_hints_enabled", Boolean.valueOf(z3));
        c2jm.A02("fetch_profile_grid_items", Boolean.valueOf(z7));
        c2jm.A02("include_carousel_media_in_first_chunk", Boolean.valueOf(z8));
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGProfileTimelineByUsernameQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C60134QuW.class, false, null, 0, null, "xdt_api__v1__profile_timeline_by_username", new ArrayList());
        AbstractC208049Il.A01(pandoGraphQLRequest, userSession, num);
        pandoGraphQLRequest.addTrackedHttpResponseHeader("X-IG-Request-Elapsed-Time-MS");
        if (z6) {
            pandoGraphQLRequest.addAdditionalHttpHeader("x_RESPONSE_SHAPE_LOGGING", String.valueOf(pandoGraphQLRequest.hashCode()));
        }
        C1Dk c1Dk = pandoGraphQLRequest;
        if (C18U.A06(c06090Tz, userSession, 36317320037995571L)) {
            c1Dk = pandoGraphQLRequest.setEnableCacheReadWriteOnCallerThread_DO_NOT_USE(true);
        }
        C14360o3.A0A(c1Dk);
        return c1Dk;
    }

    public static final C1Dk A01(UserSession userSession, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C14360o3.A0B(str, 4);
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        C0CA c0ca = null;
        if (str2 != null) {
            c0ca = c04060Jx.A02();
            C0CA.A00(c0ca, str2, "max_id");
        }
        if (c0ca == null) {
            c0ca = c04060Jx.A02();
        }
        C0CA.A00(c0ca, 12, "count");
        if (z4) {
            C0CA.A00(c0ca, "true", "opal_only");
        }
        if (z7) {
            C0CA.A00(c0ca, true, "fetch_profile_grid_items");
        }
        C0CA.A00(c0ca, str3, "profile_grid_items_cursor");
        C0CA.A00(c0ca, str4, "pinned_profile_grid_items_ids");
        C0CA.A00(c0ca, String.valueOf(z5), "exclude_comment");
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323264271887486L)) {
            C0CA.A00(c0ca, true, AbstractC111324zv.A00(356));
        }
        if (z9) {
            C0CA.A00(c0ca, 1, "is_pull_to_refresh");
        }
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm2.A02("use_defer", false);
        c2jm2.A02("use_batch_defer", false);
        c2jm.A02("is_client_hints_enabled", false);
        c2jm.A02("fetch_profile_grid_items", false);
        c2jm.A02("include_carousel_media_in_first_chunk", false);
        c2jm.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        c2jm.A00.A02().A0E(c0ca, "_request_data");
        c2jm2.A02("use_defer", Boolean.valueOf(z));
        c2jm2.A02("use_batch_defer", Boolean.valueOf(z2));
        c2jm.A02("is_client_hints_enabled", Boolean.valueOf(z3));
        c2jm.A02("fetch_profile_grid_items", Boolean.valueOf(z7));
        c2jm.A02("include_carousel_media_in_first_chunk", Boolean.valueOf(z8));
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGProfileTimelineQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C58592PyK.class, false, null, 0, null, "xdt_api__v1__profile_timeline", new ArrayList());
        AbstractC208049Il.A01(pandoGraphQLRequest, userSession, num);
        pandoGraphQLRequest.addTrackedHttpResponseHeader("X-IG-Request-Elapsed-Time-MS");
        if (z6) {
            pandoGraphQLRequest.addAdditionalHttpHeader("x_RESPONSE_SHAPE_LOGGING", String.valueOf(pandoGraphQLRequest.hashCode()));
        }
        C1Dk c1Dk = pandoGraphQLRequest;
        if (C18U.A06(c06090Tz, userSession, 36317320037995571L)) {
            c1Dk = pandoGraphQLRequest.setEnableCacheReadWriteOnCallerThread_DO_NOT_USE(true);
        }
        C14360o3.A0A(c1Dk);
        return c1Dk;
    }

    public static final C25621Ms A02(UserSession userSession, C37494GfC c37494GfC, AnonymousClass501 anonymousClass501, String str) {
        Object[] objArr;
        String str2;
        if (anonymousClass501 instanceof AnonymousClass500) {
            objArr = new Object[]{((AnonymousClass500) anonymousClass501).A00};
            str2 = "feed/user/%s/";
        } else if (anonymousClass501 instanceof C50617MWe) {
            objArr = new Object[]{((C50617MWe) anonymousClass501).A00};
            str2 = "feed/user/%s/username/";
        } else {
            throw new RuntimeException();
        }
        String A06 = AbstractC13670mt.A06(str2, objArr);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B(A06);
        c25621Ms.A0A = AnonymousClass001.A0R(A06, str);
        c25621Ms.A02 = new C25581Mo(new C07510aQ(userSession), C2045593p.class);
        if (c37494GfC != null) {
            C19P.A01.add(new C151536rz(c37494GfC));
        }
        return c25621Ms;
    }
}
