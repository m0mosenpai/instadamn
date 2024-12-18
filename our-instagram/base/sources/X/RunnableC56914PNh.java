package X;

import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.PNh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56914PNh implements Runnable {
    public final /* synthetic */ PC7 A00;

    public RunnableC56914PNh(PC7 pc7) {
        this.A00 = pc7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PC7 pc7 = this.A00;
        TextView textView = pc7.A00;
        if (textView == null) {
            textView = AbstractC166987dD.A0e(pc7.A01, R.id.ar_effect_instruction_text);
            pc7.A00 = textView;
            if (textView == null) {
                return;
            }
        }
        textView.setText("");
    }
}
