package X;

/* renamed from: X.Axl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24763Axl implements Runnable {
    public final /* synthetic */ C5GJ A00;
    public final /* synthetic */ C207549Gh A01;
    public final /* synthetic */ String A02;

    public RunnableC24763Axl(C5GJ c5gj, C207549Gh c207549Gh, String str) {
        this.A01 = c207549Gh;
        this.A02 = str;
        this.A00 = c5gj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C81Y c81y = this.A01.A06;
        if (c81y != null) {
            String str = this.A02;
            c81y.A00.A1v.A01(this.A00, str);
        }
    }
}
