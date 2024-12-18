package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.Q7m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58758Q7m extends C0SG {
    public Dialog A00;
    public DialogInterface.OnCancelListener A01;
    public Dialog A02;

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog == null) {
            this.A07 = false;
            Dialog dialog2 = this.A02;
            if (dialog2 == null) {
                Context context = getContext();
                C3U5.A02(context);
                AlertDialog create = new AlertDialog.Builder(context).create();
                this.A02 = create;
                return create;
            }
            return dialog2;
        }
        return dialog;
    }

    @Override // X.C0SG, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A01;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
