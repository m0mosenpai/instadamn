package X;

/* renamed from: X.TOq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64659TOq implements Runnable {
    public final /* synthetic */ SMK A00;
    public final /* synthetic */ BinderC58704Q2h A01;

    public RunnableC64659TOq(SMK smk, BinderC58704Q2h binderC58704Q2h) {
        this.A01 = binderC58704Q2h;
        this.A00 = smk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.util.Log.isLoggable("EnhancedIntentService", 3);
        AbstractServiceC58445PvQ abstractServiceC58445PvQ = this.A01.A00;
        SMK smk = this.A00;
        abstractServiceC58445PvQ.A01(smk.A01);
        smk.A00();
    }
}
