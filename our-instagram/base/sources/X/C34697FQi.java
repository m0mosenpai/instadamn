package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.FQi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34697FQi {
    public final PandoGraphQLRequest A00(UserSession userSession, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        String str5 = str4;
        C14360o3.A0B(userSession, 0);
        AbstractC25229BEm.A1I(str3, 3, str5);
        long A00 = AbstractC82073lT.A00(userSession);
        if (A00 > 0) {
            str5 = "";
        }
        boolean z = true;
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, true, "enableGroups");
        C0CA.A00(A0T, str5, "rank_token");
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("query", str);
        A0b.A04("search_surface", "follow_list_page");
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36323002278816609L) && !C18U.A06(c06090Tz, userSession, 36323002279013220L)) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        A0b.A02(AbstractC58317Pt9.A00(108), valueOf);
        boolean A1W = AbstractC167007dF.A1W(valueOf);
        A0b.A01(AbstractC58317Pt9.A00(109));
        Boolean A0c = AbstractC166997dE.A0c(c06090Tz, userSession, 36324673022669163L);
        A0b.A02(AbstractC58317Pt9.A00(25), A0c);
        boolean A1W2 = AbstractC167007dF.A1W(A0c);
        AbstractC31173DnH.A1M(A0T, A0b.A00, "request_data");
        A0b.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str3);
        A0b.A04("max_id", str2);
        PandoGraphQLRequest A002 = AbstractC35855FsV.A00(A0b, A0b2, A1W2, A1W);
        if (A00 > 0) {
            A002.setFreshCacheAgeMs(A00);
            StringBuilder A0y = AbstractC31174DnI.A0y(num2);
            A0y.append('-');
            A002.setAdditionalCacheQueryKey(AbstractC166997dE.A0v(num, A0y));
        }
        C14360o3.A0A(A002);
        return A002;
    }

    public final PandoGraphQLRequest A01(UserSession userSession, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1H(str4, 4, str6);
        long A00 = AbstractC82073lT.A00(userSession);
        if (A00 > 0) {
            str6 = "";
        }
        boolean z = true;
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, true, AbstractC111324zv.A00(1007));
        C0CA.A00(A0T, "follow_list_page", "search_surface");
        C0CA.A00(A0T, str6, "rank_token");
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("query", str);
        A0b.A02("enable_groups", true);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36323002278882146L) && !C18U.A06(c06090Tz, userSession, 36323002279013220L)) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        A0b.A02(AbstractC58317Pt9.A00(108), valueOf);
        boolean A1W = AbstractC167007dF.A1W(valueOf);
        A0b.A01(AbstractC58317Pt9.A00(109));
        Boolean A0c = AbstractC166997dE.A0c(c06090Tz, userSession, 36324673022669163L);
        A0b.A02(AbstractC58317Pt9.A00(25), A0c);
        boolean A1W2 = AbstractC167007dF.A1W(A0c);
        AbstractC31173DnH.A1M(A0T, A0b.A00, "request_data");
        A0b.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4);
        A0b.A04("max_id", str3);
        A0b.A04("order", str2);
        C18C.A0E(A1W);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25227BEk.A0U(A1W2), "FollowingList", A0b.getParamsCopy(), A0b2.getParamsCopy(), C67489Ump.class, false, null, 0, null, "xdt_api__v1__friendships__following", AbstractC166987dD.A1E());
        if (A00 > 0) {
            pandoGraphQLRequest.setFreshCacheAgeMs(A00);
            StringBuilder A0y = AbstractC31174DnI.A0y(num2);
            A0y.append('-');
            pandoGraphQLRequest.setAdditionalCacheQueryKey(AbstractC166997dE.A0v(num, A0y));
        }
        return pandoGraphQLRequest;
    }
}
