package X;

import android.text.Editable;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes4.dex */
public final class Aiv implements C7C8 {
    public final /* synthetic */ ComposerAutoCompleteTextView A00;

    @Override // X.C7C8
    public final void CKU(Editable editable) {
    }

    @Override // X.C7C8
    public final int getSpanEnd(Object obj) {
        Editable text;
        C14360o3.A0B(obj, 0);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView != null && (text = composerAutoCompleteTextView.getText()) != null) {
            return text.getSpanEnd(obj);
        }
        return -1;
    }

    @Override // X.C7C8
    public final int getSpanStart(Object obj) {
        Editable text;
        C14360o3.A0B(obj, 0);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView != null && (text = composerAutoCompleteTextView.getText()) != null) {
            return text.getSpanStart(obj);
        }
        return -1;
    }

    @Override // X.C7C8
    public final void removeSpan(Object obj) {
        Editable text;
        C14360o3.A0B(obj, 0);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView != null && (text = composerAutoCompleteTextView.getText()) != null) {
            text.removeSpan(obj);
        }
    }

    public Aiv(ComposerAutoCompleteTextView composerAutoCompleteTextView) {
        this.A00 = composerAutoCompleteTextView;
    }

    @Override // X.C7C8
    public final Object[] getSpans(int i, int i2, Class cls) {
        Editable text;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView != null && (text = composerAutoCompleteTextView.getText()) != null) {
            return text.getSpans(i, i2, cls);
        }
        return null;
    }
}
