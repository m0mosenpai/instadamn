package X;

import android.view.View;

/* renamed from: X.Oj6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55396Oj6 implements View.OnClickListener {
    public final /* synthetic */ InterfaceC55362gb A00;
    public final /* synthetic */ C4NJ A01;
    public final /* synthetic */ C81423kC A02;

    public ViewOnClickListenerC55396Oj6(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C81423kC c81423kC) {
        this.A02 = c81423kC;
        this.A00 = interfaceC55362gb;
        this.A01 = c4nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-786652617);
        this.A02.itemView.setVisibility(8);
        InterfaceC55362gb interfaceC55362gb = this.A00;
        if (interfaceC55362gb != null) {
            interfaceC55362gb.Dcp(this.A01);
        }
        C0f9.A0C(408755914, A05);
    }
}
