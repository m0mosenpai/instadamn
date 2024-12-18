package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.ARs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23234ARs implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C193328hC A01;

    public ViewOnClickListenerC23234ARs(C193328hC c193328hC, int i) {
        this.A01 = c193328hC;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1880970710);
        C193328hC c193328hC = this.A01;
        DialogInterface.OnClickListener onClickListener = c193328hC.A00;
        if (onClickListener != null) {
            onClickListener.onClick(c193328hC.A0P, this.A00);
        }
        c193328hC.A0P.dismiss();
        C0f9.A0C(-1584490602, A05);
    }
}
