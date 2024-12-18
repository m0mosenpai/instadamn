package com.facebook.litho;

import X.AbstractC001800i;
import X.AbstractC005201r;
import X.AbstractC009903n;
import X.AbstractC010103p;
import X.AbstractC50682Uo;
import X.AbstractC50692Uq;
import X.AbstractC50792Va;
import X.AbstractC50812Vc;
import X.AbstractC79093gG;
import X.AnonymousClass016;
import X.AnonymousClass412;
import X.C005101q;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C16930sl;
import X.C2V3;
import X.C2V9;
import X.C2WB;
import X.C2WS;
import X.C2WZ;
import X.C2Wq;
import X.C2X2;
import X.C2XS;
import X.C2XV;
import X.C2Y3;
import X.C2YE;
import X.C2YG;
import X.C3h4;
import X.C50952Vr;
import X.C51402Xn;
import X.C51442Xr;
import X.C55685OoA;
import X.C58571Pxp;
import X.C5M7;
import X.C78893fv;
import X.C78993g5;
import X.C79793hU;
import X.C86943uA;
import X.EnumC50702Ur;
import X.InterfaceC51042Wa;
import X.InterfaceC51172Wp;
import X.ViewOnTouchListenerC51412Xo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

/* loaded from: classes.dex */
public class ComponentHost extends C2WS implements C2WZ, InterfaceC51042Wa {
    public static boolean A0Q;
    public float A00;
    public float A01;
    public SparseArray A02;
    public C005101q A03;
    public C005101q A04;
    public C005101q A05;
    public C2Y3 A06;
    public C2YG A07;
    public C2X2 A08;
    public ViewOnTouchListenerC51412Xo A09;
    public C2V9 A0A;
    public C51402Xn A0B;
    public CharSequence A0C;
    public ArrayList A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public int[] A0K;
    public final C005101q A0L;
    public final C005101q A0M;
    public final C005101q A0N;
    public final C78893fv A0O;
    public final Integer A0P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentHost(Context context, AttributeSet attributeSet, Integer num) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        setClipChildren(true);
        this.A0P = num;
        this.A0M = new C005101q(10);
        this.A0N = new C005101q(10);
        this.A0L = new C005101q(10);
        this.A0O = new C78893fv(this);
        this.A0K = new int[0];
        this.A00 = Float.MIN_VALUE;
        this.A01 = Float.MIN_VALUE;
        setWillNotDraw(C2V3.defaultInstance.A0F);
        setChildrenDrawingOrderEnabled(true);
        Object systemService = context.getSystemService("accessibility");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        A0P(C2XS.A00((AccessibilityManager) systemService));
    }

    public static final void A0D(View view, ComponentHost componentHost) {
        componentHost.A0H = true;
        if (componentHost.A0G) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
        view.setDuplicateParentStateEnabled(false);
        if (view instanceof ComponentHost) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.addStatesFromChildren()) {
                viewGroup.setAddStatesFromChildren(false);
            }
        }
    }

    @Override // X.C2WS
    public final void A0K() {
        this.A0G = true;
    }

    @Override // X.C2WS
    public final void A0L() {
        this.A0G = false;
    }

    @Override // X.C2WS
    public final void A0N(C3h4 c3h4, int i) {
        C50952Vr c50952Vr;
        Rect rect = c3h4.A01.A03;
        C14360o3.A0B(rect, 2);
        Object obj = c3h4.A04;
        C2WB A00 = AbstractC79093gG.A00(c3h4.A01);
        if (obj instanceof Drawable) {
            C2XV.A00();
            this.A0L.A07(i, c3h4);
            C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            Drawable drawable = (Drawable) obj;
            AbstractC79093gG.A00(c3h4.A01);
            boolean z = false;
            if (getVisibility() == 0) {
                z = true;
            }
            drawable.setVisible(z, false);
            drawable.setCallback(this);
            invalidate(rect);
        } else if (obj instanceof View) {
            this.A0N.A07(i, c3h4);
            View view = (View) obj;
            int i2 = A00.A00;
            if ((i2 & 1) == 1) {
                view.setDuplicateParentStateEnabled(true);
                this.A0E = true;
            }
            boolean z2 = view instanceof ComponentHost;
            if (z2 && (i2 & 16) == 16) {
                ((ViewGroup) view).setAddStatesFromChildren(true);
            }
            this.A0H = true;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(generateDefaultLayoutParams());
            }
            boolean z3 = this.A0G;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z3) {
                super.addViewInLayout(view, -1, layoutParams, true);
                invalidate();
            } else {
                super.addView(view, -1, layoutParams);
            }
            if (C78993g5.A00(c3h4.A01.A07).A04 != null && !equals(obj)) {
                if (this.A0B == null) {
                    C51402Xn c51402Xn = new C51402Xn(this);
                    this.A0B = c51402Xn;
                    setTouchDelegate(c51402Xn);
                }
                C51402Xn c51402Xn2 = this.A0B;
                if (c51402Xn2 != null) {
                    C14360o3.A0C(obj, "null cannot be cast to non-null type android.view.View");
                    c51402Xn2.A01.A07(i, new C86943uA(view, c3h4));
                }
            }
            if (!z2) {
                Object tag = view.getTag(R.id.component_node_info);
                if (tag instanceof C50952Vr) {
                    c50952Vr = (C50952Vr) tag;
                } else {
                    c50952Vr = null;
                }
                if (this.A0I && c50952Vr != null) {
                    Rect rect2 = C2Y3.A03;
                    AbstractC010103p.A0B(view, new C2Y3(view, c50952Vr, view.getImportantForAccessibility(), view.isFocusable()));
                }
            }
        }
        this.A0M.A07(i, c3h4);
        c3h4.A00 = this;
        A0G(this, A00);
    }

    public void A0Q(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String str;
        String str2;
        Object obj;
        C14360o3.A0B(canvas, 0);
        C78893fv c78893fv = this.A0O;
        c78893fv.A02 = canvas;
        c78893fv.A00 = 0;
        c78893fv.A01 = c78893fv.A03.A0M.A00();
        int i = 0;
        try {
            super.dispatchDraw(canvas);
            if (c78893fv.A02 != null && c78893fv.A00 < c78893fv.A01) {
                c78893fv.A00();
            }
            c78893fv.A02 = null;
            ArrayList arrayList = this.A0D;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i < size) {
                    ArrayList arrayList2 = this.A0D;
                    if (arrayList2 != null) {
                        C3h4 c3h4 = (C3h4) arrayList2.get(i);
                        if (c3h4 != null) {
                            obj = c3h4.A04;
                        } else {
                            obj = null;
                        }
                        if (obj instanceof Drawable) {
                            ((Drawable) obj).draw(canvas);
                        }
                        i++;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        } catch (AnonymousClass412 e) {
            C005101q c005101q = this.A0M;
            int A00 = c005101q.A00();
            StringBuilder sb = new StringBuilder("[");
            while (i < A00) {
                C3h4 c3h42 = (C3h4) AbstractC005201r.A00(c005101q, i);
                if (c3h42 != null) {
                    str = AbstractC79093gG.A00(c3h42.A01).A03.A0H();
                } else {
                    str = "null";
                }
                sb.append(str);
                if (i < A00 - 1) {
                    str2 = ", ";
                } else {
                    str2 = "]";
                }
                sb.append(str2);
                i++;
            }
            String obj2 = sb.toString();
            C14360o3.A07(obj2);
            e.A02.put("component_names_from_mount_items", obj2);
            throw e;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C2Y3 c2y3 = this.A06;
        if ((c2y3 == null || !this.A0F || !c2y3.A0o(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 0);
        C2Y3 c2y3 = this.A06;
        if ((c2y3 == null || !this.A0F || !c2y3.A0n(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2YF, java.lang.Object] */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C2V9 c2v9 = this.A0A;
        if (c2v9 != 0) {
            C2XV.A00();
            ?? obj = new Object();
            obj.A00 = motionEvent;
            obj.A01 = this;
            Object A00 = c2v9.A00(obj);
            if ((A00 instanceof Boolean) && ((Boolean) A00).booleanValue()) {
                return true;
            }
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0G = true;
        A0Q(z, i, i2, i3, i4);
        this.A0G = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) viewParent;
            if (componentHost.A0R()) {
                viewParent = componentHost.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void resetPivot() {
        this.A00 = Float.MIN_VALUE;
        this.A01 = Float.MIN_VALUE;
        super.resetPivot();
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (f != 0.0f && f != 1.0f && (getWidth() >= C2V3.partialAlphaWarningSizeThresold || getHeight() >= C2V3.partialAlphaWarningSizeThresold)) {
            if (!A0Q) {
                A0Q = true;
                Integer num = C05F.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("Partial alpha (");
                sb.append(f);
                sb.append(") with large view (");
                sb.append(getWidth());
                sb.append(", ");
                sb.append(getHeight());
                sb.append(')');
                C2YE.A01("PartialAlphaTextureTooBig", num, sb.toString());
            } else {
                return;
            }
        }
        super.setAlpha(f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    private final void A0C() {
        Integer num;
        if (!this.A0J && (num = this.A0P) != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    throw new RuntimeException("Should not modify component host outside of the Litho View Attributes Extensions. Let us know if your use case is valid");
                }
                return;
            }
            String str = "Litho.DebugInfo";
            EnumC50702Ur enumC50702Ur = EnumC50702Ur.A02;
            long currentTimeMillis = System.currentTimeMillis();
            if (enumC50702Ur.compareTo(AbstractC50692Uq.A00()) >= 0) {
                Set set = AbstractC50692Uq.A00;
                if (!set.isEmpty()) {
                    ?? r0 = 0;
                    for (Object obj : set) {
                        String[] strArr = ((AbstractC50682Uo) obj).A00;
                        if (AbstractC009903n.A0O("Litho.DebugInfo", strArr) || AbstractC009903n.A0O("*", strArr)) {
                            if (r0 == 0) {
                                r0 = new ArrayList();
                            }
                            r0.add(obj);
                        }
                    }
                    if (r0 == 0) {
                        r0 = C16930sl.A00;
                    }
                    if (!r0.isEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "unsafe-component-host-modification");
                        C58571Pxp c58571Pxp = new C58571Pxp(currentTimeMillis, str, "-1", linkedHashMap);
                        Iterator it = r0.iterator();
                        while (it.hasNext()) {
                            ((AbstractC50682Uo) it.next()).A00(c58571Pxp);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0E(com.facebook.litho.ComponentHost r2) {
        /*
            X.01q r0 = r2.A04
            if (r0 == 0) goto Lb
            int r1 = r0.A00()
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = 0
            if (r0 == 0) goto L11
            r2.A04 = r1
        L11:
            X.01q r0 = r2.A05
            if (r0 == 0) goto L1d
            int r0 = r0.A00()
            if (r0 != 0) goto L1d
            r2.A05 = r1
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentHost.A0E(com.facebook.litho.ComponentHost):void");
    }

    public static final void A0G(ComponentHost componentHost, C2WB c2wb) {
        C2Y3 c2y3;
        AbstractC50812Vc abstractC50812Vc = c2wb.A03;
        if (c2wb.A0J() && (abstractC50812Vc instanceof AbstractC50792Va) && ((AbstractC50792Va) abstractC50812Vc).A14()) {
            componentHost.A0F = true;
        }
        if (componentHost.A0I && componentHost.A0F && (c2y3 = componentHost.A06) != null) {
            c2y3.A0c();
        }
        if (componentHost.A0M.A00() == 0) {
            componentHost.A0F = false;
        }
    }

    public static final void A0H(ComponentHost componentHost, C3h4 c3h4, int i) {
        C51402Xn c51402Xn;
        C005101q c005101q;
        if (componentHost.A0B != null && !componentHost.equals(c3h4.A04) && (c51402Xn = componentHost.A0B) != null) {
            C005101q c005101q2 = c51402Xn.A00;
            if (c005101q2 != null && AbstractC005201r.A00(c005101q2, i) != null) {
                c005101q = c51402Xn.A00;
                if (c005101q == null) {
                    return;
                }
            } else {
                c005101q = c51402Xn.A01;
            }
            c005101q.A06(i);
        }
    }

    @Override // X.C2WS
    public final C3h4 A0I(int i) {
        return (C3h4) this.A0M.A04(i);
    }

    @Override // X.C2WS
    public final void A0J() {
        boolean z = this.A0J;
        try {
            this.A0J = true;
            setOnClickListener(null);
            C2X2 c2x2 = this.A08;
            if (c2x2 != null) {
                c2x2.A00 = null;
            }
            C2YG c2yg = this.A07;
            if (c2yg != null) {
                c2yg.A00 = null;
            }
            ViewOnTouchListenerC51412Xo viewOnTouchListenerC51412Xo = this.A09;
            if (viewOnTouchListenerC51412Xo != null) {
                viewOnTouchListenerC51412Xo.A00 = null;
            }
            this.A0A = null;
        } finally {
            this.A0J = z;
        }
    }

    @Override // X.C2WS
    public final void A0M(C3h4 c3h4) {
        int A01;
        C005101q c005101q = this.A0M;
        int A02 = c005101q.A02(c3h4);
        if (A02 == -1) {
            C005101q c005101q2 = this.A04;
            if (c005101q2 == null) {
                c005101q2 = new C005101q(4);
                this.A04 = c005101q2;
            }
            A01 = c005101q2.A01(c005101q2.A02(c3h4));
        } else {
            A01 = c005101q.A01(A02);
        }
        Object obj = c3h4.A04;
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            C2XV.A00();
            drawable.setCallback(null);
            invalidate(drawable.getBounds());
            A0E(this);
            C51442Xr.A00(this.A0L, this.A03, A01);
        } else if (obj instanceof View) {
            A0D((View) obj, this);
            C51442Xr.A00(this.A0N, this.A05, A01);
            this.A0H = true;
            A0H(this, c3h4, A01);
        }
        C51442Xr.A00(c005101q, this.A04, A01);
        A0E(this);
        A0G(this, AbstractC79093gG.A00(c3h4.A01));
        c3h4.A00 = null;
    }

    @Override // X.C2WS
    public final void A0O(C3h4 c3h4, int i, int i2) {
        C005101q c005101q;
        String str;
        C005101q c005101q2 = this.A0M;
        if (!c3h4.equals(AbstractC005201r.A00(c005101q2, i)) && ((c005101q = this.A04) == null || !c3h4.equals(AbstractC005201r.A00(c005101q, i)))) {
            String A00 = c3h4.A01.A00(null);
            C3h4 c3h42 = (C3h4) AbstractC005201r.A00(c005101q2, i);
            if (c3h42 != null) {
                str = c3h42.A01.A00(null);
            } else {
                str = "null";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Attempting to move MountItem from index: ");
            sb.append(i);
            sb.append(" to index: ");
            sb.append(i2);
            sb.append(", but given MountItem does not exist at provided old index.\nGiven MountItem: ");
            sb.append(A00);
            sb.append("\nExisting MountItem at old index: ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        Rect rect = C78993g5.A00(c3h4.A01.A07).A04;
        C51402Xn c51402Xn = this.A0B;
        if (rect != null && c51402Xn != null) {
            C005101q c005101q3 = c51402Xn.A01;
            if (AbstractC005201r.A00(c005101q3, i2) != null) {
                C005101q c005101q4 = c51402Xn.A00;
                if (c005101q4 == null) {
                    c005101q4 = new C005101q(4);
                    c51402Xn.A00 = c005101q4;
                }
                C51442Xr.A01(c005101q3, c005101q4, i2);
            }
            C51442Xr.A02(c005101q3, c51402Xn.A00, i, i2);
            C005101q c005101q5 = c51402Xn.A00;
            if (c005101q5 != null && c005101q5.A00() == 0) {
                c51402Xn.A00 = null;
            }
        }
        Object obj = c3h4.A04;
        if (obj instanceof Drawable) {
            C2XV.A00();
            C005101q c005101q6 = this.A0L;
            if (AbstractC005201r.A00(c005101q6, i2) != null) {
                C005101q c005101q7 = this.A03;
                if (c005101q7 == null) {
                    c005101q7 = new C005101q(4);
                    this.A03 = c005101q7;
                }
                C51442Xr.A01(c005101q6, c005101q7, i2);
            }
            C51442Xr.A02(c005101q6, this.A03, i, i2);
            invalidate();
            A0E(this);
        } else if (obj instanceof View) {
            this.A0H = true;
            C005101q c005101q8 = this.A0N;
            if (AbstractC005201r.A00(c005101q8, i2) != null) {
                C005101q c005101q9 = this.A05;
                if (c005101q9 == null) {
                    c005101q9 = new C005101q(4);
                    this.A05 = c005101q9;
                }
                C51442Xr.A01(c005101q8, c005101q9, i2);
            }
            C51442Xr.A02(c005101q8, this.A05, i, i2);
        }
        if (AbstractC005201r.A00(c005101q2, i2) != null) {
            C005101q c005101q10 = this.A04;
            if (c005101q10 == null) {
                c005101q10 = new C005101q(4);
                this.A04 = c005101q10;
            }
            C51442Xr.A01(c005101q2, c005101q10, i2);
        }
        C51442Xr.A02(c005101q2, this.A04, i, i2);
        A0E(this);
    }

    public final void A0P(boolean z) {
        C2Y3 c2y3;
        C50952Vr c50952Vr;
        if (z != this.A0I) {
            if (z) {
                c2y3 = this.A06;
                if (c2y3 == null) {
                    Rect rect = C2Y3.A03;
                    c2y3 = new C2Y3(this, null, getImportantForAccessibility(), isFocusable());
                    this.A06 = c2y3;
                }
            } else {
                c2y3 = null;
            }
            AbstractC010103p.A0B(this, c2y3);
            this.A0I = z;
            if (z) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof ComponentHost) {
                        ((ComponentHost) childAt).A0P(true);
                    } else {
                        Object tag = childAt.getTag(R.id.component_node_info);
                        if ((tag instanceof C50952Vr) && (c50952Vr = (C50952Vr) tag) != null) {
                            Rect rect2 = C2Y3.A03;
                            AbstractC010103p.A0B(childAt, new C2Y3(childAt, c50952Vr, childAt.getImportantForAccessibility(), childAt.isFocusable()));
                        }
                    }
                }
            }
        }
    }

    public boolean A0R() {
        return !this.A0G;
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void addView(View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    public final C3h4 getAccessibleMountItem() {
        int A00 = this.A0M.A00();
        for (int i = 0; i < A00; i++) {
            C3h4 A0I = A0I(i);
            C14360o3.A0B(A0I, 0);
            if (AbstractC79093gG.A00(A0I.A01).A0J()) {
                return A0I;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Object obj;
        if (this.A0H) {
            int childCount = getChildCount();
            if (this.A0K.length < childCount) {
                this.A0K = new int[childCount + 5];
            }
            C005101q c005101q = this.A0N;
            int A00 = c005101q.A00();
            int i3 = 0;
            int i4 = 0;
            while (i3 < A00) {
                Object obj2 = ((C3h4) c005101q.A04(i3)).A04;
                C14360o3.A0C(obj2, "null cannot be cast to non-null type android.view.View");
                this.A0K[i4] = indexOfChild((View) obj2);
                i3++;
                i4++;
            }
            ArrayList arrayList = this.A0D;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ArrayList arrayList2 = this.A0D;
                    if (arrayList2 != null) {
                        C3h4 c3h4 = (C3h4) arrayList2.get(i5);
                        if (c3h4 != null) {
                            obj = c3h4.A04;
                        } else {
                            obj = null;
                        }
                        if (obj instanceof View) {
                            this.A0K[i4] = indexOfChild((View) obj);
                            i4++;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            this.A0H = false;
        }
        C78893fv c78893fv = this.A0O;
        if (c78893fv.A02 != null && c78893fv.A00 < c78893fv.A01) {
            c78893fv.A00();
        }
        return this.A0K[i2];
    }

    public final C2YG getComponentFocusChangeListener() {
        return this.A07;
    }

    public final C2X2 getComponentLongClickListener() {
        return this.A08;
    }

    public final ViewOnTouchListenerC51412Xo getComponentTouchListener() {
        return this.A09;
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        return this.A0C;
    }

    public final List getContentDescriptions() {
        CharSequence charSequence;
        ArrayList arrayList = new ArrayList();
        C005101q c005101q = this.A0L;
        int A00 = c005101q.A00();
        for (int i = 0; i < A00; i++) {
            Object A04 = c005101q.A04(i);
            if (A04 != null) {
                C3h4 c3h4 = (C3h4) A04;
                C14360o3.A0B(c3h4, 0);
                C50952Vr c50952Vr = AbstractC79093gG.A00(c3h4.A01).A05;
                if (c50952Vr != null && (charSequence = c50952Vr.A0a) != null) {
                    arrayList.add(charSequence);
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        CharSequence charSequence2 = this.A0C;
        if (charSequence2 != null) {
            arrayList.add(charSequence2);
        }
        return arrayList;
    }

    public final List getContentNames() {
        ArrayList arrayList;
        int A00 = this.A0M.A00();
        if (A00 == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(A00);
            for (int i = 0; i < A00; i++) {
                C3h4 A0I = A0I(i);
                C14360o3.A0B(A0I, 0);
                String A0H = AbstractC79093gG.A00(A0I.A01).A03.A0H();
                C14360o3.A07(A0H);
                arrayList.add(A0H);
            }
        }
        return arrayList;
    }

    public final List getDrawables() {
        ArrayList arrayList;
        C005101q c005101q = this.A0L;
        int A00 = c005101q.A00();
        if (A00 == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(A00);
            for (int i = 0; i < A00; i++) {
                Object obj = ((C3h4) c005101q.A04(i)).A04;
                C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final C2Wq getImageContent() {
        C005101q c005101q = this.A0M;
        C14360o3.A0B(c005101q, 0);
        int A00 = c005101q.A00();
        ArrayList arrayList = new ArrayList(A00);
        for (int i = 0; i < A00; i++) {
            arrayList.add(((C3h4) c005101q.A04(i)).A04);
        }
        return new C55685OoA(arrayList);
    }

    public final List getLinkedDrawablesForAnimation() {
        C005101q c005101q = this.A0L;
        int A00 = c005101q.A00();
        ArrayList arrayList = null;
        for (int i = 0; i < A00; i++) {
            C3h4 c3h4 = (C3h4) c005101q.A04(i);
            C14360o3.A0B(c3h4, 0);
            if ((AbstractC79093gG.A00(c3h4.A01).A00 & 4) != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj = c3h4.A04;
                C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.C2WS
    public int getMountItemCount() {
        return this.A0M.A00();
    }

    public final C2V9 getOnInterceptTouchEventHandler() {
        return this.A0A;
    }

    @Override // android.view.View
    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A02;
        if (sparseArray != null && (obj = sparseArray.get(i)) != null) {
            return obj;
        }
        return super.getTag(i);
    }

    public final List getTextContent() {
        C005101q c005101q = this.A0M;
        C14360o3.A0B(c005101q, 0);
        int A00 = c005101q.A00();
        ArrayList arrayList = new ArrayList(A00);
        for (int i = 0; i < A00; i++) {
            arrayList.add(((C3h4) c005101q.A04(i)).A04);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof TextContent) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final C51402Xn getTouchExpansionDelegate() {
        return this.A0B;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        List textContentText;
        CharSequence A0P;
        if (i == 256 || i == 512) {
            CharSequence charSequence = this.A0C;
            if (charSequence != null && charSequence.length() != 0) {
                A0P = this.A0C;
            } else {
                if (!getContentDescriptions().isEmpty()) {
                    textContentText = getContentDescriptions();
                } else {
                    textContentText = getTextContentText();
                    if (!(!textContentText.isEmpty())) {
                        return false;
                    }
                }
                A0P = AbstractC001800i.A0P(", ", "", "", textContentText, null);
            }
            if (A0P == null) {
                return false;
            }
            this.A0C = A0P;
            super.setContentDescription(A0P);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    @Deprecated(message = "")
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    public final void setComponentFocusChangeListener(C2YG c2yg) {
        this.A07 = c2yg;
        boolean z = this.A0J;
        try {
            this.A0J = true;
            setOnFocusChangeListener(c2yg);
        } finally {
            this.A0J = z;
        }
    }

    public final void setComponentLongClickListener(C2X2 c2x2) {
        this.A08 = c2x2;
        boolean z = this.A0J;
        try {
            this.A0J = true;
            setOnLongClickListener(c2x2);
        } finally {
            this.A0J = z;
        }
    }

    public final void setComponentTouchListener(ViewOnTouchListenerC51412Xo viewOnTouchListenerC51412Xo) {
        this.A09 = viewOnTouchListenerC51412Xo;
        boolean z = this.A0J;
        try {
            this.A0J = true;
            setOnTouchListener(viewOnTouchListenerC51412Xo);
        } finally {
            this.A0J = z;
        }
    }

    public final void setImplementsVirtualViews(boolean z) {
        this.A0F = z;
    }

    public final void setOnInterceptTouchEventHandler(C2V9 c2v9) {
        this.A0A = c2v9;
    }

    public final void setSafeViewModificationsEnabled(boolean z) {
        this.A0J = z;
    }

    public static final void A0F(ComponentHost componentHost) {
        componentHost.setPivotX((componentHost.getWidth() * componentHost.A00) / 100.0f);
        componentHost.setPivotY((componentHost.getHeight() * componentHost.A01) / 100.0f);
        if (componentHost.A00 == 50.0f && componentHost.A01 == 50.0f) {
            componentHost.A00 = Float.MIN_VALUE;
            componentHost.A01 = Float.MIN_VALUE;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C005101q c005101q = this.A0L;
        int A00 = c005101q.A00();
        for (int i = 0; i < A00; i++) {
            C3h4 c3h4 = (C3h4) c005101q.A04(i);
            C14360o3.A0B(c3h4, 0);
            C2WB A002 = AbstractC79093gG.A00(c3h4.A01);
            Object obj = c3h4.A04;
            C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            Drawable drawable = (Drawable) obj;
            int i2 = A002.A00;
            C14360o3.A0B(drawable, 1);
            if (((i2 & 32) == 32 || (i2 & 1) == 1) && drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    public final List getTextContentText() {
        List singletonList;
        List textContent = getTextContent();
        ArrayList arrayList = new ArrayList();
        Iterator it = textContent.iterator();
        while (it.hasNext()) {
            C5M7 A01 = C79793hU.A01((C79793hU) ((TextContent) it.next()));
            if (A01 == null) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(A01.A06);
            }
            AnonymousClass016.A16(singletonList, arrayList);
        }
        return arrayList;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        if (getWidth() <= 0 || getHeight() <= 0 || getWidth() > C2V3.overlappingRenderingViewSizeLimit || getHeight() > C2V3.overlappingRenderingViewSizeLimit) {
            return false;
        }
        return super.hasOverlappingRendering();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C005101q c005101q = this.A0L;
        int A00 = c005101q.A00();
        for (int i = 0; i < A00; i++) {
            Object obj = ((C3h4) c005101q.A04(i)).A04;
            C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            ((Drawable) obj).jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = C0f9.A06(-921366992);
        super.onFocusChanged(z, i, rect);
        C2Y3 c2y3 = this.A06;
        if (c2y3 != null && this.A0F) {
            c2y3.A0j(z, i, rect);
        }
        C0f9.A0D(1911265296, A06);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1851574840);
        if (this.A00 != Float.MIN_VALUE && this.A01 != Float.MIN_VALUE) {
            A0F(this);
        }
        C0f9.A0D(-1326411130, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object obj;
        int A05 = C0f9.A05(483675907);
        C14360o3.A0B(motionEvent, 0);
        C2XV.A00();
        boolean z = true;
        if (isEnabled()) {
            C005101q c005101q = this.A0L;
            for (int A00 = c005101q.A00() - 1; -1 < A00; A00--) {
                C3h4 c3h4 = (C3h4) c005101q.A04(A00);
                if (c3h4 != null) {
                    obj = c3h4.A04;
                } else {
                    obj = null;
                }
                if (obj instanceof InterfaceC51172Wp) {
                    C14360o3.A0B(c3h4, 0);
                    if ((AbstractC79093gG.A00(c3h4.A01).A00 & 2) != 2) {
                        InterfaceC51172Wp interfaceC51172Wp = (InterfaceC51172Wp) obj;
                        if (interfaceC51172Wp.Eik(motionEvent) && interfaceC51172Wp.DuB(this, motionEvent)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        z = super.onTouchEvent(motionEvent);
        C0f9.A0C(-1079944834, A05);
        return z;
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.A0I = false;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        this.A0C = charSequence;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        A0C();
        super.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        A0C();
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        A0C();
        super.setOnFocusChangeListener(onFocusChangeListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        A0C();
        super.setOnLongClickListener(onLongClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        A0C();
        super.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        A0C();
        super.setTag(obj);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C005101q c005101q = this.A0L;
        int A00 = c005101q.A00();
        if (A00 > 0) {
            C2XV.A00();
            int i2 = 0;
            do {
                Object obj = ((C3h4) c005101q.A04(i2)).A04;
                C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                Drawable drawable = (Drawable) obj;
                boolean z = false;
                if (i == 0) {
                    z = true;
                }
                drawable.setVisible(z, false);
                i2++;
            } while (i2 < A00);
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        C50952Vr c50952Vr;
        super.setTag(i, obj);
        if (i == R.id.component_node_info && obj != null) {
            Context context = getContext();
            C14360o3.A07(context);
            Object systemService = context.getSystemService("accessibility");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            A0P(C2XS.A00((AccessibilityManager) systemService));
            C2Y3 c2y3 = this.A06;
            if (c2y3 != null && (obj instanceof C50952Vr) && (c50952Vr = (C50952Vr) obj) != null) {
                c2y3.A00 = c50952Vr;
            }
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated(message = "")
    public final void addView(View view, int i) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }
}
