package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.OiA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55348OiA implements TextWatcher {
    public int A00;
    public boolean A01;
    public final /* synthetic */ IgFormField A02;
    public final /* synthetic */ AbstractC53634Nnf A03;
    public final /* synthetic */ O3W A04;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        if (!this.A01) {
            this.A01 = true;
            IgFormField igFormField = this.A02;
            igFormField.setText(this.A03.A01(editable.toString()));
            igFormField.setSelection(this.A00);
            NO5 no5 = this.A04.A00;
            ((AbstractC50822Mcy) no5).A07 = true;
            igFormField.A0E();
            ((AbstractC50822Mcy) no5).A07 = false;
            this.A01 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = i + i3;
    }

    public C55348OiA(IgFormField igFormField, AbstractC53634Nnf abstractC53634Nnf, O3W o3w) {
        this.A02 = igFormField;
        this.A03 = abstractC53634Nnf;
        this.A04 = o3w;
    }
}
