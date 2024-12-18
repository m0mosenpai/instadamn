package X;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85453ra extends AbstractC51572Yf {
    public final C85233rE A00;
    public final InterfaceC16660sJ A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final boolean A04;

    public C85453ra(UserSession userSession, C85233rE c85233rE, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A00 = c85233rE;
        this.A04 = z;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        C14360o3.A0B(c76223bS, 0);
        Float valueOf = Float.valueOf(1.0f);
        C2XI A00 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A002 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A003 = AbstractC80383iT.A00(c76223bS, valueOf);
        AbstractC77313dH.A00(c76223bS, new C9FA(40, this, AbstractC77183d4.A00(c76223bS, new C9FY(14, A002, this, A00, A003), new Object[0])), new Object[]{new Object()});
        int A01 = c76223bS.BoZ().A01(R.attr.glyphColorPrimary);
        Integer valueOf2 = Integer.valueOf(c76223bS.BoZ().A01(R.attr.feedLikeActiveColor));
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv = new C51722Yv(new C51722Yv(null, new C9CV(A00, C05F.A1F)), new C9CV(A002, C05F.A1I));
        C85233rE c85233rE = this.A00;
        boolean z = c85233rE.A0G;
        C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CV(C05F.A06, Boolean.valueOf(z), 4));
        Integer num = C05F.A00;
        C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(c51722Yv2, new C9CV(A003, num)), new C9CV(num, EnumC77683ds.STRETCH, 3));
        int i = 2131965099;
        if (z) {
            i = 2131965112;
        }
        C51722Yv c51722Yv4 = new C51722Yv(c51722Yv3, new C9CV(C05F.A0N, AbstractC77623dm.A0F(c76223bS, i), 0));
        InterfaceC16620sF interfaceC16620sF = c85233rE.A05.A0D;
        Context context = c76223bS.A05.A0C;
        C14360o3.A07(context);
        C85463rb c85463rb = new C85463rb(ImageView.ScaleType.CENTER, AbstractC77823e9.A00(EnumC71343Hv.A0L, new C51722Yv(new C51722Yv(c51722Yv4, new C9CV(num, interfaceC16620sF.invoke(context, c85233rE.A06), 4)), new C9CV(C05F.A0B, Integer.valueOf(R.id.row_feed_button_like), 4)), this.A02, c85233rE.A07, this.A03, null, false, false), valueOf2, R.drawable.ufi_heart_icon, A01);
        if (c85233rE.A0R) {
            str = c85233rE.A0C;
        } else {
            str = null;
        }
        return new C85473rc(c85463rb, c75933ay, Integer.valueOf(R.dimen.account_discovery_bottom_gap), str, new C206849Dp(this, 1), null, null, new C206849Dp(this, 2), R.dimen.abc_action_bar_elevation_material, this.A04);
    }
}
