package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.BQi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25520BQi extends AbstractC51572Yf {
    public final View.OnClickListener A00;
    public final ClipsViewerConfig A01;
    public final C120985dq A02;
    public final C3x9 A03;
    public final C37644Ghd A04;
    public final UserSession A05;
    public final InterfaceC31137Dmc A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C25520BQi(View.OnClickListener onClickListener, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C3x9 c3x9, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc, boolean z, boolean z2, boolean z3) {
        AbstractC25233BEq.A0x(3, userSession, clipsViewerConfig, c37644Ghd);
        C14360o3.A0B(interfaceC31137Dmc, 6);
        this.A02 = c120985dq;
        this.A03 = c3x9;
        this.A05 = userSession;
        this.A01 = clipsViewerConfig;
        this.A04 = c37644Ghd;
        this.A06 = interfaceC31137Dmc;
        this.A09 = z;
        this.A00 = onClickListener;
        this.A07 = z2;
        this.A08 = z3;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        long A0B;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A02;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C3x9 c3x9 = this.A03;
            ClipsViewerConfig clipsViewerConfig = this.A01;
            C92584Cs c92584Cs = (C92584Cs) DH2.A00(c76223bS, c38321qM, this, new Object[]{c120985dq, c38321qM, c3x9, clipsViewerConfig, this.A05}, 49);
            if (c92584Cs != null) {
                boolean z = c92584Cs.A05;
                C89813zN A00 = AbstractC51432Xq.A00(EnumC76913cd.LOCAL, "audio_cta");
                AbstractC25226BEj.A1S(A00, 500);
                float A02 = AbstractC25230BEn.A02(A00, AbstractC79463gt.A00);
                AbstractC89903zW.A00(c76223bS, A00);
                Object A002 = DH2.A00(c76223bS, c92584Cs, this, new Object[]{c92584Cs}, 48);
                C25317BIm c25317BIm = (C25317BIm) AbstractC77183d4.A00(c76223bS, C29901DGp.A00(A002, c76223bS, this, c92584Cs, 49), new Object[]{c92584Cs});
                AbstractC77313dH.A00(c76223bS, C29904DGs.A01(c25317BIm, 21), new Object[]{c25317BIm});
                if (!clipsViewerConfig.A1Q && !z) {
                    C75933ay c75933ay = C51722Yv.A02;
                    c51722Yv = AbstractC25230BEn.A0e(AbstractC25225BEi.A0h(null, new C77863eE(C05F.A00, DRP.A00(c25317BIm, 15), null)), C05F.A01, DRP.A00(c25317BIm, 16), null);
                } else {
                    c51722Yv = null;
                }
                C75933ay c75933ay2 = C51722Yv.A02;
                Integer num = C05F.A00;
                Integer num2 = C05F.A01;
                BNU bnu = new BNU(c25317BIm, null, C9CU.A00(AbstractC25230BEn.A0d(null, num, 100.0f, 0), num2, 0, c25317BIm.getIntrinsicHeight() | 9221401712017801216L).A00(c51722Yv), false);
                int dimensionPixelSize = AbstractC25229BEm.A0O(c76223bS).getDimensionPixelSize(R.dimen.afi_margin_top) * 2;
                Context A003 = AbstractC77363dM.A00(c76223bS);
                int A07 = (int) ((AbstractC13880nE.A07(A003) - (AbstractC167017dG.A04(A003) * 2)) * 0.4d);
                C6RB c6rb = c25317BIm.A02;
                if (c6rb == null) {
                    C14360o3.A0F("textDrawableStart");
                    throw C00O.createAndThrow();
                }
                c25317BIm.A02(Integer.valueOf(A07), Integer.valueOf(c6rb.A0A + c25317BIm.A06 + c25317BIm.A07 + dimensionPixelSize));
                C51722Yv A0S = AbstractC25233BEq.A0S(AbstractC25234BEr.A0B(null, AbstractC25225BEi.A0n(num, 0, A07 | 9221401712017801216L), A02), AbstractC25226BEj.A0m(0, 9221401712017801224L), 0, AbstractC77623dm.A06(c76223bS));
                if (this.A09) {
                    A0B = AbstractC25229BEm.A0D();
                } else {
                    A0B = AbstractC77623dm.A0B(c76223bS);
                }
                C51722Yv A0e = AbstractC25230BEn.A0e(C9CV.A00(AbstractC25231BEo.A0Y(C9CU.A00(A0S, C05F.A0u, 0, A0B), DRP.A00(this, 12)), C05F.A04, DRP.A00(this, 13), 4), num, DRP.A00(this, 14), null);
                if (A002 != null) {
                    A0e = C9CV.A00(A0e, C05F.A0N, A002, 0);
                }
                C51722Yv A004 = C9CV.A00(A0e, num2, "android.widget.Button", 0);
                C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
                return AbstractC25226BEj.A0k(AbstractC76963ci.A0H(AbstractC25232BEp.A11(bnu, A12.A00), A12, null), A12, c76223bS, A004);
            }
        }
        return null;
    }
}
