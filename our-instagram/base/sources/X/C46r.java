package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.46r, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C46r implements C12V {
    public static final C46s A02 = new Object();
    public final AtomicInteger A00 = new AtomicInteger(0);
    public final C12X A01;

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.C12V
    public final InterfaceC212412b getKey() {
        return A02;
    }

    public C46r(C12X c12x) {
        this.A01 = c12x;
    }

    @Override // X.C12V, X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A00(this, interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A01(this, interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W plus(C12W c12w) {
        return AnonymousClass190.A02(this, c12w);
    }
}
