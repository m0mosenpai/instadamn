package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.handler.ECPHandler;

/* loaded from: classes11.dex */
public final class WI7 implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public WI7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                C5t6 c5t6 = ((C67676Uvo) this.A01).A00;
                if (c5t6 == null) {
                    C14360o3.A0F("viewModel");
                    throw C00O.createAndThrow();
                }
                c5t6.A0I(false);
                return;
            case 1:
                ECPHandler eCPHandler = ((C67724Uwq) this.A01).A05;
                if (eCPHandler == null) {
                    return;
                }
                eCPHandler.CJe();
                return;
            case 2:
                C67724Uwq c67724Uwq = (C67724Uwq) this.A01;
                ECPHandler eCPHandler2 = c67724Uwq.A05;
                if (eCPHandler2 != null) {
                    eCPHandler2.CJe();
                }
                Fragment fragment = c67724Uwq.mParentFragment;
                C14360o3.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
                ((C0SG) fragment).onDismiss(dialogInterface);
                return;
            default:
                InterfaceC71983XDs interfaceC71983XDs = (InterfaceC71983XDs) this.A01;
                if (interfaceC71983XDs != null) {
                    interfaceC71983XDs.onDismiss();
                    return;
                }
                return;
        }
    }
}
