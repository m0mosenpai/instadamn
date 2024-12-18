package X;

import android.content.Context;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public abstract class F01 {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean A01 = C6DZ.A01(c6fw.A03(0));
        boolean A012 = C6DZ.A01(c6fw.A02());
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(c6fw.A00, 2);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Context applicationContext = A04.getApplicationContext();
        if (applicationContext != null) {
            Window window = A04.getWindow();
            C1Z0 A00 = AbstractC34209F7h.A00();
            if (A01) {
                A00.A00(applicationContext, window, A012, false);
            } else {
                A00.A01(window);
            }
            if (A0t != null) {
                AbstractC31171DnF.A1K(c6fq, A0t);
            }
        }
        return null;
    }
}
