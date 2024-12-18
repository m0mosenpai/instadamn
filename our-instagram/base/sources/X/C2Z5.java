package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2Z5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Z5 implements C2Z6, C2Z7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public RecyclerView A08;
    public C2V9 A09;
    public C2Vj A0A;
    public C170947jl A0B;
    public C169687hi A0C;
    public boolean A0E;
    public boolean A0F;
    public int A0H;
    public int A0I;
    public C170937jk A0J;
    public Integer A0K;
    public boolean A0L;
    public final float A0M;
    public final C2UU A0Q;
    public final C2XE A0R;
    public final InterfaceC170457iy A0T;
    public final InterfaceC170597jC A0V;
    public final InterfaceC170617jE A0W;
    public final C170607jD A0X;
    public final C170647jH A0Y;
    public final Runnable A0d;
    public final List A0g;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final int A0s;
    public final int A0t;
    public final int A0u;
    public final InterfaceC51012Vx A0v;
    public final C2V3 A0w;
    public final C170957jm A0x;
    public final C170477j0 A0z;
    public final InterfaceC170577jA A10;
    public final boolean A14;
    public final boolean A15;
    public volatile C2Vj A16;
    public volatile boolean A17;
    public final C170417iu mRecyclerBinderConfig;
    public static final C2Vj A1A = new Object();
    public static final Rect A18 = new Rect();
    public static final Rect A19 = new Rect();
    public final List A0i = new ArrayList();
    public final List A0h = new ArrayList();
    public final Handler A0N = new Handler(Looper.getMainLooper());
    public final AtomicBoolean A12 = new AtomicBoolean(false);
    public final AtomicBoolean A13 = new AtomicBoolean(false);
    public final AtomicLong A0k = new AtomicLong(-1);
    public final Deque A0e = new ArrayDeque();
    public final AtomicBoolean A0j = new AtomicBoolean(false);
    public final AtomicBoolean A11 = new AtomicBoolean(false);
    public final Deque A0f = new ArrayDeque();
    public final Runnable A0c = new Runnable() { // from class: X.7j1
        @Override // java.lang.Runnable
        public final void run() {
            C2V9 c2v9 = C2Z5.this.A09;
            if (c2v9 != null) {
                c2v9.A00(new Object());
            }
        }
    };
    public Deque A0D = new ArrayDeque();
    public final Object A0Z = new Object();
    public boolean A0G = false;
    public final Runnable A0b = new Runnable() { // from class: X.7j2
        @Override // java.lang.Runnable
        public final void run() {
            C2Z5 c2z5 = C2Z5.this;
            synchronized (c2z5.A0Z) {
                c2z5.A0G = false;
                if (c2z5.A0D.isEmpty()) {
                    return;
                }
                c2z5.A0D = new ArrayDeque();
                for (C124005jE c124005jE : c2z5.A0D) {
                    if (c124005jE != null) {
                        C2Z5.A0A(c124005jE);
                    }
                }
            }
        }
    };
    public final C170507j3 A0U = new C170507j3(this);
    public final ViewTreeObserver.OnPreDrawListener A0P = new ViewTreeObserver.OnPreDrawListener() { // from class: X.7j4
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            C2Z5.A0J(C2Z5.this);
            return true;
        }
    };
    public final View.OnAttachStateChangeListener A0O = new View.OnAttachStateChangeListener() { // from class: X.7j5
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            C2Z5.A07((RecyclerView) view, C2Z5.this);
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public final Runnable A0a = new Runnable() { // from class: X.7j6
        @Override // java.lang.Runnable
        public final void run() {
            C2Z5.this.A0Q.notifyDataSetChanged();
        }
    };
    public final C170547j7 A0y = new C170547j7(this);
    public final AbstractC107524sx A0S = new AbstractC107524sx() { // from class: X.7j8
        @Override // X.AbstractC107524sx
        public final void A01(long j) {
            C2Z5.A0N(C2Z5.this, 0);
        }
    };

    public static C124005jE A04(C2Z5 c2z5, InterfaceC170717jO interfaceC170717jO) {
        InterfaceC170717jO interfaceC170717jO2 = interfaceC170717jO;
        C170937jk c170937jk = c2z5.A0J;
        if (c170937jk != null) {
            Object AvD = interfaceC170717jO.AvD("component_warmer_tag");
            if (AvD instanceof String) {
                C124005jE EEg = c170937jk.A00.EEg((String) AvD);
                if (EEg != null) {
                    boolean z = AbstractC170667jJ.A00;
                    Object AvD2 = interfaceC170717jO.AvD("prevent_release");
                    if (AvD2 != null) {
                        EEg.A02().A8G("prevent_release", AvD2);
                    }
                    return EEg;
                }
            }
        }
        C170957jm c170957jm = c2z5.A0x;
        C2V3 c2v3 = c2z5.A0w;
        InterfaceC51012Vx interfaceC51012Vx = c2z5.A0v;
        if (interfaceC170717jO == null) {
            interfaceC170717jO2 = C170697jM.A00();
        }
        if (interfaceC170717jO2 != null) {
            return new C124005jE(interfaceC51012Vx, c2v3, c170957jm, interfaceC170717jO2, true);
        }
        throw new IllegalArgumentException("A RenderInfo must be specified to create a ComponentTreeHolder");
    }

    public static void A0C(C124005jE c124005jE, InterfaceC170717jO interfaceC170717jO) {
        synchronized (c124005jE) {
        }
        synchronized (c124005jE) {
            synchronized (c124005jE) {
                c124005jE.A06 = false;
            }
        }
        c124005jE.A04 = interfaceC170717jO;
    }

    public static void A0P(final C2Z5 c2z5, InterfaceC170617jE interfaceC170617jE, int i, int i2) {
        int i3;
        final int i4;
        final int i5;
        boolean z;
        InterfaceC170897jg ayn;
        int i6 = i2;
        int i7 = i;
        synchronized (c2z5) {
            if (c2z5.A0T() && (i3 = c2z5.A04) != -1) {
                if (i == -1 || i2 == -1) {
                    i7 = 0;
                    i6 = 0;
                }
                int max = Math.max(i3, i6 - i7);
                final int size = c2z5.A0i.size();
                if (c2z5.A0o) {
                    i5 = size;
                    i4 = 0;
                } else {
                    int i8 = (int) (max * c2z5.A0M);
                    i4 = i7 - i8;
                    i5 = max + i7 + i8;
                }
                if (i4 >= c2z5.A0I && i5 <= c2z5.A0H) {
                    z = false;
                } else {
                    c2z5.A0I = i4;
                    c2z5.A0H = i5;
                    z = true;
                }
                if (c2z5.A0u != 1) {
                    ayn = new InterfaceC170897jg() { // from class: X.7jf
                        @Override // X.InterfaceC170897jg
                        public final boolean E67(int i9) {
                            boolean z2;
                            C2Z5 c2z52 = C2Z5.this;
                            int i10 = i4;
                            int i11 = i5;
                            int i12 = size;
                            synchronized (c2z52) {
                                List list = c2z52.A0i;
                                if (i12 != list.size()) {
                                    z2 = false;
                                } else {
                                    C124005jE c124005jE = (C124005jE) list.get(i9);
                                    z2 = true;
                                    if (!c124005jE.A02().EGz()) {
                                        int A01 = C2Z5.A01(c2z52.A0A, c124005jE, c2z52, c2z52.A06);
                                        int A00 = C2Z5.A00(c2z52.A0A, c124005jE, c2z52, c2z52.A05);
                                        if ((i9 >= i10 || c124005jE.A02().Cdm()) && i9 <= i11) {
                                            if (!c124005jE.A0A(A01, A00)) {
                                                c124005jE.A06(c2z52.A0R, null, A01, A00);
                                            }
                                            return true;
                                        }
                                        C2Z5.A0B(c124005jE, c2z52);
                                        return true;
                                    }
                                }
                                return z2;
                            }
                        }
                    };
                } else {
                    ayn = new AYN(c2z5, i4, i5, size, z);
                }
                interfaceC170617jE.F8Z(ayn, 0, size, i7, i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.2Vj] */
    public static void A0Q(C2Z5 c2z5, List list, int i, int i2, int i3) {
        if (c2z5.A0n) {
            return;
        }
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        List list2 = c2z5.A0i;
        C170267if c170267if = new C170267if(list, i3, list2.size() - 1, c2z5.A0q);
        if (isTracing) {
            ComponentsSystrace.A02("maybeScheduleAsyncLayoutsDuringInitRange");
        }
        if (!list2.isEmpty()) {
            A0G(c170267if, c2z5);
        }
        if (isTracing) {
            ComponentsSystrace.A01();
        }
        C124005jE c124005jE = (C124005jE) list.get(i3);
        int A01 = A01(c2z5.A0A, c124005jE, c2z5, c2z5.A06);
        int A00 = A00(c2z5.A0A, c124005jE, c2z5, c2z5.A05);
        if (isTracing) {
            ComponentsSystrace.A02("firstLayout");
        }
        C2XE c2xe = c2z5.A0R;
        BB3 Aq3 = c124005jE.A02().Aq3();
        synchronized (c124005jE) {
        }
        if (Aq3 != null) {
            throw new NullPointerException("newPerformanceEvent");
        }
        try {
            ?? obj = new Object();
            c124005jE.A07(c2xe, obj, A01, A00);
            int max = Math.max(c2z5.A0T.ACM(obj.A01, obj.A00, i, i2), 1);
            c2z5.A16 = obj;
            c2z5.A04 = max;
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        } finally {
        }
    }

    public final ComponentTree A0V(int i) {
        C124005jE c124005jE;
        C2Vj c2Vj;
        int i2;
        int i3;
        if (C2V3.enableFixForStickyHeader) {
            c124005jE = (C124005jE) this.A0i.get(i);
        } else {
            synchronized (this) {
                C2XV.A00();
                c124005jE = (C124005jE) this.A0i.get(i);
            }
        }
        synchronized (this) {
            c2Vj = this.A0A;
            i2 = this.A06;
            i3 = this.A05;
        }
        int A01 = A01(c2Vj, c124005jE, this, i2);
        int A00 = A00(c2Vj, c124005jE, this, i3);
        if (!c124005jE.A0A(A01, A00)) {
            c124005jE.A07(this.A0R, null, A01, A00);
        }
        return c124005jE.A01();
    }

    public final void A0h(InterfaceC170847jb interfaceC170847jb) {
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02("notifyChangeSetCompleteAsync");
        }
        try {
            if (AbstractC170667jJ.A00) {
                hashCode();
            }
            this.A17 = true;
            A0I(this);
            synchronized (this) {
                C170947jl c170947jl = this.A0B;
                if (c170947jl == null) {
                    c170947jl = new C170947jl(this.A00);
                    this.A0B = c170947jl;
                }
                c170947jl.A02 = true;
                c170947jl.A01 = interfaceC170847jb;
                this.A0e.addLast(c170947jl);
                this.A0j.set(true);
                this.A0B = null;
            }
            if (C2XV.A01()) {
                A0N(this, 0);
                A0L(this);
            } else if (this.A12.get()) {
                C107504sv.A00().A01(this.A0S);
            }
            if (C2V3.isEndToEndTestRun) {
                this.A0k.set(-1L);
            }
        } finally {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    @Override // X.C2Z7
    public final synchronized int And(int i) {
        C124005jE c124005jE;
        c124005jE = (C124005jE) this.A0i.get(i);
        c124005jE.getClass();
        return A01(this.A0A, c124005jE, this, this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x01c2, code lost:
    
        if (r1 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0183, code lost:
    
        if (r7.A0M == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2Z5(X.C170437iw r48) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Z5.<init>(X.7iw):void");
    }

    public static int A00(C2Vj c2Vj, C124005jE c124005jE, C2Z5 c2z5, int i) {
        boolean z = c2z5.A14;
        boolean A0T = c2z5.A0T();
        if (z) {
            if (A0T) {
                float BbM = c124005jE.A02().BbM();
                if (BbM < 0.0f || BbM > 100.0f) {
                    return 0;
                }
            } else {
                return 0;
            }
        } else if (A0T) {
            float BbM2 = c124005jE.A02().BbM();
            if (BbM2 < 0.0f || BbM2 > 100.0f) {
                return c2z5.A0T.Anb(c124005jE.A02(), View.MeasureSpec.makeMeasureSpec(c2Vj.A00, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            }
        } else {
            return c2z5.A0T.Anb(c124005jE.A02(), i);
        }
        return View.MeasureSpec.makeMeasureSpec(C2WL.A00((c2Vj.A00 * c124005jE.A02().BbM()) / 100.0f), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    public static int A02(List list, boolean z) {
        int i;
        if (z) {
            i = list.size();
            do {
                i--;
                if (i < 0) {
                    return -1;
                }
            } while (!((C124005jE) list.get(i)).A02().EGw());
        } else {
            i = 0;
            int size = list.size();
            while (i < size) {
                if (!((C124005jE) list.get(i)).A02().EGw()) {
                    i++;
                }
            }
            return -1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.2Vj] */
    private C2Vj A03(int i, int i2, boolean z) {
        int mode;
        int size;
        ?? obj = new Object();
        int Bqz = this.A0T.Bqz();
        boolean z2 = false;
        if (Bqz == 1) {
            mode = View.MeasureSpec.getMode(i);
        } else {
            mode = View.MeasureSpec.getMode(i2);
        }
        if (mode != 1073741824 && z) {
            z2 = true;
        }
        int i3 = 0;
        if (Bqz != 1) {
            i3 = View.MeasureSpec.getSize(i);
            size = !z2 ? View.MeasureSpec.getSize(i2) : this.A16 != null ? this.A16.A00 : 0;
        } else {
            size = View.MeasureSpec.getSize(i2);
            if (!z2) {
                i3 = View.MeasureSpec.getSize(i);
            } else if (this.A16 != null) {
                i3 = this.A16.A01;
            }
        }
        obj.A01 = i3;
        obj.A00 = size;
        return obj;
    }

    public static String A05(ViewParent viewParent, List list) {
        if (viewParent == null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                Object obj = list.get(size);
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append("  ");
                }
                sb.append(obj);
                sb.append("\n");
                i++;
            }
            return sb.toString();
        }
        list.add(viewParent);
        return A05(viewParent.getParent(), list);
    }

    private void A06(int i) {
        if (this.A0o) {
            List list = this.A0i;
            if (!list.isEmpty() && list.size() != i) {
                throw new UnsupportedOperationException("Circular lists do not support insert operation");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A07(RecyclerView recyclerView, C2Z5 c2z5) {
        if (recyclerView instanceof InterfaceC170737jQ) {
            C170507j3 c170507j3 = c2z5.A0U;
            C169657hf c169657hf = (C169657hf) ((InterfaceC170737jQ) recyclerView);
            List list = c169657hf.A01;
            if (list != null) {
                list.remove(c170507j3);
            }
            for (Object obj : c2z5.A0g) {
                List list2 = c169657hf.A01;
                if (list2 != null) {
                    list2.remove(obj);
                }
            }
            return;
        }
        if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(c2z5.A0P);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r10.A01 < r6.size()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r1 != (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(X.C2Vj r11, int r12, int r13) {
        /*
            r10 = this;
            X.1LL r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r3 = r0.isTracing()
            if (r3 == 0) goto Le
            java.lang.String r0 = "fillListViewport"
            com.facebook.litho.ComponentsSystrace.A02(r0)
        Le:
            r4 = r10
            boolean r0 = r10.A0r
            if (r0 == 0) goto L58
            r1 = 0
        L14:
            r7 = r1
        L15:
            java.util.List r6 = r10.A0i
            r5 = r11
            r8 = r12
            r9 = r13
            r4.A0g(r5, r6, r7, r8, r9)
            X.2Vj r0 = r10.A16
            if (r0 == 0) goto L26
            int r1 = r10.A04
            r0 = -1
            if (r1 != r0) goto L43
        L26:
            boolean r0 = r10.A0n
            if (r0 != 0) goto L43
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L49
            boolean r0 = r10.A0q
            int r2 = A02(r6, r0)
            int r1 = r10.A01
            int r0 = r6.size()
            if (r1 >= r0) goto L43
        L3e:
            if (r2 < 0) goto L43
            A0Q(r10, r6, r12, r13, r2)
        L43:
            if (r3 == 0) goto L48
            com.facebook.litho.ComponentsSystrace.A01()
        L48:
            return
        L49:
            java.util.List r6 = r10.A0h
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L43
            boolean r0 = r10.A0q
            int r2 = A02(r6, r0)
            goto L3e
        L58:
            X.7iy r0 = r10.A0T
            int r1 = r0.AVR()
            r0 = -1
            r7 = 0
            if (r1 == r0) goto L15
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Z5.A08(X.2Vj, int, int):void");
    }

    private void A09(C124005jE c124005jE) {
        int A01 = A01(this.A0A, c124005jE, this, this.A06);
        int A00 = A00(this.A0A, c124005jE, this, this.A05);
        if (c124005jE.A0A(A01, A00)) {
            if (c124005jE.A08()) {
                ComponentTree A012 = c124005jE.A01();
                if (A012.A0j != null) {
                    A012.A0j = null;
                    return;
                }
                return;
            }
            return;
        }
        c124005jE.A06(this.A0R, null, A01, A00);
    }

    private void A0D(C170947jl c170947jl) {
        Iterator it = c170947jl.A03.iterator();
        while (it.hasNext()) {
            XNH xnh = (XNH) it.next();
            if (xnh instanceof XNG) {
                A09(((XNG) xnh).A01);
            }
        }
    }

    public static void A0F(XNH xnh, C2Z5 c2z5) {
        C170947jl c170947jl = c2z5.A0B;
        if (c170947jl == null) {
            c170947jl = new C170947jl(c2z5.A00);
            c2z5.A0B = c170947jl;
        }
        c170947jl.A03.add(xnh);
    }

    public static void A0H(C2Z5 c2z5) {
        if (c2z5.A0o && !c2z5.A0i.isEmpty()) {
            throw new UnsupportedOperationException("Circular lists do not support insert operation");
        }
    }

    public static void A0I(C2Z5 c2z5) {
        if (C2V3.isEndToEndTestRun) {
            long id = Thread.currentThread().getId();
            long andSet = c2z5.A0k.getAndSet(id);
            if (id != andSet && andSet != -1) {
                throw new IllegalStateException(AnonymousClass001.A0t("Multiple threads applying change sets at once! (", " and ", ")", andSet, id));
            }
        }
    }

    public static void A0K(C2Z5 c2z5) {
        RecyclerView recyclerView = c2z5.A08;
        if (recyclerView != null && c2z5.A0Y.A02()) {
            Runnable runnable = c2z5.A0d;
            recyclerView.removeCallbacks(runnable);
            c2z5.A08.postOnAnimation(runnable);
        }
        A0P(c2z5, c2z5.A0W, c2z5.A01, c2z5.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r3.A00 == r2.A00) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.2Vj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0L(X.C2Z5 r4) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A12
            boolean r0 = r0.get()
            if (r0 == 0) goto L48
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A13
            boolean r0 = r0.get()
            if (r0 != 0) goto L14
            boolean r0 = r4.A0r
            if (r0 == 0) goto L49
        L14:
            X.2Vj r1 = r4.A0A
            int r0 = r1.A01
            if (r0 == 0) goto L41
            int r0 = r1.A00
            if (r0 == 0) goto L41
            int r2 = r4.A06
            int r1 = r4.A05
            r0 = 1
            X.2Vj r0 = r4.A03(r2, r1, r0)
            X.2Vj r3 = new X.2Vj
            r3.<init>()
            int r1 = r0.A01
            int r0 = r0.A00
            r4.A08(r3, r1, r0)
            int r1 = r3.A01
            X.2Vj r2 = r4.A0A
            int r0 = r2.A01
            if (r1 != r0) goto L41
            int r1 = r3.A00
            int r0 = r2.A00
            if (r1 == r0) goto L44
        L41:
            A0M(r4)
        L44:
            boolean r0 = r4.A0r
            if (r0 != 0) goto L49
        L48:
            return
        L49:
            X.2Vj r0 = r4.A16
            if (r0 == 0) goto L52
            int r1 = r4.A04
            r0 = -1
            if (r1 != r0) goto L69
        L52:
            boolean r0 = r4.A0n
            if (r0 != 0) goto L69
            java.util.List r3 = r4.A0i
            boolean r0 = r4.A0q
            int r2 = A02(r3, r0)
            if (r2 < 0) goto L69
            X.2Vj r0 = r4.A0A
            int r1 = r0.A01
            int r0 = r0.A00
            A0Q(r4, r3, r1, r0, r2)
        L69:
            A0K(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Z5.A0L(X.2Z5):void");
    }

    public static void A0M(C2Z5 c2z5) {
        if (AbstractC170667jJ.A00) {
            c2z5.hashCode();
        }
        RecyclerView recyclerView = c2z5.A08;
        Handler handler = c2z5.A0N;
        Runnable runnable = c2z5.A0c;
        handler.removeCallbacks(runnable);
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
            recyclerView.postOnAnimation(runnable);
        } else {
            handler.post(runnable);
        }
    }

    public static void A0O(C2Z5 c2z5, int i, boolean z) {
        int i2;
        int i3 = c2z5.A0t;
        if (i3 == 1) {
            if (z) {
                i = c2z5.A02;
            } else {
                return;
            }
        } else if (i3 != 2 || i != (i2 = c2z5.A02) || c2z5.A01 != i2) {
            return;
        }
        RecyclerView recyclerView = c2z5.A08;
        if (recyclerView == null) {
            c2z5.A01 = i;
        } else {
            recyclerView.A0n(i);
        }
    }

    public static void A0R(InterfaceC170717jO interfaceC170717jO) {
        if (interfaceC170717jO != null) {
        } else {
            throw new RuntimeException("Received null RenderInfo to insert/update!");
        }
    }

    public static void A0S(InterfaceC170717jO interfaceC170717jO, String str, int i, int i2, boolean z) {
        String name;
        if (z) {
            if (i2 >= 0 && i2 <= i) {
                return;
            }
        } else if (i2 >= 0 && i2 < i) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Trying to [");
        sb.append(str);
        sb.append("] while index is out of bounds (index=");
        sb.append(i2);
        sb.append(", size=");
        sb.append(i);
        sb.append("). This likely means data passed to the section had duplicates or a mutable data model. Component involved in the error whose backing data model may have duplicates: ");
        if (interfaceC170717jO == null) {
            name = "NULL";
        } else {
            name = interfaceC170717jO.getName();
        }
        sb.append(name);
        sb.append(". Read more here: https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception");
        String obj = sb.toString();
        C14360o3.A0B(obj, 1);
        throw new RuntimeException(obj, null);
    }

    private boolean A0T() {
        if (this.A12.get() && !this.A13.get()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.2Vj] */
    public final void A0g(C2Vj c2Vj, List list, int i, int i2, int i3) {
        InterfaceC170457iy interfaceC170457iy = this.A0T;
        BDE ANW = interfaceC170457iy.ANW(i2, i3);
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02("computeLayoutsToFillListViewport");
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        ?? obj = new Object();
        for (int i4 = i; ANW.FDv() && i4 < list.size(); i4++) {
            C124005jE c124005jE = (C124005jE) list.get(i4);
            InterfaceC170717jO A02 = c124005jE.A02();
            if (A02.EGz()) {
                break;
            }
            c124005jE.A07(this.A0R, obj, interfaceC170457iy.Ane(A02, makeMeasureSpec), interfaceC170457iy.Anb(A02, makeMeasureSpec2));
            ANW.A7e(A02, obj.A01, obj.A00);
        }
        if (c2Vj != null) {
            int B6K = ANW.B6K();
            if (interfaceC170457iy.Bqz() == 1) {
                c2Vj.A01 = i2;
                c2Vj.A00 = Math.min(B6K, i3);
            } else {
                c2Vj.A01 = Math.min(B6K, i2);
                c2Vj.A00 = i3;
            }
        }
        if (isTracing) {
            ComponentsSystrace.A01();
        }
        list.size();
        if (AbstractC170667jJ.A00) {
            hashCode();
        }
    }

    public final void A0j(Integer num, int i, int i2) {
        int i3;
        AbstractC110824yu c51112MiH;
        if (this.A08 == null) {
            this.A01 = i;
            this.A03 = i2;
            this.A0K = num;
            return;
        }
        Context context = this.A0R.A0C;
        if (num != C05F.A01 && num != C05F.A0C && num != C05F.A0N) {
            if (num == C05F.A0Y) {
                c51112MiH = new C51106MiB(context, i2);
            } else {
                c51112MiH = new C110814yt(context);
            }
        } else {
            switch (num.intValue()) {
                case 1:
                    i3 = 0;
                    break;
                case 2:
                    i3 = -1;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            c51112MiH = new C51112MiH(context, i3, i2);
        }
        c51112MiH.A00 = i;
        this.A08.A0D.A10(c51112MiH);
    }

    public final boolean A0k(int i) {
        if (i >= 0) {
            List list = this.A0i;
            if (i < list.size() && ((C124005jE) list.get(i)).A02().Cdm()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C2Z7
    public final boolean AFm() {
        return this.A0E;
    }

    @Override // X.C2Z6
    public final int AVR() {
        return this.A0T.AVR();
    }

    @Override // X.C2Z6
    public final int AVV() {
        return this.A0T.AVV();
    }

    @Override // X.C2Z7
    public final boolean CgB() {
        return this.A0r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0163, code lost:
    
        if (r17.A0r == false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x012c A[Catch: all -> 0x02d1, TryCatch #0 {, blocks: (B:35:0x00c6, B:37:0x00ce, B:39:0x00d6, B:42:0x00dc, B:44:0x00e0, B:46:0x00ea, B:47:0x026e, B:48:0x0270, B:59:0x0272, B:61:0x027f, B:63:0x0287, B:64:0x028a, B:66:0x0296, B:67:0x029c, B:70:0x029f, B:71:0x02a0, B:74:0x02cf, B:75:0x02d0, B:77:0x02a3, B:79:0x02ad, B:81:0x02b1, B:83:0x02b7, B:85:0x02c9, B:86:0x02bd, B:87:0x0256, B:89:0x025a, B:91:0x0264, B:92:0x00f6, B:94:0x00fe, B:96:0x0137, B:99:0x0140, B:101:0x0144, B:105:0x0168, B:106:0x017b, B:108:0x017f, B:109:0x0193, B:111:0x01a7, B:112:0x01af, B:114:0x01b3, B:116:0x01b7, B:118:0x01bf, B:119:0x01c2, B:120:0x01da, B:122:0x01e2, B:123:0x01eb, B:124:0x01f5, B:126:0x01fd, B:127:0x020e, B:129:0x0214, B:132:0x021e, B:137:0x0226, B:138:0x01c4, B:139:0x01ca, B:141:0x01d0, B:143:0x0240, B:145:0x0244, B:146:0x0247, B:148:0x024c, B:149:0x0236, B:151:0x014d, B:153:0x0151, B:156:0x0174, B:158:0x0159, B:160:0x015d, B:162:0x016c, B:165:0x0171, B:167:0x0105, B:169:0x010d, B:173:0x012c, B:174:0x011c, B:176:0x0124, B:69:0x029d), top: B:34:0x00c6, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027f A[Catch: all -> 0x02d1, TryCatch #0 {, blocks: (B:35:0x00c6, B:37:0x00ce, B:39:0x00d6, B:42:0x00dc, B:44:0x00e0, B:46:0x00ea, B:47:0x026e, B:48:0x0270, B:59:0x0272, B:61:0x027f, B:63:0x0287, B:64:0x028a, B:66:0x0296, B:67:0x029c, B:70:0x029f, B:71:0x02a0, B:74:0x02cf, B:75:0x02d0, B:77:0x02a3, B:79:0x02ad, B:81:0x02b1, B:83:0x02b7, B:85:0x02c9, B:86:0x02bd, B:87:0x0256, B:89:0x025a, B:91:0x0264, B:92:0x00f6, B:94:0x00fe, B:96:0x0137, B:99:0x0140, B:101:0x0144, B:105:0x0168, B:106:0x017b, B:108:0x017f, B:109:0x0193, B:111:0x01a7, B:112:0x01af, B:114:0x01b3, B:116:0x01b7, B:118:0x01bf, B:119:0x01c2, B:120:0x01da, B:122:0x01e2, B:123:0x01eb, B:124:0x01f5, B:126:0x01fd, B:127:0x020e, B:129:0x0214, B:132:0x021e, B:137:0x0226, B:138:0x01c4, B:139:0x01ca, B:141:0x01d0, B:143:0x0240, B:145:0x0244, B:146:0x0247, B:148:0x024c, B:149:0x0236, B:151:0x014d, B:153:0x0151, B:156:0x0174, B:158:0x0159, B:160:0x015d, B:162:0x016c, B:165:0x0171, B:167:0x0105, B:169:0x010d, B:173:0x012c, B:174:0x011c, B:176:0x0124, B:69:0x029d), top: B:34:0x00c6, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0287 A[Catch: all -> 0x02d1, TryCatch #0 {, blocks: (B:35:0x00c6, B:37:0x00ce, B:39:0x00d6, B:42:0x00dc, B:44:0x00e0, B:46:0x00ea, B:47:0x026e, B:48:0x0270, B:59:0x0272, B:61:0x027f, B:63:0x0287, B:64:0x028a, B:66:0x0296, B:67:0x029c, B:70:0x029f, B:71:0x02a0, B:74:0x02cf, B:75:0x02d0, B:77:0x02a3, B:79:0x02ad, B:81:0x02b1, B:83:0x02b7, B:85:0x02c9, B:86:0x02bd, B:87:0x0256, B:89:0x025a, B:91:0x0264, B:92:0x00f6, B:94:0x00fe, B:96:0x0137, B:99:0x0140, B:101:0x0144, B:105:0x0168, B:106:0x017b, B:108:0x017f, B:109:0x0193, B:111:0x01a7, B:112:0x01af, B:114:0x01b3, B:116:0x01b7, B:118:0x01bf, B:119:0x01c2, B:120:0x01da, B:122:0x01e2, B:123:0x01eb, B:124:0x01f5, B:126:0x01fd, B:127:0x020e, B:129:0x0214, B:132:0x021e, B:137:0x0226, B:138:0x01c4, B:139:0x01ca, B:141:0x01d0, B:143:0x0240, B:145:0x0244, B:146:0x0247, B:148:0x024c, B:149:0x0236, B:151:0x014d, B:153:0x0151, B:156:0x0174, B:158:0x0159, B:160:0x015d, B:162:0x016c, B:165:0x0171, B:167:0x0105, B:169:0x010d, B:173:0x012c, B:174:0x011c, B:176:0x0124, B:69:0x029d), top: B:34:0x00c6, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0296 A[Catch: all -> 0x02d1, TryCatch #0 {, blocks: (B:35:0x00c6, B:37:0x00ce, B:39:0x00d6, B:42:0x00dc, B:44:0x00e0, B:46:0x00ea, B:47:0x026e, B:48:0x0270, B:59:0x0272, B:61:0x027f, B:63:0x0287, B:64:0x028a, B:66:0x0296, B:67:0x029c, B:70:0x029f, B:71:0x02a0, B:74:0x02cf, B:75:0x02d0, B:77:0x02a3, B:79:0x02ad, B:81:0x02b1, B:83:0x02b7, B:85:0x02c9, B:86:0x02bd, B:87:0x0256, B:89:0x025a, B:91:0x0264, B:92:0x00f6, B:94:0x00fe, B:96:0x0137, B:99:0x0140, B:101:0x0144, B:105:0x0168, B:106:0x017b, B:108:0x017f, B:109:0x0193, B:111:0x01a7, B:112:0x01af, B:114:0x01b3, B:116:0x01b7, B:118:0x01bf, B:119:0x01c2, B:120:0x01da, B:122:0x01e2, B:123:0x01eb, B:124:0x01f5, B:126:0x01fd, B:127:0x020e, B:129:0x0214, B:132:0x021e, B:137:0x0226, B:138:0x01c4, B:139:0x01ca, B:141:0x01d0, B:143:0x0240, B:145:0x0244, B:146:0x0247, B:148:0x024c, B:149:0x0236, B:151:0x014d, B:153:0x0151, B:156:0x0174, B:158:0x0159, B:160:0x015d, B:162:0x016c, B:165:0x0171, B:167:0x0105, B:169:0x010d, B:173:0x012c, B:174:0x011c, B:176:0x0124, B:69:0x029d), top: B:34:0x00c6, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c9 A[Catch: all -> 0x02d1, TryCatch #0 {, blocks: (B:35:0x00c6, B:37:0x00ce, B:39:0x00d6, B:42:0x00dc, B:44:0x00e0, B:46:0x00ea, B:47:0x026e, B:48:0x0270, B:59:0x0272, B:61:0x027f, B:63:0x0287, B:64:0x028a, B:66:0x0296, B:67:0x029c, B:70:0x029f, B:71:0x02a0, B:74:0x02cf, B:75:0x02d0, B:77:0x02a3, B:79:0x02ad, B:81:0x02b1, B:83:0x02b7, B:85:0x02c9, B:86:0x02bd, B:87:0x0256, B:89:0x025a, B:91:0x0264, B:92:0x00f6, B:94:0x00fe, B:96:0x0137, B:99:0x0140, B:101:0x0144, B:105:0x0168, B:106:0x017b, B:108:0x017f, B:109:0x0193, B:111:0x01a7, B:112:0x01af, B:114:0x01b3, B:116:0x01b7, B:118:0x01bf, B:119:0x01c2, B:120:0x01da, B:122:0x01e2, B:123:0x01eb, B:124:0x01f5, B:126:0x01fd, B:127:0x020e, B:129:0x0214, B:132:0x021e, B:137:0x0226, B:138:0x01c4, B:139:0x01ca, B:141:0x01d0, B:143:0x0240, B:145:0x0244, B:146:0x0247, B:148:0x024c, B:149:0x0236, B:151:0x014d, B:153:0x0151, B:156:0x0174, B:158:0x0159, B:160:0x015d, B:162:0x016c, B:165:0x0171, B:167:0x0105, B:169:0x010d, B:173:0x012c, B:174:0x011c, B:176:0x0124, B:69:0x029d), top: B:34:0x00c6, outer: #1, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.2Vj] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, X.2Vj] */
    @Override // X.C2Z7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CpB(X.C2V9 r18, X.C2Vj r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Z5.CpB(X.2V9, X.2Vj, int, int):void");
    }

    @Override // X.C2Z7
    public final void detach() {
        ArrayList arrayList;
        if (this.A0v == null) {
            if (C2XV.A01()) {
                List list = this.A0i;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C124005jE) list.get(i)).A04();
                }
                return;
            }
            synchronized (this) {
                arrayList = new ArrayList(this.A0i);
            }
            this.A0N.post(new C9IL(arrayList));
        }
    }

    @Override // X.C2Z6
    public final int getItemCount() {
        return this.A0Q.getItemCount();
    }

    public static int A01(C2Vj c2Vj, C124005jE c124005jE, C2Z5 c2z5, int i) {
        if (c2z5.A0T()) {
            float BbT = c124005jE.A02().BbT();
            if (BbT >= 0.0f && BbT <= 100.0f) {
                return View.MeasureSpec.makeMeasureSpec(C2WL.A00((c2Vj.A01 * c124005jE.A02().BbT()) / 100.0f), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            }
            return c2z5.A0T.Ane(c124005jE.A02(), View.MeasureSpec.makeMeasureSpec(c2Vj.A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        }
        return c2z5.A0T.Ane(c124005jE.A02(), i);
    }

    public static void A0A(C124005jE c124005jE) {
        if (A0U(c124005jE) && c124005jE.A01() != null && c124005jE.A01().A07 == null) {
            c124005jE.A03();
        }
    }

    public static void A0B(final C124005jE c124005jE, C2Z5 c2z5) {
        if (C2XV.A01()) {
            A0A(c124005jE);
            return;
        }
        if (C2V3.defaultInstance.A0K) {
            synchronized (c2z5.A0Z) {
                c2z5.A0D.addLast(c124005jE);
                if (!c2z5.A0G) {
                    c2z5.A0N.post(c2z5.A0b);
                    c2z5.A0G = true;
                }
            }
            return;
        }
        c2z5.A0N.post(new Runnable() { // from class: X.ApV
            @Override // java.lang.Runnable
            public final void run() {
                C2Z5.A0A(C124005jE.this);
            }
        });
    }

    public static void A0E(XNG xng, C2Z5 c2z5) {
        A0F(xng, c2z5);
        C124005jE c124005jE = xng.A01;
        C170547j7 c170547j7 = c2z5.A0y;
        synchronized (c124005jE) {
            ComponentTree componentTree = c124005jE.A01;
            if (componentTree != null) {
                componentTree.A0j = c170547j7;
            } else {
                c124005jE.A03 = c170547j7;
            }
        }
        if (c2z5.A0T()) {
            if (C2V3.enableComputeLayoutAsyncAfterInsertion || c2z5.A00 == 1) {
                c2z5.A09(c124005jE);
            }
        }
    }

    public static void A0G(final C170267if c170267if, final C2Z5 c2z5) {
        C2Vj c2Vj;
        int i;
        int i2;
        final C124005jE next = c170267if.next();
        if (!c2z5.A0i.isEmpty() && next != null && c2z5.A04 == -1) {
            synchronized (c2z5) {
                c2Vj = c2z5.A0A;
                i = c2z5.A06;
                i2 = c2z5.A05;
            }
            int A01 = A01(c2Vj, next, c2z5, i);
            int A00 = A00(c2Vj, next, c2z5, i2);
            if (!next.A0A(A01, A00)) {
                next.A06(c2z5.A0R, new InterfaceC170287ih() { // from class: X.7ig
                    @Override // X.InterfaceC170287ih
                    public final void Dl3(int i3, int i4, int i5, boolean z) {
                        C2Z5.A0G(c170267if, c2z5);
                        C124005jE c124005jE = next;
                        synchronized (c124005jE) {
                            ComponentTree componentTree = c124005jE.A01;
                            if (componentTree != null) {
                                synchronized (componentTree) {
                                    List list = componentTree.A0E;
                                    if (list != null) {
                                        list.remove(this);
                                    }
                                }
                            }
                        }
                    }
                }, A01, A00);
            }
        }
    }

    public static void A0J(final C2Z5 c2z5) {
        final boolean z;
        C2XV.A00();
        Deque deque = c2z5.A0f;
        if (!deque.isEmpty() && c2z5.A0L) {
            RecyclerView recyclerView = c2z5.A08;
            if (recyclerView != null) {
                if (recyclerView.A1C() && recyclerView.A0T && recyclerView.getWindowVisibility() == 0) {
                    Object obj = recyclerView;
                    while (true) {
                        if (obj instanceof View) {
                            View view = (View) obj;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            } else {
                                obj = view.getParent();
                            }
                        } else {
                            Rect rect = A18;
                            if (recyclerView.getGlobalVisibleRect(rect)) {
                                if (deque.size() > 20) {
                                    deque.clear();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("recyclerView: ");
                                    sb.append(recyclerView);
                                    sb.append(", hasPendingAdapterUpdates(): ");
                                    sb.append(recyclerView.A1C());
                                    sb.append(", isAttachedToWindow(): ");
                                    Object obj2 = recyclerView;
                                    sb.append(recyclerView.A0T);
                                    sb.append(", getWindowVisibility(): ");
                                    sb.append(recyclerView.getWindowVisibility());
                                    sb.append(", vie visible hierarchy: ");
                                    ArrayList arrayList = new ArrayList();
                                    while (obj2 instanceof View) {
                                        View view2 = (View) obj2;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("view=");
                                        sb2.append(view2.getClass().getSimpleName());
                                        sb2.append(", alpha=");
                                        sb2.append(view2.getAlpha());
                                        sb2.append(", visibility=");
                                        sb2.append(view2.getVisibility());
                                        arrayList.add(sb2.toString());
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        } else {
                                            obj2 = view2.getParent();
                                        }
                                    }
                                    sb.append(arrayList);
                                    sb.append(", getGlobalVisibleRect(): ");
                                    sb.append(recyclerView.getGlobalVisibleRect(rect));
                                    sb.append(", isComputingLayout(): ");
                                    sb.append(recyclerView.A1D());
                                    sb.append(", isSubAdapter: ");
                                    sb.append(false);
                                    sb.append(", visible range: [");
                                    sb.append(c2z5.A01);
                                    sb.append(", ");
                                    sb.append(c2z5.A02);
                                    sb.append("]");
                                    Integer num = C05F.A01;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("@OnDataRendered callbacks aren't triggered as expected: ");
                                    sb3.append((Object) sb);
                                    C2YE.A00("RecyclerBinder:DataRenderedNotTriggered", num, sb3.toString());
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                z = true;
            } else {
                z = false;
            }
            final ArrayDeque arrayDeque = new ArrayDeque(deque);
            deque.clear();
            c2z5.A0N.postAtFrontOfQueue(new Runnable() { // from class: X.7jc
                @Override // java.lang.Runnable
                public final void run() {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    while (true) {
                        Deque deque2 = arrayDeque;
                        if (!deque2.isEmpty()) {
                            ((InterfaceC170847jb) deque2.pollFirst()).D9I(z, uptimeMillis);
                        } else {
                            return;
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0179, code lost:
    
        if (r13 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017b, code lost:
    
        A0L(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0193, code lost:
    
        throw new java.lang.NullPointerException("mPosition");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0N(final X.C2Z5 r15, final int r16) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Z5.A0N(X.2Z5, int):void");
    }

    public static boolean A0U(C124005jE c124005jE) {
        if (c124005jE.A09()) {
            Object AvD = c124005jE.A04.AvD("prevent_release");
            if ((!(AvD instanceof Boolean) || !((Boolean) AvD).booleanValue()) && !c124005jE.A02().Cdm() && c124005jE.A01() != null) {
                return true;
            }
        }
        return false;
    }

    public final void A0W(int i) {
        final C124005jE c124005jE;
        C2XV.A00();
        A06(1);
        if (AbstractC170667jJ.A00) {
            hashCode();
        }
        synchronized (this) {
            List list = this.A0i;
            A0S(null, "removeItemAt", list.size(), i, false);
            c124005jE = (C124005jE) list.remove(i);
        }
        this.A0Q.notifyItemRemoved(i);
        C170647jH c170647jH = this.A0Y;
        boolean z = true;
        if (!c170647jH.A02() && i > c170647jH.A01) {
            z = false;
        }
        c170647jH.A01(z);
        if (c124005jE != null && !C2V3.disableReleaseComponentTreeInRecyclerBinder) {
            if (C2V3.enableFixForDisappearTransitionInRecyclerBinder) {
                c124005jE.A05();
            } else {
                this.A0N.post(new Runnable() { // from class: X.ApU
                    @Override // java.lang.Runnable
                    public final void run() {
                        C124005jE.this.A04();
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r5 > r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9 > ((r2 + r4) - 1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r8 > ((r2 + r4) - 1)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0X(int r8, int r9) {
        /*
            r7 = this;
            X.C2XV.A00()
            boolean r0 = X.AbstractC170667jJ.A00
            if (r0 == 0) goto La
            r7.hashCode()
        La:
            monitor-enter(r7)
            java.lang.String r4 = "moveItemFrom"
            java.util.List r3 = r7.A0i     // Catch: java.lang.Throwable -> L88
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L88
            r0 = 0
            r2 = 0
            A0S(r2, r4, r1, r8, r0)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r4 = r3.remove(r8)     // Catch: java.lang.Throwable -> L88
            X.5jE r4 = (X.C124005jE) r4     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "moveItemTo"
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L88
            r6 = 1
            A0S(r2, r1, r0, r9, r6)     // Catch: java.lang.Throwable -> L88
            r3.add(r9, r4)     // Catch: java.lang.Throwable -> L88
            int r1 = r7.A04     // Catch: java.lang.Throwable -> L88
            r2 = -1
            if (r1 == r2) goto L48
            float r5 = (float) r9     // Catch: java.lang.Throwable -> L88
            int r0 = r7.A01     // Catch: java.lang.Throwable -> L88
            float r3 = (float) r0     // Catch: java.lang.Throwable -> L88
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L88
            float r0 = r7.A0M     // Catch: java.lang.Throwable -> L88
            float r1 = r1 * r0
            float r3 = r3 - r1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L48
            int r0 = r7.A02     // Catch: java.lang.Throwable -> L88
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L88
            float r0 = r0 + r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L49
        L48:
            r1 = 0
        L49:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L88
            boolean r0 = r4.A09()
            if (r0 == 0) goto L55
            if (r1 != 0) goto L55
            r4.A03()
        L55:
            X.2UU r0 = r7.A0Q
            r0.notifyItemMoved(r8, r9)
            X.7jH r5 = r7.A0Y
            int r1 = r7.A02
            int r0 = r7.A01
            int r1 = r1 - r0
            int r4 = r1 + 1
            boolean r0 = r5.A02()
            r3 = 1
            if (r0 != 0) goto L84
            if (r4 == r2) goto L84
            int r2 = r5.A00
            if (r9 < r2) goto L76
            int r0 = r2 + r4
            int r0 = r0 - r6
            r1 = 1
            if (r9 <= r0) goto L77
        L76:
            r1 = 0
        L77:
            if (r8 < r2) goto L7e
            int r2 = r2 + r4
            int r2 = r2 - r6
            r0 = 1
            if (r8 <= r2) goto L7f
        L7e:
            r0 = 0
        L7f:
            if (r1 != 0) goto L84
            if (r0 != 0) goto L84
            r3 = 0
        L84:
            r5.A01(r3)
            return
        L88:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L88
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Z5.A0X(int, int):void");
    }

    public final void A0Y(int i, int i2) {
        A0I(this);
        if (AbstractC170667jJ.A00) {
            hashCode();
        }
        C72192XVi c72192XVi = new C72192XVi(i, i2);
        synchronized (this) {
            this.A17 = true;
            List list = this.A0h;
            list.add(i2, (C124005jE) list.remove(i));
            A0F(c72192XVi, this);
        }
    }

    public final void A0Z(int i, int i2) {
        C2XV.A00();
        A06(i2);
        if (AbstractC170667jJ.A00) {
            hashCode();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                List list = this.A0i;
                A0S(null, "removeRangeAt", list.size(), i, false);
                arrayList.add((C124005jE) list.remove(i));
            }
        }
        this.A0Q.notifyItemRangeRemoved(i, i2);
        C170647jH c170647jH = this.A0Y;
        boolean z = true;
        if (!c170647jH.A02() && i > c170647jH.A01) {
            z = false;
        }
        c170647jH.A01(z);
        if (!C2V3.disableReleaseComponentTreeInRecyclerBinder) {
            if (C2V3.enableFixForDisappearTransitionInRecyclerBinder) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C124005jE) arrayList.get(i4)).A05();
                }
                return;
            }
            this.A0N.post(new C9IL(arrayList));
        }
    }

    public final void A0a(int i, int i2) {
        A0I(this);
        A06(i2);
        if (AbstractC170667jJ.A00) {
            hashCode();
        }
        XNJ xnj = new XNJ(i, i2);
        synchronized (this) {
            this.A17 = true;
            for (int i3 = 0; i3 < i2; i3++) {
                List list = this.A0h;
                A0S(null, "removeRangeAtAsync", list.size(), i, false);
                list.remove(i);
            }
            A0F(xnj, this);
        }
    }

    public final void A0b(int i, List list) {
        A0I(this);
        A0H(this);
        if (AbstractC170667jJ.A00) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((InterfaceC170717jO) list.get(i2)).getName();
            }
            hashCode();
            list.size();
            Arrays.toString(strArr);
        }
        synchronized (this) {
            this.A17 = true;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC170717jO interfaceC170717jO = (InterfaceC170717jO) list.get(i3);
                List list2 = this.A0h;
                int i4 = i + i3;
                A0S(interfaceC170717jO, "insertRangeAtAsync", list2.size(), i4, true);
                A0R(interfaceC170717jO);
                C124005jE A04 = A04(this, interfaceC170717jO);
                synchronized (A04) {
                    A04.A05 = false;
                }
                XNG xng = new XNG(A04, i4);
                list2.add(i4, xng.A01);
                A0E(xng, this);
            }
        }
    }

    public final void A0c(int i, List list) {
        C2XV.A00();
        if (AbstractC170667jJ.A00) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((InterfaceC170717jO) list.get(i2)).getName();
            }
            hashCode();
            list.size();
            Arrays.toString(strArr);
        }
        synchronized (this) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC170717jO interfaceC170717jO = (InterfaceC170717jO) list.get(i3);
                int i4 = i + i3;
                List list2 = this.A0i;
                A0S(interfaceC170717jO, "updateRangeAt", list2.size(), i4, false);
                C124005jE c124005jE = (C124005jE) list2.get(i4);
                A0R(interfaceC170717jO);
                if (interfaceC170717jO.EGz() || c124005jE.A02().EGz()) {
                    this.A0Q.notifyItemChanged(i4);
                }
                this.A0X.A00(interfaceC170717jO);
                A0C(c124005jE, interfaceC170717jO);
            }
        }
        C170647jH c170647jH = this.A0Y;
        int size2 = list.size();
        boolean z = true;
        if (!c170647jH.A02()) {
            int i5 = i;
            while (true) {
                if (i5 < i + size2) {
                    if (c170647jH.A00 <= i5 && i5 <= c170647jH.A01) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        c170647jH.A01(z);
    }

    public final void A0d(int i, List list) {
        A0I(this);
        if (AbstractC170667jJ.A00) {
            hashCode();
            list.size();
        }
        synchronized (this) {
            A0F(new XNL(i, list), this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e5, code lost:
    
        if (r3 != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2Z7
    /* renamed from: A0e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cpr(androidx.recyclerview.widget.RecyclerView r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Z5.Cpr(androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // X.C2Z7
    /* renamed from: A0f, reason: merged with bridge method [inline-methods] */
    public final void F9H(RecyclerView recyclerView) {
        int i;
        boolean z;
        int A0W;
        int Bax;
        C2XV.A00();
        InterfaceC170457iy interfaceC170457iy = this.A0T;
        AbstractC70663Fe BMW = interfaceC170457iy.BMW();
        View A0d = BMW.A0d(this.A01);
        if (A0d != null) {
            AbstractC70663Fe BMW2 = interfaceC170457iy.BMW();
            if (BMW2 instanceof LinearLayoutManager) {
                z = ((LinearLayoutManager) BMW2).A08;
            } else {
                z = false;
            }
            if (interfaceC170457iy.Bqz() == 0) {
                if (z) {
                    A0W = recyclerView.getWidth() - BMW.Baw();
                    Bax = A0d.getRight() + AbstractC70663Fe.A0D(A0d);
                } else {
                    A0W = A0d.getLeft() - AbstractC70663Fe.A0B(A0d);
                    Bax = BMW.Bau();
                }
            } else if (z) {
                A0W = recyclerView.getHeight() - BMW.Bat();
                Bax = BMW.A0V(A0d);
            } else {
                A0W = BMW.A0W(A0d);
                Bax = BMW.Bax();
            }
            i = A0W - Bax;
        } else {
            i = 0;
        }
        this.A03 = i;
        C170647jH c170647jH = this.A0Y;
        recyclerView.A15(c170647jH.A06);
        A07(recyclerView, this);
        A0J(this);
        recyclerView.setAdapter(null);
        recyclerView.setLayoutManager(null);
        InterfaceC170577jA interfaceC170577jA = this.A10;
        if (interfaceC170577jA != null) {
            synchronized (c170647jH) {
                List list = c170647jH.A07;
                if (!list.isEmpty()) {
                    list.remove(interfaceC170577jA);
                }
            }
        }
        if (this.A08 == recyclerView) {
            this.A08 = null;
            C169687hi c169687hi = this.A0C;
            if (c169687hi != null) {
                C2Z8 c2z8 = c169687hi.A01;
                if (c2z8 != null) {
                    c2z8.A04.A15(c169687hi);
                    c169687hi.A00 = null;
                    c169687hi.A01 = null;
                } else {
                    throw new IllegalStateException("SectionsRecyclerView has not been set yet.");
                }
            }
            interfaceC170457iy.EcZ(null);
        }
    }

    public final void A0i(InterfaceC170717jO interfaceC170717jO, int i) {
        boolean EGz;
        C2XV.A00();
        if (AbstractC170667jJ.A00) {
            hashCode();
            interfaceC170717jO.getName();
        }
        synchronized (this) {
            List list = this.A0i;
            A0S(interfaceC170717jO, "updateItemAt", list.size(), i, false);
            C124005jE c124005jE = (C124005jE) list.get(i);
            EGz = c124005jE.A02().EGz();
            A0R(interfaceC170717jO);
            this.A0X.A00(interfaceC170717jO);
            A0C(c124005jE, interfaceC170717jO);
        }
        if (EGz || interfaceC170717jO.EGz()) {
            this.A0Q.notifyItemChanged(i);
        }
        C170647jH c170647jH = this.A0Y;
        boolean z = true;
        if (!c170647jH.A02()) {
            int i2 = i;
            while (true) {
                if (i2 < i + 1) {
                    if (c170647jH.A00 <= i2 && i2 <= c170647jH.A01) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        c170647jH.A01(z);
    }

    @Override // X.C2Z6
    public final int AVQ() {
        throw C00O.createAndThrow();
    }

    @Override // X.C2Z6
    public final int AVU() {
        throw C00O.createAndThrow();
    }
}
