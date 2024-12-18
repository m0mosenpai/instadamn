package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.1MJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MJ implements Runnable {
    public final AbstractC25011Ke A00;
    public final ListenableFuture A01;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC25011Ke abstractC25011Ke = this.A00;
        boolean z = AbstractC25011Ke.A02;
        if (abstractC25011Ke.value == this) {
            if (AbstractC25011Ke.A00.A06(abstractC25011Ke, this, AbstractC25011Ke.A00(this.A01))) {
                AbstractC25011Ke.A04(abstractC25011Ke, false);
            }
        }
    }

    public C1MJ(AbstractC25011Ke owner, ListenableFuture future) {
        this.A00 = owner;
        this.A01 = future;
    }
}
