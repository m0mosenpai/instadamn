package X;

import android.os.Bundle;

/* loaded from: classes10.dex */
public abstract class QEF extends Q7i {
    public boolean A00 = false;

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(279770036);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            i = -354337319;
        } else {
            this.A00 = bundle2.getBoolean("disable_drag_and_bg_tap_to_dismiss", false);
            i = -1135108024;
        }
        C0f9.A09(i, A02);
    }
}
