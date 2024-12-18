package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* loaded from: classes5.dex */
public final class BPL extends AbstractC51572Yf {
    public final int A00;
    public final C51722Yv A01;
    public final ClipsViewerConfig A02;
    public final UserSession A03;
    public final InterfaceC31165Dn9 A04;
    public final BPK A05;
    public final InterfaceC31048Dkm A06;
    public final Boolean A07;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        MusicAssetModel musicAssetModel;
        Boolean bool;
        Boolean bool2;
        C51722Yv c51722Yv;
        int dimensionPixelSize;
        boolean z;
        int min;
        boolean z2;
        Integer valueOf;
        C51722Yv A00;
        C14360o3.A0B(c76223bS, 0);
        BPK bpk = this.A05;
        C120985dq c120985dq = bpk.A00;
        C37644Ghd c37644Ghd = bpk.A01;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null) {
            return null;
        }
        C75113Zb c75113Zb = c37644Ghd.A0E;
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        ClipsViewerConfig clipsViewerConfig = this.A02;
        AudioOverlayTrack audioOverlayTrack = clipsViewerConfig.A0Q;
        if (audioOverlayTrack != null) {
            musicAssetModel = audioOverlayTrack.A08;
        } else {
            musicAssetModel = null;
        }
        UserSession userSession = this.A03;
        C92584Cs c92584Cs = (C92584Cs) AbstractC77183d4.A00(c76223bS, new MEB(44, A0u, c120985dq, this, c76223bS, c38321qM), new Object[]{c120985dq, c38321qM, A0u, musicAssetModel, userSession});
        if (c92584Cs == null) {
            return null;
        }
        boolean z3 = c92584Cs.A05;
        C51762Yz A002 = AbstractC77073ct.A00(c76223bS, new D8O(32, c120985dq, this, z3));
        C77123cy A003 = AbstractC77063cs.A00(c76223bS, new C29708D8b(8, A002, c120985dq, this, z3));
        InterfaceC31048Dkm interfaceC31048Dkm = this.A06;
        Object obj = A002.A03;
        C29893DGh.A00(c76223bS, A003, this, new Object[]{interfaceC31048Dkm, A003, obj, c120985dq, userSession}, 27);
        EnumC76913cd enumC76913cd = EnumC76913cd.LOCAL;
        C89813zN A004 = AbstractC51432Xq.A00(enumC76913cd, "audio_cta");
        AbstractC25226BEj.A1S(A004, 500);
        A004.A03(AbstractC79463gt.A00);
        A004.A01(0.0f);
        AbstractC89903zW.A00(c76223bS, A004);
        Object A005 = DH2.A00(c76223bS, c92584Cs, this, new Object[]{c92584Cs}, 44);
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
        C25317BIm c25317BIm = (C25317BIm) AbstractC77183d4.A00(c76223bS, new C25415BMg(3, A002, c76223bS, A005, c92584Cs, this, z3), new Object[]{c92584Cs, obj, bool, bool2});
        AbstractC77313dH.A00(c76223bS, C29904DGs.A01(c25317BIm, 15), new Object[]{c25317BIm});
        if (!clipsViewerConfig.A1Q && !z3) {
            C75933ay c75933ay = C51722Yv.A02;
            c51722Yv = AbstractC25230BEn.A0e(AbstractC25225BEi.A0h(null, new C77863eE(C05F.A00, DRV.A00(c25317BIm, 42), null)), C05F.A01, DRV.A00(c25317BIm, 43), null);
        } else {
            c51722Yv = null;
        }
        C75933ay c75933ay2 = C51722Yv.A02;
        Integer num = C05F.A00;
        Integer num2 = C05F.A01;
        BNU bnu = new BNU(c25317BIm, null, C9CU.A00(AbstractC25230BEn.A0d(null, num, 100.0f, 0), num2, 0, c25317BIm.getIntrinsicHeight() | 9221401712017801216L).A00(c51722Yv), true);
        C2XE c2xe = c76223bS.A05;
        Resources A0M = AbstractC166997dE.A0M(c2xe.A0C);
        int A006 = C76493bt.A00(A0M);
        boolean A1a = AbstractC166987dD.A1a(obj);
        if (A1a) {
            dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        } else {
            dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.afi_margin_top);
        }
        int i = dimensionPixelSize * 2;
        Context A007 = AbstractC77363dM.A00(c76223bS);
        int A07 = AbstractC13880nE.A07(A007) - (AbstractC167017dG.A04(A007) * 2);
        Boolean bool3 = this.A07;
        if (bool3 != null) {
            z = bool3.booleanValue();
        } else {
            z = bpk.A02;
        }
        C6RB c6rb = c25317BIm.A02;
        if (c6rb == null) {
            C14360o3.A0F("textDrawableStart");
            throw C00O.createAndThrow();
        }
        int i2 = c6rb.A0A + c25317BIm.A06 + c25317BIm.A07 + i;
        if (z) {
            min = C1H4.A01(A07 * 0.4f);
            z2 = false;
            valueOf = null;
        } else {
            min = Math.min(i2, A006);
            z2 = true;
            valueOf = Integer.valueOf(min);
        }
        c25317BIm.A02(valueOf, Integer.valueOf(i2));
        if (!z2) {
            min = Math.min(i2, min);
        }
        C51722Yv c51722Yv2 = this.A01;
        C9CU A0n = AbstractC25225BEi.A0n(num, 0, min | 9221401712017801216L);
        if (c51722Yv2 == c75933ay2) {
            c51722Yv2 = null;
        }
        C51722Yv A0Y = AbstractC25231BEo.A0Y(AbstractC25225BEi.A0h(c51722Yv2, A0n), DRY.A00(this, A002, 2));
        C29912DHa c29912DHa = new C29912DHa(3, A002, this, c76223bS);
        Integer num3 = C05F.A04;
        C51722Yv A0e = AbstractC25230BEn.A0e(C9CV.A00(A0Y, num3, c29912DHa, 4), num, new C30177DRh(38, this, A002, c120985dq, c37644Ghd), null);
        String string = A0M.getString(2131955283, c92584Cs.A04, c92584Cs.A03);
        if (string != null) {
            A0e = C9CV.A00(A0e, C05F.A0N, string, 0);
        }
        C51722Yv A008 = C9CV.A00(A0e, num2, "android.widget.Button", 0);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        if (A1a) {
            A00 = AbstractC25231BEo.A0W(A0P.ArD(), C9CV.A00(AbstractC25233BEq.A0R(null, AbstractC25225BEi.A0n(num3, 0, AbstractC77623dm.A0B(A0P)), 0, AbstractC77623dm.A08(A0P)), num, AbstractC77623dm.A0E(A0P, R.drawable.clips_viewer_pill_invert_background), 4), enumC76913cd, "audio_cta");
        } else {
            A00 = BPH.A00(A0P);
        }
        return AbstractC25226BEj.A0k(AbstractC76963ci.A0H(AbstractC25232BEp.A11(bnu, A0P.A00), A0P, A00), A0P, c76223bS, A008);
    }

    public /* synthetic */ BPL(C51722Yv c51722Yv, ClipsViewerConfig clipsViewerConfig, UserSession userSession, InterfaceC31165Dn9 interfaceC31165Dn9, BPK bpk, InterfaceC31048Dkm interfaceC31048Dkm, int i) {
        Boolean A0a = AbstractC166997dE.A0a();
        AbstractC167027dH.A0a(1, bpk, interfaceC31048Dkm, userSession, clipsViewerConfig);
        C14360o3.A0B(interfaceC31165Dn9, 7);
        this.A05 = bpk;
        this.A06 = interfaceC31048Dkm;
        this.A03 = userSession;
        this.A02 = clipsViewerConfig;
        this.A01 = c51722Yv;
        this.A00 = i;
        this.A04 = interfaceC31165Dn9;
        this.A07 = A0a;
    }
}
