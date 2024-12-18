package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* loaded from: classes8.dex */
public final class LRM implements TextView.OnEditorActionListener {
    public final /* synthetic */ KF6 A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ ConfirmationCodeEditText A04;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        InterfaceC103384lE interfaceC103384lE = this.A03;
        if (interfaceC103384lE != null) {
            C102884kP c102884kP = this.A02;
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A03(textView.getText().toString(), 0);
            C6FP.A03(this.A01, c102884kP, A0s.A00(), interfaceC103384lE);
            return true;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.A04.getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return true;
        }
        inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
        return true;
    }

    public LRM(KF6 kf6, C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, ConfirmationCodeEditText confirmationCodeEditText) {
        this.A00 = kf6;
        this.A03 = interfaceC103384lE;
        this.A02 = c102884kP;
        this.A01 = c6fg;
        this.A04 = confirmationCodeEditText;
    }
}
