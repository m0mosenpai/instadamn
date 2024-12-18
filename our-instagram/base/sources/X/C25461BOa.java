package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BOa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25461BOa implements InterfaceC77503da {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ BOY A01;

    public C25461BOa(C38321qM c38321qM, BOY boy) {
        this.A01 = boy;
        this.A00 = c38321qM;
    }

    @Override // X.InterfaceC77503da
    public final void DWl() {
        BOY boy = this.A01;
        C75113Zb c75113Zb = boy.A02.A0E;
        if (c75113Zb != null) {
            C38321qM c38321qM = this.A00;
            boy.A05.C56().DwX(c38321qM, c75113Zb, c38321qM.A4j(), true);
        }
    }

    @Override // X.InterfaceC77503da
    public final boolean Eie() {
        if (this.A00.A4j()) {
            UserSession userSession = this.A01.A04;
            if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36320244913545423L)) {
                return true;
            }
        }
        return false;
    }
}
