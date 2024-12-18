package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;

/* renamed from: X.6Zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141056Zj extends AbstractC141066Zk {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final ReelHeaderAttributionType A02;
    public final C6eI A03;
    public final InterfaceC144596ff A04;
    public final User A05;
    public final User A06;

    public C141056Zj(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        User user;
        User user2;
        this.A00 = context;
        this.A03 = c6eI;
        this.A04 = interfaceC144596ff;
        this.A01 = interfaceC11380iw;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            user = c38321qM.A0C.BoT();
        } else {
            user = null;
        }
        this.A06 = user;
        if (c38321qM != null) {
            user2 = c38321qM.A0C.BoU();
        } else {
            user2 = null;
        }
        this.A05 = user2;
        this.A02 = ReelHeaderAttributionType.A0E;
    }
}
