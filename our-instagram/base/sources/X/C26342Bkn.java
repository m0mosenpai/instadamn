package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Bkn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26342Bkn extends AbstractC51572Yf {
    public final InterfaceC31053Dkt A00;
    public final BL5 A01;

    public C26342Bkn(InterfaceC31053Dkt interfaceC31053Dkt, BL5 bl5) {
        AbstractC167017dG.A1P(bl5, interfaceC31053Dkt);
        this.A01 = bl5;
        this.A00 = interfaceC31053Dkt;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25233BEq.A0h());
        Drawable drawable = AbstractC77363dM.A00(c76223bS).getDrawable(R.drawable.clips_close_friends_badge_background);
        Integer num = C05F.A00;
        C51722Yv A00 = AbstractC25230BEn.A0e(C9CV.A00(AbstractC25231BEo.A0Y(C9CV.A00(A0h, num, drawable, 4), DRX.A00(this, 32)), C05F.A0D, Integer.valueOf(R.id.clips_close_friends_indicator_component), 4), C05F.A0Y, DRY.A00(this, c76223bS, 29), null).A00(AbstractC25232BEp.A14(null, A1Z ? 1 : 0, AbstractC25230BEn.A0K()));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        Drawable A0N = AbstractC25228BEl.A0N(A12, R.drawable.instagram_star_pano_filled_12);
        C2XE c2xe = A12.A00;
        Context context = c2xe.A0C;
        AbstractC25231BEo.A0y(A0N, A12, AbstractC53242c7.A0E(context));
        C80403iV A0Z = AbstractC25231BEo.A0Z(A0N, c2xe);
        A0Z.A0C();
        A12.A00(A0Z.A0A());
        C51722Yv A002 = C9CU.A00(C9CU.A00(C9CU.A00(null, num, A1Z ? 1 : 0, AbstractC77623dm.A0C(A12)), C05F.A01, A1Z ? 1 : 0, AbstractC77623dm.A0C(A12)), C05F.A0u, A1Z ? 1 : 0, AbstractC77623dm.A0A(A12));
        Drawable A0N2 = AbstractC25228BEl.A0N(A12, R.drawable.instagram_chevron_down_pano_filled_12);
        AbstractC25231BEo.A0y(A0N2, A12, AbstractC53242c7.A0E(context));
        AbstractC25234BEr.A0r(A0N2, c2xe, A12, A002);
        return AbstractC76963ci.A0H(A12, c76223bS, A00);
    }
}
