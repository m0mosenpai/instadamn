package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.facebook.systrace.Systrace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Deprecated;

/* renamed from: X.5Lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115825Lw extends AbstractC115835Lx implements InterfaceC115855Lz, C5M4 {
    public int A00;
    public Animator.AnimatorListener A01;
    public Pair A02;
    public CQ3 A03;
    public InterfaceC31148Dmr A04;
    public C6PT A05;
    public C6PU A06;
    public ListenableFuture A07;
    public Object A08;
    public C9C9 A09;
    public InterfaceC138736Qd A0A;
    public XP4 A0B;
    public C69615VsI A0C;
    public String A0D;
    public String A0E;
    public final SparseArray A0F;
    public final C130015u6 A0G;
    public final C64X A0H;
    public final C64Z A0I;
    public final C129905tv A0J;
    public final C130005u5 A0K;
    public final C129965u1 A0L;
    public final C129975u2 A0M;
    public final Map A0N;
    public final Map A0O;
    public final Stack A0P;
    public final C129955u0 A0Q;
    public final Executor A0R;

    public void A01() {
    }

    public void A04(C6PT c6pt, C66199U3p c66199U3p) {
        InterfaceC58682mR keyframesAnimatable;
        InterfaceC58682mR keyframesAnimatable2;
        C129905tv c129905tv = this.A0J;
        setKeyframes(c129905tv, c66199U3p.A00, c66199U3p.A02, this, this);
        this.A02 = new Pair(this.A05, c66199U3p);
        Animator.AnimatorListener animatorListener = this.A01;
        if (animatorListener != null && (keyframesAnimatable2 = c129905tv.getKeyframesAnimatable()) != null) {
            keyframesAnimatable2.A8x(animatorListener);
        }
        this.A05 = c6pt;
        A03(c6pt);
        int i = this.A00;
        InterfaceC58682mR keyframesAnimatable3 = c129905tv.getKeyframesAnimatable();
        if (keyframesAnimatable3 != null) {
            keyframesAnimatable3.EH0(i);
        }
        if (this.A0H.Ej7() && (keyframesAnimatable = c129905tv.getKeyframesAnimatable()) != null) {
            if (keyframesAnimatable.BiI() != 0.0f) {
                keyframesAnimatable.EMk(0.0f);
            }
            keyframesAnimatable.E4S();
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.5u4, java.lang.Object] */
    @Override // X.C5M1
    public final void AUw(C5M0 c5m0, C6PT c6pt, WY2 wy2, C5M2 c5m2, String str, Map map) {
        ?? obj = new Object();
        C9C9 c9c9 = this.A09;
        if (c9c9 == null) {
            C14360o3.A0F("integrationPoint");
            throw C00O.createAndThrow();
        }
        C65750TtP A00 = obj.A00(this.A0A, c6pt, c9c9.A01, null, str, true);
        C6PU A02 = ((C6VU) getDrawableProvider().A00).A02(A00, false);
        try {
            ListenableFuture AUu = getDrawableProvider().AUu(new C9CK(A00.A00, A02.A00.A05, A00.A08, A00.A05), XP9.A01, A02);
            C2OD.A03(new C70563Wcx(c5m0, wy2, c5m2, this), AUu, this.A0R);
            this.A07 = AUu;
        } catch (C129895tu e) {
            DEB(c6pt, e);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.5u4, java.lang.Object] */
    @Override // X.C5M1
    public final void AV8(InterfaceC138736Qd interfaceC138736Qd, C6PT c6pt, String str, boolean z) {
        C14360o3.A0B(c6pt, 0);
        ?? obj = new Object();
        C9C9 c9c9 = this.A09;
        if (c9c9 == null) {
            C14360o3.A0F("integrationPoint");
            throw C00O.createAndThrow();
        }
        C65750TtP A01 = obj.A01(interfaceC138736Qd, c6pt, c9c9.A01, str, z);
        try {
            C6VU c6vu = (C6VU) getDrawableProvider().A00;
            boolean z2 = false;
            if (!z) {
                z2 = true;
            }
            C6PU A02 = c6vu.A02(A01, z2);
            U3W.A00();
            boolean CWq = this.A0H.CWq();
            XP4 drawableProvider = getDrawableProvider();
            String str2 = A02.A00.A05;
            String str3 = A01.A08;
            C43658JSq c43658JSq = A01.A00;
            String str4 = A01.A05;
            ListenableFuture AUu = drawableProvider.AUu(new C9CK(c43658JSq, str2, str3, str4), XP9.A01, A02);
            C2OD.A03(new C25632BUu(c6pt, this, CWq, z), AUu, this.A0R);
            if (z) {
                this.A07 = AUu;
                this.A06 = A02;
                if (str4 == null) {
                    str4 = "";
                }
                this.A0E = str4;
            }
        } catch (C129895tu e) {
            String A0R = AnonymousClass001.A0R("fetchDrawableFailed: ", e.getLocalizedMessage());
            C14360o3.A0B(A0R, 1);
            C0K8.A0O("BaseShowreelMediaView", "%s: %s", A0R, "BaseShowreelMediaView");
            C0w9.A03("BaseShowreelMediaView", A0R);
            DEB(c6pt, e);
        }
    }

    @Override // X.C5M0
    public final boolean DK0(PointF pointF, RectF rectF, C206409Bx c206409Bx, Integer num) {
        InterfaceC31148Dmr interfaceC31148Dmr;
        C14360o3.A0B(num, 3);
        if ("more".equals(c206409Bx.A01) && (interfaceC31148Dmr = this.A04) != null) {
            interfaceC31148Dmr.DmA();
            return true;
        }
        C69615VsI c69615VsI = new C69615VsI(pointF, rectF, c206409Bx, this, num);
        this.A0C = c69615VsI;
        c69615VsI.A00();
        return true;
    }

    @Override // X.C5M3
    public final void EWr(C5M0 c5m0, C66198U3o c66198U3o, C5M2 c5m2, Map map, boolean z, boolean z2) {
        setKeyframes(this.A0J, c66198U3o, map, c5m0, c5m2);
    }

    public final void setAudioDataSource(Object obj) {
        C14360o3.A0B(obj, 0);
    }

    public void setKeyframes(C5M3 c5m3, C66198U3o c66198U3o, Map map, C5M0 c5m0, C5M2 c5m2) {
        C5M2 c5m22 = c5m2;
        C5M0 c5m02 = c5m0;
        C14360o3.A0B(c5m3, 0);
        C14360o3.A0B(c66198U3o, 1);
        C14360o3.A0B(map, 2);
        if (c5m0 == null) {
            c5m02 = C5M0.A01;
        }
        if (c5m2 == null) {
            c5m22 = W12.A00;
        }
        C64X c64x = this.A0H;
        c5m3.EWr(c5m02, c66198U3o, c5m22, map, c64x.Cah(), c64x.Cai());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5u1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.5u1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.5u4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.5u3, java.lang.Object] */
    public AbstractC115825Lw(Context context, AttributeSet attributeSet, C9C9 c9c9, C64X c64x, C64Z c64z, Executor executor, int i) {
        super(context, attributeSet, i);
        boolean A0E;
        C64X c64x2 = c64x;
        C64Z c64z2 = c64z;
        C14360o3.A0B(executor, 8);
        this.A0R = executor;
        if (c64z == null) {
            c64z2 = C64Y.A00;
            C14360o3.A07(c64z2);
        }
        this.A0I = c64z2;
        this.A0J = new C129905tv(context);
        this.A00 = 1;
        this.A0F = new SparseArray();
        C41051vD c41051vD = C41051vD.A01;
        this.A0Q = new C129955u0(c41051vD);
        this.A0H = c64x == null ? new C1341564a(c41051vD, 0, true) : c64x2;
        Stack stack = new Stack();
        this.A0P = stack;
        this.A0N = new HashMap();
        this.A0L = new Object();
        this.A0O = new HashMap();
        this.A0M = new C129975u2();
        this.A0K = new C130005u5(new C1341564a(c41051vD, 0, true), new C129955u0(c41051vD), new Object(), new Object(), new Object());
        this.A0G = new C130015u6();
        if (Systrace.A0E(1L)) {
            C0fO.A01("BaseShowreelMediaView:init", 1772350965);
        }
        this.A09 = c9c9;
        try {
            addView(this.A0J, new FrameLayout.LayoutParams(-1, -1, 17));
            stack.add(this.A0J);
            C129905tv c129905tv = this.A0J;
            C19700xy c19700xy = C17280tP.A4E;
            c129905tv.setDebugIndicatorEnabled(c19700xy.A00().A0e());
            C17280tP A00 = c19700xy.A00();
            c129905tv.setClickableLayersIndicatorEnabled(((Boolean) A00.A1l.CES(A00, C17280tP.A4G[37])).booleanValue());
            ArrayList arrayList = new ArrayList();
            String str = new String[]{"ShowreelGlobalListeners"}[0];
            if (str.equals("ShowreelGlobalListeners")) {
                C130065uB c130065uB = C130065uB.A00;
                C14360o3.A07(c130065uB);
                arrayList.add(c130065uB);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC130075uC interfaceC130075uC = (InterfaceC130075uC) it.next();
                    A02(interfaceC130075uC, interfaceC130075uC.hashCode());
                }
                SparseArray clone = this.A0F.clone();
                C14360o3.A07(clone);
                int size = clone.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC130075uC) clone.valueAt(i2)).E0U(this);
                }
                if (A0E) {
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException(String.format("No implementation bound to key: %s", str));
        } finally {
            if (Systrace.A0E(1L)) {
                C0fO.A00(970796113);
            }
        }
    }

    private final void setDebugText(C6PT c6pt) {
        C37416Gdw c37416Gdw = (C37416Gdw) c6pt;
        String str = c37416Gdw.A03;
        if (str == null) {
            str = "";
        }
        String str2 = c37416Gdw.A05;
        if (str2 == null) {
            str2 = "";
        }
        this.A0J.setDebugInfoText(AnonymousClass001.A12("Client name: ", str, "\nTemplate name: ", str2, "\nDuration in seconds: ", r1.getDuration()));
    }

    public final C66199U3p A00(C6PT c6pt) {
        Object obj;
        Pair pair;
        Object obj2;
        if (this.A0H.CWq()) {
            obj2 = this.A0O.get(c6pt);
        } else {
            Pair pair2 = this.A02;
            if (pair2 != null) {
                obj = pair2.first;
            } else {
                obj = null;
            }
            if (!c6pt.equals(obj) || (pair = this.A02) == null) {
                return null;
            }
            obj2 = pair.second;
        }
        return (C66199U3p) obj2;
    }

    public final void A02(InterfaceC130075uC interfaceC130075uC, int i) {
        SparseArray sparseArray = this.A0F;
        synchronized (sparseArray) {
            sparseArray.put(i, interfaceC130075uC);
        }
    }

    public final void A03(C6PT c6pt) {
        SparseArray clone = this.A0F.clone();
        C14360o3.A07(clone);
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC130075uC) clone.valueAt(i)).DPW(c6pt);
        }
        if (C17280tP.A4E.A00().A0d()) {
            setDebugText(c6pt);
        }
    }

    public final void A05(C6PT c6pt, Throwable th) {
        boolean z = th instanceof CancellationException;
        int i = 0;
        SparseArray clone = this.A0F.clone();
        C14360o3.A07(clone);
        int size = clone.size();
        if (z) {
            while (i < size) {
                ((InterfaceC130075uC) clone.valueAt(i)).D1i(c6pt);
                i++;
            }
        } else {
            while (i < size) {
                ((InterfaceC130075uC) clone.valueAt(i)).DEB(c6pt, th);
                i++;
            }
        }
    }

    @Override // X.C5M0
    public final boolean AFh() {
        CQ3 cq3;
        if ((this.A04 != null || ((cq3 = this.A03) != null && cq3.A00 != null)) && CXh()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC115845Ly
    public final boolean CXh() {
        Object obj;
        C66199U3p c66199U3p;
        C6PT c6pt = this.A05;
        if (c6pt != null) {
            Pair pair = this.A02;
            InterfaceC58682mR interfaceC58682mR = null;
            if (pair != null) {
                obj = pair.first;
            } else {
                obj = null;
            }
            if (C14360o3.A0K(obj, c6pt)) {
                Pair pair2 = this.A02;
                if (pair2 != null && (c66199U3p = (C66199U3p) pair2.second) != null) {
                    interfaceC58682mR = c66199U3p.A00.A00;
                }
                if (C14360o3.A0K(interfaceC58682mR, this.A0J.getKeyframesAnimatable())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C5M2
    public final void D8v() {
        C69615VsI c69615VsI = this.A0C;
        if (c69615VsI != null) {
            c69615VsI.A00();
        }
    }

    @Override // X.C5M1
    public final void DEB(C6PT c6pt, Throwable th) {
        if (this instanceof ShowreelNativeMediaView) {
            C0K8.A0F(getIntegrationPoint().A00, "Failed to query ", th);
            A05(c6pt, th);
            this.A05 = null;
            return;
        }
        ColorDrawable colorDrawable = super.A00;
        if (colorDrawable != null) {
            this.A0J.setPlaceholderDrawable(colorDrawable);
        }
        this.A02 = null;
        this.A0N.clear();
        A05(c6pt, th);
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        if (r0 == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    @Override // X.C5M2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DJv(android.graphics.PointF r24, android.graphics.RectF r25, X.InterfaceC71848X7g r26, java.lang.Integer r27) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC115825Lw.DJv(android.graphics.PointF, android.graphics.RectF, X.X7g, java.lang.Integer):boolean");
    }

    @Override // X.C5M0
    public final void DK2() {
        C69615VsI c69615VsI = this.A0C;
        if (c69615VsI != null) {
            c69615VsI.A00 = ((AbstractCollection) c69615VsI.A02.A00).size();
            c69615VsI.A01 = W12.A00;
        }
        Stack stack = this.A0P;
        if (stack.size() > 1) {
            stack.pop();
            InterfaceC31148Dmr interfaceC31148Dmr = this.A04;
            if (interfaceC31148Dmr != null) {
                interfaceC31148Dmr.Dm9();
            }
        }
        C6PV c6pv = this.A0J.A05;
        if (c6pv != null) {
            C69585Vro c69585Vro = c6pv.A01;
            c69585Vro.A00(c6pv.A00);
            c69585Vro.A02.A01(new C70451WWe("on_entry"));
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void E0c() {
        C6PU c6pu = this.A06;
        if (c6pu != null) {
            c6pu.A02();
            String str = this.A0E;
            if (str != null) {
                C6PU c6pu2 = this.A06;
                if (c6pu2 != null) {
                    C6PU.A00(c6pu2, "fully_enter_viewport", str);
                }
                this.A0G.Chv(C6P9.A01(C05F.A00, str));
            } else {
                throw new NullPointerException("Logging Info for current fetch cannot be null");
            }
        }
        SparseArray clone = this.A0F.clone();
        C14360o3.A07(clone);
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC130075uC) clone.valueAt(i)).E1C(this.A05, this, 1.0f);
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void E0l() {
        C6PU c6pu = this.A06;
        if (c6pu != null) {
            c6pu.A03();
        }
        this.A0G.Chv(C6P9.A00(C05F.A00));
    }

    @Override // X.InterfaceC115845Ly
    public final void E0o() {
        C6PU c6pu = this.A06;
        if (c6pu != null) {
            c6pu.A02();
            String str = this.A0E;
            if (str != null) {
                C6PU c6pu2 = this.A06;
                if (c6pu2 != null) {
                    C6PU.A00(c6pu2, "partially_enter_viewport", str);
                }
                this.A0G.Chv(C6P9.A02(C05F.A00, str));
                return;
            }
            throw new NullPointerException("Logging Info for current fetch cannot be null");
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void E4S() {
        C6PT c6pt = this.A05;
        if (c6pt != null) {
            SparseArray clone = this.A0F.clone();
            C14360o3.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC130075uC) clone.valueAt(i)).DZ7(c6pt, this);
            }
        }
        InterfaceC58682mR keyframesAnimatable = this.A0J.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            if (keyframesAnimatable.BiI() != 0.0f) {
                keyframesAnimatable.EMk(0.0f);
            }
            keyframesAnimatable.E4S();
        }
        C6PT c6pt2 = this.A05;
        if (c6pt2 != null) {
            SparseArray clone2 = this.A0F.clone();
            C14360o3.A07(clone2);
            int size2 = clone2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC130075uC) clone2.valueAt(i2)).DYt(c6pt2, this);
            }
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void EKd() {
        C130055uA c130055uA;
        C6PT c6pt = this.A05;
        if (c6pt != null) {
            SparseArray clone = this.A0F.clone();
            C14360o3.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC130075uC) clone.valueAt(i)).DZ7(c6pt, this);
            }
        }
        C129905tv c129905tv = this.A0J;
        InterfaceC58682mR keyframesAnimatable = c129905tv.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            keyframesAnimatable.E4S();
        }
        if (c129905tv.A04 != null && c129905tv.A07 != null && (c130055uA = c129905tv.A06) != null) {
            c130055uA.A00 = C16930sl.A00;
            c129905tv.invalidate();
        }
        C6PT c6pt2 = this.A05;
        if (c6pt2 != null) {
            SparseArray clone2 = this.A0F.clone();
            C14360o3.A07(clone2);
            int size2 = clone2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC130075uC) clone2.valueAt(i2)).DYt(c6pt2, this);
            }
        }
    }

    public final Object getAdModel() {
        return this.A08;
    }

    public final Map getAdditionalInteractiveModels() {
        return this.A0N;
    }

    public Collection getAllKeys() {
        return this.A0O.keySet();
    }

    public final Animator.AnimatorListener getAnimListener() {
        return this.A01;
    }

    @Override // android.view.View
    public final C6PT getAnimation() {
        return this.A05;
    }

    public final Pair getAnimationInteractiveModelPair() {
        return this.A02;
    }

    public final AbstractC42736IvW getAudioPlayer() {
        return null;
    }

    public final C130005u5 getCarouselHandler() {
        return this.A0K;
    }

    public C64X getConfig() {
        return this.A0H;
    }

    public final String getCustomDebugId() {
        return this.A0D;
    }

    public String getDebugId() {
        String str = this.A0D;
        if (str == null) {
            String hexString = Integer.toHexString(hashCode());
            C14360o3.A07(hexString);
            return hexString;
        }
        return str;
    }

    public final XP4 getDrawableProvider() {
        C9C9 c9c9;
        XP4 xp4 = this.A0B;
        if (xp4 == null) {
            C129955u0 c129955u0 = this.A0Q;
            if ((this.A05 == null && this.A09 == null) || (c9c9 = this.A09) == null) {
                C14360o3.A0F("integrationPoint");
                throw C00O.createAndThrow();
            }
            String str = c9c9.A00;
            this.A0H.AzQ();
            C72122XOt A00 = c129955u0.A00(str);
            this.A0B = A00;
            return A00;
        }
        return xp4;
    }

    public long getDurationSeconds() {
        return this.A0J.getDuration();
    }

    public final C129965u1 getExecutor() {
        return this.A0L;
    }

    public C129905tv getImageView() {
        return this.A0J;
    }

    public C9C9 getIntegrationPoint() {
        C9C9 c9c9 = this.A09;
        if (c9c9 == null) {
            C14360o3.A0F("integrationPoint");
            throw C00O.createAndThrow();
        }
        return c9c9;
    }

    public final Map getInteractiveModelsCache() {
        return this.A0O;
    }

    public final InterfaceC138736Qd getLoggingInfo() {
        return this.A0A;
    }

    public float getProgress() {
        return this.A0J.getProgress();
    }

    public final ImmutableMap getRenderingComponentInfos() {
        return this.A0J.getRenderingComponentInfos();
    }

    public final int getRepeatCount() {
        return this.A00;
    }

    public int getRepeatsRemaining() {
        return this.A0J.getRepeatsRemaining();
    }

    public InterfaceC138736Qd getShowreelLoggingInfo() {
        return this.A0A;
    }

    @Override // X.InterfaceC115845Ly
    public final boolean isPlaying() {
        InterfaceC58682mR keyframesAnimatable = this.A0J.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            return keyframesAnimatable.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC115845Ly
    public final void pause() {
        Map map;
        C130055uA c130055uA;
        List<AbstractC56722j5> list;
        float f;
        float f2;
        C6PT c6pt = this.A05;
        if (c6pt != null) {
            SparseArray clone = this.A0F.clone();
            C14360o3.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC130075uC) clone.valueAt(i)).DXu(c6pt, this);
            }
        }
        C129905tv c129905tv = this.A0J;
        InterfaceC58682mR keyframesAnimatable = c129905tv.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            keyframesAnimatable.pause();
        }
        C66198U3o c66198U3o = c129905tv.A04;
        if (c66198U3o != null && (map = c129905tv.A07) != null && (c130055uA = c129905tv.A06) != null) {
            java.util.Set keySet = map.keySet();
            C14360o3.A0B(keySet, 1);
            Object obj = c66198U3o.A00;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (Object obj2 : keySet) {
                Map map2 = ((AnonymousClass693) obj).A02.A0F;
                if (map2 != null && (list = (List) map2.get(obj2)) != null) {
                    for (AbstractC56722j5 abstractC56722j5 : list) {
                        Drawable drawable = (Drawable) obj;
                        C14360o3.A0B(drawable, 0);
                        Rect bounds = drawable.getBounds();
                        C14360o3.A07(bounds);
                        int width = bounds.width();
                        int height = bounds.height();
                        int width2 = c129905tv.getWidth();
                        int height2 = c129905tv.getHeight();
                        float f3 = 0.0f;
                        if (width * height2 > width2 * height) {
                            f = height2 / height;
                            f3 = (width2 - (width * f)) * 0.5f;
                            f2 = 0.0f;
                        } else {
                            f = width2 / width;
                            f2 = (height2 - (height * f)) * 0.5f;
                        }
                        RectF rectF = abstractC56722j5.A0A;
                        C14360o3.A07(rectF);
                        float f4 = f3 / f;
                        float f5 = f2 / f;
                        builder.add((Object) new RectF((rectF.left + f4) * f, (rectF.top + f5) * f, (rectF.right + f4) * f, (rectF.bottom + f5) * f));
                    }
                }
            }
            ImmutableList build = builder.build();
            C14360o3.A07(build);
            c130055uA.A00 = build;
            c129905tv.invalidate();
        }
        C6PT c6pt2 = this.A05;
        if (c6pt2 != null) {
            SparseArray clone2 = this.A0F.clone();
            C14360o3.A07(clone2);
            int size2 = clone2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC130075uC) clone2.valueAt(i2)).DXw(c6pt2, this);
            }
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void reset() {
        if (this.A09 == null) {
            C14360o3.A0F("integrationPoint");
            throw C00O.createAndThrow();
        }
        hashCode();
        ColorDrawable colorDrawable = super.A00;
        if (colorDrawable != null) {
            this.A0J.setPlaceholderDrawable(colorDrawable);
        }
        ListenableFuture listenableFuture = this.A07;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        this.A07 = null;
        C6PT c6pt = this.A05;
        if (c6pt != null) {
            SparseArray clone = this.A0F.clone();
            C14360o3.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC130075uC) clone.valueAt(i)).E0t(c6pt, this);
            }
        }
        this.A08 = null;
        this.A05 = null;
        C6PU c6pu = this.A06;
        if (c6pu != null) {
            c6pu.A03();
        }
        this.A06 = null;
        this.A0A = null;
        this.A0E = null;
        this.A0N.clear();
        C129975u2 c129975u2 = this.A0M;
        if (c129975u2 != null) {
            c129975u2.A00.clear();
        }
        C129905tv c129905tv = this.A0J;
        c129905tv.A05 = null;
        c129905tv.A07 = null;
        c129905tv.A03 = C5M0.A01;
        InterfaceC58682mR keyframesAnimatable = c129905tv.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            keyframesAnimatable.EEv();
        }
        c129905tv.setImageDrawable(null);
        C129925tx c129925tx = c129905tv.A0C;
        c129925tx.A02 = null;
        c129925tx.A00 = null;
        c129925tx.A01 = null;
        c129925tx.A03 = C05F.A00;
    }

    public final void setInteractivityListener(InterfaceC31031DkU interfaceC31031DkU) {
        this.A03 = new CQ3(interfaceC31031DkU, C05F.A00);
    }

    /* JADX WARN: Type inference failed for: r16v1, types: [X.5u4, java.lang.Object] */
    @Override // X.InterfaceC115855Lz
    public void setShowreelAnimation(C6PT c6pt, InterfaceC138736Qd interfaceC138736Qd, String str, List list, Object obj, Boolean bool, Animator.AnimatorListener animatorListener, C9C9 c9c9) {
        C130005u5 c130005u5;
        C130005u5 c130005u52;
        ?? obj2;
        C9C9 c9c92;
        C130005u5 c130005u53;
        Runnable runnableC71627WxZ;
        boolean CQb;
        String str2 = str;
        C14360o3.A0B(c6pt, 0);
        C14360o3.A0B(list, 3);
        if (c9c9 != null) {
            this.A09 = c9c9;
        }
        this.A01 = animatorListener;
        getIntegrationPoint();
        hashCode();
        C64X c64x = this.A0H;
        if (!c64x.EiK() || !c6pt.equals(this.A05)) {
            this.A05 = c6pt;
            this.A0A = interfaceC138736Qd;
            this.A08 = obj;
            SparseArray clone = this.A0F.clone();
            C14360o3.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC130075uC) clone.valueAt(i)).Dns(c6pt);
            }
            ListenableFuture listenableFuture = this.A07;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
            }
            this.A07 = null;
            boolean z = true;
            if (list.size() > 1) {
                z = false;
            }
            C66199U3p A00 = A00(c6pt);
            if (A00 != null) {
                try {
                    obj2 = new Object();
                    c9c92 = this.A09;
                } catch (C129895tu e) {
                    String A0R = AnonymousClass001.A0R("setShowreelAnimation: ", e.getLocalizedMessage());
                    C14360o3.A0B(A0R, 1);
                    C0K8.A0O("BaseShowreelMediaView", "%s: %s", A0R, "BaseShowreelMediaView");
                    C0w9.A03("BaseShowreelMediaView", A0R);
                }
                if (c9c92 == null) {
                    C14360o3.A0F("integrationPoint");
                    throw C00O.createAndThrow();
                }
                C65750TtP A01 = obj2.A01(interfaceC138736Qd, c6pt, c9c92.A01, str2, true);
                C6PU A02 = ((C6VU) getDrawableProvider().A00).A02(A01, false);
                U3W.A00();
                this.A06 = A02;
                String str3 = A01.A05;
                if (str3 == null) {
                    str3 = "";
                }
                this.A0E = str3;
                if (!z && !CXh() && (c130005u52 = this.A0K) != null) {
                    String str4 = getIntegrationPoint().A00;
                    String str5 = getIntegrationPoint().A01;
                    C14360o3.A0B(str4, 0);
                    C14360o3.A0B(str5, 1);
                    if (C18U.A06(C06090Tz.A05, C1341564a.A00((C1341564a) c130005u52.A00), 36310770215616790L)) {
                        C14120nc.A00().ATO(new C216679iO(857170603, new RunnableC71606WxC(interfaceC138736Qd, c6pt, c130005u52, str5, str4)));
                    }
                }
                A04(c6pt, A00);
                if (obj != null && c64x.CWq() && (c130005u5 = this.A0K) != null) {
                    c130005u5.A00(interfaceC138736Qd, c6pt, this, this, obj, list);
                    return;
                }
                return;
            }
            this.A0N.clear();
            ColorDrawable colorDrawable = super.A00;
            if (colorDrawable != null) {
                this.A0J.setPlaceholderDrawable(colorDrawable);
            }
            try {
                if (z) {
                    if (str == null) {
                        str2 = "";
                    }
                    if (bool != null) {
                        CQb = bool.booleanValue();
                    } else {
                        CQb = c64x.CQb();
                    }
                    if (CQb) {
                        runnableC71627WxZ = new RunnableC71590Wwm(interfaceC138736Qd, c6pt, this, str2);
                    } else {
                        AV8(interfaceC138736Qd, c6pt, str2, true);
                        return;
                    }
                } else if (obj != null && (c130005u53 = this.A0K) != null) {
                    if (c130005u53.A00.CQb()) {
                        runnableC71627WxZ = new RunnableC71627WxZ(interfaceC138736Qd, c6pt, this, this, c130005u53, obj, list);
                    } else {
                        AV8(interfaceC138736Qd, c6pt, null, true);
                        c130005u53.A00(interfaceC138736Qd, c6pt, this, this, obj, list);
                        return;
                    }
                } else {
                    return;
                }
                C14120nc.A00().ATO(new C216679iO(730, runnableC71627WxZ));
            } catch (C902840n e2) {
                DEB(c6pt, e2);
            }
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void stop() {
        InterfaceC58682mR keyframesAnimatable = this.A0J.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            keyframesAnimatable.EMk(0.0f);
            keyframesAnimatable.stop();
        }
        C6PT c6pt = this.A05;
        if (c6pt != null) {
            SparseArray clone = this.A0F.clone();
            C14360o3.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC130075uC) clone.valueAt(i)).Dp6(c6pt, this);
            }
        }
        DK2();
        A01();
    }

    @Override // X.AbstractC115835Lx, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1325996265);
        super.onDetachedFromWindow();
        C6PT c6pt = this.A05;
        if (c6pt != null) {
            SparseArray clone = this.A0F.clone();
            C14360o3.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC130075uC) clone.valueAt(i)).E0t(c6pt, this);
            }
        }
        C0f9.A0D(263624437, A06);
    }

    public final void setAdModel(Object obj) {
        this.A08 = obj;
    }

    public final void setAnimListener(Animator.AnimatorListener animatorListener) {
        this.A01 = animatorListener;
    }

    public final void setAnimation(C6PT c6pt) {
        this.A05 = c6pt;
    }

    public final void setAnimationInteractiveModelPair(Pair pair) {
        this.A02 = pair;
    }

    public final void setCustomDebugId(String str) {
        this.A0D = str;
    }

    public final void setLoggingInfo(InterfaceC138736Qd interfaceC138736Qd) {
        this.A0A = interfaceC138736Qd;
    }

    public final void setRepeatCount(int i) {
        this.A00 = i;
    }

    @Deprecated(message = "Use the overload with ShowreelInteractivityListener instead")
    public void setInteractivityListener(InterfaceC31148Dmr interfaceC31148Dmr) {
        C14360o3.A0B(interfaceC31148Dmr, 0);
        this.A04 = interfaceC31148Dmr;
    }
}
