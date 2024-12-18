package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.BnO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26503BnO extends AbstractC51572Yf {
    public final int A00;
    public final ClipsViewerConfig A01;
    public final UserSession A02;
    public final InterfaceC31137Dmc A03;
    public final InterfaceC31165Dn9 A04;
    public final C26244BjD A05;
    public final int A06;
    public final C51722Yv A07;
    public final Boolean A08;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        MusicAssetModel musicAssetModel;
        Boolean bool;
        Boolean bool2;
        C51722Yv c51722Yv;
        boolean z;
        int min;
        Integer num;
        C14360o3.A0B(c76223bS, 0);
        C26244BjD c26244BjD = this.A05;
        C120985dq c120985dq = c26244BjD.A00;
        C37644Ghd c37644Ghd = c26244BjD.A01;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null) {
            return null;
        }
        C75113Zb c75113Zb = c37644Ghd.A0E;
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        ClipsViewerConfig clipsViewerConfig = this.A01;
        AudioOverlayTrack audioOverlayTrack = clipsViewerConfig.A0Q;
        if (audioOverlayTrack != null) {
            musicAssetModel = audioOverlayTrack.A08;
        } else {
            musicAssetModel = null;
        }
        C92584Cs c92584Cs = (C92584Cs) AbstractC77183d4.A00(c76223bS, new MEB(45, A0u, c120985dq, this, c76223bS, c38321qM), new Object[]{c120985dq, c38321qM, A0u, musicAssetModel, this.A02});
        if (c92584Cs == null) {
            return null;
        }
        boolean z2 = c92584Cs.A05;
        Object A00 = DH2.A00(c76223bS, c92584Cs, this, new Object[]{c92584Cs}, 45);
        if (c75113Zb != null) {
            bool = Boolean.valueOf(c75113Zb.A1p);
        } else {
            bool = null;
        }
        if (c75113Zb != null) {
            bool2 = Boolean.valueOf(c75113Zb.A0n());
        } else {
            bool2 = null;
        }
        C25317BIm c25317BIm = (C25317BIm) AbstractC77183d4.A00(c76223bS, C29901DGp.A00(A00, c76223bS, this, c92584Cs, 48), new Object[]{c92584Cs, bool, bool2});
        AbstractC77313dH.A00(c76223bS, C29904DGs.A01(c25317BIm, 17), new Object[]{c25317BIm});
        if (!clipsViewerConfig.A1Q && !z2) {
            C75933ay c75933ay = C51722Yv.A02;
            c51722Yv = AbstractC25230BEn.A0e(AbstractC25225BEi.A0h(null, new C77863eE(C05F.A00, DRV.A00(c25317BIm, 47), null)), C05F.A01, DRV.A00(c25317BIm, 48), null);
        } else {
            c51722Yv = null;
        }
        C75933ay c75933ay2 = C51722Yv.A02;
        Integer num2 = C05F.A00;
        Integer num3 = C05F.A01;
        BNU bnu = new BNU(c25317BIm, null, C9CU.A00(AbstractC25230BEn.A0d(null, num2, 100.0f, 0), num3, 0, c25317BIm.getIntrinsicHeight() | 9221401712017801216L).A00(c51722Yv), true);
        C2XE c2xe = c76223bS.A05;
        Resources A0M = AbstractC166997dE.A0M(c2xe.A0C);
        int A002 = C76493bt.A00(A0M);
        int dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.afi_margin_top) * 2;
        Context A003 = AbstractC77363dM.A00(c76223bS);
        int A07 = AbstractC13880nE.A07(A003) - (AbstractC167017dG.A04(A003) * 2);
        Boolean bool3 = this.A08;
        if (bool3 != null) {
            z = bool3.booleanValue();
        } else {
            z = c26244BjD.A02;
        }
        int i = this.A06;
        C6RB c6rb = c25317BIm.A02;
        if (c6rb == null) {
            C14360o3.A0F("textDrawableStart");
            throw C00O.createAndThrow();
        }
        int i2 = c6rb.A0A + c25317BIm.A06 + c25317BIm.A07 + dimensionPixelSize;
        if (z) {
            min = C1H4.A01(A07 * 0.4f);
        } else {
            min = Math.min(i2, A002);
        }
        boolean z3 = true;
        int i3 = A002 - i;
        if (min >= i3) {
            z3 = false;
        }
        int min2 = Math.min(i2, i3);
        if (z3) {
            num = Integer.valueOf(min);
        } else {
            num = null;
        }
        c25317BIm.A02(num, Integer.valueOf(i2));
        if (!z3) {
            min = min2;
        }
        if (min <= A002 * 0.25f) {
            return null;
        }
        C51722Yv c51722Yv2 = this.A07;
        C9CU A0n = AbstractC25225BEi.A0n(num2, 0, min | 9221401712017801216L);
        if (c51722Yv2 == c75933ay2) {
            c51722Yv2 = null;
        }
        C51722Yv A0e = AbstractC25230BEn.A0e(C9CV.A00(AbstractC25231BEo.A0Y(AbstractC25225BEi.A0h(c51722Yv2, A0n), DRV.A00(this, 46)), C05F.A04, DRY.A00(this, c76223bS, 4), 4), num2, new C29912DHa(4, c120985dq, this, c37644Ghd), null);
        String string = A0M.getString(2131955283, c92584Cs.A04, c92584Cs.A03);
        if (string != null) {
            A0e = C9CV.A00(A0e, C05F.A0N, string, 0);
        }
        C51722Yv A004 = C9CV.A00(A0e, num3, "android.widget.Button", 0);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        return AbstractC25226BEj.A0k(AbstractC76963ci.A0H(AbstractC25232BEp.A11(bnu, A0P.A00), A0P, BPH.A00(A0P)), A0P, c76223bS, A004);
    }

    public C26503BnO(C51722Yv c51722Yv, ClipsViewerConfig clipsViewerConfig, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc, InterfaceC31165Dn9 interfaceC31165Dn9, C26244BjD c26244BjD, Boolean bool, int i, int i2) {
        AbstractC167017dG.A1P(c26244BjD, userSession);
        AbstractC167007dF.A1I(interfaceC31137Dmc, 7, interfaceC31165Dn9);
        this.A05 = c26244BjD;
        this.A02 = userSession;
        this.A01 = clipsViewerConfig;
        this.A07 = c51722Yv;
        this.A06 = i;
        this.A00 = i2;
        this.A03 = interfaceC31137Dmc;
        this.A04 = interfaceC31165Dn9;
        this.A08 = bool;
    }
}
