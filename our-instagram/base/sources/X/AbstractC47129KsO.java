package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: X.KsO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47129KsO {
    public static final Object A00(ListenableFuture listenableFuture, InterfaceC23621Ds interfaceC23621Ds) {
        try {
            if (listenableFuture.isDone()) {
                return AbstractC53362cK.A00(listenableFuture);
            }
            C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
            listenableFuture.addListener(new RunnableC49976M4r(listenableFuture, A0s), C1M8.A01);
            A0s.CPA(new DHH(listenableFuture, 7));
            return A0s.A0E();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C14360o3.A0A(cause);
            throw cause;
        }
    }
}
