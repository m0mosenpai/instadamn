package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.Uzp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C67858Uzp extends AbstractC72473Mu {
    public final DialogInterface.OnKeyListener A00 = new DialogInterfaceOnKeyListenerC63430Sk9(this, 3);

    public String A0N() {
        if (this instanceof C68092VAl) {
            return AbstractC25227BEk.A0v(this, 2131976813);
        }
        return getString(2131965660);
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        C6WQ c6wq = new C6WQ(A0M());
        c6wq.A00(A0N());
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null && bundle2.getBoolean(AbstractC111324zv.A00(2341), false)) {
            z = true;
        }
        c6wq.setCancelable(z);
        if (!z) {
            c6wq.setOnKeyListener(this.A00);
        }
        return c6wq;
    }

    public Context A0M() {
        return requireContext();
    }
}
