package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.FBz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34331FBz {
    public static void A00(View view, FMT fmt, boolean z, boolean z2, boolean z3) {
        String str;
        E2B e2b = (E2B) AbstractC31172DnG.A0x(view);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        IgdsButton igdsButton = e2b.A01;
        igdsButton.setLoading(z3);
        if (z3) {
            str = "";
        } else {
            str = fmt.A02;
        }
        igdsButton.setText(str);
        TextView textView = e2b.A00;
        textView.setText(fmt.A03);
        textView.setTextColor(fmt.A00);
        igdsButton.setEnabled(z);
        if (z) {
            C0fQ.A00(fmt.A01, igdsButton);
        }
        textView.setVisibility(AbstractC167007dF.A05(z2 ? 1 : 0));
    }
}
