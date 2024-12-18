package X;

import android.util.LruCache;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.7Nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161917Nb {
    public C206289Bl A00;
    public C26082BgB A01;
    public boolean A02;
    public C161957Nf A03;
    public final LruCache A04;
    public final C7NY A05;
    public final java.util.Set A06;
    public final Timer A07;
    public final ConcurrentLinkedQueue A08;

    public static final C45127Jxw A00(C161917Nb c161917Nb, C206289Bl c206289Bl) {
        Long l;
        C26084BgD c26084BgD;
        String str;
        long j;
        C51753Mtc c51753Mtc;
        long j2;
        int i;
        Object next;
        C51752Mtb c51752Mtb;
        C26082BgB c26082BgB = c161917Nb.A01;
        if (c26082BgB == null) {
            return null;
        }
        AbstractMap abstractMap = (AbstractMap) c26082BgB.A04;
        Object obj = c206289Bl.A04;
        C26084BgD c26084BgD2 = (C26084BgD) abstractMap.get(obj);
        if (c26084BgD2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("State data doesn't exist for ");
            sb.append(obj);
            c161917Nb.A01(sb.toString());
            return null;
        }
        Object obj2 = c206289Bl.A01;
        if (obj2 != null) {
            AbstractMap abstractMap2 = (AbstractMap) c26084BgD2.A02;
            c26084BgD = (C26084BgD) abstractMap2.get(obj2);
            if (c26084BgD == null) {
                Collection values = abstractMap2.values();
                C14360o3.A07(values);
                c26084BgD = (C26084BgD) AbstractC001800i.A0A(values);
            }
            l = null;
            str = null;
        } else {
            l = 28003L;
            Collection values2 = ((AbstractMap) c26084BgD2.A02).values();
            C14360o3.A07(values2);
            c26084BgD = (C26084BgD) AbstractC001800i.A0A(values2);
            str = "triggering_action_not_present";
        }
        if (c26084BgD == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Action data doesn't exist for ");
            sb2.append(obj2);
            c161917Nb.A01(sb2.toString());
            return null;
        }
        AbstractMap abstractMap3 = (AbstractMap) c26084BgD.A03;
        Object obj3 = c206289Bl.A03;
        if (abstractMap3.get(obj3) != null) {
            c51753Mtc = (C51753Mtc) abstractMap3.get(obj3);
        } else {
            if (str == null) {
                str = "sentiment_not_present";
            }
            if (l != null) {
                j = l.longValue();
            } else {
                j = 28004;
            }
            l = Long.valueOf(j);
            Object obj4 = c26082BgB.A00;
            if (abstractMap3.get(obj4) != null) {
                c51753Mtc = (C51753Mtc) abstractMap3.get(obj4);
            } else {
                l = 28006L;
                Collection values3 = abstractMap3.values();
                C14360o3.A07(values3);
                c51753Mtc = (C51753Mtc) AbstractC001800i.A0A(values3);
                if (c51753Mtc == null) {
                    c51753Mtc = (C51753Mtc) c26084BgD.A02;
                }
                str = "sentiment_global_not_present";
            }
        }
        if (c51753Mtc == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Sentiment data doesn't exist for ");
            sb3.append(obj3);
            c161917Nb.A01(sb3.toString());
            return null;
        }
        AbstractMap abstractMap4 = (AbstractMap) c51753Mtc.A02;
        Number number = (Number) c206289Bl.A02;
        if (abstractMap4.get(number) != null) {
            c51752Mtb = (C51752Mtb) abstractMap4.get(number);
        } else {
            if (str == null) {
                str = "intensity_not_carried";
            }
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 28005;
            }
            l = Long.valueOf(j2);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            Collection values4 = abstractMap4.values();
            C14360o3.A07(values4);
            Iterator it = AbstractC001800i.A0g(values4, new J62()).iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int abs = Math.abs(i - ((C51752Mtb) next).A00);
                    do {
                        Object next2 = it.next();
                        int abs2 = Math.abs(i - ((C51752Mtb) next2).A00);
                        if (abs > abs2) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                }
            }
            c51752Mtb = (C51752Mtb) next;
        }
        if (c51752Mtb == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Intensity data doesn't exist for ");
            sb4.append(number);
            c161917Nb.A01(sb4.toString());
            return null;
        }
        if (l != null) {
            long longValue = l.longValue();
            Iterator it2 = c161917Nb.A06.iterator();
            while (it2.hasNext()) {
                C7UD c7ud = ((C162017Nl) it2.next()).A00;
                C7F3 c7f3 = c7ud.A02;
                String str2 = (String) c7ud.A04.invoke();
                String A00 = c7ud.A00();
                C14360o3.A0B(A00, 1);
                C18920wW c18920wW = c7f3.A01;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ai_agent_embodiment_failures");
                if (A002.isSampled()) {
                    A002.AAP("thread_session_id", A00);
                    A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                    A002.A9K(TraceFieldType.ErrorCode, Long.valueOf(longValue));
                    A002.Cht();
                }
            }
        }
        List list = (List) c51752Mtb.A02;
        Object A0H = AbstractC001800i.A0H(list, AbstractC50712Us.A00);
        if (c161917Nb.A02) {
            if (c51752Mtb.A01 >= list.size()) {
                c51752Mtb.A01 = 0;
            }
            A0H = AbstractC001800i.A0O(list, c51752Mtb.A01);
            c51752Mtb.A01++;
        }
        return new C45127Jxw(str, A0H, 0);
    }

    private final void A01(String str) {
        C0K8.A0D("ClientOrchestrator", str);
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A02() {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            C7UB c7ub = ((C162017Nl) it.next()).A00.A01;
            C006802i c006802i = c7ub.A01;
            c006802i.markerPoint(814286340, c7ub.A00, "player_ready");
            c006802i.markerEnd(814286340, c7ub.A00, (short) 2);
        }
    }

    public final void A03(EnumC161927Nc enumC161927Nc) {
        C206289Bl c206289Bl = this.A00;
        Number number = (Number) c206289Bl.A03;
        Number number2 = (Number) c206289Bl.A02;
        if (number != null && number2 != null) {
            A04(enumC161927Nc, null, number.intValue(), number2.intValue());
        } else {
            A01(AnonymousClass001.A0R("Sentiment and Intensity are null for ", enumC161927Nc.name()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r15 == X.EnumC161927Nc.A04) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.EnumC161927Nc r15, java.lang.Integer r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161917Nb.A04(X.7Nc, java.lang.Integer, int, int):void");
    }

    public C161917Nb(C7NY c7ny) {
        this.A05 = c7ny;
        ((C7NX) c7ny).A00 = this;
        java.util.Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap);
        this.A06 = newSetFromMap;
        this.A08 = new ConcurrentLinkedQueue();
        this.A07 = new Timer();
        C206289Bl c206289Bl = new C206289Bl(null, null, null, null, 63);
        this.A00 = c206289Bl;
        this.A03 = AbstractC161937Nd.A00(c206289Bl, null, null, 0L);
        this.A04 = new LruCache(20);
    }
}
