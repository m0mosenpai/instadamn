package X;

/* loaded from: classes4.dex */
public final class AVO implements InterfaceC176207sd {
    public final /* synthetic */ InterfaceC176157sY A00;
    public final /* synthetic */ C176177sa A01;

    public AVO(InterfaceC176157sY interfaceC176157sY, C176177sa c176177sa) {
        this.A01 = c176177sa;
        this.A00 = interfaceC176157sY;
    }

    @Override // X.InterfaceC176207sd
    public final void onError(Throwable th) {
        C176177sa c176177sa = this.A01;
        c176177sa.A0C.A01("stAEe");
        c176177sa.release();
        c176177sa.A0F.Cl9(new C212409b9(th), "start_recording_audio_failed", "AudioRecordingTrack", "", "start", null, AbstractC166987dD.A0M(c176177sa));
        this.A00.DE8(new C212409b9(th));
    }

    @Override // X.InterfaceC176207sd
    public final void onSuccess() {
        C176177sa c176177sa = this.A01;
        C175927s7 c175927s7 = c176177sa.A0C;
        c175927s7.A01("stAEs");
        c176177sa.A0J = false;
        c175927s7.A01("aoAP");
        InterfaceC176057sO interfaceC176057sO = c176177sa.A0B;
        C176217se c176217se = c176177sa.A0E;
        interfaceC176057sO.A9r(c176177sa.A0A, c176177sa.A01, c176177sa.A02, new C23393AYs(this, 0), c176217se);
    }
}
