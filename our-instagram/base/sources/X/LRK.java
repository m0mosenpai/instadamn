package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class LRK implements TextView.OnEditorActionListener {
    public final /* synthetic */ C143316dW A00;

    public LRK(C143316dW c143316dW) {
        this.A00 = c143316dW;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 4) {
            C143316dW.A02(this.A00);
            return true;
        }
        return false;
    }
}
