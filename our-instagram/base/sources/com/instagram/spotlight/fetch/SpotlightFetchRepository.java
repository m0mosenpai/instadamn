package com.instagram.spotlight.fetch;

import X.AbstractC001800i;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC40691uc;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.C008002u;
import X.C05A;
import X.C06090Tz;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C18U;
import X.C19L;
import X.C26084BgD;
import X.C29602D2d;
import X.C29603D2e;
import X.C40701ud;
import X.C43172J6r;
import X.C4A7;
import X.C4A8;
import X.C50559MTq;
import X.C93004Ey;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class SpotlightFetchRepository extends C4A7 {
    public long A00;
    public AnonymousClass195 A01;
    public final UserSession A02;
    public final C93004Ey A03;
    public final HashSet A04;
    public final C0UO A05;
    public final C40701ud A06;
    public final C05A A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotlightFetchRepository(UserSession userSession) {
        super("SpotlightFetchRepository", C4A8.A01(129243710, 3));
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = new C93004Ey(userSession);
        this.A06 = AbstractC40691uc.A01(userSession);
        C008002u A00 = C10E.A00(null);
        this.A07 = A00;
        this.A05 = AbstractC208910l.A02(A00);
        this.A04 = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.spotlight.fetch.SpotlightFetchRepository r22, X.InterfaceC23621Ds r23) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.spotlight.fetch.SpotlightFetchRepository.A00(com.instagram.spotlight.fetch.SpotlightFetchRepository, X.1Ds):java.lang.Object");
    }

    public static final void A01(SpotlightFetchRepository spotlightFetchRepository, List list, List list2) {
        ArrayList A0S = AbstractC001800i.A0S(AbstractC001800i.A0g(list, new C29602D2d()), AbstractC001800i.A0g(list2, new C29603D2e()));
        ArrayList arrayList = new ArrayList();
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            Object obj = ((C50559MTq) it.next()).A02;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        spotlightFetchRepository.A07.Egh(new C26084BgD(AbstractC001800i.A0d(arrayList, 3), A0S, A0S.size()));
    }

    public final void A02(boolean z) {
        UserSession userSession = this.A03.A00;
        if (C18U.A06(C06090Tz.A06, userSession, 36316053021659043L) && C18U.A06(C06090Tz.A05, userSession, 36325171237303113L)) {
            AnonymousClass195 anonymousClass195 = this.A01;
            if (anonymousClass195 != null && anonymousClass195.isActive()) {
                return;
            }
            boolean z2 = false;
            if (this.A00 + TimeUnit.SECONDS.toMillis(120L) >= System.currentTimeMillis()) {
                z2 = true;
            }
            if (!z && z2) {
                return;
            }
            C19L c19l = super.A01;
            this.A01 = AbstractC23641Du.A04(AnonymousClass191.A00, new C43172J6r(this, null, 39), c19l);
        }
    }
}
