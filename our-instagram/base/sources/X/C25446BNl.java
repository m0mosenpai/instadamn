package X;

import android.graphics.Typeface;
import com.facebook.R;
import java.util.Arrays;

/* renamed from: X.BNl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25446BNl extends AbstractC51572Yf {
    public final InterfaceC31045Dkj A00;
    public final BL4 A01;

    public C25446BNl(InterfaceC31045Dkj interfaceC31045Dkj, BL4 bl4) {
        C14360o3.A0B(bl4, 1);
        this.A01 = bl4;
        this.A00 = interfaceC31045Dkj;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        C51722Yv A0R = AbstractC25233BEq.A0R(null, AbstractC25225BEi.A0n(C05F.A04, A1Z ? 1 : 0, AbstractC25229BEm.A0J()), A1Z ? 1 : 0, AbstractC25229BEm.A0G());
        C2XE c2xe = c76223bS.A05;
        C14360o3.A0B(c2xe, A1Z ? 1 : 0);
        C2WK c2wk = new C2WK();
        C2XH c2xh = c2xe.A0D;
        EnumC77763e0 enumC77763e0 = EnumC77763e0.ALL;
        int A0H = AbstractC53242c7.A0H(c2xe.A0C, R.attr.igds_color_secondary_text_on_media);
        if (c2xh != null) {
            c2wk.A00(enumC77763e0, c2xh.A02(A0H));
            c2wk.A01(enumC77763e0, c2xh.A03(R.dimen.account_recs_header_image_margin));
            Arrays.fill(c2wk.A00, A1Z ? 1 : 0, 4, c2xh.A03(R.dimen.abc_action_bar_elevation_material));
            C51722Yv A0Y = AbstractC25231BEo.A0Y(AbstractC25230BEn.A0e(AbstractC25232BEp.A15(A0R, C05F.A01, c2wk), C05F.A0Y, DRP.A00(this, 19), null), DRP.A00(this, 20));
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            String A0F = AbstractC77623dm.A0F(A0P, 2131974798);
            C2XE c2xe2 = A0P.A00;
            int A0A = AbstractC25230BEn.A0A(c2xe2, A0P);
            long A05 = AbstractC77623dm.A05(A0P);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = AbstractC25229BEm.A0D();
            Integer num = C05F.A00;
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, A0F, A1Z ? 1 : 0);
            AbstractC25233BEq.A1B(A0P, A0a, A0A, A05);
            A0a.A0S(1);
            AbstractC25234BEr.A0o(typeface, A0P, A0a, A0D);
            AbstractC25234BEr.A1G(A0a, num, A1Z);
            A0a.A0E();
            A0a.A0c(true);
            AbstractC25232BEp.A1N(A0a, A1Z);
            AbstractC25227BEk.A1J(A0P, A0a);
            return AbstractC76963ci.A0I(A0P, c76223bS, A0Y);
        }
        throw AbstractC166987dD.A14("This builder has already been disposed / built!");
    }
}
