package X;

/* renamed from: X.Ncy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53026Ncy extends PJX {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C53026Ncy(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        if (this.A00 == 0) {
            C55121Obi.A02((C55121Obi) this.A01, this.A02, null);
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpY(String str, String str2, String str3) {
        if (this.A00 == 0) {
            C55121Obi.A02((C55121Obi) this.A01, this.A02, str);
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        if (this.A00 != 0) {
            ((NTH) this.A01).A05.A05(new PDC(this.A02));
        } else {
            C55121Obi.A02((C55121Obi) this.A01, this.A02, str);
        }
    }

    @Override // X.PJX, X.MRA
    public final void Czw(boolean z) {
    }
}
