package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* renamed from: X.2fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54872fl {
    public final synchronized void A00(UserSession userSession, FragmentActivity fragmentActivity) {
        C54882fm c54882fm = new C54882fm(userSession.deviceSession.A06(), userSession);
        EnumSet of = EnumSet.of(Trigger.A0g);
        C14360o3.A07(of);
        c54882fm.A04(fragmentActivity, of);
    }
}
