package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1mD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35931mD implements InterfaceC29301b7 {
    public static final C0KV A01 = C35941mE.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebook.graphql.calls.GraphQlCallInput, java.lang.Object, X.2JO] */
    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C35911mB c35911mB = (C35911mB) c1ow;
        C14360o3.A0B(c35911mB, 0);
        UserSession userSession = this.A00;
        C34583FLs c34583FLs = c35911mB.A00;
        if (c34583FLs != null) {
            ?? graphQlCallInput = new GraphQlCallInput();
            String str2 = c34583FLs.A01;
            if (str2 != null) {
                graphQlCallInput.A09(str2, "ig_thread_igid");
                List<FNP> list = c34583FLs.A03;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    for (FNP fnp : list) {
                        ?? graphQlCallInput2 = new GraphQlCallInput();
                        graphQlCallInput2.A07(Integer.valueOf(fnp.A00), "item_count");
                        String str3 = fnp.A02;
                        if (str3 != null) {
                            graphQlCallInput2.A09(str3, "range_end_item_id");
                            String str4 = fnp.A03;
                            if (str4 != null) {
                                graphQlCallInput2.A09(str4, "range_end_otid");
                                graphQlCallInput2.A07(Integer.valueOf(fnp.A01), "range_ephemeral_view_duration_sec");
                                String str5 = fnp.A04;
                                if (str5 != null) {
                                    graphQlCallInput2.A09(str5, "range_start_item_id");
                                    String str6 = fnp.A05;
                                    if (str6 != null) {
                                        graphQlCallInput2.A09(str6, "range_start_otid");
                                        arrayList.add(graphQlCallInput2);
                                    } else {
                                        str = "rangeStartOtid";
                                    }
                                } else {
                                    str = "rangeStartItemId";
                                }
                            } else {
                                str = "rangeEndOtid";
                            }
                        } else {
                            str = "rangeEndItemId";
                        }
                    }
                    graphQlCallInput.A05("viewed_item_ranges", arrayList);
                    graphQlCallInput.A09(String.valueOf(c34583FLs.A00), "viewed_timestamp_ms_str");
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    c2jm.A00(graphQlCallInput, "data");
                    C2JQ c2jq = PandoGraphQLRequest.Companion;
                    AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDirectMarkEphemeralItemRangesViewed", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C212969cJ.class, true, null, 0, null, "xig_direct_mark_ephemeral_item_ranges_viewed", new ArrayList()), new C26961Bv2());
                    if (interfaceC37261GbE != null) {
                        interfaceC37261GbE.DUq(null, null);
                        return;
                    }
                    return;
                }
                str = "viewedItemRanges";
            } else {
                str = "igThreadIgid";
            }
        } else {
            str = "seenEphemeralMessageThreadData";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C35931mD(UserSession userSession) {
        this.A00 = userSession;
    }
}
