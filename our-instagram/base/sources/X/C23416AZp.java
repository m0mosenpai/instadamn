package X;

import android.media.MediaCodec;
import android.os.SystemClock;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.AZp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23416AZp implements InterfaceC176187sb, InterfaceC58107PpW {
    public static final ByteBuffer A06 = ByteBuffer.allocate(0);
    public C212499bI A00;
    public C176137sW A01;
    public boolean A02;
    public final long A03;
    public final AtomicBoolean A04 = AbstractC166997dE.A17();
    public volatile boolean A05;

    @Override // X.InterfaceC176187sb
    public final Map AqD() {
        return null;
    }

    @Override // X.InterfaceC176187sb
    public final Map Avv() {
        return null;
    }

    @Override // X.InterfaceC176187sb
    public final Map BjN() {
        return null;
    }

    @Override // X.InterfaceC58107PpW
    public final void D5h(ByteBuffer byteBuffer) {
    }

    @Override // X.InterfaceC58107PpW
    public final void Dxc(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.InterfaceC176187sb
    public final void EnJ(C22823A4s c22823A4s) {
        this.A05 = true;
    }

    @Override // X.InterfaceC176187sb
    public final void EoR(InterfaceC176157sY interfaceC176157sY) {
        this.A05 = false;
        interfaceC176157sY.onSuccess();
    }

    @Override // X.InterfaceC176187sb
    public final void release() {
        this.A05 = false;
        this.A02 = false;
        this.A01 = null;
        this.A00 = null;
    }

    @Override // X.InterfaceC176187sb
    public final InterfaceC25158BBd BaH() {
        return new C23411AZk(this);
    }

    @Override // X.InterfaceC176187sb
    public final EnumC176237sg CBK() {
        return EnumC176237sg.SUPERNOVA_AUDIO;
    }

    @Override // X.InterfaceC176187sb
    public final boolean CRb() {
        return this.A02;
    }

    @Override // X.InterfaceC58107PpW
    public final void DIL(InterfaceC57803PkV interfaceC57803PkV) {
        if (this.A04.get() && (interfaceC57803PkV instanceof C51769MuZ) && this.A05) {
            C176137sW c176137sW = this.A01;
            C51769MuZ c51769MuZ = (C51769MuZ) interfaceC57803PkV;
            if (c176137sW != null) {
                ByteBuffer byteBuffer = c51769MuZ.A01;
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), c51769MuZ.A00 - this.A03, 0);
                c176137sW.A03(bufferInfo, EnumC176237sg.SUPERNOVA_AUDIO, byteBuffer);
            }
        }
    }

    @Override // X.InterfaceC176187sb
    public final void E5Y(InterfaceC176207sd interfaceC176207sd, InterfaceC177537un interfaceC177537un) {
        this.A00 = (C212499bI) interfaceC177537un;
        this.A02 = true;
        interfaceC176207sd.onSuccess();
        this.A05 = false;
    }

    public C23416AZp() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        this.A03 = (Long.valueOf(elapsedRealtimeNanos) != null ? 0 + elapsedRealtimeNanos : 0L) - (AwakeTimeSinceBootClock.INSTANCE.nowNanos() / 1000);
    }

    @Override // X.InterfaceC176187sb
    public final void Eg6(C176137sW c176137sW) {
        this.A01 = c176137sW;
    }

    @Override // X.InterfaceC176187sb
    public final void Emh(InterfaceC176157sY interfaceC176157sY, ABV abv) {
        interfaceC176157sY.onSuccess();
        this.A05 = false;
        abv.A00();
    }
}
