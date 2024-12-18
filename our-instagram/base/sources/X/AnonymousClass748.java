package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.748, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass748 {
    public static final C1ON A01(UserSession userSession, C37494GfC c37494GfC, AnonymousClass501 anonymousClass501, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str4;
        String username;
        Integer BQb;
        String str5;
        C14360o3.A0B(userSession, 0);
        C25621Ms A02 = C93o.A02(userSession, c37494GfC, anonymousClass501, str);
        A02.A0I("exclude_comment", z);
        A02.A08(C05F.A0Y);
        if (str != null) {
            A02.A9s("max_id", str);
        }
        if (z2) {
            A02.A9s("opal_only", "true");
        }
        if (z5) {
            A02.A9s("is_pull_to_refresh", "true");
        }
        A02.A9s("profile_grid_items_cursor", str2);
        A02.A9s("pinned_profile_grid_items_ids", str3);
        if (z3) {
            A02.A9s("fetch_profile_grid_items", "true");
            if (anonymousClass501 instanceof AnonymousClass500) {
                str5 = ((AnonymousClass500) anonymousClass501).A00;
            } else if (anonymousClass501 instanceof C50617MWe) {
                str5 = ((C50617MWe) anonymousClass501).A00;
            } else {
                throw new RuntimeException();
            }
            A02.A0A = AnonymousClass001.A0R(str5, str2);
        }
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36609532432095122L);
        if (A01 > 0) {
            A02.A08(C05F.A0N);
            ((AbstractC23721Ec) A02).A01 = TimeUnit.SECONDS.toMillis(A01);
            User A00 = C08730cb.A00(userSession).A00();
            if (anonymousClass501 instanceof AnonymousClass500) {
                str4 = ((AnonymousClass500) anonymousClass501).A00;
                username = AbstractC76433bn.A00(A00);
            } else if (anonymousClass501 instanceof C50617MWe) {
                str4 = ((C50617MWe) anonymousClass501).A00;
                username = A00.getUsername();
            }
            if (C14360o3.A0K(str4, username) && (BQb = A00.A03.BQb()) != null) {
                A02.A0A = String.valueOf(BQb.intValue());
            }
        }
        A02.A0I("should_delay_media_metadata_fetch", z4);
        return A02.A0N();
    }

    public static final C1ON A02(UserSession userSession, AnonymousClass501 anonymousClass501, String str, boolean z) {
        return A01(userSession, null, anonymousClass501, str, null, null, true, z, false, false, false);
    }

    public static final C24531Hw A03(C1ET c1et, UserSession userSession, C37494GfC c37494GfC, AnonymousClass501 anonymousClass501, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Object[] objArr;
        String str4;
        String str5;
        Integer num;
        boolean z6 = anonymousClass501 instanceof AnonymousClass500;
        if (z6) {
            objArr = new Object[]{((AnonymousClass500) anonymousClass501).A00};
            str4 = "feed/user_stream/%s/";
        } else if (anonymousClass501 instanceof C50617MWe) {
            objArr = new Object[]{((C50617MWe) anonymousClass501).A00};
            str4 = "feed/user/%s/username_stream/";
        } else {
            throw new RuntimeException();
        }
        String A06 = AbstractC13670mt.A06(str4, objArr);
        C23711Eb c23711Eb = new C23711Eb(userSession, 1300788553, 1, false);
        c23711Eb.A09(C05F.A01);
        c23711Eb.A0B(A06);
        c23711Eb.A0A = AnonymousClass001.A0R(A06, str);
        c23711Eb.A01 = new C23751Eh(new C07510aQ(userSession), new C25611Mr(null), C2045593p.class, true, false);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323264271887486L)) {
            c23711Eb.A9s("can_support_carousel_mentions", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (c37494GfC != null) {
            C19P.A01.add(new C151536rz(c37494GfC));
        }
        c23711Eb.A08(C05F.A0Y);
        if (str != null) {
            c23711Eb.A9s("max_id", str);
        }
        if (C18U.A06(c06090Tz, userSession, 36323745308946004L) && c1et != null && (num = c1et.A00) != null) {
            c23711Eb.A0G("X-IG-Accept-Hint", AbstractC23791Em.A00(num));
        }
        c23711Eb.A9s("profile_grid_items_cursor", str2);
        c23711Eb.A9s("pinned_profile_grid_items_ids", str3);
        if (z2) {
            c23711Eb.A9s("fetch_profile_grid_items", "true");
            if (z6) {
                str5 = ((AnonymousClass500) anonymousClass501).A00;
            } else if (anonymousClass501 instanceof C50617MWe) {
                str5 = ((C50617MWe) anonymousClass501).A00;
            } else {
                throw new RuntimeException();
            }
            c23711Eb.A0A = AnonymousClass001.A0R(str5, str2);
        }
        if (z3) {
            c23711Eb.A9s("fetch_all_highlights", "true");
        }
        if (z4) {
            c23711Eb.A9s("is_pull_to_refresh", "true");
        }
        long A01 = C18U.A01(c06090Tz, userSession, 36609532432095122L);
        if (A01 > 0 && !z) {
            c23711Eb.A08(C05F.A0N);
            ((AbstractC23721Ec) c23711Eb).A01 = TimeUnit.SECONDS.toMillis(A01);
        }
        if (z5) {
            c23711Eb.A9s("should_delay_media_metadata_fetch", "true");
        }
        if (C18U.A06(c06090Tz, userSession, 36328117586574534L)) {
            ((AbstractC23721Ec) c23711Eb).A06 = EnumC23341Bw.CriticalAPI;
        }
        return c23711Eb.A0N();
    }

    public static final C1Dk A00(UserSession userSession, C37494GfC c37494GfC, AnonymousClass501 anonymousClass501, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C1Dk A00;
        if (anonymousClass501 instanceof AnonymousClass500) {
            if (c37494GfC != null) {
                c37494GfC.A0J("profile_query_type", CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            }
            A00 = C93o.A01(userSession, num, ((AnonymousClass500) anonymousClass501).A00, str, str2, str3, z, z2, z3, z4, z5, false, z6, z7, z8);
        } else if (anonymousClass501 instanceof C50617MWe) {
            if (c37494GfC != null) {
                c37494GfC.A0J("profile_query_type", AbstractC31188DnX.A01());
            }
            A00 = C93o.A00(userSession, num, ((C50617MWe) anonymousClass501).A00, str, str2, str3, z, z2, z3, z4, z5, false, z6, z7, z8);
        } else {
            throw new RuntimeException();
        }
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.facebook.graphql.query.interfaces.IGraphQLRequest<com.facebook.graphql.modelutil.GraphQLModel>");
        return A00;
    }
}
