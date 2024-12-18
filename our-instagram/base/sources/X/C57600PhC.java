package X;

/* renamed from: X.PhC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57600PhC extends C0YY implements InterfaceC16660sJ {
    public static final C57600PhC A00 = new C57600PhC();

    public C57600PhC() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r2 != null) goto L23;
     */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            X.MtD r7 = (X.C51732MtD) r7
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            java.lang.Class<com.facebook.rsys.call.gen.CallModel> r0 = com.facebook.rsys.call.gen.CallModel.class
            java.lang.Object r0 = r7.A00(r0)
            com.facebook.rsys.call.gen.CallModel r0 = (com.facebook.rsys.call.gen.CallModel) r0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L5d
            java.util.ArrayList r0 = r0.remoteParticipants
            if (r0 == 0) goto L5d
            java.util.Iterator r3 = r0.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebook.rsys.call.gen.CallParticipant r0 = (com.facebook.rsys.call.gen.CallParticipant) r0
            java.lang.String r1 = r0.userId
            java.lang.String r0 = "0"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L1a
        L31:
            com.facebook.rsys.call.gen.CallParticipant r2 = (com.facebook.rsys.call.gen.CallParticipant) r2
            if (r2 == 0) goto L5d
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r2.mediaState
            if (r0 == 0) goto L5d
            java.util.ArrayList r0 = r0.audioStreams
            if (r0 == 0) goto L5d
            java.util.Iterator r3 = r0.iterator()
        L41:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebook.rsys.audio.gen.AudioStream r0 = (com.facebook.rsys.audio.gen.AudioStream) r0
            int r1 = r0.type
            r0 = 9
            if (r1 != r0) goto L41
            if (r2 == 0) goto L5d
        L56:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L5b:
            r2 = r4
            goto L31
        L5d:
            r5 = 0
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57600PhC.invoke(java.lang.Object):java.lang.Object");
    }
}
