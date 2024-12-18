package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0N implements InterfaceC58169PqZ {
    public final UserSession A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final boolean A03;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        Integer num;
        AbstractC59962oe abstractC59962oe = this.A02;
        Context requireContext = abstractC59962oe.requireContext();
        if (this.A03) {
            num = Integer.valueOf(R.drawable.instagram_text_bg_pano_outline_24);
        } else {
            num = null;
        }
        C52369NFj A01 = OOy.A01(requireContext, AbstractC166997dE.A0a(), abstractC59962oe.getString(2131952954), num, 2131952960);
        A01.setHideSwitchView(true);
        ViewOnClickListenerC55466OkL.A02(A01, 18, this);
        return A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    public P0N(AbstractC59962oe abstractC59962oe, UserSession userSession, boolean z) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A02 = abstractC59962oe;
        this.A00 = userSession;
        this.A03 = z;
        this.A01 = C81X.A2i;
    }
}
