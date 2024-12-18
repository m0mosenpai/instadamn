package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes11.dex */
public final class WPB implements TextView.OnEditorActionListener {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public WPB(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return ((Boolean) this.A00.invoke(Integer.valueOf(i))).booleanValue();
    }
}
