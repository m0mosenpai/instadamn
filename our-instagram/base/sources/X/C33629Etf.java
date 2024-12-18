package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Etf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33629Etf {
    public Fragment A00;
    public C67858Uzp A01;
    public boolean A02;

    public final void A00() {
        C67858Uzp c67858Uzp = this.A01;
        AbstractC10360h2 abstractC10360h2 = c67858Uzp.mFragmentManager;
        if (abstractC10360h2 != null) {
            C0SG c0sg = (C0SG) abstractC10360h2.A0Q("ProgressDialog");
            if (c0sg == null) {
                if (c67858Uzp.isAdded()) {
                    c0sg = c67858Uzp;
                }
                this.A02 = false;
            }
            c0sg.A08();
            this.A02 = false;
        }
    }

    public final void A01() {
        Fragment fragment = this.A00;
        if (fragment.getChildFragmentManager().A0Q("ProgressDialog") == null) {
            C67858Uzp c67858Uzp = this.A01;
            if (!c67858Uzp.isAdded()) {
                c67858Uzp.A0G(new C14240no(fragment.getChildFragmentManager()), "ProgressDialog", true);
                this.A02 = true;
            }
        }
    }
}
