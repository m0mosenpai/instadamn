package X;

/* renamed from: X.Rcn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60965Rcn extends AbstractC53634Nnf {
    public final AbstractC64290T7z A00 = C60739RPd.A00();

    @Override // X.AbstractC53634Nnf
    public final Integer A00(String str) {
        C14360o3.A0B(str, 0);
        int A0A = AbstractC58322PtE.A0A(AbstractC64290T7z.A03(this.A00, str));
        if (A0A >= 2 && A0A <= 10) {
            return C05F.A00;
        }
        return C05F.A01;
    }

    @Override // X.AbstractC53634Nnf
    public final String A01(String str) {
        C14360o3.A0B(str, 0);
        String A03 = AbstractC64290T7z.A03(this.A00, str);
        if (AbstractC58322PtE.A0A(A03) > 10) {
            return AbstractC25227BEk.A0w(A03, 0, 10);
        }
        return A03;
    }
}
