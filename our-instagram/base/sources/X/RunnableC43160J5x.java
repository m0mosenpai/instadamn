package X;

/* renamed from: X.J5x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43160J5x implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C120985dq A02;
    public final /* synthetic */ InterfaceC74623Ww A03;
    public final /* synthetic */ C4S7 A04;
    public final /* synthetic */ C4QW A05;
    public final /* synthetic */ C39489HcH A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public RunnableC43160J5x(C120985dq c120985dq, InterfaceC74623Ww interfaceC74623Ww, C4S7 c4s7, C4QW c4qw, C39489HcH c39489HcH, String str, float f, int i, boolean z) {
        this.A03 = interfaceC74623Ww;
        this.A05 = c4qw;
        this.A02 = c120985dq;
        this.A06 = c39489HcH;
        this.A04 = c4s7;
        this.A00 = f;
        this.A08 = z;
        this.A07 = str;
        this.A01 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r1.getChildAt(0) instanceof com.instagram.ui.widget.textureview.ScalingTextureView) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r14 = this;
            X.3Ww r4 = r14.A03
            boolean r0 = r4 instanceof android.view.ViewGroup
            r11 = 0
            if (r0 == 0) goto L4b
            r1 = r4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L4b
            android.view.View r0 = r1.getChildAt(r11)
            boolean r0 = r0 instanceof com.instagram.ui.widget.textureview.ScalingTextureView
            if (r0 == 0) goto L4b
        L18:
            X.4QW r1 = r14.A05
            X.5dq r3 = r14.A02
            X.HcH r0 = r14.A06
            com.instagram.common.session.UserSession r2 = r0.A03
            X.Ghd r0 = r0.A01
            if (r0 == 0) goto L49
            java.lang.Integer r0 = r0.A0H
        L26:
            X.3a3 r6 = r3.A0A(r2, r0)
            X.4S7 r7 = r14.A04
            float r10 = r14.A00
            boolean r13 = r14.A08
            java.lang.String r9 = r14.A07
            r0 = 6
            X.C14360o3.A0B(r9, r0)
            r0 = 0
            X.4QP r5 = new X.4QP
            r5.<init>(r0, r0, r0, r0)
            java.lang.String r8 = r3.A0N
            int r12 = r14.A01
            X.4SC r3 = new X.4SC
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.E5v(r3)
            return
        L49:
            r0 = 0
            goto L26
        L4b:
            r11 = -1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC43160J5x.run():void");
    }
}
