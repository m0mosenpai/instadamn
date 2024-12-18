package X;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class MZ0 extends AbstractC140596Xn {
    public final RecyclerView A00;
    public final InterfaceC69543Ao A01;
    public final Context A02;
    public final UserSession A03;
    public final C6X3 A04;

    public MZ0(Activity activity, RecyclerView recyclerView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3G2 c3g2, InterfaceC63982vJ interfaceC63982vJ, boolean z) {
        super(activity, interfaceC63982vJ);
        this.A03 = userSession;
        this.A00 = recyclerView;
        this.A01 = (InterfaceC69543Ao) recyclerView.A0A;
        this.A02 = recyclerView.getContext();
        this.A04 = new C6X3(activity, recyclerView, interfaceC11380iw, userSession, c3g2, interfaceC63982vJ, z);
    }

    @Override // X.AbstractC140596Xn
    public final boolean A06() {
        return true;
    }

    private void A00(Reel reel, boolean z) {
        InterfaceC73213Pw interfaceC73213Pw;
        Object A0V = this.A00.A0V(this.A01.CNP(reel));
        if ((A0V instanceof InterfaceC73213Pw) && (interfaceC73213Pw = (InterfaceC73213Pw) A0V) != null) {
            int i = 4;
            if (z) {
                i = 0;
            }
            interfaceC73213Pw.B8v().setVisibility(i);
        }
    }

    @Override // X.AbstractC140596Xn
    public final ImageUrl A03(UserSession userSession, Reel reel) {
        UserSession userSession2 = this.A03;
        if (!reel.A15(userSession2)) {
            C41181vS A09 = reel.A09(userSession2);
            C38321qM c38321qM = A09.A0b;
            if (c38321qM != null && c38321qM.A5n()) {
                return AbstractC25225BEi.A0t(AnonymousClass001.A0R(AbstractC111324zv.A00(1180), c38321qM.BU6()));
            }
            return A09.A07(this.A02.getResources().getDimensionPixelSize(R.dimen.clips_netego_card_width));
        }
        return null;
    }

    @Override // X.AbstractC140596Xn
    public final void A04(Reel reel, C41181vS c41181vS) {
        this.A04.A04(reel, c41181vS);
        A00(reel, true);
    }

    @Override // X.AbstractC140596Xn
    public final void A05(Reel reel, C41181vS c41181vS, InterfaceC138526Pi interfaceC138526Pi, boolean z, boolean z2) {
        this.A04.A05(reel, c41181vS, interfaceC138526Pi, z, z2);
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        InterfaceC73213Pw interfaceC73213Pw;
        Object A0V = this.A00.A0V(this.A01.CNP(reel));
        if ((A0V instanceof InterfaceC73213Pw) && (interfaceC73213Pw = (InterfaceC73213Pw) A0V) != null) {
            float f = 1.0f;
            if (reel.A16(this.A03)) {
                f = 0.2f;
            }
            C6PN c6pn = new C6PN(interfaceC73213Pw.Ahl(), interfaceC73213Pw.BGZ(), false);
            c6pn.A00 = f;
            return c6pn;
        }
        return C6PN.A00();
    }

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
        this.A04.A08(reel);
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
        this.A04.A09(reel, c41181vS);
        A00(reel, false);
    }

    @Override // X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
        this.A04.A0A(reel, c41181vS);
        A00(reel, true);
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }
}
