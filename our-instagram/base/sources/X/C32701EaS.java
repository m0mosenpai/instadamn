package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.EaS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32701EaS extends E48 {
    public final UserSession A00;
    public final FQ9 A01;
    public final LGr A02;
    public final C35967FuR A03;

    @Override // X.E48
    public final void A01(C32716Eah c32716Eah) {
        super.A01(c32716Eah);
        C32050E6c c32050E6c = c32716Eah.A01;
        LGr lGr = this.A02;
        InterfaceC56392iX interfaceC56392iX = lGr.A0L;
        TextView textView = (TextView) interfaceC56392iX.getView();
        textView.setVisibility(0);
        User user = c32050E6c.A02;
        if (user != null) {
            CircularImageView A01 = lGr.A01();
            View view = lGr.A0D.getView();
            C35967FuR c35967FuR = this.A03;
            AbstractC167027dH.A13(A01, view, c35967FuR);
            AbstractC31173DnH.A1T(c35967FuR, A01, user);
            view.setVisibility(0);
            if (C18U.A06(C06090Tz.A05, this.A00, 36319377333296513L)) {
                textView.setVisibility(0);
                AbstractC31173DnH.A1F(textView, user);
                ViewOnClickListenerC35683FpI.A00(textView, 51, user, this);
                ViewOnClickListenerC35683FpI.A00(lGr.A01(), 52, user, this);
            }
        }
        InterfaceC56392iX interfaceC56392iX2 = lGr.A0F;
        IgTextView igTextView = (IgTextView) interfaceC56392iX2.getView();
        String str = c32050E6c.A06;
        if (str != null) {
            AbstractC31172DnG.A1T(interfaceC56392iX2, 0);
            igTextView.setText(str);
            AbstractC34118F3u.A00(igTextView);
        }
        boolean BCt = c32716Eah.BCt();
        TextView textView2 = (TextView) lGr.A0I.getView();
        Context context = textView2.getContext();
        AbstractC31177DnL.A0y(textView2, context);
        if (BCt) {
            textView2.setVisibility(0);
            textView2.setText(2131960203);
        } else {
            if (c32050E6c.A04 != null) {
                textView2.setText(C23831Eq.A05(context, r0.intValue(), false));
                textView2.setVisibility(0);
            }
        }
        boolean BCt2 = c32716Eah.BCt();
        View view2 = interfaceC56392iX.getView();
        View view3 = interfaceC56392iX2.getView();
        View view4 = lGr.A0D.getView();
        float f = 1.0f;
        if (BCt2) {
            f = 0.6f;
        }
        view4.setAlpha(f);
        view2.setAlpha(f);
        view3.setAlpha(f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.FuR, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C32701EaS(android.view.View r8, com.instagram.common.session.UserSession r9, X.FQ9 r10, int r11, boolean r12) {
        /*
            r7 = this;
            X.LGr r4 = new X.LGr
            r2 = r8
            r4.<init>(r8, r9)
            r3 = r10
            X.AbstractC167017dG.A1P(r9, r10)
            r1 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A00 = r9
            r7.A01 = r10
            r7.A02 = r4
            X.FuR r0 = new X.FuR
            r0.<init>()
            r7.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32701EaS.<init>(android.view.View, com.instagram.common.session.UserSession, X.FQ9, int, boolean):void");
    }
}
