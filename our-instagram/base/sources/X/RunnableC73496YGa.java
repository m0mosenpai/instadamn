package X;

/* renamed from: X.YGa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73496YGa implements Runnable {
    public final /* synthetic */ YFW A00;

    public RunnableC73496YGa(YFW yfw) {
        this.A00 = yfw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3GT c3gt;
        YFW yfw = this.A00;
        if (!yfw.A02 && (c3gt = yfw.A01) != null) {
            yfw.A02 = true;
            yfw.A04.A04.remove(c3gt);
        }
    }
}
