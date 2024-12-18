package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.reverb.ReverbMessage;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LLF {
    public static final LLF A00 = new Object();

    public static final List A03(String str, List list, InterfaceC16660sJ interfaceC16660sJ) {
        int i;
        int i2 = -1;
        if (str != null) {
            ListIterator A14 = AbstractC43592JPx.A14(list);
            while (true) {
                if (!A14.hasPrevious()) {
                    break;
                }
                if (C14360o3.A0K(interfaceC16660sJ.invoke(A14.previous()), str)) {
                    i2 = A14.nextIndex();
                    break;
                }
            }
        }
        if (i2 == -1) {
            return AbstractC001800i.A0h(list, 30);
        }
        if (i2 < 14) {
            i = 0;
        } else if (list.size() <= i2 + 15) {
            i = AbstractC31172DnG.A03(list, 30);
        } else {
            i = i2 - 14;
        }
        if (list.size() <= 30) {
            return list;
        }
        return list.subList(i, i + 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List A00(UserSession userSession, AbstractC46413KgZ abstractC46413KgZ, C2EC c2ec) {
        Long l;
        ?? A1E;
        AbstractCollection A1E2;
        String str;
        List list;
        if (!c2ec.CWk(userSession)) {
            return C16930sl.A00;
        }
        AbstractC207749He.A00();
        JV6 A01 = JVE.A01(userSession);
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Long C7O = c2ec.C7O();
        C7OH c7oh = new C7OH(c2ec);
        if (abstractC46413KgZ instanceof KOG) {
            c2ec.C7O();
            KOG kog = (KOG) abstractC46413KgZ;
            List list2 = kog.A00;
            ArrayList A1E4 = AbstractC166987dD.A1E();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String A03 = C4H6.A03(AbstractC166987dD.A1B(it));
                if (A03 != null) {
                    A1E4.add(A03);
                }
            }
            C47493KyM c47493KyM = (C47493KyM) JV6.A05(A01, null, C7O.toString(), null, A1E4, kog.A01, 1000L, true).A00;
            if (c47493KyM == null || (list = c47493KyM.A00) == null) {
                return A1E3;
            }
            A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.msys.reverb.ReverbMessage");
                if (A1E4.contains(((ReverbMessage) obj).getMessageId())) {
                    A1E.add(obj);
                }
            }
        } else if (abstractC46413KgZ instanceof KOH) {
            c2ec.C7O();
            KOH koh = (KOH) abstractC46413KgZ;
            String str2 = koh.A01;
            int i = koh.A00;
            if (str2 != null) {
                l = Long.valueOf(AbstractC166987dD.A0L(C4H6.A01(str2)));
            } else {
                l = null;
            }
            C14360o3.A0A(C7O);
            long longValue = C7O.longValue();
            if (l == null) {
                A1E = JV6.A02(A01, null, i, longValue, true);
                if (A1E == 0) {
                    return A1E3;
                }
            } else {
                List A02 = JV6.A02(A01, l, i, longValue, true);
                List A022 = JV6.A02(A01, l, i, longValue, false);
                A1E = AbstractC166987dD.A1E();
                if (A02 != null) {
                    A1E.addAll(A02);
                }
                if (A022 != null) {
                    A1E.addAll(A022);
                }
            }
        } else {
            throw B4Z.A00();
        }
        int size = A1E.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = A1E.get(i2);
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.msys.reverb.ReverbMessage");
            ReverbMessage reverbMessage = (ReverbMessage) obj2;
            L9R l9r = A01.A02;
            C83403nh c83403nh = (C83403nh) l9r.A01(c7oh, reverbMessage, C7O.longValue(), false).A00;
            if (c83403nh != null) {
                boolean wasDeleted = reverbMessage.wasDeleted();
                if (c83403nh.A2D != wasDeleted) {
                    c83403nh.A2D = wasDeleted;
                    c83403nh.A2C = true;
                }
                C45120Jxp c45120Jxp = c83403nh.A0D;
                if (c45120Jxp != null) {
                    c45120Jxp.A00 = reverbMessage.getToplevelPayload();
                }
                ArrayList A1E5 = AbstractC166987dD.A1E();
                C83403nh A012 = JV6.A01(A01, c83403nh, c2ec.BKb());
                if (reverbMessage.getSupplementalKeys() instanceof ArrayList) {
                    Object supplementalKeys = reverbMessage.getSupplementalKeys();
                    C14360o3.A0C(supplementalKeys, "null cannot be cast to non-null type java.util.ArrayList<*>");
                    A1E2 = (AbstractCollection) supplementalKeys;
                } else {
                    A1E2 = AbstractC166987dD.A1E();
                }
                ArrayList A1E6 = AbstractC166987dD.A1E();
                Iterator it2 = A1E2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if ((next instanceof String) && (str = (String) next) != null && AbstractC001900j.A0a(str, "edit:", false)) {
                        A1E6.add(next);
                    }
                }
                int size2 = A1E6.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj3 = A1E6.get(i3);
                    AbstractC25225BEi.A1S(obj3);
                    String str3 = (String) obj3;
                    l9r.A02(A012, c7oh, reverbMessage, str3);
                    long timestampInMsForSupplementalKey = reverbMessage.getTimestampInMsForSupplementalKey(str3);
                    C83403nh A013 = JV6.A01(A01, A012, c2ec.BKb());
                    A013.A1B(Long.valueOf(TimeUnit.MILLISECONDS.toMicros(timestampInMsForSupplementalKey)));
                    C45120Jxp c45120Jxp2 = A013.A0D;
                    if (c45120Jxp2 != null) {
                        c45120Jxp2.A00 = reverbMessage.getPayloadForSupplementalKey(str3);
                    }
                    A1E5.add(A013);
                }
                AbstractC166997dE.A1R(c83403nh, A1E5, A1E3);
            }
        }
        return A1E3;
    }

    public static final void A04(UserSession userSession, C2EC c2ec, List list, List list2, Map map) {
        KOG kog = new KOG(list, list2);
        AbstractC207749He.A00();
        C14360o3.A0B(userSession, 0);
        C99V.A00(userSession);
        Iterator it = C16930sl.A00.iterator();
        while (it.hasNext()) {
            C09530e4 A17 = AbstractC43592JPx.A17(it);
            String A0h = ((C83403nh) A17.A00).A0h();
            if (A0h != null) {
                map.put(A0h, A17);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        Iterator it2 = A00(userSession, kog, c2ec).iterator();
        while (it2.hasNext()) {
            C09530e4 A172 = AbstractC43592JPx.A17(it2);
            String A0h2 = ((C83403nh) A172.A00).A0h();
            if (A0h2 != null) {
                map.put(A0h2, A172);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }

    public static final List A01(C2EC c2ec, C2DS c2ds) {
        List BTB = c2ds.BTB(LWI.A00, c2ec.BKb(), null);
        if (BTB != null) {
            ArrayList A0q = AbstractC167017dG.A0q(BTB);
            Iterator it = BTB.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1R(it.next(), C16930sl.A00, A0q);
            }
            return A0q;
        }
        return C16930sl.A00;
    }

    public static final List A02(C2EC c2ec, C2DS c2ds) {
        ArrayList Ab7 = c2ds.Ab7(c2ec.BKb(), true);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = Ab7.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C83403nh) next).A0h() != null) {
                A1E.add(next);
            }
        }
        return A1E;
    }
}
