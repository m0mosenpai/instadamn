package X;

import android.os.Bundle;

/* renamed from: X.NXa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52770NXa extends C67858Uzp {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03 = false;

    @Override // X.C67858Uzp
    public final String A0N() {
        int i;
        if (this.A00) {
            i = 2131957732;
        } else if (this.A02) {
            i = 2131972339;
        } else {
            i = 2131963560;
            if (this.A01) {
                i = 2131976309;
            }
        }
        return getString(i);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1652593314);
        super.onCreate(bundle);
        this.A00 = requireArguments().getBoolean("isDeleting", false);
        this.A02 = requireArguments().getBoolean("isRemoving", false);
        this.A01 = requireArguments().getBoolean("isUpdating", false);
        this.A01 = requireArguments().getBoolean("isArchiving", true);
        if (bundle != null) {
            this.A03 = bundle.getBoolean("shouldDismissOnResume", false);
        }
        C0f9.A09(-17512269, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1347008938);
        if (this.A00) {
            this.A03 = true;
        }
        super.onPause();
        C0f9.A09(-137015598, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-154022537);
        super.onResume();
        if (this.A03) {
            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
            abstractC10360h2.getClass();
            abstractC10360h2.A0b();
            A07();
        }
        C0f9.A09(1481201873, A02);
    }

    @Override // X.AbstractC72473Mu, X.C0SG, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldDismissOnResume", this.A03);
    }
}
