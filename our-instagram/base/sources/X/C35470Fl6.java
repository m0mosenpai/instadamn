package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Fl6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35470Fl6 implements TextWatcher {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 0);
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        IgdsInlineSearchBox.A00(igdsInlineSearchBox, AbstractC167007dF.A1N(charSequence.length()));
        String A01 = AbstractC13670mt.A01(charSequence);
        if (igdsInlineSearchBox.A06 && A01 != null) {
            charSequence = A01;
        }
        GZD gzd = igdsInlineSearchBox.A02;
        if (gzd != null) {
            gzd.onSearchTextChanged(charSequence.toString());
        }
    }

    public C35470Fl6(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }
}
