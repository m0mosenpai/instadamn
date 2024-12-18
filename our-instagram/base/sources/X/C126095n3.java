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

/* renamed from: X.5n3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126095n3 {
    public final UserSession A00;
    public final C1M6 A01;

    public final HashMap A00(String str, String str2, List list) {
        String str3;
        C14360o3.A0B(list, 1);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<C9BW> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((C9BW) obj).A00 instanceof XNM) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
        for (C9BW c9bw : arrayList2) {
            this.A01.EIE(c9bw, str2);
            AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
            C14360o3.A0C(abstractC82583mM, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.GeneralSignalData");
            XNM xnm = (XNM) abstractC82583mM;
            String str4 = ((C9C7) c9bw.A01).A06;
            linkedHashSet.add(str4);
            arrayList3.add(new C123665if(str4, xnm.A03, xnm.A04, xnm.A02, xnm.A05, xnm.A06, xnm.A07, xnm.A01.ordinal(), xnm.A00));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C123665if c123665if = (C123665if) it.next();
                    A0A.A0d();
                    A0A.A0S("signal_id", c123665if.A07);
                    A0A.A0S("container_module", c123665if.A04);
                    A0A.A0S("inventory_source", c123665if.A05);
                    A0A.A0S("author_id", c123665if.A02);
                    A0A.A0S("item_id", c123665if.A06);
                    A0A.A0Q("item_type", c123665if.A00);
                    A0A.A0M("media_ids");
                    Iterator it2 = c123665if.A08.iterator();
                    while (it2.hasNext()) {
                        A0A.A0u((String) it2.next());
                    }
                    A0A.A0Z();
                    A0A.A0R("click_timestamp", c123665if.A01);
                    A0A.A0S("click_media_id", c123665if.A03);
                    A0A.A0a();
                }
                A0A.A0Z();
                A0A.close();
                str3 = stringWriter.toString();
            } catch (IOException e) {
                C0K8.A0H("GeneralSignalRealtimeInfo", "Unable to serialize collection.", e);
                str3 = "";
            }
            hashMap.put(str, str3);
        }
        if (!linkedHashSet.isEmpty()) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36330084680155826L)) {
                hashMap.put("realtime_signal_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", linkedHashSet, null));
            }
        }
        return hashMap;
    }

    public C126095n3(UserSession userSession, C1M6 c1m6) {
        this.A00 = userSession;
        this.A01 = c1m6;
    }
}
