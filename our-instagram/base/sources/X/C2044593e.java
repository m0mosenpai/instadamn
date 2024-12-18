package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Map;

/* renamed from: X.93e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2044593e {
    public Context A01;
    public InterfaceC61432r6 A02;
    public Boolean A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public Map A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final UserSession A0L;
    public long A00 = -1;
    public String A07 = "discover/topical_explore/";

    public static final void A00(AbstractC23721Ec abstractC23721Ec, C2044593e c2044593e) {
        Context context;
        UserSession userSession = c2044593e.A0L;
        if (C18U.A06(C06090Tz.A05, userSession, 36315881223425701L) && (context = c2044593e.A01) != null) {
            AbstractC23841Er.A00(context, abstractC23721Ec, userSession, new C1CM(context), false);
        }
    }

    public final C1ON A01() {
        UserSession userSession = this.A0L;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B(this.A07);
        c25621Ms.A02 = new C25581Mo(new C07510aQ(userSession), C2044793g.class);
        c25621Ms.A0A = this.A08;
        c25621Ms.A08(C05F.A0C);
        ((AbstractC23721Ec) c25621Ms).A01 = this.A00;
        A00(c25621Ms, this);
        return c25621Ms.A0N();
    }

    public final C1ON A02(Map map) {
        String str;
        Integer num;
        Map map2;
        Location lastLocation;
        String str2 = this.A08;
        if (str2 != null) {
            UserSession userSession = this.A0L;
            String str3 = null;
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A09(C05F.A0N);
            c25621Ms.A0B(this.A07);
            c25621Ms.A0P(null, C2044693f.class, C2044793g.class, false);
            c25621Ms.A9s(AbstractC58358Pty.A01(9, 10, 108), this.A0A);
            if (this.A0I) {
                str = "true";
            } else {
                str = "false";
            }
            c25621Ms.A9s("is_prefetch", str);
            c25621Ms.A9s("timezone_offset", String.valueOf(C23831Eq.A00()));
            c25621Ms.A9s("reels_configuration", AbstractC58592mI.A00(userSession).A01);
            C93U.A00(userSession);
            C14360o3.A0B("guide_id", 0);
            C93U.A00(userSession);
            C14360o3.A0B("guide_enabled_on_page", 0);
            c25621Ms.A0H("module", this.A0C);
            if (!this.A0J) {
                str3 = this.A0E;
            }
            c25621Ms.A0H("cluster_id", str3);
            c25621Ms.A0H(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, this.A0D);
            c25621Ms.A0H("paging_token", this.A06);
            c25621Ms.A0F("is_nonpersonalized_explore", this.A03);
            c25621Ms.A0H("session_paging_token", this.A0B);
            AbstractC2044893h.A06(c25621Ms, this.A09);
            C1VW c1vw = C1VW.A00;
            if (c1vw != null && (lastLocation = c1vw.getLastLocation(userSession, 10800000L, 50000.0f, "ExploreTopicalFeedNetworkHelper")) != null) {
                c25621Ms.A9s("lat", String.valueOf(lastLocation.getLatitude()));
                c25621Ms.A9s("lng", String.valueOf(lastLocation.getLongitude()));
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36319265657265266L) && (map2 = this.A0F) != null && (!map2.isEmpty())) {
                c25621Ms.A9s("ad_and_netego_request_information", C85753s4.A00(map2));
            }
            if (this.A0I) {
                if (this.A0H) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                c25621Ms.A09 = num;
            } else {
                ((AbstractC23721Ec) c25621Ms).A06 = EnumC23341Bw.CriticalAPI;
            }
            if (!this.A0H || this.A0K) {
                c25621Ms.A0A = str2;
                c25621Ms.A08(C05F.A01);
            }
            ((AbstractC23721Ec) c25621Ms).A01 = this.A00;
            c25621Ms.A0I("is_ptr", this.A0J);
            c25621Ms.A0I("is_auto_refresh", this.A0G);
            Integer num2 = this.A04;
            if (num2 != null) {
                c25621Ms.A0A = str2;
                c25621Ms.A07 = num2;
                c25621Ms.A02 = new C25581Mo(new C07510aQ(userSession), C2044793g.class);
            }
            Long l = this.A05;
            if (l != null) {
                ((AbstractC23721Ec) c25621Ms).A00 = l.longValue();
            }
            A00(c25621Ms, this);
            if (!C18U.A06(c06090Tz, userSession, 36330084680286900L)) {
                InterfaceC61432r6 interfaceC61432r6 = this.A02;
                if (interfaceC61432r6 != null) {
                    map = interfaceC61432r6.AUS(this.A07);
                }
                return c25621Ms.A0N();
            }
            if (map != null) {
                for (Map.Entry entry : AbstractC85703rz.A00(map).entrySet()) {
                    c25621Ms.A9s((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return c25621Ms.A0N();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C2044593e(UserSession userSession) {
        this.A0L = userSession;
    }
}
