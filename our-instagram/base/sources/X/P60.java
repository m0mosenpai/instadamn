package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;

/* loaded from: classes9.dex */
public final class P60 implements InterfaceC150336ph {
    public int A00;
    public int A01;
    public final InterfaceC678133v A02;
    public final N7P A03;

    public P60(Context context, UserSession userSession, N7P n7p, C677733r c677733r) {
        C14360o3.A0B(userSession, 2);
        this.A02 = AbstractC677833s.A00(context, userSession, null, c677733r, "ClipsDurationPickerMusicPlayer", AbstractC677833s.A02(userSession));
        this.A03 = n7p;
    }

    public final void A00(AudioOverlayTrack audioOverlayTrack, MusicAssetModel musicAssetModel, int i, int i2, int i3) {
        AudioType audioType;
        MusicDataSource musicDataSource;
        AudioType audioType2;
        InterfaceC678133v interfaceC678133v = this.A02;
        if (!interfaceC678133v.CLN()) {
            DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
            if (downloadedTrack != null && audioOverlayTrack.A01()) {
                android.net.Uri A03 = AbstractC08820cl.A03(downloadedTrack.A02);
                String str = musicAssetModel.A0E;
                String str2 = musicAssetModel.A0A;
                if (musicAssetModel.A0U) {
                    audioType2 = AudioType.A04;
                } else {
                    audioType2 = AudioType.A03;
                }
                musicDataSource = new MusicDataSource(A03, audioType2, null, null, str, str2);
            } else {
                String str3 = musicAssetModel.A0H;
                String str4 = musicAssetModel.A0C;
                String str5 = musicAssetModel.A0E;
                String str6 = musicAssetModel.A0A;
                if (musicAssetModel.A0U) {
                    audioType = AudioType.A04;
                } else {
                    audioType = AudioType.A03;
                }
                musicDataSource = new MusicDataSource(null, audioType, str3, str4, str5, str6);
            }
            interfaceC678133v.ESz(musicDataSource, this, null, 0, -1, -1, false, false);
        }
        int i4 = audioOverlayTrack.A03 + i;
        this.A01 = i4;
        int i5 = i4 + i2;
        this.A00 = i5;
        interfaceC678133v.seekTo(AbstractC13600mm.A03(i4 + i3, i4, i5));
        interfaceC678133v.E4S();
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlaybackStarted() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackSeekComplete() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStartedPlaying() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackCompleted() {
        InterfaceC678133v interfaceC678133v = this.A02;
        if (interfaceC678133v.CLN()) {
            interfaceC678133v.seekTo(this.A01);
            interfaceC678133v.E4S();
        }
    }

    @Override // X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        N7P n7p = this.A03;
        int i2 = this.A01;
        float f = (i - i2) / (this.A00 - i2);
        InterfaceC57940Pmk interfaceC57940Pmk = n7p.A07;
        if (interfaceC57940Pmk == null) {
            C14360o3.A0F("durationPicker");
            throw C00O.createAndThrow();
        }
        interfaceC57940Pmk.setProgress(f);
        if (i > this.A00) {
            this.A02.seekTo(this.A01);
        }
    }
}
