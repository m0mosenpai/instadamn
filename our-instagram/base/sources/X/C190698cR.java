package X;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;

/* renamed from: X.8cR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190698cR implements TextWatcher {
    public int A00;
    public boolean A01;
    public final C57012jc A02;
    public final C190688cQ A03;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        if (this.A01) {
            int A00 = C9NK.A00(editable);
            int[] iArr = AbstractC202818xz.A02;
            CharSequence A05 = AbstractC202818xz.A05(Selection.getSelectionEnd(editable) - 1, editable);
            if (A00 < 0 && (A05 == null || A05.length() == 0)) {
                AbstractC125325le.A05(new View[]{this.A02.A01()}, true);
                C190398bx c190398bx = this.A03.A00;
                C190398bx.A0D(c190398bx);
                AbstractC125325le.A04(null, new View[]{c190398bx.A1m}, true);
                return;
            }
            C57012jc c57012jc = this.A02;
            AbstractC125325le.A04(null, new View[]{c57012jc.A01()}, true);
            c57012jc.A01().setTranslationY(this.A00);
            C190398bx c190398bx2 = this.A03.A00;
            C190398bx.A0J(c190398bx2, true);
            AbstractC125325le.A05(new View[]{c190398bx2.A1m}, true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C190698cR(C57012jc c57012jc, C190688cQ c190688cQ) {
        this.A03 = c190688cQ;
        this.A02 = c57012jc;
    }
}
