package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FQo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34703FQo {
    public final C23031Ai A00;

    public final List A00(List list) {
        java.util.Set C2v = this.A00.A01.C2v("minor_education_acknowledged_users");
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            User user = (User) obj;
            if (user.B7L() == FollowStatus.A06 && !AbstractC31175DnJ.A1Y(user, C2v)) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    public final boolean A01(List list) {
        java.util.Set C2v = this.A00.A01.C2v("minor_education_acknowledged_users");
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            Boolean CTT = A15.A03.CTT();
            if (CTT != null && CTT.booleanValue() && !AbstractC31175DnJ.A1Y(A15, C2v)) {
                return true;
            }
        }
        return false;
    }

    public C34703FQo(C23031Ai c23031Ai) {
        this.A00 = c23031Ai;
    }
}
