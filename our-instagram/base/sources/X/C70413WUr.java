package X;

/* renamed from: X.WUr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70413WUr implements C1VV {
    public final /* synthetic */ C68677VaD A00;
    public final /* synthetic */ VMS A01;

    public C70413WUr(C68677VaD c68677VaD, VMS vms) {
        this.A00 = c68677VaD;
        this.A01 = vms;
    }

    @Override // X.C1VV
    public final void EHn(C3QG c3qg, Throwable th) {
        String str;
        String stackTraceString;
        Object A01 = c3qg.A01();
        if (A01 != null) {
            str = MSY.A0h(A01);
        } else {
            str = "<value is null>";
        }
        Integer valueOf = Integer.valueOf(System.identityHashCode(this));
        Integer valueOf2 = Integer.valueOf(System.identityHashCode(c3qg));
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = android.util.Log.getStackTraceString(th);
        }
        C0I2.A09("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", valueOf, valueOf2, str, stackTraceString);
    }
}
