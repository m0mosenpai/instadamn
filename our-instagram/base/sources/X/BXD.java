package X;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/* loaded from: classes5.dex */
public final class BXD implements InterfaceC51522Ya {
    public static final BXD A00 = new BXD();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        try {
            EditText editText = new EditText(context, null);
            editText.setBackgroundResource(R.color.transparent);
            return editText;
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message != null && AbstractC001900j.A0a(message, "ConstantState.newDrawable", false)) {
                View inflate = LayoutInflater.from(context).inflate(com.facebook.R.layout.fallback_text_input_view, (ViewGroup) null, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.primitive.textinput.TextInputView");
                return inflate;
            }
            throw e;
        }
    }
}
