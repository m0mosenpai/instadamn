package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Ed6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32864Ed6 extends AbstractC46516KiF {
    public final UserSession A00;
    public final Capabilities A01;
    public final C137756Lx A02;
    public final MsysThreadId A03;
    public final InterfaceC09390do A04;

    @Override // X.AbstractC46516KiF
    public final C42221xC A00(C42221xC c42221xC) {
        C14360o3.A0B(c42221xC, 0);
        return c42221xC.A0L(new C48358LaY(7, AnonymousClass618.A00(this.A00), this));
    }

    public C32864Ed6(UserSession userSession, Capabilities capabilities, C137756Lx c137756Lx, MsysThreadId msysThreadId) {
        AbstractC167017dG.A1R(msysThreadId, c137756Lx);
        this.A00 = userSession;
        this.A03 = msysThreadId;
        this.A02 = c137756Lx;
        this.A01 = capabilities;
        this.A04 = C37054GUk.A00(this, 4);
    }

    @Override // X.AbstractC46516KiF
    public final Class A01() {
        return G5S.class;
    }
}
