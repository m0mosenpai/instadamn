package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class IQW {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (r4.BBS().booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.InterfaceC11380iw r5, X.InterfaceC63912vC r6, X.C38492GwD r7, X.C42665IuM r8, X.C105854pw r9) {
        /*
            X.1qt r4 = r9.A00
            com.instagram.common.typedurl.ImageUrl r0 = r4.BEx()
            boolean r1 = X.AbstractC81033jX.A03(r0)
            r2 = 0
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            if (r1 != 0) goto L8e
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r7.A00
            if (r1 != 0) goto L1d
            android.view.ViewStub r0 = r7.A02
            android.view.View r1 = r0.inflate()
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = (com.instagram.common.ui.widget.imageview.CircularImageView) r1
            r7.A00 = r1
        L1d:
            com.instagram.common.typedurl.ImageUrl r0 = r4.BEx()
            r1.setUrl(r0, r5)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A00
            if (r0 != 0) goto L32
            android.view.ViewStub r0 = r7.A02
            android.view.View r0 = r0.inflate()
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            r7.A00 = r0
        L32:
            r0.setVisibility(r2)
        L35:
            android.widget.TextView r1 = r7.A04
            java.lang.String r0 = r9.A03()
            r1.setText(r0)
            android.widget.TextView r1 = r7.A03
            java.lang.String r0 = r9.A02()
            r1.setText(r0)
            java.lang.String r0 = r4.Aj7()
            r3 = 8
            if (r0 == 0) goto L88
            com.instagram.igds.components.button.IgdsButton r1 = r7.A05
            r1.setVisibility(r2)
            java.lang.String r0 = r4.Aj7()
            r1.setText(r0)
            r0 = 14
            X.ViewOnClickListenerC42029Ijy.A00(r1, r6, r9, r8, r0)
        L60:
            java.lang.Boolean r0 = r4.BBS()
            if (r0 == 0) goto L71
            java.lang.Boolean r0 = r4.BBS()
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L72
        L71:
            r0 = 0
        L72:
            android.view.View r1 = r7.A01
            if (r0 == 0) goto L83
            r1.setVisibility(r2)
            r0 = 24
            X.Ik1 r0 = X.ViewOnClickListenerC42032Ik1.A00(r6, r0)
        L7f:
            X.C0fQ.A00(r0, r1)
            return
        L83:
            r1.setVisibility(r3)
            r0 = 0
            goto L7f
        L88:
            com.instagram.igds.components.button.IgdsButton r0 = r7.A05
            r0.setVisibility(r3)
            goto L60
        L8e:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A00
            X.AbstractC13880nE.A0P(r0)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IQW.A01(X.0iw, X.2vC, X.GwD, X.IuM, X.4pw):void");
    }

    public static View A00(Context context, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.simple_action);
        A0A.setTag(new C38492GwD(A0A));
        return A0A;
    }
}
