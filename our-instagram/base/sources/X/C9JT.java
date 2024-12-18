package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.9JT, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9JT {
    public static final void A00(Context context, C9BT c9bt, IgdsButton igdsButton) {
        igdsButton.setText(context.getString(c9bt.A01));
        igdsButton.setLoading(c9bt.A04);
        C0fQ.A00((View.OnClickListener) c9bt.A02, igdsButton);
        igdsButton.setEnabled(c9bt.A03);
    }
}
