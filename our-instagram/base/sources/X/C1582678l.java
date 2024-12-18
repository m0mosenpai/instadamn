package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.78l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1582678l implements InterfaceC1582578k {
    public static final C1582678l A00 = new Object();

    @Override // X.InterfaceC1582578k
    public final C7QY AMI(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        ArrayList arrayList;
        String str;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7ql, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(c160787Im, 4);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        User user = c160787Im.A0K;
        Object obj = c83403nh.A1T;
        if (obj != null) {
            User user2 = (User) obj;
            List A0t = c83403nh.A0t();
            if (A0t != null) {
                arrayList = new ArrayList(AbstractC06950Ym.A1E(A0t, 10));
                Iterator it = A0t.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C42557Isb) it.next()).A00());
                }
            } else {
                arrayList = null;
            }
            DirectMessageIdentifier A0V = c83403nh.A0V();
            C1583678w c1583678w = new C1583678w(null, null, user2.getUsername(), user2.getFullName(), null, null, null, null, null, null, AbstractC16960so.A1O(user2.Bhu()));
            String A06 = AbstractC13670mt.A06("instagram://user?username=%s", user2.getUsername());
            String str2 = c83403nh.A1u;
            C14360o3.A07(str2);
            C9C9 c9c9 = new C9C9(A06, str2, 5);
            EnumC910243u enumC910243u = EnumC910243u.GRID_VIEW_3X2;
            if (user != null) {
                str = user.getUsername();
            } else {
                str = null;
            }
            return new C7QY(null, null, null, c9c9, null, null, null, null, C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10), c7ql, null, c1583678w, null, null, null, null, enumC910243u, null, A0V, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, arrayList, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
