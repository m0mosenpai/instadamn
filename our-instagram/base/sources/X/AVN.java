package X;

/* loaded from: classes4.dex */
public final class AVN implements InterfaceC176207sd {
    public final /* synthetic */ InterfaceC176207sd A00;
    public final /* synthetic */ C176177sa A01;

    public AVN(InterfaceC176207sd interfaceC176207sd, C176177sa c176177sa) {
        this.A01 = c176177sa;
        this.A00 = interfaceC176207sd;
    }

    @Override // X.InterfaceC176207sd
    public final void onError(Throwable th) {
        C176177sa c176177sa = this.A01;
        c176177sa.A0C.A01("pAEe");
        C212409b9 c212409b9 = new C212409b9(th);
        C177527um c177527um = c176177sa.A05;
        if (c177527um != null) {
            c212409b9.A01(c177527um.A00());
        }
        c176177sa.release();
        try {
            c212409b9.A00("supported_configs", AMJ.A02(AMJ.A03()));
        } catch (Exception unused) {
        }
        c176177sa.A0F.Cl9(c212409b9, "prepare_recording_audio_failed", "AudioRecordingTrack", "", "prepareEncoder", null, AbstractC166987dD.A0M(c176177sa));
        this.A00.onError(th);
    }

    @Override // X.InterfaceC176207sd
    public final void onSuccess() {
        this.A01.A0C.A01("pAEs");
        this.A00.onSuccess();
    }
}
