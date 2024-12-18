package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0S implements InterfaceC58169PqZ {
    public final EnumC53380NjV A00;
    public final C81X A01;
    public final UserSession A02;
    public final AbstractC59962oe A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        Integer num;
        C23031Ai A00 = AbstractC23021Ah.A00(this.A02);
        AbstractC59962oe abstractC59962oe = this.A03;
        int i = 2131955544;
        if (this.A05) {
            i = 2131963562;
        }
        String A0v = AbstractC25227BEk.A0v(abstractC59962oe, i);
        Context requireContext = abstractC59962oe.requireContext();
        if (this.A04) {
            num = Integer.valueOf(R.drawable.instagram_arrow_up_pano_outline_24);
        } else {
            num = null;
        }
        C52369NFj A01 = OOy.A01(requireContext, AbstractC166997dE.A0b(), A0v, num, 2131963563);
        A01.setChecked(A00.A20());
        A01.setOnToggleListener(new P3X(3, A00, this));
        return A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A00;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    public P0S(AbstractC59962oe abstractC59962oe, UserSession userSession, boolean z, boolean z2) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A03 = abstractC59962oe;
        this.A02 = userSession;
        this.A04 = z;
        this.A05 = z2;
        this.A01 = C81X.A34;
        this.A00 = EnumC53380NjV.A0O;
    }
}
