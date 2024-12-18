package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.M0p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49870M0p implements Runnable {
    public final /* synthetic */ C47757L7d A00;

    public RunnableC49870M0p(C47757L7d c47757L7d) {
        this.A00 = c47757L7d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47757L7d c47757L7d = this.A00;
        UserSession userSession = c47757L7d.A04;
        String str = "userSession";
        if (userSession != null) {
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            Context context = c47757L7d.A00;
            str = "context";
            if (context != null) {
                A0y.A0g = context.getString(2131976274);
                A0y.A1J = true;
                A0y.A0K = LQ0.A01(c47757L7d, 59);
                A0y.A0h = context.getString(2131968690);
                A0y.A0L = LQ0.A01(c47757L7d, 60);
                A0y.A11 = false;
                A0y.A1N = true;
                A0y.A0k = false;
                A0y.A0q = false;
                AbstractC25225BEi.A1Q(A0y, true);
                A0y.A0y = false;
                C189478aR A00 = A0y.A00();
                C148676mc c148676mc = c47757L7d.A03;
                if (c148676mc == null) {
                    str = "audLogging";
                } else {
                    c148676mc.A01();
                    Fragment fragment = c47757L7d.A02;
                    if (fragment == null) {
                        str = "fragment";
                    } else {
                        FragmentActivity requireActivity = fragment.requireActivity();
                        Bundle A0D = AbstractC31174DnI.A0D(userSession);
                        KB5 kb5 = new KB5();
                        kb5.setArguments(A0D);
                        A00.A02(requireActivity, kb5);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
