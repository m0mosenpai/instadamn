package X;

import android.view.View;

/* renamed from: X.IiK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41927IiK implements View.OnClickListener {
    public final /* synthetic */ C42661IuI A00;
    public final /* synthetic */ C42526Is5 A01;
    public final /* synthetic */ C685736u A02;

    public ViewOnClickListenerC41927IiK(C42661IuI c42661IuI, C42526Is5 c42526Is5, C685736u c685736u) {
        this.A02 = c685736u;
        this.A01 = c42526Is5;
        this.A00 = c42661IuI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-671995898);
        C685736u c685736u = this.A02;
        C42526Is5 c42526Is5 = this.A01;
        C42661IuI c42661IuI = this.A00;
        C14360o3.A0B(c42661IuI, 1);
        C60662pp c60662pp = c685736u.A0O;
        C50674MYs c50674MYs = new C50674MYs(c60662pp.requireContext(), c685736u.A0J);
        c50674MYs.A01(new ViewOnClickListenerC42029Ijy(43, c42526Is5, c42661IuI, c685736u), 2131964389);
        new C31727DwY(c50674MYs).A07(c60662pp.requireContext());
        C0f9.A0C(-1104753634, A05);
    }
}
