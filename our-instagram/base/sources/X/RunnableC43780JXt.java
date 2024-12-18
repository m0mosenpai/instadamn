package X;

/* renamed from: X.JXt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43780JXt implements Runnable {
    public final /* synthetic */ JR2 A00;

    public RunnableC43780JXt(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4FT c4ft;
        C43766JXf c43766JXf = (C43766JXf) this.A00.A2P.getValue();
        if (c43766JXf != null && (c4ft = c43766JXf.A03) != null) {
            c4ft.A00();
        }
    }
}
