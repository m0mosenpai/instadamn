package X;

/* renamed from: X.TOy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64667TOy implements Runnable {
    public final /* synthetic */ Q0S A00;
    public final /* synthetic */ AbstractC115105If A01;

    public RunnableC64667TOy(Q0S q0s, AbstractC115105If abstractC115105If) {
        this.A00 = q0s;
        this.A01 = abstractC115105If;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object A00 = this.A01.A00();
            C14360o3.A0A(A00);
            Q0S.A00((Q0U) A00);
        } catch (Exception unused) {
        }
        Throwable A01 = this.A01.A01();
        if (A01 == null) {
            A01 = AbstractC31175DnJ.A0V("Network failure for ", this.A00.A01);
        }
        this.A00.A00.A01(new Q07(), A01);
    }
}
