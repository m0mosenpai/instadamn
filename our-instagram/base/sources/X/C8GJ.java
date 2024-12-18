package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8GJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GJ extends FrameLayout {
    public int A00;
    public FrameLayout A01;
    public UserSession A02;
    public C55U A03;
    public C8GH A04;
    public Integer A05;
    public LinkedHashMap A06;
    public int A07;
    public C4PX A08;
    public C8A3 A09;
    public final FrameLayout A0A;
    public final C55982hj A0B;
    public final C8GN A0C;
    public final LinkedHashMap A0D;
    public final LinkedHashMap A0E;
    public final GradientDrawable A0F;
    public final View.OnClickListener A0G;
    public final ImageView A0H;
    public final InterfaceC55932he A0I;
    public final C8GK A0J;

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0038, code lost:
    
        if (r17.A05 != X.C05F.A0C) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C4PX r18, X.C8A3 r19, java.lang.Integer r20) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8GJ.A07(X.4PX, X.8A3, java.lang.Integer):void");
    }

    public final void setCameraToolPairings(LinkedHashMap linkedHashMap, C55U c55u) {
        C14360o3.A0B(linkedHashMap, 0);
        C14360o3.A0B(c55u, 1);
        this.A06 = linkedHashMap;
        this.A03 = c55u;
        FrameLayout frameLayout = this.A0A;
        frameLayout.removeAllViews();
        LinkedHashMap linkedHashMap2 = this.A0E;
        linkedHashMap2.clear();
        LinkedHashMap linkedHashMap3 = this.A0D;
        linkedHashMap3.clear();
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C55U c55u2 = (C55U) entry.getKey();
            C1811881u c1811881u = (C1811881u) entry.getValue();
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            frameLayout2.setLayoutParams(layoutParams);
            frameLayout2.setTranslationX(i);
            frameLayout.addView(frameLayout2);
            UserSession userSession = this.A02;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C8GR c8gr = new C8GR(frameLayout2, userSession, c55u2, this.A0C, this);
            linkedHashMap2.put(c8gr, frameLayout2);
            linkedHashMap3.put(c55u2, c8gr);
            c8gr.A08(c1811881u);
            i += getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        }
        AbstractC13880nE.A0g(frameLayout, i + getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height));
        A03(this, false);
        A01(this);
    }

    private final void A00() {
        float A02;
        if (this.A06 != null) {
            float f = (float) this.A0B.A09.A00;
            Resources resources = getResources();
            float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            float size = (r2.size() - 1) * dimensionPixelSize;
            float f2 = (-1.0f) * dimensionPixelSize * (this.A0J.A00 + r0.A01);
            if (A04()) {
                f2 += size;
            }
            float dimension = resources.getDimension(R.dimen.achievements_list_container_height);
            if (A04()) {
                A02 = AbstractC13600mm.A02(f, 0.5f, 1.0f, 0.0f, 1.0f);
                dimension *= -1.0f;
            } else {
                A02 = AbstractC13600mm.A02(f, 0.0f, 0.5f, 1.0f, 0.0f);
            }
            float f3 = dimension * (-(1.0f - A02));
            this.A0H.setTranslationX(f3);
            FrameLayout frameLayout = this.A0A;
            frameLayout.setAlpha(A02);
            frameLayout.setTranslationX(f2 + f3);
        }
    }

    public static final void A01(C8GJ c8gj) {
        GradientDrawable.Orientation orientation;
        int argb;
        float f = 0.0f;
        if ((!C14360o3.A0K(c8gj.A03, C208509Kk.A00) && !(c8gj.A03 instanceof C81V)) || c8gj.A05 != C05F.A0C || c8gj.A09 != C8A3.A04) {
            for (Object obj : c8gj.A0D.values()) {
                C14360o3.A07(obj);
                C8GR c8gr = (C8GR) obj;
                f = Math.max(Math.max(f, (float) c8gr.A0C.A09.A00), (float) c8gr.A0H.A06.A09.A00);
            }
        }
        boolean A04 = c8gj.A04();
        GradientDrawable gradientDrawable = c8gj.A0F;
        if (A04) {
            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        gradientDrawable.setOrientation(orientation);
        Pair percentLeftRightSide = c8gj.getPercentLeftRightSide();
        Object obj2 = percentLeftRightSide.first;
        C14360o3.A06(obj2);
        float floatValue = ((Number) obj2).floatValue();
        Object obj3 = percentLeftRightSide.second;
        C14360o3.A06(obj3);
        float max = Math.max(floatValue, ((Number) obj3).floatValue()) * f;
        float f2 = 1.0f - 0.0f;
        float f3 = 217.0f - 22.0f;
        float f4 = 0.0f;
        if (f2 != 0.0f) {
            f4 = (max - 0.0f) / f2;
        }
        int i = (int) ((f4 * f3) + 22.0f);
        if (C14640oc.A03()) {
            argb = Color.argb(i, 12, 16, 20);
        } else {
            argb = Color.argb(i, 0, 0, 0);
        }
        gradientDrawable.setColors(new int[]{argb, 0});
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0015, code lost:
    
        if (r5.A05 != X.C05F.A0C) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C8GJ r5) {
        /*
            X.55U r1 = r5.A03
            X.9Kk r0 = X.C208509Kk.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L10
            X.55U r0 = r5.A03
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L17
        L10:
            java.lang.Integer r2 = r5.A05
            java.lang.Integer r1 = X.C05F.A0C
            r0 = 1
            if (r2 == r1) goto L18
        L17:
            r0 = 0
        L18:
            r4 = 0
            if (r0 == 0) goto L21
            X.8A3 r1 = r5.A09
            X.8A3 r0 = X.C8A3.A04
            if (r1 == r0) goto L46
        L21:
            java.util.LinkedHashMap r0 = r5.A0D
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L2b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r3.next()
            X.C14360o3.A07(r0)
            X.8GR r0 = (X.C8GR) r0
            X.2hj r0 = r0.A0C
            X.2hk r0 = r0.A09
            double r1 = r0.A00
            float r0 = (float) r1
            float r4 = java.lang.Math.max(r4, r0)
            goto L2b
        L46:
            android.widget.ImageView r2 = r5.A0H
            r0 = 1061158912(0x3f400000, float:0.75)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L50
            r0 = 1
        L50:
            r2.setClickable(r0)
            r2.setAlpha(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8GJ.A02(X.8GJ):void");
    }

    public static final void A03(C8GJ c8gj, boolean z) {
        if (c8gj.A06 != null) {
            double d = c8gj.A0B.A09.A00;
            float dimensionPixelSize = c8gj.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            float size = (r2.size() - 1) * dimensionPixelSize;
            int i = 8388611;
            if (c8gj.A04()) {
                i = 8388613;
            }
            if (c8gj.A07 != i || z) {
                c8gj.A07 = i;
                AbstractC13880nE.A0X(c8gj.A0A, i | 16);
                AbstractC13880nE.A0X(c8gj.A0H, i | 48);
                float f = 0.0f;
                if (c8gj.A04()) {
                    f = -size;
                }
                for (Object obj : c8gj.A0E.keySet()) {
                    C14360o3.A07(obj);
                    C8GR c8gr = (C8GR) obj;
                    c8gr.A02 = i;
                    Iterator it = c8gr.A0J.iterator();
                    while (it.hasNext()) {
                        AbstractC13880nE.A0X((View) it.next(), i);
                    }
                    c8gr.A0A.setTranslationX(f);
                    f += dimensionPixelSize;
                }
            }
            c8gj.A00();
            A01(c8gj);
            for (Object obj2 : c8gj.A0E.keySet()) {
                C14360o3.A07(obj2);
                C8GR c8gr2 = (C8GR) obj2;
                c8gr2.A00 = d;
                for (CameraToolMenuItem cameraToolMenuItem : c8gr2.A0J) {
                    if (cameraToolMenuItem != null) {
                        cameraToolMenuItem.setPlacement(c8gr2.A00);
                    }
                }
                c8gr2.ECv();
            }
            C8GH c8gh = c8gj.A04;
            if (c8gh == null) {
                C14360o3.A0F("delegate");
                throw C00O.createAndThrow();
            }
            boolean A04 = c8gj.A04();
            c8gh.A05.A06.Egh(Boolean.valueOf(!A04));
            Iterator it2 = c8gh.A08.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass822) it2.next()).onChanged(Boolean.valueOf(A04));
            }
        }
    }

    private final boolean A04() {
        if (this.A0B.A09.A00 <= 0.5d) {
            return false;
        }
        return true;
    }

    private final Pair getPercentLeftRightSide() {
        float f = (float) this.A0B.A09.A00;
        return new Pair(Float.valueOf(AbstractC13600mm.A02(f, 0.5f, 0.0f, 0.0f, 1.0f)), Float.valueOf(AbstractC13600mm.A02(f, 0.5f, 1.0f, 0.0f, 1.0f)));
    }

    public final View A05(C81W c81w) {
        LinkedHashMap linkedHashMap = this.A0D;
        linkedHashMap.values();
        for (Object obj : linkedHashMap.values()) {
            C14360o3.A07(obj);
            View view = (View) ((C8GR) obj).A0I.get(c81w);
            if (view != null) {
                return view;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(int r12, int r13, float r14) {
        /*
            r11 = this;
            X.8GK r0 = r11.A0J
            r0.A00 = r14
            r0.A01 = r12
            int r4 = X.C1H4.A01(r14)
            int r4 = r4 + r12
            java.util.LinkedHashMap r0 = r11.A0D
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r10 = r0.iterator()
            r3 = 0
        L16:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            X.55U r5 = (X.C55U) r5
            java.lang.Object r2 = r0.getValue()
            X.8GR r2 = (X.C8GR) r2
            r6 = 0
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 == 0) goto L43
            r0 = 0
            r2.A07(r0)
            X.7lx r0 = r2.A0H
            r0.A00()
            r0 = 0
            r2.A08 = r0
            r2.ECv()
        L43:
            if (r3 != r4) goto L5e
            double r0 = (double) r14
            r8 = 4606732058837280358(0x3fee666666666666, double:0.95)
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 > 0) goto L58
            r8 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 >= 0) goto L5e
        L58:
            r0 = 1
            r2.A08 = r0
            r2.ECv()
        L5e:
            if (r3 != r12) goto L88
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r14
        L63:
            r2.A01 = r6
        L65:
            r2.ECv()
            X.55U r0 = r11.A03
            if (r0 == r5) goto L85
            X.0sj r0 = X.C16910sj.A00
            r2.A09(r0)
            if (r3 != r4) goto L85
            r2.A06()
            r11.A03 = r5
            java.lang.Integer r2 = r11.A05
            if (r2 == 0) goto L85
            X.4PX r1 = r11.A08
            if (r1 == 0) goto L85
            X.8A3 r0 = r11.A09
            r11.A07(r1, r0, r2)
        L85:
            int r3 = r3 + 1
            goto L16
        L88:
            if (r3 != r13) goto L63
            r2.A01 = r14
            goto L65
        L8d:
            r11.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8GJ.A06(int, int, float):void");
    }

    public final C8GH getCameraToolMenuDelegate() {
        C8GH c8gh = this.A04;
        if (c8gh == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        return c8gh;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.8GK] */
    public C8GJ(Context context) {
        super(context);
        this.A0E = new LinkedHashMap();
        this.A0D = new LinkedHashMap();
        this.A0J = new Object();
        this.A00 = -1;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.8GL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2076908100);
                C8GJ c8gj = C8GJ.this;
                C55982hj c55982hj = c8gj.A0B;
                boolean z = false;
                if (c55982hj.A01 == 1.0d) {
                    z = true;
                }
                if (z) {
                    c55982hj.A04();
                    UserSession userSession = c8gj.A02;
                    if (userSession != null) {
                        C8GO.A01(userSession, false);
                        C0f9.A0C(876277955, A05);
                        return;
                    }
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                c55982hj.A06(1.0d);
                UserSession userSession2 = c8gj.A02;
                if (userSession2 != null) {
                    C8GO.A01(userSession2, true);
                    C0f9.A0C(876277955, A05);
                    return;
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
        };
        this.A0G = onClickListener;
        C668630d c668630d = new C668630d() { // from class: X.8GM
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C8GJ.A03(C8GJ.this, false);
            }
        };
        this.A0I = c668630d;
        this.A0C = new C8GN(this);
        setLayoutDirection(0);
        this.A0B = C8GO.A00(c668630d, 2.0d, 20.0d);
        View inflate = View.inflate(context, R.layout.layout_camera_tool_menu, this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A0F = gradientDrawable;
        inflate.setBackground(gradientDrawable);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.camera_tool_menu_switch_button);
        this.A0H = imageView;
        imageView.setOnClickListener(onClickListener);
        A02(this);
        this.A0A = (FrameLayout) inflate.findViewById(R.id.camera_tool_menu_item_holder);
        inflate.setOnTouchListener(new View.OnTouchListener() { // from class: X.8GP
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
            
                if (r9 != 6) goto L17;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
                /*
                    r11 = this;
                    r7 = 1
                    X.C14360o3.A0B(r13, r7)
                    X.8GJ r6 = X.C8GJ.this
                    java.util.LinkedHashMap r8 = r6.A0D
                    java.util.Collection r0 = r8.values()
                    java.util.Iterator r10 = r0.iterator()
                    r2 = 0
                    r4 = 0
                L14:
                    boolean r0 = r10.hasNext()
                    if (r0 == 0) goto L36
                    java.lang.Object r9 = r10.next()
                    X.C14360o3.A07(r9)
                    X.8GR r9 = (X.C8GR) r9
                    X.2hj r0 = r9.A0C
                    double r0 = r0.A01
                    double r4 = java.lang.Math.max(r4, r0)
                    X.7lx r0 = r9.A0H
                    X.2hj r0 = r0.A06
                    double r0 = r0.A01
                    double r4 = java.lang.Math.max(r4, r0)
                    goto L14
                L36:
                    r1 = 0
                    int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r0 != 0) goto L3c
                    return r1
                L3c:
                    int r9 = r13.getActionMasked()
                    int r0 = r13.getActionIndex()
                    int r10 = r13.getPointerId(r0)
                    r5 = -1
                    if (r9 == 0) goto L86
                    r4 = 6
                    r1 = 3
                    if (r9 == r7) goto L57
                    if (r9 == r1) goto L57
                    r0 = 5
                    if (r9 == r0) goto L86
                    if (r9 == r4) goto L57
                L56:
                    return r7
                L57:
                    int r0 = r6.A00
                    if (r10 != r0) goto L81
                    int r0 = r13.getAction()
                    if (r0 == r1) goto L56
                    java.util.Collection r0 = r8.values()
                    java.util.Iterator r1 = r0.iterator()
                L69:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L81
                    java.lang.Object r0 = r1.next()
                    X.C14360o3.A07(r0)
                    X.8GR r0 = (X.C8GR) r0
                    r0.A07(r2)
                    X.7lx r0 = r0.A0H
                    r0.A00()
                    goto L69
                L81:
                    if (r9 == r4) goto L56
                    r6.A00 = r5
                    return r7
                L86:
                    int r0 = r6.A00
                    if (r0 != r5) goto L56
                    r6.A00 = r10
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8GP.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1701129140);
        super.onDetachedFromWindow();
        for (Object obj : this.A0E.keySet()) {
            C14360o3.A07(obj);
            ((C8GR) obj).A05();
        }
        C0f9.A0D(-913757868, A06);
    }
}
