package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.Bkm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26341Bkm extends AbstractC51572Yf {
    public final InterfaceC31052Dks A00;
    public final C26246BjF A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = C29903DGr.A00(c76223bS, this, 19);
        EnumC76913cd enumC76913cd = EnumC76913cd.LOCAL;
        C89813zN A002 = AbstractC51432Xq.A00(enumC76913cd, "fan_club_badge");
        AbstractC25226BEj.A1S(A002, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        InterfaceC79483gv interfaceC79483gv = AbstractC79463gt.A03;
        A002.A03(interfaceC79483gv);
        A002.A02(0.0f);
        C89813zN A003 = AbstractC51432Xq.A00(enumC76913cd, "fan_club_text");
        AbstractC25226BEj.A1S(A003, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        A003.A03(interfaceC79483gv);
        A003.A02(0.0f);
        A003.A03(AbstractC79463gt.A00);
        A003.A02(0.0f);
        A003.A03(AbstractC79463gt.A02);
        A003.A02(0.0f);
        AbstractC89903zW.A00(c76223bS, new C51472Xu(A002, A003));
        C75933ay c75933ay = C51722Yv.A02;
        Drawable drawable = AbstractC77363dM.A00(c76223bS).getDrawable(R.drawable.fan_club_badge_background);
        Integer num = C05F.A00;
        C51722Yv A0Y = AbstractC25231BEo.A0Y(AbstractC25230BEn.A0e(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, drawable, 4)), C05F.A0Y, DRY.A00(this, A00, 28), null), DRX.A00(this, 31));
        C2XE c2xe = c76223bS.A05;
        C51722Yv A0W = AbstractC25231BEo.A0W(c2xe, A0Y, enumC76913cd, "fan_club_badge");
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        Drawable A0N = AbstractC25228BEl.A0N(A0P, R.drawable.instagram_crown_pano_filled_12);
        AbstractC25231BEo.A0y(A0N, A0P, R.color.audio_bar_action_color_enabled);
        C2XE c2xe2 = A0P.A00;
        C80403iV A0Z = AbstractC25231BEo.A0Z(A0N, c2xe2);
        A0Z.A0C();
        A0P.A00(A0Z.A0A());
        if (AbstractC25229BEm.A1W(A00)) {
            C51722Yv A0W2 = AbstractC25231BEo.A0W(c2xe2, C9CU.A00(null, C05F.A0u, 0, AbstractC77623dm.A0A(A0P)), enumC76913cd, "fan_club_text");
            Typeface typeface = Typeface.DEFAULT_BOLD;
            String A0F = AbstractC77623dm.A0F(A0P, 2131962091);
            long A0r = AbstractC25232BEp.A0r(12.0f);
            int A0A = AbstractC25230BEn.A0A(c2xe2, A0P);
            long A0D = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, A0F, 0);
            AbstractC25233BEq.A1B(A0P, A0a, A0A, A0r);
            A0a.A0S(0);
            AbstractC25234BEr.A0o(typeface, A0P, A0a, A0D);
            A0a.A0X(num);
            AbstractC25234BEr.A1J(A0a, num, false, true);
            AbstractC77743dy.A00(A0a, A0W2);
            AbstractC25227BEk.A1J(A0P, A0a);
        }
        return AbstractC76963ci.A0I(A0P, c76223bS, A0W);
    }

    public C26341Bkm(InterfaceC31052Dks interfaceC31052Dks, C26246BjF c26246BjF) {
        AbstractC167017dG.A1P(c26246BjF, interfaceC31052Dks);
        this.A01 = c26246BjF;
        this.A00 = interfaceC31052Dks;
    }
}
