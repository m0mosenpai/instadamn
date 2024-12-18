package X;

import android.view.View;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3tR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86533tR {
    public static final void A00(C86013sY c86013sY) {
        View A01;
        C14360o3.A0B(c86013sY, 0);
        C57012jc c57012jc = c86013sY.A03;
        if (c57012jc.A00 != null && (A01 = c57012jc.A01()) != null) {
            A01.setVisibility(8);
        }
    }

    public static final void A01(C86013sY c86013sY) {
        View A01;
        C14360o3.A0B(c86013sY, 0);
        C57012jc c57012jc = c86013sY.A03;
        if (c57012jc.A00 != null && (A01 = c57012jc.A01()) != null) {
            A01.setVisibility(0);
        }
    }

    public static final void A02(C86013sY c86013sY, List list, boolean z) {
        C14360o3.A0B(c86013sY, 0);
        C14360o3.A0B(list, 1);
        if (!list.isEmpty() && c86013sY.A02) {
            int i = c86013sY.A00;
            if (i != 0) {
                c86013sY.A00(i);
            }
            C57012jc c57012jc = c86013sY.A03;
            TextView textView = (TextView) c57012jc.A01();
            if (textView != null) {
                textView.setText(AbstractC001800i.A0P("\n", "", "", list, null));
            }
            View A01 = c57012jc.A01();
            if (A01 != null) {
                C0fQ.A00(new ViewOnClickListenerC41862Ih0(c86013sY), A01);
            }
            View A012 = c57012jc.A01();
            if (A012 != null) {
                int i2 = 8;
                if (z) {
                    i2 = 0;
                }
                A012.setVisibility(i2);
                return;
            }
            return;
        }
        A00(c86013sY);
    }
}
