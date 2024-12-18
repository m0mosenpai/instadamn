package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.VLq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68304VLq {
    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        View A05;
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 0);
        if (A0F != null && (A05 = A0F.A05(c6fq.A03)) != null) {
            InputMethodManager A0A = AbstractC65703TsZ.A0A(A05.getContext());
            A05.requestFocus();
            A0A.showSoftInput(A05, 0);
            return true;
        }
        return false;
    }
}
