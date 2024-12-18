package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HK1 extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final List A02;
    public final InterfaceC09390do A03;
    public final Context A04;
    public final String A05;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        C34H.A00(C05F.A03);
        A00(c120985dq, c37644Ghd, "impression");
        C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
        if (c37695GiW != null) {
            c37695GiW.A05(c120985dq, this.A01.getModuleName(), c37644Ghd.A06(), false);
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        A00(c120985dq, c37644Ghd, "sub_impression");
        C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
        if (c37695GiW != null) {
            c37695GiW.A05(c120985dq, this.A01.getModuleName(), c37644Ghd.A06(), A1a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HK1(android.content.Context r4, com.instagram.common.session.UserSession r5, X.InterfaceC60442pS r6, java.lang.String r7, java.util.List r8) {
        /*
            r3 = this;
            X.2tB r0 = X.AbstractC62712tA.A00(r5)
            X.2tC r0 = r0.A00
            X.1BX r0 = r0.A01
            X.C14360o3.A07(r0)
            r3.<init>(r0)
            r3.A00 = r5
            r3.A05 = r7
            r3.A01 = r6
            r3.A02 = r8
            r3.A04 = r4
            X.0dv r2 = X.EnumC09460dv.A02
            r1 = 5
            X.BQP r0 = new X.BQP
            r0.<init>(r3, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r2, r0)
            r3.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HK1.<init>(android.content.Context, com.instagram.common.session.UserSession, X.2pS, java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bf, code lost:
    
        if (r0 != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.C120985dq r12, X.C37644Ghd r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HK1.A00(X.5dq, X.Ghd, java.lang.String):void");
    }
}
