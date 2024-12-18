package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3e5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3e5 extends AbstractC51572Yf {
    public final C9BR A00;
    public final UserSession A01;
    public final C77793e4 A02;
    public final C75113Zb A03;
    public final User A04;
    public final InterfaceC60442pS A05;
    public final C77143d0 A06;

    public C3e5(C9BR c9br, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C77143d0 c77143d0, C77793e4 c77793e4, C75113Zb c75113Zb, User user) {
        C14360o3.A0B(c9br, 3);
        C14360o3.A0B(c77793e4, 5);
        C14360o3.A0B(user, 7);
        this.A01 = userSession;
        this.A05 = interfaceC60442pS;
        this.A00 = c9br;
        this.A03 = c75113Zb;
        this.A02 = c77793e4;
        this.A06 = c77143d0;
        this.A04 = user;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        AbstractC65492xl.A00(this.A01);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv = new C51722Yv(new C51722Yv(null, new C9CV(C05F.A0N, AbstractC77623dm.A0F(c76223bS, 2131962492), 0)), new C9CV(C05F.A0D, Integer.valueOf(R.id.media_option_button), 4));
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.account_discovery_bottom_gap);
        C51722Yv c51722Yv2 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv, new C9CU(C05F.A04, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_edit_text_inset_top_material))), new C9CU(C05F.A05, 0, A0D)), new C77863eE(C05F.A00, new C207179Ew(24, c76223bS, this), "MediaHeaderMoreButtonComponent")), new C9CV(C05F.A1F, new C206849Dp(this, 36), 4));
        Drawable A0E = AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_more_vertical_pano_outline_24);
        C77143d0 c77143d0 = this.A06;
        return new C78133ef(A0E, ImageView.ScaleType.FIT_CENTER, null, c51722Yv2, c77143d0.A03, c77143d0.A02);
    }
}
