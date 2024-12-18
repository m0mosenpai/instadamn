package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class IS8 {
    public static final LinearLayout A00(Context context) {
        C14360o3.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int A06 = AbstractC167017dG.A06(context);
        C38441GvO c38441GvO = new C38441GvO(linearLayout);
        AbstractC13880nE.A0i(linearLayout, A06, A06);
        C38498GwJ[] c38498GwJArr = c38441GvO.A00;
        int i = 0;
        do {
            View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(context), linearLayout, R.layout.product_feed_grid_item_layout, false);
            A07.setTag(new C38498GwJ(A07));
            linearLayout.addView(A07);
            Object tag = A07.getTag();
            Object obj = null;
            if (tag instanceof C38498GwJ) {
                obj = tag;
            }
            c38498GwJArr[i] = obj;
            i++;
        } while (i < 2);
        linearLayout.setTag(c38441GvO);
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r36, X.InterfaceC11380iw r37, com.instagram.common.session.UserSession r38, X.C38441GvO r39, X.JPm r40, X.HH9 r41, X.C42335Iox r42, java.lang.Integer r43, java.lang.String r44, int r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IS8.A01(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.GvO, X.JPm, X.HH9, X.Iox, java.lang.Integer, java.lang.String, int, boolean):void");
    }
}
