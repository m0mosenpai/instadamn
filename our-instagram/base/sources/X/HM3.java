package X;

import com.instagram.music.common.model.MusicDataSource;

/* loaded from: classes7.dex */
public final class HM3 extends AbstractC42732IvS {
    public final MusicDataSource A00;
    public final String A01;
    public final boolean A02;

    public HM3(MusicDataSource musicDataSource, String str, boolean z) {
        C14360o3.A0B(musicDataSource, 1);
        this.A00 = musicDataSource;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // X.InterfaceC88573xF
    public final MusicDataSource BVb() {
        return this.A00;
    }

    @Override // X.InterfaceC88563xE
    public final boolean Ej0() {
        return this.A02;
    }

    @Override // X.InterfaceC88563xE
    public final String getShouldMuteAudioReason() {
        return this.A01;
    }
}
