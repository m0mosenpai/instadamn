package com.facebook.common.draggableview;

import X.AbstractC010103p;
import X.AbstractC09800fd;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.AbstractC31177DnL;
import X.AbstractC50522MSa;
import X.AbstractC50524MSc;
import X.AbstractC66022TyK;
import X.AbstractC66024TyM;
import X.B4Z;
import X.C0f9;
import X.C14360o3;
import X.C51473MoK;
import X.C51978MyM;
import X.C55952hg;
import X.C55982hj;
import X.C66023TyL;
import X.EnumC53159NfE;
import X.InterfaceC16600sD;
import X.JQ0;
import X.RunnableC56846PKq;
import X.UK7;
import X.UQ7;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public class DraggableViewContainer extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public View A09;
    public EnumC53159NfE A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public Rect A0F;
    public ViewGroup.LayoutParams A0G;
    public EnumC53159NfE A0H;
    public InterfaceC16600sD A0I;
    public boolean A0J;
    public final C55982hj A0K;
    public final C55982hj A0L;
    public final List A0M;
    public final GestureDetector A0N;
    public final C51978MyM A0O;
    public final C55952hg A0P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C55952hg A01 = C55952hg.A01(Choreographer.getInstance());
        this.A0P = A01;
        C55982hj A02 = A01.A02();
        C14360o3.A0A(A02);
        A02.A02 = 0.3d;
        A02.A00 = 0.3d;
        this.A0K = A02;
        C55982hj A022 = A01.A02();
        C14360o3.A0A(A022);
        A022.A02 = 0.3d;
        A022.A00 = 0.3d;
        this.A0L = A022;
        this.A0O = new C51978MyM(this, 0);
        this.A0A = EnumC53159NfE.A06;
        this.A0N = new GestureDetector(context, new C51473MoK(this));
        this.A0M = AbstractC166987dD.A1E();
    }

    private final void A02() {
        this.A0B = false;
        C55982hj c55982hj = this.A0K;
        c55982hj.A08(c55982hj.A01, true);
        C55982hj c55982hj2 = this.A0L;
        c55982hj2.A08(c55982hj2.A01, true);
        AbstractC66022TyK.A00.remove(this);
        AbstractCollection abstractCollection = (AbstractCollection) AbstractC66022TyK.A00().get(this);
        if (abstractCollection != null && !abstractCollection.isEmpty()) {
            ArrayList A1F = AbstractC166987dD.A1F(abstractCollection);
            int size = A1F.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AbstractC66024TyM) A1F.get(size)).A0Q(this);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r1 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(android.view.View r13, X.EnumC53159NfE r14, X.UQ7 r15, int r16, int r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
            r12 = this;
            r6 = r15
            r11 = 0
            X.C14360o3.A0B(r13, r11)
            java.lang.String r1 = "DraggableViewContainer.update"
            r0 = 1082865386(0x408b36ea, float:4.3504534)
            X.AbstractC09800fd.A01(r1, r0)
            int r0 = r12.A05     // Catch: java.lang.Throwable -> La8
            r2 = 1
            r4 = r19
            r3 = r20
            r1 = r21
            r5 = r18
            if (r5 != r0) goto L28
            int r0 = r12.A08     // Catch: java.lang.Throwable -> La8
            if (r4 != r0) goto L28
            int r0 = r12.A07     // Catch: java.lang.Throwable -> La8
            if (r3 != r0) goto L28
            int r0 = r12.A00     // Catch: java.lang.Throwable -> La8
            if (r1 != r0) goto L28
            r1 = 0
            goto L31
        L28:
            r12.A05 = r5     // Catch: java.lang.Throwable -> La8
            r12.A08 = r4     // Catch: java.lang.Throwable -> La8
            r12.A07 = r3     // Catch: java.lang.Throwable -> La8
            r12.A00 = r1     // Catch: java.lang.Throwable -> La8
            r1 = 1
        L31:
            X.NfE r0 = r12.A0H     // Catch: java.lang.Throwable -> La8
            if (r14 == r0) goto L3c
            if (r14 == 0) goto L39
            r12.A0A = r14     // Catch: java.lang.Throwable -> La8
        L39:
            r12.A0H = r14     // Catch: java.lang.Throwable -> La8
            r1 = 1
        L3c:
            int r0 = r12.A02     // Catch: java.lang.Throwable -> La8
            r3 = r17
            r4 = r16
            if (r4 != r0) goto L48
            int r0 = r12.A01     // Catch: java.lang.Throwable -> La8
            if (r3 == r0) goto L4d
        L48:
            r12.A02 = r4     // Catch: java.lang.Throwable -> La8
            r12.A01 = r3     // Catch: java.lang.Throwable -> La8
            r1 = 1
        L4d:
            android.view.View r0 = r12.A09     // Catch: java.lang.Throwable -> La8
            if (r0 != r13) goto L52
            goto L67
        L52:
            if (r0 == 0) goto L57
            r12.removeView(r0)     // Catch: java.lang.Throwable -> La8
        L57:
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()     // Catch: java.lang.Throwable -> La8
            r12.A0G = r0     // Catch: java.lang.Throwable -> La8
            r12.A09 = r13     // Catch: java.lang.Throwable -> La8
            android.widget.FrameLayout$LayoutParams r0 = r12.generateDefaultLayoutParams()     // Catch: java.lang.Throwable -> La8
            r12.addView(r13, r0)     // Catch: java.lang.Throwable -> La8
            goto L69
        L67:
            if (r1 == 0) goto La1
        L69:
            if (r22 == 0) goto L9e
            if (r15 != 0) goto L90
            float r0 = r13.getTranslationX()     // Catch: java.lang.Throwable -> La8
            int r1 = (int) r0     // Catch: java.lang.Throwable -> La8
            float r0 = r13.getTranslationY()     // Catch: java.lang.Throwable -> La8
            int r0 = (int) r0     // Catch: java.lang.Throwable -> La8
            int r7 = r13.getLeft()     // Catch: java.lang.Throwable -> La8
            int r7 = r7 + r1
            int r8 = r13.getTop()     // Catch: java.lang.Throwable -> La8
            int r8 = r8 + r0
            int r9 = r13.getRight()     // Catch: java.lang.Throwable -> La8
            int r9 = r9 + r1
            int r10 = r13.getBottom()     // Catch: java.lang.Throwable -> La8
            int r10 = r10 + r0
            X.UQ7 r6 = new X.UQ7     // Catch: java.lang.Throwable -> La8
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La8
        L90:
            r12.A0B = r2     // Catch: java.lang.Throwable -> La8
            r12.A08(r6, r11)     // Catch: java.lang.Throwable -> La8
            X.PKr r0 = new X.PKr     // Catch: java.lang.Throwable -> La8
            r0.<init>(r12)     // Catch: java.lang.Throwable -> La8
            r12.post(r0)     // Catch: java.lang.Throwable -> La8
            goto La1
        L9e:
            A07(r12, r11)     // Catch: java.lang.Throwable -> La8
        La1:
            r0 = 1844933909(0x6df77515, float:9.5730426E27)
            X.AbstractC09800fd.A00(r0)
            return
        La8:
            r1 = move-exception
            r0 = 518850426(0x1eed077a, float:2.5096443E-20)
            X.AbstractC09800fd.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.draggableview.DraggableViewContainer.A0A(android.view.View, X.NfE, X.UQ7, int, int, int, int, int, int, boolean):void");
    }

    private final void A03() {
        this.A0K.A08(0.0d, true);
        this.A0L.A08(0.0d, true);
        View view = this.A09;
        if (view != null) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    private final void A05(EnumC53159NfE enumC53159NfE, boolean z, boolean z2) {
        AbstractC09800fd.A01("DraggableViewContainer.setCorner", -711763862);
        try {
            if (this.A0A != enumC53159NfE) {
                this.A0A = enumC53159NfE;
                if (z) {
                    A07(this, z2);
                }
            }
            AbstractC09800fd.A00(-1287657697);
        } catch (Throwable th) {
            AbstractC09800fd.A00(285698293);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r4 == X.EnumC53159NfE.A03) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(com.facebook.common.draggableview.DraggableViewContainer r8, java.lang.Double r9, java.lang.Double r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.draggableview.DraggableViewContainer.A06(com.facebook.common.draggableview.DraggableViewContainer, java.lang.Double, java.lang.Double, int, int):void");
    }

    public static final void A07(DraggableViewContainer draggableViewContainer, boolean z) {
        if (!draggableViewContainer.A0B) {
            draggableViewContainer.A08(draggableViewContainer.getCurrentFrame(), z);
        }
    }

    private final void A08(UQ7 uq7, boolean z) {
        AbstractC09800fd.A01("DraggableViewContainer.moveToFrame", 655361040);
        try {
            View view = this.A09;
            if (view != null) {
                A03();
                if (z) {
                    AbstractC09800fd.A01("DraggableViewContainer.beginDelayedTransition", 1670718631);
                    try {
                        C66023TyL c66023TyL = new C66023TyL();
                        c66023TyL.A0L(200L);
                        c66023TyL.A0A(new UK7(this, 1));
                        AbstractC66022TyK.A02(this, c66023TyL);
                        AbstractC09800fd.A00(-498801123);
                    } catch (Throwable th) {
                        AbstractC09800fd.A00(107486168);
                        throw th;
                    }
                }
                ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(view);
                A0G.leftMargin = uq7.A01;
                A0G.topMargin = uq7.A03;
                int width = getWidth();
                int i = uq7.A02;
                A0G.rightMargin = width - i;
                A0G.bottomMargin = getHeight() - i;
                ((ViewGroup.LayoutParams) A0G).width = uq7.A02 - uq7.A01;
                ((ViewGroup.LayoutParams) A0G).height = uq7.A00 - uq7.A03;
                view.setLayoutParams(A0G);
            }
            AbstractC09800fd.A00(1161051742);
        } catch (Throwable th2) {
            AbstractC09800fd.A00(1911307671);
            throw th2;
        }
    }

    public static final boolean A09(View view, DraggableViewContainer draggableViewContainer, boolean z) {
        float A07;
        if (!draggableViewContainer.A0C) {
            return false;
        }
        float A072 = AbstractC166987dD.A07(view) * 0.1f;
        float x = view.getX();
        if (z) {
            A07 = -x;
        } else {
            A07 = (x + AbstractC166987dD.A07(view)) - AbstractC166987dD.A07(draggableViewContainer);
        }
        if (A07 <= A072) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UQ7 getCenterBounds() {
        return new UQ7((this.A02 / 2) + this.A05, (this.A01 / 2) + this.A08, (getWidth() - this.A07) - (this.A02 / 2), (getHeight() - this.A00) - (this.A01 / 2), 0);
    }

    public static /* synthetic */ void setCorner$default(DraggableViewContainer draggableViewContainer, EnumC53159NfE enumC53159NfE, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            draggableViewContainer.A05(enumC53159NfE, z, z2);
            return;
        }
        throw AbstractC166987dD.A1D("Super calls with default arguments not supported in this target, function: setCorner");
    }

    private final void setGestureExclusionRect(Rect rect) {
        View view;
        if (!C14360o3.A0K(this.A0F, rect)) {
            this.A0F = rect;
            if (this.A0C && (view = this.A09) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view = this.A09;
        if (view == null || motionEvent == null || this.A06 != 0) {
            return false;
        }
        float x = motionEvent.getX() - view.getTranslationX();
        float y = motionEvent.getY() - view.getTranslationY();
        if (!this.A0J && (view.getLeft() > x || x > view.getRight() || view.getTop() > y || y > view.getBottom())) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC16600sD getContainerSizeChangedListener() {
        return this.A0I;
    }

    public final EnumC53159NfE getCorner() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0E) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        int i;
        AbstractC09800fd.A01("DraggableViewContainer.removeView", -1602354141);
        if (view != null) {
            try {
                View view2 = this.A09;
                if (view2 != null && view2 == view) {
                    A02();
                    ViewGroup.LayoutParams layoutParams = this.A0G;
                    if (layoutParams != null) {
                        view.setLayoutParams(layoutParams);
                    }
                    this.A0G = null;
                    A03();
                    super.removeView(this.A09);
                    this.A09 = null;
                    i = 648716430;
                    AbstractC09800fd.A00(i);
                }
            } catch (Throwable th) {
                AbstractC09800fd.A00(-1240913838);
                throw th;
            }
        }
        i = 497492323;
        AbstractC09800fd.A00(i);
    }

    public static final int A00(View view, DraggableViewContainer draggableViewContainer, boolean z) {
        float A07;
        float width = (view.getWidth() / 2) - (AbstractC166987dD.A07(view) * 0.2f);
        if (z) {
            A07 = -width;
        } else {
            A07 = AbstractC166987dD.A07(draggableViewContainer) + width;
        }
        return (int) A07;
    }

    public static final void A04(View view, DraggableViewContainer draggableViewContainer, Boolean bool) {
        boolean A09;
        UQ7 centerBounds = draggableViewContainer.getCenterBounds();
        int A01 = AbstractC50524MSc.A01(view);
        int i = centerBounds.A01;
        int A05 = AbstractC50522MSa.A05(A01, i, centerBounds.A02, i);
        int A02 = AbstractC50524MSc.A02(view);
        int i2 = centerBounds.A03;
        int A052 = AbstractC50522MSa.A05(A02, i2, centerBounds.A00, i2);
        boolean A1P = AbstractC167007dF.A1P(A05, i);
        if (bool != null) {
            A09 = bool.booleanValue();
        } else {
            A09 = A09(view, draggableViewContainer, A1P);
        }
        if (A09) {
            A05 = A00(view, draggableViewContainer, A1P);
        }
        A06(draggableViewContainer, null, null, A05, A052);
    }

    private final UQ7 getCurrentFrame() {
        int i;
        int i2;
        Point point;
        UQ7 centerBounds = getCenterBounds();
        int ordinal = this.A0A.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 0) {
                            point = new Point(0, 0);
                            int i3 = point.x;
                            int i4 = this.A02 / 2;
                            int i5 = point.y;
                            int i6 = this.A01 / 2;
                            return new UQ7(i3 - i4, i5 - i6, i3 + i4, i5 + i6, 0);
                        }
                        throw B4Z.A00();
                    }
                    i = centerBounds.A02;
                } else {
                    i = centerBounds.A01;
                }
                i2 = centerBounds.A00;
                point = new Point(i, i2);
                int i32 = point.x;
                int i42 = this.A02 / 2;
                int i52 = point.y;
                int i62 = this.A01 / 2;
                return new UQ7(i32 - i42, i52 - i62, i32 + i42, i52 + i62, 0);
            }
            i = centerBounds.A02;
        } else {
            i = centerBounds.A01;
        }
        i2 = centerBounds.A03;
        point = new Point(i, i2);
        int i322 = point.x;
        int i422 = this.A02 / 2;
        int i522 = point.y;
        int i622 = this.A01 / 2;
        return new UQ7(i322 - i422, i522 - i622, i322 + i422, i522 + i622, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(652006985);
        super.onAttachedToWindow();
        C55982hj c55982hj = this.A0K;
        C51978MyM c51978MyM = this.A0O;
        c55982hj.A0A(c51978MyM);
        this.A0L.A0A(c51978MyM);
        C0f9.A0D(1926936154, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-600353369);
        A02();
        C55982hj c55982hj = this.A0K;
        C51978MyM c51978MyM = this.A0O;
        c55982hj.A0B(c51978MyM);
        this.A0L.A0B(c51978MyM);
        super.onDetachedFromWindow();
        C0f9.A0D(-265175903, A06);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0C) {
            AbstractC010103p.A0H(this, AbstractC16960so.A1O(this.A0F));
        }
        if (this.A06 > 0) {
            A03();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1577179644);
        super.onSizeChanged(i, i2, i3, i4);
        A02();
        post(new RunnableC56846PKq(this));
        InterfaceC16600sD interfaceC16600sD = this.A0I;
        if (interfaceC16600sD != null) {
            interfaceC16600sD.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        C0f9.A0D(-1056570532, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C0f9.A05(-888600730);
        boolean z = false;
        if (motionEvent != null && !this.A0D) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    requestDisallowInterceptTouchEvent(false);
                    this.A0J = false;
                    Iterator it = this.A0M.iterator();
                    while (it.hasNext()) {
                        it.next();
                        motionEvent.getX();
                        motionEvent.getY();
                    }
                }
            } else {
                requestDisallowInterceptTouchEvent(true);
                this.A0J = true;
                Iterator it2 = this.A0M.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    motionEvent.getX();
                    motionEvent.getY();
                }
            }
            z = this.A0N.onTouchEvent(motionEvent);
            View view = this.A09;
            if (view != null && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !z)) {
                A04(view, this, null);
            }
            i = -1022691056;
        } else {
            i = -98724687;
        }
        C0f9.A0C(i, A05);
        return z;
    }

    public final void setContainerSizeChangedListener(InterfaceC16600sD interfaceC16600sD) {
        this.A0I = interfaceC16600sD;
    }

    public final void setDockingEnabled(boolean z) {
        this.A0C = z;
    }

    public final void setShouldDisableDragging(boolean z) {
        this.A0D = z;
    }

    public final void setShouldInterceptChildTouchEvents(boolean z) {
        this.A0E = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableViewContainer(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ DraggableViewContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
