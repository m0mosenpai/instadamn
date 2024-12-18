package X;

/* loaded from: classes10.dex */
public final class TN9 implements Runnable {
    public final /* synthetic */ R7U A00;
    public final /* synthetic */ C62698SMm A01;

    public TN9(R7U r7u, C62698SMm c62698SMm) {
        this.A01 = c62698SMm;
        this.A00 = r7u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00(this.A00.getUrl());
    }
}
