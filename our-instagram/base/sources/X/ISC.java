package X;

import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class ISC {
    public static final C38445GvS A00(ViewGroup viewGroup) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C38445GvS c38445GvS = new C38445GvS(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.product_picker_spinner_and_message_row, false));
        c38445GvS.A01.setVisibility(0);
        return c38445GvS;
    }

    public static final void A01(C38445GvS c38445GvS, String str) {
        AbstractC167017dG.A1N(c38445GvS, str);
        if (str.length() == 0) {
            c38445GvS.A00.setText(2131973064);
        } else {
            AbstractC31177DnL.A0r(AbstractC31172DnG.A05(c38445GvS), c38445GvS.A00, str, 2131973013);
        }
    }
}
