package X;

import android.util.Pair;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5NB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NB {
    public final void A00(AbstractC23721Ec abstractC23721Ec, UserSession userSession, String str, Map map, java.util.Set set, boolean z) {
        java.util.Set<Map.Entry> entrySet;
        ArrayList arrayList = new ArrayList();
        ReelStore A03 = ReelStore.A03(userSession);
        C14360o3.A07(A03);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Reel A0M = A03.A0M(str2);
            if (A0M != null || (A0M = A03.A0N(str2)) != null) {
                arrayList.add(A0M);
            }
        }
        if (!AbstractC001900j.A0a(str, "push_notification", false) && (!arrayList.isEmpty())) {
            try {
                abstractC23721Ec.A9s("exclude_media_ids", C5NC.A00.A02(userSession, arrayList));
            } catch (IOException unused) {
                C0w9.A03("ReelRequestHelper.addParams", MSV.A00(41));
            }
        }
        abstractC23721Ec.AA6("reel_ids", C85743s3.A01(set));
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (Map.Entry entry : entrySet) {
                abstractC23721Ec.A9s((String) entry.getKey(), (String) entry.getValue());
            }
        }
        abstractC23721Ec.A9s(CacheBehaviorLogger.SOURCE, str);
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36317491839046902L)) {
            abstractC23721Ec.A06 = EnumC23341Bw.CriticalAPI;
        }
        if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36324587121684731L)) {
            abstractC23721Ec.A0J("initial_story_media_fetch", z);
        }
        if (!C18U.A06(c06090Tz, userSession, 36317491837605093L)) {
            Pair A00 = AnonymousClass566.A00(userSession);
            Object obj = A00.first;
            C14360o3.A06(obj);
            abstractC23721Ec.A0H((String) obj, (String) A00.second);
        }
    }
}
