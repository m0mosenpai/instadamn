package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.JUy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43713JUy implements C7QD, C7QE {
    public JVV A00;
    public C7QH A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final C3PF A06;
    public final CircularImageView A07;
    public final IgdsButton A08;
    public final C7YK A09;
    public final C7YL A0A;
    public final InterfaceC165507ad A0B;

    public C43713JUy(View view, C7YK c7yk, C7YL c7yl, InterfaceC165507ad interfaceC165507ad) {
        AbstractC167007dF.A1F(view, 1, interfaceC165507ad);
        this.A02 = view;
        this.A09 = c7yk;
        this.A0A = c7yl;
        this.A0B = interfaceC165507ad;
        this.A07 = AbstractC31176DnK.A0U(view, R.id.call_state_icon);
        this.A05 = AbstractC31178DnM.A0C(view);
        this.A03 = AbstractC167007dF.A0N(view, R.id.subtitle);
        this.A04 = AbstractC167007dF.A0N(view, R.id.text_button);
        this.A08 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.igds_button);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A02 = 0.95f;
        A0s.A04 = new KKr(this, 1);
        this.A06 = A0s.A00();
    }

    public final void A00(JVV jvv) {
        int intValue;
        if (!this.A0B.CQu()) {
            C7T3 c7t3 = C7T3.A0I;
            Integer num = jvv.A04;
            if (num != null && (intValue = num.intValue()) != -1) {
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue == 3) {
                                this.A0A.DO9(jvv.A06, false);
                                return;
                            }
                            throw B4Z.A00();
                        }
                        this.A0A.DO9(jvv.A06, true);
                        return;
                    }
                    this.A09.COT(jvv.A02, c7t3, true, jvv.A0A);
                    return;
                }
                this.A09.COT(jvv.A02, c7t3, false, jvv.A0A);
            }
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A02;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A01;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A01 = c7qh;
    }
}
