package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G9X implements InterfaceC65531Tm1 {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C32318ELi A01;

    @Override // X.InterfaceC65531Tm1
    public final void DgW(InterfaceC37130GXr interfaceC37130GXr) {
        interfaceC37130GXr.EKA(new G9T(this, 1));
    }

    public G9X(InterfaceC11380iw interfaceC11380iw, C32318ELi c32318ELi) {
        this.A01 = c32318ELi;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65531Tm1
    public final void D6d(boolean z, String str) {
        C32318ELi c32318ELi = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        FragmentActivity activity = c32318ELi.getActivity();
        UserSession userSession = c32318ELi.A01;
        C0fJ.A00(FBH.A00(activity, new DialogInterfaceOnDismissListenerC35463FkK(c32318ELi, 4), interfaceC11380iw, userSession, C05F.A1F, AbstractC31176DnK.A0q(userSession), c32318ELi.A01.userId));
    }
}
