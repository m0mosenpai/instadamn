package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.5Jv, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Jv {
    public final UserSession A00;
    public final C1M6 A01;

    public final HashMap A00(String str, List list) {
        C14360o3.A0B(list, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<C9BW> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((C9BW) obj).A00 instanceof XNR) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
        for (C9BW c9bw : arrayList2) {
            this.A01.EIE(c9bw, str);
            AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
            C14360o3.A0C(abstractC82583mM, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.LikeClickSignalData");
            XNR xnr = (XNR) abstractC82583mM;
            String str2 = ((C9C7) c9bw.A01).A06;
            linkedHashSet.add(str2);
            arrayList3.add(new C124305jk(str2, xnr.A04, xnr.A05, xnr.A02, xnr.A06, xnr.A03, xnr.A07, xnr.A01.ordinal(), xnr.A00));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            hashMap.put("like", AbstractC124315jl.A00(arrayList));
        }
        if (!linkedHashSet.isEmpty()) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36330084680155826L)) {
                hashMap.put("realtime_signal_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", linkedHashSet, null));
            }
        }
        return hashMap;
    }

    public final HashMap A01(String str, List list) {
        C14360o3.A0B(list, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<C9BW> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((C9BW) obj).A00 instanceof C72273XaU) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
        for (C9BW c9bw : arrayList2) {
            this.A01.EIE(c9bw, str);
            AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
            C14360o3.A0C(abstractC82583mM, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.UnlikeClickSignalData");
            C72273XaU c72273XaU = (C72273XaU) abstractC82583mM;
            String str2 = ((C9C7) c9bw.A01).A06;
            linkedHashSet.add(str2);
            arrayList3.add(new C124305jk(str2, c72273XaU.A04, c72273XaU.A05, c72273XaU.A02, c72273XaU.A06, c72273XaU.A03, c72273XaU.A07, c72273XaU.A01.ordinal(), c72273XaU.A00));
        }
        arrayList.addAll(arrayList3);
        if (!arrayList.isEmpty()) {
            hashMap.put("unlike", AbstractC124315jl.A00(arrayList));
        }
        if (!linkedHashSet.isEmpty()) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36330084680155826L)) {
                hashMap.put("realtime_signal_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", linkedHashSet, null));
            }
        }
        return hashMap;
    }

    public C5Jv(UserSession userSession, C1M6 c1m6) {
        this.A00 = userSession;
        this.A01 = c1m6;
    }
}
