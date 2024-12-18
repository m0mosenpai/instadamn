package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.drawing.FloatingIndicator;
import com.instagram.ui.widget.drawing.StrokeWidthTool;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: X.8PR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PR implements InterfaceC185958Mp, InterfaceC183698Cu, C8PS, C8BD {
    public int A00;
    public int A01;
    public long A02;
    public View A03;
    public View A04;
    public C8QJ A05;
    public final Context A0C;
    public final UserSession A0E;
    public final C57012jc A0F;
    public final C57012jc A0G;
    public final C8PO A0H;
    public final FittingTextView A0K;
    public final FittingTextView A0L;
    public final StrokeWidthTool A0M;
    public final C8PW A0N;
    public final C8PX A0O;
    public final float A0W;
    public final int A0X;
    public final Drawable A0Y;
    public final C57012jc A0Z;
    public final C8D9 A0a;
    public final C8PQ A0b;
    public final ViewOnTouchListenerC1829889t A0c;
    public final InterfaceC1818984z A0d;
    public final InterfaceC143326dX A0e;
    public final EyedropperColorPickerTool A0f;
    public final FloatingIndicator A0g;
    public final boolean A0h;
    public volatile C22878A6y A0i;
    public final List A0T = new ArrayList();
    public final Map A0U = new HashMap();
    public final ArrayList A0R = new ArrayList();
    public final Map A0V = new LinkedHashMap();
    public final HashMap A0S = new HashMap();
    public boolean A08 = false;
    public String A07 = "NoDisplayedBrush";
    public final Runnable A0P = new Runnable() { // from class: X.8PT
        @Override // java.lang.Runnable
        public final void run() {
            C8PR c8pr = C8PR.this;
            for (View view : c8pr.A0T) {
                Object obj = c8pr.A0U.get(view);
                obj.getClass();
                int i = 0;
                if (c8pr.A0N.A01.get(obj) == null) {
                    i = 8;
                }
                view.setVisibility(i);
            }
            YQ3 brush = C8PR.A00(c8pr).A00.getBrush();
            if (brush != null) {
                brush = (YQ3) c8pr.A0N.A01.get(brush.Aia());
            }
            C8PR.A06(c8pr, brush, true);
        }
    };
    public final Runnable A0Q = new Runnable() { // from class: X.8PU
        @Override // java.lang.Runnable
        public final void run() {
            C8PR.this.A01++;
        }
    };
    public final Handler A0D = new Handler(Looper.getMainLooper());
    public Integer A06 = C05F.A00;
    public int A0A = -1;
    public float A09 = -1.0f;
    public int A0B = -1;
    public final C8PV A0I = C8PV.PEN;
    public final C8PV A0J = C8PV.ERASER;

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFI() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFL() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFN(int i) {
    }

    public static C22878A6y A00(C8PR c8pr) {
        if (c8pr.A0i == null) {
            c8pr.A0G.A01();
        }
        C22878A6y c22878A6y = c8pr.A0i;
        c22878A6y.getClass();
        return c22878A6y;
    }

    private void A01() {
        YQ3 yq3;
        String Aia;
        if (this.A0i != null) {
            yq3 = A00(this).A00.getBrush();
        } else {
            yq3 = null;
        }
        if (yq3 == null) {
            Aia = "";
        } else {
            Aia = yq3.Aia();
        }
        if (this.A08) {
            if (!Aia.equals("")) {
                if (!this.A07.equals("NoDisplayedBrush")) {
                    int i = 0;
                    while (true) {
                        List list = this.A0T;
                        if (i >= list.size()) {
                            break;
                        }
                        View view = (View) list.get(i);
                        view.setActivated(false);
                        HashMap hashMap = this.A0S;
                        if (view != hashMap.get(this.A0J.A04) && view != hashMap.get(this.A07)) {
                            view.setVisibility(8);
                        } else {
                            view.setVisibility(0);
                        }
                        i++;
                    }
                }
                View view2 = (View) this.A0S.get(Aia);
                if (view2 != null) {
                    view2.setActivated(true);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            List list2 = this.A0T;
            if (i2 < list2.size()) {
                View view3 = (View) list2.get(i2);
                Object obj = this.A0U.get(view3);
                obj.getClass();
                view3.setActivated(Aia.equals(obj));
                i2++;
            } else {
                return;
            }
        }
    }

    public static void A03(C8PV c8pv, C8PR c8pr, boolean z) {
        C8PW c8pw = c8pr.A0N;
        YQ3 yq3 = (YQ3) c8pw.A01.get(c8pv.A04);
        if (yq3 != null) {
            A06(c8pr, yq3, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r4 != r9.A0J) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(final X.C8PR r9) {
        /*
            java.util.List r8 = r9.A0T
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L21
            java.util.Iterator r2 = r8.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            goto Lc
        L1e:
            r8.clear()
        L21:
            X.8PV[] r7 = X.C8PV.values()
            int r6 = r7.length
            r5 = 0
        L27:
            if (r5 >= r6) goto L6d
            r4 = r7[r5]
            android.view.View r1 = r9.A03
            r1.getClass()
            int r0 = r4.A00
            android.view.View r3 = r1.requireViewById(r0)
            java.util.Map r1 = r9.A0U
            java.lang.String r0 = r4.A04
            r1.put(r3, r0)
            boolean r0 = r4.A05
            r2 = 8
            if (r0 == 0) goto L5f
            X.3P9 r1 = new X.3P9
            r1.<init>(r3)
            X.9Lu r0 = new X.9Lu
            r0.<init>()
            r1.A04 = r0
            r1.A00()
            boolean r0 = r9.A08
            r1 = 0
            if (r0 == 0) goto L68
            X.8PV r0 = r9.A0I
            if (r4 == r0) goto L69
            X.8PV r0 = r9.A0J
            if (r4 == r0) goto L69
        L5f:
            r3.setVisibility(r2)
        L62:
            r8.add(r3)
            int r5 = r5 + 1
            goto L27
        L68:
            r1 = 4
        L69:
            r3.setVisibility(r1)
            goto L62
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8PR.A04(X.8PR):void");
    }

    public static void A05(C8PR c8pr, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(c8pr.A0V);
        linkedHashMap.remove(Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        C8QJ c8qj = c8pr.A05;
        c8qj.getClass();
        c8qj.A02(arrayList);
    }

    public static void A06(C8PR c8pr, YQ3 yq3, boolean z) {
        if (yq3 == null) {
            C8PW c8pw = c8pr.A0N;
            yq3 = (YQ3) c8pw.A01.get(c8pr.A0I.A04);
            if (yq3 == null) {
                return;
            }
        }
        String Aia = yq3.Aia();
        if (c8pr.A08 && !Aia.equals(c8pr.A0J.A04)) {
            c8pr.A07 = Aia;
        }
        A00(c8pr).A00.setBrush(yq3);
        yq3.ERe(c8pr.A0B);
        StrokeWidthTool strokeWidthTool = c8pr.A0M;
        float BTz = yq3.BTz();
        float BQ6 = yq3.BQ6();
        float f = strokeWidthTool.A07;
        float f2 = strokeWidthTool.A05;
        float f3 = (f - f2) / (strokeWidthTool.A04 - f2);
        strokeWidthTool.A05 = BTz;
        strokeWidthTool.A04 = BQ6;
        strokeWidthTool.A07 = BTz + (f3 * (BQ6 - BTz));
        StrokeWidthTool.A03(strokeWidthTool);
        c8pr.A07(z);
        A00(c8pr).A00.setBrushSize(((AbstractC73478YFb) yq3).A00);
        c8pr.A01();
        c8pr.A02();
    }

    public static boolean A08(C8PR c8pr) {
        Integer num = c8pr.A06;
        if (num != C05F.A0C && num != C05F.A0N && num != C05F.A0Y && num != C05F.A0j && num != C05F.A0u) {
            return false;
        }
        return true;
    }

    public final C8Q0 A09() {
        C8Q1 c8q1;
        if (this.A0i != null) {
            RunnableC73549YIw runnableC73549YIw = A00(this).A00.A0E;
            if (!runnableC73549YIw.A0H.isEmpty()) {
                c8q1 = new C8Q1(new ArrayList(runnableC73549YIw.A0G));
                return new C8Q0(c8q1);
            }
        }
        c8q1 = null;
        return new C8Q0(c8q1);
    }

    public final void A0A() {
        ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = this.A0c;
        if (viewOnTouchListenerC1829889t != null) {
            viewOnTouchListenerC1829889t.A04();
        }
        int i = this.A0X;
        FittingTextView fittingTextView = this.A0L;
        if (fittingTextView != null) {
            fittingTextView.setMaxWidth(i);
        }
        FittingTextView fittingTextView2 = this.A0K;
        if (fittingTextView2 != null) {
            fittingTextView2.setMaxWidth(i);
        }
        A0E(C05F.A01);
    }

    public final void A0D(int i) {
        this.A0A = i;
        this.A0B = i;
        if (this.A0G.A04() && A00(this).A00.getBrush() != null) {
            A00(this).A00.getBrush().ERe(i);
        }
        this.A0M.setColour(i);
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A0f;
        eyedropperColorPickerTool.getClass();
        eyedropperColorPickerTool.setColor(i);
        ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = this.A0c;
        if (viewOnTouchListenerC1829889t != null) {
            viewOnTouchListenerC1829889t.A04();
        }
    }

    public final void A0E(Integer num) {
        int i;
        StrokeWidthTool strokeWidthTool;
        InterfaceC125355lh interfaceC125355lh;
        Bitmap bitmap;
        if (this.A06 != num) {
            if (this.A03 == null) {
                this.A0Z.A01();
            }
            Integer num2 = this.A06;
            boolean z = false;
            if (num2 == C05F.A00) {
                z = true;
            }
            boolean A08 = A08(this);
            this.A06 = num;
            switch (num.intValue()) {
                case 0:
                    if (this.A0G.A04()) {
                        this.A0a.A02(false);
                        GLDrawingView gLDrawingView = A00(this).A00;
                        View view = this.A03;
                        view.getClass();
                        C150956qv.A08(new View[]{gLDrawingView, view, this.A0K, this.A0M, this.A0L, this.A0f}, false);
                        A00(this).A00.setEnabled(false);
                        GLDrawingView gLDrawingView2 = A00(this).A00;
                        RunnableC24707Awo runnableC24707Awo = new RunnableC24707Awo(gLDrawingView2, null);
                        X1v x1v = gLDrawingView2.A05;
                        if (x1v != null) {
                            x1v.A07(runnableC24707Awo);
                        }
                    }
                    ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = this.A0c;
                    if (viewOnTouchListenerC1829889t != null && (bitmap = viewOnTouchListenerC1829889t.A02) != null) {
                        bitmap.recycle();
                        viewOnTouchListenerC1829889t.A02 = null;
                        break;
                    }
                    break;
                case 1:
                    if (num2 == C05F.A0C || num2 == C05F.A0Y) {
                        if (this.A0i != null) {
                            List marks = A00(this).A00.getMarks();
                            C14360o3.A0B(marks, 0);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : marks) {
                                YRN yrn = (YRN) obj;
                                if (yrn != null && ((AbstractC73479YFc) yrn).A04 > this.A02) {
                                    arrayList.add(obj);
                                }
                            }
                            HashSet hashSet = new HashSet();
                            TreeSet treeSet = new TreeSet();
                            HashSet hashSet2 = new HashSet();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                AbstractC73479YFc abstractC73479YFc = (AbstractC73479YFc) ((YRN) it.next());
                                int i2 = abstractC73479YFc.A02;
                                float f = abstractC73479YFc.A01;
                                YQ3 yq3 = abstractC73479YFc.A03;
                                C18C.A07(yq3, "must initialize with brush before retrieving brush");
                                hashSet.add(yq3.Aia());
                                treeSet.add(Float.valueOf(f));
                                hashSet2.add(Integer.valueOf(i2));
                            }
                            C8PO c8po = this.A0H;
                            boolean z2 = !arrayList.isEmpty();
                            int size = hashSet2.size();
                            if (!treeSet.isEmpty()) {
                                Object last = treeSet.last();
                                last.getClass();
                                i = ((Number) last).intValue();
                            } else {
                                i = -1;
                            }
                            c8po.Cj7(size, i, treeSet.size(), arrayList.size(), hashSet.size(), this.A01, z2);
                        } else {
                            this.A0H.Cj7(0, -1, 0, 0, 0, 0, false);
                        }
                    }
                    ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t2 = this.A0c;
                    if (viewOnTouchListenerC1829889t2 != null) {
                        viewOnTouchListenerC1829889t2.A04();
                    }
                    StrokeWidthTool strokeWidthTool2 = this.A0M;
                    strokeWidthTool2.setStrokeWidthButtonShowing(true);
                    this.A0a.A02(false);
                    View view2 = this.A03;
                    view2.getClass();
                    C150956qv.A08(new View[]{view2, strokeWidthTool2, this.A0K, this.A0L, this.A0f}, false);
                    if (this.A0G.A04()) {
                        boolean z3 = this.A0h;
                        View[] viewArr = {A00(this).A00};
                        if (!z3) {
                            AbstractC125325le.A04(null, viewArr, false);
                        } else {
                            C150956qv.A08(viewArr, false);
                        }
                        A00(this).A00.setEnabled(false);
                    }
                    if (z) {
                        if (this.A0i != null) {
                            GLDrawingView gLDrawingView3 = A00(this).A00;
                            RunnableC24707Awo runnableC24707Awo2 = new RunnableC24707Awo(gLDrawingView3, null);
                            X1v x1v2 = gLDrawingView3.A05;
                            if (x1v2 != null) {
                                x1v2.A07(runnableC24707Awo2);
                            }
                        }
                        A0D(-1);
                        A03(this.A0I, this, true);
                        break;
                    }
                    break;
                case 2:
                    C150956qv.A08(new View[]{this.A0L}, true);
                    strokeWidthTool = this.A0M;
                    strokeWidthTool.setStrokeWidthButtonShowing(false);
                    View view3 = this.A03;
                    view3.getClass();
                    interfaceC125355lh = null;
                    AbstractC125325le.A04(null, new View[]{view3, this.A0K, strokeWidthTool, this.A0f}, true);
                    A02();
                    A07(false);
                    AbstractC125325le.A04(interfaceC125355lh, new View[]{A00(this).A00}, false);
                    A00(this).A00.setEnabled(true);
                    strokeWidthTool.setCollapsedIcon(this.A0Y);
                    break;
                case 3:
                    this.A0a.A02(true);
                    View view4 = this.A03;
                    view4.getClass();
                    C150956qv.A08(new View[]{view4, this.A0K, this.A0f, this.A0M, this.A0L}, true);
                    AbstractC125325le.A04(null, new View[]{A00(this).A00}, false);
                    A00(this).A00.setEnabled(true);
                    break;
                case 4:
                    strokeWidthTool = this.A0M;
                    strokeWidthTool.setStrokeWidthButtonShowing(false);
                    View view5 = this.A03;
                    view5.getClass();
                    View[] viewArr2 = {view5, this.A0K, strokeWidthTool, this.A0L, this.A0f};
                    C55942hf c55942hf = C150956qv.A02;
                    interfaceC125355lh = null;
                    AbstractC125325le.A04(null, viewArr2, true);
                    A07(false);
                    A02();
                    AbstractC125325le.A04(interfaceC125355lh, new View[]{A00(this).A00}, false);
                    A00(this).A00.setEnabled(true);
                    strokeWidthTool.setCollapsedIcon(this.A0Y);
                    break;
                default:
                    this.A0a.A02(true);
                    View view6 = this.A03;
                    view6.getClass();
                    C150956qv.A08(new View[]{view6, this.A0K, this.A0f, this.A0M, this.A0L}, true);
                    break;
            }
            if (A08(this)) {
                if (!A08) {
                    this.A0e.DWb(this);
                    A01();
                    this.A0M.A0J = this;
                    ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t3 = this.A0c;
                    if (viewOnTouchListenerC1829889t3 != null) {
                        viewOnTouchListenerC1829889t3.A06(this);
                    }
                }
            } else if (A08) {
                this.A0e.D5W(this);
                ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t4 = this.A0c;
                if (viewOnTouchListenerC1829889t4 != null) {
                    viewOnTouchListenerC1829889t4.A09.remove(this);
                }
            }
            InterfaceC1818984z interfaceC1818984z = this.A0d;
            if (interfaceC1818984z != null) {
                if (this.A06 == C05F.A0N) {
                    interfaceC1818984z.CMm();
                } else {
                    interfaceC1818984z.Elu();
                }
            }
        }
    }

    @Override // X.InterfaceC183698Cu
    public final boolean CKr() {
        if (this.A0i != null && (!A00(this).A00.A0E.A0H.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC185958Mp
    public final void DFM() {
        A0E(C05F.A0j);
    }

    @Override // X.C8PS
    public final void Dsw() {
        FloatingIndicator floatingIndicator = this.A0g;
        floatingIndicator.getClass();
        floatingIndicator.A00();
    }

    @Override // X.C8PS
    public final void Dsx(float f, float f2) {
        FloatingIndicator floatingIndicator = this.A0g;
        floatingIndicator.getClass();
        float f3 = f + this.A0W;
        StrokeWidthTool strokeWidthTool = this.A0M;
        floatingIndicator.A01(f, f2, f3, f2, strokeWidthTool.A07 * strokeWidthTool.A0U, this.A0A, 0, 0L, true);
    }

    @Override // X.C8PS
    public final void Dyc(float f, float f2) {
        this.A09 = this.A0M.A07;
        A00(this).A00.setBrushSize(this.A09);
    }

    @Override // X.C8BD
    public final boolean onBackPressed() {
        Integer num = this.A06;
        if (num != C05F.A0Y && num != C05F.A0N) {
            if (num == C05F.A0C) {
                A0E(C05F.A01);
            } else {
                return false;
            }
        } else {
            GLDrawingView gLDrawingView = A00(this).A00;
            RunnableC24706Awn runnableC24706Awn = new RunnableC24706Awn(gLDrawingView, new RunnableC24353Aqw(this));
            X1v x1v = gLDrawingView.A05;
            if (x1v != null) {
                x1v.A07(runnableC24706Awn);
                return true;
            }
        }
        return true;
    }

    public C8PR(Context context, Resources resources, ViewStub viewStub, ViewStub viewStub2, UserSession userSession, C57012jc c57012jc, C8D9 c8d9, C8PQ c8pq, C8PO c8po, ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t, InterfaceC1818984z interfaceC1818984z, InterfaceC143326dX interfaceC143326dX, FittingTextView fittingTextView, FittingTextView fittingTextView2, EyedropperColorPickerTool eyedropperColorPickerTool, FloatingIndicator floatingIndicator, StrokeWidthTool strokeWidthTool, boolean z) {
        this.A0E = userSession;
        this.A0C = context;
        this.A0e = interfaceC143326dX;
        this.A0G = c57012jc;
        this.A0c = viewOnTouchListenerC1829889t;
        this.A0H = c8po;
        this.A0b = c8pq;
        this.A0h = z;
        this.A0f = eyedropperColorPickerTool;
        this.A0Y = resources.getDrawable(R.drawable.overlay_brush_size);
        C8PW c8pw = new C8PW(this);
        this.A0N = c8pw;
        C8PX c8px = new C8PX(userSession, c8pw);
        this.A0O = c8px;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        this.A0W = TypedValue.applyDimension(1, 100.0f, displayMetrics);
        this.A0g = floatingIndicator;
        this.A0M = strokeWidthTool;
        strokeWidthTool.setColour(-1);
        this.A0a = c8d9;
        this.A0K = fittingTextView;
        this.A0L = fittingTextView2;
        this.A0X = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A0d = interfaceC1818984z;
        c57012jc.A02 = new InterfaceC69513Al() { // from class: X.8Ph
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C8PR c8pr = C8PR.this;
                GLDrawingView gLDrawingView = (GLDrawingView) view;
                synchronized (c8pr) {
                    if (c8pr.A0i == null) {
                        c8pr.A0i = new C22878A6y(c8pr, gLDrawingView);
                    }
                }
            }
        };
        C57012jc c57012jc2 = new C57012jc(viewStub);
        this.A0Z = c57012jc2;
        this.A0F = new C57012jc(viewStub2);
        c57012jc2.A02 = new InterfaceC69513Al() { // from class: X.8Pi
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                final C8PR c8pr = C8PR.this;
                c8pr.A03 = view;
                C8PR.A04(c8pr);
                View view2 = c8pr.A03;
                view2.getClass();
                AbstractC13880nE.A0q(view2, new Runnable() { // from class: X.9Lv
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8PR c8pr2 = C8PR.this;
                        View view3 = c8pr2.A03;
                        view3.getClass();
                        AbstractC13880nE.A0u(view3, new CallableC24924B0x(c8pr2, 4));
                        View view4 = c8pr2.A03;
                        view4.getClass();
                        int width = view4.getWidth();
                        FittingTextView fittingTextView3 = c8pr2.A0K;
                        fittingTextView3.getClass();
                        int minWidth = width + fittingTextView3.getMinWidth();
                        FittingTextView fittingTextView4 = c8pr2.A0L;
                        fittingTextView4.getClass();
                        int minWidth2 = minWidth + fittingTextView4.getMinWidth();
                        boolean z2 = false;
                        View view5 = c8pr2.A03;
                        view5.getClass();
                        Object parent = view5.getParent();
                        parent.getClass();
                        if (((View) parent).getWidth() <= minWidth2) {
                            z2 = true;
                        }
                        c8pr2.A08 = z2;
                        if (z2) {
                            c8pr2.A03 = c8pr2.A0F.A01();
                            C8PR.A04(c8pr2);
                            Context context2 = c8pr2.A0C;
                            c8pr2.A05 = new C8QJ(context2, c8pr2.A0E, Integer.valueOf(R.drawable.overflow_popup_menu_background_updated_blur), true);
                            c8pr2.A04 = c8pr2.A03.requireViewById(R.id.drawing_overflow_button);
                            c8pr2.A07 = "NoDisplayedBrush";
                            int i = 0;
                            while (true) {
                                List list = c8pr2.A0T;
                                if (i >= list.size()) {
                                    break;
                                }
                                Object obj = list.get(i);
                                Object obj2 = c8pr2.A0U.get(obj);
                                obj2.getClass();
                                c8pr2.A0S.put(obj2, obj);
                                i++;
                            }
                            View view6 = c8pr2.A04;
                            view6.getClass();
                            view6.setVisibility(0);
                            View view7 = c8pr2.A04;
                            view7.getClass();
                            C216559iC.A02(AbstractC166987dD.A0s(view7), c8pr2, 4);
                            TreeMap treeMap = new TreeMap();
                            for (C8PV c8pv : C8PV.values()) {
                                if (!c8pv.equals(c8pr2.A0J)) {
                                    treeMap.put(Integer.valueOf(c8pv.A01), c8pv);
                                }
                            }
                            Iterator A0k = AbstractC167007dF.A0k(treeMap);
                            while (A0k.hasNext()) {
                                C8PV c8pv2 = (C8PV) A0k.next();
                                int i2 = c8pv2.A03;
                                String string = context2.getString(i2);
                                Drawable drawable = context2.getDrawable(c8pv2.A02);
                                C23951Ajl c23951Ajl = new C23951Ajl(c8pv2, c8pr2, i2);
                                C14360o3.A0B(string, 1);
                                C199928sw c199928sw = new C199928sw(null, drawable, null, c23951Ajl, null, string, 0, 0, 0, false, false, false, true, false, false, false);
                                c8pr2.A0R.add(c199928sw);
                                c8pr2.A0V.put(Integer.valueOf(i2), c199928sw);
                            }
                            C8QJ c8qj = c8pr2.A05;
                            c8qj.getClass();
                            c8qj.A02(c8pr2.A0R);
                            C8PR.A05(c8pr2, c8pr2.A0I.A03);
                        }
                    }
                });
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(C186668Pj.A00("Pen"));
        arrayList.add(C186668Pj.A00("Marker"));
        arrayList.add(C186668Pj.A00("Neon"));
        arrayList.add(C186668Pj.A00("Eraser"));
        arrayList.add(C186668Pj.A00("Special"));
        arrayList.add(C186668Pj.A00("Arrow"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C186668Pj c186668Pj = (C186668Pj) it.next();
            C186688Pl c186688Pl = new C186688Pl(c8px.A03, c8px, c8px.A05, c186668Pj);
            c8px.A06.add(c186688Pl);
            X1v x1v = c8px.A00;
            if (x1v != null) {
                c186688Pl.DIn(x1v, c8px.A02);
            }
            c186688Pl.A05.A04(new Object());
        }
        View[] viewArr = {fittingTextView, fittingTextView2, eyedropperColorPickerTool};
        int i = 0;
        do {
            View view = viewArr[i];
            if (view != null) {
                AbstractC56952jT.A04(view, C05F.A01);
            }
            i++;
        } while (i < 3);
    }

    private void A02() {
        Integer num;
        if (A00(this).A00.getBrush() != null) {
            if ((!r0.CN8()) && ((num = this.A06) == C05F.A0Y || num == C05F.A0C || num == C05F.A0u)) {
                this.A0a.A03(true, this.A0b.Ek8());
                EyedropperColorPickerTool eyedropperColorPickerTool = this.A0f;
                C55942hf c55942hf = C150956qv.A02;
                AbstractC125325le.A04(null, new View[]{eyedropperColorPickerTool}, true);
                int i = this.A0B;
                this.A0A = i;
                this.A0M.setColour(i);
                eyedropperColorPickerTool.getClass();
                eyedropperColorPickerTool.setColor(this.A0A);
                return;
            }
            ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = this.A0c;
            if (viewOnTouchListenerC1829889t != null) {
                viewOnTouchListenerC1829889t.A04();
            }
            this.A0a.A02(true);
            C150956qv.A08(new View[]{this.A0f}, true);
            this.A0A = -1;
            this.A0M.setColour(-1);
        }
    }

    private void A07(boolean z) {
        YQ3 brush = A00(this).A00.getBrush();
        if (brush != null) {
            float f = this.A09;
            if (f == -1.0f || z) {
                f = brush.AwP();
                this.A09 = f;
            }
            this.A0M.setStrokeWidthDp(f);
            brush.EeR(this.A09);
        }
    }

    public final void A0B() {
        if (A08(this)) {
            GLDrawingView gLDrawingView = A00(this).A00;
            RunnableC24706Awn runnableC24706Awn = new RunnableC24706Awn(gLDrawingView, new RunnableC24353Aqw(this));
            X1v x1v = gLDrawingView.A05;
            if (x1v != null) {
                x1v.A07(runnableC24706Awn);
            }
            ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = this.A0c;
            if (viewOnTouchListenerC1829889t != null) {
                viewOnTouchListenerC1829889t.A04();
            }
        }
    }

    public final void A0C() {
        Integer num;
        this.A02 = System.currentTimeMillis();
        this.A01 = 0;
        this.A0H.Cll();
        int i = this.A00;
        FittingTextView fittingTextView = this.A0L;
        if (fittingTextView != null) {
            fittingTextView.setMaxWidth(i);
        }
        FittingTextView fittingTextView2 = this.A0K;
        if (fittingTextView2 != null) {
            fittingTextView2.setMaxWidth(i);
        }
        if (!A00(this).A00.A0E.A0H.isEmpty()) {
            num = C05F.A0Y;
        } else {
            num = C05F.A0C;
        }
        A0E(num);
        this.A0M.A07();
    }

    @Override // X.InterfaceC183698Cu
    public final Bitmap AzW(int i, int i2) {
        return A00(this).A00.getBitmap(i, i2);
    }

    @Override // X.InterfaceC183698Cu
    public final Bitmap AzX(Bitmap bitmap) {
        return A00(this).A00.getBitmap();
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        Integer num;
        A0D(i);
        if (!A00(this).A00.A0E.A0H.isEmpty()) {
            num = C05F.A0Y;
        } else {
            num = C05F.A0C;
        }
        A0E(num);
    }
}
