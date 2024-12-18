package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3fB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78453fB {
    /* JADX WARN: Type inference failed for: r0v88, types: [X.3ew, java.lang.Object] */
    public static final C50882Vk A00(C2WA c2wa, C50882Vk c50882Vk, C78373f3 c78373f3, AbstractC76013b6 abstractC76013b6, int i, int i2, long j) {
        C78463fC c78463fC;
        ArrayList arrayList;
        C78303ew c78303ew;
        ArrayList arrayList2;
        int i3;
        int i4;
        RenderTreeNode renderTreeNode;
        C14360o3.A0B(c78373f3, 0);
        AbstractC76113bG.A06.addAndGet(1L);
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        C75803al c75803al = c78373f3.A06;
        if (isTracing) {
            try {
                AbstractC50812Vc abstractC50812Vc = c78373f3.A01;
                C1LP A00 = ComponentsSystrace.A00(AnonymousClass001.A0R("layoutTree:", abstractC50812Vc.A0H()));
                A00.ACV("treeId", i2);
                A00.ACV("rootId", abstractC50812Vc.A00);
                A00.ACW(C78613fT.A04(j), "sizeConstraints");
                A00.flush();
            } finally {
                C2XO c2xo = c75803al.A04;
                c2xo.A00.A00(c2xo);
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
            }
        }
        c75803al.A01();
        C2W1 c2w1 = c78373f3.A03;
        Object andSet = c78373f3.A08.getAndSet(C76123bH.A04);
        C14360o3.A07(andSet);
        C76123bH c76123bH = (C76123bH) andSet;
        C2XE c2xe = c78373f3.A02;
        if (c50882Vk != null) {
            c78463fC = new C78463fC(c50882Vk.A0X);
        } else {
            c78463fC = new C78463fC(null);
        }
        C76123bH c76123bH2 = new C76123bH(c76123bH);
        int i5 = c78373f3.A01.A00;
        Context context = c2xe.A0C;
        Object systemService = context.getSystemService("accessibility");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        C2XQ c2xq = new C2XQ(c2xe, c2wa, c76123bH2, abstractC76013b6, c75803al, c78463fC, i2, i, i5, C2XS.A00((AccessibilityManager) systemService));
        ThreadLocal threadLocal = c2xe.A0E;
        C2XR c2xr = (C2XR) threadLocal.get();
        try {
            threadLocal.set(c2xq);
            C2W3 A002 = C2XT.A00(context, c2xq, c2w1, j);
            Point point = c2xq.A00;
            int i6 = point.x;
            int i7 = point.y;
            C78323ey c78323ey = c78373f3.A05;
            if (c78323ey != null) {
                arrayList = new ArrayList(c78323ey.A01);
                C78303ew c78303ew2 = c78323ey.A00;
                ?? obj = new Object();
                obj.A00(c78303ew2);
                c78303ew = obj;
            } else {
                arrayList = null;
                c78303ew = null;
            }
            C78863fs c78863fs = new C78863fs(c2xe, c50882Vk, c78303ew, A002, arrayList, i6, i7, j);
            if (A002 != null) {
                try {
                    C2XT.A02(c2xe, c2xq, A002, c78863fs);
                } catch (Exception e) {
                    throw C51372Xk.A00(c2xe, e);
                }
            }
            C78973g3 c78973g3 = C78973g3.A00;
            if (!c2xq.CVJ()) {
                List list = c78863fs.A0Q;
                if (list.isEmpty()) {
                    C2XE c2xe2 = c78863fs.A0K;
                    boolean isTracing2 = ComponentsSystrace.A00.isTracing();
                    int i8 = c78863fs.A0G;
                    int i9 = c78863fs.A0B;
                    C2W5 c2w5 = c78863fs.A08;
                    if (c2w5 != null) {
                        i3 = c2w5.getWidth();
                        i4 = c2w5.getHeight();
                    } else {
                        i3 = 0;
                        i4 = 0;
                    }
                    int mode = View.MeasureSpec.getMode(i8);
                    if (mode != Integer.MIN_VALUE) {
                        if (mode != 0) {
                            if (mode != 1073741824) {
                                i3 = c78863fs.A01;
                            } else {
                                i3 = View.MeasureSpec.getSize(i8);
                            }
                        }
                    } else {
                        i3 = Math.max(0, Math.min(i3, View.MeasureSpec.getSize(i8)));
                    }
                    c78863fs.A01 = i3;
                    int mode2 = View.MeasureSpec.getMode(i9);
                    if (mode2 != Integer.MIN_VALUE) {
                        if (mode2 != 0) {
                            if (mode2 != 1073741824) {
                                i4 = c78863fs.A00;
                            } else {
                                i4 = View.MeasureSpec.getSize(i9);
                            }
                        }
                    } else {
                        i4 = Math.max(0, Math.min(i4, View.MeasureSpec.getSize(i9)));
                    }
                    c78863fs.A00 = i4;
                    if (c2w5 != null) {
                        if (c2xe2.A02.A01.A0P) {
                            if (c2w5 instanceof C2W3) {
                                ((C2W3) c2w5).A04();
                            }
                            C78973g3.A02(c78973g3, c78863fs, c2w5);
                            renderTreeNode = (RenderTreeNode) list.get(0);
                        } else {
                            renderTreeNode = null;
                        }
                        if (isTracing2) {
                            ComponentsSystrace.A02("collectResults");
                        }
                        try {
                            C78973g3.A01(c2xe2, null, c2xq, c78973g3, c78863fs, c2w5, renderTreeNode, 0, 0);
                            if (isTracing2) {
                                ComponentsSystrace.A01();
                                ComponentsSystrace.A02("sortMountableOutputs");
                            }
                            ArrayList arrayList3 = c78863fs.A0P;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            try {
                                Comparator comparator = AbstractC79163gN.A01;
                                C14360o3.A08(comparator);
                                C01T.A1D(arrayList3, comparator);
                                ArrayList arrayList5 = c78863fs.A0O;
                                ArrayList arrayList6 = new ArrayList(arrayList5);
                                try {
                                    Comparator comparator2 = AbstractC79163gN.A00;
                                    C14360o3.A08(comparator2);
                                    C01T.A1D(arrayList5, comparator2);
                                    if (isTracing2) {
                                        ComponentsSystrace.A01();
                                    }
                                    C2W1 c2w12 = c78863fs.A03;
                                    C2W5 c2w52 = c78863fs.A08;
                                    c78863fs.A03 = null;
                                    c78863fs.A08 = null;
                                    if (C2V3.isEndToEndTestRun) {
                                        c78863fs.A03 = c2w12;
                                    } else if (C2V3.keepLayoutResults) {
                                    }
                                    c78863fs.A08 = c2w52;
                                } catch (IllegalArgumentException e2) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(e2.getMessage());
                                    sb.append("\n");
                                    int size = arrayList6.size();
                                    sb.append(AnonymousClass001.A0O("Error while sorting ReductionState bottoms. Size: ", size));
                                    sb.append("\n");
                                    Rect rect = new Rect();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((RenderTreeNode) list.get(i10)).A01(rect);
                                        sb.append(AnonymousClass001.A02(i10, rect.bottom, "   Index ", " bottom: "));
                                        sb.append("\n");
                                    }
                                    throw new IllegalStateException(sb.toString());
                                }
                            } catch (IllegalArgumentException e3) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(e3.getMessage());
                                sb2.append("\n");
                                int size2 = arrayList4.size();
                                sb2.append(AnonymousClass001.A0O("Error while sorting ReductionState tops. Size: ", size2));
                                sb2.append("\n");
                                Rect rect2 = new Rect();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    ((RenderTreeNode) list.get(i11)).A01(rect2);
                                    sb2.append(AnonymousClass001.A02(i11, rect2.top, "   Index ", " top: "));
                                    sb2.append("\n");
                                }
                                throw new IllegalStateException(sb2.toString());
                            }
                        } catch (Exception e4) {
                            throw C51372Xk.A00(c2xe2, e4);
                        }
                    }
                } else {
                    throw new IllegalStateException(AbstractC16490ru.A0p(AnonymousClass001.A0R("Attempting to collect results on an already populated ReductionState.\n        | Root: ", c78863fs.A0N)));
                }
            }
            if (c78863fs.A0Q.isEmpty()) {
                C78973g3.A02(c78973g3, c78863fs, null);
            }
            long j2 = c78863fs.A0H;
            boolean z = c2xq.A0D;
            Map map = c78463fC.A00;
            List list2 = c78373f3.A07;
            List list3 = c2xq.A06;
            if (list2 != null && !list2.isEmpty()) {
                if (list3 != null && !list3.isEmpty()) {
                    list2 = AbstractC001800i.A0S(list3, list2);
                }
            } else {
                list2 = list3;
            }
            if (list2 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(list2);
            }
            C50882Vk c50882Vk2 = new C50882Vk(c78863fs, c78373f3, arrayList2, map, i2, j2, z);
            if (A002 != null) {
                A002.A05();
            }
            return c50882Vk2;
        } finally {
            threadLocal.set(c2xr);
            c2xq.A05 = null;
            c2xq.A04 = null;
            c2xq.A02 = null;
            c2xq.A01 = null;
            c2xq.A07 = true;
            long j3 = 1;
            AbstractC76113bG.A01.addAndGet(j3);
            if (C2XV.A01()) {
                AbstractC76113bG.A02.addAndGet(j3);
            }
            if (C78333ez.A05) {
                C78333ez.A06.A00(i2);
            }
        }
    }
}
