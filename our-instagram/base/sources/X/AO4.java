package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AO4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ InterfaceC16820sZ A00;

    public AO4(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.invoke();
    }
}