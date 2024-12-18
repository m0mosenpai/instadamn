package X;

/* renamed from: X.TNn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64631TNn implements Runnable {
    public final /* synthetic */ T08 A00;
    public final /* synthetic */ boolean A01;

    public RunnableC64631TNn(T08 t08, boolean z) {
        this.A00 = t08;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        T08 t08 = this.A00;
        Object obj = t08.A0A;
        boolean z2 = this.A01;
        synchronized (obj) {
            if (z2) {
                if (!t08.A02) {
                    t08.A08.A02(t08.A06, EnumC61159RgK.A04);
                    z = true;
                    t08.A02 = z;
                }
            } else if (t08.A02) {
                t08.A08.A03(t08.A06, EnumC61159RgK.A04);
                z = false;
                t08.A02 = z;
            }
        }
    }
}
