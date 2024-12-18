package X;

import android.text.Editable;

/* renamed from: X.GBa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36576GBa implements InterfaceC37280Gbh {
    public boolean A00 = true;
    public final /* synthetic */ C31721DwQ A01;

    @Override // X.InterfaceC37280Gbh
    public final void DGv() {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C36576GBa(C31721DwQ c31721DwQ) {
        this.A01 = c31721DwQ;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A00) {
            this.A01.A12 = true;
        }
        C31721DwQ c31721DwQ = this.A01;
        if (c31721DwQ.A0N != null) {
            c31721DwQ.A0N.setEnabled(c31721DwQ.A0l.A0D());
        }
    }

    @Override // X.InterfaceC37280Gbh
    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
