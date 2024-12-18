package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class WEz {
    public User A01;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public Map A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Activity A0F;
    public final InterfaceC11380iw A0G;
    public final UserSession A0H;
    public final EnumC65855TvH A0I;
    public final VG2 A0J;
    public final String A0K;
    public final boolean A0O;
    public EnumC39619HeT A02 = EnumC39619HeT.A03;
    public MRA A03 = new Wp6();
    public float A00 = 0.7f;
    public final Map A0L = new LinkedHashMap();
    public final InterfaceC09390do A0M = AbstractC09440dt.A01(new C57511Pfl(this, 25));
    public final InterfaceC09390do A0N = AbstractC09440dt.A01(new C57511Pfl(this, 26));

    private final boolean A02(JSONArray jSONArray) {
        int i = 0;
        while (i < jSONArray.length()) {
            int i2 = i + 1;
            if (C14360o3.A0K(jSONArray.getString(i), this.A0J.toString())) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final V1X A03(C189478aR c189478aR) {
        UserSession userSession = this.A0H;
        User user = this.A01;
        String str = this.A0K;
        String moduleName = this.A0G.getModuleName();
        C49688LxJ c49688LxJ = new C49688LxJ(this.A03, new C57755Pji(this, 45));
        EnumC39619HeT enumC39619HeT = this.A02;
        EnumC65855TvH enumC65855TvH = this.A0I;
        VG2 vg2 = this.A0J;
        Map map = this.A0L;
        C14360o3.A0C(map, MSV.A00(21));
        return VXR.A00(userSession, c189478aR, user, enumC39619HeT, enumC65855TvH, vg2, c49688LxJ, null, str, this.A04, null, moduleName, (HashMap) map, 0.7f, this.A0C, true, this.A0D);
    }

    public final /* synthetic */ void A06() {
        A00(null, this);
    }

    public final void A07(EnumC39619HeT enumC39619HeT) {
        C14360o3.A0B(enumC39619HeT, 0);
        this.A02 = enumC39619HeT;
    }

    public final void A08(MRA mra) {
        C14360o3.A0B(mra, 0);
        this.A03 = mra;
    }

    public static final C3DN A00(C189478aR c189478aR, WEz wEz) {
        String str;
        boolean A01 = wEz.A01();
        Map A04 = wEz.A04();
        UserSession userSession = wEz.A0H;
        AbstractC69993VzD.A00(userSession, wEz.A0C);
        InterfaceC11380iw interfaceC11380iw = wEz.A0G;
        String str2 = wEz.A0K;
        User user = wEz.A01;
        if (user != null) {
            user.getId();
        }
        new C19260xA().A0C(wEz.A0L);
        InterfaceC09390do interfaceC09390do = wEz.A0N;
        C70155WDf c70155WDf = (C70155WDf) interfaceC09390do.getValue();
        synchronized (c70155WDf) {
            C006802i.A0p.markerStart(303970949);
            c70155WDf.A05(Boolean.valueOf(A01), null, null, null, null, 303970949);
        }
        if (A01) {
            C70155WDf c70155WDf2 = (C70155WDf) interfaceC09390do.getValue();
            synchronized (c70155WDf2) {
                C006802i.A0p.markerStart(303960177);
                c70155WDf2.A05(null, null, null, null, A04, 303960177);
            }
        }
        if (wEz.A0A) {
            C06090Tz c06090Tz = C06090Tz.A06;
            if (!C18U.A06(c06090Tz, userSession, 36312848976053528L)) {
                C18U.A06(C06090Tz.A05, userSession, 36312848976119065L);
            }
            if (C18U.A06(c06090Tz, userSession, 36312848976184602L)) {
                String str3 = (String) A04.get("location");
                if (str3 != null) {
                    VgT A00 = AbstractC69993VzD.A00(userSession, wEz.A0C);
                    EnumC39619HeT enumC39619HeT = wEz.A02;
                    VG2 vg2 = wEz.A0J;
                    String moduleName = interfaceC11380iw.getModuleName();
                    String str4 = (String) A04.get("trigger_session_id");
                    C14360o3.A0B(moduleName, 4);
                    C18920wW c18920wW = A00.A00;
                    InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "frx_start_flow");
                    if (A002.isSampled()) {
                        A002.AAP("location", str3);
                        A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC39619HeT.toString());
                        A002.AAP("object_value", str2);
                        A002.AAP("object_type", vg2.toString());
                        A002.AAP("locale", C1Q2.A03().getLanguage());
                        A002.AAP("container_module", moduleName);
                        A002.AAP(AbstractC50532MSl.A00(), str4);
                        A002.Cht();
                    }
                } else {
                    String canonicalName = wEz.getClass().getCanonicalName();
                    C14360o3.A07(canonicalName);
                    C0w9.A03(canonicalName, "IXT trigger location can't be null");
                }
            }
        }
        User user2 = wEz.A01;
        if (user2 != null) {
            str = user2.getId();
        } else {
            str = wEz.A05;
        }
        if (str != null) {
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
            ARD.E7G(AnonymousClass001.A0R("proactive_warning_banner_cache_expiration_override/", str), 0L);
            ARD.apply();
        }
        if (wEz.A01()) {
            C46095Kav c46095Kav = new C46095Kav(wEz);
            Activity activity = wEz.A0F;
            C14360o3.A0C(activity, MSV.A00(0));
            Map A042 = wEz.A04();
            new U79((FragmentActivity) activity, null, interfaceC11380iw, userSession, c189478aR, c46095Kav, Boolean.valueOf(wEz.A0A), C05F.A00, "com.bloks.www.ig.ixt.triggers.bottom_sheet.ig_content", wEz.A07, A042).A05();
            return null;
        }
        C189448aO c189448aO = (C189448aO) wEz.A0M.getValue();
        if (c189478aR != null) {
            c189478aR.A0F(wEz.A03(c189478aR), c189448aO);
        } else {
            C189478aR A003 = c189448aO.A00();
            A003.A02(wEz.A0F, wEz.A03(A003));
        }
        C3DN A004 = C3DN.A00.A00(wEz.A0F);
        if (A004 == null) {
            return null;
        }
        ((C3DP) A004).A0H = new C49624LwH(wEz, 6);
        return A004;
    }

    private final boolean A01() {
        C06090Tz c06090Tz;
        long j;
        EnumC65855TvH enumC65855TvH;
        if (!this.A0E && (!this.A0C || ((enumC65855TvH = this.A0I) != EnumC65855TvH.A0X && enumC65855TvH != EnumC65855TvH.A0s && enumC65855TvH != EnumC65855TvH.A0g && enumC65855TvH != EnumC65855TvH.A0i && enumC65855TvH != EnumC65855TvH.A0f && enumC65855TvH != EnumC65855TvH.A0h))) {
            UserSession userSession = this.A0H;
            C06090Tz c06090Tz2 = C06090Tz.A06;
            JSONArray jSONArray = new JSONArray(C18U.A04(c06090Tz2, userSession, 36874750957584438L));
            JSONArray jSONArray2 = new JSONArray(C18U.A04(c06090Tz2, userSession, 36875906303787091L));
            if (!A02(jSONArray) && !A02(jSONArray2)) {
                VG2 vg2 = this.A0J;
                if (vg2 == VG2.A03) {
                    if (this.A02 != EnumC39619HeT.A04 || !C18U.A06(c06090Tz2, userSession, 36312956350498366L)) {
                        return C18U.A06(C06090Tz.A05, userSession, 36312956350563903L);
                    }
                } else {
                    InterfaceC223716s C45 = C17060sy.A01.A01(userSession).A03.C45();
                    if (C45 != null && AbstractC166997dE.A1Z(C45.Ce1(), true) && ((vg2 == VG2.A0H || vg2 == VG2.A0J || vg2 == VG2.A0I) && C18U.A06(c06090Tz2, userSession, 36312956350432829L))) {
                        return true;
                    }
                    JSONArray jSONArray3 = new JSONArray(C18U.A04(c06090Tz2, userSession, 36874750957518901L));
                    JSONArray jSONArray4 = new JSONArray(C18U.A04(c06090Tz2, userSession, 36875906303721554L));
                    JSONArray jSONArray5 = new JSONArray(C18U.A04(c06090Tz2, userSession, 36875996498034776L));
                    if (A02(jSONArray3)) {
                        c06090Tz = C06090Tz.A05;
                        j = 36311801004032783L;
                    } else if (A02(jSONArray4)) {
                        c06090Tz = C06090Tz.A05;
                        j = 36312956350236220L;
                    } else if (A02(jSONArray5)) {
                        c06090Tz = C06090Tz.A05;
                        j = 36313046544549579L;
                    }
                    return C18U.A06(c06090Tz, userSession, j);
                }
                return false;
            }
        }
        return true;
    }

    public final Map A04() {
        boolean z;
        String A19;
        UserSession userSession = this.A0H;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36313780983957755L);
        if (A01() && (!A06 || AbstractC68601VXc.A00(userSession))) {
            z = true;
        } else {
            z = false;
        }
        String moduleName = this.A0G.getModuleName();
        EnumC65855TvH enumC65855TvH = this.A0I;
        EnumC39619HeT enumC39619HeT = this.A02;
        String str = this.A0K;
        VG2 vg2 = this.A0J;
        boolean z2 = this.A0O;
        Map map = this.A0L;
        C14360o3.A0C(map, MSV.A00(21));
        AbstractMap abstractMap = (AbstractMap) map;
        C14360o3.A0B(moduleName, 0);
        C14360o3.A0B(abstractMap, 7);
        C09530e4 c09530e4 = new C09530e4(MSV.A00(100), moduleName);
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        String lowerCase = "IG_REPORT_BUTTON_CLICKED".toLowerCase(locale);
        C14360o3.A07(lowerCase);
        LinkedHashMap A07 = AbstractC06930Yk.A07(c09530e4, new C09530e4(MSV.A00(1674), lowerCase), new C09530e4("trigger_session_id", AbstractC25231BEo.A0p()), new C09530e4(AbstractC111324zv.A00(228), C0HM.A00().toString()));
        EnumC72410Xcy A01 = AbstractC72894XqT.A01(enumC65855TvH);
        if (AbstractC25227BEk.A05(A01, 0) == 209) {
            A19 = AbstractC111324zv.A00(2476);
        } else {
            A19 = AbstractC166987dD.A19(A01);
        }
        String lowerCase2 = A19.toLowerCase(locale);
        C14360o3.A07(lowerCase2);
        A07.put("location", lowerCase2);
        String lowerCase3 = AbstractC166987dD.A19(AbstractC72894XqT.A00(enumC39619HeT)).toLowerCase(locale);
        C14360o3.A07(lowerCase3);
        A07.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, lowerCase3);
        A07.put("ig_object_value", str);
        A07.put("ig_object_type", vg2.toString());
        if (!abstractMap.isEmpty()) {
            String A00 = AbstractC111324zv.A00(236);
            if (abstractMap.get(A00) == null) {
                abstractMap.put(A00, String.valueOf(C1QM.A00.A02.A00));
            }
            A07.put(AbstractC111324zv.A00(2683), AbstractC31175DnJ.A0d(abstractMap));
        }
        String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        Object obj = "0";
        if (z) {
            obj = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        A07.put("preloading_enabled", obj);
        if (!z2) {
            str2 = "0";
        }
        A07.put("is_e2ee", str2);
        return AbstractC06930Yk.A0B(A07);
    }

    public final void A09(String str, String str2) {
        if (str2 != null) {
            this.A0L.put(str, str2);
        }
    }

    public WEz(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC65855TvH enumC65855TvH, VG2 vg2, String str, boolean z) {
        this.A0H = userSession;
        this.A0F = activity;
        this.A0G = interfaceC11380iw;
        this.A0K = str;
        this.A0I = enumC65855TvH;
        this.A0J = vg2;
        this.A0O = z;
        this.A07 = AbstractC166997dE.A0p(activity, 2131972368);
    }

    public final void A05() {
        if (A01()) {
            UserSession userSession = this.A0H;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36313780983957755L);
            if (!A06) {
                this.A0A = true;
            }
            if (AbstractC68601VXc.A00(userSession)) {
                if (A06) {
                    this.A0A = true;
                }
                Activity activity = this.A0F;
                C14360o3.A0C(activity, MSV.A00(11));
                AbstractC191798eb.A04(activity, new C191778eZ(userSession), "com.bloks.www.ig.ixt.triggers.bottom_sheet.ig_content", new HashMap(A04()), C18U.A01(C06090Tz.A06, userSession, 36594323952961202L));
            }
        }
    }
}
