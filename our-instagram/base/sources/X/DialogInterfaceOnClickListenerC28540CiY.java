package X;

import android.content.DialogInterface;

/* renamed from: X.CiY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28540CiY implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public DialogInterfaceOnClickListenerC28540CiY(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C31250DoY c31250DoY = (C31250DoY) this.A02;
                JTE A01 = MUK.A01(c31250DoY.A0A);
                C5HW c5hw = (C5HW) this.A03;
                int i2 = this.A01;
                InterfaceC11380iw interfaceC11380iw = c31250DoY.A08;
                C14360o3.A0B(interfaceC11380iw, 2);
                JTE.A0E(interfaceC11380iw, A01, c5hw, "activity_log_dialog_go_click_event", i2);
                C31250DoY.A0D(c31250DoY, c5hw);
                return;
            case 1:
                C31250DoY c31250DoY2 = (C31250DoY) this.A02;
                JTE A012 = MUK.A01(c31250DoY2.A0A);
                C5HW c5hw2 = (C5HW) this.A03;
                int i3 = this.A01;
                InterfaceC11380iw interfaceC11380iw2 = c31250DoY2.A08;
                C14360o3.A0B(interfaceC11380iw2, 2);
                JTE.A0E(interfaceC11380iw2, A012, c5hw2, "activity_log_dialog_cancel_click_event", i3);
                dialogInterface.dismiss();
                return;
            default:
                ((C54781OIv) C26777Bry.A00((C26777Bry) this.A03).A04.A04.getValue()).A00((C47P) this.A02, this.A01);
                return;
        }
    }
}
