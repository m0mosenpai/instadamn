package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.3Pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC73123Pn {
    public static final Reel A00(UserSession userSession, C73113Pm c73113Pm, boolean z) {
        C206189Bb c206189Bb;
        C37771pE c37771pE;
        C14360o3.A0B(c73113Pm, 0);
        C14360o3.A0B(userSession, 1);
        AnonymousClass195 Avd = ((InterfaceC73153Pq) ((C73133Po) ((InterfaceC73103Pl) userSession.A01(C73133Po.class, new C57526Pg0(userSession, 7)))).A00.getValue()).Avd();
        Reel reel = null;
        if (Avd.CRW() && (c206189Bb = (C206189Bb) ((AnonymousClass198) Avd).A0B()) != null && ((!z || c206189Bb.A01) && (c37771pE = (C37771pE) c206189Bb.A03) != null)) {
            C1OU c1ou = C1OU.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession);
            C14360o3.A07(A03);
            reel = A03.A0M(c37771pE.A1V);
            if (reel == null) {
                return A03.A0I(c37771pE, false);
            }
        }
        return reel;
    }
}
