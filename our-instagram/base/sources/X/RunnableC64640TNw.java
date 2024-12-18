package X;

import java.io.File;

/* renamed from: X.TNw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64640TNw implements Runnable {
    public final /* synthetic */ SW0 A00;
    public final /* synthetic */ String A01;

    public RunnableC64640TNw(SW0 sw0, String str) {
        this.A00 = sw0;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            File A00 = SW0.A00(this.A00, this.A01);
            if (A00 != null) {
                A00.delete();
            }
        } catch (Exception e) {
            C0K8.A0C("AppLogPersistenceProxyBase", AnonymousClass001.A0i("Error deleting ", "callSummaryInfo", e.getMessage(), '\n'));
        }
    }
}
