package com.instagram.direct.store;

import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass935;
import X.C05F;
import X.C06090Tz;
import X.C12L;
import X.C14360o3;
import X.C18U;
import X.C19K;
import X.C1GJ;
import X.C1ON;
import X.C206729Dd;
import X.C4KH;
import X.C7B8;
import X.InterfaceC08830cm;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ReplaceDirectMessageLoader {
    public static final ReplaceDirectMessageLoader A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r12, X.C7B8 r13, com.instagram.direct.store.ReplaceDirectMessageLoader r14, java.lang.String r15, java.util.List r16, java.util.List r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.store.ReplaceDirectMessageLoader.A00(com.instagram.common.session.UserSession, X.7B8, com.instagram.direct.store.ReplaceDirectMessageLoader, java.lang.String, java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }

    public static final void A01(UserSession userSession, C7B8 c7b8, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 0);
        List singletonList = Collections.singletonList(str2);
        C14360o3.A07(singletonList);
        List singletonList2 = Collections.singletonList(str3);
        C14360o3.A07(singletonList2);
        A02(userSession, c7b8, str, singletonList, singletonList2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1P1, X.7BE, java.lang.Object] */
    public static final void A02(final UserSession userSession, final C7B8 c7b8, final String str, final List list, final List list2) {
        if (C18U.A06(C06090Tz.A05, userSession, 36327408915331640L)) {
            C19K A02 = AnonymousClass194.A02(C12L.A00.CPG(805, 3));
            C206729Dd c206729Dd = new C206729Dd(list, c7b8, userSession, list2, str, null, 0);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206729Dd, A02);
            return;
        }
        C1ON A0D = DirectThreadApi.A0D(userSession, str, null, list, list2);
        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.7BC
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return DirectThreadApi.A0D(UserSession.this, str, null, list, list2);
            }
        };
        AnonymousClass935 anonymousClass935 = new AnonymousClass935(userSession, c7b8, str) { // from class: X.7BD
            public final C7B8 A00;
            public final String A01;
            public volatile List A02 = C16930sl.A00;

            {
                this.A00 = c7b8;
                this.A01 = str;
            }

            @Override // X.AnonymousClass935
            public final void A04(AbstractC115105If abstractC115105If, UserSession userSession2) {
                int A03 = C0f9.A03(-1142142727);
                this.A00.DG4("request_fail");
                C0f9.A0A(650991309, A03);
            }

            @Override // X.AnonymousClass935
            public final /* bridge */ /* synthetic */ void A05(UserSession userSession2, Object obj) {
                int A03 = C0f9.A03(-908339591);
                C7BA c7ba = (C7BA) obj;
                int A032 = C0f9.A03(147087423);
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(c7ba, 1);
                List list3 = c7ba.A00;
                if (list3 != null) {
                    this.A02 = JUQ.A00(userSession2, this.A01, list3);
                }
                boolean z = !this.A02.isEmpty();
                C7B8 c7b82 = this.A00;
                if (z) {
                    c7b82.DqF(this.A02);
                } else {
                    c7b82.DG4("fail_to_update_local_cache");
                }
                C0f9.A0A(1128879524, A032);
                C0f9.A0A(-1514535027, A03);
            }
        };
        ?? obj = new Object();
        obj.A00 = anonymousClass935;
        obj.A01 = new C4KH(4);
        obj.A02 = interfaceC08830cm;
        A0D.A00 = obj;
        C1GJ.A06(A0D, 805, 4, true, false);
    }
}
