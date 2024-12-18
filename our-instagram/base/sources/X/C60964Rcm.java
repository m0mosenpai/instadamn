package X;

/* renamed from: X.Rcm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60964Rcm extends AbstractC53634Nnf {
    public final AbstractC64290T7z A00 = C60739RPd.A00();

    @Override // X.AbstractC53634Nnf
    public final Integer A00(String str) {
        C14360o3.A0B(str, 0);
        int A0A = AbstractC58322PtE.A0A(AbstractC64290T7z.A03(this.A00, str));
        if (A0A != 7 && A0A != 8) {
            return C05F.A01;
        }
        return C05F.A00;
    }

    @Override // X.AbstractC53634Nnf
    public final String A01(String str) {
        C14360o3.A0B(str, 0);
        String A03 = AbstractC64290T7z.A03(this.A00, str);
        if (AbstractC58322PtE.A0A(A03) > 8) {
            return AbstractC25227BEk.A0w(A03, 0, 8);
        }
        return A03;
    }
}
