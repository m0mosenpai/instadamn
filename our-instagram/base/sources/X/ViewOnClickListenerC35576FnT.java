package X;

import android.view.View;

/* renamed from: X.FnT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35576FnT implements View.OnClickListener {
    public final /* synthetic */ InterfaceC55362gb A00;
    public final /* synthetic */ C4NJ A01;
    public final /* synthetic */ C81413kB A02;

    public ViewOnClickListenerC35576FnT(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C81413kB c81413kB) {
        this.A02 = c81413kB;
        this.A00 = interfaceC55362gb;
        this.A01 = c4nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-933094593);
        this.A02.itemView.setVisibility(8);
        InterfaceC55362gb interfaceC55362gb = this.A00;
        if (interfaceC55362gb != null) {
            interfaceC55362gb.Dcp(this.A01);
        }
        C0f9.A0C(1365504209, A05);
    }
}
