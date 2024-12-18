package X;

import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class B90 extends C0YY implements InterfaceC16660sJ {
    public static final B90 A00 = new B90();

    public B90() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Future future = (Future) obj;
        C14360o3.A0B(future, 0);
        Object obj2 = future.get();
        C14360o3.A07(obj2);
        return obj2;
    }
}
