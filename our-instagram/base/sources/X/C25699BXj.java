package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.BXj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25699BXj implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public C25699BXj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                return ((BX4) this.A01).A02.onEditorAction(textView, i, keyEvent);
            case 1:
                C26559BoI c26559BoI = (C26559BoI) this.A01;
                c26559BoI.A03.invoke(new C27304C3l(null, c26559BoI.A00.A00(), c26559BoI.A01.A00));
                return true;
            default:
                AbstractC166987dD.A1Y(this.A01);
                return true;
        }
    }
}
