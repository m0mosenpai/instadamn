package X;

/* loaded from: classes6.dex */
public final class GLU implements Runnable {
    public final /* synthetic */ C2AH A00;

    public GLU(C2AH c2ah) {
        this.A00 = c2ah;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onFinish();
    }
}
