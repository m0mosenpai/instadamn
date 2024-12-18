package X;

import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.I5j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40781I5j {
    public static final void A00(C6S8 c6s8) {
        C14360o3.A0B(c6s8, 0);
        c6s8.A00();
        ImageView imageView = c6s8.A01;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.share_check);
            c6s8.A00();
            TextView textView = c6s8.A03;
            if (textView != null) {
                textView.setText(2131971643);
                c6s8.A00();
                TextView textView2 = c6s8.A02;
                if (textView2 != null) {
                    textView2.setText(2131971642);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }
}
