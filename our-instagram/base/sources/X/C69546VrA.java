package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.VrA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69546VrA {
    public final X9S A00;
    public final ExecutorService A01;

    public final C70478WYj A00(C66287U7i c66287U7i) {
        C70478WYj c70478WYj = new C70478WYj(c66287U7i);
        this.A01.execute(new RunnableC71641Wxn(c70478WYj, this, c66287U7i));
        return c70478WYj;
    }

    public C69546VrA(X9S x9s, ExecutorService executorService) {
        this.A01 = executorService;
        this.A00 = x9s;
    }
}
