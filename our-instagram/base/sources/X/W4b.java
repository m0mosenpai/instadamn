package X;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class W4b {
    public EnumC68206VFy A00;
    public String A01;
    public final Context A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    public static C69132ViN A00(EnumC68206VFy enumC68206VFy, W4b w4b) {
        C69132ViN c69132ViN = (C69132ViN) w4b.A06.get(enumC68206VFy);
        if (c69132ViN != null) {
            return c69132ViN;
        }
        throw AbstractC43594JPz.A0o(enumC68206VFy, "Unsupported FeedRequestType: ", new StringBuilder());
    }

    public final void A01(AbstractC154286wd abstractC154286wd, String str, boolean z, boolean z2, boolean z3) {
        C69132ViN A00 = A00(this.A00, this);
        if (z) {
            C154806xV c154806xV = A00.A02.A03;
            c154806xV.A07 = null;
            c154806xV.A02 = null;
            A00.A01 = null;
            A00.A00 = null;
        }
        C154796xU c154796xU = A00.A02;
        String str2 = c154796xU.A03.A07;
        List list = A00.A01;
        String str3 = A00.A00;
        UserSession userSession = this.A03;
        String str4 = this.A04;
        AbstractC167017dG.A1N(userSession, str4);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0R(C67848UzT.class, C69957VyX.class);
        A0c.A0B(AbstractC13670mt.A06("tags/%s/sections/", str4));
        AbstractC2044893h.A06(A0c, str2);
        if (str2 == null) {
            this.A01 = AbstractC166997dE.A0n();
        }
        if (list != null && !list.isEmpty()) {
            A0c.A9s("next_media_ids", list.toString());
        }
        if (str3 != null) {
            A0c.A9s("page", str3);
        }
        A0c.A9s("rank_token", this.A01);
        C1BX c1bx = ((C56125Ovl) userSession.A01(C56125Ovl.class, new C57241PbP(userSession, 20))).A00;
        HashSet hashSet = new HashSet();
        String A002 = AbstractC111324zv.A00(3055);
        java.util.Set A06 = c1bx.A06(A002, hashSet);
        c1bx.A0A(A002);
        if (!A06.isEmpty()) {
            A0c.A9s(A002, AbstractC13670mt.A05(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A06));
        }
        Context context = this.A02;
        if (C1VW.isLocationEnabled(context) && C1VW.isLocationPermitted(context, userSession, "HASH_TAG")) {
            C1VW c1vw = C1VW.A00;
            c1vw.getClass();
            Location lastLocation = c1vw.getLastLocation(userSession, "HashtagFeedRequestController");
            if (lastLocation != null) {
                A0c.A9s("lat", String.valueOf(lastLocation.getLatitude()));
                A0c.A9s("lng", String.valueOf(lastLocation.getLongitude()));
            }
        }
        A0c.A0I("include_persistent", z2);
        if (z2) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : ((C68871VdT) userSession.A01(C68871VdT.class, new C50159MDm(userSession, 21))).A00) {
                if (obj != EnumC68206VFy.A0A) {
                    jSONArray.put(obj.toString());
                }
            }
            A0c.A9s("supported_tabs", jSONArray.toString());
        }
        if (z3) {
            A0c.A9s("include_challenges", "true");
        }
        EnumC68206VFy enumC68206VFy = this.A00;
        if (enumC68206VFy != EnumC68206VFy.A0A) {
            A0c.A9s("tab", enumC68206VFy.toString());
        }
        String str5 = this.A05;
        if (str5 != null) {
            A0c.A9s(MSV.A00(1652), str5);
        }
        A0c.A9s("media_recency_filter", str);
        c154796xU.A03(A0c.A0N(), new C68045V7x(abstractC154286wd, A00));
    }

    public W4b(Context context, UserSession userSession, EnumC68206VFy enumC68206VFy, String str, String str2, Map map) {
        this.A02 = context;
        this.A06 = map;
        this.A04 = android.net.Uri.encode(str.trim());
        this.A03 = userSession;
        this.A00 = enumC68206VFy;
        this.A05 = str2;
        C18C.A0F(!TextUtils.isEmpty(r0));
    }
}
