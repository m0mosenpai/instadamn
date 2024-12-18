package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.5nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C126555nq extends C2WS {
    public InterfaceC73588YMk A00;
    public boolean A01;
    public boolean A02;
    public int[] A03;
    public C3h4[] A04;
    public C3h4[] A05;
    public Drawable A06;
    public SparseArray A07;
    public Object A08;
    public final C1342864v A09;

    public C126555nq(Context context) {
        super(context, null);
        setClipChildren(true);
        this.A09 = new C1342864v(this);
        this.A04 = new C3h4[8];
        this.A03 = new int[0];
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
    }

    public static /* synthetic */ void getDescriptionOfMountedItems$annotations() {
    }

    @Override // X.C2WS
    public final void A0K() {
        this.A01 = true;
    }

    @Override // X.C2WS
    public final void A0L() {
        this.A01 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        if (r2 > (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r3[r2] == null) goto L25;
     */
    @Override // X.C2WS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(X.C3h4 r10) {
        /*
            r9 = this;
            r5 = 0
            X.3h4[] r4 = r9.A04
            r2 = -1
            if (r4 == 0) goto L13
            r3 = 0
            int r1 = r4.length
        L8:
            if (r3 >= r1) goto L13
            r0 = r4[r3]
            boolean r0 = X.C14360o3.A0K(r0, r10)
            if (r0 == 0) goto L92
            r2 = r3
        L13:
            r4 = -1
            if (r2 > r4) goto L28
            X.3h4[] r3 = r9.A05
            if (r3 == 0) goto L9b
            r2 = 0
            int r1 = r3.length
        L1c:
            if (r2 >= r1) goto L9b
            r0 = r3[r2]
            boolean r0 = X.C14360o3.A0K(r0, r10)
            if (r0 == 0) goto L8f
            if (r2 <= r4) goto L9b
        L28:
            r4 = 1
            com.facebook.rendercore.RenderTreeNode r0 = r10.A01
            X.2WC r0 = r0.A06
            java.lang.Integer r3 = r0.A04
            java.lang.Integer r0 = X.C05F.A00
            java.lang.Object r1 = r10.A04
            if (r3 != r0) goto L6f
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.drawable.Drawable"
            X.C14360o3.A0C(r1, r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 0
            r1.setCallback(r0)
            android.graphics.Rect r0 = r1.getBounds()
            r9.invalidate(r0)
        L47:
            X.3h4[] r5 = r9.A04
            X.3h4[] r3 = r9.A05
            X.C14360o3.A0B(r5, r4)
            if (r3 == 0) goto L55
            r1 = r3[r2]
            r0 = 1
            if (r1 != 0) goto L56
        L55:
            r0 = 0
        L56:
            r4 = 0
            if (r0 == 0) goto L6c
            if (r3 == 0) goto L5d
            r3[r2] = r4
        L5d:
            X.3h4[] r3 = r9.A05
            if (r3 == 0) goto L96
            int r2 = r3.length
            r1 = 0
        L63:
            if (r1 >= r2) goto L96
            r0 = r3[r1]
            if (r0 != 0) goto L98
            int r1 = r1 + 1
            goto L63
        L6c:
            r5[r2] = r4
            goto L5d
        L6f:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.View"
            X.C14360o3.A0C(r1, r0)
            android.view.View r1 = (android.view.View) r1
            r9.A02 = r4
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L81
            r1.setPressed(r5)
        L81:
            boolean r0 = r9.A01
            if (r0 == 0) goto L8b
            super.removeViewInLayout(r1)
        L88:
            r9.A02 = r4
            goto L47
        L8b:
            super.removeView(r1)
            goto L88
        L8f:
            int r2 = r2 + 1
            goto L1c
        L92:
            int r3 = r3 + 1
            goto L8
        L96:
            r9.A05 = r4
        L98:
            r10.A00 = r4
            return
        L9b:
            java.lang.String r2 = "\n              Mount item was not found in the list of mounted items.\n              Item to remove: "
            com.facebook.rendercore.RenderTreeNode r1 = r10.A01
            r0 = 0
            java.lang.String r3 = r1.A00(r0)
            java.lang.String r4 = "\n              Mounted items: "
            X.3h4[] r0 = r9.A04
            java.lang.String r5 = A00(r0)
            java.lang.String r6 = "\n              Scraped items: "
            X.3h4[] r0 = r9.A05
            java.lang.String r7 = A00(r0)
            java.lang.String r8 = "\n              "
            java.lang.String r0 = X.AnonymousClass001.A15(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = X.AbstractC16490ru.A0p(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126555nq.A0M(X.3h4):void");
    }

    @Override // X.C2WS
    public final void A0N(C3h4 c3h4, int i) {
        Integer num = c3h4.A01.A06.A04;
        Integer num2 = C05F.A00;
        Object obj = c3h4.A04;
        if (num == num2) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            Drawable drawable = (Drawable) obj;
            C14360o3.A0B(drawable, 1);
            boolean z = false;
            if (getVisibility() == 0) {
                z = true;
            }
            drawable.setVisible(z, false);
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            invalidate(c3h4.A01.A03);
        } else {
            C14360o3.A0C(obj, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj;
            this.A02 = true;
            if ((view instanceof C126555nq) && view.getParent() == this) {
                view.dispatchFinishTemporaryDetach();
                view.setVisibility(0);
            } else {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.A01) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            }
        }
        C3h4[] c3h4Arr = this.A04;
        int length = c3h4Arr.length;
        if (i >= length) {
            int i2 = length;
            do {
                i2 *= 2;
            } while (i >= i2);
            C3h4[] c3h4Arr2 = new C3h4[i2];
            System.arraycopy(c3h4Arr, 0, c3h4Arr2, 0, length);
            this.A04 = c3h4Arr2;
            c3h4Arr = c3h4Arr2;
        }
        c3h4Arr[i] = c3h4;
        c3h4.A00 = this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C1342864v c1342864v = this.A09;
        c1342864v.A02 = canvas;
        c1342864v.A00 = 0;
        c1342864v.A01 = c1342864v.A03.A04.length;
        super.dispatchDraw(canvas);
        if (c1342864v.A02 != null && c1342864v.A00 < c1342864v.A01) {
            c1342864v.A00();
        }
        c1342864v.A02 = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C6V0 c6v0;
        C14360o3.A0B(motionEvent, 0);
        InterfaceC73588YMk interfaceC73588YMk = this.A00;
        if (interfaceC73588YMk != null && (c6v0 = ((YC7) interfaceC73588YMk).A00.A00) != null && c6v0.A07) {
            boolean z = true;
            if (motionEvent.getAction() == 0) {
                c6v0.A00 = motionEvent.getX();
                c6v0.A01 = motionEvent.getY();
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    c6v0.A02 = true;
                }
            }
            if (motionEvent.getAction() != 2 || (Math.abs(motionEvent.getX() - c6v0.A00) <= 10.0f && Math.abs(motionEvent.getY() - c6v0.A01) <= 10.0f)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = true;
        A0P(z, i, i2, i3, i4);
        this.A01 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof C126555nq) {
            C126555nq c126555nq = (C126555nq) viewParent;
            if (!c126555nq.A01) {
                viewParent = c126555nq.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public final void setViewTags(SparseArray sparseArray) {
        C14360o3.A0B(sparseArray, 0);
        this.A07 = sparseArray;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public static final String A00(C3h4[] c3h4Arr) {
        if (c3h4Arr == null) {
            return "<null>";
        }
        StringBuilder sb = new StringBuilder();
        int length = c3h4Arr.length;
        for (int i = 0; i < length; i++) {
            C3h4 c3h4 = c3h4Arr[i];
            sb.append("Item at index: ");
            if (c3h4 != null) {
                sb.append(i);
                sb.append(" Type: ");
                sb.append(c3h4.A01.A06.A04());
                sb.append(" Position in parent: ");
                sb.append(c3h4.A01.A02);
            } else {
                sb.append(i);
                sb.append(" item is null");
            }
            sb.append("\n");
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    private final void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(drawable2);
            }
            this.A06 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
            invalidate();
        }
    }

    @Override // X.C2WS
    public final C3h4 A0I(int i) {
        C3h4 c3h4 = this.A04[i];
        if (c3h4 != null) {
            return c3h4;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("No MountItem exists at position ", i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7[r10] == null) goto L21;
     */
    @Override // X.C2WS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(X.C3h4 r9, int r10, int r11) {
        /*
            r8 = this;
            java.lang.Object r6 = r9.A04
            r8.invalidate()
            com.facebook.rendercore.RenderTreeNode r0 = r9.A01
            X.2WC r0 = r0.A06
            java.lang.Integer r0 = r0.A04
            java.lang.Integer r5 = X.C05F.A01
            java.lang.String r4 = "null cannot be cast to non-null type android.view.View"
            if (r0 != r5) goto L20
            r0 = 1
            r8.A02 = r0
            X.C14360o3.A0C(r6, r4)
            r0 = r6
            android.view.View r0 = (android.view.View) r0
            r0.cancelPendingInputEvents()
            r0.dispatchStartTemporaryDetach()
        L20:
            X.3h4[] r2 = r8.A04
            int r3 = r2.length
            if (r11 < r3) goto L33
            r0 = r3
        L26:
            int r0 = r0 * 2
            if (r11 >= r0) goto L26
            X.3h4[] r1 = new X.C3h4[r0]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r1, r0, r3)
            r8.A04 = r1
            r2 = r1
        L33:
            r1 = r2[r11]
            if (r1 == 0) goto L42
            X.3h4[] r0 = r8.A05
            if (r0 != 0) goto L40
            int r0 = r2.length
            X.3h4[] r0 = new X.C3h4[r0]
            r8.A05 = r0
        L40:
            r0[r11] = r1
        L42:
            X.3h4[] r7 = r8.A05
            if (r7 == 0) goto L4b
            r1 = r7[r10]
            r0 = 1
            if (r1 != 0) goto L4c
        L4b:
            r0 = 0
        L4c:
            r3 = 0
            if (r0 == 0) goto L66
            if (r7 == 0) goto L64
            r0 = r7[r10]
            r7[r10] = r3
        L55:
            r2[r11] = r0
            if (r7 == 0) goto L6b
            int r2 = r7.length
            r1 = 0
        L5b:
            if (r1 >= r2) goto L6b
            r0 = r7[r1]
            if (r0 != 0) goto L6d
            int r1 = r1 + 1
            goto L5b
        L64:
            r0 = r3
            goto L55
        L66:
            r0 = r2[r10]
            r2[r10] = r3
            goto L55
        L6b:
            r8.A05 = r3
        L6d:
            com.facebook.rendercore.RenderTreeNode r0 = r9.A01
            X.2WC r0 = r0.A06
            java.lang.Integer r0 = r0.A04
            if (r0 != r5) goto L7d
            X.C14360o3.A0C(r6, r4)
            android.view.View r6 = (android.view.View) r6
            r6.dispatchFinishTemporaryDetach()
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126555nq.A0O(X.3h4, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.5np] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.5nq] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.5ws] */
    public void A0P(boolean z, int i, int i2, int i3, int i4) {
        ?? r3;
        if (this instanceof C131565ws) {
            r3 = (C131565ws) this;
            C79243gV c79243gV = r3.A00;
            if (c79243gV != null) {
                C51092Wf mountState = r3.getMountState();
                mountState.A0F(c79243gV);
                int i5 = 0;
                while (true) {
                    C79243gV c79243gV2 = r3.A00;
                    if (c79243gV == c79243gV2) {
                        break;
                    }
                    if (i5 > 4) {
                        C50662Um.A03("RenderTreeHostView", "More than 4 recursive mount attempts. Skipping mounting the latest version.");
                        return;
                    } else {
                        mountState.A0F(c79243gV2);
                        i5++;
                        c79243gV = c79243gV2;
                    }
                }
            }
        } else {
            if (!(this instanceof C126545np)) {
                return;
            }
            r3 = (C126545np) this;
            C65743TtI rootHostDelegate = r3.getRootHostDelegate();
            C6TH c6th = rootHostDelegate.A00;
            int i6 = 0;
            if (rootHostDelegate.A02 && c6th != null) {
                int i7 = i3 - i;
                int i8 = i4 - i2;
                c6th.A04(C78443fA.A00.A00(i7, i7, i8, i8), null);
                rootHostDelegate.A02 = false;
            }
            C79243gV c79243gV3 = rootHostDelegate.A01;
            if (c79243gV3 != null) {
                C51092Wf A00 = rootHostDelegate.A00();
                A00.A0F(c79243gV3);
                while (true) {
                    if (C14360o3.A0K(c79243gV3, rootHostDelegate.A01)) {
                        break;
                    }
                    if (i6 > 4) {
                        C50662Um.A03("RootHostDelegate", "More than 4 recursive mount attempts. Skipping mounting the latest version.");
                        break;
                    } else {
                        c79243gV3 = rootHostDelegate.A01;
                        A00.A0F(c79243gV3);
                        i6++;
                    }
                }
            }
        }
        AbstractC131835xJ.A00(r3);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.A02) {
            int childCount = getChildCount();
            if (this.A03.length < childCount) {
                this.A03 = new int[childCount + 5];
            }
            int length = this.A04.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                C3h4 c3h4 = this.A04[i4];
                if (c3h4 != null && c3h4.A01.A06.A04 == C05F.A01) {
                    Object obj = c3h4.A04;
                    C14360o3.A0C(obj, "null cannot be cast to non-null type android.view.View");
                    this.A03[i3] = indexOfChild((View) obj);
                    i3++;
                }
            }
            this.A02 = false;
        }
        C1342864v c1342864v = this.A09;
        if (c1342864v.A02 != null && c1342864v.A00 < c1342864v.A01) {
            c1342864v.A00();
        }
        return this.A03[i2];
    }

    @Override // X.C2WS
    public String getDescriptionOfMountedItems() {
        String A0u = AnonymousClass001.A0u("\nMounted Items", A00(this.A04), "\nScraped Items: ", A00(this.A05));
        C14360o3.A07(A0u);
        return A0u;
    }

    @Override // X.C2WS
    public int getMountItemCount() {
        int i = 0;
        for (C3h4 c3h4 : this.A04) {
            if (c3h4 != null) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.View
    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A07;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(558765593);
        C14360o3.A0B(canvas, 0);
        super.draw(canvas);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        C0f9.A0A(691222143, A03);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        for (C3h4 c3h4 : this.A04) {
            if (c3h4 != null && c3h4.A01.A06.A04 == C05F.A00) {
                Object obj = c3h4.A04;
                C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                Drawable drawable = (Drawable) obj;
                C14360o3.A0B(drawable, 1);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
        }
        Drawable drawable2 = this.A06;
        if (drawable2 != null) {
            drawable2.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        for (C3h4 c3h4 : this.A04) {
            if (c3h4 != null && c3h4.A01.A06.A04 == C05F.A00) {
                Object obj = c3h4.A04;
                C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                ((Drawable) obj).jumpToCurrentState();
            }
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1070875406);
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
        C0f9.A0D(-747375264, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3h4[] c3h4Arr;
        int A05 = C0f9.A05(24382110);
        C14360o3.A0B(motionEvent, 0);
        if (isEnabled() && (c3h4Arr = this.A04) != null) {
            for (int length = c3h4Arr.length - 1; -1 < length; length--) {
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(763570443, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        for (C3h4 c3h4 : this.A04) {
            if (c3h4 != null && c3h4.A01.A06.A04 == C05F.A00) {
                Object obj = c3h4.A04;
                C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                Drawable drawable = (Drawable) obj;
                boolean z = false;
                if (i == 0) {
                    z = true;
                }
                drawable.setVisible(z, false);
            }
        }
    }

    public final void setForegroundCompat(Drawable drawable) {
        setForeground(drawable);
    }

    public final void setInterceptTouchEventHandler(InterfaceC73588YMk interfaceC73588YMk) {
        this.A00 = interfaceC73588YMk;
    }

    public final void setViewTag(Object obj) {
        this.A08 = obj;
    }

    @Override // android.view.View
    public Object getTag() {
        Object obj = this.A08;
        if (obj == null) {
            return super.getTag();
        }
        return obj;
    }
}
