package X;

/* renamed from: X.0TA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TA extends Thread {
    public final /* synthetic */ C18120uw A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TA(C18120uw c18120uw) {
        super("AddObjRefPhantomThread");
        this.A00 = c18120uw;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.A00.A04.startProcessor();
    }
}
