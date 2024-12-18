package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.3GI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GI extends C1I4 {
    public final UserSession A00;
    public final InterfaceC61272qp A01;

    public C3GI(UserSession userSession, InterfaceC61272qp interfaceC61272qp) {
        C14360o3.A0B(interfaceC61272qp, 1);
        C14360o3.A0B(userSession, 2);
        this.A01 = interfaceC61272qp;
        this.A00 = userSession;
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int A03 = C0f9.A03(-159104628);
        C14360o3.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null && recyclerView.getScrollState() != 0) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null) {
                int A1b = linearLayoutManager.A1b();
                int itemCount = c2uu.getItemCount();
                InterfaceC61272qp interfaceC61272qp = this.A01;
                if (interfaceC61272qp.Eib(C05F.A00, A1b, itemCount)) {
                    interfaceC61272qp.AVA();
                } else {
                    UserSession userSession = this.A00;
                    C14360o3.A0B(userSession, 0);
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36329869931463221L) && interfaceC61272qp.CLg() && itemCount - A1b <= ((int) C18U.A01(c06090Tz, userSession, 36611344908294415L))) {
                        interfaceC61272qp.Co4();
                    }
                }
            }
        }
        C0f9.A0A(-1339799610, A03);
    }
}
