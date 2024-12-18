package X;

/* renamed from: X.Aue, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24583Aue implements Runnable {
    public final /* synthetic */ C215059fh A00;
    public final /* synthetic */ AbstractC115105If A01;

    public RunnableC24583Aue(C215059fh c215059fh, AbstractC115105If abstractC115105If) {
        this.A01 = abstractC115105If;
        this.A00 = c215059fh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC115105If abstractC115105If = this.A01;
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            ((AbstractC192798gL) this.A00).A00.A02(new C115095Ie(A01));
        }
        AbstractC193008gg abstractC193008gg = (AbstractC193008gg) abstractC115105If.A00();
        if (abstractC193008gg != null) {
            ((AbstractC192798gL) this.A00).A00.A00(abstractC193008gg);
        }
    }
}
