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
import java.util.Map;

/* renamed from: X.5n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126105n4 {
    public final UserSession A00;
    public final C1M6 A01;

    public final HashMap A00(String str, List list) {
        String str2;
        C14360o3.A0B(list, 0);
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<C9BW> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C9BW) obj).A00 instanceof C72274XaV) {
                arrayList.add(obj);
            }
        }
        ArrayList<XVY> arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (C9BW c9bw : arrayList) {
            this.A01.EIE(c9bw, str);
            AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
            C14360o3.A0C(abstractC82583mM, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.AFISignalData");
            C72274XaV c72274XaV = (C72274XaV) abstractC82583mM;
            String str3 = ((C9C7) c9bw.A01).A06;
            linkedHashSet.add(str3);
            String str4 = c72274XaV.A05;
            String str5 = c72274XaV.A06;
            String str6 = c72274XaV.A03;
            String str7 = c72274XaV.A07;
            int ordinal = c72274XaV.A02.ordinal();
            arrayList2.add(new XVY(c72274XaV.A01, str3, str4, str5, str6, str7, c72274XaV.A04, c72274XaV.A08, ordinal, c72274XaV.A00));
        }
        if (!arrayList2.isEmpty()) {
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0c();
                for (XVY xvy : arrayList2) {
                    A0A.A0d();
                    A0A.A0S("signal_id", xvy.A08);
                    A0A.A0S("container_module", xvy.A05);
                    A0A.A0S("inventory_source", xvy.A06);
                    A0A.A0S("author_id", xvy.A03);
                    A0A.A0S("item_id", xvy.A07);
                    A0A.A0Q("item_type", xvy.A00);
                    A0A.A0M("media_ids");
                    Iterator it = xvy.A09.iterator();
                    while (it.hasNext()) {
                        A0A.A0u((String) it.next());
                    }
                    A0A.A0Z();
                    A0A.A0R("click_timestamp", xvy.A01);
                    A0A.A0S("click_media_id", xvy.A04);
                    XVS xvs = xvy.A02;
                    A0A.A0S("afi_id", xvs.A03);
                    A0A.A0S(MSV.A00(375), xvs.A02);
                    A0A.A0r("extra_data");
                    A0A.A0d();
                    for (Map.Entry entry : xvs.A08.entrySet()) {
                        A0A.A0S((String) entry.getKey(), (String) entry.getValue());
                    }
                    A0A.A0a();
                    A0A.A0S("afi_type", xvs.A04);
                    A0A.A0R("global_position", xvs.A00);
                    A0A.A0S("question_id", xvs.A06);
                    A0A.A0S("trigger_source_enum", xvs.A07);
                    A0A.A0S("answer_id", xvs.A05);
                    A0A.A0S("afi_event_type", A2P.A00(xvs.A01));
                    A0A.A0a();
                }
                A0A.A0Z();
                A0A.close();
                str2 = stringWriter.toString();
            } catch (IOException e) {
                C0K8.A0H("AFIRealtimeInfo", "Unable to serialize collection.", e);
                str2 = "";
            }
            hashMap.put("afi", str2);
        }
        if (!linkedHashSet.isEmpty()) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36330084680155826L)) {
                hashMap.put("realtime_signal_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", linkedHashSet, null));
            }
        }
        return hashMap;
    }

    public C126105n4(UserSession userSession, C1M6 c1m6) {
        this.A00 = userSession;
        this.A01 = c1m6;
    }
}
