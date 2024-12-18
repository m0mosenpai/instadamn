package X;

import android.content.Context;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88543xC implements InterfaceC88553xD {
    public final MusicInfo A00;
    public final AudioType A01 = AudioType.A03;

    @Override // X.InterfaceC88553xD
    public final boolean CS2() {
        return false;
    }

    @Override // X.InterfaceC88553xD
    public final boolean Cat(String str) {
        return true;
    }

    @Override // X.InterfaceC88553xD
    public final String AD3(Context context) {
        String title = this.A00.BVV().getTitle();
        if (title == null) {
            return "";
        }
        return title;
    }

    @Override // X.InterfaceC88553xD
    public final User Ade() {
        return this.A00.BVa().BFU();
    }

    @Override // X.InterfaceC88553xD
    public final ImageUrl Adk() {
        return this.A00.BVV().AsF();
    }

    @Override // X.InterfaceC88553xD
    public final List Adv() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC88553xD
    public final List Adw() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC88553xD
    public final OriginalAudioSubtype Ae4() {
        return OriginalAudioSubtype.A05;
    }

    @Override // X.InterfaceC88553xD
    public final AudioType Ae7() {
        return this.A01;
    }

    @Override // X.InterfaceC88553xD
    public final List AyW() {
        return this.A00.BVa().AyW();
    }

    @Override // X.InterfaceC88573xF
    public final MusicDataSource BVb() {
        MusicInfo musicInfo = this.A00;
        return new MusicDataSource(null, this.A01, musicInfo.BVV().getProgressiveDownloadUrl(), musicInfo.BVV().getDashManifest(), getAssetId(), getArtistId());
    }

    @Override // X.InterfaceC88553xD
    public final String BZi() {
        return null;
    }

    @Override // X.InterfaceC88553xD
    public final MusicMuteAudioReason BvC() {
        return this.A00.BVa().BvC();
    }

    @Override // X.InterfaceC88553xD
    public final Integer CAx() {
        return this.A00.BVa().CAx();
    }

    @Override // X.InterfaceC88553xD
    public final boolean CQ9() {
        Boolean CQj = this.A00.BVa().CQj();
        if (CQj != null) {
            return CQj.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC88553xD
    public final boolean CQA() {
        return this.A00.BVV().isExplicit();
    }

    @Override // X.InterfaceC88553xD
    public final boolean Ceq() {
        Boolean Cer = this.A00.BVa().Cer();
        if (Cer != null) {
            return Cer.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC88553xD
    public final boolean CfD() {
        Boolean AbG = this.A00.BVa().AbG();
        if (AbG != null) {
            return AbG.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC88553xD
    public final MusicAttributionConfig Cq1(Context context) {
        int intValue;
        List BE6;
        MusicInfo musicInfo = this.A00;
        Number Adg = musicInfo.BVa().Adg();
        boolean z = false;
        if (Adg != null || ((BE6 = musicInfo.BVV().BE6()) != null && (Adg = (Number) AbstractC001800i.A0O(BE6, 0)) != null)) {
            intValue = Adg.intValue();
        } else {
            intValue = 0;
        }
        MusicAssetModel A00 = AbstractC37941Gme.A00(musicInfo.BVV());
        boolean Ej0 = Ej0();
        String shouldMuteAudioReason = musicInfo.BVa().getShouldMuteAudioReason();
        Boolean AbG = musicInfo.BVa().AbG();
        if (AbG != null) {
            z = AbG.booleanValue();
        }
        return new MusicAttributionConfig(null, A00, null, shouldMuteAudioReason, intValue, Ej0, z);
    }

    @Override // X.InterfaceC88563xE
    public final boolean Ej0() {
        return this.A00.BVa().getShouldMuteAudio();
    }

    @Override // X.InterfaceC88553xD
    public final String getAssetId() {
        String audioClusterId = this.A00.BVV().getAudioClusterId();
        if (audioClusterId == null) {
            return "";
        }
        return audioClusterId;
    }

    @Override // X.InterfaceC88553xD
    public final String getAudioAssetId() {
        return this.A00.BVV().getId();
    }

    @Override // X.InterfaceC88563xE
    public final String getShouldMuteAudioReason() {
        return this.A00.BVa().getShouldMuteAudioReason();
    }

    @Override // X.InterfaceC88553xD
    public final boolean isEligibleForAudioEffects() {
        Boolean CT1 = this.A00.BVV().CT1();
        if (CT1 != null) {
            return CT1.booleanValue();
        }
        return false;
    }

    public C88543xC(MusicInfo musicInfo) {
        this.A00 = musicInfo;
    }

    @Override // X.InterfaceC88553xD
    public final String Ach() {
        User Ade = Ade();
        if (Ade != null) {
            return Ade.getUsername();
        }
        String displayArtist = this.A00.BVV().getDisplayArtist();
        if (displayArtist != null) {
            return displayArtist;
        }
        return "";
    }

    @Override // X.InterfaceC88553xD
    public final long Adf() {
        return Long.parseLong(getAudioAssetId());
    }

    @Override // X.InterfaceC88553xD
    public final boolean CQ8() {
        User Ade = Ade();
        if (Ade != null) {
            return Ade.isVerified();
        }
        return false;
    }

    @Override // X.InterfaceC88553xD
    public final String getArtistId() {
        User Ade = Ade();
        if (Ade != null) {
            return Ade.getId();
        }
        return this.A00.BVV().getArtistId();
    }
}
