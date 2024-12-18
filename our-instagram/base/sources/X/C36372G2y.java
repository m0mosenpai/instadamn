package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G2y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36372G2y implements InterfaceC37156GYt {
    public final Context A00;
    public final C41761wQ A01;
    public final UserSession A02;
    public final ELx A03;
    public final E70 A04;

    public C36372G2y(Context context, C41761wQ c41761wQ, UserSession userSession, ELx eLx, E70 e70) {
        AbstractC167007dF.A1G(userSession, 2, c41761wQ);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = e70;
        this.A03 = eLx;
        this.A01 = c41761wQ;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        return AbstractC166987dD.A1J(new GHY(this.A00, new ViewOnClickListenerC35680FpF(this, 25), "[Legacy Armadillo] Cutover this chat to E2EE"));
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        E70 e70 = this.A04;
        if (AbstractC140946Yw.A08(e70.A0L) && !E70.A04(e70) && !e70.A0m) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36317410231325845L)) {
                return true;
            }
        }
        return false;
    }
}
