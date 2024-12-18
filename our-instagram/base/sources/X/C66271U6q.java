package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Scroller;
import com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U6q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66271U6q {
    public float A00;
    public float A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public Scroller A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public Scroller A0F;
    public final ViewGroup A0G;
    public final ViewDragHelper$Callback A0H;
    public int A02 = -1;
    public final Runnable A0I = new U7C(this);

    public static void A02(C66271U6q c66271U6q, float f) {
        c66271U6q.A0A = true;
        c66271U6q.A0H.A01(c66271U6q.A08, f);
        c66271U6q.A0A = false;
        if (c66271U6q.A03 == 1) {
            c66271U6q.A0A(0);
        }
    }

    public final void A08() {
        this.A02 = -1;
        float[] fArr = this.A0B;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public static void A03(C66271U6q c66271U6q, float f, float f2, int i) {
        float[] fArr = c66271U6q.A0B;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = c66271U6q.A0C;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = c66271U6q.A0D;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = c66271U6q.A0E;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            c66271U6q.A0B = fArr2;
            fArr = fArr2;
            c66271U6q.A0C = fArr3;
            c66271U6q.A0D = fArr4;
            c66271U6q.A0E = fArr5;
        }
        c66271U6q.A0D[i] = f;
        fArr[i] = f;
        float[] fArr9 = c66271U6q.A0C;
        c66271U6q.A0E[i] = f2;
        fArr9[i] = f2;
        c66271U6q.A05 |= 1 << i;
    }

    public static void A04(C66271U6q c66271U6q, int i) {
        float[] fArr = c66271U6q.A0B;
        if (fArr != null && fArr.length > i) {
            fArr[i] = 0.0f;
            c66271U6q.A0C[i] = 0.0f;
            c66271U6q.A0D[i] = 0.0f;
            c66271U6q.A0E[i] = 0.0f;
            c66271U6q.A05 = ((1 << i) ^ (-1)) & c66271U6q.A05;
        }
    }

    public static void A05(C66271U6q c66271U6q, int i, int i2) {
        int BeY;
        int BeY2;
        int left = c66271U6q.A08.getLeft();
        int top = c66271U6q.A08.getTop();
        ViewDragHelper$Callback viewDragHelper$Callback = c66271U6q.A0H;
        View view = c66271U6q.A08;
        C66242U5m c66242U5m = ((UKP) viewDragHelper$Callback).A00;
        if (c66242U5m.A02 != null) {
            i2 = (int) (i2 * 0.15f);
        }
        int i3 = top + i2;
        if (i != 0) {
            view.offsetLeftAndRight(-left);
        }
        if (i2 != 0) {
            View view2 = c66271U6q.A08;
            if (c66242U5m.A0C != null) {
                int height = c66242U5m.getHeight();
                InterfaceC51602Yi interfaceC51602Yi = null;
                InterfaceC51602Yi interfaceC51602Yi2 = null;
                for (InterfaceC51602Yi interfaceC51602Yi3 : c66242U5m.A0C) {
                    if (interfaceC51602Yi == null) {
                        interfaceC51602Yi = interfaceC51602Yi3;
                    } else {
                        int BeY3 = interfaceC51602Yi3.BeY(view2, height);
                        if (BeY3 >= interfaceC51602Yi2.BeY(view2, height)) {
                            if (BeY3 > interfaceC51602Yi.BeY(view2, height)) {
                                interfaceC51602Yi = interfaceC51602Yi3;
                            }
                        }
                    }
                    interfaceC51602Yi2 = interfaceC51602Yi3;
                }
                if (interfaceC51602Yi == null) {
                    BeY = i3;
                } else {
                    BeY = interfaceC51602Yi.BeY(view2, height);
                }
                if (interfaceC51602Yi2 == null) {
                    BeY2 = i3;
                } else {
                    BeY2 = interfaceC51602Yi2.BeY(view2, height);
                }
                i3 = height - Math.max(BeY2, Math.min(BeY, height - i3));
            }
            c66271U6q.A08.offsetTopAndBottom(i3 - top);
        }
        if (i != 0 || i2 != 0) {
            viewDragHelper$Callback.A00(c66271U6q.A08);
        }
    }

    public static boolean A06(C66271U6q c66271U6q, int i, int i2, int i3) {
        float f;
        int i4;
        int min;
        int i5 = i3;
        int left = c66271U6q.A08.getLeft();
        int top = c66271U6q.A08.getTop();
        int i6 = -left;
        int i7 = i - top;
        if (i6 == 0 && i7 == 0) {
            c66271U6q.A09.abortAnimation();
            c66271U6q.A0A(0);
            return false;
        }
        if (i3 < 0) {
            int i8 = (int) c66271U6q.A01;
            int i9 = (int) c66271U6q.A00;
            int abs = Math.abs(i2);
            if (abs < i8) {
                i2 = 0;
            } else if (abs > i9) {
                if (i2 <= 0) {
                    i9 = -i9;
                }
                i2 = i9;
            }
            int abs2 = Math.abs(i6);
            int abs3 = Math.abs(i7);
            int i10 = abs2 + abs3;
            if (i2 != 0) {
                f = 1.0f;
            } else {
                f = abs3 / i10;
            }
            int height = ((UKP) c66271U6q.A0H).A00.getHeight();
            int width = c66271U6q.A0G.getWidth();
            if (i7 == 0) {
                min = 0;
            } else {
                float f2 = abs3;
                float f3 = width / 2;
                float sin = f3 + (((float) Math.sin((float) ((Math.min(1.0f, f2 / width) - 0.5f) * 0.4712389167638204d))) * f3);
                int abs4 = Math.abs(i2);
                if (abs4 > 0) {
                    i4 = Math.round(Math.abs(sin / abs4) * 1000.0f) * 4;
                } else {
                    i4 = (int) (((f2 / height) + 1.0f) * 256.0f);
                }
                min = Math.min(i4, 600);
            }
            i5 = (int) (min * f);
        }
        c66271U6q.A09.startScroll(left, top, i6, i7, i5);
        c66271U6q.A04 = top + i7;
        c66271U6q.A0A(2);
        return true;
    }

    public final View A07(int i, int i2) {
        ViewGroup viewGroup = this.A0G;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                    return childAt;
                }
            } else {
                return null;
            }
        }
    }

    public final void A09() {
        Scroller scroller = this.A09;
        Scroller scroller2 = this.A0F;
        if (scroller != scroller2) {
            A08();
            if (this.A03 == 2) {
                this.A09.getCurrX();
                this.A09.getCurrY();
                this.A09.abortAnimation();
                this.A09.getCurrX();
                this.A09.getCurrY();
                this.A0H.A00(this.A08);
            }
            A0A(0);
            this.A09 = scroller2;
        }
    }

    public final void A0A(int i) {
        InterfaceC51602Yi interfaceC51602Yi;
        if (this.A03 != i) {
            this.A03 = i;
            C66242U5m c66242U5m = ((UKP) this.A0H).A00;
            View view = c66242U5m.A01;
            if (view != null && view.isLaidOut()) {
                List list = c66242U5m.A0H;
                if (!list.isEmpty()) {
                    if (i == 0) {
                        List emptyList = Collections.emptyList();
                        View view2 = c66242U5m.A01;
                        if (view2 != null && view2.isLaidOut()) {
                            int height = c66242U5m.getHeight();
                            interfaceC51602Yi = C66242U5m.A00(view2, c66242U5m, emptyList, height - view2.getTop(), height);
                        } else {
                            interfaceC51602Yi = null;
                        }
                        c66242U5m.A04 = interfaceC51602Yi;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC71941XBq) it.next()).DZo(view, interfaceC51602Yi);
                        }
                        this.A08 = null;
                    }
                    return;
                }
            }
            if (i != 0) {
                return;
            }
            this.A08 = null;
        }
    }

    public final boolean A0B(View view, int i) {
        if (view == this.A08 && this.A02 == i) {
            return true;
        }
        if (view != null) {
            this.A02 = i;
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = this.A0G;
            if (parent == viewGroup) {
                this.A08 = view;
                this.A02 = i;
                A0A(1);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sb.append(viewGroup);
            throw AbstractC58320PtC.A0m(")", sb);
        }
        return false;
    }

    public C66271U6q(Context context, ViewGroup viewGroup, ViewDragHelper$Callback viewDragHelper$Callback) {
        this.A0G = viewGroup;
        this.A0H = viewDragHelper$Callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        context.getResources().getDisplayMetrics();
        this.A06 = viewConfiguration.getScaledTouchSlop();
        this.A00 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
        Scroller scroller = new Scroller(context);
        this.A09 = scroller;
        this.A0F = scroller;
    }

    public static float A00(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            if (f <= 0.0f) {
                return -f3;
            }
            return f3;
        }
        return f;
    }

    public static void A01(MotionEvent motionEvent, C66271U6q c66271U6q) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (((1 << pointerId) & c66271U6q.A05) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                c66271U6q.A0D[pointerId] = x;
                c66271U6q.A0E[pointerId] = y;
            }
        }
    }
}
