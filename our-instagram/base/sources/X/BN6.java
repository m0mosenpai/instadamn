package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BN6 extends AbstractC51572Yf {
    public final InterfaceC31018DkH A00;
    public final BLG A01;
    public final InterfaceC16820sZ A02;

    public BN6(InterfaceC31018DkH interfaceC31018DkH, BLG blg, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC31018DkH, 2);
        this.A01 = blg;
        this.A00 = interfaceC31018DkH;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        BLG blg = this.A01;
        C75113Zb c75113Zb = blg.A03;
        if (c75113Zb != null) {
            C51762Yz A01 = AbstractC77273dD.A01(c76223bS, c75113Zb, BND.A00, 75, false);
            C51762Yz A012 = AbstractC77273dD.A01(c76223bS, c75113Zb, BNE.A00, 55, false);
            if (AbstractC25229BEm.A1W(A01)) {
                boolean A1W = AbstractC25229BEm.A1W(A012);
                C75933ay c75933ay = C51722Yv.A02;
                Integer num = C05F.A01;
                C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
                Integer num2 = C05F.A00;
                C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25234BEr.A0K(A0d, num2, 0), num2, new DHP(46, this, A1W), null);
                boolean z = c75113Zb.A1p;
                int i = R.color.fds_transparent;
                if (z) {
                    i = R.color.black_60_transparent;
                }
                C51722Yv A00 = C9CV.A00(A0e, C05F.A15, AbstractC25225BEi.A0i(AbstractC25228BEl.A09(c76223bS, i)), 4);
                C2XE c2xe = c76223bS.A05;
                C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
                Integer num3 = blg.A05;
                if (num3 == num2) {
                    A0P.A00(A03(c76223bS, A1W));
                    A0P.A00(AbstractC76963ci.A0M(c76223bS, AbstractC25233BEq.A0Z(null, num, 12.0d, 0)));
                }
                if (blg.A07) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(AbstractC25228BEl.A09(c76223bS, R.color.black_50_transparent));
                    gradientDrawable.setShape(1);
                    C51722Yv A002 = C9CU.A00(C9CV.A00(AbstractC25233BEq.A0W(AbstractC25233BEq.A0U(null, AbstractC25225BEi.A0o(num2, gradientDrawable, 4), num, 0), c76223bS, 2131963916), C05F.A0D, "clips_pause_state_paused_icon_component", 4), C05F.A06, 0, AbstractC25230BEn.A0N());
                    C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
                    long A0J = AbstractC25230BEn.A0J();
                    C51722Yv A003 = C9CU.A00(C9CU.A00(null, num, 0, A0J), num2, 0, A0J);
                    Drawable A0N = AbstractC25228BEl.A0N(A0P2, R.drawable.instagram_play_pano_filled_24);
                    AbstractC25233BEq.A10(A0N, A0P2, R.color.audio_bar_action_color_enabled);
                    AbstractC25228BEl.A1I(A0N, null, A0P2, A003);
                    A0P.A00(AbstractC76963ci.A0H(A0P2, c76223bS, A002));
                }
                if (num3 == num) {
                    A0P.A00(AbstractC76963ci.A0M(c76223bS, AbstractC25233BEq.A0Z(null, num, 12.0d, 0)));
                    A0P.A00(A03(c76223bS, A1W));
                }
                return AbstractC76963ci.A05(A0P, c76223bS, A00);
            }
        }
        return null;
    }

    private final C2WH A03(C76223bS c76223bS, boolean z) {
        Integer num;
        int i;
        int i2;
        int i3;
        BLG blg = this.A01;
        if (!blg.A06) {
            num = C05F.A00;
        } else if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AbstractC25228BEl.A09(c76223bS, R.color.black_50_transparent));
        boolean z2 = blg.A08;
        if (z2) {
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(38.0f);
        } else {
            gradientDrawable.setShape(1);
        }
        BQB bqb = new BQB(29, this, c76223bS, z);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num2 = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num2, gradientDrawable, 4));
        Integer num3 = C05F.A01;
        C51722Yv A00 = C9CV.A00(A0h, num3, "android.widget.Button", 0);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                i = 2131963923;
                break;
            case 1:
                i = 2131963925;
                break;
            default:
                i = 2131963924;
                break;
        }
        C51722Yv A002 = C9CV.A00(AbstractC25233BEq.A0W(A00, c76223bS, i), C05F.A0D, "clips_pause_state_audio_control_button_component", 4);
        long A0L = AbstractC25230BEn.A0L();
        C51722Yv A0Y = AbstractC25231BEo.A0Y(C9CU.A00(A002, C05F.A06, 0, A0L), bqb);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C51722Yv A003 = C9CU.A00(C9CU.A00(null, num3, 0, A0L), num2, 0, A0L);
        switch (intValue) {
            case 0:
                i2 = R.drawable.instagram_volume_none_pano_filled_24;
                break;
            case 1:
                i2 = R.drawable.instagram_volume_pano_filled_24;
                break;
            default:
                i2 = R.drawable.instagram_volume_off_pano_filled_24;
                break;
        }
        Drawable A0N = AbstractC25228BEl.A0N(A12, i2);
        AbstractC25233BEq.A10(A0N, A12, R.color.audio_bar_action_color_enabled);
        AbstractC25228BEl.A1I(A0N, null, A12, A003);
        if (z2) {
            C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25232BEp.A14(null, 0, AbstractC25230BEn.A0K()), num2, DRX.A00(this, 39), null);
            int A04 = AbstractC25228BEl.A04(AbstractC77363dM.A00(A12), A12);
            long A05 = AbstractC77623dm.A05(A12);
            switch (intValue) {
                case 0:
                    i3 = 2131955338;
                    break;
                case 1:
                    i3 = 2131955299;
                    break;
                default:
                    i3 = 2131955298;
                    break;
            }
            String A0F = AbstractC77623dm.A0F(A12, i3);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(A12.A00, null, A0F, 0);
            AbstractC25233BEq.A1B(A12, A0a, A04, A05);
            A0a.A0S(1);
            AbstractC25234BEr.A0o(typeface, A12, A0a, A0D);
            AbstractC25234BEr.A1I(A0a, num2, false);
            A0a.A0M(1);
            AbstractC25233BEq.A1D(A0e, A0a, false);
            AbstractC25227BEk.A1J(A12, A0a);
        }
        return AbstractC76963ci.A0H(A12, c76223bS, A0Y);
    }
}
