package X;

/* renamed from: X.Aqm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24343Aqm implements Runnable {
    public final /* synthetic */ C8IE A00;

    public RunnableC24343Aqm(C8IE c8ie) {
        this.A00 = c8ie;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8IE c8ie = this.A00;
        c8ie.A08 = true;
        c8ie.A0V.A0i.A01("start_recording_from_volume");
    }
}
