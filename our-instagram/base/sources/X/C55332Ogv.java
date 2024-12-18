package X;

import android.media.AudioManager;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ogv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55332Ogv implements AudioManager.OnAudioFocusChangeListener {
    public final C4RP A00;
    public final AtomicReference A01;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x002a A[ORIG_RETURN, RETURN] */
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAudioFocusChange(int r8) {
        /*
            r7 = this;
            r0 = -3
            if (r8 == r0) goto L84
            r0 = -2
            if (r8 == r0) goto L7f
            r0 = -1
            if (r8 != r0) goto L10
            java.util.concurrent.atomic.AtomicReference r1 = r7.A01
            X.NfZ r0 = X.EnumC53177NfZ.A05
        Ld:
            r1.set(r0)
        L10:
            X.4RP r4 = r7.A00
            X.4SS r0 = r4.A08
            if (r0 == 0) goto L2a
            com.facebook.video.heroplayer.ipc.AudioFocusLossSettings r6 = r0.A0I
            r0 = -3
            if (r8 == r0) goto L68
            r0 = -2
            if (r8 == r0) goto L68
            r0 = -1
            if (r8 == r0) goto L65
            r0 = 1
            if (r8 == r0) goto L2b
            r0 = 2
            if (r8 == r0) goto L2b
            r0 = 3
            if (r8 == r0) goto L2b
        L2a:
            return
        L2b:
            X.C14360o3.A0A(r6)
            X.OLA r0 = r4.A07
            if (r0 == 0) goto L62
            java.util.concurrent.atomic.AtomicReference r0 = r0.A06
            java.lang.Object r0 = r0.get()
            X.C14360o3.A07(r0)
            X.NfZ r0 = (X.EnumC53177NfZ) r0
        L3d:
            int r5 = r0.ordinal()
            r3 = 5
            r2 = 2
            r0 = 4
            r1 = 1
            if (r5 == r0) goto L5d
            if (r5 == r3) goto L5a
            r0 = 6
            if (r5 == r0) goto L5a
            X.4SR r0 = X.C4SR.NONE
        L4e:
            int r0 = r0.ordinal()
            if (r0 == r1) goto L89
            if (r0 != r2) goto L2a
            r4.A07()
            return
        L5a:
            X.4SR r0 = r6.A02
            goto L5f
        L5d:
            X.4SR r0 = r6.A01
        L5f:
            if (r0 != 0) goto L4e
            return
        L62:
            X.NfZ r0 = X.EnumC53177NfZ.A08
            goto L3d
        L65:
            X.4SR r0 = r6.A01
            goto L6a
        L68:
            X.4SR r0 = r6.A02
        L6a:
            X.C14360o3.A0A(r0)
            float r3 = r6.A00
            int r2 = r0.ordinal()
            r1 = 0
            r0 = 1
            if (r2 == r0) goto L8c
            r0 = 2
            if (r2 != r0) goto L2a
            r0 = 0
            X.C4RP.A01(r4, r0, r1)
            return
        L7f:
            java.util.concurrent.atomic.AtomicReference r1 = r7.A01
            X.NfZ r0 = X.EnumC53177NfZ.A06
            goto Ld
        L84:
            java.util.concurrent.atomic.AtomicReference r1 = r7.A01
            X.NfZ r0 = X.EnumC53177NfZ.A07
            goto Ld
        L89:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L93
        L8c:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L93
            r3 = 0
        L93:
            X.4RQ r1 = r4.A0I
            java.lang.String r0 = "unknown"
            r1.A0G(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55332Ogv.onAudioFocusChange(int):void");
    }

    public C55332Ogv(C4RP c4rp, AtomicReference atomicReference) {
        this.A00 = c4rp;
        this.A01 = atomicReference;
    }
}
