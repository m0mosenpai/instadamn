package X;

import android.content.DialogInterface;

/* renamed from: X.Fi1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35324Fi1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C57932l6 A00;
    public final /* synthetic */ InterfaceC02900Bo A01;

    public DialogInterfaceOnClickListenerC35324Fi1(C57932l6 c57932l6, InterfaceC02900Bo interfaceC02900Bo) {
        this.A00 = c57932l6;
        this.A01 = interfaceC02900Bo;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC02900Bo interfaceC02900Bo = this.A01;
        C57932l6 c57932l6 = this.A00;
        interfaceC02900Bo.CJm(c57932l6.A02, c57932l6.A07, "double_tap_tab_bar");
        interfaceC02900Bo.Cn0();
    }
}
