package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Dr4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31400Dr4 implements InterfaceC41501vz {
    public final /* synthetic */ UserDetailFragment A00;

    public C31400Dr4(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-640369603);
        C71P c71p = (C71P) obj;
        int A032 = C0f9.A03(470683134);
        String str = c71p.A01;
        UserDetailFragment userDetailFragment = this.A00;
        UserSession userSession = userDetailFragment.A0I;
        if (AbstractC31172DnG.A1Z(userSession, str) && AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36315808211275348L) && userDetailFragment.A10.A0C.A00.equals(c71p.A00)) {
            userDetailFragment.A21 = true;
        }
        C0f9.A0A(712679445, A032);
        C0f9.A0A(1935434811, A03);
    }
}
