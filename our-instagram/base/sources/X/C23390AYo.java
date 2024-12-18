package X;

import java.util.Map;

/* renamed from: X.AYo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23390AYo implements InterfaceC176157sY {
    public final /* synthetic */ InterfaceC176157sY A00;
    public final /* synthetic */ C176177sa A01;

    public C23390AYo(InterfaceC176157sY interfaceC176157sY, C176177sa c176177sa) {
        this.A01 = c176177sa;
        this.A00 = interfaceC176157sY;
    }

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        C176177sa c176177sa = this.A01;
        c176177sa.A0C.A01("roAPe");
        c176177sa.release();
        Map Avx = c176177sa.A0B.Avx();
        if (Avx != null) {
            abstractC223559ty.A01(Avx);
        }
        this.A00.DE8(abstractC223559ty);
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        C176177sa c176177sa = this.A01;
        c176177sa.A0I = 1;
        C175927s7 c175927s7 = c176177sa.A0C;
        c175927s7.A01("roAPs");
        if (c176177sa.A03 != null) {
            c175927s7.A01("sAE");
            c176177sa.A03.EoU(c176177sa.A0A, new AVQ(this, 0));
            return;
        }
        c175927s7.A01("sAEn");
        AbstractC223559ty abstractC223559ty = null;
        if (!c176177sa.A09) {
            abstractC223559ty = new AbstractC223559ty(22000, "mAudioEncoder is null while stopping");
            c176177sa.A0F.Cl9(abstractC223559ty, "stop_recording_audio_failed", "AudioRecordingTrack", "", "stop", null, AbstractC166987dD.A0M(c176177sa));
        }
        c176177sa.release();
        InterfaceC176157sY interfaceC176157sY = this.A00;
        if (abstractC223559ty != null) {
            interfaceC176157sY.DE8(abstractC223559ty);
        } else {
            interfaceC176157sY.onSuccess();
        }
    }
}
