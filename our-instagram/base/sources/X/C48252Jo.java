package X;

/* renamed from: X.2Jo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48252Jo implements C1Df {
    public C1Df A00;
    public boolean A01;

    @Override // X.C1Df
    public final synchronized void cancel() {
        this.A01 = true;
        C1Df c1Df = this.A00;
        if (c1Df != null) {
            c1Df.cancel();
        }
    }
}
