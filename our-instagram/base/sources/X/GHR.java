package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class GHR implements InterfaceC1571373s {
    public final /* synthetic */ C32356ENd A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ List A02;

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    public GHR(C32356ENd c32356ENd, User user, List list) {
        this.A00 = c32356ENd;
        this.A01 = user;
        this.A02 = list;
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        String str;
        C32356ENd c32356ENd = this.A00;
        EQM eqm = c32356ENd.A03;
        if (eqm == null) {
            str = "userListAdapter";
        } else {
            eqm.A04 = null;
            eqm.A0A = false;
            User user = this.A01;
            if (user != null) {
                List list = this.A02;
                if (list != null) {
                    C1ON A03 = AbstractC151506rw.A03(AbstractC166987dD.A0r(c32356ENd.A0C), list);
                    A03.A00 = new C32540EUq(7, list, user, c32356ENd);
                    c32356ENd.schedule(A03);
                    return;
                }
                C32356ENd.A01(c32356ENd, user);
                return;
            }
            InterfaceC37181GZs interfaceC37181GZs = c32356ENd.A0A;
            GFV gfv = c32356ENd.A01;
            if (gfv == null) {
                str = "searchBarController";
            } else {
                interfaceC37181GZs.DjG(gfv.A01);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
