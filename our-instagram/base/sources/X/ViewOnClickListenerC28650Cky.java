package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Cky, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28650Cky implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C145176gc A02;
    public final /* synthetic */ String A03;

    public ViewOnClickListenerC28650Cky(Context context, AbstractC59962oe abstractC59962oe, C145176gc c145176gc, String str) {
        this.A02 = c145176gc;
        this.A01 = abstractC59962oe;
        this.A00 = context;
        this.A03 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1725404412);
        C145176gc c145176gc = this.A02;
        AbstractC59962oe abstractC59962oe = this.A01;
        Context context = this.A00;
        String str = this.A03;
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A04();
        c193328hC.A0A(2131954739);
        c193328hC.A09(2131954738);
        c193328hC.A0R(new LMI(context, abstractC59962oe, c145176gc, str, 3), EnumC193348hE.A05, 2131965069);
        c193328hC.A03();
        c193328hC.A0g(new DialogInterfaceOnDismissListenerC28568Cj0(c145176gc, 3));
        AbstractC166987dD.A1W(c193328hC);
        C0f9.A0C(2125106487, A05);
    }
}
