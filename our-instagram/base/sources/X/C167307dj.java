package X;

import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.7dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167307dj extends AbstractC51572Yf {
    public final int A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C84793qT c84793qT = (C84793qT) AbstractC77183d4.A00(c76223bS, new C206879Ds(c76223bS, 32), new Object[0]);
        int i = this.A00;
        if (i <= 0) {
            i = 4;
        }
        int min = Math.min(i, 10);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv c51722Yv = new C51722Yv(null, new C9CT(num, 100.0f, 0));
        C2XE c2xe = c76223bS.A05;
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        for (int i2 = 0; i2 < min; i2++) {
            long A0D = AbstractC77623dm.A0D(c2z0, R.dimen.account_discovery_bottom_gap);
            long A0D2 = AbstractC77623dm.A0D(c2z0, R.dimen.activation_card_icon_container_width);
            long A0D3 = AbstractC77623dm.A0D(c2z0, R.dimen.account_discovery_bottom_gap);
            long A0D4 = AbstractC77623dm.A0D(c2z0, R.dimen.add_account_icon_circle_radius);
            Integer num2 = C05F.A07;
            C51722Yv c51722Yv2 = new C51722Yv(null, new C9CU(num2, 0, A0D));
            Integer num3 = C05F.A08;
            C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv2, new C9CU(num3, 0, A0D3)), new C9CU(C05F.A09, 0, A0D2)), new C9CU(C05F.A0A, 0, A0D4)), new C9CT(num, 100.0f, 0)), new C9CT(C05F.A0C, 0.0f, 1));
            C2Z0 c2z02 = new C2Z0(c2z0.ArD(), new ArrayList());
            int A03 = AbstractC77623dm.A03(c2z02, R.color.gradient_dark);
            int A00 = C2Z3.A00(c2z02.BoZ(), AbstractC77623dm.A0D(c2z02, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            C51722Yv c51722Yv4 = new C51722Yv(null, new C9CU(num, 0, AbstractC77623dm.A0D(c2z02, R.dimen.abc_dropdownitem_icon_width)));
            long A0D5 = AbstractC77623dm.A0D(c2z02, R.dimen.abc_dropdownitem_icon_width);
            Integer num4 = C05F.A01;
            c2z02.A00(new C167857ef(new C51722Yv(c51722Yv4, new C9CU(num4, 0, A0D5)), A03, A00));
            C51722Yv c51722Yv5 = new C51722Yv(null, new C9CT(num, 100.0f, 0));
            C2Z0 c2z03 = new C2Z0(c2z02.A00, new ArrayList());
            c2z03.A00(new C167857ef(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CT(num, 40.0f, 0)), new C9CU(num4, 0, AbstractC77623dm.A0D(c2z03, R.dimen.account_discovery_bottom_gap))), new C9CU(num2, 0, AbstractC77623dm.A0D(c2z03, R.dimen.account_discovery_bottom_gap))), AbstractC77623dm.A03(c2z03, R.color.gradient_dark), C2Z3.A00(c2z03.BoZ(), AbstractC77623dm.A0D(c2z03, R.dimen.abc_edit_text_inset_bottom_material))));
            c2z03.A00(new C167857ef(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CT(num, 80.0f, 0)), new C9CU(num4, 0, AbstractC77623dm.A0D(c2z03, R.dimen.account_discovery_bottom_gap))), new C9CU(num2, 0, AbstractC77623dm.A0D(c2z03, R.dimen.account_discovery_bottom_gap))), new C9CU(num3, 0, AbstractC77623dm.A0D(c2z03, R.dimen.abc_button_inset_vertical_material))), AbstractC77623dm.A03(c2z03, R.color.gradient_dark), C2Z3.A00(c2z03.BoZ(), AbstractC77623dm.A0D(c2z03, R.dimen.abc_edit_text_inset_bottom_material))));
            c2z02.A00(AbstractC76963ci.A06(c2z03, c2z02, c51722Yv5, null, null, null, false));
            c2z0.A00(AbstractC76963ci.A0J(c2z02, c2z0, c51722Yv3, null, null, null, null, null, false));
        }
        C2WF A06 = AbstractC76963ci.A06(c2z0, c76223bS, c51722Yv, null, null, null, false);
        C51722Yv c51722Yv6 = new C51722Yv(null, new C9CU(C05F.A08, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_button_padding_horizontal_material)));
        C2Z0 c2z04 = new C2Z0(c2xe, new ArrayList());
        C14360o3.A0A(c84793qT);
        c2z04.A00(new C167877eh(A06, null, c84793qT));
        return AbstractC76963ci.A0J(c2z04, c76223bS, c51722Yv6, null, null, null, null, null, false);
    }

    public C167307dj(int i) {
        this.A00 = i;
    }

    public C167307dj() {
        this(0);
    }
}
