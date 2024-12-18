package X;

import android.content.DialogInterface;

/* loaded from: classes12.dex */
public final class Y7z implements DialogInterface.OnClickListener {
    public final /* synthetic */ C144986gI A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public Y7z(C144986gI c144986gI, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c144986gI;
        this.A01 = interfaceC16820sZ;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A00.A0O();
        this.A01.invoke();
    }
}
