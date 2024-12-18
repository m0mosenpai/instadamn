package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* loaded from: classes9.dex */
public final class Om4 implements InterfaceC52932ba {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C07X A01;
    public final /* synthetic */ UserSession A02;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    public Om4(FragmentActivity fragmentActivity, C07X c07x, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = c07x;
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) AbstractC50522MSa.A0L(fragmentActivity, userSession);
        C87D c87d = (C87D) MSW.A0F(new C87C(userSession, fragmentActivity), fragmentActivity).A00(C87D.class);
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        return new C51050Mh4(fragmentActivity, this.A01, userSession, new OVv(userSession, new C8K6(A00)), new C84P(AbstractC166987dD.A1I(), AbstractC166987dD.A1I()), AnonymousClass849.A00(MSX.A06(fragmentActivity), userSession).A00(clipsCreationViewModel.A0S).A01, c87d, clipsCreationViewModel);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 1);
        return create(cls);
    }
}
