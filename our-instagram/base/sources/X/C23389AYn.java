package X;

/* renamed from: X.AYn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23389AYn implements InterfaceC176157sY {
    public final /* synthetic */ InterfaceC176207sd A00;
    public final /* synthetic */ C176177sa A01;

    public C23389AYn(InterfaceC176207sd interfaceC176207sd, C176177sa c176177sa) {
        this.A01 = c176177sa;
        this.A00 = interfaceC176207sd;
    }

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        C176177sa c176177sa = this.A01;
        c176177sa.A0C.A01("pAPe");
        C177527um c177527um = c176177sa.A05;
        if (c177527um != null) {
            abstractC223559ty.A01(c177527um.A00());
        }
        c176177sa.release();
        try {
            abstractC223559ty.A00("supported_configs", AMJ.A02(AMJ.A03()));
        } catch (Exception unused) {
        }
        c176177sa.A0F.Cl9(abstractC223559ty, "prepare_recording_audio_failed", "AudioRecordingTrack", "", "prepareAudioPipeline", null, AbstractC166987dD.A0M(c176177sa));
        this.A00.onError(abstractC223559ty);
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        this.A01.A0C.A01("pAPs");
        this.A00.onSuccess();
    }
}
