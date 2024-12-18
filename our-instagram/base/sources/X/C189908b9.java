package X;

import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.8b9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189908b9 implements InterfaceC189918bA {
    public AudioServiceConfigurationAnnouncer A00;
    public C224129uw A01;
    public final C1815283f A02;
    public final Queue A03 = new ConcurrentLinkedQueue();
    public final C189898b8 A04;

    @Override // X.InterfaceC189918bA
    public final int E8P(String str, short[] sArr, int i) {
        C14360o3.A0B(sArr, 1);
        int currentPositionMs = this.A04.A00.A0J.A05.getCurrentPositionMs();
        this.A02.A00().A04(currentPositionMs);
        int i2 = 0;
        while (i2 < i) {
            C24237Ap4 c24237Ap4 = (C24237Ap4) this.A03.poll();
            if (c24237Ap4 == null) {
                break;
            }
            if (c24237Ap4.A00 >= currentPositionMs) {
                byte[] bArr = c24237Ap4.A01;
                int min = Math.min(bArr.length / 2, i - i2);
                ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr, i2, min);
                i2 += min;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r4.A01 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C189908b9 r4, boolean r5) {
        /*
            X.83f r3 = r4.A02
            X.83g r2 = r3.A00()
            if (r5 == 0) goto Ld
            X.9uw r0 = r4.A01
            r1 = 0
            if (r0 != 0) goto Le
        Ld:
            r1 = 1
        Le:
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r2.A05
            r0.A0C = r1
            X.818 r0 = r0.A07
            if (r0 == 0) goto L19
            r0.A0I(r1)
        L19:
            X.83g r0 = r3.A00()
            r0.A05(r4)
            if (r5 == 0) goto L38
            X.83g r0 = r3.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            X.82k r0 = r0.A0K
            X.7qL r0 = r0.A04
            if (r0 != 0) goto L39
            java.lang.String r1 = "IgCameraEffectsController"
            java.lang.String r0 = "getAudioServiceConfigurationAnnouncer() mediaPipeController is null"
            X.C0K8.A0C(r1, r0)
            r0 = 0
        L36:
            r4.A00 = r0
        L38:
            return
        L39:
            com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer r0 = r0.Adz()
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189908b9.A00(X.8b9, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C224129uw r3) {
        /*
            r2 = this;
            r2.A01 = r3
            X.83f r0 = r2.A02
            X.83g r0 = r0.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A09
            if (r0 == 0) goto L19
            java.util.Map r1 = r0.A0Z
            java.lang.String r0 = "audioFBA"
            java.lang.Object r1 = r1.get(r0)
            r0 = 1
            if (r1 != 0) goto L1a
        L19:
            r0 = 0
        L1a:
            A00(r2, r0)
            X.9uw r1 = r2.A01
            if (r1 == 0) goto L28
            com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer r0 = r2.A00
            if (r0 == 0) goto L28
            r0.announce(r1)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189908b9.A01(X.9uw):void");
    }

    public C189908b9(C1815283f c1815283f, C189898b8 c189898b8) {
        this.A02 = c1815283f;
        this.A04 = c189898b8;
    }
}
