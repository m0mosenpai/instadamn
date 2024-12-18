package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.IvR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42731IvR implements InterfaceC88563xE {
    public final String A00;
    public final /* synthetic */ MusicOverlayStickerModel A01;

    public C42731IvR(MusicOverlayStickerModel musicOverlayStickerModel) {
        this.A01 = musicOverlayStickerModel;
        this.A00 = musicOverlayStickerModel.A0j;
    }

    @Override // X.InterfaceC88563xE
    public final boolean Ej0() {
        return this.A01.A0t;
    }

    @Override // X.InterfaceC88563xE
    public final String getShouldMuteAudioReason() {
        return this.A00;
    }
}
