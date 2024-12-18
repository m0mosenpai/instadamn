package X;

import android.os.Handler;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes4.dex */
public final class AVC implements InterfaceC176057sO {
    public static final InterfaceC176157sY A0E = new C23387AYl();
    public AM5 A00;
    public AVF A03;
    public final InterfaceC176037sM A04;
    public final WeakReference A05;
    public final Handler A07;
    public final InterfaceC178337w7 A0A;
    public volatile AH7 A0B;
    public volatile AC7 A0C;
    public volatile C176217se A0D;
    public byte[] A02 = new byte[4096];
    public final WeakHashMap A06 = new WeakHashMap();
    public final InterfaceC176077sQ A09 = new AV9(this);
    public final InterfaceC175967sB A08 = new AV8(this);
    public byte[] A01 = new byte[4096];

    public static synchronized boolean A00(AVC avc) {
        AudioPlatformComponentHost A00;
        synchronized (avc) {
            C179537y3 c179537y3 = (C179537y3) avc.A05.get();
            if (c179537y3 != null && (A00 = c179537y3.A00()) != null) {
                WeakHashMap weakHashMap = avc.A06;
                Boolean bool = (Boolean) weakHashMap.get(A00);
                if (avc.A00 != null && (bool == null || !bool.booleanValue())) {
                    A00.startRecording(false);
                    weakHashMap.put(A00, Boolean.TRUE);
                    return true;
                }
            }
            return false;
        }
    }

    @Override // X.InterfaceC176057sO
    public final Map Avx() {
        return null;
    }

    @Override // X.InterfaceC176057sO
    public final void EG5(Handler handler, InterfaceC176157sY interfaceC176157sY, C176217se c176217se) {
        AudioPlatformComponentHost A00;
        synchronized (this) {
            C179537y3 c179537y3 = (C179537y3) this.A05.get();
            if (c179537y3 != null && (A00 = c179537y3.A00()) != null) {
                A00.stopRecording();
            }
        }
        if (this.A0C != null) {
            AC7 ac7 = this.A0C;
            A9H a9h = ac7.A02;
            a9h.A03 = 0;
            A9G a9g = ac7.A00;
            a9h.A03 = a9g.A02;
            a9h.A00 = 0;
            a9h.A00 = a9g.A01;
        }
        AM5 am5 = this.A00;
        if (am5 != null) {
            am5.A06(interfaceC176157sY, handler);
        } else {
            AD8.A00(handler, new C212399b8("mAudioRecorder is null while stopping"), interfaceC176157sY);
        }
        this.A0D = null;
        this.A0B = null;
        this.A0C = null;
    }

    @Override // X.InterfaceC176057sO
    public final void A9r(Handler handler, AH7 ah7, A9H a9h, InterfaceC176157sY interfaceC176157sY, C176217se c176217se) {
        this.A0D = c176217se;
        c176217se.A00 = this.A08;
        if (ah7 != null) {
            ah7.A02();
        }
        this.A0B = ah7;
        if (a9h != null) {
            AC7 ac7 = new AC7(a9h);
            ac7.A00();
            this.A0C = ac7;
        }
        A00(this);
        AM5 am5 = this.A00;
        if (am5 != null) {
            am5.A05(interfaceC176157sY, handler);
        } else {
            AD8.A00(handler, new C212399b8("mAudioRecorder is null while starting"), interfaceC176157sY);
        }
    }

    @Override // X.InterfaceC176057sO
    public final void E5W(Handler handler, Handler handler2, C177547uo c177547uo, InterfaceC176157sY interfaceC176157sY) {
        AVF avf = new AVF(handler, c177547uo, this);
        this.A03 = avf;
        InterfaceC176077sQ interfaceC176077sQ = this.A09;
        InterfaceC178337w7 interfaceC178337w7 = this.A0A;
        AM5 am5 = new AM5(handler, interfaceC176077sQ, c177547uo, avf, 5, interfaceC178337w7.ArS(1004), interfaceC178337w7.B5H(21), interfaceC178337w7.CUa(68));
        this.A00 = am5;
        int length = this.A01.length;
        int i = am5.A00;
        if (length < i) {
            this.A01 = new byte[i];
        }
        am5.A04(interfaceC176157sY, handler2);
    }

    @Override // X.InterfaceC176057sO
    public final void release() {
        AVF avf = this.A03;
        if (avf != null) {
            avf.A05 = true;
            this.A03 = null;
        }
        AM5 am5 = this.A00;
        if (am5 != null) {
            am5.A06(A0E, this.A07);
            this.A00 = null;
        }
        this.A06.clear();
    }

    public AVC(Handler handler, C179537y3 c179537y3, InterfaceC178337w7 interfaceC178337w7, InterfaceC176037sM interfaceC176037sM) {
        this.A04 = interfaceC176037sM;
        this.A07 = handler;
        this.A05 = new WeakReference(c179537y3);
        this.A0A = interfaceC178337w7;
    }
}
