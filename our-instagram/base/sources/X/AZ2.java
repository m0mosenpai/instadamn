package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AZ2 implements InterfaceC178367wA {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;

    public AZ2(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC178367wA
    public final QuickPerformanceLogger BjH() {
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        return c006802i;
    }

    @Override // X.InterfaceC178367wA
    public final InterfaceC02550Ad CC6() {
        return AbstractC12220kQ.A01(this.A00, this.A01);
    }
}
