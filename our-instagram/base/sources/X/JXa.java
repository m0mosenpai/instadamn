package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class JXa {
    public static final void A00(Context context, ImageView imageView, TextView textView, UserSession userSession, C57012jc c57012jc, C57012jc c57012jc2, InterfaceC56392iX interfaceC56392iX, JS2 js2) {
        Typeface A02;
        AbstractC167017dG.A1R(textView, c57012jc);
        C14360o3.A0B(js2, 7);
        boolean A08 = AbstractC14710oj.A08();
        E72 e72 = null;
        int i = js2.A00;
        if (A08) {
            Context context2 = textView.getContext();
            if (i == 1) {
                A02 = AbstractC14710oj.A00(context2);
            } else {
                A02 = AbstractC14710oj.A02(context2);
            }
            textView.setTypeface(A02, i);
        } else {
            textView.setTypeface(null, i);
        }
        AbstractC31177DnL.A0z(textView, context);
        AbstractC46441Kh1 abstractC46441Kh1 = js2.A01;
        if (abstractC46441Kh1 instanceof C43652JSk) {
            String str = ((C43652JSk) abstractC46441Kh1).A00;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        } else if (abstractC46441Kh1 instanceof JSA) {
            JSA jsa = (JSA) abstractC46441Kh1;
            List list = jsa.A00;
            C14360o3.A0B(list, 1);
            int A082 = AbstractC43594JPz.A08(textView, textView.getRight() - textView.getLeft());
            int i2 = 0;
            while (i2 < list.size() && textView.getPaint().measureText((String) list.get(i2)) > A082) {
                i2++;
            }
            if (i2 >= list.size()) {
                i2 = AbstractC25226BEj.A05(list);
            }
            String A1I = AbstractC25226BEj.A1I(list, i2);
            boolean z = jsa.A03;
            if (jsa.A01 || jsa.A02) {
                e72 = new E72(C05F.A00);
            }
            AbstractC31326Dpo.A00(textView, e72, A1I, z);
        } else {
            throw B4Z.A00();
        }
        int i3 = 0;
        c57012jc.A03(AbstractC167007dF.A05(js2.A05 ? 1 : 0));
        if (c57012jc2 != null) {
            c57012jc2.A03(AbstractC167007dF.A05(js2.A03 ? 1 : 0));
        }
        if (imageView != null) {
            imageView.setVisibility(AbstractC167007dF.A05(js2.A03 ? 1 : 0));
        }
        if (interfaceC56392iX != null) {
            if (!js2.A02 || !C18U.A06(C06090Tz.A05, userSession, 36330007370416768L)) {
                i3 = 8;
            }
            interfaceC56392iX.setVisibility(i3);
        }
    }
}
