package X;

/* renamed from: X.PSo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57049PSo implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C55210OeT A02;

    public RunnableC57049PSo(C55210OeT c55210OeT, int i, int i2) {
        this.A02 = c55210OeT;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55210OeT.A06(this.A02, this.A00, this.A01, false);
    }
}
