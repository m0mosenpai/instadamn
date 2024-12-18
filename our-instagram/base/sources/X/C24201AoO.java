package X;

import android.media.AudioRecord;
import android.os.Handler;
import java.util.List;

/* renamed from: X.AoO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24201AoO implements MRH {
    public int A00;
    public AM5 A01;
    public L33 A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final C176117sU A06;
    public final C7GO A07;
    public final MPO A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final AVB A0C;

    /* JADX WARN: Type inference failed for: r7v0, types: [X.7s1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.7sM, java.lang.Object] */
    public C24201AoO(InterfaceC178337w7 interfaceC178337w7, C7GO c7go, MPO mpo, int i, int i2, int i3) {
        this.A07 = c7go;
        this.A08 = mpo;
        this.A09 = i;
        this.A0A = i2;
        this.A00 = i3;
        int minBufferSize = AudioRecord.getMinBufferSize(i2, 16, 2) * 2;
        this.A0B = minBufferSize;
        this.A04 = true;
        AVB avb = new AVB(mpo, i2, minBufferSize);
        avb.A03 = new C30482DbR(this, 21);
        this.A0C = avb;
        ?? obj = new Object();
        ?? obj2 = new Object();
        C176117sU c176117sU = new C176117sU(obj2, obj, new C176097sS(AbstractC167007dF.A0J(), interfaceC178337w7, obj));
        Handler handler = c176117sU.A01;
        c176117sU.A04.A03 = new C176137sW(handler, interfaceC178337w7, obj);
        c176117sU.A03(new C176177sa(handler, avb, interfaceC178337w7, obj2, obj));
        this.A06 = c176117sU;
        this.A05 = AbstractC167007dF.A0J();
    }

    @Override // X.MRH
    public final void AHz() {
        this.A02 = null;
    }

    @Override // X.MRH
    public final void release() {
        Eoe(true);
        AbstractC166997dE.A1H(this.A06.A00, new Object[0], 5);
        this.A01 = null;
        this.A05.removeCallbacksAndMessages(null);
    }

    public static final void A01(C24201AoO c24201AoO, String str, Throwable th) {
        Exception c212399b8;
        C0K8.A0F("IGDOneCameraVoiceRecorder", str, th);
        C23393AYs c23393AYs = new C23393AYs(c24201AoO, 4);
        AM5 am5 = c24201AoO.A01;
        if (am5 != null) {
            am5.A06(c23393AYs, c24201AoO.A05);
        }
        c24201AoO.A02 = null;
        C7GO c7go = c24201AoO.A07;
        if (th != null) {
            c212399b8 = new AbstractC223559ty(40000, th);
        } else {
            c212399b8 = new C212399b8(str);
        }
        c7go.DEF(c212399b8);
        c7go.DdX(false);
    }

    @Override // X.MRH
    public final L33 Auq() {
        return this.A02;
    }

    @Override // X.MRH
    public final void Eoe(boolean z) {
        C176117sU c176117sU = this.A06;
        Integer num = c176117sU.A04.A04;
        if (num != C05F.A0j && num != C05F.A0u) {
            C23393AYs c23393AYs = new C23393AYs(this, 4);
            AM5 am5 = this.A01;
            if (am5 != null) {
                am5.A06(c23393AYs, this.A05);
            }
            this.A03 = z;
            c176117sU.A01();
        }
    }

    @Override // X.MRH
    public final boolean isRecording() {
        if (this.A06.A04.A04 == C05F.A0u) {
            return false;
        }
        return true;
    }

    public static final void A00(C24201AoO c24201AoO) {
        if (c24201AoO.isRecording()) {
            AVB avb = c24201AoO.A0C;
            float f = avb.A07;
            L33 l33 = c24201AoO.A02;
            if (l33 != null) {
                l33.A03.add(Float.valueOf(f));
            }
            c24201AoO.A07.E1s(c24201AoO.A00 - AbstractC166987dD.A0L(avb.A02.get()), f);
            c24201AoO.A05.postDelayed(new RunnableC24508AtR(c24201AoO), 100L);
        }
    }

    @Override // X.MRH
    public final void Cov() {
        if (!isRecording()) {
            Integer valueOf = Integer.valueOf(this.A09);
            Integer valueOf2 = Integer.valueOf(this.A0A);
            C177527um c177527um = new C177527um(null, new AGu(true, 5, valueOf2, valueOf, C05F.A00), valueOf2, 2, 1, 0, Integer.valueOf(this.A0B));
            C176117sU c176117sU = this.A06;
            List A1J = AbstractC166987dD.A1J(c177527um);
            AVQ avq = new AVQ(this, 2);
            AbstractC166997dE.A1H(c176117sU.A00, new Object[]{A1J, new AVS(1, avq, c176117sU), this.A05}, 1);
        }
    }
}
