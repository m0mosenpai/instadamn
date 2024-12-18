package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Dqp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31385Dqp implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31385Dqp(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        Object obj2;
        User user;
        int i;
        int A03 = C0f9.A03(2059802043);
        C71N c71n = (C71N) obj;
        int A032 = C0f9.A03(-313560611);
        UserDetailFragment userDetailFragment = this.A00;
        User user2 = userDetailFragment.A10.A03;
        if (user2 == null) {
            i = -29235416;
        } else {
            userDetailFragment.A0z.A0S(user2, true);
            Context requireContext = userDetailFragment.requireContext();
            Resources A0N = AbstractC166997dE.A0N(userDetailFragment);
            List list = c71n.A00;
            Map map = c71n.A01;
            String username = user2.getUsername();
            AbstractC167007dF.A1D(A0N, 1, list);
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                String id = A15.getId();
                if (map.get(id) == EnumC33354Eon.A03) {
                    A1E.add(A15);
                } else if (map.get(id) == EnumC33354Eon.A05) {
                    A1E2.add(A15);
                }
            }
            C146106i8 A0K = AbstractC31171DnF.A0K();
            A0K.A01 = 5000;
            AbstractC31175DnJ.A0p(A0N, A0K);
            if (A1E.size() == 1) {
                user = (User) A1E.get(0);
                A0K.A0D = A0N.getString(2131962698, user.getUsername(), username);
                A0K.A0B(EnumC142006bJ.A03);
            } else {
                if (A1E.size() > 1) {
                    A0K.A0D = A0N.getString(2131962696, ((User) A1E.get(0)).getUsername(), Integer.valueOf(A1E.size() - 1), username);
                    A0K.A0B(EnumC142006bJ.A02);
                    A0K.A09 = ((User) A1E.get(0)).Bhu();
                    obj2 = A1E.get(1);
                } else if (A1E2.size() == 1) {
                    A0K.A0D = A0N.getString(2131962699, ((User) A1E2.get(0)).getUsername(), username);
                    A0K.A0B(EnumC142006bJ.A03);
                    user = (User) A1E2.get(0);
                } else if (A1E2.size() > 1) {
                    A0K.A0D = A0N.getString(2131962697, ((User) A1E2.get(0)).getUsername(), Integer.valueOf(A1E2.size() - 1), username);
                    A0K.A0B(EnumC142006bJ.A02);
                    A0K.A09 = ((User) A1E2.get(0)).Bhu();
                    obj2 = A1E2.get(1);
                } else {
                    C1CM c1cm = new C1CM(requireContext);
                    if (!c1cm.A07(false) && c1cm.A05()) {
                        C9GR.A09(requireContext, AbstractC166997dE.A0r(A0N, username, 2131962694));
                    }
                    A0K.A05();
                    A0K.A0H = "follow_from_error";
                    AbstractC31172DnG.A1H(A0N, A0K, 2131962695);
                    AbstractC25233BEq.A1F(A0K);
                    i = 1046258315;
                }
                A0K.A07 = ((User) obj2).Bhu();
                AbstractC25233BEq.A1F(A0K);
                i = 1046258315;
            }
            A0K.A09 = user.Bhu();
            AbstractC25233BEq.A1F(A0K);
            i = 1046258315;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-66932007, A03);
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        return true;
    }
}
