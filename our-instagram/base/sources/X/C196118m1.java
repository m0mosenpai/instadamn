package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.8m1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196118m1 implements InterfaceC13000lm {
    public Map A00;
    public Map A01;
    public String A02;
    public final UserSession A03;
    public final C41061vE A04;

    public C196118m1(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = AbstractC41041vC.A00(userSession);
        this.A01 = AbstractC06930Yk.A03(A01(null));
        this.A02 = "";
    }

    public final Map A00(CallerContext callerContext, String str, List list) {
        C14360o3.A0B(callerContext, 1);
        C14360o3.A0B(list, 2);
        if (A07() && A08(callerContext, str)) {
            A06(list);
            C41061vE c41061vE = this.A04;
            String str2 = callerContext.A02;
            C14360o3.A07(str2);
            c41061vE.A04(str, str2, list);
            Map map = this.A01;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (list.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                List list2 = ((C130295uZ) entry2.getValue()).A03;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                linkedHashMap2.put(key, arrayList);
            }
            return linkedHashMap2;
        }
        return AbstractC06930Yk.A0E();
    }

    public final synchronized void A02() {
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(this.A03).A01;
        for (String str : AbstractC001800i.A0X(interfaceC19630xq.getAll().keySet())) {
            if (AbstractC002300n.A0h(str, "fx_cal_account_center_service", false)) {
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.EEj(str);
                ARD.apply();
            }
        }
        Map map = this.A00;
        if (map != null) {
            map.clear();
        }
    }

    public final void A03(CallerContext callerContext, InterfaceC196048lu interfaceC196048lu, String str, List list, Map map) {
        C14360o3.A0B(callerContext, 1);
        C14360o3.A0B(list, 2);
        if (A07()) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                C2JO c2jo = new C2JO();
                c2jo.A09(str2, "key");
                c2jo.A09((String) map.get(str2), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                arrayList.add(c2jo);
            }
            C41061vE c41061vE = this.A04;
            String str3 = callerContext.A02;
            C14360o3.A07(str3);
            c41061vE.A05("service_manual_fetch_attempt", str, list, AbstractC06930Yk.A02(new C09530e4("caller_class", str3)));
            final C196378mT c196378mT = new C196378mT(callerContext, this, interfaceC196048lu, str, list);
            final UserSession userSession = this.A03;
            if (AbstractC54472f1.A01() && "".equals(this.A02)) {
                C1UM A00 = C1U4.A00(userSession.deviceSession.A06()).A00("FX_CACHE_FDID_STORE");
                C14360o3.A07(A00);
                String string = A00.getString("fdid", "");
                C14360o3.A07(string);
                this.A02 = string;
            }
            ImmutableSet immutableSet = AbstractC196388mU.A00;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
            C14360o3.A07(copyOf);
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) arrayList);
            C14360o3.A0B(userSession, 0);
            ArrayList arrayList2 = new ArrayList();
            Iterator<E> it = copyOf.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (AbstractC196388mU.A00.contains(next)) {
                    arrayList2.add(next);
                }
            }
            ImmutableList copyOf3 = ImmutableList.copyOf((Collection) arrayList2);
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A05("service_names", copyOf3);
            boolean z = false;
            if (copyOf3 != null) {
                z = true;
            }
            c2jm.A04("caller_name", "fx_product_foundation_client_FXOnline_client_cache");
            c2jm.A04("client_caller_name", str);
            c2jm.A05("custom_partner_params", copyOf2);
            C18C.A0E(z);
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "FxIgConnectedServicesInfoQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C196408mW.class, false, null, 0, null, "fx_service_cache", new ArrayList());
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
            pandoGraphQLRequest.setEnsureCacheWrite(false);
            AbstractC40691uc.A01(userSession).ATW(new InterfaceC48212Jk() { // from class: X.8mY
                @Override // X.InterfaceC48212Jk
                public final void invoke(Throwable th) {
                    C196378mT c196378mT2 = C196378mT.this;
                    C14360o3.A0A(th);
                    c196378mT2.A00(th);
                }
            }, new InterfaceC48192Ji() { // from class: X.8mX
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v2 */
                /* JADX WARN: Type inference failed for: r11v4, types: [X.8m8, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r11v5 */
                /* JADX WARN: Type inference failed for: r1v20, types: [X.5uZ, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v26, types: [X.8m4, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v34, types: [X.8m8, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v14, types: [X.8m8, java.lang.Object] */
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    Map A0E;
                    List<C2JS> list2;
                    String str4;
                    C2JS c2js;
                    ImmutableList requiredCompactedTreeListField;
                    String str5;
                    String str6;
                    String str7;
                    C8m8 c8m8;
                    C8m8 c8m82;
                    C2JS optionalTreeField;
                    C2JS optionalTreeField2;
                    C2JS optionalTreeField3;
                    if (anonymousClass436 == null) {
                        c196378mT.A00(new Throwable("GraphQL response is null"));
                        return;
                    }
                    C2JS c2js2 = (C2JS) anonymousClass436.Bos();
                    if (c2js2 == null) {
                        return;
                    }
                    C196378mT c196378mT2 = c196378mT;
                    UserSession userSession2 = userSession;
                    C2JS optionalTreeField4 = c2js2.getOptionalTreeField(0, "fx_service_cache(caller_name:$caller_name,client_caller_name:$client_caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)", C130275uX.class, 1159217915);
                    if (optionalTreeField4 != null && (requiredCompactedTreeListField = optionalTreeField4.getRequiredCompactedTreeListField(0, "services", C130285uY.class, 139359514)) != null) {
                        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(requiredCompactedTreeListField, 10));
                        if (A0L < 16) {
                            A0L = 16;
                        }
                        A0E = new LinkedHashMap(A0L);
                        Iterator<E> it2 = requiredCompactedTreeListField.iterator();
                        while (it2.hasNext()) {
                            C2JS c2js3 = (C2JS) it2.next();
                            EnumC196398mV enumC196398mV = (EnumC196398mV) c2js3.getOptionalEnumField(0, "service_name", EnumC196398mV.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            if (enumC196398mV == null || (str5 = enumC196398mV.name()) == null) {
                                str5 = "";
                            }
                            EnumC130815vU enumC130815vU = (EnumC130815vU) c2js3.getOptionalEnumField(1, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, EnumC130815vU.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            if (enumC130815vU == null || (str6 = enumC130815vU.name()) == null) {
                                str6 = "";
                            }
                            ImmutableList requiredCompactedTreeListField2 = c2js3.getRequiredCompactedTreeListField(4, "identity_mapping", C130785vR.class, 85196813);
                            C14360o3.A07(requiredCompactedTreeListField2);
                            ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(requiredCompactedTreeListField2, 10));
                            Iterator<E> it3 = requiredCompactedTreeListField2.iterator();
                            while (it3.hasNext()) {
                                C2JS c2js4 = (C2JS) it3.next();
                                String optionalStringField = c2js4.getOptionalStringField(0, "source_identity_id");
                                if (optionalStringField == null) {
                                    optionalStringField = "";
                                }
                                ImmutableList requiredCompactedTreeListField3 = c2js4.getRequiredCompactedTreeListField(1, "destination_identities", C130795vS.class, 1322015678);
                                C14360o3.A07(requiredCompactedTreeListField3);
                                ArrayList arrayList4 = new ArrayList(AbstractC06950Ym.A1E(requiredCompactedTreeListField3, 10));
                                Iterator<E> it4 = requiredCompactedTreeListField3.iterator();
                                while (it4.hasNext()) {
                                    C2JS c2js5 = (C2JS) it4.next();
                                    String optionalStringField2 = c2js5.getOptionalStringField(1, "identity_id");
                                    String str8 = "";
                                    if (optionalStringField2 == null) {
                                        optionalStringField2 = "";
                                    }
                                    EnumC130825vV enumC130825vV = (EnumC130825vV) c2js5.getOptionalEnumField(2, "identity_type", EnumC130825vV.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                    C8m8 c8m83 = 0;
                                    c8m83 = 0;
                                    if (enumC130825vV == null || (str7 = enumC130825vV.name()) == null) {
                                        str7 = "";
                                    }
                                    String optionalStringField3 = c2js5.getOptionalStringField(0, "obfuscated_identity_id");
                                    if (optionalStringField3 == null) {
                                        optionalStringField3 = "";
                                    }
                                    C2JS optionalTreeField5 = c2js5.getOptionalTreeField(3, "surface_to_xpost_eligibility", C130805vT.class, -1959246681);
                                    if (optionalTreeField5 != null && (optionalTreeField3 = optionalTreeField5.getOptionalTreeField(0, "feed", C130835vW.class, 1129334296)) != null) {
                                        boolean coercedBooleanField = optionalTreeField3.getCoercedBooleanField(0, "is_eligible");
                                        String optionalStringField4 = optionalTreeField3.getOptionalStringField(1, "ineligible_reason");
                                        if (optionalStringField4 == null) {
                                            optionalStringField4 = "";
                                        }
                                        ?? obj = new Object();
                                        obj.A01 = "feed";
                                        obj.A02 = coercedBooleanField;
                                        obj.A00 = optionalStringField4;
                                        c8m8 = obj;
                                    } else {
                                        c8m8 = null;
                                    }
                                    C2JS optionalTreeField6 = c2js5.getOptionalTreeField(3, "surface_to_xpost_eligibility", C130805vT.class, -1959246681);
                                    if (optionalTreeField6 != null && (optionalTreeField2 = optionalTreeField6.getOptionalTreeField(1, "story", C130845vX.class, -1718691780)) != null) {
                                        boolean coercedBooleanField2 = optionalTreeField2.getCoercedBooleanField(0, "is_eligible");
                                        String optionalStringField5 = optionalTreeField2.getOptionalStringField(1, "ineligible_reason");
                                        if (optionalStringField5 == null) {
                                            optionalStringField5 = "";
                                        }
                                        ?? obj2 = new Object();
                                        obj2.A01 = "story";
                                        obj2.A02 = coercedBooleanField2;
                                        obj2.A00 = optionalStringField5;
                                        c8m82 = obj2;
                                    } else {
                                        c8m82 = null;
                                    }
                                    C2JS optionalTreeField7 = c2js5.getOptionalTreeField(3, "surface_to_xpost_eligibility", C130805vT.class, -1959246681);
                                    if (optionalTreeField7 != null && (optionalTreeField = optionalTreeField7.getOptionalTreeField(2, "reels", C130855vY.class, -1245036760)) != null) {
                                        boolean coercedBooleanField3 = optionalTreeField.getCoercedBooleanField(0, "is_eligible");
                                        String optionalStringField6 = optionalTreeField.getOptionalStringField(1, "ineligible_reason");
                                        if (optionalStringField6 != null) {
                                            str8 = optionalStringField6;
                                        }
                                        c8m83 = new Object();
                                        c8m83.A01 = "reels";
                                        c8m83.A02 = coercedBooleanField3;
                                        c8m83.A00 = str8;
                                    }
                                    C8m8[] c8m8Arr = {c8m8, c8m82, c8m83};
                                    C14360o3.A0B(c8m8Arr, 0);
                                    arrayList4.add(new C196168m6(optionalStringField2, str7, optionalStringField3, AbstractC009903n.A0I(c8m8Arr)));
                                }
                                ?? obj3 = new Object();
                                obj3.A00 = optionalStringField;
                                obj3.A01 = arrayList4;
                                arrayList3.add(obj3);
                            }
                            ImmutableList requiredCompactedTreeListField4 = c2js3.getRequiredCompactedTreeListField(2, "extra_client_cache_data", C130765vP.class, -729702242);
                            C14360o3.A07(requiredCompactedTreeListField4);
                            HashMap hashMap = new HashMap();
                            Iterator<E> it5 = requiredCompactedTreeListField4.iterator();
                            while (it5.hasNext()) {
                                C2JS c2js6 = (C2JS) it5.next();
                                String optionalStringField7 = c2js6.getOptionalStringField(0, "data_key");
                                String str9 = "";
                                if (optionalStringField7 == null) {
                                    optionalStringField7 = "";
                                }
                                String A08 = c2js6.A08("data_value");
                                if (A08 != null) {
                                    str9 = A08;
                                }
                                hashMap.put(optionalStringField7, str9);
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            C14360o3.A0B(hashMap, 3);
                            ?? obj4 = new Object();
                            obj4.A01 = str6;
                            obj4.A03 = arrayList3;
                            obj4.A02 = hashMap;
                            obj4.A00 = currentTimeMillis;
                            A0E.put(str5, obj4);
                        }
                    } else {
                        A0E = AbstractC06930Yk.A0E();
                    }
                    List list3 = C16930sl.A00;
                    System.currentTimeMillis();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C2JS optionalTreeField8 = c2js2.getOptionalTreeField(0, "fx_service_cache(caller_name:$caller_name,client_caller_name:$client_caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)", C130275uX.class, 1159217915);
                    if (optionalTreeField8 == null || (list2 = optionalTreeField8.getRequiredCompactedTreeListField(0, "services", C130285uY.class, 139359514)) == null) {
                        list2 = list3;
                    }
                    for (C2JS c2js7 : list2) {
                        if (c2js7.getOptionalTreeField(3, "custom_service_data", C130775vQ.class, 897468673) != null) {
                            EnumC196398mV enumC196398mV2 = (EnumC196398mV) c2js7.getOptionalEnumField(0, "service_name", EnumC196398mV.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            if (enumC196398mV2 == null || (str4 = enumC196398mV2.name()) == null) {
                                str4 = "";
                            }
                            C2JS optionalTreeField9 = c2js7.getOptionalTreeField(3, "custom_service_data", C130775vQ.class, 897468673);
                            if (optionalTreeField9 != null) {
                                c2js = optionalTreeField9.reinterpretRequired(0, C130865vZ.class, -1583918415);
                            } else {
                                c2js = null;
                            }
                            linkedHashMap.put(str4, c2js);
                        }
                    }
                    C17060sy.A01.A01(userSession2).A03.getFbidV2();
                    C196118m1 c196118m1 = c196378mT2.A01;
                    C41061vE c41061vE2 = c196118m1.A04;
                    String str10 = c196378mT2.A03;
                    CallerContext callerContext2 = c196378mT2.A00;
                    String str11 = callerContext2.A02;
                    C14360o3.A07(str11);
                    c41061vE2.A05("service_manual_fetch_success", str10, AbstractC001800i.A0a(A0E.keySet()), AbstractC06930Yk.A02(new C09530e4("caller_class", str11)));
                    List list4 = c196378mT2.A04;
                    int A0L2 = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(list4, 10));
                    if (A0L2 < 16) {
                        A0L2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L2);
                    for (Object obj5 : list4) {
                        linkedHashMap2.put(obj5, A0E.get(obj5));
                    }
                    c196118m1.A04(callerContext2, str10, linkedHashMap2);
                    c196118m1.A00 = AbstractC06930Yk.A03(linkedHashMap);
                    InterfaceC196048lu interfaceC196048lu2 = c196378mT2.A02;
                    if (interfaceC196048lu2 == null) {
                        return;
                    }
                    interfaceC196048lu2.onSuccess();
                }
            }, pandoGraphQLRequest, new ExecutorC14110nb(795262476));
        }
    }

    public final synchronized void A05(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(this.A03).A01.ARD();
        ARD.EEj(AnonymousClass001.A0R("fx_cal_account_center_service_", str));
        ARD.apply();
        Map map = this.A00;
        if (map != null) {
            map.remove(str);
        }
    }

    public final synchronized void A06(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = this.A01;
            C130295uZ c130295uZ = (C130295uZ) map.get(str);
            if (c130295uZ != null && System.currentTimeMillis() - c130295uZ.A00 > 86400000) {
                A05(str);
                arrayList.add(str);
            }
            List singletonList = Collections.singletonList(str);
            C14360o3.A07(singletonList);
            Object obj = A01(singletonList).get(str);
            if (obj == null) {
                map.remove(str);
            } else {
                map.put(str, obj);
            }
        }
        if (!arrayList.isEmpty()) {
            this.A04.A05("service_cache_eviction", "ig_android_service_cache_fx_internal", arrayList, null);
        }
    }

    public final boolean A08(CallerContext callerContext, String str) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C1AD.A06(c06090Tz, 18298948683237280L)) {
            if (C1AD.A06(c06090Tz, 18298948683368353L)) {
                String str2 = callerContext.A02;
                return AbstractC86593tX.A0r(new C105914q2(this.A03), C05F.A0C, str, str2);
            }
            String A04 = C1AD.A04(c06090Tz, 18861898636722274L);
            String str3 = callerContext.A02;
            C14360o3.A07(str3);
            return AbstractC105924q3.A00(new C105914q2(this.A03), C05F.A0C, A04, str3, str, false);
        }
        if (C1AD.A06(c06090Tz, 18298948682844062L)) {
            try {
                JSONArray jSONArray = new JSONArray(C1AD.A04(c06090Tz, 18861898636525664L));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    public final Map A01(List list) {
        java.util.Set set;
        try {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A03);
            if (list != null) {
                set = AbstractC001800i.A0k(list);
            } else {
                set = null;
            }
            HashMap hashMap = new HashMap();
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            for (String str : AbstractC001800i.A0X(interfaceC19630xq.getAll().keySet())) {
                if (AbstractC002300n.A0h(str, "fx_cal_account_center_service", false)) {
                    String substring = str.substring(30);
                    C14360o3.A07(substring);
                    if (set == null || set.contains(substring)) {
                        hashMap.put(substring, interfaceC19630xq.getString(str, ""));
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(hashMap.size()));
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                C130295uZ parseFromJson = AbstractC196128m2.parseFromJson(C16V.A00((String) entry.getValue()));
                if (parseFromJson != null) {
                    linkedHashMap.put(key, parseFromJson);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return linkedHashMap;
        } catch (IOException | IllegalStateException unused) {
            return AbstractC06930Yk.A0E();
        }
    }

    public final boolean A07() {
        return C18U.A06(C06090Tz.A05, this.A03, 36311775234425609L);
    }

    public final void A04(CallerContext callerContext, String str, Map map) {
        if (A07()) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                C130295uZ c130295uZ = (C130295uZ) entry.getValue();
                if (c130295uZ == null) {
                    A05(str2);
                } else {
                    synchronized (this) {
                        C14360o3.A0B(str2, 0);
                        StringWriter stringWriter = new StringWriter();
                        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                        A0A.A0d();
                        A0A.A0S(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, c130295uZ.A01);
                        C16V.A03(A0A, "identity_mapping");
                        for (C196148m4 c196148m4 : c130295uZ.A03) {
                            if (c196148m4 != null) {
                                A0A.A0d();
                                String str3 = c196148m4.A00;
                                if (str3 != null) {
                                    A0A.A0S("source_identity_id", str3);
                                }
                                if (c196148m4.A01 != null) {
                                    C16V.A03(A0A, "destination_identities");
                                    for (C196168m6 c196168m6 : c196148m4.A01) {
                                        if (c196168m6 != null) {
                                            A0A.A0d();
                                            A0A.A0S("identity_id", c196168m6.A00);
                                            A0A.A0S("identity_type", c196168m6.A01);
                                            A0A.A0S("obfuscated_identity_id", c196168m6.A02);
                                            C16V.A03(A0A, "surface_to_xpost_eligibilities");
                                            for (C8m8 c8m8 : c196168m6.A03) {
                                                if (c8m8 != null) {
                                                    A0A.A0d();
                                                    String str4 = c8m8.A01;
                                                    if (str4 != null) {
                                                        A0A.A0S("surface", str4);
                                                    }
                                                    A0A.A0T("is_eligible", c8m8.A02);
                                                    String str5 = c8m8.A00;
                                                    if (str5 != null) {
                                                        A0A.A0S("ineligible_reason", str5);
                                                    }
                                                    A0A.A0a();
                                                }
                                            }
                                            A0A.A0Z();
                                            A0A.A0a();
                                        }
                                    }
                                    A0A.A0Z();
                                }
                                A0A.A0a();
                            }
                        }
                        A0A.A0Z();
                        A0A.A0r("custom_data");
                        A0A.A0d();
                        for (Map.Entry entry2 : c130295uZ.A02.entrySet()) {
                            if (!C16V.A04(A0A, entry2)) {
                                A0A.A0u((String) entry2.getValue());
                            }
                        }
                        A0A.A0a();
                        A0A.A0R("last_update_time_ms", c130295uZ.A00);
                        A0A.A0a();
                        A0A.close();
                        String obj = stringWriter.toString();
                        InterfaceC19610xo ARD = AbstractC23021Ah.A00(this.A03).A01.ARD();
                        ARD.E7K(AnonymousClass001.A0R("fx_cal_account_center_service_", str2), obj);
                        ARD.apply();
                    }
                }
                List singletonList = Collections.singletonList(str2);
                C14360o3.A07(singletonList);
                Object obj2 = A01(singletonList).get(str2);
                Map map2 = this.A01;
                if (obj2 == null) {
                    map2.remove(str2);
                } else {
                    map2.put(str2, obj2);
                }
            }
            C41061vE c41061vE = this.A04;
            String str6 = callerContext.A02;
            C14360o3.A07(str6);
            c41061vE.A05("service_cache_write", str, AbstractC001800i.A0a(map.keySet()), AbstractC06930Yk.A02(new C09530e4("caller_class", str6)));
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A02();
        this.A01.clear();
        this.A03.A03(C196118m1.class);
    }

    public C196118m1() {
    }
}
