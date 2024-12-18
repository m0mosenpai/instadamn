package com.instagram.common.ui.widget.reboundviewpager;

import X.AbstractC010103p;
import X.AbstractC09440dt;
import X.AbstractC15930qn;
import X.AbstractC55922hc;
import X.AbstractC905041l;
import X.C02V;
import X.C0fO;
import X.C14360o3;
import X.C16930sl;
import X.C174447pe;
import X.C174457pf;
import X.C3VX;
import X.C3VY;
import X.C3VZ;
import X.C3Vd;
import X.C41O;
import X.C41P;
import X.C42I;
import X.C42J;
import X.C55942hf;
import X.C55982hj;
import X.C905241n;
import X.C905341o;
import X.C9E0;
import X.EnumC74213Va;
import X.EnumC74223Vb;
import X.EnumC74233Vc;
import X.InterfaceC09390do;
import X.InterfaceC148006lW;
import X.InterfaceC174477ph;
import X.InterfaceC30936Diq;
import X.InterfaceC55932he;
import X.InterfaceC62892tS;
import X.InterfaceC73933Tf;
import X.InterfaceC74243Ve;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.facebook.forker.Process;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class ReboundViewPager extends FrameLayout implements InterfaceC73933Tf, InterfaceC55932he, GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public View A0F;
    public C41P A0G;
    public EnumC74223Vb A0H;
    public InterfaceC148006lW A0I;
    public InterfaceC74243Ve A0J;
    public InterfaceC174477ph A0K;
    public InterfaceC30936Diq A0L;
    public EnumC74233Vc A0M;
    public EnumC74213Va A0N;
    public C3VZ A0O;
    public C174447pe A0P;
    public Integer A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public int[] A0d;
    public float A0e;
    public float A0f;
    public float A0g;
    public float A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public int A0l;
    public Boolean A0m;
    public Integer A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public final AccessibilityManager A0u;
    public final Map A0v;
    public final Map A0w;
    public final Set A0x;
    public final Set A0y;
    public final Set A0z;
    public final InterfaceC09390do A10;
    public final float[] A11;
    public final float[] A12;
    public final GestureDetector A13;
    public final Scroller A14;
    public final C3VX A15;
    public final List A16;
    public final List A17;
    public final List A18;
    public final List A19;
    public final List A1A;
    public final Map A1B;
    public final Map A1C;

    public static final void A05(ReboundViewPager reboundViewPager, double d, float f, boolean z) {
        reboundViewPager.A03((C55942hf) reboundViewPager.A0v.get(C3VY.A03), d, f, z);
    }

    private final boolean A09(float f, float f2) {
        boolean z = true;
        if (f < 0.0f) {
            if (f2 < getMinimumOffset()) {
                return false;
            }
        } else {
            if (f > 0.0f) {
                return f2 <= getMaximumOffset();
            }
            if (f2 >= getMinimumOffset()) {
                z = true;
                if (f2 > getMaximumOffset()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return z;
    }

    public final float A0B(float f) {
        float f2 = this.A01;
        float f3 = f2 % 1.0f;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        float f4 = f2 + (1.0f - f3) + 0.0f;
        A05(this, f, f4, true);
        return f4;
    }

    public final void A0H(float f) {
        A0J(f, true, false);
    }

    public final void A0K(int i) {
        A05(this, 0.0d, i, false);
    }

    public final void A0L(int i, float f) {
        A05(this, f, i, true);
    }

    public final void A0N(Adapter adapter, float f) {
        C14360o3.A0B(adapter, 0);
        A0O(new C41O(adapter), f);
    }

    public final void A0O(C41P c41p, float f) {
        C14360o3.A0B(c41p, 0);
        this.A05 = f;
        this.A0i = 0;
        C41P c41p2 = this.A0G;
        if (c41p2 != null) {
            c41p2.F9h(this.A15);
        }
        if (this.A0G != c41p) {
            C16930sl c16930sl = C16930sl.A00;
            A07(c16930sl, c16930sl, c16930sl, false);
        }
        c41p.EDg(this.A15);
        this.A0G = c41p;
        A0J(f, true, false);
        this.A0D = this.A08;
    }

    public final void A0P(InterfaceC62892tS interfaceC62892tS) {
        Set set;
        C14360o3.A0B(interfaceC62892tS, 0);
        this.A0x.add(interfaceC62892tS);
        if (interfaceC62892tS instanceof C42I) {
            set = this.A0y;
        } else if (!(interfaceC62892tS instanceof C42J)) {
            return;
        } else {
            set = this.A0z;
        }
        set.add(interfaceC62892tS);
    }

    public final void A0Q(InterfaceC62892tS interfaceC62892tS) {
        C14360o3.A0B(interfaceC62892tS, 0);
        this.A0x.remove(interfaceC62892tS);
        if (interfaceC62892tS instanceof C42I) {
            this.A0y.remove(interfaceC62892tS);
        }
        if (interfaceC62892tS instanceof C42J) {
            this.A0z.remove(interfaceC62892tS);
        }
    }

    @Override // X.InterfaceC73933Tf
    public final void AD2(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, 0, layoutParams);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (this.A0O == C3VZ.A04) {
            A0R(false, (float) c55982hj.A01);
            A04(C3VZ.A03, false);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C55982hj c55982hj2;
        float maximumOffset;
        C14360o3.A0B(c55982hj, 0);
        if (this.A0O == C3VZ.A04) {
            A0R(false, (float) c55982hj.A09.A00);
            float f = this.A01;
            if (f < getMinimumOffset()) {
                InterfaceC09390do interfaceC09390do = this.A10;
                ((C55982hj) interfaceC09390do.getValue()).A09((C55942hf) this.A0v.get(C3VY.A03));
                c55982hj2 = (C55982hj) interfaceC09390do.getValue();
                maximumOffset = getMinimumOffset();
            } else {
                if (f <= getMaximumOffset()) {
                    return;
                }
                InterfaceC09390do interfaceC09390do2 = this.A10;
                ((C55982hj) interfaceC09390do2.getValue()).A09((C55942hf) this.A0v.get(C3VY.A03));
                c55982hj2 = (C55982hj) interfaceC09390do2.getValue();
                maximumOffset = getMaximumOffset();
            }
            c55982hj2.A06(maximumOffset);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 != 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007a, code lost:
    
        if (r0 == false) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r4 == X.C8A3.A04) goto L15;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSingleTapUp(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r1 = 0
            X.C14360o3.A0B(r7, r1)
            X.7ph r0 = r6.A0K
            if (r0 == 0) goto L36
            float r2 = r7.getRawX()
            float r3 = r7.getRawY()
            X.7pg r0 = (X.C174467pg) r0
            X.882 r5 = r0.A00
            X.4PX r0 = r5.A03
            r4 = 0
            if (r0 == 0) goto L37
            X.4PZ r0 = X.C4PY.A00(r0)
            if (r0 == 0) goto L37
            android.app.Activity r0 = r5.A0K
            java.lang.Integer r1 = X.AbstractC94954Pb.A01(r0)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L37
            X.4PX r0 = r5.A03
            if (r0 == 0) goto L31
            X.8A3 r4 = X.C4PY.A01(r0)
        L31:
            X.8A3 r0 = X.C8A3.A04
            if (r4 != r0) goto L37
        L35:
            r1 = 1
        L36:
            return r1
        L37:
            X.87x r0 = r5.A0T
            X.0cm r0 = r0.A06
            java.lang.Object r1 = r0.get()
            X.8HI r1 = (X.C8HI) r1
            X.7qB r0 = r1.A06
            if (r0 == 0) goto L35
            boolean r0 = r0.CWZ()
            if (r0 == 0) goto L35
            boolean r0 = r1.A0K
            if (r0 != 0) goto L35
            X.7qB r0 = r1.A06
            X.7yZ r0 = X.C174757qB.A02(r0)
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7qa r0 = r0.A04
            if (r0 == 0) goto L5e
            r0.A07(r2, r3)
        L5e:
            X.C8HI.A0L(r1, r2, r3, r2, r3)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public final void setBufferBias(EnumC74223Vb enumC74223Vb) {
        C14360o3.A0B(enumC74223Vb, 0);
        this.A0H = enumC74223Vb;
    }

    public final void setExtraBufferSize(int i) {
        A0M(i, false);
    }

    public final void setScrollDirection(EnumC74233Vc enumC74233Vc) {
        C14360o3.A0B(enumC74233Vc, 0);
        this.A0M = enumC74233Vc;
    }

    public final void setScrollMode(EnumC74213Va enumC74213Va) {
        C3VY c3vy;
        C14360o3.A0B(enumC74213Va, 0);
        EnumC74213Va enumC74213Va2 = EnumC74213Va.A03;
        C55982hj c55982hj = (C55982hj) this.A10.getValue();
        Map map = this.A0v;
        if (enumC74213Va == enumC74213Va2) {
            c3vy = C3VY.A03;
        } else {
            c3vy = C3VY.A04;
        }
        c55982hj.A09((C55942hf) map.get(c3vy));
        this.A0N = enumC74213Va;
    }

    public final void setSpringConfig(C3VY c3vy, C55942hf c55942hf) {
        C14360o3.A0B(c3vy, 0);
        C14360o3.A0B(c55942hf, 1);
        this.A0v.put(c3vy, c55942hf);
    }

    public final void setTouchSlopDp(int i) {
        this.A0g = TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    public /* synthetic */ ReboundViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final View A00(C905241n c905241n) {
        Map map = (Map) this.A1C.get(Integer.valueOf(c905241n.A01));
        if (map != null) {
            C41P c41p = this.A0G;
            if (this.A0b && c41p != null && c41p.hasStableIds()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    C905241n c905241n2 = (C905241n) entry.getKey();
                    View view = (View) entry.getValue();
                    if (c905241n2.A02 == c905241n.A02) {
                        it.remove();
                        return view;
                    }
                }
            } else {
                View view2 = (View) map.remove(c905241n);
                if (view2 != null) {
                    return view2;
                }
            }
            for (C905241n c905241n3 : map.keySet()) {
                if (c905241n3.A00 != ((int) this.A02)) {
                    return (View) map.remove(c905241n3);
                }
            }
        }
        return null;
    }

    private final void A01(MotionEvent motionEvent) {
        if (!this.A0r && !this.A0q) {
            float rawX = this.A0e - motionEvent.getRawX();
            float rawY = this.A0f - motionEvent.getRawY();
            boolean z = false;
            boolean z2 = false;
            if (Math.sqrt((rawX * rawX) + (rawY * rawY)) > this.A0g) {
                z2 = true;
            }
            double degrees = Math.toDegrees(Math.atan(Math.abs(rawY / rawX)));
            if (z2) {
                if (this.A0O != C3VZ.A03) {
                    EnumC74233Vc enumC74233Vc = this.A0M;
                    boolean z3 = false;
                    if (enumC74233Vc == EnumC74233Vc.A02) {
                        z3 = true;
                    }
                    this.A0q = z3;
                    if (enumC74233Vc == EnumC74233Vc.A03) {
                        z = true;
                    }
                    this.A0r = z;
                    return;
                }
                if (degrees < this.A0l / 2) {
                    this.A0q = true;
                } else {
                    this.A0r = true;
                }
            }
        }
    }

    public static final void A02(View view, C905241n c905241n, ReboundViewPager reboundViewPager) {
        int i = c905241n.A01;
        Map map = reboundViewPager.A1C;
        Integer valueOf = Integer.valueOf(i);
        Map map2 = (Map) map.get(valueOf);
        if (map2 == null) {
            map2 = new LinkedHashMap();
            map.put(valueOf, map2);
        }
        map2.put(c905241n, view);
    }

    private final void A03(C55942hf c55942hf, double d, float f, boolean z) {
        InterfaceC09390do interfaceC09390do = this.A10;
        ((C55982hj) interfaceC09390do.getValue()).A09(c55942hf);
        if (!this.A0R) {
            float minimumOffset = getMinimumOffset();
            if (f < minimumOffset) {
                f = minimumOffset;
            } else if (f > getMaximumOffset()) {
                f = getMaximumOffset();
            }
        }
        if (this.A01 != f) {
            A04(C3VZ.A04, false);
            C55982hj c55982hj = (C55982hj) interfaceC09390do.getValue();
            if (z) {
                c55982hj.A08(this.A01, true);
                ((C55982hj) interfaceC09390do.getValue()).A07(-d);
                ((C55982hj) interfaceC09390do.getValue()).A06(f);
            } else {
                c55982hj.A08(f, true);
                c55982hj.A01();
            }
        }
        if (((C55982hj) interfaceC09390do.getValue()).A0C()) {
            A04(C3VZ.A03, false);
        }
    }

    private final void A04(C3VZ c3vz, boolean z) {
        int i;
        int i2;
        C3VZ c3vz2 = this.A0O;
        if (c3vz != c3vz2) {
            if (c3vz == C3VZ.A03 && (i2 = this.A08) != (i = this.A0D)) {
                this.A0D = i2;
            } else {
                i = -1;
            }
            this.A0O = c3vz;
            for (InterfaceC62892tS interfaceC62892tS : this.A0x) {
                if (i != -1) {
                    interfaceC62892tS.DXb(this.A08, i, z);
                }
                interfaceC62892tS.Diy(this.A0O, c3vz2);
            }
        }
    }

    public static final void A06(ReboundViewPager reboundViewPager, boolean z, boolean z2) {
        float f = reboundViewPager.A01;
        if (!reboundViewPager.A0R) {
            float minimumOffset = reboundViewPager.getMinimumOffset();
            if (f < minimumOffset) {
                f = minimumOffset;
            } else if (f > reboundViewPager.getMaximumOffset()) {
                f = reboundViewPager.getMaximumOffset();
            }
        }
        reboundViewPager.A0J(f, z, z2);
    }

    private final void A07(List list, List list2, List list3, boolean z) {
        int i;
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReboundViewPager.fillRange", 1558794193);
        }
        try {
            List list4 = this.A18;
            List list5 = this.A16;
            list4.addAll(list5);
            list5.clear();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int intValue = ((Number) list.get(i2)).intValue();
                int intValue2 = ((Number) list2.get(i2)).intValue();
                C41P c41p = this.A0G;
                if (c41p != null) {
                    long itemId = c41p.getItemId(intValue);
                    if (!this.A0R) {
                        intValue2 = intValue;
                    }
                    C41P c41p2 = this.A0G;
                    if (c41p2 != null) {
                        C905241n c905241n = new C905241n(itemId, intValue2, c41p2.getItemViewType(intValue));
                        list5.add(c905241n);
                        list4.remove(c905241n);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            int size2 = list4.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C905241n c905241n2 = (C905241n) list4.get(i3);
                Map map = this.A1B;
                View view = (View) map.get(c905241n2);
                if (view != null) {
                    A02(view, c905241n2, this);
                    this.A0w.remove(view);
                    map.remove(c905241n2);
                }
            }
            list4.clear();
            int size3 = list5.size();
            for (int i4 = 0; i4 < size3; i4++) {
                if (this.A0J instanceof C905341o) {
                    i = (list5.size() - 1) - i4;
                } else {
                    i = i4;
                }
                C905241n c905241n3 = (C905241n) list5.get(i);
                int intValue3 = ((Number) list.get(i)).intValue();
                int intValue4 = ((Number) list2.get(i)).intValue();
                Map map2 = this.A1B;
                View view2 = (View) map2.get(c905241n3);
                if (z) {
                    if (view2 == null && (view2 = A00(c905241n3)) == null) {
                        this.A0i++;
                    }
                    C41P c41p3 = this.A0G;
                    if (c41p3 != null) {
                        view2 = c41p3.getView(intValue3, view2, this);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (view2 == null) {
                    View A00 = A00(c905241n3);
                    if (A00 == null) {
                        this.A0i++;
                    }
                    C41P c41p4 = this.A0G;
                    if (c41p4 != null) {
                        view2 = c41p4.getView(intValue3, A00, this);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                map2.put(c905241n3, view2);
                this.A0w.put(view2, c905241n3);
                if (intValue4 == this.A07) {
                    this.A0F = view2;
                }
                if (view2 == null || view2.getParent() == null) {
                    addView(view2);
                }
                InterfaceC74243Ve interfaceC74243Ve = this.A0J;
                if (view2 != null) {
                    float f = 1.0f;
                    if (A0S()) {
                        f = -1.0f;
                    }
                    interfaceC74243Ve.E4r(view2, this, f * ((Number) list3.get(i)).floatValue(), intValue3);
                    C174447pe c174447pe = this.A0P;
                    AccessibilityManager accessibilityManager = this.A0u;
                    if (accessibilityManager != null && accessibilityManager.isEnabled() && c174447pe != null) {
                        if (view2.getImportantForAccessibility() == 0) {
                            view2.setImportantForAccessibility(1);
                        }
                        C174457pf c174457pf = c174447pe.A00;
                        C02V A01 = AbstractC010103p.A01(view2);
                        if (A01 != null && A01 != c174457pf) {
                            c174457pf.A00.put(view2, A01);
                        }
                        AbstractC010103p.A0B(view2, c174457pf);
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Iterator it = this.A1C.values().iterator();
            while (it.hasNext()) {
                for (View view3 : ((Map) it.next()).values()) {
                    if (view3.getParent() == this) {
                        Iterator it2 = this.A0x.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC62892tS) it2.next()).E0r(view3);
                        }
                        removeView(view3);
                    }
                    Map map3 = this.A0w;
                    if (map3.containsKey(view3)) {
                        this.A1B.remove((C905241n) map3.remove(view3));
                    }
                    C174447pe c174447pe2 = this.A0P;
                    AccessibilityManager accessibilityManager2 = this.A0u;
                    if (accessibilityManager2 != null && accessibilityManager2.isEnabled() && c174447pe2 != null) {
                        AbstractC010103p.A0B(view3, (C02V) c174447pe2.A00.A00.remove(view3));
                    }
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-837123028);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(187399473);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        if (A0S() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0077, code lost:
    
        if (A0S() != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A08(float r6) {
        /*
            r5 = this;
            X.3Vc r1 = r5.A0M
            X.3Vc r0 = X.EnumC74233Vc.A03
            if (r1 != r0) goto L3b
            boolean r0 = r5.A0t
        L8:
            r1 = 0
            if (r0 == 0) goto L30
            X.41P r0 = r5.A0G
            if (r0 == 0) goto L30
            boolean r0 = r5.A0V
            r4 = 0
            if (r0 == 0) goto L1a
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L36
            r5.A0V = r1
        L1a:
            boolean r0 = r5.A0T
            if (r0 == 0) goto L24
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L31
            r5.A0T = r1
        L24:
            boolean r0 = X.AbstractC905041l.A00(r6)
            if (r0 != 0) goto L3e
            X.0qm r0 = X.AbstractC15930qn.A02
            boolean r0 = r0.A0T
            if (r0 == 0) goto L3e
        L30:
            return r1
        L31:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L24
            return r1
        L36:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1a
            return r1
        L3b:
            boolean r0 = r5.A0p
            goto L8
        L3e:
            X.6lW r0 = r5.A0I
            r3 = 1
            if (r0 == 0) goto L94
            float r1 = r5.A01
            float r1 = r1 + r6
            X.3Ve r0 = r5.A0J
            int r2 = r0.AVv(r5, r1)
            X.3Ve r0 = r5.A0J
            int r1 = r0.Cgd(r5, r1)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L6f
            boolean r0 = r5.A0S()
            if (r0 == 0) goto L5d
        L5c:
            r2 = r1
        L5d:
            java.lang.String r1 = "Required value was null."
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7d
            if (r2 < 0) goto L92
            X.41P r0 = r5.A0G
            if (r0 != 0) goto L8f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L6f:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7a
            boolean r0 = r5.A0S()
            if (r0 == 0) goto L5c
            goto L5d
        L7a:
            int r2 = r5.A08
            goto L5d
        L7d:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L94
            int r0 = r2 + (-1)
            if (r0 < 0) goto L92
            X.41P r0 = r5.A0G
            if (r0 != 0) goto L8f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L8f:
            r0.getCount()
        L92:
            r1 = 1
            return r1
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A08(float):boolean");
    }

    public static final boolean A0A(ReboundViewPager reboundViewPager, int i) {
        if (!reboundViewPager.A0R) {
            if (i >= 0) {
                C41P c41p = reboundViewPager.A0G;
                if (c41p != null) {
                    if (i < c41p.getCount()) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ void setExtraBufferSize$default(ReboundViewPager reboundViewPager, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            reboundViewPager.A0M(i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setExtraBufferSize");
    }

    public final float A0C(float f, int i) {
        float f2 = this.A01;
        float f3 = f2 % 1.0f;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        float f4 = -f3;
        if (f3 == 0.0f) {
            f4 = -1.0f;
        }
        float f5 = (f2 + f4) - (i - 1);
        A05(this, f, f5, true);
        return f5;
    }

    public final View A0D(int i) {
        Map map = this.A1B;
        for (C905241n c905241n : map.keySet()) {
            if (c905241n != null && c905241n.A00 == i) {
                return (View) map.get(c905241n);
            }
        }
        return null;
    }

    public final void A0E() {
        C41P c41p = this.A0G;
        if (c41p != null) {
            c41p.F9h(this.A15);
        }
    }

    public final void A0F() {
        this.A0x.clear();
        this.A0z.clear();
        this.A0y.clear();
    }

    public final void A0G(float f) {
        A05(this, 0.0d, f, false);
    }

    public final void A0I(float f) {
        float pageSize;
        boolean z;
        int i;
        int i2;
        float A0B;
        float f2 = f;
        int ordinal = this.A0N.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                this.A14.fling(Math.round(this.A01 * getPageSize()), 0, Math.round((-f2) * getPageSize()), 0, Process.WAIT_RESULT_STOPPED, Integer.MAX_VALUE, 0, 0);
                i2 = Math.round(r4.getFinalX() / getPageSize());
                A03((C55942hf) this.A0v.get(C3VY.A04), f2, i2, true);
                i = this.A0k;
            } else {
                return;
            }
        } else {
            float pageSize2 = this.A0B / getPageSize();
            boolean z2 = this.A0o;
            int i3 = this.A0j;
            if (z2) {
                pageSize = i3 / getPageSize();
            } else {
                pageSize = i3 / getPageSize();
            }
            boolean z3 = false;
            if (A08((-f2) / getPageSize()) && Math.abs(f2) > pageSize) {
                z3 = true;
            }
            if ((this.A0q && this.A0M == EnumC74233Vc.A02) || (this.A0r && this.A0M == EnumC74233Vc.A03)) {
                z = true;
            } else {
                z = false;
            }
            if (z3 && z) {
                if (f > pageSize) {
                    if (f > pageSize2) {
                        f2 = pageSize2;
                    }
                    A0B = A0C(f2, 1);
                } else if (f < (-pageSize)) {
                    float f3 = -pageSize2;
                    if (f < f3) {
                        f2 = f3;
                    }
                    A0B = A0B(f2);
                } else {
                    return;
                }
                i = this.A0k;
                i2 = (int) A0B;
            } else if (((C55982hj) this.A10.getValue()).A0C()) {
                A0L(this.A07, 0.0f);
                i = this.A0k;
                i2 = this.A07;
                if (i == i2) {
                    return;
                }
            } else {
                return;
            }
        }
        Iterator it = this.A0x.iterator();
        while (it.hasNext()) {
            ((InterfaceC62892tS) it.next()).DrZ(i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d9 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0254 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0385 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b0 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03c4 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x041f A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0350 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00dc A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022c A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6 A[EDGE_INSN: B:91:0x01c6->B:100:0x01c6 BREAK  A[LOOP:0: B:70:0x0227->B:83:0x020a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0213 A[Catch: all -> 0x04fe, TryCatch #0 {all -> 0x04fe, blocks: (B:17:0x0034, B:22:0x004c, B:24:0x0052, B:25:0x00b2, B:28:0x00ba, B:30:0x00cd, B:31:0x00e8, B:32:0x00ef, B:34:0x00f5, B:36:0x00fb, B:38:0x00ff, B:40:0x0105, B:41:0x0109, B:43:0x010d, B:44:0x0113, B:45:0x0117, B:47:0x0120, B:49:0x012b, B:50:0x0133, B:52:0x0138, B:54:0x013e, B:63:0x018e, B:65:0x0197, B:67:0x01a0, B:68:0x01c0, B:69:0x0219, B:70:0x0227, B:72:0x022c, B:74:0x01f3, B:76:0x01f9, B:78:0x0201, B:79:0x0205, B:81:0x0209, B:83:0x020a, B:88:0x01c2, B:92:0x01a5, B:93:0x04f6, B:94:0x04fd, B:95:0x01aa, B:97:0x01b5, B:98:0x0213, B:99:0x01b9, B:100:0x01c6, B:102:0x01d9, B:104:0x01dd, B:106:0x01eb, B:108:0x01ef, B:109:0x023f, B:111:0x0242, B:113:0x0254, B:116:0x025a, B:118:0x025e, B:122:0x04e6, B:124:0x0265, B:129:0x0293, B:142:0x02a8, B:147:0x0234, B:148:0x02ad, B:156:0x02d3, B:161:0x0374, B:162:0x0381, B:164:0x0385, B:169:0x0397, B:171:0x03b0, B:173:0x03b8, B:174:0x03be, B:176:0x03c4, B:179:0x03ce, B:182:0x03d9, B:184:0x03d4, B:192:0x03e1, B:195:0x0401, B:198:0x0408, B:201:0x0410, B:204:0x0417, B:206:0x041f, B:207:0x0423, B:209:0x0429, B:211:0x0446, B:216:0x0451, B:218:0x0457, B:219:0x045b, B:221:0x0461, B:223:0x046b, B:230:0x0475, B:232:0x047b, B:233:0x047f, B:235:0x0485, B:237:0x048f, B:245:0x0499, B:247:0x049f, B:248:0x04a3, B:250:0x04a9, B:252:0x04b3, B:259:0x04bc, B:261:0x04c2, B:262:0x04c6, B:264:0x04cc, B:266:0x04d6, B:270:0x038e, B:272:0x0392, B:274:0x02e3, B:277:0x02f3, B:278:0x0301, B:279:0x04ee, B:283:0x0310, B:284:0x031e, B:285:0x0329, B:288:0x0338, B:289:0x0345, B:290:0x0350, B:292:0x0354, B:294:0x0358, B:297:0x0360, B:298:0x036b, B:300:0x0149, B:302:0x014d, B:303:0x0154, B:305:0x0158, B:307:0x0161, B:310:0x0168, B:312:0x016c, B:314:0x0172, B:315:0x0177, B:316:0x00c4, B:321:0x00eb, B:322:0x00dc, B:323:0x0077, B:325:0x0083, B:327:0x008e), top: B:16:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(float r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A0J(float, boolean, boolean):void");
    }

    public final void A0M(int i, boolean z) {
        this.A06 = i;
        int max = Math.max(1, i * 2) + 1;
        this.A0d = new int[max];
        this.A0c = new int[max];
        A06(this, z, !z);
    }

    public final void A0R(boolean z, float f) {
        C3VZ c3vz;
        if (z || ((f >= getMinimumOffset() && f <= getMaximumOffset()) || (c3vz = this.A0O) == C3VZ.A04 || c3vz == C3VZ.A02)) {
            A0J(f, false, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (getResources().getConfiguration().getLayoutDirection() != 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0S() {
        /*
            r3 = this;
            X.3Vc r1 = r3.A0M
            X.3Vc r0 = X.EnumC74233Vc.A02
            r2 = 1
            if (r1 != r0) goto L3e
            java.lang.Boolean r1 = r3.A0m
            if (r1 != 0) goto L30
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r1 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L29
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 == r2) goto L2a
        L29:
            r0 = 0
        L2a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r3.A0m = r1
        L30:
            boolean r0 = r3.A0a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L3d
            r2 = 0
        L3d:
            return r2
        L3e:
            boolean r2 = r3.A0a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A0S():boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        int i2 = 0;
        if (!this.A0p || this.A0M == EnumC74233Vc.A03) {
            return false;
        }
        if (this.A0R) {
            C41P c41p = this.A0G;
            if (c41p == null || c41p.getCount() <= 1) {
                return false;
            }
            return true;
        }
        if (i != 0) {
            i2 = 1;
            if (i < 0) {
                i2 = -1;
            }
        }
        if (A0S()) {
            i2 = -i2;
        }
        float f = i2;
        return A09(f, this.A01 + (f / getPageSize()));
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        int i2 = 0;
        if (!this.A0t || this.A0M == EnumC74233Vc.A02) {
            return false;
        }
        if (this.A0R) {
            C41P c41p = this.A0G;
            if (c41p == null || c41p.getCount() <= 1) {
                return false;
            }
            return true;
        }
        if (i != 0) {
            i2 = 1;
            if (i < 0) {
                i2 = -1;
            }
        }
        if (A0S()) {
            i2 = -i2;
        }
        float f = i2;
        return A09(f, this.A01 + (f / getPageSize()));
    }

    public final Adapter getAdapter() {
        C41O c41o;
        C41P c41p = this.A0G;
        if ((c41p instanceof C41O) && (c41o = (C41O) c41p) != null) {
            return c41o.A00;
        }
        return c41p;
    }

    public final boolean getCarouselModeEnabled() {
        return this.A0R;
    }

    public final View getCurrentActiveView() {
        return this.A0F;
    }

    public final int getCurrentDataIndex() {
        if (this.A0G == null) {
            return -1;
        }
        if (this.A0R) {
            return this.A08;
        }
        return (int) Math.min(Math.max(this.A07, 0.0d), r1.getCount() - 1);
    }

    public final float getCurrentOffset() {
        return this.A01;
    }

    public final int getCurrentRawDataIndex() {
        return this.A07;
    }

    public final int getCurrentWrappedDataIndex() {
        return this.A08;
    }

    public final int getExtraBufferSize() {
        return this.A06;
    }

    public final int getFirstVisiblePosition() {
        return this.A09;
    }

    public final InterfaceC74243Ve getItemPositioner() {
        return this.A0J;
    }

    public final int getLastVisiblePosition() {
        return this.A0A;
    }

    public final float getMaximumOffset() {
        int i;
        int max;
        if (this.A0R) {
            return Float.MAX_VALUE;
        }
        Integer num = this.A0n;
        if (num != null) {
            max = num.intValue();
        } else {
            C41P c41p = this.A0G;
            if (c41p != null) {
                i = c41p.getCount();
            } else {
                i = 0;
            }
            max = Math.max(i - 1, 0);
        }
        return max;
    }

    public final float getMinimumOffset() {
        if (this.A0R) {
            return -3.4028235E38f;
        }
        if (this.A0Q != null) {
            return r0.intValue();
        }
        return 0.0f;
    }

    public final float getOffsetFromCurrentDataIndex() {
        return this.A01 - this.A0D;
    }

    public final int getPageSize() {
        int i = this.A0C;
        if (i == -1) {
            if (this.A0M == EnumC74233Vc.A03) {
                return getHeight();
            }
            return getWidth();
        }
        return i;
    }

    public final float getPageSpacing() {
        return this.A00;
    }

    public final boolean getReverseLayout() {
        return this.A0a;
    }

    public final EnumC74233Vc getScrollDirection() {
        return this.A0M;
    }

    public final EnumC74213Va getScrollMode() {
        return this.A0N;
    }

    public final C3VZ getScrollState() {
        return this.A0O;
    }

    public final boolean getStoriesModeEnabled() {
        return this.A0S;
    }

    public final float getTargetOffset() {
        return (float) ((C55982hj) this.A10.getValue()).A01;
    }

    public final boolean getUseStableIdForRecycledView() {
        return this.A0b;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        EnumC74233Vc enumC74233Vc = this.A0M;
        EnumC74233Vc enumC74233Vc2 = EnumC74233Vc.A03;
        boolean A0S = A0S();
        if (enumC74233Vc == enumC74233Vc2) {
            f = f2;
            if (A0S) {
                f = -f2;
            }
        } else if (A0S) {
            f = -f;
        }
        this.A0h = f / getPageSize();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C41P c41p;
        if ((this.A0r && this.A0M == EnumC74233Vc.A02) || (this.A0q && this.A0M == EnumC74233Vc.A03)) {
            return false;
        }
        if (!this.A0s) {
            this.A0s = true;
            return true;
        }
        EnumC74233Vc enumC74233Vc = this.A0M;
        EnumC74233Vc enumC74233Vc2 = EnumC74233Vc.A03;
        boolean A0S = A0S();
        if (enumC74233Vc == enumC74233Vc2) {
            f = f2;
            if (A0S) {
                f = -f2;
            }
        } else if (A0S) {
            f = -f;
        }
        Iterator it = this.A0x.iterator();
        while (it.hasNext()) {
            ((InterfaceC62892tS) it.next()).DyE(this.A08, f);
        }
        float pageSize = (f * this.A04) / getPageSize();
        if (!AbstractC905041l.A00(pageSize) && AbstractC15930qn.A02.A0T) {
            return true;
        }
        InterfaceC148006lW interfaceC148006lW = this.A0I;
        if (A08(pageSize)) {
            A04(C3VZ.A02, false);
            if (!this.A0R) {
                float f3 = this.A01 + pageSize;
                if (f3 < getMinimumOffset() || f3 > getMaximumOffset()) {
                    pageSize *= this.A03;
                }
            }
            A0R(false, this.A01 + pageSize);
            return true;
        }
        if (interfaceC148006lW == null || pageSize == 0.0f) {
            return true;
        }
        float f4 = this.A01 + pageSize;
        if (f4 < 0.0f || (c41p = this.A0G) == null || f4 >= c41p.getCount()) {
            return true;
        }
        if (!AbstractC905041l.A00(f4) && AbstractC15930qn.A02.A0T) {
            return true;
        }
        float f5 = this.A01 + pageSize;
        this.A0J.AVv(this, f5);
        this.A0J.Cgd(this, f5);
        if (pageSize <= 0.0f && pageSize >= 0.0f) {
            return true;
        }
        A0S();
        return true;
    }

    public final void setAccessibilityDelegateCompat(C174447pe c174447pe) {
        this.A0P = c174447pe;
        AbstractC010103p.A0B(this, c174447pe);
    }

    public final void setAdapter(Adapter adapter) {
        if (adapter != null) {
            setAdapter((C41P) new C41O(adapter));
        }
    }

    public final void setCarouselModeEnabled(boolean z) {
        this.A0R = z;
        A06(this, false, true);
    }

    public final void setDraggingEnabled(boolean z) {
        this.A0p = z;
        this.A0t = z;
    }

    public final void setItemPositioner(InterfaceC74243Ve interfaceC74243Ve) {
        if (interfaceC74243Ve != null) {
            this.A0J = interfaceC74243Ve;
        }
    }

    public final void setOverScrollOnEdgeItems(boolean z) {
        this.A0Z = z;
        this.A0Y = z;
    }

    public final void setOvershootClampingEnabled(boolean z) {
        ((C55982hj) this.A10.getValue()).A06 = z;
    }

    public final void setPageSpacing(float f) {
        this.A00 = f;
        A06(this, true, false);
    }

    public final void setRestDisplacementThreshold(double d) {
        ((C55982hj) this.A10.getValue()).A00 = d;
    }

    public final void setRestSpeedThreshold(double d) {
        ((C55982hj) this.A10.getValue()).A02 = d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (X.AbstractC15930qn.A02.A0X == false) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSizeChanged(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 1619856179(0x608d0b33, float:8.1306184E19)
            int r3 = X.C0f9.A06(r0)
            super.onSizeChanged(r5, r6, r7, r8)
            X.Diq r0 = r4.A0L
            if (r0 == 0) goto L11
            r0.Dmq(r5, r6)
        L11:
            boolean r0 = r4.A0S
            if (r0 == 0) goto L1c
            r0 = 1171587877(0x45d50325, float:6816.393)
        L18:
            X.C0f9.A0D(r0, r3)
            return
        L1c:
            boolean r0 = r4.A0R
            if (r0 == 0) goto L2f
            X.0qm r0 = X.AbstractC15930qn.A02
            boolean r0 = r0.A0U
            if (r0 == 0) goto L2f
            r1 = 1
            r0 = 0
            A06(r4, r1, r0)
            r0 = 2060537561(0x7ad14ed9, float:5.4339463E35)
            goto L18
        L2f:
            X.0qm r0 = X.AbstractC15930qn.A02
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L39
            r0 = 1705748079(0x65aba66f, float:1.0132435E23)
            goto L18
        L39:
            if (r7 != 0) goto L45
            if (r8 != 0) goto L45
            X.0qm r0 = X.AbstractC15930qn.A02
            boolean r2 = r0.A0X
            r1 = 0
            r0 = 1
            if (r2 != 0) goto L47
        L45:
            r1 = 1
            r0 = 0
        L47:
            A06(r4, r1, r0)
            r0 = -1746465939(0xffffffff97e70b6d, float:-1.4930909E-24)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onSizeChanged(int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r1 != 3) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = -1068678586(0xffffffffc04d4246, float:-3.20717)
            int r3 = X.C0f9.A05(r0)
            r4 = 0
            X.C14360o3.A0B(r7, r4)
            X.3Va r1 = r6.A0N
            X.3Va r0 = X.EnumC74213Va.A02
            r5 = 0
            if (r1 != r0) goto L19
            r0 = 989236866(0x3af68e82, float:0.0018810781)
            X.C0f9.A0C(r0, r3)
            return r4
        L19:
            boolean r0 = super.onTouchEvent(r7)
            r2 = 1
            if (r0 != 0) goto L28
            android.view.GestureDetector r0 = r6.A13
            boolean r0 = r0.onTouchEvent(r7)
            if (r0 == 0) goto L29
        L28:
            r5 = 1
        L29:
            int r1 = r7.getActionMasked()
            if (r1 == 0) goto L7a
            if (r1 == r2) goto L74
            r0 = 2
            if (r1 == r0) goto L3f
            r0 = 3
            if (r1 == r0) goto L74
        L37:
            r2 = r5
        L38:
            r0 = 1566743885(0x5d629d4d, float:1.0205808E18)
            X.C0f9.A0C(r0, r3)
            return r2
        L3f:
            r6.A01(r7)
            boolean r0 = r6.A0q
            if (r0 == 0) goto L4c
            X.3Vc r1 = r6.A0M
            X.3Vc r0 = X.EnumC74233Vc.A02
            if (r1 == r0) goto L56
        L4c:
            boolean r0 = r6.A0r
            if (r0 == 0) goto L37
            X.3Vc r1 = r6.A0M
            X.3Vc r0 = X.EnumC74233Vc.A03
            if (r1 != r0) goto L37
        L56:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            boolean r0 = r6.A0U
            if (r0 == 0) goto L38
            X.3VZ r0 = X.C3VZ.A03
            r6.A04(r0, r2)
            X.0do r0 = r6.A10
            java.lang.Object r0 = r0.getValue()
            X.2hj r0 = (X.C55982hj) r0
            r0.A01()
            r6.A0U = r4
            goto L38
        L74:
            float r0 = r6.A0h
            r6.A0I(r0)
            goto L37
        L7a:
            X.3Ve r2 = r6.A0J
            float r1 = r7.getX()
            float r0 = r7.getY()
            boolean r2 = r2.F83(r6, r1, r0)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC73933Tf
    public final void AP8(View view) {
        super.detachViewFromParent(view);
    }

    public final void setBackwardDraggingDisabled(boolean z) {
        this.A0T = z;
    }

    public final void setCustomMaximumOffset(Integer num) {
        this.A0n = num;
    }

    public final void setCustomMinimumOffset(Integer num) {
        this.A0Q = num;
    }

    public final void setDraggingController(InterfaceC148006lW interfaceC148006lW) {
        this.A0I = interfaceC148006lW;
    }

    public final void setEnabledMinPagingVelocityCastingFix(boolean z) {
        this.A0o = z;
    }

    public final void setForwardDraggingDisabled(boolean z) {
        this.A0V = z;
    }

    public final void setMaximumFlingVelocity(int i) {
        this.A0B = i;
    }

    public final void setMinPagingVelocity(int i) {
        this.A0j = i;
    }

    public final void setOnSingleTapListener(InterfaceC174477ph interfaceC174477ph) {
        this.A0K = interfaceC174477ph;
    }

    public final void setOnSizeChangedListener(InterfaceC30936Diq interfaceC30936Diq) {
        this.A0L = interfaceC30936Diq;
    }

    public final void setOutOfBoundsDragSlipRatio(float f) {
        this.A03 = f;
    }

    public final void setOverScrollOnEndItem(boolean z) {
        this.A0Y = z;
    }

    public final void setOverScrollOnStartItem(boolean z) {
        this.A0Z = z;
    }

    public final void setOverridePageSize(int i) {
        this.A0C = i;
    }

    public final void setReverseLayout(boolean z) {
        this.A0a = z;
    }

    public final void setScrollSpeedFactor(float f) {
        this.A04 = f;
    }

    public final void setStoriesModeEnabled(boolean z) {
        this.A0S = z;
    }

    public final void setUseStableIdForRecycledView(boolean z) {
        this.A0b = z;
    }

    public final void setXDraggingRange(int i) {
        this.A0l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReboundViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A11 = new float[]{0.0f, 0.0f};
        this.A12 = new float[]{0.0f, 0.0f};
        this.A02 = -1.0f;
        this.A1A = new ArrayList();
        this.A17 = new ArrayList();
        this.A19 = new ArrayList();
        this.A1B = new HashMap();
        this.A0w = new HashMap();
        this.A1C = new HashMap();
        this.A16 = new ArrayList();
        this.A18 = new ArrayList();
        this.A0x = new CopyOnWriteArraySet();
        this.A0z = new CopyOnWriteArraySet();
        this.A0y = new CopyOnWriteArraySet();
        this.A15 = new C3VX(this);
        this.A0v = new EnumMap(C3VY.class);
        this.A0c = new int[0];
        this.A0d = new int[0];
        C3VZ c3vz = C3VZ.A03;
        this.A0O = c3vz;
        this.A09 = -1;
        this.A0A = -1;
        this.A0X = true;
        this.A0p = true;
        this.A0t = true;
        this.A0C = -1;
        this.A0N = EnumC74213Va.A03;
        this.A04 = 1.0f;
        this.A0Z = true;
        this.A0Y = true;
        this.A03 = 0.25f;
        this.A0H = EnumC74223Vb.A06;
        this.A0M = EnumC74233Vc.A02;
        for (C3VY c3vy : C3VY.values()) {
            this.A0v.put(c3vy, c3vy.A00);
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1v);
        C14360o3.A07(obtainStyledAttributes);
        try {
            float dimension = obtainStyledAttributes.getDimension(0, applyDimension);
            obtainStyledAttributes.recycle();
            setPageSpacing(dimension);
            this.A0g = TypedValue.applyDimension(1, 8.0f, displayMetrics);
            this.A0l = 90;
            A04(c3vz, false);
            A0J(0.0f, true, false);
            A0M(1, false);
            GestureDetector gestureDetector = new GestureDetector(context, this, new Handler(Looper.getMainLooper()));
            this.A13 = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
            int scaledMinimumFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
            this.A0B = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            this.A0j = scaledMinimumFlingVelocity;
            this.A0J = new C3Vd();
            Context context2 = getContext();
            Scroller scroller = new Scroller(context2);
            this.A14 = scroller;
            scroller.setFriction(0.1f);
            this.A10 = AbstractC09440dt.A01(new C9E0(this, 15));
            Object systemService = context2.getSystemService("accessibility");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            this.A0u = (AccessibilityManager) systemService;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setAdapter(C41P c41p) {
        C14360o3.A0B(c41p, 0);
        A0O(c41p, this.A01);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReboundViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReboundViewPager(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
