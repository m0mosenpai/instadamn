package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.7sN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176047sN implements InterfaceC176057sO {
    public long A00;
    public final C175887s2 A05;
    public final C175877s1 A06;
    public final WeakReference A07;
    public final InterfaceC175967sB A0A;
    public final InterfaceC178407wE A0C;
    public volatile Handler A0D;
    public volatile AH7 A0E;
    public volatile AC7 A0F;
    public volatile C176217se A0H;
    public volatile EnumC177557up A0I;
    public byte[] A03 = new byte[4096];
    public long A01 = 0;
    public boolean A02 = false;
    public final byte[] A09 = new byte[4096];
    public final WeakHashMap A08 = new WeakHashMap();
    public final InterfaceC176077sQ A04 = new InterfaceC176077sQ() { // from class: X.7sP
        @Override // X.InterfaceC176077sQ
        public final AH7 AXE() {
            return C176047sN.this.A0E;
        }
    };
    public final C176087sR A0B = new C176087sR(this);
    public volatile AudioRenderCallback A0G = null;

    public static synchronized boolean A03(C176047sN c176047sN) {
        AudioPlatformComponentHost A00;
        synchronized (c176047sN) {
            C179537y3 c179537y3 = (C179537y3) c176047sN.A07.get();
            if (c179537y3 != null && (A00 = c179537y3.A00()) != null) {
                WeakHashMap weakHashMap = c176047sN.A08;
                Boolean bool = (Boolean) weakHashMap.get(A00);
                if (bool == null || !bool.booleanValue()) {
                    A00.startRecording(false);
                    weakHashMap.put(A00, Boolean.TRUE);
                    return true;
                }
            }
            return false;
        }
    }

    @Override // X.InterfaceC176057sO
    public final void E5W(Handler handler, Handler handler2, C177547uo c177547uo, InterfaceC176157sY interfaceC176157sY) {
        this.A0D = handler;
        this.A0I = c177547uo.A05;
        this.A05.A06(new C23397AYw(handler, handler2, c177547uo, this, interfaceC176157sY), handler2);
    }

    @Override // X.InterfaceC176057sO
    public final void EG5(Handler handler, InterfaceC176157sY interfaceC176157sY, C176217se c176217se) {
        AudioPlatformComponentHost A00;
        this.A0H = null;
        AC7 ac7 = this.A0F;
        if (ac7 != null) {
            A9H a9h = ac7.A02;
            a9h.A03 = 0;
            A9G a9g = ac7.A00;
            a9h.A03 = a9g.A02;
            a9h.A00 = 0;
            a9h.A00 = a9g.A01;
        }
        this.A0E = null;
        this.A0F = null;
        if (!this.A02) {
            synchronized (this) {
                C179537y3 c179537y3 = (C179537y3) this.A07.get();
                if (c179537y3 != null && (A00 = c179537y3.A00()) != null) {
                    A00.stopRecording();
                    ((AudioPlatformComponentHostImpl) A00).mRenderCallback = null;
                }
            }
        }
        C175887s2 c175887s2 = this.A05;
        c175887s2.A0I.A05.A01("rO");
        if (!c175887s2.A0B.post(new RunnableC24722Ax3(handler, c175887s2, interfaceC176157sY))) {
            handler.post(new RunnableC24531Ato(c175887s2, interfaceC176157sY));
        }
        this.A0G = null;
    }

    @Override // X.InterfaceC176057sO
    public final void release() {
        this.A0D = null;
        this.A0I = null;
        this.A08.clear();
    }

    public static void A00(C176047sN c176047sN) {
        long j = 0;
        if (c176047sN.A00 <= 0) {
            EnumC177557up enumC177557up = c176047sN.A0I;
            if (enumC177557up == null) {
                C176217se c176217se = c176047sN.A0H;
                if (c176217se != null) {
                    c176217se.A00(new C212399b8("Presentation Time Strategy not set"));
                    return;
                }
                return;
            }
            int ordinal = enumC177557up.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return;
                } else {
                    j = AwakeTimeSinceBootClock.INSTANCE.nowNanos() / 1000;
                }
            }
            c176047sN.A00 = j;
        }
    }

    public static void A01(C176047sN c176047sN) {
        AH7 ah7 = c176047sN.A0E;
        if (ah7 != null && c176047sN.A01 > 0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - c176047sN.A01;
            ah7.A07 += elapsedRealtimeNanos;
            if (elapsedRealtimeNanos > ah7.A0C) {
                ah7.A01++;
            }
        }
    }

    public static void A02(C176047sN c176047sN, byte[] bArr, int i, int i2, int i3, int i4) {
        C176217se c176217se = c176047sN.A0H;
        if (c176217se != null) {
            c176217se.A02(bArr, i4, c176047sN.A00);
        }
        if (i4 > 0 && i > 0 && i2 > 0 && i3 > 0) {
            c176047sN.A00 += AMJ.A01(i2, i3, i4, i);
        }
    }

    @Override // X.InterfaceC176057sO
    public final void A9r(Handler handler, AH7 ah7, A9H a9h, InterfaceC176157sY interfaceC176157sY, C176217se c176217se) {
        boolean z;
        this.A0H = c176217se;
        c176217se.A00 = this.A0A;
        if (ah7 != null) {
            ah7.A02();
        }
        this.A0E = ah7;
        if (a9h != null) {
            AC7 ac7 = new AC7(a9h);
            ac7.A00();
            this.A0F = ac7;
        }
        if (this.A0I == null) {
            interfaceC176157sY.DE8(new C212399b8("Presentation Time Strategy not set"));
            return;
        }
        this.A00 = 0L;
        this.A01 = 0L;
        this.A0G = new AudioRenderCallback() { // from class: X.9Y6
            @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback
            public final void onSamplesReady(byte[] bArr, int i, int i2, int i3, int i4) {
                C176047sN c176047sN = C176047sN.this;
                if (c176047sN.A0D != null && Looper.myLooper() != c176047sN.A0D.getLooper()) {
                    return;
                }
                AH7 ah72 = c176047sN.A0E;
                if (ah72 != null) {
                    ah72.A09 = true;
                }
                AC7 ac72 = c176047sN.A0F;
                if (ac72 != null) {
                    ac72.A01(bArr, i4);
                }
                C176047sN.A01(c176047sN);
                byte[] bArr2 = c176047sN.A09;
                if (i4 > 4096) {
                    ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).limit(i4);
                    while (byteBuffer.position() < i4) {
                        int min = Math.min(i4 - byteBuffer.position(), 4096);
                        byteBuffer.get(bArr2, 0, min);
                        C176047sN.A02(c176047sN, bArr2, i, i2, i3, min);
                    }
                    return;
                }
                C176047sN.A02(c176047sN, bArr, i, i2, i3, i4);
            }
        };
        C175887s2 c175887s2 = this.A05;
        InterfaceC25222BDw interfaceC25222BDw = c175887s2.A03;
        if (interfaceC25222BDw != null) {
            z = interfaceC25222BDw.isSubgraphInserted();
        } else {
            z = false;
        }
        this.A02 = z;
        if (!z) {
            A03(this);
        }
        C176087sR c176087sR = this.A0B;
        c175887s2.A0I.A05.A01("a");
        if (c175887s2.A0B.post(new RunnableC24822Ayi(handler, c175887s2, c176087sR, interfaceC176157sY))) {
            return;
        }
        handler.post(new RunnableC24530Atn(c175887s2, interfaceC176157sY));
    }

    @Override // X.InterfaceC176057sO
    public final Map Avx() {
        return this.A05.A03();
    }

    public C176047sN(InterfaceC175967sB interfaceC175967sB, C175887s2 c175887s2, C179537y3 c179537y3, InterfaceC178407wE interfaceC178407wE, C175877s1 c175877s1) {
        this.A07 = new WeakReference(c179537y3);
        this.A05 = c175887s2;
        this.A06 = c175877s1;
        this.A0A = interfaceC175967sB;
        this.A0C = interfaceC178407wE;
    }
}
