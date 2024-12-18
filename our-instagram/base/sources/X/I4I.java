package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I4I {
    public static C38822H7p A00(User user, String str, String str2, String str3, List list) {
        AbstractC167017dG.A0x();
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC43491JJd) it.next()).F1s());
        }
        return new C38822H7p(user, null, null, str, str2, null, str3, A0q);
    }
}
