package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: classes9.dex */
public final class NM3 extends AbstractC62502sp {
    public final /* synthetic */ SettableFuture A00;

    public NM3(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    @Override // X.AbstractC62502sp
    public final void A00(AnonymousClass436 anonymousClass436) {
        C4OZ c4oz = (C4OZ) anonymousClass436;
        this.A00.set(new AnonymousClass435(c4oz.A00, c4oz.A01));
    }

    @Override // X.AbstractC62502sp
    public final void A02(Throwable th) {
        this.A00.setException(th);
    }
}
