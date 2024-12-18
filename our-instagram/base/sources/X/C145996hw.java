package X;

import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145996hw implements InterfaceC146006hx {
    public final UserSession A00;
    public final InterfaceC1118853a A01;

    public C145996hw(UserSession userSession, InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = interfaceC1118853a;
    }

    @Override // X.InterfaceC146006hx
    public final void Df8(String str) {
        InterfaceC147266kB interfaceC147266kB = ((ReelViewerFragment) this.A01).mViewPager;
        if (interfaceC147266kB != null) {
            interfaceC147266kB.ELH(new C50270MHz(str, this, 11));
        }
    }
}
