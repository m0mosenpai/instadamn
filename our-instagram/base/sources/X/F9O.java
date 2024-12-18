package X;

import android.util.TypedValue;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class F9O {
    public static final void A00(TextView textView, String str) {
        boolean A1a = AbstractC167017dG.A1a(textView, str);
        if (textView.getBackground() != null) {
            TypedValue typedValue = new TypedValue();
            textView.getContext().getTheme().resolveAttribute(R.attr.backgroundColorHighlight, typedValue, A1a);
            AbstractC166997dE.A1F(textView.getBackground(), typedValue.data);
        }
        textView.setText(str);
        AbstractC31172DnG.A1E(textView.getResources(), textView, 2131968841);
    }
}
