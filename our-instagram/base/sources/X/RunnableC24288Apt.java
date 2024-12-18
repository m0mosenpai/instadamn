package X;

/* renamed from: X.Apt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC24288Apt implements Runnable {
    public final /* synthetic */ C459529d A00;

    public /* synthetic */ RunnableC24288Apt(C459529d c459529d) {
        this.A00 = c459529d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C459529d c459529d = this.A00;
        C2BV c2bv = c459529d.A0c;
        if (c2bv != null) {
            c2bv.A00.evictAll();
        }
        c459529d.A07();
        C2VR.A00(C2VR.A05);
    }
}
