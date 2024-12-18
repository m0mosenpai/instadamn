package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.3GO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3GO {
    public static final C31E A00(final UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C3GN c3gn, InterfaceC114805Gn interfaceC114805Gn, InterfaceC62242sP interfaceC62242sP, C1M1 c1m1, String str, String str2, boolean z) {
        C14360o3.A0B(str2, 4);
        C31A c31a = new C31A() { // from class: X.3GP
            @Override // X.C31A
            public final /* synthetic */ String AU4(Object obj) {
                return null;
            }

            @Override // X.C31A
            public final /* synthetic */ Boolean AUD(Object obj) {
                return null;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ String AUQ(Object obj) {
                return null;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ int ATx(Object obj) {
                C1PZ c1pz = (C1PZ) obj;
                C14360o3.A0B(c1pz, 0);
                return c1pz.A01;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ String ATy(Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                String id = c41551w4.A0H.getId();
                C14360o3.A07(id);
                return id;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ int AU9(Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                C40861ut c40861ut = c41551w4.A0H.A0b;
                if (c40861ut != null) {
                    return c40861ut.A03();
                }
                return -1;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ String AUH(Object obj) {
                C38321qM c38321qM;
                String id;
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                Reel reel = c41551w4.A0H;
                UserSession userSession2 = UserSession.this;
                if (!reel.A15(userSession2)) {
                    C41181vS A0A = reel.A0A(userSession2, 0);
                    C14360o3.A07(A0A);
                    if (A0A.CY4() && (c38321qM = A0A.A0b) != null && (id = c38321qM.getId()) != null) {
                        return id;
                    }
                    return "n/a";
                }
                return "n/a";
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ int AUK(Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                C40861ut c40861ut = c41551w4.A0H.A0b;
                if (c40861ut != null) {
                    return c40861ut.A01();
                }
                return -1;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ int AUL(Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                C40861ut c40861ut = c41551w4.A0H.A0b;
                if (c40861ut != null) {
                    return c40861ut.A02();
                }
                return -1;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ int AUM(Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                C40861ut c40861ut = c41551w4.A0H.A0b;
                if (c40861ut != null) {
                    return c40861ut.A07();
                }
                return -1;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ int AUN(Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                C40861ut c40861ut = c41551w4.A0H.A0b;
                if (c40861ut != null) {
                    return c40861ut.A08();
                }
                return -1;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ int AUO(Object obj) {
                C1PZ c1pz = (C1PZ) obj;
                C14360o3.A0B(c1pz, 0);
                return c1pz.A04;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ String AUP(Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                String id = c41551w4.A0H.getId();
                C14360o3.A07(id);
                return id;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ String AUV(Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                return c41551w4.A0I;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ String AUe(Object obj) {
                C41551w4 c41551w4 = (C41551w4) obj;
                C14360o3.A0B(c41551w4, 0);
                return c41551w4.A0H.BzL(UserSession.this);
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ Collection AU1(Object obj) {
                java.util.Set emptySet = Collections.emptySet();
                C14360o3.A07(emptySet);
                return emptySet;
            }

            @Override // X.C31A
            public final /* bridge */ /* synthetic */ Collection AUR(Object obj) {
                java.util.Set emptySet = Collections.emptySet();
                C14360o3.A07(emptySet);
                return emptySet;
            }
        };
        boolean A05 = C1P8.A05(userSession);
        String sessionId = c1m1.getSessionId();
        C31B c31b = C31B.A2d;
        C3GQ c3gq = new C3GQ(userSession, anonymousClass318, interfaceC60442pS, c3g2, c3gn, interfaceC114805Gn, interfaceC62242sP, c31a, str, str2, z);
        if (A05) {
            return I9J.A00(userSession, c31a, c31b, c3gq, sessionId, str, str2);
        }
        C31E A00 = C31J.A00(userSession, c31a, c31b, c3gq, str2);
        C14360o3.A0A(A00);
        return A00;
    }
}
