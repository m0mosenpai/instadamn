package X;

import android.app.Dialog;
import android.view.WindowManager;

/* renamed from: X.9RV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9RV extends Dialog {
    @Override // android.app.Dialog
    public final void show() {
        C14650od c14650od = C14650od.A03;
        if (c14650od != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, C14650od.A00(c14650od), 36325695223313683L);
            if (Boolean.valueOf(A06) != null && A06) {
                try {
                    super.show();
                    return;
                } catch (WindowManager.BadTokenException e) {
                    android.util.Log.e("IgdsDialog", "Failed to show dialog", e);
                    return;
                }
            }
        }
        super.show();
    }
}
