package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.BlR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26382BlR extends AbstractC51572Yf {
    public final C26242BjB A00;
    public final InterfaceC31014DkD A01;
    public final C51722Yv A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Integer num;
        int i;
        int i2;
        C14360o3.A0B(c76223bS, 0);
        C26242BjB c26242BjB = this.A00;
        C51762Yz A01 = AbstractC77273dD.A01(c76223bS, (C75113Zb) c26242BjB.A02, DRX.A00(this, 23), 55, false);
        boolean z = c26242BjB.A03;
        boolean A1W = AbstractC25229BEm.A1W(A01);
        if (!z) {
            num = C05F.A00;
        } else if (A1W) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        long A07 = AbstractC77623dm.A07(c76223bS);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(null, C05F.A00, 0, A07);
        Integer num2 = C05F.A01;
        C51722Yv A002 = C9CU.A00(A00, num2, 0, A07);
        Integer num3 = C05F.A0C;
        C51722Yv A003 = C9CV.A00(AbstractC25230BEn.A0d(A002, num3, 0.0f, 1), num2, "android.widget.Button", 0);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                i = R.drawable.instagram_volume_none_pano_filled_24;
                break;
            case 1:
                i = R.drawable.instagram_volume_pano_filled_24;
                break;
            default:
                i = R.drawable.instagram_volume_off_pano_filled_24;
                break;
        }
        Drawable A0N = AbstractC25228BEl.A0N(c76223bS, i);
        AbstractC25233BEq.A10(A0N, c76223bS, R.color.audio_bar_action_color_enabled);
        BNU bnu = new BNU(A0N, null, A003, false);
        C51722Yv c51722Yv = this.A02;
        C9CV A0o = AbstractC25225BEi.A0o(num2, true, 4);
        if (c51722Yv == c75933ay) {
            c51722Yv = null;
        }
        C51722Yv A0Y = AbstractC25231BEo.A0Y(AbstractC25233BEq.A0T(c51722Yv, A0o, num3, 0.0f, 1), DRY.A00(this, c76223bS, 26));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C51722Yv A004 = BPH.A00(A12);
        C9CV A0o2 = AbstractC25225BEi.A0o(C05F.A0D, "clips_attribution_audio_control_component", 4);
        if (A004 == c75933ay) {
            A004 = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(A004, A0o2);
        switch (intValue) {
            case 0:
                i2 = 2131963923;
                break;
            case 1:
                i2 = 2131963925;
                break;
            default:
                i2 = 2131963924;
                break;
        }
        return AbstractC25227BEk.A0W(AbstractC76963ci.A0H(AbstractC25232BEp.A11(bnu, A12.A00), A12, AbstractC25230BEn.A0e(AbstractC25233BEq.A0V(A0h, AbstractC25231BEo.A0b(A12, i2, 0), num2, "android.widget.Button", 0), C05F.A0Y, DRY.A00(this, A12, 27), null)), A12, c76223bS, A0Y);
    }

    public C26382BlR(C26242BjB c26242BjB, C51722Yv c51722Yv, InterfaceC31014DkD interfaceC31014DkD) {
        AbstractC167017dG.A1P(c26242BjB, interfaceC31014DkD);
        this.A00 = c26242BjB;
        this.A01 = interfaceC31014DkD;
        this.A02 = c51722Yv;
    }
}
