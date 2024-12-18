package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.2cJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC53352cJ implements Runnable {
    public final AbstractC49192Nt A00;
    public final ListenableFuture A01;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC49192Nt abstractC49192Nt = this.A00;
        if (abstractC49192Nt.value == this) {
            if (AbstractC49192Nt.A00.A04(abstractC49192Nt, this, AbstractC49192Nt.A00(this.A01))) {
                AbstractC49192Nt.A04(abstractC49192Nt);
            }
        }
    }

    public RunnableC53352cJ(AbstractC49192Nt owner, ListenableFuture future) {
        this.A00 = owner;
        this.A01 = future;
    }
}
