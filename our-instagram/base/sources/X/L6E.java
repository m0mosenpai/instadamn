package X;

import android.graphics.Color;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class L6E {
    public final ArrayList A00 = AbstractC166987dD.A1E();

    public final void A00(Iterable iterable) {
        int i;
        C14360o3.A0B(iterable, 0);
        Iterator it = iterable.iterator();
        Iterator A13 = AbstractC166997dE.A13(this.A00);
        while (A13.hasNext()) {
            TextView textView = (TextView) AbstractC166997dE.A0l(A13);
            if (!it.hasNext()) {
                AbstractC31171DnF.A14(textView);
            } else {
                C137246Jd c137246Jd = (C137246Jd) it.next();
                textView.setText(c137246Jd.A01);
                int i2 = c137246Jd.A00;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    i = -7829368;
                                } else {
                                    i = Color.rgb(255, 100, 0);
                                }
                            } else {
                                i = -65281;
                            }
                        } else {
                            i = -16776961;
                        }
                    } else {
                        i = Color.rgb(0, 125, 0);
                    }
                } else {
                    i = -65536;
                }
                textView.setTextColor(i);
            }
        }
    }
}
