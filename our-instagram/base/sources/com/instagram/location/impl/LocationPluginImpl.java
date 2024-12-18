package com.instagram.location.impl;

import X.AbstractC103794ly;
import X.AbstractC114515Ew;
import X.AbstractC12220kQ;
import X.AbstractC128665rZ;
import X.AbstractC15820qc;
import X.AbstractC16850sd;
import X.AbstractC23451Ch;
import X.AbstractC24641Ih;
import X.AbstractC61813Ru7;
import X.AnonymousClass001;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C0HM;
import X.C0f9;
import X.C103804lz;
import X.C108414uS;
import X.C140286Wg;
import X.C14120nc;
import X.C14360o3;
import X.C18920wW;
import X.C18U;
import X.C1VQ;
import X.C1VW;
import X.C218914p;
import X.C26086BgF;
import X.C2OD;
import X.C3VI;
import X.C3VK;
import X.C3VR;
import X.C3VS;
import X.C48295LYt;
import X.C48296LYu;
import X.C48297LYv;
import X.C4I7;
import X.C4I8;
import X.C4I9;
import X.C4IA;
import X.C4IB;
import X.C4IC;
import X.C55755OpO;
import X.C55809OqK;
import X.C58465Pvq;
import X.C58516Pwk;
import X.C58600PyT;
import X.C62675SLn;
import X.C67601UsM;
import X.C70119W4r;
import X.C70683Wf4;
import X.C93R;
import X.C9CH;
import X.FA6;
import X.InterfaceC02590Ai;
import X.InterfaceC11380iw;
import X.InterfaceC127465pP;
import X.InterfaceC12870lZ;
import X.InterfaceC57959Pn5;
import X.InterfaceC65486Tl6;
import X.MQC;
import X.RunnableC130965vk;
import X.RunnableC73518YHi;
import X.SJE;
import X.SKH;
import X.SX8;
import X.VDJ;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class LocationPluginImpl extends C1VW implements InterfaceC11380iw, InterfaceC12870lZ {
    public C1VQ A00;
    public final Context A01;
    public final Object A02 = new Object();
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public static final Integer A06 = C05F.A0C;
    public static final String[] A05 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"};

    @Override // X.C1VW
    public Location getLastLocation(UserSession userSession, long j, float f, String str) {
        return getLastLocation(userSession, j, f, false, str);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "LocationPluginImpl";
    }

    @Override // X.C1VW
    public void requestLocationPermission(Activity activity, UserSession userSession, MQC mqc, boolean z, String str, VDJ vdj) {
        A04(userSession, "os_prompt_impression", "precise", str, vdj.name());
        AbstractC23451Ch.A04(activity, new C48295LYt(userSession, this, mqc, vdj, str, z), "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // X.C1VW
    public void requestLocationUpdates(UserSession userSession, Activity activity, InterfaceC127465pP interfaceC127465pP, MQC mqc, String str, boolean z, VDJ vdj) {
        C4IB c4ib;
        String str2;
        C14360o3.A0B(activity, 0);
        if (AbstractC15820qc.A0E(activity)) {
            Context context = this.A01;
            String name = vdj.name();
            if (!A07(context, userSession, name, z) && shouldUseDevicePermissionKit(userSession, vdj)) {
                if (z) {
                    c4ib = C4IB.A05;
                } else {
                    c4ib = C4IB.A0C;
                }
                List singletonList = Collections.singletonList(C4I9.UNKNOWN);
                C14360o3.A07(singletonList);
                String obj = C0HM.A00().toString();
                FA6.A00(userSession);
                C4IC A00 = C70119W4r.A00(activity, c4ib, false);
                if (A00 != C4IC.A06 && A00 != C4IC.A07) {
                    mqc.EjC();
                    A01(activity, userSession, name, obj, z, false);
                    A04(userSession, "pre_prompt_impression", "precise", str, name);
                    if (z) {
                        str2 = "android.permission.ACCESS_FINE_LOCATION";
                    } else {
                        str2 = "android.permission.ACCESS_COARSE_LOCATION";
                    }
                    C26086BgF c26086BgF = new C26086BgF(c4ib, new C55755OpO(activity, userSession, this, interfaceC127465pP, mqc, vdj, Boolean.valueOf(AbstractC114515Ew.A06(activity, str2)), str), name, obj, singletonList);
                    C14360o3.A0B(userSession, 1);
                    C14360o3.A0B(name, 3);
                    String str3 = c26086BgF.A04;
                    if (str3 == null) {
                        str3 = C0HM.A00().toString();
                        C14360o3.A07(str3);
                    }
                    AbstractC61813Ru7.A00(userSession).A00(activity, new C67601UsM(activity, c26086BgF, userSession), "location_device_permission", name, new Gson().A0B(AbstractC16850sd.A0M(new C09530e4("extra_experience_id", str3))));
                    return;
                }
                A01(activity, userSession, name, obj, z, true);
                A02(userSession, this, interfaceC127465pP, str, false);
            }
        }
        Context context2 = this.A01;
        String name2 = vdj.name();
        boolean A07 = A07(context2, userSession, name2, z);
        String obj2 = C0HM.A00().toString();
        A01(activity, userSession, name2, obj2, z, A07);
        if (!A07) {
            mqc.EjC();
            A04(userSession, "os_prompt_impression", "precise", str, name2);
            AbstractC23451Ch.A04(activity, new C48297LYv(activity, userSession, this, interfaceC127465pP, mqc, vdj, str, obj2, z), "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
            return;
        }
        A02(userSession, this, interfaceC127465pP, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.content.Context, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.0iw] */
    public static void A00(Activity activity, UserSession userSession, LocationPluginImpl locationPluginImpl, VDJ vdj, String str, String str2, boolean z) {
        Integer num;
        C4IB c4ib;
        LocationPluginImpl locationPluginImpl2 = locationPluginImpl;
        if (activity instanceof InterfaceC11380iw) {
            locationPluginImpl2 = (InterfaceC11380iw) activity;
        }
        C4I7 c4i7 = new C4I7(locationPluginImpl2, userSession);
        if (AbstractC15820qc.A0E(activity)) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        Long A00 = C4I8.A00(userSession);
        List singletonList = Collections.singletonList(C4I9.UNKNOWN);
        C14360o3.A07(singletonList);
        String name = vdj.name();
        C4IA c4ia = C4IA.A08;
        if (z) {
            c4ib = C4IB.A05;
        } else {
            c4ib = C4IB.A0C;
        }
        C9CH c9ch = new C9CH(c4ia, c4ib);
        c9ch.A00(num);
        c4i7.A00(c9ch, A00, str, name, str2, singletonList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A01(Activity activity, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        InterfaceC11380iw interfaceC11380iw;
        String str3;
        C4IB c4ib;
        if (activity instanceof InterfaceC11380iw) {
            interfaceC11380iw = (InterfaceC11380iw) activity;
        } else {
            interfaceC11380iw = this;
        }
        C4I7 c4i7 = new C4I7(interfaceC11380iw, userSession);
        Long A00 = C4I8.A00(userSession);
        if (z2) {
            str3 = "app_status_grant";
        } else {
            str3 = "app_status_deny";
        }
        List singletonList = Collections.singletonList(C4I9.UNKNOWN);
        C14360o3.A07(singletonList);
        C4IA c4ia = C4IA.A08;
        if (z) {
            c4ib = C4IB.A05;
        } else {
            c4ib = C4IB.A0C;
        }
        c4i7.A00(new C9CH(c4ia, c4ib), A00, str3, str, str2, singletonList);
    }

    public static void A02(UserSession userSession, final LocationPluginImpl locationPluginImpl, final InterfaceC127465pP interfaceC127465pP, String str, boolean z) {
        Integer num;
        Location lastLocation;
        if (Build.VERSION.SDK_INT >= 29 && C218914p.A09()) {
            return;
        }
        Context context = locationPluginImpl.A01;
        if (C3VK.A00(context, userSession).A04().A03()) {
            if (z) {
                lastLocation = locationPluginImpl.getLastLocation(userSession, 300000L, str);
            } else {
                lastLocation = locationPluginImpl.getLastLocation(userSession, str);
            }
            if (lastLocation != null) {
                interfaceC127465pP.onLocationChanged(lastLocation);
                return;
            }
        }
        final C58465Pvq A052 = C3VK.A00(context, userSession).A05();
        if (C3VK.A00(context, userSession).A04().A03()) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        C58516Pwk c58516Pwk = new C58516Pwk(null, num, 300000L, 7000L, 50.0f, 0.6666667f, 120000L, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, false, true, false);
        synchronized (locationPluginImpl.A02) {
            locationPluginImpl.A03.put(interfaceC127465pP, A052);
            A06(locationPluginImpl);
        }
        A052.A07(new InterfaceC65486Tl6() { // from class: X.5vj
            @Override // X.InterfaceC65486Tl6
            public final void DE7(C58601PyU c58601PyU) {
                interfaceC127465pP.DEF(c58601PyU);
                A052.A06();
            }

            @Override // X.InterfaceC65486Tl6
            public final void DQA(C103804lz c103804lz) {
                interfaceC127465pP.onLocationChanged(new Location(c103804lz.A00));
            }
        }, c58516Pwk, str);
        C3VK.A00(context, userSession).A0A().schedule(new RunnableC130965vk(A052, locationPluginImpl, new WeakReference(interfaceC127465pP)), 100L, TimeUnit.MILLISECONDS);
    }

    public static void A03(UserSession userSession, LocationPluginImpl locationPluginImpl, InterfaceC57959Pn5 interfaceC57959Pn5, String str) {
        interfaceC57959Pn5.getClass();
        Context context = locationPluginImpl.A01;
        C140286Wg A062 = C3VK.A00(context, userSession).A06();
        SKH skh = new SKH(15);
        C62675SLn c62675SLn = new C62675SLn(10000L, 300000L);
        A062.A04(new SX8(skh, new SJE(null, A06, 300000L, 100.0f, 0.6666667f, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, 120000L, 500L, 7000L), new C108414uS(), c62675SLn, null, true, false), str);
        C2OD.A03(new C55809OqK(locationPluginImpl, interfaceC57959Pn5), A062, C3VK.A00(context, userSession).A0A());
        locationPluginImpl.A04.put(interfaceC57959Pn5, A062);
        C3VK.A00(context, userSession).A0A().schedule(new RunnableC73518YHi(A062, locationPluginImpl), 100L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        A04(r3, "os_prompt_action_while_in_use", r1, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = "imprecise";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
    
        if (r0 == r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 != r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r6.containsKey("android.permission.ACCESS_FINE_LOCATION") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r6.get("android.permission.ACCESS_FINE_LOCATION") != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r1 = "precise";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(com.instagram.common.session.UserSession r3, java.lang.String r4, java.lang.String r5, java.util.Map r6) {
        /*
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L10
            java.lang.Object r0 = r6.get(r2)
            X.7lh r1 = X.EnumC172127lh.A05
            if (r0 == r1) goto L20
        L10:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r6.get(r1)
            X.7lh r1 = X.EnumC172127lh.A05
            if (r0 != r1) goto L3a
        L20:
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L36
            java.lang.Object r0 = r6.get(r2)
            if (r0 != r1) goto L36
            java.lang.String r1 = "precise"
        L2f:
            java.lang.String r0 = "os_prompt_action_while_in_use"
            A04(r3, r0, r1, r4, r5)
            return
        L36:
            java.lang.String r1 = "imprecise"
            goto L2f
        L3a:
            java.lang.String r1 = "os_prompt_action_denied"
            java.lang.String r0 = "none"
            A04(r3, r1, r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.location.impl.LocationPluginImpl.A05(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static void A06(LocationPluginImpl locationPluginImpl) {
        synchronized (locationPluginImpl.A02) {
            Map map = locationPluginImpl.A03;
            map.size();
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public static boolean A07(Context context, UserSession userSession, String str, boolean z) {
        String str2;
        String str3;
        C4IB c4ib;
        C4IB c4ib2;
        if (z) {
            str2 = "android.permission.ACCESS_FINE_LOCATION";
        } else {
            str2 = "android.permission.ACCESS_COARSE_LOCATION";
        }
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36318015823550256L)) {
            C70683Wf4 A00 = FA6.A00(userSession);
            if (z) {
                c4ib2 = C4IB.A05;
            } else {
                c4ib2 = C4IB.A0C;
            }
            List singletonList = Collections.singletonList(C4I9.UNKNOWN);
            C14360o3.A07(singletonList);
            return A00.A00(context, c4ib2, "UNKNOWN", singletonList).A01;
        }
        boolean A07 = AbstractC23451Ch.A07(context, str2);
        C4I7 c4i7 = new C4I7(new InterfaceC11380iw() { // from class: X.5pS
            public static final String __redex_internal_original_name = "LocationPluginImpl$$ExternalSyntheticLambda0";

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return "LocationPluginImpl";
            }
        }, userSession);
        Long A002 = C4I8.A00(userSession);
        if (A07) {
            str3 = "app_status_grant";
        } else {
            str3 = "app_status_deny";
        }
        List singletonList2 = Collections.singletonList(C4I9.UNKNOWN);
        C14360o3.A07(singletonList2);
        C4IA c4ia = C4IA.A08;
        if (z) {
            c4ib = C4IB.A05;
        } else {
            c4ib = C4IB.A0C;
        }
        c4i7.A00(new C9CH(c4ia, c4ib), A002, str3, str, null, singletonList2);
        return A07;
    }

    @Override // X.C1VW
    public void cancelSignalPackageRequest(UserSession userSession, InterfaceC57959Pn5 interfaceC57959Pn5) {
        this.A04.remove(interfaceC57959Pn5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1VQ] */
    @Override // X.C1VW
    public C1VQ getFragmentFactory() {
        C1VQ c1vq = this.A00;
        if (c1vq == null) {
            ?? obj = new Object();
            this.A00 = obj;
            return obj;
        }
        return c1vq;
    }

    @Override // X.C1VW
    public boolean isAccurateEnough(Location location) {
        long j;
        float f;
        if (Build.VERSION.SDK_INT >= 29) {
            j = 900000;
            f = 500.0f;
        } else {
            j = 300000;
            f = 100.0f;
        }
        if (location == null || !location.hasAccuracy() || location.getAccuracy() > f || System.currentTimeMillis() - location.getTime() >= j) {
            return false;
        }
        return true;
    }

    @Override // X.C1VW
    public Future prefetchLocation(final UserSession userSession, String str) {
        final C93R c93r = new C93R();
        final InterfaceC127465pP interfaceC127465pP = new InterfaceC127465pP() { // from class: X.5pO
            @Override // X.InterfaceC127465pP
            public final void DEF(Exception exc) {
                c93r.A02(exc);
                this.removeLocationUpdates(userSession, this);
            }

            @Override // X.InterfaceC127465pP
            public final void onLocationChanged(Location location) {
                c93r.A01(location);
                this.removeLocationUpdates(userSession, this);
            }
        };
        Runnable runnable = new Runnable() { // from class: X.5pQ
            @Override // java.lang.Runnable
            public final void run() {
                if (c93r.isCancelled()) {
                    this.removeLocationUpdates(userSession, interfaceC127465pP);
                }
            }
        };
        Context context = this.A01;
        c93r.addListener(runnable, C3VK.A00(context, userSession).A0A());
        if (A07(context, userSession, "IG.location.LocationPluginImpl.requestLocationUpdates", true)) {
            A02(userSession, this, interfaceC127465pP, str, true);
        }
        return c93r;
    }

    @Override // X.C1VW
    public void removeLocationUpdates(UserSession userSession, InterfaceC127465pP interfaceC127465pP) {
        synchronized (this.A02) {
            Map map = this.A03;
            AbstractC128665rZ abstractC128665rZ = (AbstractC128665rZ) map.get(interfaceC127465pP);
            if (abstractC128665rZ != null) {
                abstractC128665rZ.A06();
                map.remove(interfaceC127465pP);
                A06(this);
            }
        }
    }

    @Override // X.C1VW
    public void requestLocationSignalPackage(UserSession userSession, InterfaceC57959Pn5 interfaceC57959Pn5, String str) {
        if (AbstractC23451Ch.A08(this.A01, A05)) {
            A03(userSession, this, interfaceC57959Pn5, str);
        }
    }

    @Override // X.C1VW
    public void setupForegroundCollection(UserSession userSession) {
        Context context = this.A01;
        if (userSession.A00(C3VR.class) == null) {
            C3VR c3vr = new C3VR(context, userSession);
            C218914p.A08.A0A(c3vr);
            userSession.A04(C3VR.class, c3vr);
            AbstractC24641Ih.A02.Ep8(new C3VS(c3vr));
        }
    }

    @Override // X.C1VW
    public void setupPlaceSignatureCollection(UserSession userSession) {
        C3VI.A00(this.A01, userSession);
    }

    @Override // X.C1VW
    public boolean shouldUseNewNativeReconsiderDialog(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36318015822698275L);
    }

    public LocationPluginImpl(Context context) {
        this.A01 = context;
        if (Build.VERSION.SDK_INT >= 29) {
            C218914p.A08.A0B(this);
        }
    }

    public static void A04(UserSession userSession, String str, String str2, String str3, String str4) {
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_location_permission_request_event");
        Double valueOf = Double.valueOf(System.currentTimeMillis() / 1000.0d);
        HashMap hashMap = new HashMap();
        hashMap.put("caller_name", str3);
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str4);
        if (A00.isSampled()) {
            A00.AAP("product_id", AnonymousClass001.A0g(str3, ".", str4));
            A00.AAP("event", str);
            A00.A8I("client_event_time", valueOf);
            A00.AAP("access_level", str2);
            A00.A9M("extra", hashMap);
            A00.Cht();
        }
    }

    @Override // X.C1VW
    public boolean isLocationValid(Location location) {
        return AbstractC103794ly.A00(location);
    }

    @Override // X.InterfaceC12870lZ
    public void onAppBackgrounded() {
        int A03 = C0f9.A03(-1073561654);
        C14120nc.A00().ATO(new C58600PyT(this));
        C0f9.A0A(-585562079, A03);
    }

    @Override // X.InterfaceC12870lZ
    public void onAppForegrounded() {
        C0f9.A0A(-273343559, C0f9.A03(1291792111));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // X.C1VW
    public boolean shouldUseDevicePermissionKit(UserSession userSession, VDJ vdj) {
        C06090Tz c06090Tz;
        long j;
        switch (vdj.ordinal()) {
            case 0:
                c06090Tz = C06090Tz.A05;
                j = 36318015823091497L;
                return C18U.A06(c06090Tz, userSession, j);
            case 2:
                c06090Tz = C06090Tz.A05;
                j = 36318015821977368L;
                return C18U.A06(c06090Tz, userSession, j);
            case 3:
            case 22:
                c06090Tz = C06090Tz.A05;
                j = 36318015821846294L;
                return C18U.A06(c06090Tz, userSession, j);
            case 4:
            case 6:
                return true;
            case 16:
                c06090Tz = C06090Tz.A05;
                j = 36318015822894886L;
                return C18U.A06(c06090Tz, userSession, j);
            case 17:
                c06090Tz = C06090Tz.A05;
                j = 36318015822829349L;
                return C18U.A06(c06090Tz, userSession, j);
            default:
                return false;
        }
    }

    public LocationPluginImpl(Context context, C1VQ c1vq) {
        this.A01 = context;
        this.A00 = c1vq;
        if (Build.VERSION.SDK_INT >= 29) {
            C218914p.A08.A0B(this);
        }
    }

    @Override // X.C1VW
    public Location getLastLocation(UserSession userSession, long j, String str) {
        return getLastLocation(userSession, j, Float.MAX_VALUE, false, str);
    }

    @Override // X.C1VW
    public boolean isAccurateEnough(Location location, long j, float f) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (j < 900000) {
                j = 900000;
            }
            if (f < 500.0f) {
                f = 500.0f;
            }
        }
        if (location == null || !location.hasAccuracy() || location.getAccuracy() > f || System.currentTimeMillis() - location.getTime() >= j) {
            return false;
        }
        return true;
    }

    @Override // X.C1VW
    public void requestLocationSignalPackage(UserSession userSession, Activity activity, InterfaceC57959Pn5 interfaceC57959Pn5, MQC mqc, String str, VDJ vdj) {
        String[] strArr = A05;
        if (AbstractC23451Ch.A08(this.A01, strArr)) {
            A03(userSession, this, interfaceC57959Pn5, str);
            return;
        }
        mqc.EjC();
        A04(userSession, "os_prompt_impression", "precise", str, vdj.name());
        AbstractC23451Ch.A04(activity, new C48296LYu(userSession, this, mqc, vdj, interfaceC57959Pn5, str, strArr), strArr);
    }

    @Override // X.C1VW
    public void requestLocationUpdates(UserSession userSession, InterfaceC127465pP interfaceC127465pP, String str, boolean z) {
        if (A07(this.A01, userSession, "IG.location.LocationPluginImpl.requestLocationUpdates", z)) {
            A02(userSession, this, interfaceC127465pP, str, false);
        }
    }

    @Override // X.C1VW
    public Location getLastLocation(UserSession userSession, long j, float f, boolean z, String str) {
        C103804lz A01 = C3VK.A00(this.A01, userSession).A04().A01(AnonymousClass001.A0g("LocationPluginImpl", ":", str), f, j, false);
        if (A01 != null) {
            Location location = new Location(A01.A00);
            if (!z || !location.isFromMockProvider()) {
                return location;
            }
        }
        return null;
    }

    @Override // X.C1VW
    public Location getLastLocation(UserSession userSession, String str) {
        return getLastLocation(userSession, Long.MAX_VALUE, Float.MAX_VALUE, false, str);
    }
}
