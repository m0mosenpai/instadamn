package X;

import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IvT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42733IvT implements JIN {
    public EnumC185288Jt A00;
    public String A01;
    public final OriginalSoundDataIntf A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(C43198J7v.A00);

    @Override // X.JIN
    public final boolean ABI() {
        return false;
    }

    @Override // X.JIN
    public final String Ay3() {
        return null;
    }

    @Override // X.JIN
    public final boolean CLE() {
        return false;
    }

    @Override // X.JIN
    public final boolean CSb() {
        return false;
    }

    @Override // X.JIN
    public final boolean CTc() {
        return false;
    }

    @Override // X.JIN
    public final String getAudioClusterId() {
        return "";
    }

    @Override // X.JIN
    public final boolean isExplicit() {
        return false;
    }

    @Override // X.JIN
    public final String Aal() {
        return this.A01;
    }

    @Override // X.JIN
    public final EnumC185288Jt Adn() {
        return this.A00;
    }

    @Override // X.JIN
    public final ImageUrl AsR() {
        return this.A02.BFU().Bhu();
    }

    @Override // X.JIN
    public final ImageUrl AsT() {
        return this.A02.BFU().Bhu();
    }

    @Override // X.JIN
    public final String AyY() {
        String AyY = this.A02.AqX().AyY();
        if (AyY == null) {
            return "";
        }
        return AyY;
    }

    @Override // X.JIN
    public final /* bridge */ /* synthetic */ List BE6() {
        return (ArrayList) this.A03.getValue();
    }

    @Override // X.JIN
    public final MusicDataSource BVb() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A02;
        return new MusicDataSource(null, AudioType.A04, originalSoundDataIntf.getProgressiveDownloadUrl(), originalSoundDataIntf.getDashManifest(), originalSoundDataIntf.getAudioAssetId(), getArtistId());
    }

    @Override // X.JIN
    public final Integer Bg7() {
        return this.A02.Bg7();
    }

    @Override // X.JIN
    public final String BgD() {
        return this.A02.getAudioAssetId();
    }

    @Override // X.JIN
    public final String CAA() {
        return this.A02.getDashManifest();
    }

    @Override // X.JIN
    public final int CAB() {
        return AbstractC167017dG.A0K(this.A02.Azi());
    }

    @Override // X.JIN
    public final String CAL() {
        return this.A02.getProgressiveDownloadUrl();
    }

    @Override // X.JIN
    public final Integer CAx() {
        return this.A02.CAx();
    }

    @Override // X.JIN
    public final AudioType CBi() {
        return AudioType.A04;
    }

    @Override // X.JIN
    public final boolean Ceq() {
        return this.A02.AqX().isTrendingInClips();
    }

    @Override // X.JIN
    public final String getArtistId() {
        return this.A02.BFU().getId();
    }

    @Override // X.JIN
    public final String getDisplayArtist() {
        return this.A02.BFU().getUsername();
    }

    @Override // X.JIN
    public final String getFormattedClipsMediaCount() {
        return this.A02.getFormattedClipsMediaCount();
    }

    @Override // X.JIN
    public final String getId() {
        return this.A02.getAudioAssetId();
    }

    @Override // X.JIN
    public final String getTitle() {
        return this.A02.getOriginalAudioTitle();
    }

    @Override // X.JIN
    public final boolean isBookmarked() {
        return this.A02.AqX().isBookmarked();
    }

    @Override // X.JIN
    public final boolean isEligibleForAudioEffects() {
        return AbstractC167007dF.A1T(this.A02.CT1());
    }

    public C42733IvT(OriginalSoundDataIntf originalSoundDataIntf) {
        this.A02 = originalSoundDataIntf;
    }

    @Override // X.JIN
    public final void EPU(String str) {
        this.A01 = str;
    }

    @Override // X.JIN
    public final void EPw(EnumC185288Jt enumC185288Jt) {
        this.A00 = enumC185288Jt;
    }
}
