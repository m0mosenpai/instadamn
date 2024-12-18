package X;

import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Gn6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37964Gn6 implements JIN {
    public TrackMetadata A00;
    public MusicDataSource A01;
    public boolean A02;
    public EnumC185288Jt A03;
    public String A04;
    public final TrackData A05;
    public final TrackData A06;
    public final String A07;

    @Override // X.JIN
    public final boolean ABI() {
        return this.A06.getAllowsSaving();
    }

    @Override // X.JIN
    public final String Aal() {
        return this.A04;
    }

    @Override // X.JIN
    public final EnumC185288Jt Adn() {
        return this.A03;
    }

    @Override // X.JIN
    public final ImageUrl AsR() {
        return this.A06.AsF();
    }

    @Override // X.JIN
    public final ImageUrl AsT() {
        ImageUrl AsE = this.A06.AsE();
        if (AsE != null) {
            return AsE;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.JIN
    public final String Ay3() {
        return this.A06.AvV();
    }

    @Override // X.JIN
    public final String AyY() {
        Long AyX;
        TrackMetadata trackMetadata = this.A00;
        if (trackMetadata != null && (AyX = trackMetadata.AyX()) != null) {
            return AyX.toString();
        }
        return null;
    }

    @Override // X.JIN
    public final List BE6() {
        return this.A06.BE6();
    }

    @Override // X.JIN
    public final MusicDataSource BVb() {
        MusicDataSource musicDataSource = this.A01;
        if (musicDataSource != null) {
            return musicDataSource;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JIN
    public final Integer Bg7() {
        TrackMetadata trackMetadata = this.A00;
        if (trackMetadata != null) {
            return trackMetadata.Bg7();
        }
        return null;
    }

    @Override // X.JIN
    public final String CAA() {
        String dashManifest = this.A06.getDashManifest();
        if (dashManifest != null) {
            return dashManifest;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JIN
    public final int CAB() {
        Integer Azi = this.A06.Azi();
        if (Azi != null) {
            return Azi.intValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.JIN
    public final String CAL() {
        String progressiveDownloadUrl = this.A06.getProgressiveDownloadUrl();
        if (progressiveDownloadUrl != null) {
            return progressiveDownloadUrl;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JIN
    public final Integer CAx() {
        TrackMetadata trackMetadata = this.A00;
        if (trackMetadata != null) {
            return trackMetadata.CAx();
        }
        return null;
    }

    @Override // X.JIN
    public final AudioType CBi() {
        return AudioType.A03;
    }

    @Override // X.JIN
    public final boolean CLE() {
        Boolean BC4 = this.A06.BC4();
        if (BC4 != null) {
            return BC4.booleanValue();
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 == 0) goto L6;
     */
    @Override // X.JIN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CSb() {
        /*
            r2 = this;
            com.instagram.api.schemas.TrackData r0 = r2.A06
            java.lang.String r0 = r0.AvV()
            if (r0 == 0) goto Lf
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L10
        Lf:
            r0 = 1
        L10:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37964Gn6.CSb():boolean");
    }

    @Override // X.JIN
    public final boolean CTc() {
        return AbstractC167007dF.A1T(this.A06.CTb());
    }

    @Override // X.JIN
    public final boolean Ceq() {
        TrackMetadata trackMetadata;
        TrackMetadata trackMetadata2;
        if (!this.A02 && ((trackMetadata = this.A00) == null || trackMetadata.Cer() == null || (trackMetadata2 = this.A00) == null || !C14360o3.A0K(trackMetadata2.Cer(), true))) {
            return false;
        }
        return true;
    }

    @Override // X.JIN
    public final String getArtistId() {
        return this.A06.getArtistId();
    }

    @Override // X.JIN
    public final String getAudioClusterId() {
        String audioClusterId = this.A06.getAudioClusterId();
        if (audioClusterId != null) {
            return audioClusterId;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.JIN
    public final String getDisplayArtist() {
        return this.A07;
    }

    @Override // X.JIN
    public final String getFormattedClipsMediaCount() {
        TrackMetadata trackMetadata = this.A00;
        if (trackMetadata != null) {
            return trackMetadata.getFormattedClipsMediaCount();
        }
        return null;
    }

    @Override // X.JIN
    public final String getId() {
        return this.A06.getId();
    }

    @Override // X.JIN
    public final String getTitle() {
        String title = this.A06.getTitle();
        if (title != null) {
            return title;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.JIN
    public final boolean isBookmarked() {
        TrackMetadata trackMetadata = this.A00;
        if (trackMetadata != null) {
            return trackMetadata.isBookmarked();
        }
        return false;
    }

    @Override // X.JIN
    public final boolean isEligibleForAudioEffects() {
        Boolean CT1 = this.A06.CT1();
        if (CT1 != null) {
            return CT1.booleanValue();
        }
        return false;
    }

    @Override // X.JIN
    public final boolean isExplicit() {
        return this.A06.isExplicit();
    }

    public C37964Gn6(TrackData trackData) {
        this.A06 = trackData;
        this.A05 = trackData;
        if (trackData.getProgressiveDownloadUrl() == null && trackData.getDashManifest() == null) {
            String format = String.format(AbstractC111324zv.A00(667), Arrays.copyOf(new Object[]{trackData.getId()}, 1));
            C14360o3.A07(format);
            AbstractC12120kG.A05("MusicSearchTrack", format, null);
        } else {
            this.A01 = new MusicDataSource(null, AudioType.A03, trackData.getProgressiveDownloadUrl(), trackData.getDashManifest(), getAudioClusterId(), trackData.getArtistId());
        }
        String displayArtist = trackData.getDisplayArtist();
        if (displayArtist != null) {
            this.A07 = displayArtist;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.JIN
    public final String BgD() {
        return getAudioClusterId();
    }

    @Override // X.JIN
    public final void EPU(String str) {
        this.A04 = str;
    }

    @Override // X.JIN
    public final void EPw(EnumC185288Jt enumC185288Jt) {
        this.A03 = enumC185288Jt;
    }
}
