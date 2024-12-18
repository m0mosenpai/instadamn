package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.AXw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23372AXw implements InterfaceC48192Ji {
    public final /* synthetic */ SettableFuture A00;

    public C23372AXw(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        this.A00.set(anonymousClass436);
    }
}
