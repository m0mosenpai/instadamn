package X;

/* renamed from: X.XOu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72123XOu {
    public C72126XOy A00;
    public C56I A01 = new Object();
    public Object A02;
    public boolean A03;

    public final void A00(Object obj) {
        this.A03 = true;
        C72126XOy c72126XOy = this.A00;
        if (c72126XOy != null && c72126XOy.A00.A06(obj)) {
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
        }
    }

    public final void A01(Throwable th) {
        this.A03 = true;
        C72126XOy c72126XOy = this.A00;
        if (c72126XOy != null && c72126XOy.A00.A07(th)) {
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
        }
    }

    public final void finalize() {
        C56I c56i;
        C72126XOy c72126XOy = this.A00;
        if (c72126XOy != null && !c72126XOy.isDone()) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            A1C.append(this.A02);
            c72126XOy.A00.A07(new Throwable(A1C.toString()));
        }
        if (!this.A03 && (c56i = this.A01) != null) {
            c56i.A06(null);
        }
    }
}
