package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BNe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25439BNe extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC31159Dn3 A02;
    public final UserSession A03;
    public final boolean A04;

    public C25439BNe(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31159Dn3 interfaceC31159Dn3, boolean z) {
        AbstractC167007dF.A1F(c37644Ghd, 3, interfaceC31159Dn3);
        this.A00 = c120985dq;
        this.A03 = userSession;
        this.A01 = c37644Ghd;
        this.A02 = interfaceC31159Dn3;
        this.A04 = z;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C38321qM c38321qM;
        InterfaceC101404gy A00;
        String str;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A00;
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
            UserSession userSession = this.A03;
            if (AbstractC76903cc.A04(userSession, c38321qM) && (A00 = AbstractC76903cc.A00(c38321qM)) != null) {
                C14360o3.A0B(userSession, 1);
                float f = 0.0f;
                for (int i = 0; i < AbstractC140306Wi.A03(userSession, A00, true).length; i++) {
                    f += r5[i];
                }
                int i2 = (int) f;
                Integer A002 = AbstractC25549BRl.A00(userSession).A00(A00);
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv A0d = AbstractC25233BEq.A0d(null, DRP.A00(this, 24));
                boolean A1W = AbstractC167007dF.A1W(A002);
                C2XE c2xe = c76223bS.A05;
                Context context = c2xe.A0C;
                Resources A0M = AbstractC166997dE.A0M(context);
                int i3 = R.plurals.voter_count_on_surfaces;
                if (A1W) {
                    i3 = R.plurals.voter_count_on_surfaces_voted_viewer;
                }
                String A02 = AbstractC76903cc.A02(A0M, i3, i2);
                int A03 = AbstractC25232BEp.A03(context, c76223bS, R.attr.igds_color_secondary_text_on_media);
                long A05 = AbstractC77623dm.A05(c76223bS);
                Integer num = C05F.A0N;
                long A04 = AbstractC25449BNo.A04(userSession);
                int A022 = AbstractC25449BNo.A02(c76223bS, userSession);
                long A052 = AbstractC25449BNo.A05(userSession);
                Integer A06 = AbstractC25449BNo.A06(c76223bS, userSession);
                Typeface typeface = Typeface.DEFAULT;
                long A0D = AbstractC25229BEm.A0D();
                Integer num2 = C05F.A00;
                C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A02, 0);
                AbstractC25233BEq.A19(c76223bS, A0a, A03, A05);
                AbstractC25229BEm.A14(typeface, A0a, 0, A022);
                AbstractC25234BEr.A13(c76223bS, A0a, AbstractC25228BEl.A07(c76223bS, A04), A0D);
                AbstractC25234BEr.A1A(A0a, c76223bS.BoZ(), A06, A052);
                AbstractC25234BEr.A1F(A0a, num, num2);
                A0a.A0M(1);
                AbstractC25234BEr.A17(A0d, A0a, false);
                C51682Yq A0A = A0a.A0A();
                C51722Yv A003 = C9CU.A00(null, C05F.A15, 0, AbstractC25230BEn.A0M());
                if (this.A04) {
                    str = "trans_key_comment_poll_vote_counts";
                } else {
                    str = null;
                }
                return AbstractC76963ci.A0H(AbstractC25232BEp.A11(A0A, c2xe), c76223bS, AbstractC25231BEo.A0W(c2xe, A003, EnumC76913cd.GLOBAL, str));
            }
        }
        return null;
    }
}
