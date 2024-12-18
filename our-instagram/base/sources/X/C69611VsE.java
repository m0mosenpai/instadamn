package X;

/* renamed from: X.VsE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69611VsE {
    public int A00;
    public int A01;
    public C69175Vj4 A02;
    public C69175Vj4 A03;
    public final C68868VdO A04 = new Object();

    public final void A00() {
        while (true) {
            C69175Vj4 c69175Vj4 = this.A03;
            if (c69175Vj4 != null) {
                this.A03 = c69175Vj4.A01;
                C68868VdO c68868VdO = this.A04;
                c69175Vj4.A01 = c68868VdO.A00;
                c68868VdO.A00 = c69175Vj4;
            } else {
                this.A02 = null;
                this.A01 = 0;
                this.A00 = 0;
                return;
            }
        }
    }
}
