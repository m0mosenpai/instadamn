package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.facebook.react.uimanager.UIManagerHelper;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.WGa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70196WGa {
    public static int A00 = 250;
    public static boolean A01;
    public static final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();

    public static final int A01(String str) {
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode != 3005871) {
                if (hashCode == 104712844 && str.equals("never")) {
                    return 2;
                }
            } else if (str.equals("auto")) {
                return 1;
            }
        } else if (str.equals(AbstractC111324zv.A00(726))) {
            return 0;
        }
        AbstractC65702TsY.A1U("wrong overScrollMode: ", str);
        return 1;
    }

    public static final int A02(String str) {
        if (str == null) {
            return 0;
        }
        if ("start".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("end".equals(str)) {
            return 3;
        }
        AbstractC65702TsY.A1U("wrong snap alignment value: ", str);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Point A03(ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        C69327VlZ reactScrollViewScrollState = ((X9K) viewGroup).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(viewGroup.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.A00);
        int width = (viewGroup.getWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
        int A07 = AbstractC65702TsY.A07(viewGroup) - viewGroup.getPaddingTop();
        Point point = reactScrollViewScrollState.A04;
        overScroller.fling(A00(viewGroup, viewGroup.getScrollX(), point.x, i), A00(viewGroup, viewGroup.getScrollY(), point.y, i2), i, i2, 0, i3, 0, i4, width / 2, A07 / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(ViewGroup viewGroup, int i, int i2) {
        XC5 xc5 = (XC5) viewGroup;
        ValueAnimator flingAnimator = xc5.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            flingAnimator.addListener(new C70203WGv(viewGroup, 0));
        }
        ((X9K) viewGroup).getReactScrollViewScrollState().A04.set(i, i2);
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        if (scrollX != i) {
            xc5.EnL(scrollX, i);
        }
        if (scrollY != i2) {
            xc5.EnL(scrollY, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int A00(ViewGroup viewGroup, int i, int i2, int i3) {
        int i4;
        C69327VlZ reactScrollViewScrollState = ((X9K) viewGroup).getReactScrollViewScrollState();
        boolean z = false;
        if (i3 != 0) {
            i4 = i3 / Math.abs(i3);
        } else {
            i4 = 0;
        }
        if (i4 * (i2 - i) > 0) {
            z = true;
        }
        if (!reactScrollViewScrollState.A02 || (reactScrollViewScrollState.A01 && z)) {
            return i2;
        }
        return i;
    }

    public static final void A04(ViewGroup viewGroup) {
        A06(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(ViewGroup viewGroup, int i, int i2) {
        if (viewGroup.getId() % 2 == 0) {
            C69327VlZ reactScrollViewScrollState = ((X9K) viewGroup).getReactScrollViewScrollState();
            Point point = reactScrollViewScrollState.A05;
            if (!point.equals(i, i2)) {
                point.set(i, i2);
                if (reactScrollViewScrollState.A03 == 1) {
                    View childAt = viewGroup.getChildAt(0);
                    if (childAt != null) {
                        childAt.getWidth();
                    }
                    viewGroup.getWidth();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v16, types: [X.Sb5] */
    public static final void A07(ViewGroup viewGroup, Integer num, float f, float f2) {
        View childAt;
        long currentTimeMillis = System.currentTimeMillis();
        XD6 xd6 = (XD6) viewGroup;
        if (xd6.getScrollEventThrottle() < Math.max(17L, currentTimeMillis - xd6.getLastScrollDispatchTime()) && (childAt = viewGroup.getChildAt(0)) != null) {
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                ((Reference) it.next()).get();
            }
            Context context = viewGroup.getContext();
            C14360o3.A0C(context, AbstractC58317Pt9.A00(318));
            Q21 q21 = (Q21) context;
            int A002 = UIManagerHelper.A00(q21);
            X9J A05 = UIManagerHelper.A05(q21, viewGroup.getId());
            if (A05 != null) {
                int id = viewGroup.getId();
                float scrollX = viewGroup.getScrollX();
                float scrollY = viewGroup.getScrollY();
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                int width2 = viewGroup.getWidth();
                int height2 = viewGroup.getHeight();
                C67623Usu c67623Usu = (C67623Usu) C67623Usu.A09.A7H();
                C67623Usu c67623Usu2 = c67623Usu;
                if (c67623Usu == null) {
                    c67623Usu2 = new Sb5();
                }
                c67623Usu2.A08(A002, id);
                c67623Usu2.A08 = num;
                c67623Usu2.A00 = scrollX;
                c67623Usu2.A01 = scrollY;
                c67623Usu2.A02 = f;
                c67623Usu2.A03 = f2;
                c67623Usu2.A05 = width;
                c67623Usu2.A04 = height;
                c67623Usu2.A07 = width2;
                c67623Usu2.A06 = height2;
                A05.APn(c67623Usu2);
                xd6.setLastScrollDispatchTime(currentTimeMillis);
            }
        }
    }
}
