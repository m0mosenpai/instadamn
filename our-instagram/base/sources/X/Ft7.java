package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class Ft7 implements C2JL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C189478aR A03;
    public final /* synthetic */ C189448aO A04;
    public final /* synthetic */ C17C A05;
    public final /* synthetic */ GZW A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
    }

    public Ft7(Context context, UserSession userSession, C189478aR c189478aR, C189448aO c189448aO, C17C c17c, GZW gzw, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = c17c;
        this.A08 = z;
        this.A00 = i;
        this.A03 = c189478aR;
        this.A04 = c189448aO;
        this.A06 = gzw;
        this.A09 = z2;
        this.A07 = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r2.getCoercedBooleanField(0, r1) == false) goto L10;
     */
    @Override // X.C2JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            X.436 r15 = (X.AnonymousClass436) r15
            android.content.Context r3 = r14.A01
            com.instagram.common.session.UserSession r4 = r14.A02
            X.17C r7 = r14.A05
            boolean r10 = r14.A08
            int r9 = r14.A00
            X.8aR r5 = r14.A03
            X.8aO r6 = r14.A04
            X.GZW r8 = r14.A06
            boolean r11 = r14.A09
            if (r15 == 0) goto L32
            java.lang.Object r2 = r15.Bos()
            if (r2 == 0) goto L32
            X.2JS r2 = (X.C2JS) r2
            r0 = 1105(0x451, float:1.548E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = r2.hasFieldValue(r1)
            if (r0 == 0) goto L32
            r0 = 0
            boolean r0 = r2.getCoercedBooleanField(r0, r1)
            r12 = 1
            if (r0 != 0) goto L33
        L32:
            r12 = 0
        L33:
            boolean r13 = r14.A07
            X.AbstractC35098Fd9.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ft7.onSuccess(java.lang.Object):void");
    }
}
