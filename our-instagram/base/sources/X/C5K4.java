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

/* renamed from: X.5K4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5K4 {
    public final UserSession A00;
    public final C1M6 A01;
    public final C5K8 A02;

    public final HashMap A00(String str, List list) {
        String str2;
        String str3;
        C14360o3.A0B(list, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<C9BW> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((C9BW) obj).A00 instanceof C208209Je) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
        for (C9BW c9bw : arrayList2) {
            this.A01.EIE(c9bw, str);
            AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
            C14360o3.A0C(abstractC82583mM, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ProfileTapSignalData");
            C208209Je c208209Je = (C208209Je) abstractC82583mM;
            String str4 = ((C9C7) c9bw.A01).A06;
            linkedHashSet.add(str4);
            String str5 = c208209Je.A05;
            String str6 = c208209Je.A06;
            String str7 = c208209Je.A03;
            String str8 = c208209Je.A07;
            int ordinal = c208209Je.A01.ordinal();
            List list2 = c208209Je.A08;
            long j = c208209Je.A00;
            String str9 = c208209Je.A04;
            C5K7 c5k7 = (C5K7) this.A02;
            C14360o3.A0B(str7, 0);
            EnumC222416a enumC222416a = (EnumC222416a) c5k7.A00.get(str7);
            if (enumC222416a == null || (str3 = enumC222416a.A02) == null) {
                str3 = c208209Je.A02;
            }
            arrayList3.add(new C9CS(str4, str5, str6, str7, str8, str9, str3, list2, ordinal, 0, j));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            ((C5K7) this.A02).A00.clear();
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C9CS c9cs = (C9CS) it.next();
                    A0A.A0d();
                    A0A.A0S("signal_id", c9cs.A0A);
                    A0A.A0S("container_module", c9cs.A07);
                    A0A.A0S("inventory_source", c9cs.A08);
                    A0A.A0S("author_id", c9cs.A05);
                    A0A.A0S("item_id", c9cs.A09);
                    A0A.A0Q("item_type", c9cs.A01);
                    A0A.A0M("media_ids");
                    Iterator it2 = ((List) c9cs.A03).iterator();
                    while (it2.hasNext()) {
                        A0A.A0u((String) it2.next());
                    }
                    A0A.A0Z();
                    A0A.A0R("click_timestamp", c9cs.A02);
                    A0A.A0S("click_media_id", c9cs.A06);
                    A0A.A0S("account_type", c9cs.A04);
                    A0A.A0a();
                }
                A0A.A0Z();
                A0A.close();
                str2 = stringWriter.toString();
            } catch (IOException e) {
                C0K8.A0H("ProfileTapRealtimeInfo", "Unable to serialize collection.", e);
                str2 = "";
            }
            hashMap.put("profile_visit", str2);
        }
        if (!linkedHashSet.isEmpty()) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36330084680155826L)) {
                hashMap.put("realtime_signal_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", linkedHashSet, null));
            }
        }
        return hashMap;
    }

    public /* synthetic */ C5K4(UserSession userSession, C1M6 c1m6) {
        C5K8 A00 = C5K5.A00(userSession);
        C14360o3.A0B(A00, 3);
        this.A00 = userSession;
        this.A01 = c1m6;
        this.A02 = A00;
    }
}
