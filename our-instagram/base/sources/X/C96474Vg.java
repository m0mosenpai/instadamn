package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.4Vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C96474Vg extends C03E implements InterfaceC16620sF {
    public static final C96474Vg A00 = new C96474Vg();

    public C96474Vg() {
        super(2, AbstractC24761It.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        C1Iu c1Iu = (C1Iu) obj2;
        int i = AbstractC24761It.A01;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C13C.A01;
        C24721Ip c24721Ip = c1Iu.A00;
        C14360o3.A0A(c24721Ip);
        return new C1Iu(c24721Ip, c1Iu, 0, longValue);
    }
}
