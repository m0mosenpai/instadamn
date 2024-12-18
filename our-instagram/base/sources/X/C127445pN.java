package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.5pN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127445pN {
    public final UserSession A00;
    public final C1M6 A01;

    public final HashMap A00(String str, List list) {
        String str2;
        C14360o3.A0B(list, 0);
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<C9BW> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C9BW) obj).A00 instanceof C72275XaX) {
                arrayList.add(obj);
            }
        }
        ArrayList<C9CR> arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (C9BW c9bw : arrayList) {
            this.A01.EIE(c9bw, str);
            AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
            C14360o3.A0C(abstractC82583mM, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.IABNoBounceSignalData");
            C72275XaX c72275XaX = (C72275XaX) abstractC82583mM;
            String str3 = ((C9C7) c9bw.A01).A06;
            linkedHashSet.add(str3);
            boolean z = c72275XaX.A08;
            String str4 = c72275XaX.A03;
            String str5 = c72275XaX.A04;
            String str6 = c72275XaX.A05;
            int ordinal = c72275XaX.A01.ordinal();
            arrayList2.add(new C9CR(str3, str4, str5, str6, c72275XaX.A02, c72275XaX.A06, c72275XaX.A07, ordinal, 1, c72275XaX.A00, z));
        }
        if (!arrayList2.isEmpty()) {
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0c();
                for (C9CR c9cr : arrayList2) {
                    A0A.A0d();
                    A0A.A0T("is_no_bounce_client_logging", c9cr.A0A);
                    A0A.A0S("signal_id", c9cr.A08);
                    A0A.A0S("container_module", c9cr.A05);
                    A0A.A0S("inventory_source", c9cr.A06);
                    A0A.A0S("tracking_token", c9cr.A09);
                    A0A.A0S("item_id", c9cr.A07);
                    A0A.A0Q("item_type", c9cr.A01);
                    A0A.A0M("media_ids");
                    Iterator it = ((List) c9cr.A03).iterator();
                    while (it.hasNext()) {
                        A0A.A0u((String) it.next());
                    }
                    A0A.A0Z();
                    A0A.A0R("click_timestamp", c9cr.A02);
                    A0A.A0S("click_media_id", c9cr.A04);
                    A0A.A0a();
                }
                A0A.A0Z();
                A0A.close();
                str2 = stringWriter.toString();
            } catch (IOException e) {
                C0K8.A0H("IABNoBounceRealTimeInfo", "Unable to serialize collection.", e);
                str2 = "";
            }
            hashMap.put("iab_no_bounce", str2);
        }
        if (!linkedHashSet.isEmpty()) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36330084680155826L)) {
                hashMap.put("realtime_signal_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", linkedHashSet, null));
            }
        }
        return hashMap;
    }

    public C127445pN(UserSession userSession, C1M6 c1m6) {
        this.A00 = userSession;
        this.A01 = c1m6;
    }
}
