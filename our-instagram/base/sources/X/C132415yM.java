package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5yM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132415yM {
    public static final C132415yM A00 = new Object();

    public static final View A00(Context context, ViewGroup viewGroup, C57332k8 c57332k8) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c57332k8, 2);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_media_headline, viewGroup, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        inflate.setTag(new C132425yN(inflate, c57332k8));
        return inflate;
    }

    public static final void A01(Context context, C9BH c9bh, UserSession userSession, C132425yN c132425yN, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C57332k8 c57332k8, boolean z) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c132425yN, 2);
        C14360o3.A0B(c9bh, 3);
        C14360o3.A0B(c75113Zb, 4);
        C14360o3.A0B(c57332k8, 5);
        C14360o3.A0B(interfaceC60442pS, 6);
        C14360o3.A0B(userSession, 7);
        C75113Zb c75113Zb2 = c132425yN.A03;
        if (c75113Zb2 != null) {
            c75113Zb2.A0M(c132425yN, null, true);
        }
        A02(context, userSession, c132425yN, (C38321qM) c9bh.A00, interfaceC60442pS, c57332k8, c75113Zb.A03);
        if (z) {
            AbstractC56932jR.A04(c132425yN.A04, 4);
        }
        c132425yN.A00 = c9bh;
        c132425yN.A03 = c75113Zb;
        c132425yN.A01 = userSession;
        c132425yN.A02 = interfaceC60442pS;
        c75113Zb.A0L(c132425yN, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r5, com.instagram.common.session.UserSession r6, X.C132425yN r7, X.C38321qM r8, X.InterfaceC60442pS r9, X.C57332k8 r10, int r11) {
        /*
            boolean r0 = r8.A5M()
            if (r0 == 0) goto L69
            X.1qM r0 = r8.A1e(r11)
            if (r0 == 0) goto L61
            X.3qg r2 = r0.A1W()
        L10:
            if (r2 == 0) goto L61
            java.lang.String r0 = r2.A0e
            r1 = 0
            if (r0 == 0) goto L61
            int r0 = r0.length()
            if (r0 == 0) goto L61
            com.instagram.ui.widget.textview.IgTextLayoutView r3 = r7.A04
            r0 = 2130971409(0x7f040b11, float:1.7551556E38)
            int r0 = X.AbstractC53242c7.A0F(r5, r0)
            android.text.Layout r0 = r10.A0C(r5, r2, r0)
            r3.setTextLayout(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r3.A01 = r0
            r3.setVisibility(r1)
        L36:
            X.3Hv r5 = X.EnumC71343Hv.A0j
            r4 = 0
            r2 = r4
            boolean r0 = r8.A5M()
            if (r0 == 0) goto L44
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
        L44:
            X.3Hs r1 = X.C71313Hs.A00(r6)
            X.C14360o3.A07(r1)
            X.3Hw r0 = new X.3Hw
            r0.<init>(r2, r5, r4, r4)
            r1.A08(r3, r0)
            X.3hD r0 = new X.3hD
            r0.<init>(r4, r6, r8, r9)
            r1.A0A(r3, r0)
            X.3dr r0 = X.EnumC77673dr.A0B
            X.AbstractC77703du.A05(r3, r0)
            return
        L61:
            com.instagram.ui.widget.textview.IgTextLayoutView r3 = r7.A04
            r0 = 8
            r3.setVisibility(r0)
            goto L36
        L69:
            X.3qg r2 = r8.A1W()
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132415yM.A02(android.content.Context, com.instagram.common.session.UserSession, X.5yN, X.1qM, X.2pS, X.2k8, int):void");
    }
}
