package X;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes10.dex */
public final class RE9 extends Q83 {
    public InterfaceC65511Tlg A00;

    @Override // X.Q83
    public final void A01() {
        super.A01();
        REJ rej = (REJ) this.A04;
        rej.A01 = this.A00;
        this.A00 = null;
        C63627SqZ.A00(this, rej.A05, 39);
    }

    @Override // X.Q83, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setBackground(null);
        this.A02.setBackground(null);
    }
}
