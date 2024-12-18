package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.IOException;

/* renamed from: X.HCb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38928HCb extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC189488aT, JHC {
    public static final String __redex_internal_original_name = "MusicConsumptionSheetFragment";
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public IgImageView A04;
    public Reel A05;
    public C42739IvZ A06;
    public C42793IwV A07;
    public JFX A08;
    public MusicOverlayStickerModel A09;
    public C677733r A0A;
    public IF4 A0B;
    public String A0C;
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);
    public final String A0D = MSV.A00(1632);
    public final boolean A0F = true;
    public final boolean A0G = true;

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38928HCb.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(int i) {
        String str;
        View view = this.A01;
        if (view == null) {
            str = "musicPlayer";
        } else {
            view.setVisibility(i);
            C42793IwV c42793IwV = this.A07;
            if (c42793IwV == null) {
                str = "trackCoverReelHolder";
            } else {
                c42793IwV.A00.setVisibility(i);
                TextView textView = this.A03;
                if (textView == null) {
                    str = "trackTitle";
                } else {
                    textView.setVisibility(i);
                    View view2 = this.A00;
                    if (view2 == null) {
                        str = "artistInfoContainer";
                    } else {
                        view2.setVisibility(i);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A0F;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.JHC
    public final void DUd() {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A09;
        if (musicOverlayStickerModel != null) {
            INZ.A00(this, AbstractC166987dD.A0r(this.A0E), musicOverlayStickerModel, this.A0D, "music_preview_song_play");
        }
    }

    @Override // X.JHC
    public final void DUe() {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A09;
        if (musicOverlayStickerModel != null) {
            INZ.A00(this, AbstractC166987dD.A0r(this.A0E), musicOverlayStickerModel, this.A0D, "music_preview_song_pause");
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0D;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return this.A0G;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1616765446);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString(AbstractC111324zv.A00(4943));
            this.A0C = bundle2.getString("source_media_id");
            if (string != null) {
                try {
                    this.A09 = C4A1.parseFromJson(C07950bF.A04.A01(AbstractC166987dD.A0r(this.A0E), string));
                } catch (IOException unused) {
                    C0w9.A03(__redex_internal_original_name, "Could not parse json MusicOverlayStickerModel for the Clips consumption sheet");
                    C0f9.A09(-1279039045, A02);
                    return;
                }
            }
            MusicOverlayStickerModel musicOverlayStickerModel = this.A09;
            if (musicOverlayStickerModel != null) {
                AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0E);
                String str = musicOverlayStickerModel.A0S;
                if (str == null) {
                    str = "";
                }
                C25621Ms A0C = AbstractC31179DnN.A0C(A0o);
                A0C.A0B("music/music_reels_media/");
                try {
                    AbstractC37303Gc4.A12(AbstractC221915u.A00, A0C, AbstractC37300Gc1.A0O(), str, "reel_ids");
                } catch (IOException unused2) {
                    C0w9.A03("ReelApiUtil.createReelsTrayRequestTask", "IOException");
                }
                C1ON A0e = AbstractC25227BEk.A0e(A0C, C38875H9x.class, C41310IPz.class);
                A0e.A00 = new C39017HFt(musicOverlayStickerModel.A04, this);
                schedule(A0e);
            }
            C0f9.A09(-1916865932, A02);
            return;
        }
        IllegalStateException A14 = AbstractC166987dD.A14("No arguments specified");
        C0f9.A09(555476260, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1364031314);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_music_consumption_sheet, false);
        C0f9.A09(732478260, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(116081706);
        super.onPause();
        C42739IvZ c42739IvZ = this.A06;
        if (c42739IvZ != null) {
            c42739IvZ.A0B.release();
        }
        C677733r c677733r = this.A0A;
        if (c677733r != null) {
            c677733r.A00();
        }
        C0f9.A09(-1786730514, A02);
    }
}
