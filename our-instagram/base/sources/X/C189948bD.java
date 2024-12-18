package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.8bD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189948bD implements InterfaceC189958bE {
    public final C189988bH A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC189818b0 A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C189948bD(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, InterfaceC189818b0 interfaceC189818b0, AnonymousClass879 anonymousClass879) {
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = interfaceC189818b0;
        View requireViewById = view.requireViewById(R.id.music_pre_capture_editor_stub);
        C14360o3.A07(requireViewById);
        C189988bH c189988bH = new C189988bH((ViewStub) requireViewById, new C9B8(view.getContext().getColor(R.color.black_60_transparent), R.dimen.add_account_icon_circle_radius, 1, 1, false), abstractC59962oe, userSession, targetViewSizeProvider, this, C8BO.A09, 0, true, false, false, true, false, false);
        this.A00 = c189988bH;
        this.A09 = true;
        this.A07 = true;
        this.A08 = true;
        this.A04 = true;
        this.A05 = true;
        this.A06 = true;
        c189988bH.A0b = anonymousClass879;
    }

    @Override // X.InterfaceC189958bE
    public final boolean ACP() {
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final int BPv() {
        return 15;
    }

    @Override // X.InterfaceC189968bF
    public final /* synthetic */ void CMU() {
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189968bF
    public final boolean CQQ() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void Cxy(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, boolean z) {
    }

    @Override // X.InterfaceC189958bE
    public final void DBK(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, Integer num) {
        AudioOverlayTrack audioOverlayTrack;
        C14360o3.A0B(trackSnippet, 1);
        C189988bH c189988bH = this.A00;
        MusicAssetModel musicAssetModel = c189988bH.A0P;
        InterfaceC189818b0 interfaceC189818b0 = this.A03;
        if (musicAssetModel != null) {
            audioOverlayTrack = new AudioOverlayTrack(musicAssetModel, trackSnippet.A01, trackSnippet.A00);
        } else {
            audioOverlayTrack = null;
        }
        interfaceC189818b0.DBI(audioOverlayTrack, c189988bH.A0E());
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DTj(Integer num) {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DUK() {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DUL() {
    }

    @Override // X.InterfaceC189968bF
    public final /* synthetic */ void Ekk() {
    }

    @Override // X.InterfaceC189958bE
    public final void ATh() {
        this.A03.Cyu(null);
    }

    @Override // X.InterfaceC189968bF
    public final MusicOverlayStickerModel BVf() {
        return this.A03.BVf();
    }

    @Override // X.InterfaceC189958bE
    public final String BYP(boolean z) {
        Context requireContext = this.A01.requireContext();
        UserSession userSession = this.A02;
        if (!z && AbstractC23021Ah.A00(userSession).A01.getInt("music_editor_nux_seen_count", 0) >= 3) {
            return requireContext.getString(2131967933);
        }
        return null;
    }

    @Override // X.InterfaceC189968bF
    public final boolean Bv6() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CSV() {
        return this.A04;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CSh() {
        return this.A05;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CXD() {
        return this.A06;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CaV() {
        return this.A07;
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cbt() {
        return this.A08;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdO() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdP() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdQ() {
        return this.A09;
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189978bG
    public final boolean Cdk() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cef() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final void CwG() {
        this.A03.CwG();
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cyv() {
        this.A03.Cyu(this.A00.A0E());
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final void D9c() {
        this.A03.D9c();
    }

    @Override // X.InterfaceC189958bE
    public final void Dx9(int i) {
        this.A03.Dx9(i);
    }

    @Override // X.InterfaceC189958bE
    public final void DxA(int i) {
        this.A03.DxA(i);
    }
}
