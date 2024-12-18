package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40921uz extends AbstractC40951v2 implements InterfaceC13000lm {
    public double A00;
    public FxCalAccountLinkageInfo A01;
    public FxCalAccountLinkageInfoForSwitcher A02;
    public String A03;
    public final InterfaceC41521w1 A04;
    public final MailboxCallback A05;
    public final UserSession A06;
    public final C41061vE A07;

    public C40921uz(UserSession userSession) {
        FxCalAccountLinkageInfo fxCalAccountLinkageInfo;
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A07 = AbstractC41041vC.A00(userSession);
        C16930sl c16930sl = C16930sl.A00;
        Integer num = C05F.A00;
        this.A01 = new FxCalAccountLinkageInfo(num, c16930sl, 0L);
        this.A02 = A0E();
        this.A03 = "";
        this.A00 = Double.MAX_VALUE;
        this.A04 = new InterfaceC41521w1() { // from class: X.1vx
            @Override // X.InterfaceC41521w1
            public final void DpC(java.util.Set set) {
                if (set.contains("fetch_linked_accounts")) {
                    C40921uz c40921uz = C40921uz.this;
                    UserSession userSession2 = c40921uz.A06;
                    MailboxCallback mailboxCallback = c40921uz.A05;
                    C14360o3.A0B(userSession2, 0);
                    C14360o3.A0B(mailboxCallback, 1);
                    C131225wA.A01.A02(new C206969Eb(mailboxCallback, 7), userSession2);
                }
            }
        };
        this.A05 = new MailboxCallback() { // from class: X.1w3
            @Override // com.facebook.msys.mca.MailboxCallback
            public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                FxCalAccountLinkageInfo fxCalAccountLinkageInfo2;
                AbstractC1351869s abstractC1351869s;
                long j;
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                if (mailboxNullable != null && (abstractC1351869s = (AbstractC1351869s) mailboxNullable.value) != null) {
                    if (abstractC1351869s.mResultSet.getCount() == 0) {
                        fxCalAccountLinkageInfo2 = new FxCalAccountLinkageInfo(C05F.A0N, C16930sl.A00, System.currentTimeMillis());
                    } else {
                        C17u A0C = C17s.A0C(0, abstractC1351869s.mResultSet.getCount());
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0C, 10));
                        Iterator it = A0C.iterator();
                        long j2 = 0;
                        while (it.hasNext()) {
                            int A00 = ((AbstractC16880sg) it).A00();
                            Long nullableLong = abstractC1351869s.mResultSet.getNullableLong(A00, 4);
                            if (nullableLong != null) {
                                j = nullableLong.longValue();
                            } else {
                                j = 0;
                            }
                            j2 = Math.max(j2, j);
                            arrayList.add(AbstractC06930Yk.A06(new C09530e4("account_id", String.valueOf(abstractC1351869s.mResultSet.getLong(A00, 0))), new C09530e4("account_name", abstractC1351869s.mResultSet.getString(A00, 1)), new C09530e4("account_type", abstractC1351869s.mResultSet.getString(A00, 2)), new C09530e4("profile_picture_url", abstractC1351869s.mResultSet.getString(A00, 3)), new C09530e4(AbstractC31187DnW.A02(19, 8, 74), abstractC1351869s.mResultSet.getString(A00, 5)), new C09530e4("obfuscated_id", abstractC1351869s.mResultSet.getString(A00, 6)), new C09530e4("instagram_id", abstractC1351869s.mResultSet.getString(A00, 7))));
                        }
                        fxCalAccountLinkageInfo2 = AbstractC126955oZ.A00(C05F.A0N, arrayList);
                        fxCalAccountLinkageInfo2.A00 = j2;
                    }
                } else {
                    fxCalAccountLinkageInfo2 = new FxCalAccountLinkageInfo(C05F.A00, C16930sl.A00, 0L);
                    fxCalAccountLinkageInfo2.A01 = C05F.A0N;
                }
                C40921uz c40921uz = C40921uz.this;
                c40921uz.A0A(CallerContext.A01("FxIGMasterAccountCacheHelper"), fxCalAccountLinkageInfo2);
                c40921uz.A0K(CallerContext.A01("FxIGMasterAccountCacheHelper"), null, "fx_company_identity_switcher_linking_cache", false, false);
                c40921uz.A00 = Math.min(c40921uz.A00, c40921uz.A0D());
            }
        };
        if (A0C()) {
            try {
                C23031Ai A00 = AbstractC23021Ah.A00(this.A06);
                fxCalAccountLinkageInfo = AbstractC41701wK.parseFromJson(C16V.A00((String) A00.A1U.CES(A00, C23031Ai.A8c[305])));
                if (fxCalAccountLinkageInfo == null) {
                    fxCalAccountLinkageInfo = new FxCalAccountLinkageInfo(num, c16930sl, 0L);
                }
            } catch (IOException unused) {
                fxCalAccountLinkageInfo = new FxCalAccountLinkageInfo(num, c16930sl, 0L);
            }
            this.A01 = fxCalAccountLinkageInfo;
        }
        A09();
    }

    @Override // X.AbstractC40951v2
    public final boolean A0J(CallerContext callerContext, String str) {
        String str2;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C1AD.A06(c06090Tz, 18298948683237280L)) {
            return false;
        }
        String A04 = C1AD.A04(c06090Tz, 18861898636722274L);
        String str3 = callerContext.A02;
        C14360o3.A07(str3);
        try {
            JSONObject jSONObject = C105934q4.A01.A00(null, C05F.A01, A04, str, str3).getJSONObject(String.valueOf(1));
            Comparable comparable = (Enum) EnumC105944q5.A02.A00.get(str);
            if (comparable == null) {
                comparable = EnumC105944q5.A3q;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(((EnumC105944q5) comparable).A00));
            String valueOf = String.valueOf(3);
            if (jSONObject2.has(valueOf)) {
                if (jSONObject2.getJSONArray(valueOf).getInt(0) == 0) {
                    return true;
                }
            }
        } catch (NullPointerException e) {
            e = e;
            str2 = "NullPointerException";
            C0K8.A0F("AccessControlRuleV2", str2, e);
            return false;
        } catch (JSONException e2) {
            C0K8.A0F("AccessControlRuleV2", "JSONException", e2);
            return false;
        } catch (Exception e3) {
            e = e3;
            str2 = "Exception";
            C0K8.A0F("AccessControlRuleV2", str2, e);
            return false;
        }
        return false;
    }

    public final void A0K(CallerContext callerContext, final InterfaceC196048lu interfaceC196048lu, String str, boolean z, boolean z2) {
        long A01;
        AbstractRunnableC14200nk abstractRunnableC14200nk;
        C14360o3.A0B(callerContext, 1);
        UserSession userSession = this.A06;
        if (AbstractC54472f1.A01() && "".equals(this.A03)) {
            C1UM A00 = C1U4.A00(userSession.deviceSession.A06()).A00("FX_CACHE_FDID_STORE");
            C14360o3.A07(A00);
            String string = A00.getString("fdid", "");
            C14360o3.A07(string);
            this.A03 = string;
        }
        C2052996v c2052996v = new C2052996v(callerContext, this, interfaceC196048lu, str);
        if (!AbstractC41611wB.A02(userSession) || (A0C() && z)) {
            C41061vE c41061vE = this.A07;
            String str2 = callerContext.A02;
            C14360o3.A07(str2);
            C14360o3.A0B(userSession, 0);
            boolean booleanValue = AbstractC41621wC.A00().booleanValue();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (booleanValue) {
                A01 = C1AD.A01(c06090Tz, 18586226161422283L);
            } else {
                A01 = C18U.A01(c06090Tz, userSession, 36601290390376599L);
            }
            Map A0M = AbstractC16850sd.A0M(new C09530e4("ExtendedTtlExperimentGroup", String.valueOf((int) Long.valueOf(A01).longValue())));
            HashMap A02 = AbstractC06930Yk.A02(new C09530e4("caller_class", str2));
            A02.putAll(A0M);
            c41061vE.A05("manual_fetch_attempt", str, null, A02);
            C62610SIs c62610SIs = new C62610SIs(callerContext, c2052996v, this, interfaceC196048lu, str, z2);
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A04("caller_name", "fx_product_foundation_client_FXOnline_client_cache");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "FxIgLinkageCacheQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), Qq5.class, false, null, 0, null, "xe_client_cache_accounts", new ArrayList());
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
            pandoGraphQLRequest.setEnsureCacheWrite(false);
            AbstractC40691uc.A01(userSession).ATW(new C64000SxX(c62610SIs), new C64012Sxj(c62610SIs), pandoGraphQLRequest, new ExecutorC14110nb(1793449280));
            return;
        }
        if (AbstractC54472f1.A01()) {
            C41061vE c41061vE2 = this.A07;
            String str3 = callerContext.A02;
            C14360o3.A07(str3);
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            HashMap A022 = AbstractC06930Yk.A02(new C09530e4("caller_class", str3));
            A022.putAll(c16920sk);
            c41061vE2.A05("manual_fetch_attempt", str, null, A022);
            AbstractC2053096w.A00(userSession, c2052996v, this.A03, z2);
            return;
        }
        boolean A002 = AbstractC71983Kw.A00(userSession);
        InterfaceC14020nS A003 = C14120nc.A00();
        C14360o3.A07(A003);
        if (A002) {
            abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.9id
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC196048lu interfaceC196048lu2 = InterfaceC196048lu.this;
                    if (interfaceC196048lu2 != null) {
                        interfaceC196048lu2.onSuccess();
                    }
                }

                {
                    super(1479687326, 3, false, false);
                }
            };
        } else {
            abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.9ie
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC196048lu interfaceC196048lu2 = InterfaceC196048lu.this;
                    if (interfaceC196048lu2 != null) {
                        interfaceC196048lu2.onFailure();
                    }
                }

                {
                    super(1479687326, 3, false, false);
                }
            };
        }
        A003.ATO(abstractRunnableC14200nk);
    }

    public static final String A00(FxCalAccountLinkageInfo fxCalAccountLinkageInfo) {
        Object obj;
        Iterator it = fxCalAccountLinkageInfo.A02.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!((FxCalAccount) obj).A04.equalsIgnoreCase("FACEBOOK"));
        FxCalAccount fxCalAccount = (FxCalAccount) obj;
        if (fxCalAccount != null) {
            return fxCalAccount.A03;
        }
        return "";
    }

    @Override // X.AbstractC40951v2
    public final double A0D() {
        return TimeUnit.MILLISECONDS.toSeconds(C1CC.A02()) * 1.0d;
    }

    @Override // X.AbstractC40951v2
    public final FxCalAccountLinkageInfoForSwitcher A0E() {
        try {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A06);
            FxCalAccountLinkageInfoForSwitcher parseFromJson = AbstractC41151vO.parseFromJson(C16V.A00((String) A00.A1W.CES(A00, C23031Ai.A8c[306])));
            if (parseFromJson == null) {
                return new FxCalAccountLinkageInfoForSwitcher(C05F.A00, C16930sl.A00, 0L);
            }
            return parseFromJson;
        } catch (IOException unused) {
            return new FxCalAccountLinkageInfoForSwitcher(C05F.A00, C16930sl.A00, 0L);
        }
    }

    @Override // X.AbstractC40951v2
    public final LinkedHashMap A0F() {
        long A01;
        UserSession userSession = this.A06;
        C09530e4 c09530e4 = new C09530e4("IsMsysMailboxReady", String.valueOf(AbstractC71983Kw.A00(userSession)));
        C09530e4 c09530e42 = new C09530e4("MsysBootstrapCompleteTimeElapsedInSec", String.valueOf(this.A00));
        C09530e4 c09530e43 = new C09530e4("CacheDataSource", AbstractC41441vt.A01(this.A01.A01));
        C06090Tz c06090Tz = C06090Tz.A05;
        C09530e4 c09530e44 = new C09530e4("AllowServiceCacheToOverwriteLinkageCache", String.valueOf(C1AD.A06(c06090Tz, 18304751184452623L)));
        C09530e4 c09530e45 = new C09530e4("MsysBootstrapForcedDelayInMs", String.valueOf(AbstractC41611wB.A00(userSession)));
        C14360o3.A0B(userSession, 0);
        C09530e4 c09530e46 = new C09530e4("shouldFetchFromGraphQlOnSessionStart", String.valueOf(C18U.A06(c06090Tz, userSession, 36319815413538496L)));
        C09530e4 c09530e47 = new C09530e4("shouldUseExtendedTtl", String.valueOf(AbstractC41611wB.A01(userSession)));
        boolean z = false;
        if (AbstractC41621wC.A00().booleanValue()) {
            A01 = C1AD.A01(c06090Tz, 18586226161422283L);
        } else {
            A01 = C18U.A01(c06090Tz, userSession, 36601290390376599L);
        }
        Long valueOf = Long.valueOf(A01);
        if (valueOf == null || valueOf.longValue() != 0) {
            z = true;
        }
        return AbstractC06930Yk.A07(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, new C09530e4("isInExtendedTtlExperiment", String.valueOf(z)));
    }

    @Override // X.AbstractC40951v2
    public final void A0H(String str, Map map) {
        int i;
        UserSession userSession = this.A06;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerStart(444803545);
        c006802i.markerAnnotate(444803545, "should_use_omnistore", AbstractC41611wB.A02(userSession));
        c006802i.markerAnnotate(444803545, "is_msys_ready", AbstractC71983Kw.A00(userSession));
        c006802i.markerAnnotate(444803545, "caller_name", str);
        c006802i.markerAnnotate(444803545, "is_aic_query", AbstractC54472f1.A01());
        c006802i.markerAnnotate(444803545, "total_account_count", AbstractC001800i.A02(map.values()));
        for (String str2 : map.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            String A0R = AnonymousClass001.A0R(lowerCase, "_account_count");
            Number number = (Number) map.get(str2);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            c006802i.markerAnnotate(444803545, A0R, i);
        }
        c006802i.markerAnnotate(444803545, "is_cache_expired", A0C());
        c006802i.markerEnd(444803545, (short) 467);
    }

    @Override // X.AbstractC40951v2
    public final boolean A0I(CallerContext callerContext, String str) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C1AD.A06(c06090Tz, 18298948683237280L)) {
            if (C1AD.A06(c06090Tz, 18298948683368353L)) {
                String str2 = callerContext.A02;
                return AbstractC86593tX.A0r(new C105914q2(this.A06), C05F.A01, str, str2);
            }
            String A04 = C1AD.A04(c06090Tz, 18861898636722274L);
            String str3 = callerContext.A02;
            C14360o3.A07(str3);
            Integer num = C05F.A01;
            UserSession userSession = this.A06;
            return AbstractC105924q3.A00(new C105914q2(userSession), num, A04, str3, str, C18U.A06(C06090Tz.A05, userSession, 36322001551370187L));
        }
        if (C1AD.A06(c06090Tz, 18298948682844062L)) {
            try {
                JSONArray jSONArray = new JSONArray(C1AD.A04(c06090Tz, 18861898636329054L));
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

    @Override // X.AbstractC40951v2
    public final void A0G(final FxCalAccountLinkageInfo fxCalAccountLinkageInfo, final FxCalAccountLinkageInfo fxCalAccountLinkageInfo2) {
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        A00.ATO(new AbstractRunnableC14200nk() { // from class: X.5ob
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1vN] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.1vN] */
            @Override // java.lang.Runnable
            public final void run() {
                C40921uz c40921uz = C40921uz.this;
                if (!C14360o3.A0K(C40921uz.A00(fxCalAccountLinkageInfo), C40921uz.A00(fxCalAccountLinkageInfo2))) {
                    UserSession userSession = c40921uz.A06;
                    AbstractC25651Mw.A00(userSession).E4s(new Object());
                    if (C1C0.A00(userSession)) {
                        AbstractC25651Mw.A00(userSession).E4s(new Object());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1479687326, 3, false, false);
            }
        });
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A07();
        this.A06.A03(C40921uz.class);
    }

    public C40921uz() {
    }
}
