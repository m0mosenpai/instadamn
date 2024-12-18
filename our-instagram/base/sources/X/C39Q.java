package X;

import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.39Q, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39Q {
    public final C39P A00;

    public C39Q(C39P c39p) {
        C14360o3.A0B(c39p, 1);
        this.A00 = c39p;
    }

    public final void A00(C38523Gwj c38523Gwj, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38523Gwj, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        JLW B5Q = c38321qM.A0C.B5Q();
        if (B5Q != null) {
            TextView textView = c38523Gwj.A01;
            textView.setText(B5Q.getText());
            textView.getPaint().setFakeBoldText(true);
            TextView textView2 = c38523Gwj.A00;
            textView2.setText(B5Q.C3Z());
            int i = 8;
            if (B5Q.C3Z() != null) {
                i = 0;
            }
            textView2.setVisibility(i);
            IgdsButton igdsButton = c38523Gwj.A02;
            igdsButton.setText(B5Q.AYe());
            igdsButton.setVisibility(0);
            c75113Zb.A0L(c38523Gwj, null, false);
            C0fQ.A00(new ViewOnClickListenerC41923IiG(this, c38321qM, c75113Zb), igdsButton);
            AbstractC40632Hzq.A00(c38523Gwj, c75113Zb);
        }
    }
}
