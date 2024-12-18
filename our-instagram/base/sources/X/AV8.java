package X;

/* loaded from: classes4.dex */
public final class AV8 implements InterfaceC175967sB {
    public final /* synthetic */ AVC A00;

    public AV8(AVC avc) {
        this.A00 = avc;
    }

    @Override // X.InterfaceC175967sB
    public final int DMG(C73493YFw c73493YFw) {
        AVC avc = this.A00;
        AM5 am5 = avc.A00;
        if (am5 != null) {
            return am5.A03(c73493YFw);
        }
        avc.A04.ClA(new C212399b8("Attempted to fill audio buffer with no audio pipeline present"), "inprogress_recording_audio_failure", "LegacyAudioPipeline", "", "high", "onInputBufferReady", AbstractC166987dD.A0M(avc));
        return 1;
    }
}
