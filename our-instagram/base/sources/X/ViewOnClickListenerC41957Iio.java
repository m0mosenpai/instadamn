package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Iio, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41957Iio implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C143536ds A02;

    public ViewOnClickListenerC41957Iio(FragmentActivity fragmentActivity, C38321qM c38321qM, C143536ds c143536ds) {
        this.A02 = c143536ds;
        this.A00 = fragmentActivity;
        this.A01 = c38321qM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-496508689);
        C193328hC A0H = AbstractC31171DnF.A0H(this.A00);
        C38321qM c38321qM = this.A01;
        int i = 2131973968;
        if (c38321qM.A5r()) {
            i = 2131973961;
        }
        A0H.A0A(i);
        int i2 = 2131968948;
        if (c38321qM.A5r()) {
            i2 = 2131972171;
        }
        A0H.A0L(DialogInterfaceOnClickListenerC41836Ifq.A00(this, 40), i2);
        A0H.A0H(DialogInterfaceOnClickListenerC41836Ifq.A00(this, 39), 2131954754);
        AbstractC166987dD.A1W(A0H);
        C0f9.A0C(-194753893, A05);
    }
}
