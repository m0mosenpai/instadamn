package X;

import android.text.Editable;
import android.view.View;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.FpS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnFocusChangeListenerC35692FpS implements View.OnFocusChangeListener {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    public ViewOnFocusChangeListenerC35692FpS(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        Editable text = igdsInlineSearchBox.A0E.getText();
        C14360o3.A07(text);
        IgdsInlineSearchBox.A00(igdsInlineSearchBox, AbstractC167007dF.A1N(text.length()));
        View.OnFocusChangeListener onFocusChangeListener = igdsInlineSearchBox.A00;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
