package X;

import java.util.LinkedList;

/* renamed from: X.AYs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23393AYs implements InterfaceC176157sY {
    public final int A00;
    public final Object A01;

    public C23393AYs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        String str;
        C24201AoO c24201AoO;
        String str2;
        switch (this.A00) {
            case 0:
                AVO avo = (AVO) this.A01;
                C176177sa c176177sa = avo.A01;
                c176177sa.A0C.A01("aoAPe");
                c176177sa.release();
                c176177sa.A0F.Cl9(abstractC223559ty, "start_recording_audio_failed", "AudioRecordingTrack", "", "start", null, AbstractC166987dD.A0M(c176177sa));
                avo.A00.DE8(abstractC223559ty);
                return;
            case 1:
                ACK ack = (ACK) this.A01;
                synchronized (ack) {
                    ack.A02 = true;
                    AD8.A00(ack.A03, abstractC223559ty, ack.A04);
                    while (true) {
                        LinkedList linkedList = ack.A05;
                        if (!linkedList.isEmpty()) {
                            ((Runnable) linkedList.pop()).run();
                        }
                    }
                }
                return;
            case 2:
                return;
            case 3:
                if (abstractC223559ty != null) {
                    str = abstractC223559ty.getMessage();
                } else {
                    str = null;
                }
                C0K8.A0C("IGDOneCameraVoiceRecorder", AnonymousClass001.A0R("Error starting audio recorder: ", str));
                c24201AoO = (C24201AoO) this.A01;
                c24201AoO.A02 = null;
                c24201AoO.A04 = false;
                c24201AoO.A06.A01();
                return;
            default:
                if (abstractC223559ty != null) {
                    str2 = abstractC223559ty.getMessage();
                } else {
                    str2 = null;
                }
                C0K8.A0C("IGDOneCameraVoiceRecorder", AnonymousClass001.A0R("Error stopping audio recorder: ", str2));
                c24201AoO = (C24201AoO) this.A01;
                c24201AoO.A03 = false;
                c24201AoO.A06.A01();
                return;
        }
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                AVO avo = (AVO) this.A01;
                C176177sa c176177sa = avo.A01;
                c176177sa.A0C.A01("aoAPs");
                InterfaceC176037sM interfaceC176037sM = c176177sa.A0F;
                interfaceC176037sM.Ckz(19, "recording_start_audio_ready");
                interfaceC176037sM.Cl9(null, "start_recording_audio_finished", "AudioRecordingTrack", "", null, null, AbstractC166987dD.A0M(c176177sa));
                avo.A00.onSuccess();
                return;
            case 1:
                ACK ack = (ACK) this.A01;
                synchronized (ack) {
                    int addAndGet = ack.A06.addAndGet(1);
                    if (!ack.A02 && ack.A01 && addAndGet == ack.A00) {
                        AD8.A01(ack.A04, ack.A03);
                    }
                }
                return;
            case 2:
                C24201AoO c24201AoO = (C24201AoO) this.A01;
                c24201AoO.A04 = false;
                c24201AoO.Eoe(false);
                c24201AoO.A05.post(new RunnableC24506AtP(c24201AoO));
                return;
            default:
                return;
        }
    }
}
