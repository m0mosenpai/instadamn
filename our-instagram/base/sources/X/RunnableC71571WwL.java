package X;

/* renamed from: X.WwL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71571WwL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ HandlerC25861Nt A01;
    public final /* synthetic */ Runnable A02;

    public RunnableC71571WwL(HandlerC25861Nt handlerC25861Nt, Runnable runnable, int i) {
        this.A01 = handlerC25861Nt;
        this.A00 = i;
        this.A02 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HandlerC25861Nt.A00(this.A01, this.A02, this.A00);
    }
}
