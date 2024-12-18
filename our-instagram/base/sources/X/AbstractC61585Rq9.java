package X;

import android.app.Dialog;

/* renamed from: X.Rq9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61585Rq9 {
    public final void A00() {
        if (this instanceof C60666RGu) {
            C60666RGu c60666RGu = (C60666RGu) this;
            AbstractDialogInterfaceOnCancelListenerC1336061o abstractDialogInterfaceOnCancelListenerC1336061o = c60666RGu.A01.A01;
            abstractDialogInterfaceOnCancelListenerC1336061o.A01.set(null);
            abstractDialogInterfaceOnCancelListenerC1336061o.A09();
            Dialog dialog = c60666RGu.A00;
            if (dialog.isShowing()) {
                dialog.dismiss();
                return;
            }
            return;
        }
        C60650RGb c60650RGb = (C60650RGb) ((C60665RGt) this).A00.get();
        if (c60650RGb == null) {
            return;
        }
        C60650RGb.A02(c60650RGb);
    }
}
