package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6k3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6k3 implements InterfaceC149856oe {
    public final UserSession A00;
    public final InterfaceC1118853a A01;

    @Override // X.InterfaceC149856oe
    public final void Dfc(String str) {
    }

    @Override // X.InterfaceC149856oe
    public final void Dfd() {
    }

    @Override // X.InterfaceC149856oe
    public final void EFE(String str) {
    }

    @Override // X.InterfaceC149856oe
    public final void DD6(boolean z, String str) {
        C41181vS A08;
        C38321qM c38321qM;
        CreativeConfigIntf Asm;
        C41551w4 c41551w4 = ((ReelViewerFragment) this.A01).A0a;
        if (c41551w4 != null && (A08 = c41551w4.A08(this.A00)) != null && (c38321qM = A08.A0b) != null && (Asm = c38321qM.A0C.Asm()) != null) {
            c38321qM.A0C.ESQ(AbstractC121575f6.A02(Asm, z));
        }
    }

    @Override // X.InterfaceC149856oe
    public final void Dkc() {
        ReelViewerFragment.A0I((ReelViewerFragment) this.A01, false);
    }

    public C6k3(UserSession userSession, InterfaceC1118853a interfaceC1118853a) {
        this.A00 = userSession;
        this.A01 = interfaceC1118853a;
    }
}
