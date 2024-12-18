package X;

/* loaded from: classes8.dex */
public final class JSV implements Runnable {
    public final /* synthetic */ JSU A00;
    public final /* synthetic */ C43951Jc0 A01;
    public final /* synthetic */ Object A02;

    public JSV(JSU jsu, C43951Jc0 c43951Jc0, Object obj) {
        this.A00 = jsu;
        this.A01 = c43951Jc0;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.A00.A00) {
            C43952Jc1 c43952Jc1 = this.A01.A04;
            Object obj = this.A02;
            C14360o3.A0B(obj, 0);
            c43952Jc1.A00.A0A.accept(obj);
        }
    }
}
