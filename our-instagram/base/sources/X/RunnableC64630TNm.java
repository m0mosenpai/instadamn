package X;

/* renamed from: X.TNm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64630TNm implements Runnable {
    public final /* synthetic */ C65140TeF A00;
    public final /* synthetic */ String A01;

    public RunnableC64630TNm(C65140TeF c65140TeF, String str) {
        this.A00 = c65140TeF;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01.didReceiveMessage(this.A01);
    }
}
