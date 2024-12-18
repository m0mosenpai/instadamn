package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class Eg0 extends Eg1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eg0(Fragment fragment, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, EnumC31713DwI enumC31713DwI, Object obj, Object obj2, String str, String str2, int i) {
        super(fragment, interfaceC11380iw, c07270a1, interfaceC37227Gac, enumC31713DwI, str, str2);
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C32547EUx
    public final void A03(UserSession userSession, User user) {
        if (1 - this.A00 == 0 && ((C34561FKv) this.A02).A02) {
            C83743oJ A01 = C83743oJ.A01(userSession);
            String id = user.getId();
            ENI eni = (ENI) this.A01;
            A01.A09(eni.A00, eni, userSession, C05F.A05, id, true);
        }
        super.A03(userSession, user);
    }

    @Override // X.Eg1, X.C32547EUx
    public final void A04(EfU efU) {
        if (this.A00 != 0) {
            super.A04(efU);
            return;
        }
        int A03 = C0f9.A03(2090869750);
        super.A04(efU);
        AbstractC33642Ets.A00(((ENI) this.A01).A02, ((FK7) this.A02).A00.A01.getId(), "okay", true);
        C0f9.A0A(1493190370, A03);
    }

    @Override // X.Eg1, X.C32547EUx, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1589620740);
                super.onFail(abstractC115105If);
                AbstractC33642Ets.A00(((ENI) this.A01).A02, ((FK7) this.A02).A00.A01.getId(), "in progress", false);
                i = -1054254429;
                break;
            case 1:
            default:
                super.onFail(abstractC115105If);
                return;
            case 2:
                A03 = C0f9.A03(1786912121);
                super.onFail(abstractC115105If);
                C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
                if ((abstractC115105If instanceof C115115Ig) && c40781ul != null && c40781ul.hasErrorType("invalid_one_tap_nonce")) {
                    OneTapLoginLandingFragment oneTapLoginLandingFragment = (OneTapLoginLandingFragment) this.A01;
                    C83743oJ A01 = C83743oJ.A01(oneTapLoginLandingFragment.A00);
                    C83803oP c83803oP = (C83803oP) this.A02;
                    A01.A0G(c83803oP.A06);
                    if (!oneTapLoginLandingFragment.A04 && !oneTapLoginLandingFragment.getActivity().isFinishing() && !oneTapLoginLandingFragment.getActivity().isDestroyed()) {
                        AbstractC31172DnG.A1A();
                        String str = c83803oP.A07;
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", str);
                        C32316ELf c32316ELf = new C32316ELf();
                        AbstractC31181DnP.A0b(c32316ELf, AbstractC31173DnH.A0J(A0b, c32316ELf, oneTapLoginLandingFragment), oneTapLoginLandingFragment.A00);
                    }
                }
                i = 334898884;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.Eg1, X.C32547EUx, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            super.onSuccess(obj);
        } else {
            C0f9.A0A(637099992, C32547EUx.A00(this, obj, 216970723));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eg0(Fragment fragment, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, OneTapLoginLandingFragment oneTapLoginLandingFragment, C83803oP c83803oP, EnumC31713DwI enumC31713DwI, String str, String str2) {
        super(fragment, interfaceC11380iw, c07270a1, interfaceC37227Gac, enumC31713DwI, str, str2);
        this.A00 = 2;
        this.A01 = oneTapLoginLandingFragment;
        this.A02 = c83803oP;
    }
}
