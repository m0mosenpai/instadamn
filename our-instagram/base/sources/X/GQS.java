package X;

import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GQS implements Runnable {
    public final /* synthetic */ Spanned A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C33I A02;
    public final /* synthetic */ C54212eX A03;

    public GQS(Spanned spanned, View view, C33I c33i, C54212eX c54212eX) {
        this.A00 = spanned;
        this.A03 = c54212eX;
        this.A01 = view;
        this.A02 = c33i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C149686oL c149686oL = new C149686oL(this.A00);
        C54212eX c54212eX = this.A03;
        Map map = C54212eX.A0V;
        Context context = c54212eX.A0B;
        AbstractC31171DnF.A1O(context);
        C5SU c5su = new C5SU((Activity) context, c149686oL);
        c5su.A03(this.A01);
        c5su.A02();
        c5su.A0B = false;
        c5su.A0A = true;
        c5su.A04 = this.A02;
        c5su.A00().A07(c54212eX.A0J);
    }
}
