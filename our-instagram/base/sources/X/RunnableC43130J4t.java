package X;

import android.widget.TextView;
import com.facebook.R;
import com.instagram.user.model.Product;

/* renamed from: X.J4t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43130J4t implements Runnable {
    public final /* synthetic */ C38512GwX A00;
    public final /* synthetic */ Product A01;

    public RunnableC43130J4t(C38512GwX c38512GwX, Product product) {
        this.A00 = c38512GwX;
        this.A01 = product;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A00.A08;
        String str = this.A01.A0J;
        if (str == null) {
            str = "";
        }
        textView.setText(AbstractC41758IeZ.A06(textView, str, R.dimen.abc_control_corner_material, textView.getWidth()));
    }
}
