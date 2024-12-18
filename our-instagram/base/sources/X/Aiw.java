package X;

import android.text.Editable;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes4.dex */
public final class Aiw implements C7C8 {
    public final /* synthetic */ ComposerAutoCompleteTextView A00;

    @Override // X.C7C8
    public final void CKU(Editable editable) {
    }

    @Override // X.C7C8
    public final int getSpanEnd(Object obj) {
        C14360o3.A0B(obj, 0);
        return this.A00.getText().getSpanEnd(obj);
    }

    @Override // X.C7C8
    public final int getSpanStart(Object obj) {
        C14360o3.A0B(obj, 0);
        return this.A00.getText().getSpanStart(obj);
    }

    @Override // X.C7C8
    public final void removeSpan(Object obj) {
        C14360o3.A0B(obj, 0);
        this.A00.getText().removeSpan(obj);
    }

    public Aiw(ComposerAutoCompleteTextView composerAutoCompleteTextView) {
        this.A00 = composerAutoCompleteTextView;
    }

    @Override // X.C7C8
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.A00.getText().getSpans(i, i2, cls);
    }
}
