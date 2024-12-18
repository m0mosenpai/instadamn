package X;

import android.content.Intent;

/* loaded from: classes10.dex */
public final class RKN extends AbstractDialogInterfaceOnClickListenerC129415t3 {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ InterfaceC65566Tms A01;

    public RKN(Intent intent, InterfaceC65566Tms interfaceC65566Tms) {
        this.A00 = intent;
        this.A01 = interfaceC65566Tms;
    }

    @Override // X.AbstractDialogInterfaceOnClickListenerC129415t3
    public final void A00() {
        Intent intent = this.A00;
        if (intent != null) {
            this.A01.startActivityForResult(intent, 2);
        }
    }
}
