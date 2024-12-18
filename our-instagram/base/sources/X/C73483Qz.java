package X;

import java.util.concurrent.Callable;

/* renamed from: X.3Qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73483Qz extends AbstractRunnableC25421Lw {
    public final Callable A00;
    public final /* synthetic */ RunnableFutureC73443Qv A01;

    public C73483Qz(final RunnableFutureC73443Qv this$0, Callable callable) {
        this.A01 = this$0;
        callable.getClass();
        this.A00 = callable;
    }

    @Override // X.AbstractRunnableC25421Lw
    public final Object A01() {
        return this.A00.call();
    }

    @Override // X.AbstractRunnableC25421Lw
    public final String A02() {
        return this.A00.toString();
    }

    @Override // X.AbstractRunnableC25421Lw
    public final void A04(Object result) {
        this.A01.set(result);
    }

    @Override // X.AbstractRunnableC25421Lw
    public final void A05(Throwable error) {
        this.A01.setException(error);
    }

    @Override // X.AbstractRunnableC25421Lw
    public final boolean A06() {
        return this.A01.isDone();
    }
}
