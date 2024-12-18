package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactTextInputManager;

/* loaded from: classes11.dex */
public final class WPE implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WPE(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                return ReactTextInputManager.lambda$addEventEmitters$1((UDV) this.A01, (R3N) this.A02, textView, i, keyEvent);
            case 1:
                if (i != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                C45491KCg.A00((EditText) this.A01, (C45491KCg) this.A02);
                return false;
            default:
                C67880V0l c67880V0l = (C67880V0l) this.A01;
                Bundle bundle = (Bundle) this.A02;
                switch (i) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c67880V0l.A03.A01(bundle, AbstractC167007dF.A0g(c67880V0l.A00));
                        return true;
                    case 7:
                        c67880V0l.A03.A00(bundle, AbstractC167007dF.A0g(c67880V0l.A00));
                        return true;
                    default:
                        return false;
                }
        }
    }
}
