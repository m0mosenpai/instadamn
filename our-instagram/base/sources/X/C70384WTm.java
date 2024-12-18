package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.WTm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70384WTm implements XE5 {
    public final C193328hC A00;

    @Override // X.XE5
    public final XE5 EZ3(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        this.A00.A0r(charSequence);
        return this;
    }

    @Override // X.XE5
    public final XE5 EZb(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        this.A00.A0c(null, charSequence.toString());
        return this;
    }

    @Override // X.XE5
    public final XE5 EbB(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        this.A00.A0d(onClickListener, charSequence.toString());
        return this;
    }

    @Override // X.XE5
    public final XE5 Efs(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        this.A00.A05 = charSequence.toString();
        return this;
    }

    @Override // X.XE5
    public final Dialog AL1() {
        return this.A00.A02();
    }

    public C70384WTm(Context context) {
        this.A00 = new C193328hC(context);
    }
}
