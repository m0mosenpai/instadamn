package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;

/* renamed from: X.Vvh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69797Vvh {
    public final int A00;
    public final C69487VoA A01;

    public C69797Vvh(Context context) {
        int A01 = UD9.A01(context, 0);
        this.A01 = new C69487VoA(new ContextThemeWrapper(context, UD9.A01(context, A01)));
        this.A00 = A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.UD9 A00() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69797Vvh.A00():X.UD9");
    }

    public final void A01(int i) {
        C69487VoA c69487VoA = this.A01;
        c69487VoA.A0C = c69487VoA.A0L.getText(i);
    }

    public final void A02(int i) {
        C69487VoA c69487VoA = this.A01;
        c69487VoA.A0G = c69487VoA.A0L.getText(i);
    }

    public final void A03(DialogInterface.OnClickListener onClickListener, int i) {
        C69487VoA c69487VoA = this.A01;
        c69487VoA.A0D = c69487VoA.A0L.getText(i);
        c69487VoA.A01 = onClickListener;
    }

    public final void A04(DialogInterface.OnClickListener onClickListener, int i) {
        C69487VoA c69487VoA = this.A01;
        c69487VoA.A0F = c69487VoA.A0L.getText(i);
        c69487VoA.A04 = onClickListener;
    }

    public final void A05(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C69487VoA c69487VoA = this.A01;
        c69487VoA.A0D = charSequence;
        c69487VoA.A01 = onClickListener;
    }

    public final void A06(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C69487VoA c69487VoA = this.A01;
        c69487VoA.A0F = charSequence;
        c69487VoA.A04 = onClickListener;
    }

    public final void A07(View view) {
        this.A01.A0A = view;
    }

    public final void A08(CharSequence charSequence) {
        this.A01.A0G = charSequence;
    }
}
