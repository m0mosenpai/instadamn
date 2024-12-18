package X;

import org.webrtc.HardwareVideoEncoderFactory;

/* loaded from: classes4.dex */
public final class AVQ implements InterfaceC176207sd {
    public final int A00;
    public final Object A01;

    public AVQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC176207sd
    public final void onError(Throwable th) {
        switch (this.A00) {
            case 0:
                C23390AYo c23390AYo = (C23390AYo) this.A01;
                C176177sa c176177sa = c23390AYo.A01;
                c176177sa.A0C.A01("sAEe");
                c176177sa.release();
                c23390AYo.A00.DE8(new C212409b9(th));
                return;
            case 1:
                AVV avv = ((C23420AZt) this.A01).A00;
                AbstractC72880XqE.A01(avv.A00, avv.A01, th);
                InterfaceC25159BBe interfaceC25159BBe = avv.A02;
                if (interfaceC25159BBe == null) {
                    return;
                }
                interfaceC25159BBe.onFinished();
                return;
            default:
                C24201AoO.A01((C24201AoO) this.A01, "Error preparing controller", th);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.9ty, X.9b9] */
    @Override // X.InterfaceC176207sd
    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                C23390AYo c23390AYo = (C23390AYo) this.A01;
                C176177sa c176177sa = c23390AYo.A01;
                c176177sa.A0I = 2;
                c176177sa.A0C.A01("sAEs");
                c176177sa.release();
                InterfaceC176037sM interfaceC176037sM = c176177sa.A0F;
                interfaceC176037sM.Ckz(19, "recording_stop_audio_finished");
                interfaceC176037sM.Cl9(null, "stop_recording_audio_finished", "AudioRecordingTrack", "", null, null, AbstractC166987dD.A0M(c176177sa));
                c23390AYo.A00.onSuccess();
                return;
            case 1:
                AVV avv = ((C23420AZt) this.A01).A00;
                AbstractC72880XqE.A00(avv.A00, avv.A01);
                InterfaceC25159BBe interfaceC25159BBe = avv.A02;
                if (interfaceC25159BBe == null) {
                    return;
                }
                interfaceC25159BBe.onFinished();
                return;
            default:
                C24201AoO c24201AoO = (C24201AoO) this.A01;
                C23393AYs c23393AYs = new C23393AYs(c24201AoO, 3);
                AM5 am5 = c24201AoO.A01;
                if (am5 != null) {
                    am5.A05(c23393AYs, c24201AoO.A05);
                }
                C176117sU c176117sU = c24201AoO.A06;
                C23393AYs c23393AYs2 = new C23393AYs(c24201AoO, 2);
                L33 l33 = c24201AoO.A02;
                if (l33 == null) {
                    l33 = new L33(c24201AoO.A08);
                    c24201AoO.A02 = l33;
                }
                AGI agi = new AGI(c23393AYs2, AbstractC166987dD.A11(l33.A01), true, C05F.A00, Long.valueOf(c24201AoO.A00 * 1000));
                C23412AZl c23412AZl = new C23412AZl(c24201AoO, 1);
                if (c176117sU.A05.compareAndSet(false, true)) {
                    AbstractC166997dE.A1H(c176117sU.A00, new Object[]{agi, new C23414AZn(c23412AZl, c176117sU, c176117sU.A04.A02())}, 2);
                    return;
                } else {
                    ?? abstractC223559ty = new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Duplicated START request");
                    c176117sU.A03.ClA(abstractC223559ty, "recording_controller_error", "RecordingControllerImpl", "", "high", "startRecording", AbstractC166987dD.A0M(c176117sU));
                    c23412AZl.D2K(abstractC223559ty);
                    return;
                }
        }
    }
}
