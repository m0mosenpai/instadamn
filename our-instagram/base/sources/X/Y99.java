package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes12.dex */
public final class Y99 implements YNN {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Y99(YNN ynn, Y6Z y6z, C72862XpO c72862XpO, Executor executor, int i) {
        this.A00 = i;
        this.A01 = y6z;
        this.A03 = c72862XpO;
        this.A02 = ynn;
        this.A04 = executor;
    }

    @Override // X.YNN
    public final /* bridge */ /* synthetic */ Object Eq4(Y6Z y6z) {
        int i = this.A00;
        C72862XpO c72862XpO = (C72862XpO) this.A03;
        Object obj = this.A02;
        if (i != 0) {
            YNN ynn = (YNN) obj;
            Executor executor = (Executor) this.A04;
            ExecutorService executorService = Y6Z.A0C;
            try {
                executor.execute(new RunnableC73528YHy(ynn, y6z, c72862XpO));
                return null;
            } catch (Exception e) {
                c72862XpO.A01(new RuntimeException("An exception was thrown by an Executor", e));
                return null;
            }
        }
        YNN ynn2 = (YNN) obj;
        Executor executor2 = (Executor) this.A04;
        ExecutorService executorService2 = Y6Z.A0C;
        try {
            executor2.execute(new RunnableC73527YHx(ynn2, y6z, c72862XpO));
            return null;
        } catch (Exception e2) {
            c72862XpO.A01(new RuntimeException("An exception was thrown by an Executor", e2));
            return null;
        }
    }
}
