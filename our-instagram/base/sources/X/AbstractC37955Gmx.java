package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.Gmx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37955Gmx {
    public static final C82713mZ A01(UserSession userSession, InterfaceC60442pS interfaceC60442pS, Reel reel, String str) {
        C14360o3.A0B(reel, 0);
        C82713mZ A04 = AbstractC82703mY.A04(reel, interfaceC60442pS, AnonymousClass001.A0R("reel_", str));
        if (!reel.A15(userSession) && reel.A0A(userSession, 0).CY4()) {
            A04.A0G(userSession, reel.A0A(userSession, 0).A0b);
        }
        return A04;
    }

    public static final C82713mZ A02(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, String str) {
        C82713mZ A04;
        AbstractC25233BEq.A0v(0, c41181vS, interfaceC60442pS, userSession);
        C1NI A09 = c41181vS.A09();
        if (A09 instanceof C38321qM) {
            C1NI A092 = c41181vS.A09();
            C14360o3.A0C(A092, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            C38321qM c38321qM = (C38321qM) A092;
            C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, str);
            C14360o3.A0B(c38321qM, 1);
            List A3w = c38321qM.A3w(EnumC75383a5.A0k);
            if (A3w != null && !A3w.isEmpty()) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A3w.iterator();
                while (it.hasNext()) {
                    String str2 = ((C84823qW) it.next()).A1b;
                    if (str2 != null) {
                        A1E.add(str2);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                A0F.A7d = AbstractC166987dD.A1F(A1E);
                return A0F;
            }
            return A0F;
        }
        if (A09 instanceof C109114vb) {
            C1NI A093 = c41181vS.A09();
            C14360o3.A0C(A093, "null cannot be cast to non-null type com.instagram.model.iglive.broadcast.BroadcastImpression");
            C109114vb c109114vb = (C109114vb) A093;
            A04 = AbstractC82703mY.A04(c109114vb, interfaceC60442pS, str);
            A04.A0M(c109114vb.A01);
        } else {
            A04 = AbstractC82703mY.A04(c41181vS, interfaceC60442pS, str);
        }
        C14360o3.A0A(A04);
        return A04;
    }

    @Deprecated(message = "The method is used by [ReelViewerLogger] that is being slowly migrated over to ViewPoint.")
    public static final C82713mZ A00(UserSession userSession, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167017dG.A1R(interfaceC60442pS, userSession);
        if (c1ni instanceof C41181vS) {
            return A02(userSession, interfaceC60442pS, (C41181vS) c1ni, str);
        }
        if (c1ni instanceof Reel) {
            return A01(userSession, interfaceC60442pS, (Reel) c1ni, str);
        }
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(3783));
    }
}
