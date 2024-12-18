package X;

/* renamed from: X.TMg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64616TMg implements Runnable {
    public final /* synthetic */ C58569Pxl A00;
    public final /* synthetic */ String A01;

    public RunnableC64616TMg(final C58569Pxl this$0, final String val$workSpecId) {
        this.A00 = this$0;
        this.A01 = val$workSpecId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48412Ki c48412Ki;
        C58569Pxl c58569Pxl = this.A00;
        C2MX c2mx = c58569Pxl.A00.A03;
        String str = this.A01;
        synchronized (c2mx.A09) {
            RunnableC52072a7 runnableC52072a7 = (RunnableC52072a7) c2mx.A05.get(str);
            if (runnableC52072a7 == null && (runnableC52072a7 = (RunnableC52072a7) c2mx.A04.get(str)) == null) {
                c48412Ki = null;
            } else {
                c48412Ki = runnableC52072a7.A08;
            }
        }
        if (c48412Ki != null && (!C14360o3.A0K(C48562Ky.A08, c48412Ki.A0B))) {
            synchronized (c58569Pxl.A06) {
                c58569Pxl.A09.put(C2WN.A00(c48412Ki), c48412Ki);
                c58569Pxl.A08.put(C2WN.A00(c48412Ki), C50U.A00(c58569Pxl, c58569Pxl.A04, c48412Ki, ((C2LB) c58569Pxl.A05).A03));
            }
        }
    }
}
