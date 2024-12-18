package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L45 {
    public final LA9 A00;
    public final AvatarStore A01;
    public final UserSession A02;
    public final L2Z A03;
    public final InterfaceC16820sZ A04;
    public final boolean A05;

    public /* synthetic */ L45(UserSession userSession, boolean z) {
        LA9 A00 = AbstractC46620Kjx.A00(userSession);
        L2Z l2z = (L2Z) userSession.A01(L2Z.class, MHS.A00(userSession, 49));
        MFD mfd = MFD.A00;
        AvatarStore A002 = C20Y.A00(userSession);
        C14360o3.A0B(l2z, 4);
        AbstractC167017dG.A1T(mfd, A002);
        this.A02 = userSession;
        this.A05 = z;
        this.A00 = A00;
        this.A03 = l2z;
        this.A04 = mfd;
        this.A01 = A002;
    }
}
