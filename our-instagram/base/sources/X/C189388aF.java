package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.8aF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C189388aF extends C03E implements InterfaceC16610sE {
    public static final C189388aF A00 = new C189388aF();

    public C189388aF() {
        super(3, C24721Ip.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        if (obj3 == AbstractC24761It.A04) {
            obj3 = new C89973zd((Throwable) C24721Ip.A05.get(obj));
        }
        return new C2QV(obj3);
    }
}
