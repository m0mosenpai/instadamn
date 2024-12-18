package X;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes4.dex */
public final class ACU {
    public final ViewGroup A00;

    public final void A00(View.OnClickListener onClickListener, CharSequence charSequence, Integer num, Integer num2) {
        if (charSequence != null && charSequence.length() != 0) {
            TextView A0N = AbstractC167007dF.A0N(this.A00, R.id.thread_disabled_title);
            A0N.setText(charSequence);
            if (onClickListener != null) {
                C0fQ.A00(onClickListener, A0N);
            } else {
                A0N.setMovementMethod(LinkMovementMethod.getInstance());
            }
            A0N.setVisibility(0);
            if (num != null) {
                A0N.setHighlightColor(num.intValue());
            }
            if (num2 != null) {
                A0N.setTextColor(num2.intValue());
            }
        }
    }

    public final void A01(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            TextView A0N = AbstractC167007dF.A0N(this.A00, R.id.thread_disabled_bottom_description);
            A0N.setText(charSequence);
            A0N.setMovementMethod(LinkMovementMethod.getInstance());
            A0N.setVisibility(0);
        }
    }

    public final void A02(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            TextView A0N = AbstractC167007dF.A0N(this.A00, R.id.thread_disabled_top_description);
            A0N.setText(charSequence);
            A0N.setMovementMethod(LinkMovementMethod.getInstance());
            A0N.setVisibility(0);
        }
    }

    public ACU(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
