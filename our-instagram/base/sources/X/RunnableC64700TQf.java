package X;

import android.os.Bundle;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.TQf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64700TQf implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ Callback A01;
    public final /* synthetic */ SWM A02;
    public final /* synthetic */ DialogModule A03;

    public RunnableC64700TQf(Bundle bundle, Callback callback, SWM swm, DialogModule dialogModule) {
        this.A03 = dialogModule;
        this.A02 = swm;
        this.A00 = bundle;
        this.A01 = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnDismissListenerC63428Sk7 dialogInterfaceOnDismissListenerC63428Sk7;
        SWM swm = this.A02;
        Bundle bundle = this.A00;
        Callback callback = this.A01;
        SWM.A00(swm);
        if (callback != null) {
            dialogInterfaceOnDismissListenerC63428Sk7 = new DialogInterfaceOnDismissListenerC63428Sk7(callback, swm.A02);
        } else {
            dialogInterfaceOnDismissListenerC63428Sk7 = null;
        }
        DialogInterfaceOnClickListenerC66386UEu dialogInterfaceOnClickListenerC66386UEu = new DialogInterfaceOnClickListenerC66386UEu(bundle, dialogInterfaceOnDismissListenerC63428Sk7);
        if (swm.A02.mIsInForeground) {
            AbstractC10360h2 abstractC10360h2 = swm.A01;
            if (!abstractC10360h2.A11()) {
                if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                    dialogInterfaceOnClickListenerC66386UEu.A0D(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                }
                dialogInterfaceOnClickListenerC66386UEu.A0B(abstractC10360h2, DialogModule.FRAGMENT_TAG);
                return;
            }
        }
        swm.A00 = dialogInterfaceOnClickListenerC66386UEu;
    }
}
