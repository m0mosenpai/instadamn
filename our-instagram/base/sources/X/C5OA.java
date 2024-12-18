package X;

/* renamed from: X.5OA, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5OA implements Runnable {
    public final /* synthetic */ C4PX A00;
    public final /* synthetic */ C5O9 A01;

    public /* synthetic */ C5OA(C4PX c4px, C5O9 c5o9) {
        this.A01 = c5o9;
        this.A00 = c4px;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5O9 c5o9 = this.A01;
        c5o9.A02.accept(this.A00);
    }
}
