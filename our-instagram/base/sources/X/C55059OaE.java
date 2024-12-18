package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.OaE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55059OaE {
    public final InterfaceC74953Yl A00;
    public final InterfaceC678133v A01;
    public final boolean A02;

    public C55059OaE(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, boolean z) {
        AbstractC25233BEq.A0v(1, interfaceC60442pS, context, userSession);
        this.A02 = z;
        this.A00 = AbstractC25230BEn.A0U(AbstractC166997dE.A0a());
        this.A01 = AbstractC677833s.A00(context, userSession, interfaceC60442pS, new C677733r(context, userSession), "WallMusicPreview", true);
    }

    public static final void A00(AudioOverlayTrack audioOverlayTrack, C55059OaE c55059OaE) {
        boolean z = c55059OaE.A02;
        InterfaceC678133v interfaceC678133v = c55059OaE.A01;
        if (z) {
            interfaceC678133v.seekTo(audioOverlayTrack.A03);
            if (interfaceC678133v.CLN()) {
                interfaceC678133v.E4S();
                return;
            } else {
                A01(audioOverlayTrack, c55059OaE);
                return;
            }
        }
        interfaceC678133v.EJa(false);
    }

    public static final void A01(AudioOverlayTrack audioOverlayTrack, C55059OaE c55059OaE) {
        InterfaceC678133v interfaceC678133v = c55059OaE.A01;
        if (!interfaceC678133v.CLN() || interfaceC678133v.isPlaying()) {
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel == null) {
                return;
            }
            int i = audioOverlayTrack.A03;
            interfaceC678133v.ESz(new MusicDataSource(null, AudioType.A03, musicAssetModel.A0H, musicAssetModel.A0C, audioOverlayTrack.A0A, musicAssetModel.A0A), new C46022KYn(i, 1, audioOverlayTrack, c55059OaE), null, 0, -1, -1, false, false);
            interfaceC678133v.seekTo(i);
        }
        interfaceC678133v.E4S();
        AbstractC25227BEk.A1A(c55059OaE.A00, true);
    }

    public final void A02() {
        InterfaceC678133v interfaceC678133v = this.A01;
        if (interfaceC678133v.isPlaying()) {
            AbstractC25227BEk.A1A(this.A00, false);
            interfaceC678133v.pause();
            interfaceC678133v.release();
        }
    }
}
