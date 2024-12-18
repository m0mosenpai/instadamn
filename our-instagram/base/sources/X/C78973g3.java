package X;

import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.rendercore.RenderTreeNode;
import java.util.List;
import java.util.Map;

/* renamed from: X.3g3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78973g3 {
    public static final C78973g3 A00 = new Object();

    public static final RenderTreeNode A00(Rect rect, Rect rect2, Rect rect3, C2WB c2wb, C78863fs c78863fs, RenderTreeNode renderTreeNode, Object obj, boolean z) {
        int i;
        int i2;
        int i3 = 0;
        if (renderTreeNode != null) {
            i = renderTreeNode.A00;
            i3 = renderTreeNode.A01;
        } else {
            i = 0;
        }
        int i4 = rect.left - i;
        int i5 = rect.top - i3;
        Rect rect4 = new Rect(i4, i5, rect.width() + i4, rect.height() + i5);
        C2WE c2we = new C2WE(rect3, obj, rect4.width(), rect4.height(), c78863fs.A0C, c78863fs.A0D, z);
        if (renderTreeNode != null) {
            i2 = ((List) renderTreeNode.A08.getValue()).size();
        } else {
            i2 = 0;
        }
        return new RenderTreeNode(rect4, rect2, renderTreeNode, c2wb, c2we, i2);
    }

    public static final void A02(C78973g3 c78973g3, C78863fs c78863fs, C2W5 c2w5) {
        int i;
        int i2;
        if (c2w5 != null) {
            i = c2w5.getWidth();
            i2 = c2w5.getHeight();
        } else {
            i = 0;
            i2 = 0;
        }
        C2XE c2xe = c78863fs.A0K;
        C50902Vm A03 = C50902Vm.A03(c2xe);
        C2XE A002 = C2XE.A00(A03, c2xe, C2XX.A00(null, A03, c2xe));
        StringBuilder sb = new StringBuilder();
        sb.append("root-host");
        sb.append("$host");
        String obj = sb.toString();
        C14360o3.A0B(A002, 3);
        C78923fy c78923fy = new C78923fy(null, A03, A002, null, obj, 0, 0, 2, 0L);
        c78973g3.A03(c78923fy, c78863fs, null, new RenderTreeNode(new Rect(0, 0, i, i2), null, null, c78923fy, new C2WE(null, null, i, i2, c78863fs.A0C, c78863fs.A0D, true), 0), null, 3);
    }

    private final void A03(C2WB c2wb, C78863fs c78863fs, C51272Xa c51272Xa, RenderTreeNode renderTreeNode, RenderTreeNode renderTreeNode2, int i) {
        C79043gB c79043gB;
        int i2;
        if (renderTreeNode2 != null) {
            ((List) renderTreeNode2.A08.getValue()).add(renderTreeNode);
        }
        AbstractC50812Vc abstractC50812Vc = c2wb.A03;
        boolean z = abstractC50812Vc instanceof AbstractC50792Va;
        if (z && ((AbstractC50792Va) abstractC50812Vc).A14() && c2wb.A0J() && renderTreeNode2 != null) {
            AbstractC50812Vc abstractC50812Vc2 = AbstractC79093gG.A00(renderTreeNode2).A03;
            C14360o3.A0C(abstractC50812Vc2, "null cannot be cast to non-null type com.facebook.litho.HostComponent");
            ((C50902Vm) abstractC50812Vc2).A01 = true;
        }
        List list = c78863fs.A0Q;
        int size = list.size();
        Rect rect = new Rect();
        renderTreeNode.A01(rect);
        boolean z2 = false;
        if (c2wb.A02(C79033gA.class) != null) {
            z2 = true;
        }
        C2WC c2wc = renderTreeNode.A06;
        long A0H = c2wc.A0H();
        boolean z3 = false;
        if (z2) {
            z3 = true;
        }
        if (renderTreeNode2 != null) {
            c79043gB = (C79043gB) c78863fs.A0X.get(Long.valueOf(renderTreeNode2.A06.A0H()));
        } else {
            c79043gB = null;
        }
        C79043gB c79043gB2 = new C79043gB(rect, c79043gB, size, A0H, z3);
        if (z2) {
            c78863fs.A0A = true;
        }
        list.add(renderTreeNode);
        Long valueOf = Long.valueOf(A0H);
        c78863fs.A0X.put(valueOf, c79043gB2);
        c78863fs.A0P.add(c79043gB2);
        c78863fs.A0O.add(c79043gB2);
        if ((z && ((AbstractC50792Va) abstractC50812Vc).A11()) || c2wc.A0E()) {
            c78863fs.A0a.add(valueOf);
        }
        if (c2wc instanceof C2WB) {
            C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
            C2WB c2wb2 = (C2WB) c2wc;
            SparseArray sparseArray = c2wb2.A02;
            if (sparseArray != null) {
                c78863fs.A0W.put(Long.valueOf(c2wb2.A01), new C79113gI(sparseArray, c2wb2.A03, c2wb2.A04));
            }
        }
        if (renderTreeNode2 == null && ((i2 = c78863fs.A0E) != 0 || c78863fs.A0F != 0)) {
            int i3 = c78863fs.A0F;
            rect = new Rect(i2, i3, i2 + rect.width(), rect.height() + i3);
        }
        long j = c2wb.A01;
        C51292Xc c51292Xc = new C51292Xc(rect, c2wb.A05, c51272Xa, i, j);
        c78863fs.A0I.A09(A0H, c51292Xc);
        c78863fs.A0J.A09(j, Integer.valueOf(size));
        C51282Xb c51282Xb = c78863fs.A04;
        if (c51282Xb != null) {
            c51282Xb.A03(i, c51292Xc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C78863fs r16) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78973g3.A04(X.3fs):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.facebook.rendercore.RenderTreeNode] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r48v0, types: [X.3g3] */
    public static final void A01(C2XE c2xe, C2WA c2wa, C2XQ c2xq, C78973g3 c78973g3, C78863fs c78863fs, C2W5 c2w5, RenderTreeNode renderTreeNode, int i, int i2) {
        C2WB c2wb;
        Rect rect;
        RenderTreeNode renderTreeNode2;
        RenderTreeNode renderTreeNode3;
        boolean z;
        long j;
        C51322Xf c51322Xf;
        String str;
        C2WC c2wc;
        C2WB c2wb2;
        C2WB c2wb3;
        C51272Xa c51272Xa;
        C2WB c2wb4;
        RenderTreeNode renderTreeNode4 = renderTreeNode;
        C2XE c2xe2 = c2xe;
        if (!c2xq.CVJ() && (c2w5 instanceof C2W3)) {
            C2W3 c2w3 = (C2W3) c2w5;
            C78573fP c78573fP = c2w3.A02;
            if (!c78573fP.A0F) {
                C2W1 A04 = c2w3.A04();
                try {
                    if (c2w5 instanceof C78653fX) {
                        List list = A04.A0u;
                        if (list.size() != 1) {
                            c2xe2 = ((C2Y5) list.get(1)).A04;
                        }
                        C2W3 c2w32 = c78573fP.A04;
                        if (c2w32 != null) {
                            if (list.size() > 1) {
                                int size = list.size();
                                for (int i3 = 1; i3 < size; i3++) {
                                    C2Y5 c2y5 = (C2Y5) list.get(i3);
                                    if (c2y5.A03 instanceof AbstractC50792Va) {
                                        c78863fs.A0R.add(c2y5);
                                    }
                                }
                            }
                            A01(c2xe2, c2wa, c2xq, c78973g3, c78863fs, c2w32, renderTreeNode4, i + c2w5.CI4(0), i2 + c2w5.CIb(0));
                            return;
                        }
                        return;
                    }
                    List list2 = A04.A0u;
                    C2Y5 c2y52 = (C2Y5) list2.get(0);
                    C2XE c2xe3 = c2y52.A04;
                    AbstractC50812Vc abstractC50812Vc = c2y52.A03;
                    c2xe3.A08();
                    C2W9 c2w9 = new C2W9(abstractC50812Vc, c2y52);
                    if (c2wa != null) {
                        ((C2W9) c2wa).A0F.add(c2w9);
                    } else {
                        c78863fs.A02 = c2w9;
                    }
                    if (renderTreeNode4 == 0) {
                        C2W1 A042 = c2w3.A04();
                        C2XE A05 = A042.A05();
                        C50902Vm A03 = C50902Vm.A03(A05);
                        Map map = null;
                        SparseArray A002 = C2XY.A00(A042.A0u, false);
                        A03.A00 = A002;
                        int i4 = A042.A03;
                        boolean z2 = A042.A0o;
                        boolean z3 = A042.A0l;
                        if (!A042.A0r) {
                            map = A042.A0i;
                        }
                        String A0A = A042.A0A();
                        StringBuilder sb = new StringBuilder();
                        sb.append(A0A);
                        sb.append("$host");
                        c2wb = C2XY.A02(A002, A03, A05, A042, C2XY.A04(A03, A05, A042, A042.A03), sb.toString(), map, i4, 2, 0L, z2, z3, false, true);
                    } else {
                        c2wb = c78573fP.A09;
                    }
                    boolean z4 = c2wb != null;
                    C51272Xa c51272Xa2 = c78863fs.A05;
                    C51282Xb c51282Xb = c78863fs.A04;
                    if (A04.A0O == null) {
                        C2XY.A03(A04);
                    }
                    C51272Xa c51272Xa3 = A04.A0O;
                    c78863fs.A05 = c51272Xa3;
                    c78863fs.A04 = c51272Xa3 != null ? new C51282Xb() : null;
                    Rect rect2 = new Rect(i, i2, c2w5.getWidth() + i, c2w5.getHeight() + i2);
                    if (c2w5.Bau() != 0 || c2w5.Bax() != 0 || c2w5.Baw() != 0 || c2w5.Bat() != 0) {
                        rect = new Rect(c2w5.Bau(), c2w5.Bax(), c2w5.Baw(), c2w5.Bat());
                    } else {
                        rect = null;
                    }
                    if (c2wb != null) {
                        boolean z5 = A04.A0r;
                        Rect rect3 = z5 ? null : rect;
                        if (z5) {
                            Object obj = c78863fs.A08;
                            if (obj instanceof C78653fX) {
                                obj = ((C2W3) obj).A02.A04;
                            }
                            if (!c2w3.equals(obj)) {
                                throw new IllegalArgumentException("We shouldn't insert a host as a parent of a View");
                            }
                        }
                        RenderTreeNode A003 = A00(rect2, rect3, c2w3.A03(), c2wb, c78863fs, renderTreeNode4, null, true);
                        c2w9.A08 = c2wb;
                        c78973g3.A03(c2wb, c78863fs, c78863fs.A05, A003, renderTreeNode4, 3);
                        List list3 = c78863fs.A0Q;
                        int size2 = list3.size() - 1;
                        A04(c78863fs);
                        renderTreeNode4 = list3.get(size2);
                    }
                    boolean z6 = c2xe3.A02.A01.A0Q;
                    if (!z6 && (c2wb4 = c78573fP.A05) != null) {
                        C78973g3 c78973g32 = A00;
                        RenderTreeNode renderTreeNode5 = renderTreeNode4;
                        C51272Xa c51272Xa4 = null;
                        RenderTreeNode A004 = A00(rect2, null, c2w3.A03(), c2wb4, c78863fs, renderTreeNode5, null, true);
                        C2WC c2wc2 = A004.A06;
                        C14360o3.A0C(c2wc2, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                        C2WB c2wb5 = (C2WB) c2wc2;
                        if (!z4) {
                            c51272Xa4 = c78863fs.A05;
                        }
                        c78973g32.A03(c2wb5, c78863fs, c51272Xa4, A004, renderTreeNode5, 1);
                        C14360o3.A0C(c2wc2, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                        c2w9.A04 = c2wb5;
                    }
                    Rect rect4 = A04.A0r ? rect : null;
                    Rect A032 = c2w3.A03();
                    RenderTreeNode renderTreeNode6 = renderTreeNode4;
                    if (A04.A03().A0Q() != C05F.A00 && !c78573fP.A0F && (c2wb3 = c78573fP.A07) != null) {
                        Object BMS = c2w5.BMS();
                        boolean z7 = false;
                        int i5 = rect2.left;
                        Rect rect5 = c78573fP.A0J;
                        Rect rect6 = new Rect(i5 + rect5.left, rect2.top + rect5.top, rect2.right + rect5.right, rect2.bottom + rect5.bottom);
                        if (A04.A03() instanceof AbstractC50792Va) {
                            AbstractC50812Vc A033 = A04.A03();
                            C14360o3.A0C(A033, "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent");
                            z7 = ((AbstractC50792Va) A033).A17();
                        }
                        renderTreeNode2 = A00(rect6, rect4, A032, c2wb3, c78863fs, renderTreeNode6, BMS, z7);
                        C2WC c2wc3 = renderTreeNode2.A06;
                        C14360o3.A0C(c2wc3, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                        C2WB c2wb6 = (C2WB) c2wc3;
                        C78973g3 c78973g33 = A00;
                        if (!z4) {
                            c51272Xa = c78863fs.A05;
                        } else {
                            c51272Xa = null;
                        }
                        c78973g33.A03(c2wb6, c78863fs, c51272Xa, renderTreeNode2, renderTreeNode6, 0);
                        c2w9.A06 = c2wb6;
                    } else {
                        renderTreeNode2 = null;
                    }
                    c2w9.A03 = c78573fP.A01;
                    c2w9.A00 = c78573fP.A00;
                    c2w9.A02 = c2w3.A02();
                    c2w9.A01 = (int) Float.intBitsToFloat((int) c78573fP.A02);
                    c2w9.A0C = c2w5.BMS();
                    c2w9.A0A = c2w3.A04().A0R;
                    c2w9.A09 = c78573fP.A0A;
                    List list4 = c2w3.A03;
                    int size3 = list4.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        A01(c2xe3, c2w9, c2xq, c78973g3, c78863fs, (C2W3) list4.get(i6), renderTreeNode6, i + c2w5.CI4(i6), i2 + c2w5.CIb(i6));
                    }
                    C2WB c2wb7 = c78573fP.A06;
                    if (c2wb7 != null) {
                        C78973g3 c78973g34 = A00;
                        RenderTreeNode A005 = A00(rect2, null, c2w3.A03(), c2wb7, c78863fs, renderTreeNode6, null, true);
                        C2WC c2wc4 = A005.A06;
                        C14360o3.A0C(c2wc4, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                        C2WB c2wb8 = (C2WB) c2wc4;
                        c78973g34.A03(c2wb8, c78863fs, z4 ? null : c78863fs.A05, A005, renderTreeNode6, 4);
                        C14360o3.A0C(c2wc4, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                        c2w9.A05 = c2wb8;
                    }
                    if (!z6 && (c2wb2 = c78573fP.A08) != null) {
                        C78973g3 c78973g35 = A00;
                        RenderTreeNode A006 = A00(rect2, null, c2w3.A03(), c2wb2, c78863fs, renderTreeNode6, null, true);
                        C2WC c2wc5 = A006.A06;
                        C14360o3.A0C(c2wc5, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                        C2WB c2wb9 = (C2WB) c2wc5;
                        c78973g35.A03(c2wb9, c78863fs, z4 ? null : c78863fs.A05, A006, renderTreeNode6, 2);
                        C14360o3.A0C(c2wc5, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
                        c2w9.A07 = c2wb9;
                    }
                    C2V9 c2v9 = A04.A0K;
                    if (c2v9 != null || A04.A0F != null || A04.A0I != null || A04.A0G != null || A04.A0H != null || A04.A0J != null) {
                        if (renderTreeNode2 == null) {
                            renderTreeNode3 = null;
                            if (z4) {
                                renderTreeNode3 = renderTreeNode6;
                            }
                        } else {
                            renderTreeNode3 = renderTreeNode2;
                        }
                        C2V9 c2v92 = A04.A0F;
                        C2V9 c2v93 = A04.A0I;
                        C2V9 c2v94 = A04.A0G;
                        C2V9 c2v95 = A04.A0H;
                        C2V9 c2v96 = A04.A0J;
                        AbstractC50812Vc A034 = A04.A03();
                        String A0A2 = A04.A0A();
                        String A0H = A034.A0H();
                        C14360o3.A07(A0H);
                        Rect rect7 = new Rect(rect2);
                        if (renderTreeNode3 != null) {
                            z = true;
                            j = renderTreeNode3.A06.A0H();
                        } else {
                            z = false;
                            j = 0;
                        }
                        C79133gK c79133gK = new C79133gK(rect7, c2v9, c2v95, c2v92, c2v93, c2v94, c2v96, A0A2, A0H, A04.A00, A04.A01, j, z);
                        c78863fs.A0T.add(c79133gK);
                        c2w9.A0B = c79133gK;
                    }
                    List list5 = c78863fs.A0S;
                    if (list5 != null && (str = A04.A0a) != null && str.length() != 0) {
                        if (renderTreeNode2 != null) {
                            c2wc = renderTreeNode2.A06;
                        } else {
                            c2wc = null;
                        }
                        C2WB c2wb10 = c2wc instanceof C2WB ? (C2WB) c2wc : null;
                        C22902A7x c22902A7x = new C22902A7x();
                        String str2 = A04.A0a;
                        if (str2 != null) {
                            c22902A7x.A01 = str2;
                            c22902A7x.A02.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
                            if (c2wb10 != null) {
                                c22902A7x.A00 = c2wb10.A01;
                            }
                            list5.add(c22902A7x);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    if (renderTreeNode2 != null) {
                        rect2 = new Rect();
                        renderTreeNode2.A01(rect2);
                    }
                    int size4 = list2.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        AbstractC50812Vc abstractC50812Vc2 = ((C2Y5) list2.get(i7)).A03;
                        String A0B = A04.A0B(i7);
                        C2XE c2xe4 = ((C2Y5) list2.get(i7)).A04;
                        if (abstractC50812Vc2 instanceof AbstractC50792Va) {
                            List list6 = c78863fs.A0R;
                            C2Y5 c2y53 = c2xe4.A05;
                            c2y53.getClass();
                            list6.add(c2y53);
                        }
                        Rect rect8 = new Rect(rect2);
                        c78863fs.A0V.put(A0B, rect8);
                        if (abstractC50812Vc2.A01 != null && (c51322Xf = abstractC50812Vc2.A01) != null) {
                            c78863fs.A0U.put(c51322Xf, rect8);
                        }
                    }
                    A04(c78863fs);
                    c78863fs.A05 = c51272Xa2;
                    c78863fs.A04 = c51282Xb;
                } catch (Exception e) {
                    throw C51372Xk.A00(c2xe2, e);
                }
            }
        }
    }
}
