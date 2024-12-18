package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Ibm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41654Ibm {
    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(context), viewGroup, R.layout.row_feed_collaborative_invite, false);
        A0C.setTag(new C41103IHu(A0C));
        return A0C;
    }

    public static final void A01(C41103IHu c41103IHu, JFV jfv) {
        View view;
        AbstractC167007dF.A1K(c41103IHu, jfv);
        if (jfv.equals(C42604ItN.A00)) {
            view = c41103IHu.A00;
        } else if (jfv instanceof H7R) {
            c41103IHu.A00.setVisibility(0);
            AbstractC31176DnK.A1G(c41103IHu.A02, ((H7R) jfv).A00);
            c41103IHu.A01.setVisibility(0);
            view = c41103IHu.A03;
        } else {
            if (jfv instanceof H7S) {
                c41103IHu.A00.setVisibility(0);
                H7S h7s = (H7S) jfv;
                AbstractC31176DnK.A1G(c41103IHu.A02, h7s.A00);
                c41103IHu.A01.setVisibility(8);
                IgdsButton igdsButton = c41103IHu.A03;
                igdsButton.setVisibility(0);
                igdsButton.setText(h7s.A01.A01);
                igdsButton.setStyle(EnumC99704do.A03);
                ViewOnClickListenerC42032Ik1.A01(igdsButton, 28, jfv);
                return;
            }
            throw B4Z.A00();
        }
        view.setVisibility(8);
    }
}
