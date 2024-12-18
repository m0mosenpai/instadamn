package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTS extends AbstractC55206OeJ {
    public long A00;
    public C51878MwM A01;
    public boolean A02;
    public boolean A03;
    public final Activity A04;
    public final C006802i A05;
    public final UserSession A06;
    public final C23031Ai A07;
    public final C55177Odh A08;
    public final PCR A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC16820sZ A0L;
    public final long A0M;
    public final OC9 A0N;
    public final OI6 A0O;
    public final PCA A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c4, code lost:
    
        if (X.C18U.A06(r5, r10, 36320713061573450L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NTS(android.app.Activity r9, com.instagram.common.session.UserSession r10, X.OC9 r11, X.OI6 r12, X.C55177Odh r13, X.PCR r14, X.PCA r15, X.InterfaceC16820sZ r16) {
        /*
            r8 = this;
            r0 = 5
            X.C14360o3.A0B(r13, r0)
            X.AbstractC167017dG.A1U(r12, r11)
            r0 = 8
            r1 = r16
            X.C14360o3.A0B(r1, r0)
            java.lang.Class<X.MwM> r0 = X.C51878MwM.class
            X.0YZ r0 = X.AbstractC25225BEi.A1D(r0)
            r8.<init>(r0)
            r8.A04 = r9
            r8.A06 = r10
            r8.A09 = r14
            r8.A0P = r15
            r8.A08 = r13
            r8.A0O = r12
            r8.A0N = r11
            r8.A0L = r1
            r0 = 34
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0J = r0
            r0 = 28
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0C = r0
            r0 = 27
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0B = r0
            r0 = 33
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0I = r0
            r0 = 32
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0H = r0
            r0 = 31
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0F = r0
            r0 = 29
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0D = r0
            r0 = 30
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0E = r0
            r0 = 35
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0K = r0
            r0 = 26
            X.0do r0 = X.C57520Pfu.A00(r8, r0)
            r8.A0A = r0
            X.PeS r0 = X.C57430PeS.A00
            X.0do r0 = X.C1XM.A00(r0)
            r8.A0G = r0
            X.0Tz r5 = X.C06090Tz.A05
            r3 = 36602188038214250(0x82097f0005126a, double:3.210709328323408E-306)
            long r6 = X.C18U.A01(r5, r10, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            if (r0 == 0) goto Ld7
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Ld7
            r0 = 2000(0x7d0, double:9.88E-321)
        L98:
            r8.A0M = r0
            r8.A00 = r0
            X.1Ai r0 = X.AbstractC23021Ah.A00(r10)
            r8.A07 = r0
            r0 = 36320713061311303(0x81097f00022347, double:3.0327034195212264E-306)
            boolean r0 = X.C18U.A06(r5, r10, r0)
            r8.A0S = r0
            r0 = 36320713061180229(0x81097f00002345, double:3.0327034194383347E-306)
            boolean r0 = X.C18U.A06(r5, r10, r0)
            r8.A0R = r0
            if (r0 == 0) goto Lc6
            r0 = 36320713061573450(0x81097f0006234a, double:3.032703419687009E-306)
            boolean r1 = X.C18U.A06(r5, r10, r0)
            r0 = 1
            if (r1 != 0) goto Lc7
        Lc6:
            r0 = 0
        Lc7:
            r8.A0Q = r0
            X.02i r0 = X.C006802i.A0p
            r8.A05 = r0
            X.PCR r1 = r8.A09
            X.O53 r0 = new X.O53
            r0.<init>(r8)
            r1.A01 = r0
            return
        Ld7:
            long r0 = X.C18U.A01(r5, r10, r3)
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NTS.<init>(android.app.Activity, com.instagram.common.session.UserSession, X.OC9, X.OI6, X.Odh, X.PCR, X.PCA, X.0sZ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x04bc, code lost:
    
        if (r5 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r12.A02 == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0321  */
    /* JADX WARN: Type inference failed for: r0v131, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.view.View[]] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.View[]] */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(X.C51878MwM r34) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NTS.A0M(X.MwM):void");
    }

    public static void A00(PCR pcr, InterfaceC09390do interfaceC09390do, int i) {
        View view = (View) interfaceC09390do.getValue();
        if (view != null) {
            PCR.A01(view, pcr, i);
        }
    }
}
