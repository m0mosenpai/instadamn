package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2KI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2KI implements InterfaceC12870lZ, InterfaceC13000lm {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Context A04;
    public final C11830jh A05;
    public final C14140ne A06;
    public final C40701ud A07;
    public final InterfaceC19630xq A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final C18920wW A0D;
    public final UserSession A0E;
    public final boolean A0F;

    public C2KI(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        this.A0E = userSession;
        this.A04 = context;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "on_device_app_history";
        this.A0D = c12210kP.A00();
        this.A08 = AbstractC19750y3.A00(context, "on_device_app_history");
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A03 = C18U.A01(c06090Tz, userSession, 36598837963394357L);
        this.A06 = new C14140ne(1892066561, 3, false, false);
        this.A00 = (int) C18U.A01(c06090Tz, userSession, 36598837963984185L);
        this.A01 = (int) C18U.A01(c06090Tz, userSession, 36598837963853112L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36317362987078757L);
        this.A0B = C18U.A06(c06090Tz, userSession, 36317362987209830L);
        this.A0C = C18U.A06(c06090Tz, userSession, 2342160372201034855L);
        this.A07 = AbstractC40691uc.A01(userSession);
        this.A05 = C11830jh.A04.A01(userSession);
        this.A0A = C18U.A06(c06090Tz, userSession, 36317362987406440L);
        this.A02 = (int) C18U.A01(c06090Tz, userSession, 36598837964180794L);
        this.A0F = C18U.A06(c06090Tz, userSession, 36317362987537513L);
    }

    public static final String A00(C2KI c2ki, List list) {
        String str;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        A01(c2ki, null, "start_app_history_scan_falco");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2JS c2js = (C2JS) it.next();
            String optionalStringField = c2js.getOptionalStringField(1, "package_name");
            if (optionalStringField != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("app_id", AnonymousClass001.A0R("fb", c2js.getOptionalStringField(0, "app_id")));
                boolean z = false;
                try {
                    c2ki.A04.getPackageManager().getPackageInfo(optionalStringField, 128);
                    z = true;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
                hashMap.put("install_status", Boolean.valueOf(z));
                arrayList.add(hashMap);
            }
        }
        A01(c2ki, Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "finish_app_history_scan_falco");
        try {
            str = C102274j2.A02().A0F(arrayList);
        } catch (AnonymousClass400 e) {
            C0f5 AEp = C18950wb.A00.AEp(e.getMessage(), 817899641);
            AEp.ABW("path", C2Ql.A00(e));
            AEp.report();
            C0K8.A0G("OnDeviceAppHistoryManager", "Fail to parse install states map.", e);
            str = "";
        }
        boolean z2 = false;
        if (str.length() > 0) {
            z2 = true;
        }
        if (z2) {
            C18920wW c18920wW = c2ki.A0D;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "on_device_app_history_exclusion_targeting");
            if (A00.isSampled()) {
                A00.AAP("apps_data", str);
                A00.Cht();
                InterfaceC19610xo ARD = c2ki.A08.ARD();
                ARD.E7G("last_upload_time_in_sec", System.currentTimeMillis() / 1000);
                ARD.apply();
            }
        }
        return str;
    }

    public static final void A01(C2KI c2ki, Long l, String str) {
        if (c2ki.A0F) {
            C18920wW c18920wW = c2ki.A0D;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "on_device_app_history_funnel_logging");
            if (A00.isSampled()) {
                A00.AAP("logging_event_name", str);
                A00.A9K("time_cost", l);
                A00.Cht();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    public static final void A02(C2KI c2ki, Map map, int i, int i2) {
        int i3;
        int i4;
        String str;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i3 = 0;
            i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (sb.length() > 0) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                sb.append(str2);
                if (booleanValue) {
                    i4 |= 1 << i3;
                }
                i3++;
                if (i3 == 32) {
                    break;
                }
            }
            arrayList.add(Integer.valueOf(i4));
        }
        if (i3 > 0) {
            arrayList.add(Integer.valueOf(i4));
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = obj.getBytes(C15W.A05);
            C14360o3.A07(bytes);
            byte[] digest = messageDigest.digest(bytes);
            StringBuilder sb2 = new StringBuilder();
            for (byte b : digest) {
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                C14360o3.A07(format);
                sb2.append(format);
            }
            str = sb2.toString();
            C14360o3.A07(str);
        } catch (NoSuchAlgorithmException unused) {
            str = "";
        }
        String A04 = C16030qx.A02.A04(AbstractC12290kX.A00);
        String str3 = "";
        if (A04 == null) {
            A04 = "";
        }
        ?? graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A09(str, "app_list_hash");
        graphQlCallInput.A07(Integer.valueOf(i), "start_index");
        graphQlCallInput.A07(Integer.valueOf(i2), "end_index");
        graphQlCallInput.A05("install_status_in_bits", arrayList);
        graphQlCallInput.A09(A04, "family_device_id");
        String A02 = c2ki.A05.A02(C19T.A29);
        if (A02 != null) {
            str3 = A02;
        }
        graphQlCallInput.A09(str3, "real_family_device_id");
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00(graphQlCallInput, "request");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "OnDeviceAppHistoryMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C121525eu.class, true, null, 0, null, "ig_update_on_device_app_history_bit_mask", new ArrayList());
        pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
        c2ki.A07.ATV(C121545ew.A00, C121535ev.A00, pandoGraphQLRequest);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (AbstractC201688vy.A01(this.A0E, C05F.A1F)) {
            C218914p.A06(this);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(-1217936466, C0f9.A03(-143302656));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1604240232);
        this.A06.execute(new Runnable() { // from class: X.3Jj
            @Override // java.lang.Runnable
            public final void run() {
                final C2KI c2ki = C2KI.this;
                long j = c2ki.A08.getLong("last_upload_time_in_sec", -1L);
                if (j != -1 && (System.currentTimeMillis() / 1000) - j <= c2ki.A03) {
                    return;
                }
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                c2ki.A07.A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGOnDeviceAppHistoryPrivacyQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C5NS.class, false, null, 0, null, "ig_on_device_app_history_privacy", new ArrayList()).setMaxToleratedCacheAgeMs(0L), new C1P1() { // from class: X.5NT
                    @Override // X.C1P1
                    public final void onFail(AbstractC115105If abstractC115105If) {
                        C0f9.A0A(1587368518, C0f9.A03(-1093715276));
                    }

                    @Override // X.C1P1
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                        int A032 = C0f9.A03(-856885479);
                        final AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                        int A033 = C0f9.A03(-1153136848);
                        C14360o3.A0B(anonymousClass435, 0);
                        final C2KI c2ki2 = C2KI.this;
                        c2ki2.A06.execute(new Runnable() { // from class: X.5NZ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2JS optionalTreeField;
                                C2JS optionalTreeField2;
                                int size;
                                final C2KI c2ki3 = c2ki2;
                                C2JS c2js = (C2JS) anonymousClass435.A01;
                                if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "ig_on_device_app_history_privacy", C5NY.class, 2076880744)) != null && (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "data", C5S0.class, -2128759826)) != null && optionalTreeField2.hasFieldValue("is_eligible") && optionalTreeField2.getCoercedBooleanField(0, "is_eligible")) {
                                    C2JM c2jm3 = new C2JM();
                                    C2JM c2jm4 = new C2JM();
                                    C2JQ c2jq2 = PandoGraphQLRequest.Companion;
                                    C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "AndroidAppHistoryPlistQuery", c2jm3.getParamsCopy(), c2jm4.getParamsCopy(), C5S1.class, false, null, 0, null, "ig_android_app_history_plist_query", new ArrayList()).setMaxToleratedCacheAgeMs(0L);
                                    C1P1 c1p1 = new C1P1() { // from class: X.5S2
                                        @Override // X.C1P1
                                        public final void onFail(AbstractC115105If abstractC115105If) {
                                            C0f9.A0A(836270894, C0f9.A03(1729025542));
                                        }

                                        @Override // X.C1P1
                                        public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                                            int A034 = C0f9.A03(1141310468);
                                            final AnonymousClass435 anonymousClass4352 = (AnonymousClass435) obj2;
                                            int A035 = C0f9.A03(-151866028);
                                            C14360o3.A0B(anonymousClass4352, 0);
                                            final C2KI c2ki4 = C2KI.this;
                                            c2ki4.A06.execute(new Runnable() { // from class: X.5bA
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    String optionalStringField;
                                                    C2JS c2js2 = (C2JS) AnonymousClass435.this.A01;
                                                    if (c2js2 != null) {
                                                        ImmutableList requiredCompactedTreeListField = c2js2.getRequiredCompactedTreeListField(0, "ig_android_app_history_plist_query", C5SQ.class, -1375292589);
                                                        C14360o3.A07(requiredCompactedTreeListField);
                                                        C2KI c2ki5 = c2ki4;
                                                        if (c2ki5.A0B && requiredCompactedTreeListField.size() > 100) {
                                                            long currentTimeMillis = System.currentTimeMillis();
                                                            C2KI.A01(c2ki5, null, "start_app_history_scan_bit_mask");
                                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                            C1LC it = requiredCompactedTreeListField.iterator();
                                                            C14360o3.A07(it);
                                                            while (it.hasNext()) {
                                                                C2JS c2js3 = (C2JS) it.next();
                                                                String optionalStringField2 = c2js3.getOptionalStringField(1, "package_name");
                                                                if (optionalStringField2 != null && (optionalStringField = c2js3.getOptionalStringField(0, "app_id")) != null) {
                                                                    boolean z = false;
                                                                    try {
                                                                        c2ki5.A04.getPackageManager().getPackageInfo(optionalStringField2, 128);
                                                                        z = true;
                                                                    } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                                                                    }
                                                                    linkedHashMap.put(optionalStringField, Boolean.valueOf(z));
                                                                }
                                                            }
                                                            C2KI.A01(c2ki5, Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "finish_app_history_scan_bit_mask");
                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                            int i = 0;
                                                            int i2 = 0;
                                                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                                i++;
                                                                int i3 = c2ki5.A00;
                                                                if (i == i3) {
                                                                    if (c2ki5.A0C) {
                                                                        C2KI.A02(c2ki5, linkedHashMap2, i2, (i3 + i2) - 1);
                                                                    }
                                                                    i2 += i3;
                                                                    linkedHashMap2 = new LinkedHashMap();
                                                                    i = 0;
                                                                }
                                                            }
                                                            if ((!linkedHashMap2.isEmpty()) && c2ki5.A0C) {
                                                                C2KI.A02(c2ki5, linkedHashMap2, i2, (c2ki5.A00 + i2) - 1);
                                                            }
                                                            C2KI.A01(c2ki5, null, "sent_app_history_by_bit_mask");
                                                            requiredCompactedTreeListField = requiredCompactedTreeListField.subList(0, Math.min(c2ki5.A01, requiredCompactedTreeListField.size()));
                                                        }
                                                        if (c2ki5.A09) {
                                                            AbstractC001800i.A0s(requiredCompactedTreeListField, new C57752Pjf(c2ki5, 34), c2ki5.A01);
                                                        } else {
                                                            C2KI.A00(c2ki5, requiredCompactedTreeListField);
                                                        }
                                                        C2KI.A01(c2ki5, null, "sent_app_history_by_falco");
                                                    }
                                                }
                                            });
                                            C0f9.A0A(1492619617, A035);
                                            C0f9.A0A(1915835950, A034);
                                        }
                                    };
                                    C40701ud c40701ud = c2ki3.A07;
                                    c40701ud.A06(maxToleratedCacheAgeMs, c1p1);
                                    if (c2js.getCoercedBooleanField(2, "ig_is_full_coverage_enabled")) {
                                        ArrayList arrayList = new ArrayList();
                                        PackageManager packageManager = c2ki3.A04.getPackageManager();
                                        if (packageManager != null) {
                                            List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
                                            C14360o3.A07(installedApplications);
                                            for (ApplicationInfo applicationInfo : installedApplications) {
                                                if ((applicationInfo.flags & 1) == 0) {
                                                    String str = ((PackageItemInfo) applicationInfo).packageName;
                                                    C14360o3.A06(str);
                                                    arrayList.add(str);
                                                }
                                            }
                                            String A04 = C16030qx.A02.A04(AbstractC12290kX.A00);
                                            if (A04 == null) {
                                                A04 = "";
                                            }
                                            C2JO c2jo = new C2JO();
                                            c2jo.A09(A04, "family_device_id");
                                            c2jo.A05("installed_package_names", arrayList);
                                            C11830jh c11830jh = c2ki3.A05;
                                            C19T c19t = C19T.A29;
                                            String A02 = c11830jh.A02(c19t);
                                            if (A02 == null) {
                                                A02 = "";
                                            }
                                            c2jo.A09(A02, "real_family_device_id");
                                            C2JM c2jm5 = new C2JM();
                                            C2JM c2jm6 = new C2JM();
                                            c2jm5.A00(c2jo, "request");
                                            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "OnDeviceAppHistoryUpdateUninstalledMutation", c2jm5.getParamsCopy(), c2jm6.getParamsCopy(), C121455en.class, true, null, 0, null, "ig_update_uninstalled_on_device_app_history", new ArrayList());
                                            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
                                            c40701ud.ATV(new InterfaceC48212Jk() { // from class: X.5ep
                                                @Override // X.InterfaceC48212Jk
                                                public final void invoke(Throwable th) {
                                                }
                                            }, new InterfaceC48192Ji() { // from class: X.5eo
                                                @Override // X.InterfaceC48192Ji
                                                public final void invoke(AnonymousClass436 anonymousClass436) {
                                                }
                                            }, pandoGraphQLRequest);
                                            if (c2ki3.A0A) {
                                                size = c2ki3.A02;
                                            } else {
                                                size = arrayList.size();
                                            }
                                            C17v A0B = C17s.A0B(C17s.A0C(0, arrayList.size()), size);
                                            int i = A0B.A00;
                                            int i2 = A0B.A01;
                                            int i3 = A0B.A02;
                                            if (i3 > 0) {
                                                if (i > i2) {
                                                    return;
                                                }
                                            } else if (i3 >= 0 || i2 > i) {
                                                return;
                                            }
                                            while (true) {
                                                List subList = arrayList.subList(i, Math.min(arrayList.size(), i + size));
                                                C2JO c2jo2 = new C2JO();
                                                c2jo2.A09(A04, "family_device_id");
                                                c2jo2.A05("installed_package_names", subList);
                                                String A022 = c11830jh.A02(c19t);
                                                if (A022 == null) {
                                                    A022 = "";
                                                }
                                                c2jo2.A09(A022, "real_family_device_id");
                                                C2JM c2jm7 = new C2JM();
                                                C2JM c2jm8 = new C2JM();
                                                c2jm7.A00(c2jo2, "request");
                                                PandoGraphQLRequest pandoGraphQLRequest2 = new PandoGraphQLRequest(AbstractC40511uK.A00(), "OnDeviceAppHistoryUpdateInstalledMutation", c2jm7.getParamsCopy(), c2jm8.getParamsCopy(), C121485eq.class, true, null, 0, null, "ig_update_installed_on_device_app_history", new ArrayList());
                                                pandoGraphQLRequest2.setMaxToleratedCacheAgeMs(0L);
                                                c40701ud.ATV(new InterfaceC48212Jk() { // from class: X.5es
                                                    @Override // X.InterfaceC48212Jk
                                                    public final void invoke(Throwable th) {
                                                    }
                                                }, new InterfaceC48192Ji() { // from class: X.5er
                                                    @Override // X.InterfaceC48192Ji
                                                    public final void invoke(AnonymousClass436 anonymousClass436) {
                                                    }
                                                }, pandoGraphQLRequest2);
                                                if (i != i2) {
                                                    i += i3;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        });
                        C0f9.A0A(-592804385, A033);
                        C0f9.A0A(-1279216588, A032);
                    }
                });
            }
        });
        C0f9.A0A(491255936, A03);
    }
}
