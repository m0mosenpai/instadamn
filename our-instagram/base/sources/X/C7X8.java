package X;

/* renamed from: X.7X8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7X8 implements C7X9 {
    public int A00;
    public final /* synthetic */ C7X7 A01;

    @Override // X.C7X9
    public final void DNn(String str) {
        C14360o3.A0B(str, 0);
        C226418s.A06(C2055097z.A00(this.A01.A08), "thread_item_render_failed", str);
    }

    public C7X8(C7X7 c7x7) {
        this.A01 = c7x7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.7Mt, android.view.Choreographer$FrameCallback] */
    @Override // X.C7X9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DO0(int r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            r6 = 1
            int r0 = r0 + 1
            r8.A00 = r0
            X.7X7 r5 = r8.A01
            X.97z r4 = r5.A08
            boolean r1 = r5.A03
            java.lang.String r0 = "seen_message_id_in_model"
            r4.A02(r0, r1)
            java.lang.String r2 = r5.A0A
            java.lang.String r1 = "entry_point"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = X.C2055097z.A00(r4)
            X.C226418s.A06(r0, r1, r2)
            java.lang.String r3 = r5.A0B
            r2 = r3
            if (r3 != 0) goto L24
            java.lang.String r2 = "empty"
        L24:
            java.lang.String r1 = "message_id_perf_tracking"
            X.C14360o3.A0B(r2, r6)
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = X.C2055097z.A00(r4)
            X.C226418s.A06(r0, r1, r2)
            com.instagram.common.session.UserSession r7 = r5.A05
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36324612891750672(0x810d0b00043110, double:3.03516968799444E-306)
            boolean r0 = X.C18U.A06(r4, r7, r0)
            if (r0 == 0) goto L5d
            java.lang.Runnable r0 = r5.A09
        L41:
            r0.run()
        L44:
            if (r3 == 0) goto L68
            boolean r0 = r5.A03
            if (r0 != 0) goto L68
            X.0do r0 = r5.A0G
            java.lang.Object r0 = r0.getValue()
            X.C14360o3.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L68
            r6 = 0
            return r6
        L5d:
            java.lang.ref.WeakReference r0 = r5.A0D
            java.lang.Object r0 = r0.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L44
            goto L41
        L68:
            X.0do r0 = r5.A0E
            java.lang.Object r0 = r0.getValue()
            X.C14360o3.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L93
            int r0 = r8.A00
            X.C7X7.A01(r5, r9, r0)
            X.0do r0 = r5.A0F
            java.lang.Object r0 = r0.getValue()
            X.C14360o3.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La1
            X.C7X7.A00(r5)
            return r6
        L93:
            android.view.Choreographer r3 = android.view.Choreographer.getInstance()
            X.C14360o3.A0A(r3)
            r0 = 0
            X.9FE r1 = new X.9FE
            r1.<init>(r9, r0, r8, r5)
            goto Laf
        La1:
            android.view.Choreographer r3 = android.view.Choreographer.getInstance()
            X.C14360o3.A0A(r3)
            r0 = 44
            X.9ED r1 = new X.9ED
            r1.<init>(r5, r0)
        Laf:
            X.7Mt r2 = new X.7Mt
            r2.<init>(r3, r5, r1)
            r0 = 36324612891816209(0x810d0b00053111, double:3.035169688035886E-306)
            boolean r0 = X.C18U.A06(r4, r7, r0)
            if (r0 == 0) goto Lc1
            r5.A00 = r2
        Lc1:
            r3.postFrameCallback(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7X8.DO0(int):boolean");
    }
}
