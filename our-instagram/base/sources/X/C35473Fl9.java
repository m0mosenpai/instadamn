package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: X.Fl9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35473Fl9 implements TextWatcher {
    public String A00;
    public final TextView.OnEditorActionListener A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final GYP A05;

    public C35473Fl9(TextView.OnEditorActionListener onEditorActionListener, GYP gyp, Integer num, String str, String str2, boolean z) {
        AbstractC167027dH.A0a(1, str, str2, gyp, onEditorActionListener);
        this.A03 = str;
        this.A00 = str2;
        this.A05 = gyp;
        this.A01 = onEditorActionListener;
        this.A02 = num;
        this.A04 = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        String obj = editable.toString();
        this.A00 = obj;
        this.A05.onTextChanged(obj);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
