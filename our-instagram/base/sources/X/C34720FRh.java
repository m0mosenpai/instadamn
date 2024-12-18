package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FRh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34720FRh {
    public final List A01 = AbstractC166987dD.A1E();
    public final List A00 = AbstractC166987dD.A1E();

    /* JADX WARN: Multi-variable type inference failed */
    public final void A03(User user) {
        User user2;
        this.A00.add(new C34710FQv(user, false));
        List list = this.A01;
        Iterator it = list.iterator();
        while (true) {
            user2 = null;
            if (!it.hasNext()) {
                break;
            }
            C34710FQv c34710FQv = (C34710FQv) it.next();
            if (c34710FQv != 0) {
                user2 = c34710FQv.A01;
            }
            if (C14360o3.A0K(user2, user)) {
                user2 = c34710FQv;
                break;
            }
        }
        list.remove(user2);
    }

    public final void A04(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            this.A01.add(new C34710FQv(A15, true));
            this.A00.remove(new C34710FQv(A15, false));
        }
    }

    public final ImmutableList A00() {
        return AbstractC31173DnH.A0L(AbstractC92144Au.A02(new C31354DqJ(0), this.A01));
    }

    public final void A01() {
        List<C34710FQv> list = this.A01;
        for (C34710FQv c34710FQv : list) {
            if (c34710FQv != null) {
                c34710FQv.A00 = false;
            }
            this.A00.add(c34710FQv);
        }
        list.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(User user) {
        User user2;
        this.A01.add(new C34710FQv(user, true));
        List list = this.A00;
        Iterator it = list.iterator();
        while (true) {
            user2 = null;
            if (!it.hasNext()) {
                break;
            }
            C34710FQv c34710FQv = (C34710FQv) it.next();
            if (c34710FQv != 0) {
                user2 = c34710FQv.A01;
            }
            if (C14360o3.A0K(user2, user)) {
                user2 = c34710FQv;
                break;
            }
        }
        list.remove(user2);
    }
}
