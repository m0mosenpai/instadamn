package X;

/* renamed from: X.YHj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73519YHj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ YFW A01;

    public RunnableC73519YHj(YFW yfw, int i) {
        this.A01 = yfw;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3GT c3gt;
        YFW yfw = this.A01;
        int i = this.A00;
        int i2 = yfw.A00 + 1;
        yfw.A00 = i2;
        if (i2 >= i && !yfw.A02 && (c3gt = yfw.A01) != null) {
            yfw.A02 = true;
            yfw.A04.A04.remove(c3gt);
        }
    }
}
