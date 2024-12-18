package X;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.Wca, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70544Wca implements InterfaceC71914X9y {
    public final /* synthetic */ C67777Uxt A00;

    public C70544Wca(C67777Uxt c67777Uxt) {
        this.A00 = c67777Uxt;
    }

    @Override // X.InterfaceC71914X9y
    public final void DDc(TextInputLayout textInputLayout, int i) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.A0F;
        if (autoCompleteTextView != null && i == 3) {
            autoCompleteTextView.post(new RunnableC71467WuT(autoCompleteTextView, this));
            if (autoCompleteTextView.getOnFocusChangeListener() == this.A00.A09) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            autoCompleteTextView.setOnDismissListener(null);
        }
    }
}
