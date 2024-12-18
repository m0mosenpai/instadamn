package X;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* loaded from: classes8.dex */
public final class M0T implements Runnable {
    public final /* synthetic */ C45815KPu A00;

    public M0T(C45815KPu c45815KPu) {
        this.A00 = c45815KPu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C45815KPu c45815KPu = this.A00;
        KFH kfh = c45815KPu.A08;
        if (((ConfirmationCodeEditText) AbstractC31469DsD.A00(kfh)).requestFocus()) {
            Context context = c45815KPu.getContext();
            if (context != null) {
                obj = context.getSystemService("input_method");
            } else {
                obj = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) obj;
            ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) AbstractC31469DsD.A00(kfh);
            if (confirmationCodeEditText != null && inputMethodManager != null) {
                inputMethodManager.showSoftInput(confirmationCodeEditText, 1);
            }
        }
    }
}
