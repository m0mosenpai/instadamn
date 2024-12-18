package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8SB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SB extends AbstractC70653Fc implements InterfaceC69563Aq {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A08;
    public int A09;
    public long A0A;
    public Rect A0B;
    public VelocityTracker A0C;
    public C008102v A0E;
    public C8S8 A0F;
    public C8SJ A0G;
    public RecyclerView A0I;
    public List A0J;
    public List A0L;
    public float A0M;
    public float A0N;
    public final List A0Q = new ArrayList();
    public final float[] A0R = new float[2];
    public C3OO A0H = null;
    public int A07 = -1;
    public int A06 = 0;
    public List A0K = new ArrayList();
    public final Runnable A0P = new Runnable() { // from class: X.8SC
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        
            if (r4 < 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
        
            if (r4 > 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
        
            if (r7 <= 0) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C8SC.run():void");
        }
    };
    public View A0D = null;
    public final C7LD A0O = new C7LD() { // from class: X.8SD
        @Override // X.C7LD
        public final boolean DMd(MotionEvent motionEvent, RecyclerView recyclerView) {
            int findPointerIndex;
            C8SB c8sb = C8SB.this;
            c8sb.A0E.A00.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                c8sb.A07 = motionEvent.getPointerId(0);
                c8sb.A02 = motionEvent.getX();
                c8sb.A03 = motionEvent.getY();
                VelocityTracker velocityTracker = c8sb.A0C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                c8sb.A0C = VelocityTracker.obtain();
                if (c8sb.A0H == null) {
                    List list = c8sb.A0K;
                    if (!list.isEmpty()) {
                        View A03 = c8sb.A03(motionEvent);
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            AND and = (AND) list.get(size);
                            C3OO c3oo = and.A0C;
                            if (c3oo.itemView == A03) {
                                c8sb.A02 -= and.A01;
                                c8sb.A03 -= and.A02;
                                c8sb.A09(c3oo, true);
                                if (c8sb.A0Q.remove(c3oo.itemView)) {
                                    c8sb.A0F.clearView(c8sb.A0I, c3oo);
                                }
                                c8sb.A08(c3oo, and.A0A);
                                c8sb.A05(motionEvent, c8sb.A08, 0);
                            }
                        }
                    }
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = c8sb.A07;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    c8sb.A04(motionEvent, actionMasked, findPointerIndex);
                }
            } else {
                c8sb.A07 = -1;
                c8sb.A08(null, 0);
            }
            VelocityTracker velocityTracker2 = c8sb.A0C;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (c8sb.A0H != null) {
                return true;
            }
            return false;
        }

        @Override // X.C7LD
        public final void Dfm(boolean z) {
            if (z) {
                C8SB.this.A08(null, 0);
            }
        }

        @Override // X.C7LD
        public final void Du8(MotionEvent motionEvent, RecyclerView recyclerView) {
            C8SB c8sb = C8SB.this;
            c8sb.A0E.A00.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = c8sb.A0C;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (c8sb.A07 != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(c8sb.A07);
                if (findPointerIndex >= 0) {
                    c8sb.A04(motionEvent, actionMasked, findPointerIndex);
                }
                C3OO c3oo = c8sb.A0H;
                if (c3oo != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == c8sb.A07) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        c8sb.A07 = motionEvent.getPointerId(i);
                                        c8sb.A05(motionEvent, c8sb.A08, actionIndex);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VelocityTracker velocityTracker2 = c8sb.A0C;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else {
                            if (findPointerIndex < 0) {
                                return;
                            }
                            c8sb.A05(motionEvent, c8sb.A08, findPointerIndex);
                            c8sb.A06(c3oo);
                            RecyclerView recyclerView2 = c8sb.A0I;
                            Runnable runnable = c8sb.A0P;
                            recyclerView2.removeCallbacks(runnable);
                            runnable.run();
                            c8sb.A0I.invalidate();
                            return;
                        }
                    }
                    c8sb.A08(null, 0);
                    c8sb.A07 = -1;
                }
            }
        }
    };

    @Override // X.InterfaceC69563Aq
    public final void D36(View view) {
    }

    private int A00(C3OO c3oo, int i) {
        if ((i & 12) != 0) {
            int i2 = 8;
            int i3 = 4;
            if (this.A00 > 0.0f) {
                i3 = 8;
            }
            VelocityTracker velocityTracker = this.A0C;
            if (velocityTracker != null && this.A07 > -1) {
                C8S8 c8s8 = this.A0F;
                velocityTracker.computeCurrentVelocity(1000, this.A0M);
                float xVelocity = this.A0C.getXVelocity(this.A07);
                float yVelocity = this.A0C.getYVelocity(this.A07);
                if (xVelocity <= 0.0f) {
                    i2 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2 && abs >= c8s8.getSwipeEscapeVelocity(this.A0N) && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
            float width = this.A0I.getWidth() * this.A0F.getSwipeThreshold(c3oo);
            if ((i & i3) != 0 && Math.abs(this.A00) > width) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    private int A01(C3OO c3oo, int i) {
        if ((i & 3) != 0) {
            int i2 = 2;
            int i3 = 1;
            if (this.A01 > 0.0f) {
                i3 = 2;
            }
            VelocityTracker velocityTracker = this.A0C;
            if (velocityTracker != null && this.A07 > -1) {
                C8S8 c8s8 = this.A0F;
                velocityTracker.computeCurrentVelocity(1000, this.A0M);
                float xVelocity = this.A0C.getXVelocity(this.A07);
                float yVelocity = this.A0C.getYVelocity(this.A07);
                if (yVelocity <= 0.0f) {
                    i2 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3 && abs >= c8s8.getSwipeEscapeVelocity(this.A0N) && abs > Math.abs(xVelocity)) {
                    return i2;
                }
            }
            float height = this.A0I.getHeight() * this.A0F.getSwipeThreshold(c3oo);
            if ((i & i3) != 0 && Math.abs(this.A01) > height) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    private void A02(float[] fArr) {
        float translationX;
        float translationY;
        if ((this.A08 & 12) != 0) {
            translationX = (this.A04 + this.A00) - this.A0H.itemView.getLeft();
        } else {
            translationX = this.A0H.itemView.getTranslationX();
        }
        fArr[0] = translationX;
        if ((this.A08 & 3) != 0) {
            translationY = (this.A05 + this.A01) - this.A0H.itemView.getTop();
        } else {
            translationY = this.A0H.itemView.getTranslationY();
        }
        fArr[1] = translationY;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.view.MotionEvent r10, int r11, int r12) {
        /*
            r9 = this;
            X.3OO r0 = r9.A0H
            if (r0 != 0) goto L48
            r1 = 2
            if (r11 != r1) goto L48
            int r0 = r9.A06
            if (r0 == r1) goto L48
            X.8S8 r4 = r9.A0F
            boolean r0 = r4.isItemViewSwipeEnabled()
            if (r0 == 0) goto L48
            androidx.recyclerview.widget.RecyclerView r1 = r9.A0I
            int r0 = r1.getScrollState()
            r3 = 1
            if (r0 == r3) goto L48
            X.3Fe r6 = r1.A0D
            int r1 = r9.A07
            r0 = -1
            if (r1 == r0) goto L48
            int r1 = r10.findPointerIndex(r1)
            float r2 = r10.getX(r1)
            float r0 = r9.A02
            float r2 = r2 - r0
            float r1 = r10.getY(r1)
            float r0 = r9.A03
            float r1 = r1 - r0
            float r5 = java.lang.Math.abs(r2)
            float r2 = java.lang.Math.abs(r1)
            int r0 = r9.A09
            float r1 = (float) r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L49
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L49
        L48:
            return
        L49:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L54
            boolean r0 = r6.A1X()
            if (r0 == 0) goto L54
            return
        L54:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L5f
            boolean r0 = r6.A1Y()
            if (r0 == 0) goto L5f
            return
        L5f:
            android.view.View r1 = r9.A03(r10)
            if (r1 == 0) goto L48
            androidx.recyclerview.widget.RecyclerView r0 = r9.A0I
            X.3OO r2 = r0.A0Y(r1)
            if (r2 == 0) goto L48
            androidx.recyclerview.widget.RecyclerView r0 = r9.A0I
            int r1 = r4.getAbsoluteMovementFlags(r0, r2)
            r0 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r0
            int r8 = r1 >> 8
            if (r8 == 0) goto L48
            float r7 = r10.getX(r12)
            float r6 = r10.getY(r12)
            float r0 = r9.A02
            float r7 = r7 - r0
            float r0 = r9.A03
            float r6 = r6 - r0
            float r5 = java.lang.Math.abs(r7)
            float r4 = java.lang.Math.abs(r6)
            int r0 = r9.A09
            float r1 = (float) r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9d
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9d
            return
        L9d:
            r1 = 0
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lab
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lbb
            r0 = r8 & 4
            if (r0 != 0) goto Lbb
            return
        Lab:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb4
            r0 = r8 & 1
            if (r0 != 0) goto Lb4
            return
        Lb4:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc4
            r0 = r8 & 2
            goto Lc1
        Lbb:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc4
            r0 = r8 & 8
        Lc1:
            if (r0 != 0) goto Lc4
            return
        Lc4:
            r9.A01 = r1
            r9.A00 = r1
            r0 = 0
            int r0 = r10.getPointerId(r0)
            r9.A07 = r0
            r9.A08(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8SB.A04(android.view.MotionEvent, int, int):void");
    }

    public final void A06(C3OO c3oo) {
        if (!this.A0I.isLayoutRequested() && this.A06 == 2) {
            C8S8 c8s8 = this.A0F;
            int i = (int) (this.A04 + this.A00);
            int i2 = (int) (this.A05 + this.A01);
            if (Math.abs(i2 - c3oo.itemView.getTop()) < c3oo.itemView.getHeight() * 0.5f && Math.abs(i - c3oo.itemView.getLeft()) < c3oo.itemView.getWidth() * 0.5f) {
                return;
            }
            List list = this.A0L;
            if (list == null) {
                this.A0L = new ArrayList();
                this.A0J = new ArrayList();
            } else {
                list.clear();
                this.A0J.clear();
            }
            int round = Math.round(this.A04 + this.A00);
            int round2 = Math.round(this.A05 + this.A01);
            int width = c3oo.itemView.getWidth() + round;
            int height = c3oo.itemView.getHeight() + round2;
            int i3 = (round + width) / 2;
            int i4 = (round2 + height) / 2;
            AbstractC70663Fe abstractC70663Fe = this.A0I.A0D;
            int A0T = abstractC70663Fe.A0T();
            for (int i5 = 0; i5 < A0T; i5++) {
                View A0e = abstractC70663Fe.A0e(i5);
                if (A0e != c3oo.itemView && A0e.getBottom() >= round2 && A0e.getTop() <= height && A0e.getRight() >= round && A0e.getLeft() <= width) {
                    C3OO A0Y = this.A0I.A0Y(A0e);
                    if (c8s8.canDropOver(this.A0I, this.A0H, A0Y)) {
                        int abs = Math.abs(i3 - ((A0e.getLeft() + A0e.getRight()) / 2));
                        int abs2 = Math.abs(i4 - ((A0e.getTop() + A0e.getBottom()) / 2));
                        int i6 = (abs * abs) + (abs2 * abs2);
                        int size = this.A0L.size();
                        int i7 = 0;
                        for (int i8 = 0; i8 < size && i6 > ((Number) this.A0J.get(i8)).intValue(); i8++) {
                            i7++;
                        }
                        this.A0L.add(i7, A0Y);
                        this.A0J.add(i7, Integer.valueOf(i6));
                    }
                }
            }
            List list2 = this.A0L;
            if (list2.size() == 0) {
                return;
            }
            C3OO chooseDropTarget = c8s8.chooseDropTarget(c3oo, list2, i, i2);
            if (chooseDropTarget == null) {
                this.A0L.clear();
                this.A0J.clear();
                return;
            }
            int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = c3oo.getAbsoluteAdapterPosition();
            if (!c8s8.onMove(this.A0I, c3oo, chooseDropTarget)) {
                return;
            }
            c8s8.onMoved(this.A0I, c3oo, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i, i2);
        }
    }

    public final void A07(C3OO c3oo) {
        String str;
        if (!this.A0F.hasDragFlag(this.A0I, c3oo)) {
            str = "Start drag has been called but dragging is not enabled";
        } else if (c3oo.itemView.getParent() != this.A0I) {
            str = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.";
        } else {
            VelocityTracker velocityTracker = this.A0C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.A0C = VelocityTracker.obtain();
            this.A01 = 0.0f;
            this.A00 = 0.0f;
            A08(c3oo, 2);
            return;
        }
        android.util.Log.e("ItemTouchHelper", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r7 > 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015b, code lost:
    
        if (r7 > 0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(X.C3OO r23, int r24) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8SB.A08(X.3OO, int):void");
    }

    public final void A09(C3OO c3oo, boolean z) {
        AND and;
        List list = this.A0K;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                and = (AND) list.get(size);
            } else {
                return;
            }
        } while (and.A0C != c3oo);
        and.A04 |= z;
        if (!and.A05) {
            and.A0B.cancel();
        }
        list.remove(size);
    }

    public final void A0A(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A0I;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A11(this);
                this.A0I.A13(this.A0O);
                List list = this.A0I.A0L;
                if (list != null) {
                    list.remove(this);
                }
                List list2 = this.A0K;
                int size = list2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    AND and = (AND) list2.get(0);
                    and.A0B.cancel();
                    this.A0F.clearView(this.A0I, and.A0C);
                }
                list2.clear();
                this.A0D = null;
                VelocityTracker velocityTracker = this.A0C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.A0C = null;
                }
                C8SJ c8sj = this.A0G;
                if (c8sj != null) {
                    c8sj.A00 = false;
                    this.A0G = null;
                }
                if (this.A0E != null) {
                    this.A0E = null;
                }
            }
            this.A0I = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.A0N = resources.getDimension(R.dimen.avatar_sticker_max_height);
                this.A0M = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.A09 = ViewConfiguration.get(this.A0I.getContext()).getScaledTouchSlop();
                this.A0I.A10(this);
                RecyclerView recyclerView3 = this.A0I;
                recyclerView3.A12(this.A0O);
                List list3 = recyclerView3.A0L;
                if (list3 == null) {
                    list3 = new ArrayList();
                    recyclerView3.A0L = list3;
                }
                list3.add(this);
                C8SJ c8sj2 = new C8SJ(this);
                this.A0G = c8sj2;
                this.A0E = new C008102v(this.A0I.getContext(), c8sj2);
            }
        }
    }

    @Override // X.InterfaceC69563Aq
    public final void D37(View view) {
        if (view == this.A0D) {
            this.A0D = null;
        }
        C3OO A0Y = this.A0I.A0Y(view);
        if (A0Y != null) {
            C3OO c3oo = this.A0H;
            if (c3oo != null && A0Y == c3oo) {
                A08(null, 0);
                return;
            }
            A09(A0Y, false);
            if (!this.A0Q.remove(A0Y.itemView)) {
                return;
            }
            this.A0F.clearView(this.A0I, A0Y);
        }
    }

    @Override // X.AbstractC70653Fc
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        float f;
        float f2;
        if (this.A0H != null) {
            float[] fArr = this.A0R;
            A02(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.A0F.onDraw(canvas, recyclerView, this.A0H, this.A0K, this.A06, f, f2);
    }

    @Override // X.AbstractC70653Fc
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        float f;
        float f2;
        if (this.A0H != null) {
            float[] fArr = this.A0R;
            A02(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.A0F.onDrawOver(canvas, recyclerView, this.A0H, this.A0K, this.A06, f, f2);
    }

    public C8SB(C8S8 c8s8) {
        this.A0F = c8s8;
    }

    public final View A03(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C3OO c3oo = this.A0H;
        if (c3oo != null) {
            View view = c3oo.itemView;
            float f = this.A04 + this.A00;
            float f2 = this.A05 + this.A01;
            if (x >= f && x <= f + view.getWidth() && y >= f2 && y <= f2 + view.getHeight()) {
                return view;
            }
        }
        List list = this.A0K;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                AND and = (AND) list.get(size);
                View view2 = and.A0C.itemView;
                float f3 = and.A01;
                float f4 = and.A02;
                if (x >= f3 && x <= f3 + view2.getWidth() && y >= f4 && y <= f4 + view2.getHeight()) {
                    return view2;
                }
            } else {
                return this.A0I.A0T(x, y);
            }
        }
    }

    public final void A05(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.A02;
        this.A00 = f;
        float f2 = y - this.A03;
        this.A01 = f2;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.A00 = f;
        }
        if ((i & 8) == 0) {
            this.A00 = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            f2 = Math.max(0.0f, f2);
            this.A01 = f2;
        }
        if ((i & 2) == 0) {
            this.A01 = Math.min(0.0f, f2);
        }
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        rect.setEmpty();
    }
}
