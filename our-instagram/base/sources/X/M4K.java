package X;

/* loaded from: classes8.dex */
public final class M4K implements Runnable {
    public final /* synthetic */ C47618L1d A00;
    public final /* synthetic */ String A01;

    public M4K(C47618L1d c47618L1d, String str) {
        this.A00 = c47618L1d;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47618L1d c47618L1d = this.A00;
        java.util.Set set = c47618L1d.A01;
        String str = this.A01;
        if (set.contains(str)) {
            c47618L1d.A00.markerEnd(20128010, str.hashCode(), (short) 113);
            set.remove(str);
        }
    }
}
