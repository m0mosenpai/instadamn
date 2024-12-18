package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WDE {
    public static final InterfaceC11380iw A0B = new C70674Weu();
    public C19260xA A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public final UserSession A09;
    public final C1QE A0A = C1QE.A01("ig_local");

    public WDE(UserSession userSession) {
        this.A09 = userSession;
    }

    public final void A01() {
        InterfaceC02590Ai A00;
        String str = this.A04;
        if (str != null) {
            switch (str.hashCode()) {
                case -1573164919:
                    if (str.equals("start_step")) {
                        C18920wW A01 = AbstractC12220kQ.A01(A0B, this.A09);
                        A00 = A01.A00(A01.A00, "ig_local_start_step");
                        if (A00.isSampled()) {
                            String str2 = this.A06;
                            C18C.A07(str2, "mLocationID cannot be null");
                            A00.A9K("location_id", AbstractC25228BEl.A13(str2));
                            String str3 = this.A07;
                            C18C.A07(str3, "mStep cannot be null");
                            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str3);
                            C1QE c1qe = this.A0A;
                            A00.AAP("waterfall_id", c1qe.A05());
                            A00.AAP("fb_page_id", this.A05);
                            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A02);
                            A00.A9K(TraceFieldType.StartTime, Long.valueOf(c1qe.A03()));
                            A00.AAk("available_options", this.A08);
                            A00.Cht();
                            break;
                        }
                    }
                    break;
                case 120623625:
                    if (str.equals("impression")) {
                        C18920wW A012 = AbstractC12220kQ.A01(A0B, this.A09);
                        A00 = A012.A00(A012.A00, "ig_local_impression");
                        if (A00.isSampled()) {
                            A00.AAP("component", this.A01);
                            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, this.A07);
                            C1QE c1qe2 = this.A0A;
                            A00.AAP("waterfall_id", c1qe2.A05());
                            A00.AAP("location_id", this.A06);
                            A00.AAP("fb_page_id", this.A05);
                            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A02);
                            C19260xA c19260xA = this.A00;
                            if (c19260xA != null) {
                                HashMap hashMap = new HashMap();
                                ArrayList A06 = c19260xA.A06("available_media");
                                if (A06 != null) {
                                    long j = 0;
                                    Iterator it = A06.iterator();
                                    while (it.hasNext()) {
                                        hashMap.put(Long.valueOf(j), it.next().toString());
                                        j++;
                                    }
                                }
                                String A05 = c19260xA.A05("profile_id");
                                if (A06 != null && A05 != null) {
                                    C0Zx c0Zx = new C0Zx();
                                    c0Zx.A05("profile_id", AbstractC25228BEl.A13(A05));
                                    c0Zx.A08("available_media", hashMap);
                                    A00.AAQ(c0Zx, "extra_data");
                                }
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            Long valueOf = Long.valueOf(currentTimeMillis);
                            long A03 = c1qe2.A03();
                            Long valueOf2 = Long.valueOf(A03);
                            A00.A9K("current_time", valueOf);
                            A00.A9K("elapsed_time", Long.valueOf(currentTimeMillis - A03));
                            A00.A9K(TraceFieldType.StartTime, valueOf2);
                            A00.A7v(AbstractC111324zv.A00(502), AbstractC166997dE.A0a());
                            A00.Cht();
                            break;
                        }
                    }
                    break;
                case 305513999:
                    if (str.equals("fetch_data")) {
                        C18920wW A013 = AbstractC12220kQ.A01(A0B, this.A09);
                        A00 = A013.A00(A013.A00, "ig_local_fetch_data");
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Long valueOf3 = Long.valueOf(currentTimeMillis2);
                        C1QE c1qe3 = this.A0A;
                        long A032 = c1qe3.A03();
                        if (A00.isSampled()) {
                            String str4 = this.A06;
                            C18C.A07(str4, "mLocationID cannot be null");
                            A00.A9K("location_id", AbstractC25228BEl.A13(str4));
                            String str5 = this.A07;
                            C18C.A07(str5, "mStep cannot be null");
                            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str5);
                            A00.AAP("waterfall_id", c1qe3.A05());
                            A00.A9K(TraceFieldType.StartTime, Long.valueOf(c1qe3.A03()));
                            A00.A9K("elapsed_time", Long.valueOf(currentTimeMillis2 - A032));
                            A00.A9K("current_time", valueOf3);
                            String str6 = this.A05;
                            if (str6 != null) {
                                A00.AAP("fb_page_id", str6);
                            }
                            String str7 = this.A02;
                            if (str7 != null) {
                                A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
                            }
                            String str8 = this.A01;
                            if (str8 != null) {
                                A00.AAP("component", str8);
                            }
                            A00.Cht();
                            break;
                        }
                    }
                    break;
            }
        } else {
            C19280xC A04 = this.A0A.A04(AnonymousClass001.A0g("ig_local", "_", str));
            String str9 = this.A07;
            if (str9 != null) {
                A04.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str9);
            }
            String str10 = this.A01;
            if (str10 != null) {
                A04.A0C("component", str10);
            }
            String str11 = this.A05;
            if (str11 != null) {
                A04.A0C("fb_page_id", str11);
            }
            List list = this.A08;
            if (list != null) {
                A04.A0D("available_options", list);
            }
            C19260xA c19260xA2 = this.A00;
            if (c19260xA2 != null) {
                A04.A05(c19260xA2, "extra_data");
            }
            String str12 = this.A06;
            if (str12 != null) {
                A04.A0C("location_id", str12);
            }
            String str13 = this.A03;
            if (str13 != null) {
                A04.A0C("error_message", str13);
            }
            String str14 = this.A02;
            if (str14 != null) {
                A04.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str14);
            }
            AbstractC31173DnH.A1S(A04, this.A09);
        }
        this.A04 = null;
        this.A07 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A08 = null;
        this.A00 = null;
    }

    public final void A02(C19260xA c19260xA, C19260xA c19260xA2, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        C18920wW A01 = AbstractC12220kQ.A01(A0B, this.A09);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_local_action");
        if (A00.isSampled()) {
            A00.AAP("location_id", str4);
            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
            A00.AAP("action", str2);
            if (str3 != null) {
                A00.AAP("component", str3);
            }
            if (map != null) {
                A00.A9M("available_options", map);
            }
            if (c19260xA != null) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("tab", c19260xA.A05("tab"));
                A00.AAQ(c0Zx, "selected_values");
            }
            if (c19260xA2 != null) {
                C0Zx c0Zx2 = new C0Zx();
                c0Zx2.A05("profile_id", c19260xA2.A04("profile_id"));
                A00.AAQ(c0Zx2, "extra_data");
            }
            if (str5 != null) {
                A00.AAP("fb_page_id", str5);
            }
            if (str6 != null) {
                A00.AAP("m_pk", str6);
            }
            A00.Cht();
        }
    }

    public static String A00(AbstractC12990ll abstractC12990ll) {
        C0x9 A00;
        int size;
        C55782hJ A002 = C55772hI.A00(abstractC12990ll);
        String str = A002.A05;
        if (str != null && (A00 = C55782hJ.A00(A002, str)) != null && (size = A00.EqF().A01.size()) > 0) {
            AnalyticsEventDebugInfo analyticsEventDebugInfo = ((AnalyticsEventEntry) A00.EqF().A01.get(size - 1)).A00;
            if (analyticsEventDebugInfo != null && analyticsEventDebugInfo.A01.size() > 0) {
                return String.valueOf(((AnalyticsEventEntry) analyticsEventDebugInfo.A01.get(0)).A01);
            }
            return null;
        }
        return null;
    }
}
