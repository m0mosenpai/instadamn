package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class OXN {
    public InterfaceC57994Pne A00;
    public C54567O8t A01;
    public Integer A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final AbstractC018607g A06;
    public final User A07;
    public final InterfaceC16660sJ A08;

    public OXN(Context context, AbstractC018607g abstractC018607g, UserSession userSession, User user) {
        C43361JEc c43361JEc = new C43361JEc(userSession, 10);
        this.A05 = context;
        this.A06 = abstractC018607g;
        this.A07 = user;
        this.A08 = c43361JEc;
        this.A02 = C05F.A00;
    }

    private final void A00(boolean z) {
        if (this.A02 == C05F.A00) {
            this.A02 = C05F.A01;
            InterfaceC57994Pne interfaceC57994Pne = this.A00;
            if (interfaceC57994Pne != null) {
                C56736PGe c56736PGe = (C56736PGe) interfaceC57994Pne;
                if (2 - c56736PGe.A00 == 0) {
                    C55099ObA c55099ObA = (C55099ObA) c56736PGe.A01;
                    SpinnerImageView spinnerImageView = c55099ObA.A08;
                    if (spinnerImageView == null) {
                        View view = c55099ObA.A01;
                        view.getClass();
                        spinnerImageView = (SpinnerImageView) AbstractC167017dG.A0U(view, R.id.loading_spinner);
                        c55099ObA.A08 = spinnerImageView;
                    }
                    spinnerImageView.setVisibility(0);
                    AbstractC31171DnF.A1M(c55099ObA.A08);
                }
                Context context = this.A05;
                AbstractC018607g abstractC018607g = this.A06;
                InterfaceC16660sJ interfaceC16660sJ = this.A08;
                String str = this.A03;
                if (str != null) {
                    Object invoke = interfaceC16660sJ.invoke(str);
                    ((C1ON) invoke).A00 = new N9Z(this, z);
                    C1GJ.A00(context, abstractC018607g, (C11R) invoke);
                    return;
                }
                throw AbstractC166987dD.A12("Required value was null.");
            }
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
    }

    public final void A01() {
        if (this.A02 == C05F.A00 && this.A03 != null) {
            User user = this.A07;
            if (user.A1O() || user.A1N()) {
                A00(true);
                return;
            }
        }
        InterfaceC57994Pne interfaceC57994Pne = this.A00;
        if (interfaceC57994Pne != null) {
            interfaceC57994Pne.Enl();
        } else {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
    }

    public final void A02() {
        if (this.A02 == C05F.A00 && this.A03 != null) {
            User user = this.A07;
            if (user.A1O() || user.A1N()) {
                A00(false);
            }
        }
    }

    public final void A03() {
        C54567O8t c54567O8t = this.A01;
        if (c54567O8t != null) {
            C193328hC A0I = AbstractC31171DnF.A0I(this.A05);
            A0I.A05 = c54567O8t.A01;
            A0I.A0r(c54567O8t.A00);
            AbstractC31175DnJ.A1O(A0I);
            AbstractC31176DnK.A1W(A0I);
        }
    }

    public final void A04(String str) {
        String str2 = this.A03;
        if (str2 == null || !str2.equals(str)) {
            this.A03 = str;
            this.A02 = C05F.A00;
        }
    }

    public final boolean A05() {
        if (this.A02 == C05F.A0N && this.A01 != null) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        switch (this.A02.intValue()) {
            case 0:
            case 2:
                return true;
            case 1:
            default:
                return false;
        }
    }
}
