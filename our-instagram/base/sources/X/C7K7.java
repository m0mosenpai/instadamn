package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7K7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7K7 {
    public C163547Tr A00;
    public final UserSession A01;
    public final Map A02;
    public final AtomicInteger A03;
    public final C7K9 A04;
    public final java.util.Set A05;

    public C7K7(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        java.util.Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap);
        this.A05 = newSetFromMap;
        this.A02 = new ConcurrentHashMap();
        this.A03 = new AtomicInteger();
        this.A04 = new C7K9() { // from class: X.7K8
            @Override // X.C7K9
            public final void onSuccess(User user) {
                C14360o3.A0B(user, 0);
                C7K7 c7k7 = C7K7.this;
                c7k7.A02.put(user.getId(), user);
                if (c7k7.A03.decrementAndGet() <= 0) {
                    C7K7.A00(c7k7);
                }
            }

            @Override // X.C7K9
            public final void onFail(AbstractC115105If abstractC115105If) {
                C0K8.A0C("DirectThreadUserFetcher", "Unable to fetch missing user from thread.");
                C7K7 c7k7 = C7K7.this;
                if (c7k7.A03.decrementAndGet() <= 0 && c7k7.A02.size() > 1) {
                    C7K7.A00(c7k7);
                }
            }
        };
    }

    public static final void A00(C7K7 c7k7) {
        User user;
        C163547Tr c163547Tr = c7k7.A00;
        if (c163547Tr != null) {
            Iterator it = C163547Tr.A0C(c163547Tr, 20).iterator();
            while (it.hasNext()) {
                C160787Im c160787Im = (C160787Im) it.next();
                if (c160787Im.A0K == null && (user = (User) c7k7.A02.get(c160787Im.A0e.A1u)) != null) {
                    c160787Im.A0K = user;
                    c163547Tr.A0V(c160787Im);
                }
            }
        }
    }

    public final void A01(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C160787Im c160787Im = (C160787Im) obj;
            if (c160787Im.A0K == null && !this.A05.contains(c160787Im.A0e.A1u)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C160787Im) it.next()).A0e.A1u);
        }
        java.util.Set A0k = AbstractC001800i.A0k(arrayList2);
        if (!A0k.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Users missing from thread and cache: ");
            sb.append(A0k);
            C0K8.A0C("DirectThreadUserFetcher", sb.toString());
            ArrayList<String> arrayList3 = new ArrayList();
            for (Object obj2 : A0k) {
                C14360o3.A0A(obj2);
                UserSession userSession = this.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36323045228424064L) || AbstractC001900j.A0R(C18U.A04(c06090Tz, userSession, 36885995181900476L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).contains(obj2)) {
                    arrayList3.add(obj2);
                }
            }
            if (!arrayList3.isEmpty()) {
                this.A05.addAll(arrayList3);
                C4LM c4lm = C4LM.A02;
                C14360o3.A07(c4lm);
                for (String str : arrayList3) {
                    this.A03.incrementAndGet();
                    c4lm.A02(this.A01, this.A04, str);
                }
            }
        }
    }
}
