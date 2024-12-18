package X;

import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;

/* renamed from: X.Pie, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57689Pie extends C0YY implements InterfaceC16660sJ {
    public static final C57689Pie A00 = new C57689Pie();

    public C57689Pie() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C51759Mti c51759Mti = (C51759Mti) obj;
        C14360o3.A0B(c51759Mti, 0);
        ((IGRTCSignalingCoordinator) c51759Mti.A01).cacheIncomingMessageUntilFirstSend();
        return C0eB.A00;
    }
}
