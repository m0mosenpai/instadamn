package X;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AVR implements InterfaceC176207sd {
    public final /* synthetic */ InterfaceC176207sd A00;
    public final /* synthetic */ C176177sa A01;
    public final /* synthetic */ HashMap A02;

    public AVR(InterfaceC176207sd interfaceC176207sd, C176177sa c176177sa, HashMap hashMap) {
        this.A01 = c176177sa;
        this.A02 = hashMap;
        this.A00 = interfaceC176207sd;
    }

    @Override // X.InterfaceC176207sd
    public final void onError(Throwable th) {
        this.A00.onError(th);
    }

    @Override // X.InterfaceC176207sd
    public final void onSuccess() {
        C176177sa c176177sa = this.A01;
        c176177sa.A0C.A01("pATs");
        InterfaceC176037sM interfaceC176037sM = c176177sa.A0F;
        interfaceC176037sM.Ckz(19, "recording_prepare_audio_finished");
        interfaceC176037sM.Cl9(null, "prepare_recording_audio_finished", "AudioRecordingTrack", "", null, this.A02, AbstractC166987dD.A0M(c176177sa));
        c176177sa.A08 = true;
        c176177sa.A09 = false;
        this.A00.onSuccess();
    }
}
