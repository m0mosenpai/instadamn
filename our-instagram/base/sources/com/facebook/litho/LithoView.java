package com.facebook.litho;

import X.AbstractC50812Vc;
import X.AbstractC63123SdR;
import X.AbstractC75733ae;
import X.AnonymousClass001;
import X.AnonymousClass412;
import X.C05F;
import X.C07X;
import X.C0f9;
import X.C124005jE;
import X.C14360o3;
import X.C2V3;
import X.C2V9;
import X.C2XE;
import X.C2XS;
import X.C2XV;
import X.C2Y1;
import X.C2Y2;
import X.C2YE;
import X.C2Z5;
import X.C50882Vk;
import X.C51112Wh;
import X.C75803al;
import X.C78333ez;
import X.C78913fx;
import X.C79073gE;
import X.C79143gL;
import X.C9II;
import X.InterfaceC115965Mn;
import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class LithoView extends BaseMountingView {
    public static final int[] A0B = new int[2];
    public ComponentTree A00;
    public ComponentTree A01;
    public InterfaceC115965Mn A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C2XE A08;
    public final AccessibilityManager A09;
    public final C78913fx A0A;

    public LithoView(C2XE c2xe) {
        this(c2xe, (AttributeSet) null);
    }

    public static LithoView A00(Context context, AbstractC50812Vc abstractC50812Vc) {
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        lithoView.A0l(ComponentTree.A02(abstractC50812Vc, new C2XE(context), null).A00(), true);
        return lithoView;
    }

    public static void A03(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof LithoView) {
                LithoView lithoView = (LithoView) childAt;
                boolean z2 = lithoView.A06;
                if (z) {
                    if (!z2) {
                        lithoView.onAttachedToWindow();
                        lithoView.A06 = true;
                        lithoView.A02();
                    }
                } else if (z2) {
                    lithoView.A06 = false;
                    lithoView.onDetachedFromWindow();
                    lithoView.A02();
                }
            } else if (childAt instanceof ViewGroup) {
                A03((ViewGroup) childAt, z);
            }
        }
    }

    @Override // com.facebook.litho.BaseMountingView
    public final Object A0S() {
        return 0;
    }

    @Override // com.facebook.litho.BaseMountingView
    public final void A0f(boolean z, boolean z2) {
        if (A0m()) {
            C2YE.A00("lithoView:LithoVisibilityEventsControllerFound", C05F.A00, "Setting visibility hint but a LithoVisibilityEventsController was found, ignoring.");
        } else {
            super.A0f(z, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0012, code lost:
    
        if (r1 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A0m() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.facebook.litho.ComponentTree r2 = r3.A00     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L14
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L17
            X.2Vx r0 = r2.A08     // Catch: java.lang.Throwable -> Le
            r1 = 0
            if (r0 == 0) goto Lc
            r1 = 1
        Lc:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            goto L11
        Le:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        L11:
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            monitor-exit(r3)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.A0m():boolean");
    }

    public void setComponentTree(ComponentTree componentTree) {
        A0l(componentTree, true);
    }

    public static LithoView A01(Context context, ComponentTree componentTree) {
        LithoView lithoView = new LithoView(new C2XE(context), (AttributeSet) null);
        lithoView.A0l(componentTree, true);
        return lithoView;
    }

    private void A02() {
        A03(this, this.A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, java.lang.Object, X.04m] */
    @Override // com.facebook.litho.BaseMountingView
    public final void A0T() {
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            componentTree.A0I();
        }
        Context context = getContext();
        C14360o3.A0B(context, 0);
        Object systemService = context.getSystemService("accessibility");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        A0P(C2XS.A00((AccessibilityManager) systemService));
        AccessibilityManager accessibilityManager = this.A09;
        C78913fx c78913fx = this.A0A;
        if (c78913fx != null) {
            ?? obj = new Object();
            obj.A00 = c78913fx;
            accessibilityManager.addAccessibilityStateChangeListener(obj);
        }
    }

    @Override // com.facebook.litho.BaseMountingView
    public final void A0Z(int i, int i2, int i3, int i4) {
        ComponentTree componentTree = this.A00;
        if (componentTree != null && !componentTree.Cbm()) {
            if (this.A03 || this.A00.A06 == null) {
                int max = Math.max(0, ((i3 - i) - getPaddingRight()) - getPaddingLeft());
                int max2 = Math.max(0, ((i4 - i2) - getPaddingTop()) - getPaddingBottom());
                this.A00.A0T(A0B, View.MeasureSpec.makeMeasureSpec(max, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(max2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), false);
                this.A05 = false;
                this.A03 = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Trying to layout a LithoView holding onto a released ComponentTree");
    }

    @Override // com.facebook.litho.BaseMountingView
    public final void A0d(C07X c07x, C07X c07x2) {
        ComponentTree componentTree;
        if (C2V3.defaultInstance.A0J && (componentTree = this.A00) != null && c07x2 != null) {
            componentTree.A0L(c07x2);
        }
    }

    @Override // com.facebook.litho.BaseMountingView
    public final void A0e(Object obj) {
        if (obj != null) {
            int intValue = ((Number) obj).intValue();
            if (this.A06) {
                A02();
            }
            if ((intValue & 1) != 0) {
                throw new NullPointerException("markPoint");
            }
            if ((intValue & 2) != 0) {
                throw new NullPointerException("markPoint");
            }
            return;
        }
        throw new IllegalStateException("Should have received wether firs and last mount should be logged");
    }

    @Override // com.facebook.litho.BaseMountingView
    public final boolean A0h() {
        ComponentTree componentTree = this.A00;
        if (componentTree != null && componentTree.A0W.A02.A01.A0M) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.litho.BaseMountingView
    public final boolean A0i() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.litho.BaseMountingView
    public final boolean A0j() {
        ComponentTree componentTree = this.A00;
        if (componentTree != null && componentTree.A0W.A02.A01.A0X) {
            return true;
        }
        return false;
    }

    public Deque findTestItems(String str) {
        C2Y2 c2y2;
        C2Y1 c2y1 = ((BaseMountingView) this).A05;
        if (c2y1 != null) {
            C79073gE c79073gE = c2y1.A01;
            if (c79073gE != null && (c2y2 = (C2Y2) c79073gE.A01) != null) {
                Map map = c2y2.A02;
                if (map != null) {
                    Deque deque = (Deque) map.get(str);
                    if (deque != null) {
                        return deque;
                    }
                } else {
                    throw new UnsupportedOperationException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
                }
            } else {
                throw new IllegalStateException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
            }
        }
        return new LinkedList();
    }

    public C2XE getComponentContext() {
        return this.A08;
    }

    public ComponentTree getComponentTree() {
        return this.A00;
    }

    @Override // com.facebook.litho.BaseMountingView
    public C2V3 getConfiguration() {
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            return componentTree.A0W.A02.A01;
        }
        return null;
    }

    @Override // com.facebook.litho.BaseMountingView
    public C50882Vk getCurrentLayoutState() {
        ComponentTree componentTree = this.A00;
        if (componentTree == null) {
            return null;
        }
        return componentTree.A06;
    }

    public C51112Wh getDynamicPropsManager() {
        C79073gE c79073gE;
        C2Y1 c2y1 = ((BaseMountingView) this).A05;
        if (c2y1 != null && (c79073gE = c2y1.A00) != null) {
            return ((C79143gL) c79073gE.A02).A03;
        }
        return null;
    }

    @Override // X.C2WS
    public String getHostHierarchyMountStateIdentifier() {
        AbstractC50812Vc A0F;
        ComponentTree componentTree = this.A00;
        if (componentTree == null || (A0F = componentTree.A0F()) == null) {
            return null;
        }
        return AbstractC75733ae.A00(A0F.getClass());
    }

    public C50882Vk getMountedLayoutState() {
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            return componentTree.A06;
        }
        return null;
    }

    public AbstractC50812Vc getRootComponent() {
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            return componentTree.A0F();
        }
        return null;
    }

    @Override // com.facebook.litho.BaseMountingView
    public String getTreeName() {
        String A0H;
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            synchronized (componentTree) {
                AbstractC50812Vc abstractC50812Vc = componentTree.A03;
                if (abstractC50812Vc != null) {
                    A0H = abstractC50812Vc.A0H();
                } else {
                    A0H = null;
                }
            }
            return A0H;
        }
        return null;
    }

    @Override // com.facebook.litho.BaseMountingView
    public C75803al getTreeState() {
        ComponentTree componentTree = this.A00;
        if (componentTree == null) {
            return null;
        }
        return componentTree.A0H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (((com.facebook.litho.BaseMountingView) r11).A00 != (-1)) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:79:0x0008, B:3:0x000d, B:5:0x0014, B:7:0x001d, B:8:0x0021, B:10:0x0025, B:11:0x0029, B:13:0x002f, B:15:0x0033, B:21:0x0038, B:23:0x0040, B:26:0x004b, B:29:0x0052, B:31:0x005e, B:33:0x0062, B:34:0x0068, B:36:0x006c, B:38:0x0074, B:40:0x007a, B:41:0x0081, B:43:0x0087, B:45:0x009a, B:46:0x00a7, B:48:0x00b6, B:49:0x00c3, B:50:0x00ce, B:52:0x00d2, B:54:0x00d6, B:56:0x00dc, B:58:0x00e8, B:60:0x00f3, B:61:0x00f5, B:65:0x0101, B:67:0x0109, B:68:0x010b, B:74:0x00e0), top: B:78:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:79:0x0008, B:3:0x000d, B:5:0x0014, B:7:0x001d, B:8:0x0021, B:10:0x0025, B:11:0x0029, B:13:0x002f, B:15:0x0033, B:21:0x0038, B:23:0x0040, B:26:0x004b, B:29:0x0052, B:31:0x005e, B:33:0x0062, B:34:0x0068, B:36:0x006c, B:38:0x0074, B:40:0x007a, B:41:0x0081, B:43:0x0087, B:45:0x009a, B:46:0x00a7, B:48:0x00b6, B:49:0x00c3, B:50:0x00ce, B:52:0x00d2, B:54:0x00d6, B:56:0x00dc, B:58:0x00e8, B:60:0x00f3, B:61:0x00f5, B:65:0x0101, B:67:0x0109, B:68:0x010b, B:74:0x00e0), top: B:78:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087 A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:79:0x0008, B:3:0x000d, B:5:0x0014, B:7:0x001d, B:8:0x0021, B:10:0x0025, B:11:0x0029, B:13:0x002f, B:15:0x0033, B:21:0x0038, B:23:0x0040, B:26:0x004b, B:29:0x0052, B:31:0x005e, B:33:0x0062, B:34:0x0068, B:36:0x006c, B:38:0x0074, B:40:0x007a, B:41:0x0081, B:43:0x0087, B:45:0x009a, B:46:0x00a7, B:48:0x00b6, B:49:0x00c3, B:50:0x00ce, B:52:0x00d2, B:54:0x00d6, B:56:0x00dc, B:58:0x00e8, B:60:0x00f3, B:61:0x00f5, B:65:0x0101, B:67:0x0109, B:68:0x010b, B:74:0x00e0), top: B:78:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3 A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:79:0x0008, B:3:0x000d, B:5:0x0014, B:7:0x001d, B:8:0x0021, B:10:0x0025, B:11:0x0029, B:13:0x002f, B:15:0x0033, B:21:0x0038, B:23:0x0040, B:26:0x004b, B:29:0x0052, B:31:0x005e, B:33:0x0062, B:34:0x0068, B:36:0x006c, B:38:0x0074, B:40:0x007a, B:41:0x0081, B:43:0x0087, B:45:0x009a, B:46:0x00a7, B:48:0x00b6, B:49:0x00c3, B:50:0x00ce, B:52:0x00d2, B:54:0x00d6, B:56:0x00dc, B:58:0x00e8, B:60:0x00f3, B:61:0x00f5, B:65:0x0101, B:67:0x0109, B:68:0x010b, B:74:0x00e0), top: B:78:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109 A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:79:0x0008, B:3:0x000d, B:5:0x0014, B:7:0x001d, B:8:0x0021, B:10:0x0025, B:11:0x0029, B:13:0x002f, B:15:0x0033, B:21:0x0038, B:23:0x0040, B:26:0x004b, B:29:0x0052, B:31:0x005e, B:33:0x0062, B:34:0x0068, B:36:0x006c, B:38:0x0074, B:40:0x007a, B:41:0x0081, B:43:0x0087, B:45:0x009a, B:46:0x00a7, B:48:0x00b6, B:49:0x00c3, B:50:0x00ce, B:52:0x00d2, B:54:0x00d6, B:56:0x00dc, B:58:0x00e8, B:60:0x00f3, B:61:0x00f5, B:65:0x0101, B:67:0x0109, B:68:0x010b, B:74:0x00e0), top: B:78:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.onMeasure(int, int):void");
    }

    public void setComponent(AbstractC50812Vc abstractC50812Vc) {
        ComponentTree componentTree = this.A00;
        if (componentTree == null) {
            A0l(ComponentTree.A02(abstractC50812Vc, this.A08, null).A00(), true);
        } else {
            componentTree.A0M(abstractC50812Vc);
        }
    }

    public void setComponentAsync(AbstractC50812Vc abstractC50812Vc) {
        ComponentTree componentTree = this.A00;
        if (componentTree == null) {
            A0l(ComponentTree.A02(abstractC50812Vc, this.A08, null).A00(), true);
        } else {
            componentTree.A0N(abstractC50812Vc);
        }
    }

    public void setOnPostDrawListener(InterfaceC115965Mn interfaceC115965Mn) {
        this.A02 = interfaceC115965Mn;
    }

    public void setTemporaryDetachedComponentTree(ComponentTree componentTree) {
        this.A01 = componentTree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, java.lang.Object, X.04m] */
    @Override // com.facebook.litho.BaseMountingView
    public final void A0U() {
        super.A0U();
        ComponentTree componentTree = this.A00;
        if (componentTree != null) {
            componentTree.A0J();
        }
        AccessibilityManager accessibilityManager = this.A09;
        C78913fx c78913fx = this.A0A;
        if (c78913fx != null) {
            ?? obj = new Object();
            obj.A00 = c78913fx;
            accessibilityManager.removeAccessibilityStateChangeListener(obj);
        }
    }

    @Deprecated
    public final void A0k() {
        C2XV.A00();
        if (A0m()) {
            C2YE.A00("lithoView:LithoVisibilityEventsControllerFound", C05F.A00, "Trying to release a LithoView but a LithoVisibilityEventsController was found, ignoring.");
            return;
        }
        for (BaseMountingView baseMountingView : BaseMountingView.A06(((BaseMountingView) this).A0J)) {
            if (baseMountingView instanceof LithoView) {
                ((LithoView) baseMountingView).A0k();
            }
        }
        ComponentTree componentTree = this.A00;
        if (componentTree == null) {
            return;
        }
        componentTree.A0K();
        if (C78333ez.A05) {
            getOverlay().clear();
        }
        this.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r2 != r7.A0U) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0104, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Base view context differs, view context is: ");
        r1.append(r2);
        r1.append(", ComponentTree context is: ");
        r1.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0122, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0l(com.facebook.litho.ComponentTree r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.A0l(com.facebook.litho.ComponentTree, boolean):void");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(-1336084490);
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            try {
                ComponentsSystrace.A02("LithoView.draw");
            } catch (Throwable th) {
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
                C0f9.A0A(1822955699, A03);
                throw th;
            }
        }
        try {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            super.draw(canvas);
            InterfaceC115965Mn interfaceC115965Mn = this.A02;
            if (interfaceC115965Mn != null) {
                C9II c9ii = (C9II) interfaceC115965Mn;
                C2Z5 c2z5 = c9ii.A01.A00;
                int A02 = RecyclerView.A02(c9ii.A02.itemView);
                if (A02 != -1) {
                    SystemClock.uptimeMillis();
                    C124005jE c124005jE = (C124005jE) c2z5.A0i.get(A02);
                    final C2V9 BmZ = c124005jE.A02().BmZ();
                    if (BmZ != null) {
                        AtomicInteger atomicInteger = c124005jE.A0D;
                        if (atomicInteger.get() == 0) {
                            c2z5.A08.postOnAnimation(new Runnable(BmZ) { // from class: X.9IJ
                                public final C2V9 A00;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2V9 c2v9 = this.A00;
                                    C2XV.A00();
                                    c2v9.A00(new Object());
                                }

                                {
                                    this.A00 = BmZ;
                                }
                            });
                            atomicInteger.set(2);
                        }
                    }
                    c9ii.A00.A02 = null;
                }
            }
            if (isTracing) {
                ComponentsSystrace.A01();
            }
            C0f9.A0A(1183234035, A03);
        } catch (Throwable th2) {
            throw new AnonymousClass412(this.A00, th2);
        }
    }

    @Override // com.facebook.litho.BaseMountingView
    public void setVisibilityHint(boolean z) {
        if (A0m()) {
            C2YE.A00("lithoView:LithoVisibilityEventsControllerFound", C05F.A00, "Setting visibility hint but a LithoVisibilityEventsController was found, ignoring.");
        } else {
            BaseMountingView.A0A(this, z);
        }
    }

    @Override // android.view.View
    public final String toString() {
        return AnonymousClass001.A0R(super.toString(), LithoViewTestHelper.viewToString(this, true));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3fx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LithoView(X.C2XE r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            android.content.Context r1 = r3.A0C
            r2.<init>(r1, r4)
            r0 = 0
            r2.A07 = r0
            r2.A05 = r0
            r0 = 0
            r2.A02 = r0
            X.3fx r0 = new X.3fx
            r0.<init>(r2)
            r2.A0A = r0
            r2.A08 = r3
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r2.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.<init>(X.2XE, android.util.AttributeSet):void");
    }

    public LithoView(Context context, AttributeSet attributeSet) {
        this(new C2XE(context), attributeSet);
    }

    public LithoView(Context context) {
        this(context, (AttributeSet) null);
    }
}
