package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.AkJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23984AkJ implements InterfaceC189958bE, InterfaceC190008bJ {
    public int A00;
    public Drawable A01;
    public MusicOverlayStickerModel A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final AnonymousClass877 A06;
    public final InterfaceC1810081c A07;
    public final C8NW A08;
    public final AnonymousClass844 A09;
    public final C189988bH A0A;
    public final View A0B;
    public final View A0C;
    public final AnonymousClass840 A0D;
    public final C150286pc A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public C23984AkJ(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, AnonymousClass877 anonymousClass877, InterfaceC1810081c interfaceC1810081c, C8NW c8nw, AnonymousClass844 anonymousClass844, String str) {
        C14360o3.A0B(anonymousClass877, 3);
        AbstractC167007dF.A1J(anonymousClass844, 7, str);
        this.A0D = anonymousClass840;
        this.A07 = interfaceC1810081c;
        this.A06 = anonymousClass877;
        this.A05 = userSession;
        this.A09 = anonymousClass844;
        this.A08 = c8nw;
        this.A0F = str;
        View A0S = AbstractC166997dE.A0S(view, R.id.text_overlay_edit_text_container);
        this.A0B = A0S;
        this.A0C = AbstractC166997dE.A0S(view, R.id.done_button);
        this.A00 = 15;
        this.A0A = new C189988bH((ViewStub) AbstractC166997dE.A0S(A0S, R.id.music_overlay_sticker_editor_stub), new C9B8(0, 0, 7, 1, false), abstractC59962oe, userSession, targetViewSizeProvider, this, C8BO.A09, 0, true, false, false, true, false, false);
        this.A0E = AbstractC150276pb.A00(new B2P(1, abstractC59962oe, this), new InterfaceC143366db[0]);
        this.A0K = true;
        this.A0L = true;
        this.A0I = true;
        this.A0J = true;
        this.A0G = true;
        this.A0H = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r12 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C23984AkJ r11, X.C8GD r12, java.lang.String r13, boolean r14) {
        /*
            r4 = 0
            r6 = r12
            if (r12 == 0) goto L5e
            X.6Pl r1 = r12.BVp()
            X.6Pl r0 = X.EnumC138556Pl.A06
            if (r1 == r0) goto L5e
            X.6Pl r1 = r12.BVp()
            X.6Pl r0 = X.EnumC138556Pl.A0J
            if (r1 == r0) goto L5e
            boolean r0 = r12 instanceof X.C24025AlH
            if (r0 == 0) goto L54
            r0 = r6
            X.AlH r0 = (X.C24025AlH) r0
            X.Al0 r0 = r0.A03
        L1d:
            android.view.View r1 = r11.A0B
            android.content.Context r2 = X.AbstractC166997dE.A0L(r1)
            com.instagram.common.session.UserSession r3 = r11.A05
            java.lang.String r9 = r11.A0F
            X.840 r1 = r11.A0D
            X.83z r1 = r1.A02
            X.83h r1 = r1.A01
            X.81l r1 = r1.A0Y
            if (r1 == 0) goto L35
            X.55U r4 = X.C1810981l.A02(r1)
        L35:
            r5 = 0
            r10 = 0
            r7 = r5
            r8 = r5
            android.graphics.drawable.Drawable r4 = X.AMH.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L3d:
            X.8bH r1 = r11.A0A
            r1.A0F()
            boolean r1 = r4 instanceof X.AbstractC210529Sr
            if (r1 == 0) goto L4d
            r1 = r4
            X.9Sr r1 = (X.AbstractC210529Sr) r1
            if (r1 == 0) goto L4d
            r1.A02 = r13
        L4d:
            X.8NW r2 = r11.A08
            r1 = 0
            r2.A1I(r4, r0, r14, r1)
            return
        L54:
            boolean r0 = r12 instanceof X.C24024AlG
            if (r0 == 0) goto L5e
            r0 = r6
            X.AlG r0 = (X.C24024AlG) r0
            X.Al0 r0 = r0.A02
            goto L1d
        L5e:
            r0 = r4
            if (r12 == 0) goto L3d
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23984AkJ.A01(X.AkJ, X.8GD, java.lang.String, boolean):void");
    }

    public final void A04(MusicProduct musicProduct, MusicAssetModel musicAssetModel, EnumC138556Pl enumC138556Pl) {
        C14360o3.A0B(musicAssetModel, 1);
        MusicOverlayStickerModel A02 = AbstractC23129AMi.A02(musicProduct, musicAssetModel, Integer.valueOf(this.A06.A05.A06.BVm()), Integer.valueOf(musicAssetModel.A05()), this.A09.BVY());
        this.A02 = A02;
        if (enumC138556Pl.A02()) {
            ((C23104AGq) this.A0E.get()).A00(this, musicAssetModel);
        } else {
            if (A02 == null) {
                return;
            }
            A03(new C24024AlG(A02, null, enumC138556Pl, -1));
        }
    }

    @Override // X.InterfaceC189958bE
    public final boolean ACP() {
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final void ATh() {
        A02(null);
    }

    @Override // X.InterfaceC189958bE
    public final void CwG() {
        this.A07.E4u(new C188238Vo(true));
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void Cxy(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, boolean z) {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DTj(Integer num) {
    }

    private final void A02(C8GD c8gd) {
        MusicProduct musicProduct;
        Object c188248Vp;
        if (c8gd != null) {
            musicProduct = c8gd.BVf().A02;
        } else {
            musicProduct = null;
        }
        MusicProduct musicProduct2 = MusicProduct.A0F;
        InterfaceC1810081c interfaceC1810081c = this.A07;
        if (musicProduct == musicProduct2) {
            c188248Vp = new C8WM(c8gd);
        } else {
            c188248Vp = new C188248Vp(c8gd, null, false);
        }
        interfaceC1810081c.E4u(c188248Vp);
    }

    private final void A03(C8GD c8gd) {
        C55U c55u;
        Context A0L = AbstractC166997dE.A0L(this.A0B);
        UserSession userSession = this.A05;
        C1810981l c1810981l = this.A0D.A02.A01.A0Y;
        if (c1810981l != null) {
            c55u = C1810981l.A02(c1810981l);
        } else {
            c55u = null;
        }
        this.A08.A1I(AMH.A00(A0L, userSession, c55u, null, c8gd, null, null, "MusicPostcaptureEditController", false), null, false, true);
    }

    @Override // X.InterfaceC189958bE
    public final int BPv() {
        return this.A00;
    }

    @Override // X.InterfaceC189968bF
    public final MusicOverlayStickerModel BVf() {
        return this.A02;
    }

    @Override // X.InterfaceC189958bE
    public final String BYP(boolean z) {
        Context A0L = AbstractC166997dE.A0L(this.A0B);
        UserSession userSession = this.A05;
        if (!z && AbstractC166987dD.A0x(userSession).getInt("music_editor_nux_seen_count", 0) >= 3) {
            return A0L.getString(2131967933);
        }
        return null;
    }

    @Override // X.InterfaceC189968bF
    public final boolean Bv6() {
        return false;
    }

    @Override // X.InterfaceC189968bF
    public final void CMU() {
        C189988bH c189988bH = this.A0A;
        View view = c189988bH.A03;
        if (view != null) {
            view.setVisibility(8);
            C189988bH.A07(c189988bH);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189968bF
    public final boolean CQQ() {
        UserSession userSession = this.A08.A0r;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!AbstractC166997dE.A0c(c06090Tz, userSession, 36319828297981636L).booleanValue() && !C18U.A06(c06090Tz, userSession, 36328796189703983L)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CSV() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CSh() {
        return this.A0G;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CXD() {
        return this.A0H;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CaV() {
        return this.A0I;
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cbt() {
        return this.A0J;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdO() {
        return this.A0K;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdP() {
        int ordinal;
        C1816783z c1816783z = this.A0D.A02;
        if (c1816783z.A0E() || c1816783z.A01.A0t || ((ordinal = c1816783z.A01().ordinal()) != 0 && ordinal != 2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdQ() {
        return this.A0L;
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189978bG
    public final boolean Cdk() {
        return C36A.A06(this.A08.A0r);
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cef() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cyv() {
        if (this.A03) {
            C8GD A0E = this.A0A.A0E();
            if (A0E == null) {
                A00();
            }
            A02(A0E);
            return true;
        }
        this.A07.E4u(new C188238Vo(this.A04));
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final void D9c() {
        this.A07.E4u(new Object());
    }

    @Override // X.InterfaceC189958bE
    public final void DBK(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, Integer num) {
        if (this.A06.A02().CAH().intValue() == 2) {
            C8GD A0E = this.A0A.A0E();
            if (A0E == null) {
                A00();
            }
            A02(A0E);
            return;
        }
        AbstractC12120kG.A0E("Music Not Prepared", "Cannot finish editing music sticker before the track is prepared, otherwise the sticker will have unknown behavior due to all fields (e.g. snippet duration) not being properly set.", null);
    }

    @Override // X.InterfaceC190008bJ
    public final void DQw(Integer num) {
        EnumC138556Pl A08 = AbstractC101614hW.A08(AbstractC23021Ah.A00(this.A05), false);
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            A03(new C24024AlG(musicOverlayStickerModel, null, A08, -1));
        }
    }

    @Override // X.InterfaceC190008bJ
    public final void DQx(C38059Gom c38059Gom) {
        EnumC138556Pl A08 = AbstractC101614hW.A08(AbstractC23021Ah.A00(this.A05), true);
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            A03(new C24025AlH(c38059Gom, musicOverlayStickerModel, null, A08, -1));
        }
    }

    @Override // X.InterfaceC189958bE
    public final void DUK() {
        AbstractC166997dE.A1L(this.A0B, false);
        AbstractC167007dF.A0y(this.A0C, false);
    }

    @Override // X.InterfaceC189958bE
    public final void DUL() {
        AbstractC167007dF.A0y(this.A0B, false);
        AbstractC125325le.A06(new View[]{this.A0C}, false);
    }

    @Override // X.InterfaceC189958bE
    public final void Dx9(int i) {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            Integer valueOf = Integer.valueOf(i);
            C23000ABz c23000ABz = new C23000ABz(musicOverlayStickerModel);
            c23000ABz.A0O = valueOf;
            this.A02 = c23000ABz.A00();
        }
    }

    @Override // X.InterfaceC189958bE
    public final void DxA(int i) {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            Integer valueOf = Integer.valueOf(i);
            C23000ABz c23000ABz = new C23000ABz(musicOverlayStickerModel);
            c23000ABz.A0K = valueOf;
            this.A02 = c23000ABz.A00();
        }
    }

    @Override // X.InterfaceC189968bF
    public final void Ekk() {
        C189988bH c189988bH = this.A0A;
        View view = c189988bH.A02;
        if (view != null) {
            view.setVisibility(8);
            View view2 = c189988bH.A03;
            if (view2 != null) {
                view2.setVisibility(0);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    private final void A00() {
        boolean z;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("User tapped to edit the music sticker, but the model is null. isStickerReady=");
        C189988bH c189988bH = this.A0A;
        AMp aMp = c189988bH.A0Z;
        if (aMp != null) {
            z = AbstractC167007dF.A1W(aMp.A06);
        } else {
            z = false;
        }
        A1C.append(z);
        A1C.append(" isStickerEditEnabled=");
        A1C.append(c189988bH.A0y.Cdk());
        A1C.append(" isFetchingLyrics=");
        A1C.append(c189988bH.A0k);
        A1C.append(" isBoundOnTrackPrepared=");
        A1C.append(c189988bH.A0i);
        AbstractC12120kG.A0E("MusicPostcaptureEditController", A1C.toString(), null);
    }
}
