package X;

import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EfY extends AbstractC32970Efb {
    public final /* synthetic */ C32280EJr A00;
    public final /* synthetic */ List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EfY(Fragment fragment, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, C32280EJr c32280EJr, EnumC31713DwI enumC31713DwI, List list) {
        super(fragment, interfaceC11380iw, c07270a1, interfaceC37227Gac, enumC31713DwI);
        this.A00 = c32280EJr;
        this.A01 = list;
    }

    @Override // X.C32547EUx
    public final void A03(UserSession userSession, User user) {
        C32280EJr c32280EJr;
        String username;
        String id;
        boolean z = true;
        DialogInterfaceOnDismissListenerC35460FkH dialogInterfaceOnDismissListenerC35460FkH = new DialogInterfaceOnDismissListenerC35460FkH(1, user, this, userSession);
        if (this.A01.size() != 1) {
            c32280EJr = this.A00;
            if (!AbstractC83893oY.A00(c32280EJr.A05)) {
                if (C83743oJ.A01(userSession).A0K(user.getId())) {
                    List list = c32280EJr.A05;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!C83743oJ.A01(userSession).A0K(((C34561FKv) it.next()).A00.getId())) {
                            }
                        }
                    }
                    super.A03(userSession, user);
                }
                username = user.getUsername();
                id = user.getId();
                z = false;
                C32280EJr.A00(dialogInterfaceOnDismissListenerC35460FkH, userSession, c32280EJr, username, id, z);
                return;
            }
        }
        if (!C83743oJ.A01(userSession).A0K(user.getId())) {
            c32280EJr = this.A00;
            username = user.getUsername();
            id = user.getId();
            C32280EJr.A00(dialogInterfaceOnDismissListenerC35460FkH, userSession, c32280EJr, username, id, z);
            return;
        }
        super.A03(userSession, user);
    }

    @Override // X.C32547EUx
    public final void A04(EfU efU) {
        ImmutableList copyOf;
        int A03 = C0f9.A03(1784124848);
        C32280EJr c32280EJr = this.A00;
        List list = efU.A0B;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        c32280EJr.A05 = copyOf;
        List list2 = this.A01;
        if (list2.size() > 1) {
            HashSet A1H = AbstractC166987dD.A1H();
            A1H.addAll(list2);
            InterfaceC19610xo ARD = AbstractC31174DnI.A0f().ARD();
            ARD.E7L(AbstractC111324zv.A00(1212), A1H);
            ARD.apply();
        }
        super.A04(efU);
        C0f9.A0A(-467612879, A03);
    }

    @Override // X.C32547EUx, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C0f9.A0A(-1661707741, C32547EUx.A00(this, obj, 2145434976));
    }

    public static void A01(UserSession userSession, EfY efY, User user) {
        super.A03(userSession, user);
    }
}
