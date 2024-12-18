package X;

import android.view.View;

/* renamed from: X.3dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC77633dn implements View.OnClickListener {
    public final AbstractC12990ll A00;
    public final String A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16660sJ A03;
    public final boolean A04;

    public ViewOnClickListenerC77633dn(AbstractC12990ll abstractC12990ll, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
        this.A04 = z;
        this.A01 = str;
        this.A02 = interfaceC16820sZ;
        this.A03 = interfaceC16660sJ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C71353Hw c71353Hw;
        int A05 = C0f9.A05(1813543926);
        C14360o3.A0B(view, 0);
        if (this.A04) {
            AbstractC12990ll abstractC12990ll = this.A00;
            C71313Hs A00 = C71313Hs.A00(abstractC12990ll);
            C14360o3.A07(A00);
            InterfaceC16820sZ interfaceC16820sZ = this.A02;
            if (interfaceC16820sZ != null && (c71353Hw = (C71353Hw) interfaceC16820sZ.invoke()) != null) {
                A00.A09(view, c71353Hw, new String[]{this.A01}, 1);
            } else {
                C71313Hs.A00(abstractC12990ll).A0B(view, this.A01);
            }
        }
        this.A03.invoke(view);
        C0f9.A0C(1514888217, A05);
    }
}
