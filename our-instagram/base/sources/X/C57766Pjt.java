package X;

/* renamed from: X.Pjt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57766Pjt extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r11.equals(r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r11.equals("glitch_transition") != false) goto L19;
     */
    @Override // X.InterfaceC16610sE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            r5 = r10
            int r0 = r9.A00
            if (r0 == 0) goto L2d
            byte[] r5 = (byte[]) r5
            int r8 = X.AbstractC166987dD.A0H(r11)
            java.lang.Number r12 = (java.lang.Number) r12
            byte r6 = r12.byteValue()
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.lang.Object r2 = r9.A03
            X.77o r2 = (X.C1580477o) r2
            java.lang.Object r3 = r9.A02
            X.L7E r3 = (X.L7E) r3
            int r7 = r9.A01
            X.19L r0 = r2.A05
            r4 = 0
            com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$submitAudioForProcessing$1 r1 = new com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$submitAudioForProcessing$1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.AbstractC166987dD.A1Z(r1, r0)
        L2a:
            X.0eB r0 = X.C0eB.A00
            return r0
        L2d:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r11 = (java.lang.String) r11
            boolean r3 = X.AbstractC166987dD.A1a(r12)
            if (r5 == 0) goto L3d
            int r0 = r5.length()
            if (r0 != 0) goto L48
        L3d:
            java.lang.Object r1 = r9.A02
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131956011(0x7f13112b, float:1.9548566E38)
            java.lang.String r5 = r1.getString(r0)
        L48:
            X.C14360o3.A0A(r5)
            java.lang.Object r0 = r9.A03
            X.Mj4 r0 = (X.C51161Mj4) r0
            X.8Sd r1 = r0.A07
            int r2 = r9.A01
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            X.2GS r1 = r1.A06
            if (r3 == 0) goto L74
            java.lang.Object r0 = r1.A02()
            X.8A8 r0 = (X.C8A8) r0
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r0.A01
            X.OBj r0 = (X.C54634OBj) r0
            if (r0 == 0) goto L7d
            java.lang.String r11 = r0.A01
        L6b:
            X.OBj r0 = new X.OBj
            r0.<init>(r5, r11, r2, r3)
            X.MSX.A1A(r1, r0)
            goto L2a
        L74:
            if (r11 == 0) goto L7d
            int r0 = r11.hashCode()
            switch(r0) {
                case -936195220: goto L7f;
                case -123266003: goto L82;
                case 139481759: goto L85;
                case 717581682: goto L8e;
                case 1296567617: goto L91;
                case 2000782950: goto L94;
                default: goto L7d;
            }
        L7d:
            r11 = 0
            goto L6b
        L7f:
            java.lang.String r0 = "warp_transition"
            goto L96
        L82:
            java.lang.String r0 = "blur_transition"
            goto L96
        L85:
            java.lang.String r0 = "glitch_transition"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L7d
            goto L6b
        L8e:
            java.lang.String r0 = "spin_transition"
            goto L96
        L91:
            java.lang.String r0 = "zoom_transition"
            goto L96
        L94:
            java.lang.String r0 = "flare_transition"
        L96:
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L6b
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57766Pjt.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57766Pjt(int i, int i2, Object obj, Object obj2) {
        super(3);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }
}
