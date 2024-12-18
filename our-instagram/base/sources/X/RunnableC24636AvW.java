package X;

/* renamed from: X.AvW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24636AvW implements Runnable {
    public final /* synthetic */ C207549Gh A00;
    public final /* synthetic */ String A01;

    public RunnableC24636AvW(C207549Gh c207549Gh, String str) {
        this.A00 = c207549Gh;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C183688Ct c183688Ct;
        C81Y c81y = this.A00.A06;
        if (c81y != null && (c183688Ct = c81y.A00.A0d) != null) {
            c183688Ct.A0X = this.A01;
        }
    }
}
