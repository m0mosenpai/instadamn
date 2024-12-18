package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.FAj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34289FAj {
    public static final void A00(UserSession userSession, Reel reel, InterfaceC72953Ov interfaceC72953Ov, long j) {
        C14360o3.A0B(userSession, 2);
        if (reel != null) {
            interfaceC72953Ov.AeT().postDelayed(new RunnableC36953GPw(userSession, reel, interfaceC72953Ov), j);
        }
    }
}
