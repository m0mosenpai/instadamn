package X;

import java.util.HashMap;

/* renamed from: X.AYt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23394AYt implements InterfaceC176157sY {
    public final /* synthetic */ InterfaceC176207sd A00;
    public final /* synthetic */ C176247sh A01;
    public final /* synthetic */ String A02;

    public C23394AYt(InterfaceC176207sd interfaceC176207sd, C176247sh c176247sh, String str) {
        this.A01 = c176247sh;
        this.A02 = str;
        this.A00 = interfaceC176207sd;
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        C176247sh c176247sh = this.A01;
        c176247sh.A08 = true;
        c176247sh.A09 = false;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("recording_video_encoder_mimetype", this.A02);
        InterfaceC176037sM interfaceC176037sM = c176247sh.A0D;
        interfaceC176037sM.Ckz(19, "recording_prepare_video_finished");
        interfaceC176037sM.Cl9(null, "prepare_recording_video_finished", "AbstractVideoRecordingTrack", "", null, A1G, AbstractC166987dD.A0M(c176247sh));
        this.A00.onSuccess();
    }

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("recording_video_encoder_mimetype", this.A02);
        C176247sh c176247sh = this.A01;
        c176247sh.A0D.Cl9(abstractC223559ty, AbstractC111324zv.A00(1179), "AbstractVideoRecordingTrack", "", "prepareEncoder", A1G, AbstractC166987dD.A0M(c176247sh));
        c176247sh.release();
        this.A00.onError(abstractC223559ty);
    }
}
