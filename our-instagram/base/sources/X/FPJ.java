package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public final class FPJ {
    public C189478aR A00;

    public final void A00(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C36303Fzy c36303Fzy, C7NH c7nh, DirectShareTarget directShareTarget, String str, boolean z) {
        int i;
        int i2;
        AbstractC167017dG.A1N(activity, userSession);
        AbstractC147806l5.A00(userSession).A00 = Boolean.valueOf(z);
        if (directShareTarget.A01 == 29) {
            String A08 = directShareTarget.A08();
            CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
            if (creatorBroadcastThreadInfo != null) {
                i = creatorBroadcastThreadInfo.A00;
            } else {
                i = 1;
            }
            if (FU1.A01(userSession, A08, i)) {
                C28531Zo c28531Zo = C28531Zo.A04;
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                String A082 = directShareTarget.A08();
                CreatorBroadcastThreadInfo creatorBroadcastThreadInfo2 = directShareTarget.A04;
                if (creatorBroadcastThreadInfo2 != null) {
                    i2 = creatorBroadcastThreadInfo2.A00;
                } else {
                    i2 = 1;
                }
                c28531Zo.A03(fragmentActivity, interfaceC11380iw, userSession, A082, str, null, "inbox_search", i2);
                return;
            }
        }
        String A00 = AbstractC35186Ffe.A00(AbstractC25227BEk.A0B(str));
        if (A00 == null) {
            return;
        }
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        EN8 A01 = AbstractC35059FcW.A01(EnumC33373Ep6.A06, new C36374G3a(userSession, c36303Fzy, c7nh, this, A0y, directShareTarget), A00, null);
        A0y.A0U = A01;
        C189478aR A002 = A0y.A00();
        this.A00 = A002;
        A002.A02(activity, A01);
    }
}
