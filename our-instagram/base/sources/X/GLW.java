package X;

/* loaded from: classes6.dex */
public final class GLW implements Runnable {
    public final /* synthetic */ C31440Drk A00;

    public GLW(C31440Drk c31440Drk) {
        this.A00 = c31440Drk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.notifyDataSetChanged();
    }
}
