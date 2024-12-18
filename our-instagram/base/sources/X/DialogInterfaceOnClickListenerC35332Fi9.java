package X;

import android.content.DialogInterface;

/* renamed from: X.Fi9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35332Fi9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ EnumC33505Ere A00;
    public final /* synthetic */ FRV A01;
    public final /* synthetic */ InterfaceC11380iw A02;

    public DialogInterfaceOnClickListenerC35332Fi9(EnumC33505Ere enumC33505Ere, FRV frv, InterfaceC11380iw interfaceC11380iw) {
        this.A01 = frv;
        this.A02 = interfaceC11380iw;
        this.A00 = enumC33505Ere;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FRV frv = this.A01;
        new FRU(this.A02, frv.A02).A00(this.A00);
        frv.A01.Cgi();
    }
}
