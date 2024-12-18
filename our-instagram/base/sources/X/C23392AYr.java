package X;

import java.util.HashMap;

/* renamed from: X.AYr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23392AYr implements InterfaceC176157sY {
    public final /* synthetic */ InterfaceC176157sY A00;
    public final /* synthetic */ C176247sh A01;

    public C23392AYr(InterfaceC176157sY interfaceC176157sY, C176247sh c176247sh) {
        this.A01 = c176247sh;
        this.A00 = interfaceC176157sY;
    }

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        this.A01.release();
        this.A00.DE8(abstractC223559ty);
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        C176247sh c176247sh = this.A01;
        c176247sh.A0G = 2;
        InterfaceC176037sM interfaceC176037sM = c176247sh.A0D;
        interfaceC176037sM.Ckz(19, "recording_stop_video_finished");
        HashMap A1G = AbstractC166987dD.A1G();
        C23417AZq c23417AZq = c176247sh.A05;
        if (c23417AZq != null) {
            C23014ACo c23014ACo = c23417AZq.A01;
            A1G.put("capture_size", AnonymousClass001.A0P("x", c23014ACo.A05, c23014ACo.A04));
        }
        interfaceC176037sM.Cl9(null, "stop_recording_video_finished", "AbstractVideoRecordingTrack", "", null, A1G, AbstractC166987dD.A0M(c176247sh));
        c176247sh.release();
        this.A00.onSuccess();
    }
}
