package X;

/* renamed from: X.Op4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55735Op4 implements InterfaceC58273PsR {
    public final /* synthetic */ OBU A00;

    public C55735Op4(OBU obu) {
        this.A00 = obu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r0.reason != 7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r8 == 0) goto L11;
     */
    @Override // X.InterfaceC58273PsR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CP3(X.C51732MtD r12) {
        /*
            r11 = this;
            r0 = 0
            X.C14360o3.A0B(r12, r0)
            X.OBU r4 = r11.A00
            java.lang.Class<com.facebook.rsys.state.gen.State> r0 = com.facebook.rsys.state.gen.State.class
            java.lang.Object r0 = r12.A00(r0)
            com.facebook.rsys.state.gen.State r0 = (com.facebook.rsys.state.gen.State) r0
            if (r0 == 0) goto Laf
            int r8 = r0.callState
            java.lang.Class<com.facebook.rsys.audio.gen.AudioModel> r0 = com.facebook.rsys.audio.gen.AudioModel.class
            java.lang.Object r0 = r12.A00(r0)
            com.facebook.rsys.audio.gen.AudioModel r0 = (com.facebook.rsys.audio.gen.AudioModel) r0
            r10 = 0
            if (r0 == 0) goto Lb6
            boolean r7 = r0.audioBufferingStarted
        L1f:
            r0 = 4
            if (r8 == r0) goto L25
            r0 = 0
            if (r8 != 0) goto L26
        L25:
            r0 = 1
        L26:
            r5 = 7
            if (r0 == 0) goto L61
            X.05A r9 = r4.A01
            java.lang.Object r0 = r9.getValue()
            boolean r0 = r0 instanceof X.C51762MuS
            if (r0 != 0) goto L61
            java.lang.Class<com.facebook.rsys.ended.gen.EndedModel> r0 = com.facebook.rsys.ended.gen.EndedModel.class
            java.lang.Object r0 = r12.A00(r0)
            com.facebook.rsys.ended.gen.EndedModel r0 = (com.facebook.rsys.ended.gen.EndedModel) r0
            if (r0 == 0) goto L42
            int r0 = r0.reason
            r6 = 1
            if (r0 == r5) goto L43
        L42:
            r6 = 0
        L43:
            X.MuS r3 = new X.MuS
            r3.<init>(r6)
            X.OXE r2 = X.OXE.A00
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Updating state to: "
            java.lang.String r1 = X.AbstractC167017dG.A0n(r3, r0, r1)
            java.lang.String r0 = "SessionConnectionStateProvider"
            r2.A00(r0, r1)
            X.MuS r0 = new X.MuS
            r0.<init>(r6)
            r9.Egh(r0)
        L61:
            r0 = 2
            if (r8 != r0) goto Laf
            java.lang.Class<com.facebook.rsys.call.gen.CallModel> r0 = com.facebook.rsys.call.gen.CallModel.class
            java.lang.Object r0 = r12.A00(r0)
            if (r0 == 0) goto Lb9
            com.facebook.rsys.call.gen.CallModel r0 = (com.facebook.rsys.call.gen.CallModel) r0
            int r6 = r0.inCallState
            if (r7 == 0) goto L77
            int r0 = r4.A00
            if (r0 >= r5) goto L77
            r10 = 1
        L77:
            if (r6 == r5) goto Lb3
            if (r10 != 0) goto Lb3
            X.05A r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.Op1
            if (r0 == 0) goto Lb0
            X.Op3 r5 = X.Op3.A00
        L87:
            X.05A r3 = r4.A01
            java.lang.Object r0 = r3.getValue()
            boolean r0 = X.C14360o3.A0K(r0, r5)
            if (r0 != 0) goto La4
            X.OXE r2 = X.OXE.A00
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Updating state to "
            java.lang.String r1 = X.AbstractC167017dG.A0n(r5, r0, r1)
            java.lang.String r0 = "SessionConnectionStateProvider"
            r2.A00(r0, r1)
        La4:
            int r0 = r4.A00
            int r0 = java.lang.Math.max(r0, r6)
            r4.A00 = r0
            r3.Egh(r5)
        Laf:
            return
        Lb0:
            X.Op2 r5 = X.Op2.A00
            goto L87
        Lb3:
            X.Op1 r5 = X.Op1.A00
            goto L87
        Lb6:
            r7 = 0
            goto L1f
        Lb9:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55735Op4.CP3(X.MtD):void");
    }
}
