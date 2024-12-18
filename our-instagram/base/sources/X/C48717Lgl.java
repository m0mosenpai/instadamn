package X;

import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.Lgl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48717Lgl implements InterfaceC50460MPo {
    @Override // X.InterfaceC50460MPo
    public final Object AWu(LF7 lf7) {
        String A02;
        C14360o3.A0B(lf7, 0);
        L3Z l3z = (L3Z) lf7.A03.getValue();
        Number A0t = AbstractC43592JPx.A0t(lf7.A04);
        if (A0t == null) {
            return null;
        }
        long longValue = A0t.longValue();
        if (l3z != null) {
            A02 = l3z.A03;
            if (A02 == null) {
                A02 = "";
            }
        } else {
            A02 = LHB.A02(AbstractC25225BEi.A15(lf7.A02), null, longValue);
            C14360o3.A0A(A02);
        }
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(A02, AbstractC167017dG.A0K(AbstractC43592JPx.A0t(lf7.A0C)), AbstractC25227BEk.A06(AbstractC43592JPx.A0t(lf7.A0B), 0));
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0H = simpleImageUrl;
        String str = c148286ly.A0a;
        C14360o3.A07(str);
        c148286ly.A0S = c148286ly.A0a;
        return new C148276lx(null, str, AbstractC166987dD.A1J(c148286ly));
    }

    @Override // X.InterfaceC50460MPo
    public final C2EY Baf(LF7 lf7) {
        return C2EY.A1d;
    }
}
