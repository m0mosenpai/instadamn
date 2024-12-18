package X;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes11.dex */
public abstract class UDB extends AbstractC66383UEr {
    @Override // X.C0SG
    public void A07() {
        Dialog dialog = this.A01;
        if (dialog instanceof Q5b) {
            ((Q5b) dialog).A07();
        }
        super.A07();
    }

    @Override // X.C0SG
    public final void A08() {
        Dialog dialog = this.A01;
        if (dialog instanceof Q5b) {
            ((Q5b) dialog).A07();
        }
        super.A08();
    }

    @Override // X.AbstractC66383UEr, X.C0SG
    public Dialog A0F(Bundle bundle) {
        return new Q5b(getContext(), A0E());
    }
}
