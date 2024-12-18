package X;

import android.view.View;

/* renamed from: X.Oj5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55395Oj5 implements View.OnClickListener {
    public final /* synthetic */ InterfaceC55362gb A00;
    public final /* synthetic */ C4NJ A01;
    public final /* synthetic */ C66102ym A02;

    public ViewOnClickListenerC55395Oj5(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C66102ym c66102ym) {
        this.A01 = c4nj;
        this.A02 = c66102ym;
        this.A00 = interfaceC55362gb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(240945314);
        C4NJ c4nj = this.A01;
        C4NV c4nv = c4nj.A08.A02;
        if (this.A02.A00 && c4nv != null && c4nv.A04) {
            this.A00.Dcp(c4nj);
        } else {
            this.A00.Dco(c4nj, C05F.A0C, null);
        }
        C0f9.A0C(-414741364, A05);
    }
}
