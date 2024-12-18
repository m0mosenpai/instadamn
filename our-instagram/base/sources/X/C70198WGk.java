package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.WGk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70198WGk {
    public static final Interpolator A0N = new WOW();
    public float A00;
    public float A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public boolean A09;
    public float[] A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public int[] A0E;
    public int[] A0F;
    public int[] A0G;
    public VelocityTracker A0H;
    public OverScroller A0I;
    public final int A0J;
    public final ViewGroup A0K;
    public final VKH A0L;
    public int A02 = -1;
    public final Runnable A0M = new RunnableC71219WqA(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    private void A03(int i, float f, float f2) {
        boolean A06 = A06(f, f2, i, 1);
        boolean z = A06;
        if (A06(f2, f, i, 4)) {
            z = (A06 ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (A06(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r2 = z2;
        if (A06(f2, f, i, 8)) {
            r2 = (z2 ? 1 : 0) | 8;
        }
        if (r2 != 0) {
            int[] iArr = this.A0E;
            iArr[i] = iArr[i] | r2;
            VKH vkh = this.A0L;
            if (vkh instanceof C66378UEm) {
                C66378UEm c66378UEm = (C66378UEm) vkh;
                if (C66378UEm.A00(c66378UEm)) {
                    SlidingPaneLayout slidingPaneLayout = c66378UEm.A00;
                    slidingPaneLayout.A0K.A0G(slidingPaneLayout.A06, i);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A08(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L2f
            X.VKH r1 = r4.A0L
            int r0 = r1.A01(r5)
            boolean r2 = X.AbstractC167007dF.A1O(r0)
            boolean r0 = r1 instanceof X.C66376UEk
            if (r0 == 0) goto L41
            X.UEk r1 = (X.C66376UEk) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r1.A00
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L3e
            int r0 = r1.A0C
        L1b:
            boolean r0 = X.AbstractC167007dF.A1O(r0)
            if (r2 == 0) goto L30
            if (r0 == 0) goto L37
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r6 = r6 + r7
            int r0 = r4.A06
            int r0 = r0 * r0
        L29:
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r3 = 1
        L2f:
            return r3
        L30:
            if (r0 == 0) goto L2f
            float r6 = java.lang.Math.abs(r7)
            goto L3b
        L37:
            float r6 = java.lang.Math.abs(r6)
        L3b:
            int r0 = r4.A06
            goto L29
        L3e:
            int r0 = r1.A04
            goto L1b
        L41:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70198WGk.A08(android.view.View, float, float):boolean");
    }

    public static final boolean A09(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void A0D() {
        this.A02 = -1;
        float[] fArr = this.A0A;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0B, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0G, 0);
            Arrays.fill(this.A0E, 0);
            Arrays.fill(this.A0F, 0);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A0H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0H = null;
        }
    }

    private int A00(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.A0K.getWidth();
        float abs = Math.abs(i);
        float f = width / 2;
        float sin = f + (((float) Math.sin((Math.min(1.0f, abs / width) - 0.5f) * 0.47123894f)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            i4 = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            i4 = (int) (((abs / i3) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    private void A01() {
        VelocityTracker velocityTracker = this.A0H;
        float f = this.A00;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.A0H.getXVelocity(this.A02);
        float f2 = this.A01;
        float f3 = f;
        float abs = Math.abs(xVelocity);
        if (abs < f2) {
            f3 = 0.0f;
        } else if (abs > f) {
            if (xVelocity <= 0.0f) {
                f3 = -f;
            }
        } else {
            f3 = xVelocity;
        }
        float yVelocity = this.A0H.getYVelocity(this.A02);
        float f4 = this.A01;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f4) {
            f = 0.0f;
        } else if (abs2 > f) {
            if (yVelocity <= 0.0f) {
                f = -f;
            }
        } else {
            f = yVelocity;
        }
        this.A09 = true;
        this.A0L.A04(this.A08, f3, f);
        this.A09 = false;
        if (this.A03 == 1) {
            A0E(0);
        }
    }

    private void A02(int i) {
        float[] fArr = this.A0A;
        if (fArr != null) {
            int i2 = this.A05;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.A0B[i] = 0.0f;
                this.A0C[i] = 0.0f;
                this.A0D[i] = 0.0f;
                this.A0G[i] = 0;
                this.A0E[i] = 0;
                this.A0F[i] = 0;
                this.A05 = (i3 ^ (-1)) & i2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A04(int i, float f, float f2) {
        float[] fArr = this.A0A;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0B;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0C;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0D;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0G;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0E;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0F;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A0A = fArr2;
            fArr = fArr2;
            this.A0B = fArr3;
            this.A0C = fArr4;
            this.A0D = fArr5;
            this.A0G = iArr;
            this.A0E = iArr2;
            this.A0F = iArr3;
        }
        this.A0C[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.A0B;
        this.A0D[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.A0G;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.A0K;
        boolean A1Q = AbstractC167007dF.A1Q(i3, viewGroup.getLeft() + this.A04);
        int i5 = A1Q;
        if (i4 < viewGroup.getTop() + this.A04) {
            i5 = (A1Q ? 1 : 0) | 4;
        }
        int i6 = i5;
        if (i3 > viewGroup.getRight() - this.A04) {
            i6 = (i5 == true ? 1 : 0) | 2;
        }
        int i7 = i6;
        if (i4 > viewGroup.getBottom() - this.A04) {
            i7 = (i6 == true ? 1 : 0) | 8;
        }
        iArr7[i] = i7;
        this.A05 |= 1 << i;
    }

    private boolean A07(int i) {
        if (((1 << i) & this.A05) != 0) {
            return true;
        }
        android.util.Log.e("ViewDragHelper", AnonymousClass001.A0c("Ignoring pointerId=", " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.", i));
        return false;
    }

    public static boolean A0A(C70198WGk c70198WGk, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i4;
        int i7 = i3;
        int left = c70198WGk.A08.getLeft();
        int top = c70198WGk.A08.getTop();
        int i8 = i - left;
        int i9 = i2 - top;
        if (i8 == 0 && i9 == 0) {
            c70198WGk.A0I.abortAnimation();
            c70198WGk.A0E(0);
            return false;
        }
        View view = c70198WGk.A08;
        int i10 = (int) c70198WGk.A01;
        int i11 = (int) c70198WGk.A00;
        int i12 = i11;
        int abs = Math.abs(i7);
        if (abs < i10) {
            i7 = 0;
        } else if (abs > i11) {
            if (i3 <= 0) {
                i12 = -i11;
            }
            i7 = i12;
        }
        int abs2 = Math.abs(i6);
        if (abs2 < i10) {
            i6 = 0;
        } else if (abs2 > i11) {
            if (i4 <= 0) {
                i11 = -i11;
            }
            i6 = i11;
        }
        int abs3 = Math.abs(i8);
        int abs4 = Math.abs(i9);
        int abs5 = Math.abs(i7);
        int abs6 = Math.abs(i6);
        int i13 = abs5 + abs6;
        float f = abs3;
        float f2 = abs3 + abs4;
        float f3 = f2;
        if (i7 != 0) {
            f = abs5;
            f2 = i13;
        }
        float f4 = f / f2;
        float f5 = abs4;
        if (i6 != 0) {
            f5 = abs6;
            f3 = i13;
        }
        float f6 = f5 / f3;
        VKH vkh = c70198WGk.A0L;
        int A00 = c70198WGk.A00(i8, i7, vkh.A01(view));
        if (vkh instanceof C66376UEk) {
            BottomSheetBehavior bottomSheetBehavior = ((C66376UEk) vkh).A00;
            if (bottomSheetBehavior.A0Q) {
                i5 = bottomSheetBehavior.A0C;
            } else {
                i5 = bottomSheetBehavior.A04;
            }
        } else {
            i5 = 0;
        }
        c70198WGk.A0I.startScroll(left, top, i8, i9, (int) ((A00 * f4) + (c70198WGk.A00(i9, i6, i5) * f6)));
        c70198WGk.A0E(2);
        return true;
    }

    public final View A0B(int i, int i2) {
        ViewGroup viewGroup = this.A0K;
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

    public final void A0E(int i) {
        boolean z;
        this.A0K.removeCallbacks(this.A0M);
        if (this.A03 != i) {
            this.A03 = i;
            VKH vkh = this.A0L;
            if (vkh instanceof C66376UEk) {
                C66376UEk c66376UEk = (C66376UEk) vkh;
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = c66376UEk.A00;
                    if (bottomSheetBehavior.A0N) {
                        bottomSheetBehavior.A0X(1);
                    }
                }
            } else if (vkh instanceof C66377UEl) {
                InterfaceC71910X9u interfaceC71910X9u = ((C66377UEl) vkh).A02.A04;
                if (interfaceC71910X9u != null) {
                    C70194WFy A00 = C70194WFy.A00();
                    X87 x87 = ((WcO) interfaceC71910X9u).A00.A04;
                    if (i != 0) {
                        A00.A05(x87);
                    } else {
                        A00.A06(x87);
                    }
                }
            } else {
                SlidingPaneLayout slidingPaneLayout = ((C66378UEm) vkh).A00;
                if (slidingPaneLayout.A0K.A03 == 0) {
                    float f = slidingPaneLayout.A00;
                    View view = slidingPaneLayout.A06;
                    if (f == 1.0f) {
                        slidingPaneLayout.A02(view);
                        Iterator it = slidingPaneLayout.A0M.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw new NullPointerException("onPanelClosed");
                        }
                        slidingPaneLayout.sendAccessibilityEvent(32);
                        z = false;
                    } else {
                        Iterator it2 = slidingPaneLayout.A0M.iterator();
                        if (it2.hasNext()) {
                            it2.next();
                            throw new NullPointerException("onPanelOpened");
                        }
                        slidingPaneLayout.sendAccessibilityEvent(32);
                        z = true;
                    }
                    slidingPaneLayout.A0B = z;
                }
            }
            if (this.A03 == 0) {
                this.A08 = null;
            }
        }
    }

    public final boolean A0H() {
        if (this.A03 == 2) {
            OverScroller overScroller = this.A0I;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.A08.getLeft();
            int top = currY - this.A08.getTop();
            if (left != 0) {
                this.A08.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.A08.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.A0L.A05(this.A08, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                    overScroller.abortAnimation();
                }
            }
            this.A0K.post(this.A0M);
        }
        if (this.A03 != 2) {
            return false;
        }
        return true;
    }

    public final boolean A0I(int i, int i2) {
        if (this.A09) {
            return A0A(this, i, i2, (int) this.A0H.getXVelocity(this.A02), (int) this.A0H.getYVelocity(this.A02));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        if (r16 != r7) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0J(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70198WGk.A0J(android.view.MotionEvent):boolean");
    }

    public final boolean A0K(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        View view2;
        if (view == this.A08 && this.A02 == i) {
            return true;
        }
        if (view != null) {
            VKH vkh = this.A0L;
            if (vkh instanceof C66376UEk) {
                BottomSheetBehavior bottomSheetBehavior = ((C66376UEk) vkh).A00;
                int i2 = bottomSheetBehavior.A0G;
                if (i2 != 1 && !bottomSheetBehavior.A0W) {
                    if ((i2 == 3 && bottomSheetBehavior.A03 == i && (weakReference2 = bottomSheetBehavior.A0L) != null && (view2 = (View) weakReference2.get()) != null && view2.canScrollVertically(-1)) || (weakReference = bottomSheetBehavior.A0M) == null || weakReference.get() != view) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (vkh instanceof C66377UEl) {
                C66377UEl c66377UEl = (C66377UEl) vkh;
                int i3 = c66377UEl.A00;
                if (i3 != -1 && i3 != i) {
                    return false;
                }
                if ((c66377UEl.A02 instanceof BaseTransientBottomBar$Behavior) && !(view instanceof UBZ)) {
                    return false;
                }
            } else if (!C66378UEm.A00((C66378UEm) vkh) || !((C66344UAj) view.getLayoutParams()).A02) {
                return false;
            }
            this.A02 = i;
            A0G(view, i);
            return true;
        }
        return false;
    }

    public C70198WGk(Context context, ViewGroup viewGroup, VKH vkh) {
        if (vkh != null) {
            this.A0K = viewGroup;
            this.A0L = vkh;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int A00 = (int) ((AbstractC65702TsY.A00(context) * 20.0f) + 0.5f);
            this.A0J = A00;
            this.A04 = A00;
            this.A06 = viewConfiguration.getScaledTouchSlop();
            this.A00 = viewConfiguration.getScaledMaximumFlingVelocity();
            this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
            this.A0I = new OverScroller(context, A0N);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private void A05(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (A07(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.A0C[pointerId] = x;
                this.A0D[pointerId] = y;
            }
        }
    }

    private boolean A06(float f, float f2, int i, int i2) {
        int i3;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.A0G[i] & i2) == i2 && (this.A07 & i2) != 0 && (this.A0F[i] & i2) != i2 && (i3 = this.A0E[i] & i2) != i2) {
            float f3 = this.A06;
            if ((abs > f3 || abs2 > f3) && i3 == 0 && abs > f3) {
                return true;
            }
        }
        return false;
    }

    public final void A0C() {
        A0D();
        if (this.A03 == 2) {
            OverScroller overScroller = this.A0I;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            this.A0L.A05(this.A08, overScroller.getCurrX(), overScroller.getCurrY());
        }
        A0E(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        if (r9.A02 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        A01();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70198WGk.A0F(android.view.MotionEvent):void");
    }

    public final void A0G(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0K;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i;
            VKH vkh = this.A0L;
            if (vkh instanceof C66377UEl) {
                C66377UEl c66377UEl = (C66377UEl) vkh;
                c66377UEl.A00 = i;
                c66377UEl.A01 = view.getLeft();
                ViewParent parent2 = view.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
            } else if (vkh instanceof C66378UEm) {
                SlidingPaneLayout slidingPaneLayout = ((C66378UEm) vkh).A00;
                int childCount = slidingPaneLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = slidingPaneLayout.getChildAt(i2);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
            }
            A0E(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(viewGroup);
        throw AbstractC58320PtC.A0m(")", sb);
    }
}
