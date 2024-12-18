package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.Map;

/* renamed from: X.ROq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogC60731ROq extends Q5b {
    public Context A00;
    public View A01;
    public TextView A02;
    public Map A03;
    public java.util.Set A04;

    @Override // android.app.Dialog
    public final void show() {
        if (this.A04.size() == 1) {
            View view = (View) this.A03.get(this.A04.iterator().next());
            if (view != null) {
                view.callOnClick();
                return;
            }
            return;
        }
        super.show();
    }
}
