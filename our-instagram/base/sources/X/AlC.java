package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class AlC implements C5NL {
    public static final EnumC209229Ne A03;
    public static final int[] A04;
    public URL A00;
    public final EnumC209229Ne A01;
    public final boolean A02;

    public AlC(URL url, EnumC209229Ne enumC209229Ne) {
        C14360o3.A0B(enumC209229Ne, 2);
        this.A00 = url;
        this.A01 = enumC209229Ne;
        this.A02 = AbstractC167007dF.A1W(url.A00);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof AlC)) {
                return false;
            }
            AlC alC = (AlC) obj;
            if (!C14360o3.A0K(this.A00, alC.A00) || this.A01 != alC.A01) {
                return false;
            }
        }
        return true;
    }

    static {
        Object A0k = AbstractC166997dE.A0k(A4H.A00);
        C14360o3.A07(A0k);
        EnumC209229Ne enumC209229Ne = (EnumC209229Ne) A0k;
        A03 = enumC209229Ne;
        A04 = AbstractC209259Nh.A02(enumC209229Ne);
    }

    public final long A00() {
        Long l = this.A00.A04;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A1F;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        AbstractC166987dD.A1V(C148276lx.A0f, A0V);
        return A0V;
    }
}
