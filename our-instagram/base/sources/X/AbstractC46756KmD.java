package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KmD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46756KmD {
    public static final void A00(View view, UserSession userSession, List list) {
        C14360o3.A0B(userSession, 0);
        Context context = view.getContext();
        view.performHapticFeedback(0);
        C14360o3.A0A(context);
        C8QJ c8qj = new C8QJ(context, userSession, null, false);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC50420MOa) it.next()).AEl(context));
        }
        c8qj.A02(A0q);
        c8qj.showAsDropDown(view);
    }
}
