package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6VB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VB extends AbstractRunnableC25421Lw {
    public final C6VA A00;
    public final /* synthetic */ RunnableFutureC73443Qv A01;

    public C6VB(final C6VA this$0, RunnableFutureC73443Qv callable) {
        this.A01 = callable;
        this.A00 = this$0;
    }

    @Override // X.AbstractRunnableC25421Lw
    public final /* bridge */ /* synthetic */ Object A01() {
        C6VA c6va = this.A00;
        ListenableFuture AFL = c6va.AFL();
        C18C.A08(AFL, c6va, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return AFL;
    }

    @Override // X.AbstractRunnableC25421Lw
    public final String A02() {
        return this.A00.toString();
    }

    @Override // X.AbstractRunnableC25421Lw
    public final /* bridge */ /* synthetic */ void A04(Object result) {
        this.A01.A0A((ListenableFuture) result);
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
