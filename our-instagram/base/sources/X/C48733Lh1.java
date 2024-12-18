package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lh1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48733Lh1 implements InterfaceC50475MQd {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public C1I4 A05;
    public RecyclerView A06;
    public IgTextView A07;
    public IgdExpressionTrayHscrollLayout A08;
    public C45104JxY A09;
    public C7IK A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final GridLayoutManager A0E;
    public final InterfaceC11380iw A0F;
    public final UserSession A0G;
    public final InterfaceC56392iX A0H;
    public final C7FJ A0I;
    public final C47325Kva A0J;
    public final L4U A0K;
    public final LF5 A0L;
    public final L49 A0M;
    public final C47972LIg A0N;
    public final C47679L3m A0O;
    public final C47645L2e A0P;
    public final C48505Lcw A0Q;
    public final AbstractC47789L8v A0R;
    public final DirectThreadKey A0S;
    public final C3DN A0T;
    public final String A0U;
    public final InterfaceC09390do A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public static final void A01(C48733Lh1 c48733Lh1) {
        A04(c48733Lh1, false);
        boolean A1b = AbstractC166987dD.A1b(c48733Lh1.A09.A03);
        C45104JxY c45104JxY = c48733Lh1.A09;
        A02(c48733Lh1, C45104JxY.A00(c45104JxY.A00, c45104JxY.A02, c45104JxY.A04, c45104JxY.A03, C16930sl.A00, c45104JxY.A05, c45104JxY.A08, c45104JxY.A0A, false, c45104JxY.A09, c45104JxY.A07, c45104JxY.A06));
        c48733Lh1.A05(!A1b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r6.A03 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (X.AbstractC166987dD.A1b(r1.A01) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r6.A03 != false) goto L10;
     */
    @Override // X.InterfaceC50475MQd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DFh(X.AbstractC115105If r23, java.lang.String r24) {
        /*
            r22 = this;
            r2 = 0
            r3 = r22
            A04(r3, r2)
            int r0 = r24.length()
            boolean r9 = X.AbstractC167007dF.A1N(r0)
            X.JxY r8 = r3.A09
            X.0sl r11 = X.C16930sl.A00
            if (r9 == 0) goto L7d
            java.lang.Integer r10 = X.C05F.A00
        L16:
            X.L49 r6 = r3.A0M
            boolean r7 = r6.A05
            if (r7 == 0) goto L24
            if (r9 == 0) goto L24
            boolean r0 = r6.A03
            r16 = 1
            if (r0 == 0) goto L26
        L24:
            r16 = 0
        L26:
            boolean r5 = r6.A04
            if (r5 == 0) goto L32
            if (r9 == 0) goto L32
            boolean r0 = r6.A03
            r17 = 1
            if (r0 == 0) goto L34
        L32:
            r17 = 0
        L34:
            boolean r4 = r6.A02
            boolean r1 = r6.A00
            java.util.List r14 = r8.A01
            java.util.Map r15 = r8.A05
            boolean r0 = r8.A0B
            r12 = r11
            r13 = r11
            r20 = r1
            r21 = r2
            r18 = r0
            r19 = r4
            X.JxY r0 = X.C45104JxY.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            A02(r3, r0)
            if (r7 == 0) goto L5b
            if (r9 == 0) goto L5b
            boolean r0 = r6.A03
            if (r0 != 0) goto L5b
        L57:
            r3.A05(r2)
            return
        L5b:
            if (r5 == 0) goto L64
            if (r9 == 0) goto L64
            boolean r0 = r6.A03
            if (r0 != 0) goto L64
            goto L57
        L64:
            boolean r0 = r3.A0W
            if (r0 == 0) goto L7b
            boolean r0 = r3.A0b
            if (r0 != 0) goto L57
            X.JxY r1 = r3.A09
            boolean r0 = r1.A0B
            if (r0 != 0) goto L57
            java.util.List r0 = r1.A01
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto L7b
            goto L57
        L7b:
            r2 = 1
            goto L57
        L7d:
            java.lang.Integer r10 = X.C05F.A01
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48733Lh1.DFh(X.5If, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r2 = X.AbstractC06930Yk.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r12 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r13 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r10 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r12 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r5.A03 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r5.A04 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r12 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r5.A03 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        if (r5.A01 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r12 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        r2 = X.C45104JxY.A00(r13, r14, r15, r9, r3, r2, r19, r20, r21, r5.A02, r5.A00, r4.A06);
        r25.A09 = r2;
        A02(r25, r2);
        r2 = r25.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r2 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        X.C14360o3.A0F("recyclerView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:
    
        r2.setVisibility(0);
        A05(false);
        A04(r25, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0085, code lost:
    
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x007b, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x006d, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b0, code lost:
    
        r13 = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0055, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r14 == null) goto L11;
     */
    @Override // X.InterfaceC50475MQd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dnu(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48733Lh1.Dnu(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r6.A03 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r6.A03 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        if (X.AbstractC166987dD.A1b(r1.A01) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (r8 == false) goto L46;
     */
    @Override // X.InterfaceC50475MQd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DqH(java.util.List r22, java.util.List r23, java.lang.String r24) {
        /*
            r21 = this;
            r4 = 0
            r6 = r24
            int r0 = r6.length()
            r2 = 1
            boolean r8 = X.AbstractC167007dF.A1N(r0)
            java.util.ArrayList r12 = X.AbstractC167007dF.A0i(r22)
            java.util.Iterator r3 = r22.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r1 = r3.next()
            X.JwH r1 = (X.C45026JwH) r1
            X.JWd r0 = new X.JWd
            r0.<init>(r1, r6)
            r12.add(r0)
            goto L14
        L29:
            if (r23 != 0) goto L4c
            X.0sl r0 = X.C16930sl.A00
        L2d:
            java.util.ArrayList r10 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r5 = r0.iterator()
        L35:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r3 = r5.next()
            X.6ly r3 = (X.C148286ly) r3
            r1 = 8
            X.JWd r0 = new X.JWd
            r0.<init>(r3, r6, r1)
            r10.add(r0)
            goto L35
        L4c:
            r0 = r23
            goto L2d
        L4f:
            r3 = r21
            androidx.recyclerview.widget.RecyclerView r0 = r3.A06
            if (r0 != 0) goto L5f
            java.lang.String r0 = "recyclerView"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L5f:
            r0.A0n(r4)
            X.JxY r0 = r3.A09
            java.util.List r11 = r0.A04
            if (r8 == 0) goto Ld2
            java.lang.Integer r9 = X.C05F.A00
        L6a:
            X.L49 r6 = r3.A0M
            boolean r1 = r6.A05
            if (r1 == 0) goto L77
            if (r8 == 0) goto L77
            boolean r1 = r6.A03
            r15 = 1
            if (r1 == 0) goto L78
        L77:
            r15 = 0
        L78:
            boolean r1 = r6.A04
            if (r1 == 0) goto L84
            if (r8 == 0) goto L84
            boolean r1 = r6.A03
            r16 = 1
            if (r1 == 0) goto L86
        L84:
            r16 = 0
        L86:
            boolean r5 = r6.A02
            boolean r1 = r6.A00
            if (r23 != 0) goto L8e
            X.0sl r23 = X.C16930sl.A00
        L8e:
            int r7 = r23.size()
            int r6 = r3.A0B
            boolean r20 = X.AbstractC25230BEn.A1S(r7, r6)
            java.util.List r13 = r0.A01
            java.util.Map r14 = r0.A05
            boolean r0 = r0.A0B
            r18 = r5
            r19 = r1
            r17 = r0
            X.JxY r0 = X.C45104JxY.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            A02(r3, r0)
            A04(r3, r4)
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto Lca
            boolean r0 = r3.A0W
            if (r0 == 0) goto Lcf
            boolean r0 = r3.A0b
            if (r0 != 0) goto Lca
            X.JxY r1 = r3.A09
            boolean r0 = r1.A0B
            if (r0 != 0) goto Lca
            java.util.List r0 = r1.A01
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto Lcf
        Lca:
            r2 = 0
        Lcb:
            r3.A05(r2)
            return
        Lcf:
            if (r8 != 0) goto Lca
            goto Lcb
        Ld2:
            java.lang.Integer r9 = X.C05F.A01
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48733Lh1.DqH(java.util.List, java.util.List, java.lang.String):void");
    }

    public static final void A00(C45105JxZ c45105JxZ, C48733Lh1 c48733Lh1, Integer num) {
        Object obj;
        ArrayList A0U = AbstractC001800i.A0U(c48733Lh1.A09.A04);
        if (num.intValue() != 0) {
            Iterator it = A0U.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((C45105JxZ) obj).A01(), c45105JxZ.A01())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C15500q5.A00(A0U).remove(obj);
        } else {
            A0U.add(c45105JxZ);
        }
        C45104JxY c45104JxY = c48733Lh1.A09;
        A03(c48733Lh1, c45104JxY, c45104JxY.A00, c45104JxY.A02, A0U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (X.C18U.A06(r7, r4, 36322697336072603L) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0302 A[LOOP:2: B:133:0x02fc->B:135:0x0302, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019d  */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C48733Lh1 r36, X.C45104JxY r37) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48733Lh1.A02(X.Lh1, X.JxY):void");
    }

    public static void A03(C48733Lh1 c48733Lh1, C45104JxY c45104JxY, Integer num, List list, List list2) {
        A02(c48733Lh1, C45104JxY.A00(num, list, list2, c45104JxY.A03, c45104JxY.A01, c45104JxY.A05, c45104JxY.A08, c45104JxY.A0A, c45104JxY.A0B, c45104JxY.A09, c45104JxY.A07, c45104JxY.A06));
    }

    public static final void A04(C48733Lh1 c48733Lh1, boolean z) {
        String str = "loadingSpinner";
        if (z) {
            RecyclerView recyclerView = c48733Lh1.A06;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                recyclerView.setVisibility(8);
                View view = c48733Lh1.A01;
                if (view == null) {
                    str = "emptyView";
                } else {
                    view.setVisibility(8);
                    View view2 = c48733Lh1.A02;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        return;
                    }
                }
            }
        } else {
            View view3 = c48733Lh1.A02;
            if (view3 != null) {
                view3.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A05(boolean z) {
        String str = "emptyView";
        RecyclerView recyclerView = this.A06;
        if (z) {
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                View view = this.A02;
                if (view == null) {
                    str = "loadingSpinner";
                } else {
                    view.setVisibility(8);
                    View view2 = this.A01;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        return;
                    }
                }
                C14360o3.A0F(str);
            }
            C14360o3.A0F("recyclerView");
        } else {
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                View view3 = this.A01;
                if (view3 != null) {
                    view3.setVisibility(8);
                    return;
                }
                C14360o3.A0F(str);
            }
            C14360o3.A0F("recyclerView");
        }
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ed, code lost:
    
        if (X.C18U.A06(r10, r37, 36329612233556400L) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ff, code lost:
    
        if (X.AbstractC159387Cy.A04(r37, r42, X.C05F.A06).A00() != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (X.C18U.A06(r10, r3, 36328229254479200L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C48733Lh1(android.content.Context r34, com.instagram.api.schemas.GiphyRequestSurface r35, X.InterfaceC11380iw r36, com.instagram.common.session.UserSession r37, X.C1GL r38, X.InterfaceC56392iX r39, X.C47325Kva r40, X.EnumC46186KcO r41, com.instagram.model.direct.DirectThreadKey r42, X.C3DN r43, java.lang.String r44, java.lang.String r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48733Lh1.<init>(android.content.Context, com.instagram.api.schemas.GiphyRequestSurface, X.0iw, com.instagram.common.session.UserSession, X.1GL, X.2iX, X.Kva, X.KcO, com.instagram.model.direct.DirectThreadKey, X.3DN, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
