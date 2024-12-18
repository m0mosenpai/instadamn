package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.OnImpressionStyle;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BSX extends AbstractC51572Yf {
    public final InterfaceC104934o6 A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final UserSession A03;
    public final InterfaceC31069DlB A04;
    public final boolean A05;

    public BSX(InterfaceC104934o6 interfaceC104934o6, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31069DlB interfaceC31069DlB, boolean z) {
        AbstractC25234BEr.A0j(1, userSession, c120985dq, c37644Ghd, interfaceC31069DlB);
        this.A03 = userSession;
        this.A00 = interfaceC104934o6;
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A04 = interfaceC31069DlB;
        this.A05 = z;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Drawable drawable;
        Drawable drawable2;
        long A0D;
        AbstractC50812Vc bsy;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC104934o6 interfaceC104934o6 = this.A00;
        String BWT = interfaceC104934o6.BWT();
        if (BWT != null) {
            drawable = AbstractC65877Tvg.A02(c76223bS.A05.A0C, BWT);
        } else {
            drawable = null;
        }
        String Bel = interfaceC104934o6.Bel();
        if (Bel != null) {
            drawable2 = AbstractC65877Tvg.A02(c76223bS.A05.A0C, Bel);
        } else {
            drawable2 = null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        boolean z = this.A05;
        if (z) {
            A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin);
        } else {
            A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        }
        Integer num = C05F.A01;
        C51722Yv A00 = C9CU.A00(null, num, 0, A0D);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        Integer num2 = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CV.A00(A00, num2, enumC77683ds, 3), num2, 100.0f, 0);
        C3e8 c3e8 = C3e8.FLEX_START;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C51722Yv A0T = AbstractC25233BEq.A0T(AbstractC25233BEq.A0Y(null, A12, num, R.dimen.account_recs_header_image_margin, 0), AbstractC25225BEi.A0o(num2, enumC77683ds, 3), num2, 100.0f, 0);
        C2XE ArD = A12.ArD();
        AbstractC25226BEj.A1R(null, A12, AbstractC25232BEp.A16(A0T, num2, AbstractC25225BEi.A0i(ArD.A0C.getColor(R.color.audio_bar_action_color_disabled))));
        OnImpressionStyle C35 = interfaceC104934o6.C35();
        if (C35 != null) {
            int ordinal = C35.ordinal();
            if (ordinal != 7) {
                if (ordinal == 3) {
                    C38321qM c38321qM = this.A01.A02;
                    if (c38321qM != null) {
                        C51722Yv A0N = AbstractC25234BEr.A0N(C9CV.A00(null, num2, enumC77683ds, 3), num2, num, 100.0f, 0);
                        C3e8 c3e82 = C3e8.SPACE_EVENLY;
                        C2Z0 A0P = AbstractC167007dF.A0P(ArD);
                        A0P.A00(new BSY(drawable, enumC77683ds, null, interfaceC104934o6.BWU(), C29904DGs.A01(this, 27), false, z));
                        A0P.A00(new BSY(drawable2, enumC77683ds, Boolean.valueOf(AbstractC37876GlW.A00(this.A03).A01(c38321qM)), interfaceC104934o6.Bem(), C29904DGs.A01(this, 28), true, z));
                        bsy = AbstractC76963ci.A0L(A0P, A12, A0N, c3e82);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            } else {
                bsy = new BSY(drawable, EnumC77683ds.FLEX_START, null, interfaceC104934o6.BWU(), C29904DGs.A01(this, 29), false, z);
            }
            A12.A00(bsy);
        }
        return AbstractC76963ci.A08(A12, c76223bS, A0d, c3e8);
    }
}
