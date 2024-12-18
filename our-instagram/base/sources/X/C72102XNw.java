package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XNw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72102XNw extends AtomicReference implements InterfaceC41801wU {
    public final InterfaceC42071wx A00;

    public C72102XNw(InterfaceC42071wx interfaceC42071wx) {
        this.A00 = interfaceC42071wx;
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        Object andSet = getAndSet(this);
        if (andSet != null && andSet != this) {
            ((C72059XMb) andSet).A00(this);
        }
    }
}
