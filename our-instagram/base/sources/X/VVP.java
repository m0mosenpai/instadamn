package X;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes11.dex */
public abstract class VVP {
    public static void A00(C69304VlC c69304VlC, boolean z) {
        View view;
        int i;
        TextView textView = c69304VlC.A02;
        C69019Vfv c69019Vfv = c69304VlC.A04;
        if (z) {
            textView.setTextColor(-1);
            c69304VlC.A03.setSelected(true);
            view = c69304VlC.A01;
            i = c69019Vfv.A00;
        } else {
            textView.setTextColor(c69019Vfv.A01);
            c69304VlC.A03.setSelected(false);
            view = c69304VlC.A01;
            i = -1;
        }
        view.setBackgroundColor(i);
    }
}
