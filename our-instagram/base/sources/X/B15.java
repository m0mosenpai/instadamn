package X;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B15 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C218269ky A01;

    public B15(C218269ky c218269ky, int i) {
        this.A01 = c218269ky;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ((C8J9) this.A01).A01.A08(this.A00);
        return AbstractC166997dE.A0b();
    }
}
