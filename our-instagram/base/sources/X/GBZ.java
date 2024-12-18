package X;

import android.text.Editable;
import com.instagram.profile.edit.fragment.CompleteYourProfileFragment;

/* loaded from: classes6.dex */
public final class GBZ implements InterfaceC37280Gbh {
    public boolean A00 = true;
    public final /* synthetic */ CompleteYourProfileFragment A01;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public GBZ(CompleteYourProfileFragment completeYourProfileFragment) {
        this.A01 = completeYourProfileFragment;
    }

    @Override // X.InterfaceC37280Gbh
    public final void DGv() {
        if (this.A00) {
            CompleteYourProfileFragment completeYourProfileFragment = this.A01;
            completeYourProfileFragment.A07 = true;
            CompleteYourProfileFragment.A01(completeYourProfileFragment);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A00) {
            CompleteYourProfileFragment completeYourProfileFragment = this.A01;
            completeYourProfileFragment.A07 = true;
            CompleteYourProfileFragment.A01(completeYourProfileFragment);
        }
    }

    @Override // X.InterfaceC37280Gbh
    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
