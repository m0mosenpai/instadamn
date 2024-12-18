package X;

/* loaded from: classes12.dex */
public final class XP7 implements Runnable {
    public final /* synthetic */ YNm A00;

    public XP7(YNm yNm) {
        this.A00 = yNm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.cancel();
    }
}
