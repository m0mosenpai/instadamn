package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.SiF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63358SiF {
    public static final float[] A01 = new float[2];
    public static final PointF A03 = new PointF();
    public static final float[] A02 = new float[2];
    public static final Matrix A00 = AbstractC166987dD.A0Q();

    /* JADX WARN: Multi-variable type inference failed */
    public static View A01(View view, EnumSet enumSet, List list, float[] fArr) {
        InterfaceC65495TlJ interfaceC65495TlJ;
        int i;
        if (enumSet.contains(EnumC61092Rf6.CHILD) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!A03(view, fArr[0], fArr[1])) {
                if (view instanceof InterfaceC65658Tqk) {
                    if (view.getId() % 2 == 0) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        Rect overflowInset = ((InterfaceC65658Tqk) view).getOverflowInset();
                        if (f < overflowInset.left || f >= view.getWidth() - overflowInset.right || f2 < overflowInset.top || f2 >= view.getHeight() - overflowInset.bottom) {
                            return null;
                        }
                    }
                    String overflow = ((InterfaceC65360Tio) view).getOverflow();
                    if ("hidden".equals(overflow) || "scroll".equals(overflow)) {
                        return null;
                    }
                }
                if (viewGroup.getClipChildren()) {
                    return null;
                }
            }
            int childCount = viewGroup.getChildCount();
            if (viewGroup instanceof InterfaceC65495TlJ) {
                interfaceC65495TlJ = (InterfaceC65495TlJ) viewGroup;
            } else {
                interfaceC65495TlJ = null;
            }
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                if (interfaceC65495TlJ != null) {
                    i = interfaceC65495TlJ.CIj(i2);
                } else {
                    i = i2;
                }
                View childAt = viewGroup.getChildAt(i);
                PointF pointF = A03;
                float f3 = fArr[0];
                float scrollX = (f3 + viewGroup.getScrollX()) - childAt.getLeft();
                float scrollY = (fArr[1] + viewGroup.getScrollY()) - childAt.getTop();
                Matrix matrix = childAt.getMatrix();
                if (!matrix.isIdentity()) {
                    float[] fArr2 = A02;
                    fArr2[0] = scrollX;
                    fArr2[1] = scrollY;
                    Matrix matrix2 = A00;
                    matrix.invert(matrix2);
                    matrix2.mapPoints(fArr2);
                    scrollX = fArr2[0];
                    scrollY = fArr2[1];
                }
                pointF.set(scrollX, scrollY);
                float f4 = fArr[0];
                float f5 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View A022 = A02(childAt, list, fArr);
                if (A022 != null) {
                    return A022;
                }
                fArr[0] = f4;
                fArr[1] = f5;
            }
        }
        if (!enumSet.contains(EnumC61092Rf6.SELF) || !A03(view, fArr[0], fArr[1])) {
            return null;
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View A02(View view, List list, float[] fArr) {
        EnumC61122Rfc enumC61122Rfc;
        EnumSet of;
        if (view instanceof InterfaceC65224TgG) {
            enumC61122Rfc = ((Q4W) ((InterfaceC65224TgG) view)).A04;
        } else {
            enumC61122Rfc = EnumC61122Rfc.A02;
        }
        if (!view.isEnabled()) {
            if (enumC61122Rfc == EnumC61122Rfc.A02) {
                enumC61122Rfc = EnumC61122Rfc.A03;
            } else if (enumC61122Rfc == EnumC61122Rfc.A04) {
                enumC61122Rfc = EnumC61122Rfc.A05;
            }
        }
        View view2 = null;
        if (enumC61122Rfc != EnumC61122Rfc.A05) {
            if (enumC61122Rfc == EnumC61122Rfc.A04) {
                of = EnumSet.of(EnumC61092Rf6.SELF);
            } else if (enumC61122Rfc == EnumC61122Rfc.A03) {
                View A012 = A01(view, EnumSet.of(EnumC61092Rf6.CHILD), list, fArr);
                if (A012 != null) {
                    if (list != null) {
                        list.add(new SNX(view, view.getId()));
                    }
                    return A012;
                }
                if ((view instanceof InterfaceC65359Tin) && A03(view, fArr[0], fArr[1]) && ((InterfaceC65359Tin) view).E7k(fArr[0], fArr[1]) != view.getId()) {
                    if (list != null) {
                        list.add(new SNX(view, view.getId()));
                    }
                    return view;
                }
            } else {
                if (enumC61122Rfc != EnumC61122Rfc.A02) {
                    C0I2.A04("ReactNative", AnonymousClass001.A0R("Unknown pointer event type: ", enumC61122Rfc.toString()));
                }
                of = EnumSet.of(EnumC61092Rf6.SELF, EnumC61092Rf6.CHILD);
            }
            view2 = A01(view, of, list, fArr);
            if (view2 != null && list != null) {
                list.add(new SNX(view, view.getId()));
            }
        }
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A03(android.view.View r5, float r6, float r7) {
        /*
            boolean r0 = r5 instanceof X.InterfaceC65222TgD
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L38
            r0 = r5
            X.TgD r0 = (X.InterfaceC65222TgD) r0
            X.Q4W r0 = (X.Q4W) r0
            android.graphics.Rect r2 = r0.A02
            if (r2 == 0) goto L38
            int r0 = r2.left
            int r0 = -r0
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L4f
            int r1 = r5.getWidth()
            int r0 = r2.right
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4f
            int r0 = r2.top
            int r0 = -r0
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L4f
            int r1 = r5.getHeight()
            int r0 = r2.bottom
            int r1 = r1 + r0
        L32:
            float r0 = (float) r1
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4f
            return r4
        L38:
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L4f
            int r0 = r5.getWidth()
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4f
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L4f
            int r1 = r5.getHeight()
            goto L32
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63358SiF.A03(android.view.View, float, float):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int A00(ViewGroup viewGroup, float[] fArr, float f, float f2) {
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        for (View view = A02(viewGroup, null, fArr); view != 0; view = (View) view.getParent()) {
            if (view.getId() > 0) {
                float f3 = fArr[0];
                float f4 = fArr[1];
                if (view instanceof InterfaceC65359Tin) {
                    return ((InterfaceC65359Tin) view).E7k(f3, f4);
                }
                return view.getId();
            }
        }
        return id;
    }
}
