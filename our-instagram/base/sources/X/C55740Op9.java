package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Op9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55740Op9 implements InterfaceC58103PpS {
    public int A00;
    public long A01;
    public final C1QT A02;
    public final UserSession A03;
    public final String A04;

    @Override // X.InterfaceC58103PpS
    public final void AWC() {
        this.A00 = 0;
        C1QT c1qt = this.A02;
        long flowStartForMarker = c1qt.flowStartForMarker(867378854, "rtc", false);
        this.A01 = flowStartForMarker;
        c1qt.flowAnnotate(flowStartForMarker, "local_call_id", this.A04);
    }

    @Override // X.InterfaceC58103PpS
    public final void AW1() {
        C1QT c1qt = this.A02;
        c1qt.flowAnnotate(this.A01, "local_call_id", this.A04);
        c1qt.flowEndSuccess(this.A01);
        this.A01 = 0L;
        this.A00 = 0;
    }

    @Override // X.InterfaceC58103PpS
    public final void Cnc(String str, String str2) {
        C1QT c1qt = this.A02;
        long j = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        c1qt.flowMarkPoint(j, AnonymousClass001.A0G(str, '_', i), str2);
    }

    public C55740Op9(UserSession userSession, String str) {
        this.A03 = userSession;
        this.A04 = str;
        this.A02 = C1QS.A00(userSession);
    }
}
