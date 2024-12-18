package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GfN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37505GfN {
    public static final C36Q A00(Context context, FragmentActivity fragmentActivity, InterfaceC59992oh interfaceC59992oh, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, AbstractC61692rW abstractC61692rW, AnonymousClass341 anonymousClass341, C33P c33p, C61382r1 c61382r1, ViewOnKeyListenerC677333n viewOnKeyListenerC677333n, C1M1 c1m1, String str, List list) {
        C14360o3.A0B(userSession, 3);
        ArrayList A00 = AnonymousClass348.A00(context, fragmentActivity, userSession, new C30W(userSession, c1m1), interfaceC60442pS, abstractC61692rW, anonymousClass341, c61382r1, c1m1, list);
        if (anonymousClass341 != AnonymousClass341.A0A) {
            A00.add(new C37454GeY(userSession, anonymousClass341, str));
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c33p != null && c33p.A0B != null) {
            A00.add(new AnonymousClass368(c33p));
        }
        if (viewOnKeyListenerC677333n != null && C36A.A07(userSession)) {
            A00.add(new C36B(viewOnKeyListenerC677333n));
        }
        return new C36Q(interfaceC59992oh, userSession, c57112jm, A00, A1E);
    }
}
