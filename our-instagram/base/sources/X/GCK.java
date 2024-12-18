package X;

/* loaded from: classes6.dex */
public final class GCK implements C5OV {
    public final C55732hE A00;
    public final String A01;
    public final boolean A02;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        boolean z;
        String A00 = this.A00.A00(this.A01);
        if (A00 != null) {
            z = Boolean.parseBoolean(A00);
        } else {
            z = false;
        }
        if (this.A02 != z) {
            return false;
        }
        return true;
    }

    public GCK(C55732hE c55732hE, String str, boolean z) {
        this.A00 = c55732hE;
        this.A02 = z;
        this.A01 = str;
    }
}
