package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes7.dex */
public final class II7 {
    public ViewGroup A00;
    public final IgdsBottomButtonLayout A01;
    public final C38400Gub A02;
    public final UserSession A03;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3OO, X.Gub] */
    public II7(ViewGroup viewGroup, UserSession userSession) {
        AbstractC167017dG.A1P(viewGroup, userSession);
        this.A00 = viewGroup;
        this.A03 = userSession;
        ?? c3oo = new C3OO(viewGroup);
        c3oo.A02 = AbstractC25230BEn.A0Q(viewGroup, R.id.subtotal_row_title);
        c3oo.A01 = AbstractC25230BEn.A0Q(viewGroup, R.id.subtotal_row_subtitle);
        c3oo.A00 = AbstractC25230BEn.A0Q(viewGroup, R.id.subtotal_amount);
        this.A02 = c3oo;
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) this.A00.requireViewById(R.id.merchant_cart_checkout_bottom_button);
        this.A01 = igdsBottomButtonLayout;
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        igdsBottomButtonLayout.setPrimaryActionText(AbstractC25228BEl.A0M(igdsBottomButtonLayout).getString(2131963263));
    }
}
