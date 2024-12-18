package X;

import android.view.View;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BNj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25444BNj extends AbstractC51572Yf {
    public final View.OnTouchListener A00;
    public final ClipsViewerConfig A01;
    public final C120985dq A02;
    public final UserSession A03;
    public final C3PD A04;
    public final InterfaceC60442pS A05;
    public final Reel A06;
    public final User A07;
    public final InterfaceC31137Dmc A08;
    public final C37616GhB A09;
    public final boolean A0A;
    public final C57 A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C25444BNj(View.OnTouchListener onTouchListener, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, UserSession userSession, C3PD c3pd, InterfaceC60442pS interfaceC60442pS, Reel reel, User user, InterfaceC31137Dmc interfaceC31137Dmc, C57 c57, C37616GhB c37616GhB, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(user, 2);
        AbstractC25234BEr.A0k(3, userSession, clipsViewerConfig, interfaceC31137Dmc, c37616GhB);
        this.A02 = c120985dq;
        this.A07 = user;
        this.A03 = userSession;
        this.A05 = interfaceC60442pS;
        this.A01 = clipsViewerConfig;
        this.A08 = interfaceC31137Dmc;
        this.A09 = c37616GhB;
        this.A00 = onTouchListener;
        this.A04 = c3pd;
        this.A0C = z;
        this.A0D = z2;
        this.A06 = reel;
        this.A0A = z3;
        this.A0B = c57;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r18 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0278  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r31) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25444BNj.A0Y(X.3bS):X.2Vc");
    }

    private final C51722Yv A03(C2Z1 c2z1, C3PD c3pd, List list, int i) {
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CV.A00(C9CV.A00(AbstractC25231BEo.A0Y(AbstractC25233BEq.A0a(C9CV.A00(AbstractC25233BEq.A0X(C9CU.A00(null, C05F.A00, 0, AbstractC77623dm.A0D(c2z1, R.dimen.biz_sign_up_divider_bottom_margin)), c2z1, R.dimen.biz_sign_up_divider_bottom_margin), C05F.A08, "profile_picture", 4), C05F.A0C, 0.0f), DRY.A00(this, c3pd, 11)), C05F.A03, DRY.A00(this, c3pd, 12), 4), C05F.A04, DRP.A00(this, 18), 4);
        String A01 = AbstractC100574fM.A01(AbstractC77363dM.A00(c2z1), AbstractC166987dD.A1F(AbstractC001800i.A0X(list)), list.size(), AbstractC25230BEn.A1S(AbstractC166987dD.A1F(AbstractC001800i.A0X(list)).size(), i), AbstractC167007dF.A1P(i, 2));
        C14360o3.A07(A01);
        return C9CV.A00(AbstractC25233BEq.A0N(EnumC77673dr.A0Q, C9CV.A00(A00, C05F.A0N, AbstractC77623dm.A0G(c2z1, A01, 2131970237), 0)), C05F.A0D, "clips_author_info_profile_pic_component", 4);
    }
}
