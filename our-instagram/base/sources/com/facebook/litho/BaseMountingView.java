package com.facebook.litho;

import X.AbstractC10360h2;
import X.AbstractC51432Xq;
import X.AbstractC55832hO;
import X.AbstractC63123SdR;
import X.AbstractC76113bG;
import X.AbstractC78903fw;
import X.AbstractC87343us;
import X.AnonymousClass001;
import X.AnonymousClass412;
import X.C003501a;
import X.C05F;
import X.C07X;
import X.C0f9;
import X.C107434so;
import X.C14360o3;
import X.C27860CPx;
import X.C2V3;
import X.C2X1;
import X.C2XE;
import X.C2XV;
import X.C2Y1;
import X.C2YE;
import X.C3h4;
import X.C50882Vk;
import X.C51092Wf;
import X.C51352Xi;
import X.C5Mm;
import X.C64071Syn;
import X.C75803al;
import X.C75823an;
import X.C78333ez;
import X.C79063gD;
import X.C79073gE;
import X.C79123gJ;
import X.C79203gR;
import X.C79223gT;
import X.C79243gV;
import X.C79443gr;
import X.C89883zU;
import X.InterfaceC51052Wb;
import X.InterfaceC51062Wc;
import X.InterfaceC66812zy;
import X.InterfaceC79103gH;
import X.InterfaceC79483gv;
import X.InterfaceC89793zL;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class BaseMountingView extends ComponentHost implements InterfaceC51052Wb, InterfaceC51062Wc {
    public static final Rect A0K = new Rect();
    public int A00;
    public int A01;
    public int A02;
    public C07X A03;
    public C5Mm A04;
    public C2Y1 A05;
    public Boolean A06;
    public Deque A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final int A0G;
    public final Rect A0H;
    public final Rect A0I;
    public final C51092Wf A0J;

    public static int A04(BaseMountingView baseMountingView, C79443gr c79443gr, InterfaceC79483gv interfaceC79483gv, int i, boolean z) {
        if (c79443gr != null) {
            C75823an mountInfo = baseMountingView.getMountInfo();
            if (mountInfo != null && mountInfo.A00) {
                if (!z) {
                    return i;
                }
            } else {
                C89883zU c89883zU = c79443gr.A00;
                if (c89883zU != null) {
                    C50882Vk currentLayoutState = baseMountingView.getCurrentLayoutState();
                    currentLayoutState.getClass();
                    InterfaceC89793zL interfaceC89793zL = AbstractC51432Xq.A01;
                    return (int) c89883zU.A04.EKB(new C107434so(currentLayoutState.A0J, interfaceC79483gv), new C64071Syn(currentLayoutState, interfaceC79483gv));
                }
            }
        }
        return -1;
    }

    private void A09(Rect rect, boolean z) {
        AnonymousClass412 anonymousClass412;
        C78333ez c78333ez;
        C50882Vk currentLayoutState = getCurrentLayoutState();
        if (currentLayoutState != null) {
            if (!this.A0D || !this.A08 || this.A0E) {
                boolean z2 = this.A0A;
                try {
                    try {
                        C75823an mountInfo = getMountInfo();
                        if (mountInfo != null && !mountInfo.A00) {
                            mountInfo.A01 = true;
                            mountInfo.A00 = true;
                        }
                        this.A0B = true;
                        Object A0S = A0S();
                        currentLayoutState.A06 = z;
                        C79243gV A01 = currentLayoutState.A01();
                        A0Y();
                        this.A05.getClass();
                        C2Y1 c2y1 = this.A05;
                        C79073gE c79073gE = c2y1.A03;
                        if (c79073gE != null) {
                            c79073gE.A01.A0B(rect, c79073gE, currentLayoutState);
                        }
                        C79073gE c79073gE2 = c2y1.A04;
                        if (c79073gE2 != null) {
                            c79073gE2.A01.A0B(rect, c79073gE2, currentLayoutState);
                        }
                        C79073gE c79073gE3 = c2y1.A01;
                        if (c79073gE3 != null) {
                            c79073gE3.A01.A0B(rect, c79073gE3, currentLayoutState);
                        }
                        C79073gE c79073gE4 = c2y1.A00;
                        if (c79073gE4 != null) {
                            c79073gE4.A01.A0B(rect, c79073gE4, currentLayoutState);
                        }
                        C79073gE c79073gE5 = c2y1.A05;
                        if (c79073gE5 != null) {
                            c79073gE5.A01.A0B(rect, c79073gE5, currentLayoutState);
                        }
                        C79073gE c79073gE6 = c2y1.A02;
                        if (c79073gE6 != null) {
                            c79073gE6.A01.A0B(rect, c79073gE6, currentLayoutState);
                        }
                        this.A0J.A0F(A01);
                        AbstractC76113bG.A03.addAndGet(1L);
                        int i = currentLayoutState.A08;
                        if (C78333ez.A05) {
                            synchronized (C78333ez.class) {
                                synchronized (C78333ez.A06) {
                                    Map map = (Map) C78333ez.A08.getValue();
                                    Integer valueOf = Integer.valueOf(i);
                                    Object obj = map.get(valueOf);
                                    if (obj == null) {
                                        obj = new ArrayList();
                                        map.put(valueOf, obj);
                                    }
                                    c78333ez = new C78333ez((List) obj);
                                }
                            }
                            if (C78333ez.A05) {
                                getOverlay().clear();
                            }
                            c78333ez.setBounds(0, 0, getWidth(), getHeight());
                            getOverlay().add(c78333ez);
                        }
                        A0e(A0S);
                        this.A0A = false;
                        C75803al treeState = getTreeState();
                        if (z2 && treeState != null) {
                            currentLayoutState.A0H.A06.A04(currentLayoutState);
                            treeState.A04(currentLayoutState);
                        }
                        if (getMountInfo() != null) {
                            getMountInfo().A01 = false;
                        }
                        this.A0B = false;
                        if (z2) {
                            synchronized (this) {
                            }
                        }
                    } catch (Exception e) {
                        if (this instanceof LithoView) {
                            ComponentTree componentTree = ((LithoView) this).A00;
                            if (e instanceof AnonymousClass412) {
                                anonymousClass412 = (AnonymousClass412) e;
                            } else {
                                anonymousClass412 = new AnonymousClass412(componentTree, e);
                            }
                            throw anonymousClass412;
                        }
                        throw new AnonymousClass412(null, null, null, e);
                    }
                } catch (Throwable th) {
                    if (getMountInfo() != null) {
                        getMountInfo().A01 = false;
                    }
                    this.A0B = false;
                    if (z2) {
                        synchronized (this) {
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public static void A0A(BaseMountingView baseMountingView, boolean z) {
        C79073gE c79073gE;
        C2XV.A00();
        if (baseMountingView.A0i()) {
            baseMountingView.A08 = true;
            baseMountingView.A0D = true;
            boolean z2 = true;
            if (baseMountingView.A0E) {
                z2 = false;
            }
            baseMountingView.A0E = z;
            if (z) {
                C2V3 configuration = baseMountingView.getConfiguration();
                if (configuration == null || !configuration.A0E || baseMountingView.A09) {
                    if (z2) {
                        baseMountingView.Ctb();
                    } else {
                        Rect rect = baseMountingView.A0I;
                        if (baseMountingView.getLocalVisibleRect(rect)) {
                            baseMountingView.A0b(rect);
                        }
                    }
                    ArrayList A06 = A06(baseMountingView.A0J);
                    int size = A06.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            ((BaseMountingView) A06.get(size)).A0f(true, true);
                        } else {
                            return;
                        }
                    }
                }
            } else {
                ArrayList A062 = A06(baseMountingView.A0J);
                int size2 = A062.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else {
                        ((BaseMountingView) A062.get(size2)).A0f(false, true);
                    }
                }
                C2Y1 c2y1 = baseMountingView.A05;
                if (c2y1 != null && (c79073gE = c2y1.A05) != null) {
                    C79203gR.A03(c79073gE);
                }
            }
        }
    }

    public Object A0S() {
        return null;
    }

    public void A0Z(int i, int i2, int i3, int i4) {
    }

    public abstract void A0d(C07X c07x, C07X c07x2);

    public void A0e(Object obj) {
    }

    public abstract boolean A0h();

    public abstract boolean A0i();

    public abstract boolean A0j();

    public abstract C2V3 getConfiguration();

    public abstract C50882Vk getCurrentLayoutState();

    public abstract C75803al getTreeState();

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        this.A0C = false;
        super.onFinishTemporaryDetach();
        A07();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        this.A0C = true;
        super.onStartTemporaryDetach();
        if (this.A09) {
            this.A09 = false;
            A0U();
            C07X c07x = this.A03;
            if (c07x != null) {
                this.A03 = null;
                A0d(c07x, null);
            }
        }
    }

    public synchronized void setOnDirtyMountListener(C5Mm c5Mm) {
        this.A04 = c5Mm;
    }

    public BaseMountingView(Context context, AttributeSet attributeSet) {
        super(new C2XE(context).A0C, attributeSet, null);
        this.A01 = -1;
        this.A00 = -1;
        this.A0H = new Rect();
        this.A06 = false;
        this.A0I = new Rect();
        this.A04 = null;
        this.A0J = new C51092Wf(this, ComponentsSystrace.A00);
        this.A0G = AbstractC78903fw.A00(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C07X A05(Context context) {
        if (context instanceof C07X) {
            return (C07X) context;
        }
        if (context instanceof ContextWrapper) {
            return A05(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static ArrayList A06(C51092Wf c51092Wf) {
        C3h4 c3h4;
        ArrayList arrayList = new ArrayList();
        C003501a c003501a = c51092Wf.A06;
        int A00 = c003501a.A00();
        for (int i = 0; i < A00; i++) {
            C79243gV c79243gV = c51092Wf.A02;
            Object obj = null;
            if (c79243gV != null) {
                RenderTreeNode[] renderTreeNodeArr = c79243gV.A05;
                if (i < renderTreeNodeArr.length && (c3h4 = (C3h4) c003501a.A05(renderTreeNodeArr[i].A06.A0H())) != null) {
                    obj = c3h4.A04;
                }
            }
            if (obj instanceof C2X1) {
                ((C2X1) obj).Ctl(arrayList);
            }
        }
        return arrayList;
    }

    private void A07() {
        C07X A05;
        C07X c07x;
        if (!this.A09) {
            this.A09 = true;
            if (C2V3.defaultInstance.A0C) {
                try {
                    A05 = AbstractC10360h2.A01(this);
                } catch (IllegalStateException unused) {
                    A05 = A05(getContext());
                }
            } else {
                A05 = AbstractC55832hO.A00(this);
            }
            if (A05 != null && (c07x = this.A03) != A05) {
                this.A03 = A05;
                A0d(c07x, A05);
            }
            A0T();
        }
    }

    @Override // com.facebook.litho.ComponentHost
    public final void A0Q(boolean z, int i, int i2, int i3, int i4) {
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            try {
                ComponentsSystrace.A02("LithoView.performLayout");
            } finally {
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
            }
        }
        if (A0i()) {
            A0Z(i, i2, i3, i4);
            if (!A0g()) {
                Ctb();
                A0B(this);
            }
        }
    }

    public void A0T() {
        this.A0J.A0A();
    }

    public final void A0V() {
        C50882Vk currentLayoutState;
        C2Y1 c2y1;
        C79073gE c79073gE;
        if (this.A0A && A0i() && (currentLayoutState = getCurrentLayoutState()) != null && currentLayoutState.A0J != null && (c2y1 = this.A05) != null && (c79073gE = c2y1.A04) != null) {
            C51352Xi.A01(currentLayoutState, c79073gE);
        }
    }

    public final void A0W() {
        C79073gE c79073gE;
        C79073gE c79073gE2;
        C2Y1 c2y1 = this.A05;
        if (c2y1 != null && (c79073gE2 = c2y1.A05) != null) {
            C79203gR.A03(c79073gE2);
        }
        C2Y1 c2y12 = this.A05;
        if (c2y12 != null && (c79073gE = c2y12.A04) != null) {
            ((C79123gJ) c79073gE.A02).A00 = -1;
        }
    }

    @Deprecated
    public final void A0X() {
        this.A0J.A0C();
        this.A05 = null;
        this.A0H.setEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r0.A0T == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.2X7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Y() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.BaseMountingView.A0Y():void");
    }

    @Deprecated
    public void A0f(boolean z, boolean z2) {
        if (this.A0F) {
            setVisibilityHint(z);
        } else {
            A0A(this, z);
        }
    }

    public final boolean A0g() {
        if (!this.A0A && !this.A0J.A03) {
            return false;
        }
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02("BaseMountingView::mountComponentIfNeeded");
        }
        if (A0h()) {
            A0a(null);
        } else {
            Rect rect = new Rect();
            getLocalVisibleRect(rect);
            A0c(rect, true);
        }
        if (!isTracing) {
            return true;
        }
        ComponentsSystrace.A01();
        return true;
    }

    public List getChildMountingViewsFromCurrentlyMountedItems() {
        return A06(this.A0J);
    }

    public C07X getLifecycleOwner() {
        return this.A03;
    }

    public C2Y1 getLithoHostListenerCoordinator() {
        return this.A05;
    }

    public C51092Wf getMountDelegateTarget() {
        return this.A0J;
    }

    public Rect getPreviousMountBounds() {
        return this.A0H;
    }

    public C79223gT getVisibilityExtensionState() {
        C79073gE c79073gE;
        C2Y1 c2y1 = this.A05;
        if (c2y1 != null && (c79073gE = c2y1.A05) != null) {
            return (C79223gT) c79073gE.A02;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasTransientState() {
        if (C2V3.shouldOverrideHasTransientState) {
            return this.A06.booleanValue();
        }
        return super.hasTransientState();
    }

    @Override // X.InterfaceC51062Wc
    public void setAnimatedHeight(int i) {
        this.A00 = i;
        requestLayout();
    }

    @Override // X.InterfaceC51062Wc
    public void setAnimatedWidth(int i) {
        this.A01 = i;
        requestLayout();
    }

    @Override // X.InterfaceC51052Wb
    public void setRenderTreeUpdateListener(InterfaceC66812zy interfaceC66812zy) {
        this.A0J.A0H(interfaceC66812zy);
    }

    private void A08() {
        if (A0i() && (getParent() instanceof View)) {
            int width = ((View) getParent()).getWidth();
            int height = ((View) getParent()).getHeight();
            int translationX = (int) getTranslationX();
            int translationY = (int) getTranslationY();
            int top = getTop() + translationY;
            int bottom = getBottom() + translationY;
            int left = getLeft() + translationX;
            int right = getRight() + translationX;
            Rect rect = this.A0H;
            if (left >= 0 && top >= 0 && right <= width && bottom <= height && rect.left >= 0 && rect.top >= 0 && rect.right <= width && rect.bottom <= height && rect.width() == getWidth() && rect.height() == getHeight()) {
                return;
            }
            Rect rect2 = new Rect();
            if (!getLocalVisibleRect(rect2)) {
                return;
            }
            Ctc(rect2, true);
        }
    }

    public static void A0B(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        if (childCount != 0) {
            View[] viewArr = new View[childCount];
            for (int i = 0; i < childCount; i++) {
                viewArr[i] = componentHost.getChildAt(i);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View view = viewArr[i2];
                if (view.getParent() == componentHost) {
                    if (view.isLayoutRequested()) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(view.getHeight(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
                        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    }
                    if (view instanceof ComponentHost) {
                        A0B((ComponentHost) view);
                    }
                }
            }
        }
    }

    @Override // com.facebook.litho.ComponentHost
    public final boolean A0R() {
        if (A0i() && this.A0B) {
            return false;
        }
        return !super.A0G;
    }

    public void A0U() {
        C2V3 configuration = getConfiguration();
        if (configuration != null && configuration.A0E && !this.A0C && !hasTransientState()) {
            A0a(A0K);
        }
        this.A0J.A0B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (getLocalVisibleRect(r2) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0.A0E == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0a(android.graphics.Rect r5) {
        /*
            r4 = this;
            X.C2XV.A00()
            X.2V3 r0 = r4.getConfiguration()
            r3 = 1
            if (r0 == 0) goto Lf
            boolean r0 = r0.A0E
            r1 = 1
            if (r0 != 0) goto L10
        Lf:
            r1 = 0
        L10:
            boolean r0 = r4.A0i()
            if (r0 == 0) goto L20
            if (r1 == 0) goto L21
            android.graphics.Rect r0 = r4.A0H
            boolean r0 = X.C2I7.A00(r5, r0)
            if (r0 == 0) goto L21
        L20:
            return
        L21:
            android.graphics.Rect r2 = new android.graphics.Rect
            if (r5 != 0) goto L6e
            r2.<init>()
            boolean r0 = r4.getLocalVisibleRect(r2)
            if (r0 != 0) goto L42
        L2e:
            if (r1 == 0) goto L38
            if (r5 == 0) goto L38
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L42
        L38:
            X.2Vk r1 = r4.getCurrentLayoutState()
            if (r1 == 0) goto L46
            boolean r0 = r1.A0a
            if (r0 == 0) goto L46
        L42:
            r4.A0c(r2, r3)
            return
        L46:
            boolean r0 = r4.A0i()
            if (r0 == 0) goto L20
            X.3an r0 = r4.getMountInfo()
            if (r0 == 0) goto L57
            boolean r0 = r0.A00
            if (r0 == 0) goto L57
            return
        L57:
            if (r1 == 0) goto L20
            X.3gr r0 = r1.A00
            if (r0 == 0) goto L63
            int r0 = r2.height()
            if (r0 == 0) goto L42
        L63:
            X.3gr r0 = r1.A01
            if (r0 == 0) goto L20
            int r0 = r2.width()
            if (r0 != 0) goto L20
            goto L42
        L6e:
            r2.<init>(r5)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.BaseMountingView.A0a(android.graphics.Rect):void");
    }

    public final void A0b(Rect rect) {
        if (getCurrentLayoutState() != null && A0j()) {
            boolean isTracing = ComponentsSystrace.A00.isTracing();
            if (isTracing) {
                ComponentsSystrace.A02("BaseMountingView.processVisibilityOutputs");
            }
            try {
                C50882Vk currentLayoutState = getCurrentLayoutState();
                if (currentLayoutState == null) {
                    Log.w("BaseMountingView", "Main Thread Layout state is not found");
                } else {
                    currentLayoutState.A06 = true;
                    C2Y1 c2y1 = this.A05;
                    if (c2y1 != null) {
                        boolean z = this.A0A;
                        C51092Wf c51092Wf = c2y1.A06;
                        C79063gD c79063gD = c51092Wf.A01;
                        if (c79063gD != null) {
                            c79063gD.A03();
                        }
                        C79073gE c79073gE = c2y1.A05;
                        if (c79073gE != null) {
                            if (!z) {
                                Object obj = c79073gE.A01;
                                if (obj instanceof InterfaceC79103gH) {
                                    ((InterfaceC79103gH) obj).E1F(rect, c79073gE);
                                }
                            } else if (C79203gR.A05(c79073gE)) {
                                C79203gR.A02(rect, c2y1.A05, true);
                            }
                        }
                        C79063gD c79063gD2 = c51092Wf.A01;
                        if (c79063gD2 != null) {
                            c79063gD2.A02();
                        }
                    }
                    this.A0H.set(rect);
                }
            } finally {
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
            }
        }
    }

    public final void A0c(Rect rect, boolean z) {
        String str;
        C2XV.A00();
        if (this.A0B) {
            C27860CPx c27860CPx = new C27860CPx(rect, z);
            Deque deque = this.A07;
            if (deque == null) {
                this.A07 = new ArrayDeque();
            } else if (deque.size() > 25) {
                String viewToString = LithoViewTestHelper.viewToString(this, true);
                if (viewToString.length() == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(");
                    sb.append(getLeft());
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    sb.append(getTop());
                    sb.append("-");
                    sb.append(getRight());
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    sb.append(getBottom());
                    sb.append(")");
                    viewToString = sb.toString();
                    C14360o3.A07(viewToString);
                }
                if (A0i()) {
                    str = getTreeName();
                } else {
                    str = null;
                }
                C2YE.A00("ComponentTree:ReentrantMountsExceedMaxAttempts", C05F.A0C, AnonymousClass001.A0u("Reentrant mounts exceed max attempts, view=", viewToString, ", component=", str));
                this.A07.clear();
                return;
            }
            this.A07.add(c27860CPx);
            return;
        }
        C50882Vk currentLayoutState = getCurrentLayoutState();
        if (currentLayoutState != null && (!this.A0D || !this.A08 || this.A0E)) {
            if (this.A02 > 0 && A0i() && A0h()) {
                if (this.A0A) {
                    rect = new Rect(0, 0, getWidth(), getHeight());
                    z = false;
                }
            }
            this.A0H.set(rect);
            if (!this.A0A) {
                C51092Wf c51092Wf = this.A0J;
                if (!c51092Wf.A03) {
                    try {
                        this.A0B = true;
                        currentLayoutState.A06 = z;
                        C79063gD c79063gD = c51092Wf.A01;
                        c79063gD.getClass();
                        c79063gD.A05(rect);
                    } finally {
                        this.A0B = false;
                    }
                }
            }
            A09(rect, z);
        }
        Deque deque2 = this.A07;
        if (deque2 == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(deque2);
        this.A07.clear();
        while (!arrayDeque.isEmpty()) {
            Object pollFirst = arrayDeque.pollFirst();
            pollFirst.getClass();
            C27860CPx c27860CPx2 = (C27860CPx) pollFirst;
            this.A0A = true;
            this.A0H.setEmpty();
            A09(c27860CPx2.A00, c27860CPx2.A01);
        }
    }

    @Override // X.InterfaceC51052Wb
    public final void Ctb() {
        if (getCurrentLayoutState() != null) {
            boolean isTracing = ComponentsSystrace.A00.isTracing();
            if (isTracing) {
                ComponentsSystrace.A02("BaseMountingView.notifyVisibleBoundsChanged");
            }
            A0a(null);
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    @Override // X.InterfaceC51062Wc
    public final void Ctc(Rect rect, boolean z) {
        if (getCurrentLayoutState() != null) {
            boolean isTracing = ComponentsSystrace.A00.isTracing();
            if (isTracing) {
                ComponentsSystrace.A02("BaseMountingView.notifyVisibleBoundsChangedWithRect");
            }
            if (A0h()) {
                A0c(rect, z);
            } else if (z) {
                A0b(rect);
            }
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    @Override // X.InterfaceC51052Wb
    public final void DeQ(Long l) {
        C2V3 configuration = getConfiguration();
        if (configuration != null && configuration.A0T) {
            boolean isTracing = ComponentsSystrace.A00.isTracing();
            if (isTracing) {
                ComponentsSystrace.A02("BaseMountingView::onRegisterForPremount");
            }
            A09(new Rect(), false);
            AbstractC87343us.A02(this.A0J, l);
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    @Override // X.InterfaceC51052Wb
    public final void Dwi() {
        C2V3 configuration = getConfiguration();
        if (configuration != null && configuration.A0T) {
            boolean isTracing = ComponentsSystrace.A00.isTracing();
            if (isTracing) {
                ComponentsSystrace.A02("BaseMountingView::onUnregisterForPremount");
            }
            AbstractC87343us.A01(this.A0J);
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    public C75823an getMountInfo() {
        C75803al treeState = getTreeState();
        if (treeState != null) {
            return treeState.A06;
        }
        return null;
    }

    public String getTreeName() {
        C50882Vk currentLayoutState = getCurrentLayoutState();
        if (currentLayoutState != null) {
            String A0H = currentLayoutState.A0H.A01.A0H();
            C14360o3.A07(A0H);
            return A0H;
        }
        return "";
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        A08();
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-726227269);
        super.onAttachedToWindow();
        A07();
        C0f9.A0D(-1827561941, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(2084887368);
        super.onDetachedFromWindow();
        if (this.A09) {
            this.A09 = false;
            A0U();
            C07X c07x = this.A03;
            if (c07x != null) {
                this.A03 = null;
                A0d(c07x, null);
            }
        }
        C0f9.A0D(366563585, A06);
    }

    @Override // android.view.View
    public void setHasTransientState(boolean z) {
        super.setHasTransientState(z);
        int i = this.A02;
        if (z) {
            if (i == 0 && A0i()) {
                Ctc(new Rect(0, 0, getWidth(), getHeight()), false);
            }
            int i2 = this.A02;
            if (i2 == 0) {
                this.A06 = true;
            }
            this.A02 = i2 + 1;
            return;
        }
        int i3 = i - 1;
        this.A02 = i3;
        if (i3 == 0) {
            this.A06 = false;
            if (A0i()) {
                Ctb();
            }
        }
        if (this.A02 >= 0) {
            return;
        }
        this.A02 = 0;
    }

    public void setSkipMountingIfNotVisible(boolean z) {
        C2XV.A00();
        this.A0F = z;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            A08();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            A08();
        }
    }

    public void setVisibilityHintNonRecursive(boolean z) {
        C79073gE c79073gE;
        C2XV.A00();
        if (A0i()) {
            if (!this.A08 && z) {
                return;
            }
            boolean z2 = true;
            this.A08 = true;
            this.A0D = true;
            if (this.A0E) {
                z2 = false;
            }
            this.A0E = z;
            if (z) {
                C2V3 configuration = getConfiguration();
                if (configuration != null && configuration.A0E && !this.A09) {
                    return;
                }
                if (z2) {
                    Ctb();
                    return;
                }
                Rect rect = this.A0I;
                if (!getLocalVisibleRect(rect)) {
                    return;
                }
                A0b(rect);
                return;
            }
            C2Y1 c2y1 = this.A05;
            if (c2y1 == null || (c79073gE = c2y1.A05) == null) {
                return;
            }
            C79203gR.A03(c79073gE);
        }
    }

    @Deprecated
    public void setVisibilityHint(boolean z) {
        A0A(this, z);
    }
}
