package X;

/* loaded from: classes8.dex */
public final class LT7 implements InterfaceC48192Ji {
    public final /* synthetic */ C47812L9u A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;

    public LT7(C47812L9u c47812L9u, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c47812L9u;
        this.A04 = interfaceC16660sJ;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = interfaceC16820sZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (r8 == null) goto L12;
     */
    @Override // X.InterfaceC48192Ji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.AnonymousClass436 r14) {
        /*
            r13 = this;
            X.L9u r5 = r13.A00
            X.5cA r0 = r5.A00
            r4 = 1
            r0.A03(r4)
            r6 = 0
            if (r14 == 0) goto L5e
            X.2JS r3 = X.AbstractC25225BEi.A0k(r14)
            if (r3 == 0) goto L5e
            java.lang.Class<X.Qf2> r2 = X.Qf2.class
            java.lang.String r1 = "xfb_genai_platform_agent_sync_chat(agent_id:$agent_id,metagen_key:$metagen_key,plugin_request_options:$plugin_request_options,prompt:{\"content\":$content,\"role\":$role},runtime_params:$runtime_params)"
            r0 = 324345727(0x13551f7f, float:2.6899908E-27)
            X.2JS r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L5e
            java.lang.Class<X.Qf1> r2 = X.Qf1.class
            r0 = 50
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 333974355(0x13e80b53, float:5.85762E-27)
            X.2JS r7 = r3.getOptionalTreeField(r4, r1, r2, r0)
            X.Qf1 r7 = (X.Qf1) r7
            if (r7 == 0) goto L47
            java.lang.Class<X.Qf0> r3 = X.Qf0.class
            r2 = 3
            java.lang.String r1 = "error"
            r0 = -279505678(0xffffffffef5714f2, float:-6.65646E28)
            X.2JS r6 = r7.getOptionalTreeField(r2, r1, r3, r0)
            X.Qf0 r6 = (X.Qf0) r6
            java.lang.String r0 = "response"
            java.lang.String r8 = r7.A09(r0)
            if (r8 != 0) goto L49
        L47:
            java.lang.String r8 = ""
        L49:
            android.os.Handler r0 = X.AbstractC167007dF.A0J()
            X.0sJ r12 = r13.A04
            java.lang.String r9 = r13.A02
            java.lang.String r10 = r13.A01
            X.0sZ r11 = r13.A03
            X.M7D r4 = new X.M7D
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.post(r4)
            return
        L5e:
            r7 = r6
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LT7.invoke(X.436):void");
    }
}
