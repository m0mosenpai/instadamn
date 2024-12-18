package X;

import com.facebook.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.7hX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169577hX extends AbstractC51572Yf {
    public final C25814BbV A00;
    public final UserSession A01;
    public final User A02;
    public final String A03;
    public final boolean A04;
    public final InterfaceC60442pS A05;
    public final boolean A06;
    public final boolean A07;

    public C169577hX(C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS, User user, String str, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c25814BbV, 7);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = user;
        this.A07 = z;
        this.A04 = z2;
        this.A05 = interfaceC60442pS;
        this.A00 = c25814BbV;
        this.A06 = z3;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        User user;
        String A0G;
        EnumC77923eK enumC77923eK;
        C77943eM c77943eM;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, new C206879Ds(this, 26));
        InterfaceC16820sZ A002 = AbstractC85303rL.A00(c76223bS, new C9F8(49, A00, this));
        Reel reel = (Reel) A00.A03;
        int i = 36;
        int i2 = 44;
        if (this.A07) {
            i = 28;
            i2 = 33;
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv = new C51722Yv(null, new C9CV(C05F.A1F, new C9FO(8, this, reel, A002), 4));
        long doubleToRawLongBits = Double.doubleToRawLongBits(i);
        Integer num = C05F.A00;
        C51722Yv c51722Yv2 = new C51722Yv(null, new C9CU(num, 0, doubleToRawLongBits));
        Integer num2 = C05F.A01;
        C51722Yv c51722Yv3 = new C51722Yv(c51722Yv2, new C9CU(num2, 0, doubleToRawLongBits));
        float f = 1.0f;
        if (this.A06) {
            f = 0.4f;
        }
        C51722Yv A003 = AbstractC171007jr.A00(c51722Yv3, f);
        String A0F = AbstractC77623dm.A0F(c76223bS, 2131970234);
        Integer num3 = C05F.A0N;
        C51722Yv c51722Yv4 = new C51722Yv(A003, new C9CV(num3, A0F, 0));
        Integer num4 = C05F.A0C;
        C51722Yv c51722Yv5 = new C51722Yv(c51722Yv4, new C9CT(num4, 0.0f, 1));
        Integer num5 = C05F.A08;
        C51722Yv c51722Yv6 = new C51722Yv(c51722Yv5, new C9CV(num5, "row_comment_imageview", 4));
        if (reel != null) {
            user = this.A02;
            A0G = AbstractC77623dm.A0G(c76223bS, user.getUsername(), 2131976894);
        } else {
            user = this.A02;
            A0G = AbstractC77623dm.A0G(c76223bS, user.getUsername(), 2131963268);
        }
        C51722Yv A004 = new C51722Yv(c51722Yv6, new C9CV(num3, A0G, 0)).A00(c51722Yv);
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(user.Bhu().getUrl(), i, i);
        InterfaceC60442pS interfaceC60442pS = this.A05;
        C2XE c2xe = c76223bS.A05;
        C77973eP c77973eP = new C77973eP(A004, interfaceC60442pS, simpleImageUrl, null, AbstractC77623dm.A03(c76223bS, AbstractC53242c7.A0H(c2xe.A0C, R.attr.igds_color_highlight_background)), 0, -16777216, false, true, false);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(i2);
        C51722Yv c51722Yv7 = new C51722Yv(null, new C9CU(num4, 0, doubleToRawLongBits2));
        Integer num6 = C05F.A0Y;
        C51722Yv c51722Yv8 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv7, new C9CU(num6, 0, doubleToRawLongBits2)), new C9CU(num5, 0, Double.doubleToRawLongBits(12.0d))), new C9CU(C05F.A09, 0, Double.doubleToRawLongBits(9.0d))), new C9CU(C05F.A0A, 0, Double.doubleToRawLongBits(3.0d)));
        C3e8 c3e8 = C3e8.CENTER;
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        c2z0.A00(c77973eP);
        if (reel == null) {
            c77943eM = null;
        } else {
            C51722Yv A005 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(num, 0, doubleToRawLongBits2)), new C9CU(num2, 0, doubleToRawLongBits2)), new C9CV(num6, EnumC77933eL.ABSOLUTE, 3)), new C9CV(C05F.A0j, 2, 0)).A00(c51722Yv);
            UserSession userSession = this.A01;
            RingSpec A05 = reel.A05(userSession);
            if (A05 == null) {
                A05 = C3PP.A00(userSession, reel);
            }
            if (reel.A16(userSession)) {
                enumC77923eK = EnumC77923eK.A03;
            } else {
                enumC77923eK = EnumC77923eK.A02;
            }
            c77943eM = new C77943eM(A005, A05, enumC77923eK, Float.valueOf(AbstractC77623dm.A00(c2z0, R.dimen.afi_indicator_arrow_margin_top)), Float.valueOf(AbstractC77623dm.A00(c2z0, R.dimen.account_recs_header_image_margin)));
        }
        c2z0.A00(c77943eM);
        return AbstractC76963ci.A06(c2z0, c76223bS, c51722Yv8, null, enumC77683ds, c3e8, false);
    }
}
