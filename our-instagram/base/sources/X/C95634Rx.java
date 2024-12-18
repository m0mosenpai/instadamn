package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4Rx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95634Rx extends AbstractC95614Rv {
    public final AtomicReference A01 = new AtomicReference(Float.valueOf(0.0f));
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.4T2, X.0Zx] */
    private final void A00(boolean z, int i) {
        Integer num;
        String str;
        AtomicBoolean atomicBoolean = this.A00;
        if (atomicBoolean != null && atomicBoolean.getAndSet(z) == z) {
            return;
        }
        ?? c0Zx = new C0Zx();
        c0Zx.A03("player_sound_on", Boolean.valueOf(z));
        if (i == 25) {
            num = C05F.A00;
        } else if (i == 24) {
            num = C05F.A01;
        } else if (i == 164) {
            num = C05F.A0C;
        } else if (i == 4) {
            num = C05F.A0N;
        } else if (i == -1) {
            num = C05F.A0Y;
        } else if (i == -3) {
            num = C05F.A0j;
        } else if (i == -5) {
            num = C05F.A15;
        } else if (i == -4) {
            num = C05F.A0u;
        } else if (i == -6) {
            num = C05F.A1F;
        } else if (i == -7) {
            num = C05F.A1I;
        } else {
            num = C05F.A02;
        }
        switch (num.intValue()) {
            case 0:
                str = "volume_down";
                break;
            case 1:
                str = "volume_up";
                break;
            case 2:
                str = "volume_mute";
                break;
            case 3:
                str = "back";
                break;
            case 4:
                str = "video_tapped";
                break;
            case 5:
                str = "control_tapped";
                break;
            case 6:
                str = "sound_on";
                break;
            case 7:
                str = "sticky_audio";
                break;
            case 8:
                str = "headphones";
                break;
            case 9:
                str = "product_behavior";
                break;
            default:
                str = "unknown";
                break;
        }
        c0Zx.A06("audio_key_source", str);
        A01(c0Zx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1 <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(float r3, int r4) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r2.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r1.getAndSet(r0)
            X.1vZ r0 = X.AbstractC41221vX.A00()
            int r1 = r0.A0C
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = 1
            if (r1 > 0) goto L18
        L17:
            r0 = 0
        L18:
            r2.A00(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95634Rx.A02(float, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r3 <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r3, int r4) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.C14360o3.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = 1
            if (r3 > 0) goto L18
        L17:
            r0 = 0
        L18:
            r2.A00(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95634Rx.A03(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.4T2, X.0Zx] */
    public final void A04(boolean z) {
        ?? c0Zx = new C0Zx();
        c0Zx.A03("audio_fetched", Boolean.valueOf(z));
        A01(c0Zx);
    }
}
