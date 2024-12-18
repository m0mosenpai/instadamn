package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.Dwc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogC31731Dwc extends Dialog {
    public DialogInterface.OnShowListener A00;
    public final DialogInterface.OnShowListener A01;

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.A00 = onShowListener;
        super.setOnShowListener(this.A01);
    }

    public DialogC31731Dwc(Context context, int i) {
        super(context, i);
        this.A01 = new AP9(this, 6);
    }
}
