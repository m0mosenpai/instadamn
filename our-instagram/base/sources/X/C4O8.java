package X;

import android.util.Pair;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4O8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4O8 implements C0JG {
    public static final InterfaceC09390do A04 = AbstractC09440dt.A00(EnumC09460dv.A04, C4OA.A00);
    public final int A00;
    public final C918349l A01;
    public final C4O7 A02;
    public final C73163Pr A03;

    @Override // X.C0JG
    public final void ATM(final UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        C14360o3.A0B(userSession, 0);
        ImmutableSetMultimap immutableSetMultimap = this.A02.A00;
        if (immutableSetMultimap.isEmpty()) {
            C0K8.A0P("IGFetcherUserOperationPayload", "%s is not in experiment and will not retrieve via background fetch", userSession.userId);
            this.A03.A0L(new C117145Rz(null, userSession.userId));
            return;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36329358830354726L)) {
            C918349l c918349l = this.A01;
            ImmutableSet keySet = ((ImmutableMultimap) immutableSetMultimap).A01.keySet();
            C14360o3.A07(keySet);
            List<QuickPromotionSurface> A0a = AbstractC001800i.A0a(keySet);
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0a, 10));
            for (QuickPromotionSurface quickPromotionSurface : A0a) {
                ImmutableSet AXV = immutableSetMultimap.AXV(quickPromotionSurface);
                C14360o3.A07(AXV);
                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(AXV, 10));
                Iterator<E> it = AXV.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Trigger) it.next()).A01);
                }
                C2JO c2jo = new C2JO();
                c2jo.A09(quickPromotionSurface.A01.toString(), "surface_id");
                c2jo.A05("triggers", arrayList2);
                arrayList.add(c2jo);
            }
            ImmutableMap immutableMap = c918349l.A00.A00;
            ArrayList arrayList3 = new ArrayList();
            C1LC it2 = ((ImmutableCollection) immutableMap.entrySet()).iterator();
            C14360o3.A07(it2);
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                C2JO c2jo2 = new C2JO();
                c2jo2.A09((String) entry.getKey(), "context_key");
                c2jo2.A09((String) entry.getValue(), "context_value");
                arrayList3.add(c2jo2);
            }
            C2JO c2jo3 = new C2JO();
            c2jo3.A05("context_data_tuples", arrayList3);
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
            if (copyOf == null) {
                copyOf = ImmutableList.of();
            }
            c2jm.A05("surface_triggers", copyOf);
            c2jm.A03("scale", Double.valueOf(this.A00));
            c2jm.A00(c2jo3, "trigger_context");
            c2jm.A04("bloks_version", "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "QuickPromotionSurfaceQueryV3", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67118Ugo.class, false, null, 0, null, "ig_quick_promotion_batch_fetch_root", new ArrayList());
            C40701ud A01 = AbstractC40691uc.A01(userSession);
            C70566Wd0 c70566Wd0 = new C70566Wd0(userSession, this);
            A01.ATV(new C70433WVl(c70566Wd0), new C70446WVy(c70566Wd0), pandoGraphQLRequest);
            return;
        }
        A04.getValue();
        C918349l c918349l2 = this.A01;
        int i = this.A00;
        JSONObject jSONObject = new JSONObject();
        ImmutableMap immutableMap2 = ((ImmutableMultimap) immutableSetMultimap).A01;
        C14360o3.A07(immutableMap2);
        for (Map.Entry entry2 : immutableMap2.entrySet()) {
            QuickPromotionSurface quickPromotionSurface2 = (QuickPromotionSurface) entry2.getKey();
            Collection collection = (Collection) entry2.getValue();
            JSONArray jSONArray = new JSONArray();
            Iterator it3 = collection.iterator();
            while (it3.hasNext()) {
                jSONArray.put(((Trigger) it3.next()).A01);
            }
            try {
                jSONObject.put(String.valueOf(quickPromotionSurface2.A00), jSONArray);
            } catch (JSONException e) {
                C0K8.A0L("IGFetcherUserOperationPayload", AbstractC111324zv.A00(1623), e, "surfaces_to_triggers");
            }
        }
        String obj = jSONObject.toString();
        C14360o3.A07(obj);
        C55732hE c55732hE = c918349l2.A00;
        if (c55732hE.A00.isEmpty()) {
            HashMap hashMap = new HashMap();
            if (!immutableMap2.isEmpty()) {
                Iterator it4 = immutableMap2.entrySet().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it4.next();
                    Object key = entry3.getKey();
                    Collection collection2 = (Collection) entry3.getValue();
                    QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0e;
                    C14360o3.A0A(key);
                    Map map = AbstractC61082qW.A01;
                    C14360o3.A0B(key, 1);
                    List A012 = AbstractC61082qW.A01(quickPromotionSlot);
                    ArrayList arrayList4 = new ArrayList(A012.size());
                    Iterator it5 = A012.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(((EnumC61092qX) it5.next()).A00);
                    }
                    if (arrayList4.contains(key)) {
                        C14360o3.A0A(collection2);
                        C14360o3.A0B(collection2, 1);
                        C14360o3.A0B(quickPromotionSlot, 0);
                        Collection collection3 = (Collection) AbstractC61082qW.A00.get(quickPromotionSlot);
                        if (collection3 != null && !Collections.disjoint(collection3, collection2)) {
                            Pair A00 = C6C0.A00(userSession);
                            if (A00 != null) {
                                hashMap.put("lat", A00.first.toString());
                                hashMap.put("lng", A00.second.toString());
                            }
                        }
                    }
                }
            }
            c55732hE = new C55732hE(hashMap);
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("qp/batch_fetch/");
        c25621Ms.A9s("vc_policy", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        c25621Ms.A9s("version", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        c25621Ms.A9s("surfaces_to_triggers", obj);
        c25621Ms.A9s("scale", String.valueOf(i));
        c25621Ms.A9s("is_sdk", "true");
        ImmutableMap immutableMap3 = c55732hE.A00;
        if (!immutableMap3.isEmpty()) {
            C14360o3.A0C(immutableMap3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            c25621Ms.A9s("trigger_context", new JSONObject(immutableMap3).toString());
        }
        c25621Ms.A0P(null, C4OV.class, C4OY.class, false);
        c25621Ms.A0R = true;
        C1ON A0N = c25621Ms.A0N();
        final C73163Pr c73163Pr = this.A03;
        A0N.A00 = new C1P1(userSession, c73163Pr) { // from class: X.4Oc
            public final UserSession A00;
            public final C73163Pr A01;

            {
                C14360o3.A0B(c73163Pr, 2);
                this.A00 = userSession;
                this.A01 = c73163Pr;
            }

            @Override // X.C1P1
            public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-766511324);
                UserSession userSession2 = this.A00;
                AbstractC31546DtW.A00(userSession2, C05F.A1F, "IGFetcherCallback: Failed to fetch promotions", null);
                this.A01.A0L(new C117145Rz(null, userSession2.userId));
                C0f9.A0A(-727736410, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj2) {
                int A03 = C0f9.A03(-179569229);
                C4OV c4ov = (C4OV) obj2;
                int A032 = C0f9.A03(1130505584);
                C14360o3.A0B(c4ov, 0);
                C73163Pr c73163Pr2 = this.A01;
                UserSession userSession2 = this.A00;
                c73163Pr2.A0L(new C117145Rz(c4ov, userSession2.userId));
                if (C18U.A06(C06090Tz.A05, userSession2, 36329358830420263L)) {
                    AbstractC31546DtW.A00(userSession2, C05F.A02, "IGFetcherCallback: success call", null);
                }
                C0f9.A0A(708738284, A032);
                C0f9.A0A(-996622988, A03);
            }
        };
        C1GJ.A03(A0N);
    }

    public C4O8(C918349l c918349l, C4O7 c4o7, C73163Pr c73163Pr, int i) {
        this.A01 = c918349l;
        this.A00 = i;
        this.A03 = c73163Pr;
        this.A02 = c4o7;
    }
}
