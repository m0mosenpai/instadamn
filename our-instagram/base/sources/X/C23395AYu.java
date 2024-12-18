package X;

import com.facebook.cameracore.audiograph.AudioPipelineImpl;
import java.util.Iterator;

/* renamed from: X.AYu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23395AYu implements InterfaceC176157sY {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C23395AYu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        InterfaceC176157sY interfaceC176157sY;
        switch (this.A00) {
            case 0:
                ((AudioPipelineImpl) this.A01).mAudioRecorder = null;
                interfaceC176157sY = (InterfaceC176157sY) this.A02;
                break;
            case 1:
                interfaceC176157sY = (InterfaceC176157sY) this.A02;
                if (interfaceC176157sY == null) {
                    return;
                }
                break;
            case 2:
                AudioPipelineImpl audioPipelineImpl = (AudioPipelineImpl) this.A01;
                audioPipelineImpl.mAudioRecorder = null;
                InterfaceC176157sY interfaceC176157sY2 = (InterfaceC176157sY) this.A02;
                if (interfaceC176157sY2 != null) {
                    interfaceC176157sY2.DE8(abstractC223559ty);
                }
                if (audioPipelineImpl.mAudioRecorderThread == null) {
                    return;
                }
                C175907s4.A02(audioPipelineImpl.mAudioRecorderThread, false, true);
                audioPipelineImpl.mAudioRecorderThread = null;
                return;
            default:
                boolean z = abstractC223559ty instanceof C212409b9;
                C176097sS c176097sS = (C176097sS) this.A01;
                if (z) {
                    c176097sS.A04(abstractC223559ty);
                } else {
                    c176097sS.A04(new C212409b9(abstractC223559ty));
                }
                c176097sS.A06((InterfaceC25159BBe) this.A02);
                return;
        }
        interfaceC176157sY.DE8(abstractC223559ty);
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        InterfaceC176157sY interfaceC176157sY;
        int stopInputInternal;
        switch (this.A00) {
            case 0:
                AudioPipelineImpl audioPipelineImpl = (AudioPipelineImpl) this.A01;
                stopInputInternal = audioPipelineImpl.stopInputInternal();
                audioPipelineImpl.mAudioRecorder = null;
                if (stopInputInternal != 0 && stopInputInternal != 13) {
                    AudioPipelineImpl.reportException(stopInputInternal, "stopInputInternal failed", (InterfaceC176157sY) this.A02);
                    return;
                } else {
                    interfaceC176157sY = (InterfaceC176157sY) this.A02;
                    break;
                }
                break;
            case 1:
                interfaceC176157sY = (InterfaceC176157sY) this.A02;
                if (interfaceC176157sY == null) {
                    return;
                }
                break;
            case 2:
                AudioPipelineImpl audioPipelineImpl2 = (AudioPipelineImpl) this.A01;
                audioPipelineImpl2.mAudioRecorder = null;
                InterfaceC176157sY interfaceC176157sY2 = (InterfaceC176157sY) this.A02;
                if (interfaceC176157sY2 != null) {
                    interfaceC176157sY2.onSuccess();
                }
                if (audioPipelineImpl2.mAudioRecorderThread != null) {
                    C175907s4.A02(audioPipelineImpl2.mAudioRecorderThread, false, true);
                    audioPipelineImpl2.mAudioRecorderThread = null;
                    return;
                }
                return;
            default:
                C176097sS c176097sS = (C176097sS) this.A01;
                c176097sS.A00 = 3;
                c176097sS.A08.Ckz(19, "recording_stop_finished");
                InterfaceC25203BDb interfaceC25203BDb = c176097sS.A0A;
                if (interfaceC25203BDb != null) {
                    c176097sS.A0A = null;
                    c176097sS.A06.post(new RunnableC24563AuK(interfaceC25203BDb, c176097sS));
                }
                Iterator A16 = AbstractC166997dE.A16(c176097sS.A05);
                while (A16.hasNext()) {
                    ((InterfaceC176187sb) A16.next()).Eg6(null);
                }
                c176097sS.A06((InterfaceC25159BBe) this.A02);
                return;
        }
        interfaceC176157sY.onSuccess();
    }
}
