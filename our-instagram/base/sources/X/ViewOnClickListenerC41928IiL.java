package X;

import android.view.View;

/* renamed from: X.IiL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41928IiL implements View.OnClickListener {
    public final /* synthetic */ C42521Is0 A00;
    public final /* synthetic */ C42662IuJ A01;
    public final /* synthetic */ C685736u A02;

    public ViewOnClickListenerC41928IiL(C42521Is0 c42521Is0, C42662IuJ c42662IuJ, C685736u c685736u) {
        this.A02 = c685736u;
        this.A00 = c42521Is0;
        this.A01 = c42662IuJ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-248641899);
        C685736u c685736u = this.A02;
        C42521Is0 c42521Is0 = this.A00;
        C42662IuJ c42662IuJ = this.A01;
        C42592ItB c42592ItB = new C42592ItB(c42521Is0, c42662IuJ);
        C60662pp c60662pp = c685736u.A0O;
        C50674MYs c50674MYs = new C50674MYs(c60662pp.requireContext(), c685736u.A0J);
        c50674MYs.A03(new ViewOnClickListenerC42029Ijy(44, c42662IuJ, c42592ItB, c685736u), 2131963527);
        new C31727DwY(c50674MYs).A07(c60662pp.requireContext());
        C0f9.A0C(-290837596, A05);
    }
}
