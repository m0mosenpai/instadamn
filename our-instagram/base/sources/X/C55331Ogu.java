package X;

import android.media.AudioManager;

/* renamed from: X.Ogu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55331Ogu implements AudioManager.OnAudioFocusChangeListener {
    public final int A00;
    public final Object A01;

    public C55331Ogu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        if (r0 != false) goto L36;
     */
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAudioFocusChange(int r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            if (r0 == 0) goto L49
            java.lang.Object r5 = r6.A01
            X.OWW r5 = (X.OWW) r5
            X.OUz r4 = r5.A05
            r3 = 1
            switch(r7) {
                case -3: goto L46;
                case -2: goto L43;
                case -1: goto L40;
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                default: goto Le;
            }
        Le:
            java.lang.String r2 = "UNKNOWN"
        L10:
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "onAudioFocusChange: %s"
            r4.A00(r0, r1)
            X.PpS r1 = r5.A04
            java.lang.String r0 = "on_audio_focus_change"
            r1.Cnc(r0, r2)
            r0 = -3
            if (r7 == r0) goto L75
            r0 = -2
            if (r7 == r0) goto L75
            r0 = -1
            if (r7 == r0) goto L6f
            if (r7 != r3) goto L30
            X.Pq0 r0 = r5.A06
            r0.DIo()
        L30:
            return
        L31:
            java.lang.String r2 = "GAIN_TRANSIENT_EXCLUSIVE"
            goto L10
        L34:
            java.lang.String r2 = "GAIN_TRANSIENT_MAY_DUCK"
            goto L10
        L37:
            java.lang.String r2 = "GAIN_TRANSIENT"
            goto L10
        L3a:
            java.lang.String r2 = "GAIN"
            goto L10
        L3d:
            java.lang.String r2 = "NONE"
            goto L10
        L40:
            java.lang.String r2 = "LOSS"
            goto L10
        L43:
            java.lang.String r2 = "LOSS_TRANSIENT"
            goto L10
        L46:
            java.lang.String r2 = "LOSS_TRANSIENT_CAN_DUCK"
            goto L10
        L49:
            r0 = -3
            if (r7 == r0) goto L83
            r0 = -2
            if (r7 == r0) goto L83
            r0 = -1
            if (r7 == r0) goto L7b
            r0 = 1
            if (r7 != r0) goto L30
            java.lang.Object r2 = r6.A01
            X.W5m r2 = (X.W5m) r2
            android.media.AudioManager r1 = r2.A08
            boolean r0 = r1.isWiredHeadsetOn()
            if (r0 != 0) goto L68
            boolean r0 = r1.isBluetoothA2dpOn()
            r1 = 0
            if (r0 == 0) goto L69
        L68:
            r1 = 1
        L69:
            boolean r0 = r2.A06
            r2.A03(r1, r0)
            return
        L6f:
            X.Pq0 r0 = r5.A06
            r0.DQt()
            return
        L75:
            X.Pq0 r0 = r5.A06
            r0.DvL()
            return
        L7b:
            java.lang.Object r0 = r6.A01
            X.W5m r0 = (X.W5m) r0
            r0.A02()
            return
        L83:
            java.lang.Object r0 = r6.A01
            X.W5m r0 = (X.W5m) r0
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55331Ogu.onAudioFocusChange(int):void");
    }
}
