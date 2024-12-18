package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.WTn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70385WTn implements XE5 {
    public final AlertDialog.Builder A00;
    public final /* synthetic */ Context A01;

    @Override // X.XE5
    public final XE5 EZb(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.setNegativeButton(charSequence, (DialogInterface.OnClickListener) null);
        return this;
    }

    public C70385WTn(Context context) {
        this.A01 = context;
        this.A00 = new AlertDialog.Builder(context);
    }

    @Override // X.XE5
    public final Dialog AL1() {
        return this.A00.create();
    }

    @Override // X.XE5
    public final XE5 EZ3(CharSequence charSequence) {
        this.A00.setMessage(charSequence);
        return this;
    }

    @Override // X.XE5
    public final XE5 EbB(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.setPositiveButton(charSequence, onClickListener);
        return this;
    }

    @Override // X.XE5
    public final XE5 Efs(CharSequence charSequence) {
        this.A00.setTitle(charSequence);
        return this;
    }
}
