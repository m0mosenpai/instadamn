package X;

import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.BlN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26378BlN extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC31137Dmc A02;

    public C26378BlN(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31137Dmc interfaceC31137Dmc) {
        C14360o3.A0B(interfaceC31137Dmc, 3);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = interfaceC31137Dmc;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        Integer num = C05F.A01;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, "android.widget.Button", A1Z ? 1 : 0));
        long A0B = AbstractC25229BEm.A0B();
        C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25232BEp.A16(AbstractC25233BEq.A0R(C9CU.A00(A0h, C05F.A0A, A1Z ? 1 : 0, A0B), AbstractC25227BEk.A0Y(A1Z ? 1 : 0, A0B), A1Z ? 1 : 0, AbstractC25230BEn.A0K()), C05F.A00, AbstractC77623dm.A0E(c76223bS, R.drawable.clips_viewer_pill_background)), C05F.A0Y, DRV.A00(this, 37), null);
        int A04 = AbstractC25236BEt.A04(c76223bS);
        String A0F = AbstractC77623dm.A0F(c76223bS, 2131969827);
        long A0r = AbstractC25232BEp.A0r(14.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c76223bS.A05, null, A0F, A1Z ? 1 : 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A04, A0r);
        A0a.A0S(A1Z ? 1 : 0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D);
        AbstractC25234BEr.A1G(A0a, num, A1Z);
        A0a.A0E();
        AbstractC25233BEq.A1D(A0e, A0a, A1Z);
        return A0a.A0A();
    }
}
