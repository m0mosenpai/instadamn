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

/* renamed from: X.5rH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128485rH {
    public static final /* synthetic */ C128485rH A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5rI] */
    public static final C128495rI A00(final UserSession userSession, final C1M6 c1m6, final EnumC64222vh enumC64222vh) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c1m6, 2);
        return new InterfaceC128505rJ(userSession, c1m6, enumC64222vh) { // from class: X.5rI
            public final C128525rL A00;
            public final InterfaceC25391Lt A01;
            public final InterfaceC115345Ji A02;
            public final boolean A03;

            {
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330084679828143L);
                InterfaceC25391Lt A002 = C25361Lq.A00(userSession);
                InterfaceC115345Ji interfaceC115345Ji = new InterfaceC115345Ji(enumC64222vh) { // from class: X.5rK
                    public final EnumC64222vh A00;

                    @Override // X.InterfaceC115345Ji
                    public final List EMu(List list) {
                        C14360o3.A0B(list, 0);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            C9C7 c9c7 = (C9C7) ((C9BW) obj).A01;
                            if (c9c7.A04 == AnonymousClass317.A04 && this.A00 == c9c7.A05) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    }

                    {
                        this.A00 = enumC64222vh;
                    }
                };
                C128525rL c128525rL = new C128525rL(userSession, c1m6);
                C14360o3.A0B(A002, 5);
                this.A03 = A06;
                this.A01 = A002;
                this.A02 = interfaceC115345Ji;
                this.A00 = c128525rL;
            }

            @Override // X.InterfaceC128505rJ
            public final HashMap AUb(String str) {
                String str2;
                InterfaceC25391Lt interfaceC25391Lt = this.A01;
                List EMt = interfaceC25391Lt.EMt(this.A02);
                if (!this.A03) {
                    interfaceC25391Lt.EGJ(EMt);
                }
                C128525rL c128525rL = this.A00;
                C14360o3.A0B(EMt, 0);
                HashMap hashMap = new HashMap();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList<C9BW> arrayList = new ArrayList();
                for (Object obj : EMt) {
                    if (((C9BW) obj).A00 instanceof XaW) {
                        arrayList.add(obj);
                    }
                }
                ArrayList<C9CR> arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
                for (C9BW c9bw : arrayList) {
                    c128525rL.A01.EIE(c9bw, str);
                    AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
                    C14360o3.A0C(abstractC82583mM, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.AdClickSignalData");
                    XaW xaW = (XaW) abstractC82583mM;
                    String str3 = ((C9C7) c9bw.A01).A06;
                    linkedHashSet.add(str3);
                    boolean z = xaW.A08;
                    String str4 = xaW.A03;
                    String str5 = xaW.A04;
                    String str6 = xaW.A05;
                    int ordinal = xaW.A01.ordinal();
                    arrayList2.add(new C9CR(str3, str4, str5, str6, xaW.A02, xaW.A06, xaW.A07, ordinal, 0, xaW.A00, z));
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        StringWriter stringWriter = new StringWriter();
                        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                        A0A.A0c();
                        for (C9CR c9cr : arrayList2) {
                            A0A.A0d();
                            A0A.A0T("is_ad_click", c9cr.A0A);
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
                        C0K8.A0H("AdClickRealTimeInfo", "Unable to serialize collection.", e);
                        str2 = "";
                    }
                    hashMap.put("ad_click", str2);
                }
                if (!linkedHashSet.isEmpty()) {
                    if (C18U.A06(C06090Tz.A05, c128525rL.A00, 36330084680155826L)) {
                        hashMap.put("realtime_signal_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", linkedHashSet, null));
                    }
                }
                return hashMap;
            }
        };
    }
}
