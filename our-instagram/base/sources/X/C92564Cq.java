package X;

import com.instagram.music.common.model.MusicConsumptionModel;

/* renamed from: X.4Cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92564Cq implements InterfaceC88563xE {
    public final String A00;
    public final /* synthetic */ MusicConsumptionModel A01;

    public C92564Cq(MusicConsumptionModel musicConsumptionModel) {
        this.A01 = musicConsumptionModel;
        this.A00 = musicConsumptionModel.getShouldMuteAudioReason();
    }

    @Override // X.InterfaceC88563xE
    public final boolean Ej0() {
        return this.A01.getShouldMuteAudio();
    }

    @Override // X.InterfaceC88563xE
    public final String getShouldMuteAudioReason() {
        return this.A00;
    }
}
