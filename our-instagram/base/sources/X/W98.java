package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class W98 {
    public String A00;
    public final ViewGroup A01;
    public final AB3 A02;
    public final TextView A05;
    public final List A04 = new ArrayList();
    public final C68739VbI A06 = new C68739VbI(this);
    public final List A03 = new ArrayList();

    public static void A00(W98 w98) {
        for (C69159Vio c69159Vio : w98.A04) {
            if (!c69159Vio.A02) {
                ViewGroup viewGroup = w98.A01;
                C69222Vjp c69222Vjp = new C69222Vjp(AbstractC31173DnH.A0C(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.product_sticker_token, false));
                C68739VbI c68739VbI = w98.A06;
                C14360o3.A0B(c68739VbI, 2);
                Context context = c69222Vjp.A00;
                C15980qs A00 = AbstractC15960qq.A00(context);
                View view = c69222Vjp.A01;
                view.setSelected(c69159Vio.A00);
                int i = 2131970042;
                if (c69159Vio.A00) {
                    i = 2131970038;
                }
                String str = c69159Vio.A01;
                AbstractC37302Gc3.A0o(context, view, str, i);
                TextView textView = c69222Vjp.A03;
                String upperCase = str.toUpperCase(C1Q2.A02());
                C14360o3.A07(upperCase);
                textView.setText(upperCase);
                textView.setTypeface(A00.A02(EnumC15950qp.A0V));
                C3P9 c3p9 = new C3P9(view);
                c3p9.A04 = new C68004V5w(0, c69222Vjp, c68739VbI, c69159Vio);
                c3p9.A07 = true;
                c3p9.A0D = true;
                c3p9.A00();
                viewGroup.addView(view);
            }
        }
    }

    public static void A01(W98 w98) {
        int i;
        boolean z = true;
        boolean z2 = true;
        for (C69159Vio c69159Vio : w98.A04) {
            if (!c69159Vio.A02) {
                if (c69159Vio.A00) {
                    z2 = false;
                } else {
                    z = false;
                }
            }
        }
        TextView textView = w98.A05;
        if (z) {
            i = 2131970041;
        } else {
            i = 2131970040;
            if (z2) {
                i = 2131970039;
            }
        }
        textView.setText(i);
    }

    public W98(View view, AB3 ab3) {
        this.A02 = ab3;
        this.A01 = (ViewGroup) view.requireViewById(R.id.product_sticker_tokens_container);
        this.A05 = (TextView) view.requireViewById(R.id.product_sticker_tokens_title);
    }
}
