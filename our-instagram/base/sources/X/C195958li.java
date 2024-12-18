package X;

import com.facebook.models.VoltronLoadingResult;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.8li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195958li implements InterfaceC195968lj {
    @Override // X.InterfaceC195968lj
    public boolean requireLoad() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    @Override // X.InterfaceC195968lj
    public ListenableFuture loadModule() {
        ?? obj = new Object();
        obj.set(new VoltronLoadingResult(true, true));
        return obj;
    }
}
