package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7sU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176117sU {
    public final Handler A00;
    public final Handler A01;
    public final C175877s1 A02;
    public final InterfaceC176037sM A03;
    public final C176097sS A04;
    public final AtomicBoolean A05;
    public final AtomicBoolean A06;

    public static String A00(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown message" : "MSG_RELEASE" : "MSG_STOP_RECORDING" : "MSG_PREPARE_AND_START_RECORDING" : "MSG_START_RECORDING" : "MSG_PREPARE";
    }

    public final void A01() {
        Handler handler = this.A00;
        if (!handler.hasMessages(5)) {
            handler.removeCallbacksAndMessages(null);
            this.A06.set(true);
            this.A03.Cl9(null, "stop_recording_requested", "RecordingControllerImpl", "", null, null, hashCode());
            handler.sendMessage(handler.obtainMessage(4, new Object[0]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.9ty, X.9b9] */
    public final void A02(AGI agi, InterfaceC25203BDb interfaceC25203BDb, List list) {
        if (this.A05.compareAndSet(false, true)) {
            Object[] objArr = {list, agi, new C23414AZn(interfaceC25203BDb, this, this.A04.A02())};
            Handler handler = this.A00;
            handler.sendMessage(handler.obtainMessage(3, objArr));
        } else {
            ?? abstractC223559ty = new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Duplicated START request");
            this.A03.ClA(abstractC223559ty, "recording_controller_error", "RecordingControllerImpl", "", "high", "startRecording", hashCode());
            interfaceC25203BDb.D2K(abstractC223559ty);
        }
    }

    public final void A03(InterfaceC176187sb interfaceC176187sb) {
        this.A04.A05.put(interfaceC176187sb.CBK(), interfaceC176187sb);
    }

    public C176117sU(C175877s1 c175877s1, InterfaceC176037sM interfaceC176037sM, C176097sS c176097sS) {
        this.A04 = c176097sS;
        this.A03 = interfaceC176037sM;
        this.A02 = c175877s1;
        Handler A01 = C175907s4.A01("RecordingThread");
        this.A01 = A01;
        c176097sS.A02 = A01;
        this.A00 = C175907s4.A00(new C176127sV(A01, interfaceC176037sM, this), C175907s4.A02, "RecordingControllerMessageThread", 0);
        this.A06 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
    }
}
