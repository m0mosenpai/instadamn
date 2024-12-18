package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Iiv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41964Iiv implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C37991Gnc A02;
    public final /* synthetic */ IJX A03;

    public ViewOnClickListenerC41964Iiv(C38321qM c38321qM, C37991Gnc c37991Gnc, IJX ijx, int i) {
        this.A03 = ijx;
        this.A01 = c38321qM;
        this.A00 = i;
        this.A02 = c37991Gnc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(334791550);
        C37493GfB c37493GfB = this.A03.A03;
        C38321qM c38321qM = this.A01;
        int i = this.A00;
        if (c38321qM.A5M() && AbstractC37300Gc1.A0Y(c38321qM) != null) {
            List A0Y = AbstractC37300Gc1.A0Y(c38321qM);
            if (A0Y != null) {
                c38321qM = AbstractC25225BEi.A0x(A0Y, i);
            } else {
                throw AbstractC25227BEk.A0n();
            }
        }
        UserSession userSession = c37493GfB.A06;
        User user = c37493GfB.A0B;
        List A00 = AbstractC151296rX.A00(userSession, c38321qM, user, i);
        InterfaceC60442pS interfaceC60442pS = c37493GfB.A09;
        AbstractC41775Ier.A05(userSession, c38321qM, interfaceC60442pS, null, "shopping_profile_toast_view_products", c37493GfB.A00(), "shopping_profile_toast", c37493GfB.A0A.A0A, A00, AbstractC151296rX.A03(userSession, c38321qM, user, i));
        if (A00.size() == 1) {
            C42130Ile.A01(C1XJ.A00.A0L(c37493GfB.A05, userSession, interfaceC60442pS, (Product) A00.get(0), "shopping_profile_toast", c37493GfB.A00()));
        } else if (A00.size() > 1) {
            C41214IMd A0P = C1XJ.A00.A0P(c37493GfB.A05, userSession, interfaceC60442pS);
            A0P.A07 = C05F.A00;
            C14360o3.A0B(c38321qM, 0);
            A0P.A01 = c38321qM;
            A0P.A02 = null;
            A0P.A0B = c37493GfB.A00();
            A0P.A09 = c37493GfB.A0C;
            A0P.A0A = "shopping_profile_toast";
            A0P.A08 = c37493GfB.A03.getString(2131973947);
            A0P.A0C = A00;
            A0P.A00();
        }
        C0f9.A0C(-1196684137, A05);
    }
}
