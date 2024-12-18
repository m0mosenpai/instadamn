package X;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: X.UEr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66383UEr extends C0SG {
    @Override // X.C0SG
    public final void A0A(Dialog dialog, int i) {
        if (dialog instanceof UD5) {
            UD5 ud5 = (UD5) dialog;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            ud5.A05().A0Q(1);
            return;
        }
        super.A0A(dialog, i);
    }

    @Override // X.C0SG
    public Dialog A0F(Bundle bundle) {
        return new UD5(getContext(), A0E());
    }
}
