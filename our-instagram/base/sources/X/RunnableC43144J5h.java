package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.J5h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43144J5h implements Runnable {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C42592ItB A01;
    public final /* synthetic */ C75113Zb A02;
    public final /* synthetic */ C3AO A03;

    public RunnableC43144J5h(C38321qM c38321qM, C42592ItB c42592ItB, C75113Zb c75113Zb, C3AO c3ao) {
        this.A02 = c75113Zb;
        this.A03 = c3ao;
        this.A00 = c38321qM;
        this.A01 = c42592ItB;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession;
        EnumC75193Zm enumC75193Zm;
        C75113Zb c75113Zb = this.A02;
        AnonymousClass341 anonymousClass341 = c75113Zb.A0o;
        if ((anonymousClass341 == AnonymousClass341.A0A || anonymousClass341 == AnonymousClass341.A0B) && c75113Zb.A0m == EnumC75193Zm.A0J) {
            C3AO c3ao = this.A03;
            C75113Zb BRZ = c3ao.A03.BRZ(this.A00);
            if (!BRZ.A1x) {
                BRZ.A1x = true;
                C75113Zb.A00(BRZ, 6);
            }
            userSession = c3ao.A01;
        } else {
            C3AO c3ao2 = this.A03;
            userSession = c3ao2.A01;
            if (C72213Lu.A00(userSession).A01) {
                enumC75193Zm = EnumC75193Zm.A0H;
            } else {
                enumC75193Zm = EnumC75193Zm.A0G;
            }
            c75113Zb.A0m = enumC75193Zm;
            this.A01.A00(c3ao2.A02, ((InterfaceC60682pr) c3ao2.A00).getScrollingViewProxy());
        }
        C72213Lu.A00(userSession).A01();
    }
}
