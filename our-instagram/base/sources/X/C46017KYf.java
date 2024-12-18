package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KYf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46017KYf extends C1I7 implements InterfaceC61462r9 {
    public final UserSession A00;
    public final InterfaceC16660sJ A01;

    public C46017KYf(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC61462r9
    public final void E6p(float f, float f2) {
        if (f2 >= ((float) C18U.A01(C06090Tz.A06, this.A00, 36602342656774791L)) / 100.0f) {
            AbstractC25227BEk.A1Q(this.A01, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r1 instanceof androidx.recyclerview.widget.RecyclerView) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r1 = (androidx.recyclerview.widget.RecyclerView) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r0 = r1.A0V(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if ((r0 instanceof X.E2M) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r0 = r2;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r0 != r10) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x001e, code lost:
    
        if (r10 < 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0020, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r8 <= r2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        X.AbstractC25227BEk.A1Q(r6.A01, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        X.C0f9.A0A(641039894, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r1 = r7.CFj();
     */
    @Override // X.C1I7, X.C1I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScroll(X.C3FQ r7, int r8, int r9, int r10, int r11, int r12) {
        /*
            r6 = this;
            r0 = 937640975(0x37e3440f, float:2.7092201E-5)
            int r4 = X.C0f9.A03(r0)
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            r0 = -643933566(0xffffffffd99e5a82, float:-5.57157E15)
            int r1 = X.C0f9.A03(r0)
            r0 = -1689880693(0xffffffff9b46778b, float:-1.6416803E-22)
            X.C0f9.A0A(r0, r1)
            X.2xM r0 = r7.AZU()
            r3 = 0
            r2 = 0
            if (r10 >= 0) goto L2f
        L20:
            r2 = -1
        L21:
            if (r8 <= r2) goto L28
            X.0sJ r0 = r6.A01
            X.AbstractC25227BEk.A1Q(r0, r5)
        L28:
            r0 = 641039894(0x26357e16, float:6.296787E-16)
            X.C0f9.A0A(r0, r4)
            return
        L2f:
            android.view.ViewGroup r1 = r7.CFj()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L49
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L49
            X.3OO r0 = r1.A0V(r2)
        L3f:
            boolean r0 = r0 instanceof X.E2M
            if (r0 != 0) goto L21
            r0 = r2
            int r2 = r2 + 1
            if (r0 != r10) goto L2f
            goto L20
        L49:
            r0 = r3
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46017KYf.onScroll(X.3FQ, int, int, int, int, int):void");
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A0N = AbstractC167017dG.A0N(c3fq, 1778397080);
        super.onScrollStateChanged(c3fq, i);
        C0f9.A0A(989929022, A0N);
    }
}
