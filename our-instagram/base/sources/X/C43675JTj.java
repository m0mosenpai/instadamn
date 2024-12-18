package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JTj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43675JTj implements InterfaceC48212Jk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C43672JTg A01;

    public C43675JTj(UserSession userSession, C43672JTg c43672JTg) {
        this.A01 = c43672JTg;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C43672JTg c43672JTg = this.A01;
        UserSession userSession = this.A00;
        C14360o3.A0A(th);
        c43672JTg.A01(userSession, th);
    }
}
