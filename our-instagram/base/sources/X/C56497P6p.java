package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.List;

/* renamed from: X.P6p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56497P6p implements InterfaceC57972PnI {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56497P6p(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57972PnI
    public final void DqF(List list) {
        C32061E6n c32061E6n;
        UserDetailFragment userDetailFragment;
        C32061E6n c32061E6n2;
        if (this.A00 != 0) {
            if (list != null && (c32061E6n2 = (C32061E6n) AbstractC001800i.A0J(list)) != null) {
                C156136zh c156136zh = (C156136zh) this.A02;
                AbstractC25651Mw.A00(c156136zh.A0A).E4s(new C155106xz((Reel) this.A01, c32061E6n2.A01, true));
                userDetailFragment = c156136zh.A0C;
            } else {
                return;
            }
        } else {
            if (list == null || (c32061E6n = (C32061E6n) AbstractC001800i.A0J(list)) == null) {
                return;
            }
            C56532P8e c56532P8e = (C56532P8e) this.A02;
            Reel reel = (Reel) this.A01;
            UserSession userSession = c56532P8e.A03;
            Reel A0F = C1OU.A04(userSession).A0F(c32061E6n);
            if (A0F != null) {
                reel = A0F;
            }
            AbstractC25651Mw.A00(userSession).E4s(new C155106xz(reel, c32061E6n.A01, true));
            userDetailFragment = c56532P8e.A05;
        }
        C9GR.A07(userDetailFragment.requireContext(), 2131963587);
    }
}
