package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.5zv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC133285zv {
    public static final ListenableFuture A00(AnonymousClass663 anonymousClass663) {
        C14360o3.A0B(anonymousClass663, 0);
        return new C133295zw(anonymousClass663);
    }

    public static final Object A01(AnonymousClass663 anonymousClass663, InterfaceC23621Ds interfaceC23621Ds) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        if (anonymousClass663.isCancelled()) {
            c24891Jo.AGJ(null);
        } else {
            anonymousClass663.addResultCallback(new C48165LTp(c24891Jo));
        }
        return c24891Jo.A0E();
    }
}
