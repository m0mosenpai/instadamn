package X;

import com.facebook.pando.Summary;
import com.google.common.collect.ImmutableList;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.42o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C907542o {
    public AbstractC12990ll A00;
    public C907642p A01;
    public InterfaceC907842r A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public final C1ON A06() {
        C907642p c907642p = this.A01;
        if (c907642p != null) {
            AbstractC12990ll abstractC12990ll = this.A00;
            if (abstractC12990ll != null) {
                InterfaceC907842r interfaceC907842r = this.A02;
                if (interfaceC907842r != null) {
                    try {
                        String aSCIIString = C1HO.A06().toASCIIString();
                        C908142u A00 = AbstractC908042t.A00();
                        String str = c907642p.A01;
                        C1Ee A01 = A01(this, A00.clientDocIdForQuery(str));
                        String str2 = c907642p.A02;
                        if (str2 != null) {
                            A01.A05("variables", str2);
                        }
                        String str3 = null;
                        String A04 = C18U.A04(C06090Tz.A05, abstractC12990ll, 36875244878692419L);
                        ConcurrentHashMap concurrentHashMap = C4IG.A01;
                        if (!concurrentHashMap.containsKey(A04)) {
                            concurrentHashMap.put(A04, new C4IG(A04));
                        }
                        if (((C4IG) AbstractC09990gB.A0I(A04, concurrentHashMap)).A00.contains(str)) {
                            C3JU A002 = C3JU.A02.A00();
                            synchronized (A002) {
                                str3 = A002.A00;
                            }
                        }
                        C14360o3.A0A(aSCIIString);
                        return A00(A01, abstractC12990ll, interfaceC907842r, aSCIIString, str, str3);
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    } catch (JSONException e2) {
                        throw new IllegalStateException(e2);
                    }
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException(AbstractC58317Pt9.A00(621));
        }
        throw new IllegalStateException(AbstractC58317Pt9.A00(70));
    }

    public final C1ON A07(Integer num) {
        String str;
        String str2;
        String clientDocIdForQuery;
        C907642p c907642p = this.A01;
        if (c907642p != null) {
            AbstractC12990ll abstractC12990ll = this.A00;
            if (abstractC12990ll != null) {
                InterfaceC907842r interfaceC907842r = this.A02;
                if (interfaceC907842r != null) {
                    if (num.intValue() != 0) {
                        str = "/api/v1/wwwgraphql/ig/query/";
                    } else {
                        str = "/api/v1/ads/graphql/";
                    }
                    String A03 = C1HO.A03(str);
                    try {
                        if (num.intValue() != 0) {
                            C908142u A00 = AbstractC908042t.A00();
                            str2 = c907642p.A01;
                            clientDocIdForQuery = A00.clientDocIdForQuery(str2);
                        } else {
                            C85713s0 A002 = C85713s0.A01.A00();
                            str2 = c907642p.A01;
                            clientDocIdForQuery = A002.clientDocIdForQuery(str2);
                        }
                        C1Ee A01 = A01(this, clientDocIdForQuery);
                        String str3 = c907642p.A02;
                        if (str3 != null) {
                            A01.A05("variables", str3);
                        }
                        return A00(A01, abstractC12990ll, interfaceC907842r, A03, str2, null);
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    } catch (JSONException e2) {
                        throw new IllegalStateException(e2);
                    }
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("User session required for proxied GraphQL call");
        }
        throw new IllegalStateException(AbstractC58317Pt9.A00(70));
    }

    public final void A08(final C1Dk c1Dk) {
        C14360o3.A0B(c1Dk, 0);
        String callName = c1Dk.getCallName();
        C14360o3.A07(callName);
        this.A01 = new C907642p(null, callName, new JSONObject(c1Dk.getQueryParams().getParamsCopy()).toString(), false);
        this.A02 = new InterfaceC907842r(c1Dk) { // from class: X.42q
            public boolean A00;
            public final C1Dk A01;

            @Override // X.InterfaceC907842r
            public final void EVy(boolean z) {
                this.A00 = true;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [X.SxQ, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [X.SxQ, java.lang.Object] */
            @Override // X.InterfaceC25601Mq
            public final /* bridge */ /* synthetic */ Object then(Object obj) {
                Object obj2;
                String str;
                C3JY c3jy = (C3JY) obj;
                C14360o3.A0B(c3jy, 0);
                try {
                    InterfaceC26481Qd A00 = c3jy.A00();
                    if (A00 != null) {
                        InputStream AjT = A00.AjT();
                        try {
                            String A002 = AnonymousClass433.A00(new InputStreamReader(AjT));
                            if (A002 != null && A002.length() != 0) {
                                C1Dk c1Dk2 = this.A01;
                                boolean z = this.A00;
                                Class treeModelType = c1Dk2.getTreeModelType();
                                try {
                                    JSONObject jSONObject = new JSONObject(A002);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                                    if (optJSONObject == null) {
                                        JSONArray optJSONArray = jSONObject.optJSONArray("errors");
                                        if (optJSONArray != null && optJSONArray.length() > 0) {
                                            ArrayList arrayList = new ArrayList();
                                            for (int i = 0; i < optJSONArray.length(); i++) {
                                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                                                ?? obj3 = new Object();
                                                obj3.A00 = jSONObject2;
                                                arrayList.add(obj3);
                                            }
                                            boolean z2 = false;
                                            Iterator it = arrayList.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                if ("CRITICAL".equals(((InterfaceC65563Tmj) it.next()).Bu2())) {
                                                    z2 = true;
                                                    break;
                                                }
                                            }
                                            if (!z || z2) {
                                                throw new C907942s(AnonymousClass001.A0g(c1Dk2.getCallName(), " Response Errors: ", optJSONArray.toString()), arrayList);
                                            }
                                        }
                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                                        if (optJSONObject2 != null) {
                                            obj2 = treeModelType.getConstructor(JSONObject.class).newInstance(optJSONObject2);
                                        } else {
                                            throw new C907942s(AnonymousClass001.A0g(c1Dk2.getCallName(), " Response Error: missing or invalid 'data' in response: ", jSONObject.toString()), ImmutableList.of());
                                        }
                                    } else {
                                        String A11 = AnonymousClass001.A11(c1Dk2.getCallName(), " Response Error: ", optJSONObject.toString(), " in response: ", jSONObject.toString());
                                        ?? obj4 = new Object();
                                        obj4.A00 = optJSONObject;
                                        throw new C907942s(A11, ImmutableList.of((Object) obj4));
                                    }
                                } catch (JSONException e) {
                                    throw new JSONException(AnonymousClass001.A0R("Invalid JSON response from server: ", A002), e);
                                }
                            } else {
                                obj2 = null;
                            }
                            AjT.close();
                            if (c3jy.A01("X-IG-ANDROID-FROM-DISK-CACHE") != null) {
                                str = "fresh_cache";
                            } else {
                                str = "network";
                            }
                            return new AnonymousClass435(new Summary(str, true, "", 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, "", 0L, 0L, false, ""), obj2, c3jy.A02);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C20I.A00(AjT, th);
                                throw th2;
                            }
                        }
                    }
                    throw new IllegalStateException("Required value was null.");
                } catch (C907942s e2) {
                    ImmutableList immutableList = e2.A00;
                    C14360o3.A07(immutableList);
                    throw new VI9(immutableList);
                }
            }

            {
                this.A01 = c1Dk;
            }
        };
    }

    public final void A09(C907642p c907642p) {
        C14360o3.A0B(c907642p, 0);
        this.A01 = c907642p;
        this.A02 = new C60d(c907642p.A00, c907642p.A03);
    }

    private final C1ON A00(final C1Ee c1Ee, final AbstractC12990ll abstractC12990ll, InterfaceC907842r interfaceC907842r, final String str, final String str2, final String str3) {
        final C1JO c1jo;
        c1Ee.A05("strip_nulls", "true");
        c1Ee.A05("strip_defaults", "true");
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36311732284556022L)) {
            c1jo = null;
        } else {
            c1jo = new C1JO(abstractC12990ll);
        }
        C1OK c1ok = new C1OK();
        C908342w A02 = AbstractC24481Hr.A06.A00(new Callable() { // from class: X.42v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1JP c1jp;
                AbstractC12990ll abstractC12990ll2 = abstractC12990ll;
                if (C18U.A06(C06090Tz.A05, abstractC12990ll2, 36311732284556022L)) {
                    c1jp = new C1JO(abstractC12990ll2);
                } else {
                    c1jp = c1jo;
                }
                C26371Ps c26371Ps = new C26371Ps(c1jp);
                c26371Ps.A02(str);
                c26371Ps.A00 = c1Ee.A00(true);
                c26371Ps.A01(C05F.A01);
                c26371Ps.A05 = true;
                c26371Ps.A03("x-graphql-client-library", "minimal");
                String str4 = str2;
                if (str4.length() > 0) {
                    c26371Ps.A03("X-FB-Friendly-Name", str4);
                }
                C1QX A03 = C907542o.A03(this, str4);
                String str5 = str3;
                if (str5 != null) {
                    c26371Ps.A03("x-ig-graphql-region-hint", str5);
                }
                return new C26461Qb(c26371Ps.A00(), A03.A00());
            }
        }, -6, 2, false, true).A02(new C26561Ql(c1ok.A00), 528, 2, true, true).A02(interfaceC907842r, 529, 2, false, true);
        C14360o3.A0B(str, 3);
        return new C1ON(c1ok, AbstractC908442x.A00(A02), "GraphQLApi", str);
    }

    public static final InterfaceC40801un A02(C1Ee c1Ee, AbstractC12990ll abstractC12990ll, C907542o c907542o, InterfaceC907842r interfaceC907842r, String str, String str2) {
        C26371Ps c26371Ps = new C26371Ps(new C1JO(abstractC12990ll));
        c26371Ps.A02(str2);
        c26371Ps.A01(C05F.A01);
        c26371Ps.A05 = true;
        InterfaceC26421Px A00 = c1Ee.A00(true);
        if (A00 != null) {
            c26371Ps.A00 = A00;
        }
        C3JY A01 = C23311Bt.A00().A01(new C26461Qb(c26371Ps.A00(), A03(c907542o, str).A00()));
        C14360o3.A07(A01);
        return (InterfaceC40801un) interfaceC907842r.then(A01);
    }

    public static final C1QX A03(C907542o c907542o, String str) {
        C1QX c1qx = new C1QX();
        c1qx.A04 = EnumC23341Bw.GraphQL;
        c1qx.A03 = C1Ef.OffScreen;
        c1qx.A0A = str;
        c1qx.A0C = "graphql:api";
        String str2 = c907542o.A05;
        if (str2 != null && str2.length() != 0) {
            c1qx.A08 = str2;
        }
        Integer num = c907542o.A03;
        if (num != null) {
            c1qx.A07 = num;
        }
        Long l = c907542o.A04;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue >= 0) {
                c1qx.A01 = longValue;
            }
        }
        return c1qx;
    }

    public final C1ON A04() {
        C907642p c907642p = this.A01;
        if (c907642p != null) {
            InterfaceC907842r interfaceC907842r = this.A02;
            if (interfaceC907842r != null) {
                if (this.A06 != null) {
                    try {
                        String A00 = C1Q2.A00();
                        String clientDocIdForQuery = C85713s0.A01.A00().clientDocIdForQuery(c907642p.A01);
                        C62969SZm c62969SZm = new C62969SZm();
                        c62969SZm.A03 = MSV.A00(455);
                        c62969SZm.A02 = this.A06;
                        if (clientDocIdForQuery == null) {
                            clientDocIdForQuery = "";
                        }
                        C1Ee c1Ee = c62969SZm.A04;
                        c1Ee.A05("client_doc_id", clientDocIdForQuery);
                        c1Ee.A05("locale", A00);
                        c1Ee.A05("oss_response_format", "true");
                        c1Ee.A05("oss_request_format", "true");
                        c1Ee.A05("strip_nulls", "true");
                        c1Ee.A05("strip_defaults", "true");
                        c62969SZm.A00 = interfaceC907842r;
                        c62969SZm.A01 = C05F.A01;
                        String str = c907642p.A02;
                        if (str != null) {
                            c1Ee.A05("variables", str);
                        }
                        C1ON A01 = c62969SZm.A01();
                        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<ResponseType of com.instagram.graphql.network.GraphQLApi.Builder, ResponseType of com.instagram.graphql.network.GraphQLApi.Builder>");
                        return A01;
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    } catch (JSONException e2) {
                        throw new IllegalStateException(e2);
                    }
                }
                throw new IllegalStateException("non-proxied graphql request must have facebook access token");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException(AbstractC58317Pt9.A00(70));
    }

    public final C1ON A05() {
        return A07(C05F.A01);
    }

    public C907542o(AbstractC12990ll abstractC12990ll) {
        this.A00 = abstractC12990ll;
    }

    public static final C1Ee A01(C907542o c907542o, String str) {
        String A00 = C1Q2.A00();
        C1Ee c1Ee = new C1Ee();
        c1Ee.A05("signed_body", AbstractC13670mt.A06("SIGNATURE.%s", ""));
        String str2 = c907542o.A08;
        if (str2 == null) {
            str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        c1Ee.A05("vc_policy", str2);
        c1Ee.A05("locale", A00);
        if (str != null) {
            c1Ee.A05("client_doc_id", str);
        }
        String str3 = c907542o.A07;
        if (str3 != null) {
            c1Ee.A05("surface", str3);
        }
        return c1Ee;
    }
}
