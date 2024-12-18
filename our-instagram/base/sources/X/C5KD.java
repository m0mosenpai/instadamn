package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.5KD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KD {
    public final UserSession A00;
    public final C1M6 A01;
    public final String A02;
    public final String A03;

    public final HashMap A02(String str, List list) {
        HashMap hashMap;
        Collection<C9BW> values;
        C14360o3.A0B(list, 0);
        HashMap hashMap2 = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36325746762855743L)) {
            hashMap = new HashMap();
        } else {
            hashMap = null;
        }
        ArrayList<C9BW> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C9BW) obj).A00 instanceof C82573mL) {
                arrayList.add(obj);
            }
        }
        for (C9BW c9bw : arrayList) {
            C9C7 c9c7 = (C9C7) c9bw.A01;
            int ordinal = ((EnumC64262vl) c9c7.A01).ordinal();
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 1) {
                    linkedHashSet.add(c9c7.A06);
                    A01(c9bw, hashMap4, hashMap);
                }
            } else {
                linkedHashSet.add(c9c7.A06);
                A01(c9bw, hashMap3, hashMap);
            }
        }
        if (!hashMap3.isEmpty()) {
            String str2 = this.A02;
            Collection values2 = hashMap3.values();
            C14360o3.A07(values2);
            hashMap2.put(str2, AbstractC116765Qf.A00(userSession, values2, true));
        }
        if (!hashMap4.isEmpty()) {
            String str3 = this.A03;
            Collection values3 = hashMap4.values();
            C14360o3.A07(values3);
            hashMap2.put(str3, AbstractC116765Qf.A00(userSession, values3, false));
        }
        if ((!linkedHashSet.isEmpty()) && C18U.A06(c06090Tz, userSession, 36330084680155826L)) {
            hashMap2.put("realtime_signal_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", linkedHashSet, null));
        }
        if (str != null && hashMap != null && (values = hashMap.values()) != null) {
            for (C9BW c9bw2 : values) {
                C1M6 c1m6 = this.A01;
                if (c1m6 != null) {
                    c1m6.EIE(c9bw2, str);
                }
            }
        }
        return hashMap2;
    }

    public static final C116745Qd A00(C82573mL c82573mL) {
        String str = c82573mL.A0F;
        ArrayList A1N = AbstractC16960so.A1N(Long.valueOf(c82573mL.A0A));
        long j = c82573mL.A09;
        return new C116745Qd(str, c82573mL.A0H, A1N, c82573mL.A00, c82573mL.A03, c82573mL.A04, c82573mL.A02, c82573mL.A08, c82573mL.A01, c82573mL.A07, c82573mL.A05, j);
    }

    private final void A01(C9BW c9bw, Map map, Map map2) {
        C9BW c9bw2;
        long j;
        long j2;
        AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw.A00;
        C14360o3.A0C(abstractC82583mM, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.SeenStateSignalData");
        C82573mL c82573mL = (C82573mL) abstractC82583mM;
        String str = c82573mL.A0E;
        if (map.containsKey(str)) {
            C116755Qe c116755Qe = (C116755Qe) map.get(str);
            if (c116755Qe != null) {
                List list = c116755Qe.A06;
                ListIterator listIterator = list.listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    C116745Qd c116745Qd = (C116745Qd) listIterator.next();
                    if (C14360o3.A0K(c82573mL.A0F, c116745Qd.A09)) {
                        long j3 = c82573mL.A0A;
                        List list2 = c116745Qd.A0B;
                        if (list2.contains(-1L) && j3 != -1) {
                            listIterator.remove();
                        } else {
                            if (!list2.contains(-1L) || j3 != -1) {
                                list2.add(Long.valueOf(j3));
                            }
                            long j4 = c82573mL.A09;
                            long j5 = new long[]{c116745Qd.A00, j4}[0];
                            if (j4 > j5) {
                                j5 = j4;
                            }
                            c116745Qd.A00 = j5;
                        }
                    }
                }
                list.add(A00(c82573mL));
                if (map2 != null && (c9bw2 = (C9BW) map2.get(str)) != null) {
                    if (abstractC82583mM instanceof C82573mL) {
                        j = ((C82573mL) abstractC82583mM).A0A;
                    } else {
                        j = -1;
                    }
                    AbstractC82583mM abstractC82583mM2 = (AbstractC82583mM) c9bw2.A00;
                    if (abstractC82583mM2 instanceof C82573mL) {
                        j2 = ((C82573mL) abstractC82583mM2).A0A;
                    } else {
                        j2 = -1;
                    }
                    if (j > j2) {
                        map2.put(str, c9bw);
                    }
                    long A00 = abstractC82583mM.A00();
                    long A002 = abstractC82583mM2.A00();
                    if (A00 > A002) {
                        A00 = A002;
                    }
                    C9BW c9bw3 = (C9BW) map2.get(str);
                    if (c9bw3 != null) {
                        AbstractC82583mM abstractC82583mM3 = (AbstractC82583mM) c9bw3.A00;
                        if (A00 != abstractC82583mM3.A00()) {
                            C82573mL c82573mL2 = (C82573mL) abstractC82583mM3;
                            C9C7 c9c7 = (C9C7) c9bw3.A01;
                            String str2 = c82573mL2.A0E;
                            map2.put(str, new C9BW(c9c7, new C82573mL((EnumC64262vl) c9c7.A01, str2, c82573mL2.A0G, c82573mL2.A0F, c82573mL2.A0C, c82573mL2.A0D, c82573mL2.A0H, c82573mL2.A00, c82573mL2.A06, c82573mL2.A03, c82573mL2.A04, c82573mL2.A02, c82573mL2.A08, c82573mL2.A01, c82573mL2.A07, c82573mL2.A05, c82573mL2.A0A, A00)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        map.put(str, new C116755Qe(str, c82573mL.A0G, c82573mL.A0C, c82573mL.A0D, AbstractC16960so.A1N(A00(c82573mL)), c82573mL.A0B.ordinal(), c82573mL.A06));
        if (map2 == null) {
            return;
        }
        map2.put(str, c9bw);
    }

    public C5KD(UserSession userSession, C1M6 c1m6, String str, String str2) {
        this.A00 = userSession;
        this.A01 = c1m6;
        this.A02 = str;
        this.A03 = str2;
    }
}
