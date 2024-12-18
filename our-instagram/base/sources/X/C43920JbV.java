package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.JbV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43920JbV implements InterfaceC50484MQm {
    public final UserSession A03;
    public final C42221xC A06;
    public final InterfaceC09390do A05 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50159MDm(this, 16));
    public final C41761wQ A02 = AbstractC31174DnI.A0S();
    public final C42201xA A00 = AbstractC42021ws.A00();
    public final AtomicBoolean A04 = AbstractC166997dE.A17();
    public final C42201xA A01 = AbstractC42021ws.A00();

    @Override // X.InterfaceC50484MQm
    public final C42221xC BcI() {
        return this.A01;
    }

    @Override // X.InterfaceC50484MQm
    public final void start() {
        this.A04.set(true);
        C42221xC c42221xC = this.A06;
        JQn.A00(C43601JQh.A00(c42221xC, JSG.A00, 13).A0G(), this.A02, this, 69);
    }

    @Override // X.InterfaceC50484MQm
    public final void stop() {
        this.A04.set(false);
        this.A02.A01();
    }

    public C43920JbV(C42221xC c42221xC, UserSession userSession) {
        this.A03 = userSession;
        this.A06 = c42221xC;
    }
}
