package X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes12.dex */
public final class YFW implements InterfaceC140726Ya {
    public int A00;
    public C3GT A01;
    public boolean A02;
    public final Handler A03;
    public final C1PY A04;

    public /* synthetic */ YFW(C1PY c1py) {
        Handler A0J = AbstractC167007dF.A0J();
        this.A04 = c1py;
        this.A00 = 0;
        this.A02 = false;
        this.A01 = null;
        this.A03 = A0J;
    }

    @Override // X.InterfaceC140726Ya
    public final void DEd() {
        RunnableC73496YGa runnableC73496YGa = new RunnableC73496YGa(this);
        if (!C14360o3.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            this.A03.post(runnableC73496YGa);
        } else {
            runnableC73496YGa.run();
        }
    }

    @Override // X.InterfaceC140726Ya
    public final void DqZ(int i) {
        RunnableC73519YHj runnableC73519YHj = new RunnableC73519YHj(this, i);
        if (!C14360o3.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            this.A03.post(runnableC73519YHj);
        } else {
            runnableC73519YHj.run();
        }
    }
}
