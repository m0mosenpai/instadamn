package X;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class WPC implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public WPC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (2 - this.A00 != 0) {
            if (i == 6) {
                AbstractC13880nE.A0K(((Fragment) this.A01).requireActivity());
                return true;
            }
            return false;
        }
        if (i == 5) {
            C70860WiQ c70860WiQ = (C70860WiQ) this.A01;
            ViewGroup viewGroup = c70860WiQ.A02;
            String str = "optionsContainer";
            if (viewGroup != null) {
                if (AnonymousClass040.A00(viewGroup, viewGroup.getChildCount() - 1).hasFocus()) {
                    EditText editText = c70860WiQ.A04;
                    if (editText == null) {
                        str = "questionView";
                    } else {
                        editText.requestFocus();
                        return true;
                    }
                } else {
                    return false;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return false;
    }
}
