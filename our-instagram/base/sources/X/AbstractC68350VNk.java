package X;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.R;
import com.facebookpay.expresscheckout.models.AuthScreenStyle;

/* renamed from: X.VNk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68350VNk {
    public static void A00(Bundle bundle, Toolbar toolbar, String str, boolean z) {
        int i;
        TextView textView = (TextView) toolbar.findViewById(R.id.fbpay_toolbar_title);
        if (textView != null) {
            AuthScreenStyle authScreenStyle = (AuthScreenStyle) bundle.getParcelable("AUTH_SCREEN_STYLE");
            if (authScreenStyle != null && (i = authScreenStyle.A00) != 0) {
                if (i == -1) {
                    textView.setText("");
                    return;
                }
            } else {
                i = 2131962258;
                if (z) {
                    i = 2131966638;
                }
            }
            textView.setText(i);
            return;
        }
        toolbar.setTitle(str);
    }
}
