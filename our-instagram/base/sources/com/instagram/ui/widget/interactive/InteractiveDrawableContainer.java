package com.instagram.ui.widget.interactive;

import X.AHh;
import X.AN9;
import X.AbstractC125325le;
import X.AbstractC130945vi;
import X.AbstractC13160m2;
import X.AbstractC13560mi;
import X.AbstractC16960so;
import X.AbstractC202988yG;
import X.AbstractC209069Mo;
import X.AbstractC87043uM;
import X.AnonymousClass051;
import X.AnonymousClass815;
import X.AnonymousClass848;
import X.BD4;
import X.BEd;
import X.C00O;
import X.C01T;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C124425jy;
import X.C124435jz;
import X.C128535rM;
import X.C131375wS;
import X.C131395wU;
import X.C131405wV;
import X.C14360o3;
import X.C1817884n;
import X.C18U;
import X.C194808jg;
import X.C202278x7;
import X.C221009pO;
import X.C221639qS;
import X.C24087AmY;
import X.C2n2;
import X.C55942hf;
import X.C55982hj;
import X.C55U;
import X.C57012jc;
import X.C5RO;
import X.C5RQ;
import X.C668630d;
import X.C6RB;
import X.C80Q;
import X.C89G;
import X.C8D0;
import X.C8FC;
import X.C8FD;
import X.C8P8;
import X.C9LJ;
import X.InterfaceC131365wR;
import X.InterfaceC1818784x;
import X.InterfaceC1829489p;
import X.InterfaceC187268Rt;
import X.InterfaceC28041Xi;
import X.InterfaceC55932he;
import X.RunnableC24495AtE;
import X.RunnableC24875Aza;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class InteractiveDrawableContainer extends FrameLayout implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, InterfaceC131365wR, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public UserSession A06;
    public C55U A07;
    public InterfaceC1818784x A08;
    public InterfaceC187268Rt A09;
    public BEd A0A;
    public BEd A0B;
    public BEd A0C;
    public AnonymousClass848 A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public float A0U;
    public float A0V;
    public long A0W;
    public long A0X;
    public AnonymousClass815 A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final int A0d;
    public final int A0e;
    public final Matrix A0f;
    public final Matrix A0g;
    public final Rect A0h;
    public final Rect A0i;
    public final RectF A0j;
    public final View A0k;
    public final View A0l;
    public final View A0m;
    public final C55982hj A0n;
    public final C131405wV A0o;
    public final C131395wU A0p;
    public final C131375wS A0q;
    public final List A0r;
    public final List A0s;
    public final Set A0t;
    public final Set A0u;
    public final Paint A0v;
    public final Paint A0w;
    public final Path A0x;
    public final PointF A0y;
    public final PointF A0z;
    public final PointF A10;
    public final GestureDetector A11;
    public final GestureDetector A12;
    public final GestureDetector A13;
    public final ScaleGestureDetector A14;
    public final C55982hj A15;
    public final InterfaceC55932he A16;
    public final C124425jy A17;
    public final C124435jz A18;
    public static final C55942hf A1A = C55942hf.A04(80.0d, 9.0d);
    public static final C55942hf A19 = C55942hf.A03(2.0d, 60.0d);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractiveDrawableContainer(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public static final void A06(InteractiveDrawableContainer interactiveDrawableContainer) {
        interactiveDrawableContainer.A0N = true;
        View view = interactiveDrawableContainer.A0l;
        AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
        A01.A0P(1.0f, view.getPivotX());
        A01.A0Q(1.0f, view.getPivotY());
        A01.A0H();
        AbstractC125325le.A03(interactiveDrawableContainer.A0k, new C24087AmY(interactiveDrawableContainer), 8, true);
        C55982hj c55982hj = interactiveDrawableContainer.A15;
        if (c55982hj.A09.A00 > 0.0d) {
            BEd activeDrawable = interactiveDrawableContainer.getActiveDrawable();
            interactiveDrawableContainer.A0A = null;
            if (activeDrawable != null) {
                interactiveDrawableContainer.A0C(activeDrawable);
                interactiveDrawableContainer.A0u.remove(Integer.valueOf(((C9LJ) activeDrawable).A0f));
            }
            interactiveDrawableContainer.invalidate();
            if (activeDrawable != null) {
                C9LJ c9lj = (C9LJ) activeDrawable;
                if (c9lj.A0a) {
                    c9lj.A0H = "";
                    c9lj.A0X = false;
                }
                if (c9lj.A0X) {
                    Object C4x = activeDrawable.C4x();
                    C14360o3.A0C(C4x, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.DrawableConfig");
                    Object obj = ((C8FC) C4x).A0C;
                    ListIterator drawableIterator = interactiveDrawableContainer.getDrawableIterator();
                    ArrayList arrayList = new ArrayList();
                    while (drawableIterator.hasNext()) {
                        BD4 bd4 = (BD4) drawableIterator.next();
                        Object C4x2 = bd4.C4x();
                        C14360o3.A0C(C4x2, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.DrawableConfig");
                        Object obj2 = ((C8FC) C4x2).A0C;
                        if (obj != null && obj.equals(obj2)) {
                            arrayList.add(bd4);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        BEd bEd = (BEd) it.next();
                        interactiveDrawableContainer.A0C(bEd);
                        Set set = interactiveDrawableContainer.A0u;
                        C9LJ c9lj2 = (C9LJ) bEd;
                        int i = c9lj2.A0f;
                        set.remove(Integer.valueOf(i));
                        if (bEd == interactiveDrawableContainer.A0A) {
                            interactiveDrawableContainer.A0A = null;
                        }
                        Iterator it2 = interactiveDrawableContainer.A0t.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1829489p) it2.next()).Dep(c9lj2.A0B, i, false);
                        }
                    }
                }
                Iterator it3 = interactiveDrawableContainer.A0t.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1829489p) it3.next()).Dep(c9lj.A0B, c9lj.A0f, true);
                }
            }
            c55982hj.A0B(interactiveDrawableContainer.A16);
            c55982hj.A05(0.0d);
        }
        Iterator it4 = interactiveDrawableContainer.A0t.iterator();
        while (it4.hasNext()) {
            ((InterfaceC1829489p) it4.next()).DuD();
        }
    }

    private final ListIterator getDrawableIterator() {
        return getInteractiveDrawables().listIterator(0);
    }

    public final int A0I(Drawable drawable, C8FC c8fc) {
        C14360o3.A0B(drawable, 0);
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C9LJ c9lj = (C9LJ) ((BD4) drawableIterator.next());
            if (c9lj.A0B == drawable) {
                return c9lj.A0f;
            }
        }
        return A0J(drawable, c8fc, false, false, false);
    }

    public final int A0J(Drawable drawable, C8FC c8fc, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(drawable, 0);
        UserSession userSession = this.A06;
        Context context = getContext();
        C14360o3.A07(context);
        C9LJ c9lj = new C9LJ(context, drawable, userSession, getMaxZ() + 1, z, z2);
        this.A0A = c9lj;
        C131375wS c131375wS = this.A0q;
        C14360o3.A0B(c131375wS, 0);
        c9lj.A0C = c131375wS;
        if (c8fc != null) {
            AHh.A00(c8fc, c9lj);
            if (c8fc.A0F) {
                C55982hj c55982hj = c9lj.A0h;
                c55982hj.A05(c9lj.A0d);
                c55982hj.A06(1.0d);
            }
            if (c8fc.A0N) {
                AbstractC13160m2.A00(c9lj.A0B, 0, 255, 150L);
            }
            C8FD c8fd = c8fc.A07;
            if (c8fd != null) {
                if (c8fd.A04) {
                    c9lj.EZk(0.0f);
                    c9lj.EZl(c8fd.A00);
                    c9lj.Ed5(c8fd.A01);
                }
                c9lj.A0D = c8fd;
                if (c8fd.A04) {
                    c9lj.A0U = true;
                    C9LJ.A05(c9lj);
                }
            }
            C89G c89g = c8fc.A08;
            if (c89g != null) {
                c9lj.A0E = c89g;
                c89g.DM8(c9lj.A0f);
            }
            C8D0 c8d0 = c8fc.A06;
            if (c8d0 == null) {
                c8d0 = new C221639qS(17, 0.0f, 0.0f);
            }
            RunnableC24875Aza runnableC24875Aza = new RunnableC24875Aza(drawable, c8d0, c8fc, this, c9lj);
            if (isLaidOut()) {
                runnableC24875Aza.run();
            } else {
                this.A0s.add(runnableC24875Aza);
            }
        }
        A09(this, c9lj);
        if (z3 && c8fc != null) {
            c9lj.A0H = c8fc;
        }
        A08(this);
        invalidate();
        Iterator it = this.A0t.iterator();
        while (it.hasNext()) {
            ((InterfaceC1829489p) it.next()).Cvp(c9lj.A0B, c9lj.A0f);
        }
        return c9lj.A0f;
    }

    public final Rect A0K(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        Rect rect = new Rect();
        RectF rectF = new RectF();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BEd bEd = (BEd) drawableIterator.next();
            C9LJ c9lj = (C9LJ) bEd;
            if (c9lj.A0B == drawable) {
                Matrix matrix = this.A0g;
                bEd.CAX(matrix);
                Rect copyBounds = c9lj.A0B.copyBounds();
                rectF.set(copyBounds);
                matrix.mapRect(rectF);
                rectF.round(copyBounds);
                return copyBounds;
            }
        }
        return rect;
    }

    public final ArrayList A0T(Class cls) {
        C14360o3.A0B(cls, 0);
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            Drawable drawable = ((C9LJ) ((BD4) drawableIterator.next())).A0B;
            if (cls.isInstance(drawable)) {
                Object cast = cls.cast(drawable);
                C14360o3.A07(cast);
                arrayList.add(cast);
            }
        }
        return arrayList;
    }

    public final HashMap A0X(Set set) {
        C14360o3.A0B(set, 0);
        HashMap hashMap = new HashMap();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BD4 bd4 = (BD4) drawableIterator.next();
            if (bd4 != null) {
                C9LJ c9lj = (C9LJ) bd4;
                Integer valueOf = Integer.valueOf(c9lj.A0f);
                if (set.contains(valueOf)) {
                    hashMap.put(valueOf, c9lj.A0B);
                }
            }
        }
        return hashMap;
    }

    public final void A0f(int i, boolean z) {
        if (i != -1) {
            BEd A02 = A02(this, i);
            if (A02 != null) {
                ((C9LJ) A02).A0B.setVisible(z, false);
            }
            A07(this);
        }
    }

    public final void A0i(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C9LJ c9lj = (C9LJ) ((BEd) drawableIterator.next());
            if (c9lj.A0B == drawable) {
                c9lj.A0K = true;
                return;
            }
        }
    }

    public final void A0j(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        ListIterator drawableIterator = getDrawableIterator();
        while (true) {
            if (!drawableIterator.hasNext()) {
                break;
            }
            Drawable drawable2 = ((C9LJ) ((BEd) drawableIterator.next())).A0B;
            if (drawable2 == drawable) {
                AbstractC13160m2.A00(drawable2, 0, 255, 150L);
                break;
            }
        }
        A07(this);
    }

    public final void A0q(Drawable drawable, boolean z) {
        C14360o3.A0B(drawable, 0);
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C9LJ c9lj = (C9LJ) ((BD4) drawableIterator.next());
            if (c9lj.A0B == drawable) {
                BEd A02 = A02(this, c9lj.A0f);
                if (A02 != null) {
                    ((C9LJ) A02).A0N = z;
                    return;
                }
                return;
            }
        }
    }

    public final void A0s(InterfaceC28041Xi interfaceC28041Xi) {
        C14360o3.A0B(interfaceC28041Xi, 0);
        ListIterator drawableIterator = getDrawableIterator();
        ArrayList arrayList = new ArrayList();
        while (drawableIterator.hasNext()) {
            BD4 bd4 = (BD4) drawableIterator.next();
            if (interfaceC28041Xi.apply(((C9LJ) bd4).A0B)) {
                arrayList.add(bd4);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BEd bEd = (BEd) it.next();
            A0C(bEd);
            Set set = this.A0u;
            C9LJ c9lj = (C9LJ) bEd;
            int i = c9lj.A0f;
            set.remove(Integer.valueOf(i));
            if (bEd == this.A0A) {
                this.A0A = null;
            }
            Iterator it2 = this.A0t.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1829489p) it2.next()).Dep(c9lj.A0B, i, false);
            }
        }
    }

    public final void A0t(InterfaceC28041Xi interfaceC28041Xi) {
        ListIterator drawableIterator = getDrawableIterator();
        ArrayList arrayList = new ArrayList();
        while (drawableIterator.hasNext()) {
            BD4 bd4 = (BD4) drawableIterator.next();
            Object C4x = bd4.C4x();
            C14360o3.A0C(C4x, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.DrawableConfig");
            if (interfaceC28041Xi.apply(((C8FC) C4x).A0C)) {
                arrayList.add(bd4);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BEd bEd = (BEd) it.next();
            A0C(bEd);
            Set set = this.A0u;
            C9LJ c9lj = (C9LJ) bEd;
            int i = c9lj.A0f;
            set.remove(Integer.valueOf(i));
            if (bEd == this.A0A) {
                this.A0A = null;
            }
            Iterator it2 = this.A0t.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1829489p) it2.next()).Dep(c9lj.A0B, i, false);
            }
        }
    }

    public final void A0v(InterfaceC1829489p interfaceC1829489p) {
        C14360o3.A0B(interfaceC1829489p, 0);
        this.A0t.add(interfaceC1829489p);
    }

    public final void A0w(InterfaceC1829489p interfaceC1829489p) {
        C14360o3.A0B(interfaceC1829489p, 0);
        this.A0t.remove(interfaceC1829489p);
    }

    public final boolean A10(Integer num) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            if (((C9LJ) ((BEd) drawableIterator.next())).A0G == num) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A0S && this.A18.A05(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A0a = true;
        this.A0P = false;
        this.A0J = false;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e8, code lost:
    
        if (r7.A02(r15) == null) goto L81;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r38) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A0b = true;
        Set set = this.A0t;
        if (!set.isEmpty()) {
            BEd activeDrawable = getActiveDrawable();
            if (this.A0Z && activeDrawable != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C9LJ c9lj = (C9LJ) activeDrawable;
                    ((InterfaceC1829489p) it.next()).DQa(c9lj.A0B, c9lj.A0f, motionEvent.getX(), motionEvent.getY());
                }
                return;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1829489p) it2.next()).DQk();
            }
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        BEd activeDrawable;
        BEd activeDrawable2;
        C14360o3.A0B(scaleGestureDetector, 0);
        if (!this.A0Z || ((this.A0H && (activeDrawable2 = getActiveDrawable()) != null && !this.A0E.contains(((C9LJ) activeDrawable2).A0B)) || ((activeDrawable = getActiveDrawable()) != null && ((C9LJ) activeDrawable).A0M))) {
            return true;
        }
        PointF pointF = this.A0y;
        PointF pointF2 = this.A0z;
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        pointF2.x = scaleGestureDetector.getFocusX();
        pointF2.y = scaleGestureDetector.getFocusY();
        BEd activeDrawable3 = getActiveDrawable();
        if (activeDrawable3 != null) {
            C9LJ c9lj = (C9LJ) activeDrawable3;
            c9lj.Ed5(c9lj.A04 * scaleGestureDetector.getScaleFactor());
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        boolean z = false;
        C14360o3.A0B(scaleGestureDetector, 0);
        BEd activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            C9LJ c9lj = (C9LJ) activeDrawable;
            if (c9lj.A0R) {
                z = true;
                if (c9lj.A0U) {
                    c9lj.A0P = true;
                    c9lj.A0S = true;
                }
                PointF pointF = this.A0y;
                pointF.x = scaleGestureDetector.getFocusX();
                pointF.y = scaleGestureDetector.getFocusY();
                PointF pointF2 = this.A0z;
                pointF2.x = scaleGestureDetector.getFocusX();
                pointF2.y = scaleGestureDetector.getFocusY();
            }
        }
        return z;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        BEd bEd;
        BEd activeDrawable;
        C9LJ c9lj;
        C8FD c8fd;
        C14360o3.A0B(motionEvent, 0);
        boolean z = this.A0Z;
        this.A0L = z;
        if (z && (activeDrawable = getActiveDrawable()) != null && (c8fd = (c9lj = (C9LJ) activeDrawable).A0D) != null && c8fd.A03 == C05F.A00) {
            if (c9lj.A0U) {
                C9LJ.A03(c9lj);
            } else {
                C9LJ.A02(c9lj);
            }
        }
        Set<InterfaceC1829489p> set = this.A0t;
        if (!set.isEmpty()) {
            BEd activeDrawable2 = getActiveDrawable();
            if (activeDrawable2 != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Matrix matrix = this.A0g;
                activeDrawable2.CAX(matrix);
                Matrix matrix2 = this.A0f;
                matrix.invert(matrix2);
                float[] fArr = {x, y};
                matrix2.mapPoints(fArr);
                for (InterfaceC1829489p interfaceC1829489p : set) {
                    if (this.A0L) {
                        bEd = activeDrawable2;
                    } else {
                        bEd = this.A0B;
                        if (bEd == null) {
                            C9LJ c9lj2 = (C9LJ) activeDrawable2;
                            interfaceC1829489p.Dmm(c9lj2.A0B, fArr[0], fArr[1], motionEvent.getX(), motionEvent.getY(), c9lj2.A0f);
                        }
                    }
                    C9LJ c9lj3 = (C9LJ) bEd;
                    interfaceC1829489p.Dmk(c9lj3.A0B, c9lj3.A0f, fArr[0], fArr[1]);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return true;
    }

    public final void setAlignmentGuideAlignHorizontalMarginToUfiTower(boolean z) {
    }

    public final void setAlignmentGuideFooter(C57012jc c57012jc) {
        C14360o3.A0B(c57012jc, 0);
        C131405wV c131405wV = this.A0o;
        C131405wV.A00(c131405wV.A0D);
        c131405wV.A0D = c57012jc;
        C55982hj A02 = c131405wV.A0S.A02();
        A02.A0A(c131405wV);
        A02.A06 = true;
        A02.A09(C131405wV.A0h);
        A02.A05(0.0d);
        c131405wV.A0A = A02;
        c131405wV.A0I = false;
        c131405wV.A0P.setEmpty();
        addView(c57012jc.A01);
    }

    public final void setAlignmentGuideHeader(C57012jc c57012jc) {
        C14360o3.A0B(c57012jc, 0);
        C131405wV c131405wV = this.A0o;
        C131405wV.A00(c131405wV.A0E);
        c131405wV.A0E = c57012jc;
        C55982hj A02 = c131405wV.A0S.A02();
        A02.A0A(c131405wV);
        A02.A06 = true;
        A02.A09(C131405wV.A0h);
        A02.A05(0.0d);
        c131405wV.A0B = A02;
        c131405wV.A0I = false;
        c131405wV.A0P.setEmpty();
        addView(c57012jc.A01);
    }

    public final void setAlignmentGuideUfiTower(C57012jc c57012jc) {
        C14360o3.A0B(c57012jc, 0);
        C131405wV c131405wV = this.A0o;
        C131405wV.A00(c131405wV.A0F);
        c131405wV.A0F = c57012jc;
        C55982hj A02 = c131405wV.A0S.A02();
        A02.A0A(c131405wV);
        A02.A06 = true;
        A02.A09(C131405wV.A0h);
        A02.A05(0.0d);
        c131405wV.A0C = A02;
        c131405wV.A0I = false;
        c131405wV.A0P.setEmpty();
        addView(c57012jc.A01);
    }

    public final void setCameraDestination(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        if (this.A07 != c55u) {
            this.A07 = c55u;
            C131405wV c131405wV = this.A0o;
            c131405wV.A0d.A00(0, 0);
            c131405wV.A0L = false;
            this.A0K = false;
        }
    }

    public final void setPropertyListener(Drawable drawable, C89G c89g) {
        C14360o3.A0B(c89g, 1);
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            C9LJ c9lj = (C9LJ) A00;
            c9lj.A0E = c89g;
            c89g.DM8(c9lj.A0f);
        }
    }

    public final void setStickersWithGesturesEnabled(Drawable... drawableArr) {
        C14360o3.A0B(drawableArr, 0);
        this.A0E = new ArrayList(AbstractC16960so.A1Q(Arrays.copyOf(drawableArr, drawableArr.length)));
    }

    public static final ArrayList A03(InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = interactiveDrawableContainer.getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BEd bEd = (BEd) drawableIterator.next();
            if (((C9LJ) bEd).A08 == i) {
                arrayList.add(bEd);
            }
        }
        return arrayList;
    }

    public static final void A08(InteractiveDrawableContainer interactiveDrawableContainer) {
        AnonymousClass848 anonymousClass848 = interactiveDrawableContainer.A0D;
        if (anonymousClass848 != null) {
            C1817884n c1817884n = ((ClipsCreationViewModel) anonymousClass848).A0N;
            List list = c1817884n.A00;
            C01T.A1C(list);
            c1817884n.A0A.Egh(list);
            return;
        }
        C01T.A1C(interactiveDrawableContainer.A0r);
    }

    public static final void A09(InteractiveDrawableContainer interactiveDrawableContainer, BEd bEd) {
        C131375wS c131375wS = interactiveDrawableContainer.A0q;
        C14360o3.A0B(c131375wS, 0);
        ((C9LJ) bEd).A0C = c131375wS;
        if (!interactiveDrawableContainer.A0M || !interactiveDrawableContainer.A0o.A0I) {
            interactiveDrawableContainer.A0M = true;
            RunnableC24495AtE runnableC24495AtE = new RunnableC24495AtE(interactiveDrawableContainer);
            if (interactiveDrawableContainer.isLaidOut()) {
                runnableC24495AtE.run();
            } else {
                interactiveDrawableContainer.A0s.add(runnableC24495AtE);
            }
        }
        bEd.Cp4(false);
        AnonymousClass848 anonymousClass848 = interactiveDrawableContainer.A0D;
        if (anonymousClass848 != null) {
            C1817884n c1817884n = ((ClipsCreationViewModel) anonymousClass848).A0N;
            List list = c1817884n.A00;
            list.add(bEd);
            c1817884n.A0A.Egh(list);
            c1817884n.A03.F8m(bEd);
        } else {
            interactiveDrawableContainer.A0r.add(bEd);
        }
        A07(interactiveDrawableContainer);
    }

    private final void A0B(BEd bEd) {
        if (bEd != null) {
            if (bEd == getActiveDrawable()) {
                if (this.A0Z) {
                    this.A0c = true;
                    return;
                } else if (this.A15.A01 == 1.0d) {
                    return;
                } else {
                    this.A0A = null;
                }
            }
            A0C(bEd);
            Set set = this.A0u;
            C9LJ c9lj = (C9LJ) bEd;
            int i = c9lj.A0f;
            set.remove(Integer.valueOf(i));
            invalidate();
            Iterator it = this.A0t.iterator();
            while (it.hasNext()) {
                ((InterfaceC1829489p) it.next()).Dep(c9lj.A0B, i, false);
            }
        }
    }

    private final void A0C(BEd bEd) {
        AnonymousClass848 anonymousClass848 = this.A0D;
        if (anonymousClass848 != null) {
            C14360o3.A0B(bEd, 0);
            C1817884n c1817884n = ((ClipsCreationViewModel) anonymousClass848).A0N;
            List list = c1817884n.A00;
            list.remove(bEd);
            c1817884n.A0A.Egh(list);
            c1817884n.A04.F8m(bEd);
        } else {
            if (this.A0A == bEd) {
                this.A0A = null;
            }
            this.A0r.remove(bEd);
        }
        A07(this);
    }

    private final void A0D(BEd bEd, boolean z) {
        this.A0A = bEd;
        if (z) {
            A05();
        }
        Iterator it = this.A0t.iterator();
        while (it.hasNext()) {
            C9LJ c9lj = (C9LJ) bEd;
            ((InterfaceC1829489p) it.next()).DCJ(c9lj.A0B, c9lj.A0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BEd getActiveDrawable() {
        BEd bEd = this.A0A;
        if (bEd == null) {
            bEd = null;
            int i = 0;
            ListIterator drawableIterator = getDrawableIterator();
            while (drawableIterator.hasNext()) {
                BEd bEd2 = (BEd) drawableIterator.next();
                int i2 = ((C9LJ) bEd2).A09;
                if (i2 >= i) {
                    bEd = bEd2;
                    i = i2;
                }
            }
            this.A0A = bEd;
        }
        return bEd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List getDrawableRealBounds() {
        ArrayList arrayList = new ArrayList();
        RectF rectF = new RectF();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BEd bEd = (BEd) drawableIterator.next();
            Matrix matrix = this.A0g;
            bEd.CAX(matrix);
            Rect copyBounds = ((C9LJ) bEd).A0B.copyBounds();
            C14360o3.A07(copyBounds);
            rectF.set(copyBounds);
            matrix.mapRect(rectF);
            rectF.round(copyBounds);
            arrayList.add(copyBounds);
        }
        return arrayList;
    }

    public final ArrayList A0R(InterfaceC28041Xi interfaceC28041Xi) {
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            Drawable drawable = ((C9LJ) ((BD4) drawableIterator.next())).A0B;
            if (interfaceC28041Xi.apply(drawable)) {
                arrayList.add(drawable);
            }
        }
        return arrayList;
    }

    public final ArrayList A0S(InterfaceC28041Xi interfaceC28041Xi) {
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C9LJ c9lj = (C9LJ) ((BD4) drawableIterator.next());
            Drawable drawable = c9lj.A0B;
            if (interfaceC28041Xi.apply(drawable)) {
                arrayList.add(new C09530e4(Integer.valueOf(c9lj.A0f), drawable));
            }
        }
        return arrayList;
    }

    public final ArrayList A0U(Class cls, Set set) {
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C9LJ c9lj = (C9LJ) ((BD4) drawableIterator.next());
            Drawable drawable = c9lj.A0B;
            if (drawable instanceof C194808jg) {
                C14360o3.A0C(drawable, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.RotatableDrawable");
                drawable = ((C194808jg) drawable).A04();
            }
            C14360o3.A0A(drawable);
            if (cls.isInstance(drawable) && set.contains(Integer.valueOf(c9lj.A0f))) {
                arrayList.add(drawable);
            }
        }
        return arrayList;
    }

    public final HashMap A0V(Class cls) {
        HashMap hashMap = new HashMap();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BEd bEd = (BEd) drawableIterator.next();
            Drawable drawable = ((C9LJ) bEd).A0B;
            if (cls.isInstance(drawable)) {
                hashMap.put(cls.cast(drawable), new C202278x7(this.A06, bEd));
            }
        }
        return hashMap;
    }

    public final HashMap A0W(Class cls) {
        HashMap hashMap = new HashMap();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BEd bEd = (BEd) drawableIterator.next();
            Drawable drawable = ((C9LJ) bEd).A0B;
            if (cls.isInstance(drawable)) {
                C14360o3.A0C(drawable, "null cannot be cast to non-null type com.instagram.reels.interactive.view.InteractiveCompoundDrawable");
                hashMap.put(((AbstractC130945vi) drawable).A09(), new C202278x7(this.A06, bEd));
            }
        }
        return hashMap;
    }

    public final void A0Z() {
        AnonymousClass848 anonymousClass848 = this.A0D;
        if (anonymousClass848 != null) {
            anonymousClass848.AI1();
        } else {
            this.A0A = null;
            this.A0r.clear();
        }
        A07(this);
        this.A0A = null;
        this.A0u.clear();
        this.A0E.clear();
        invalidate();
    }

    public final void A0g(Drawable drawable) {
        if (drawable != null) {
            ListIterator drawableIterator = getDrawableIterator();
            while (true) {
                if (!drawableIterator.hasNext()) {
                    break;
                }
                Drawable drawable2 = ((C9LJ) ((BEd) drawableIterator.next())).A0B;
                if (drawable2 == drawable) {
                    AbstractC13160m2.A00(drawable2, 255, 0, 150L);
                    break;
                }
            }
            A07(this);
        }
    }

    @Override // X.InterfaceC131365wR
    public final boolean DhV(C124425jy c124425jy) {
        BEd activeDrawable;
        if (!this.A0Z || (this.A0G && (activeDrawable = getActiveDrawable()) != null && !this.A0E.contains(((C9LJ) activeDrawable).A0B))) {
            return true;
        }
        BEd activeDrawable2 = getActiveDrawable();
        if (activeDrawable2 != null && ((C9LJ) activeDrawable2).A0M) {
            return true;
        }
        BEd activeDrawable3 = getActiveDrawable();
        if (activeDrawable3 != null) {
            float f = -((float) Math.toDegrees(Math.atan2(c124425jy.A03, c124425jy.A02) - Math.atan2(c124425jy.A01, c124425jy.A00)));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float f2 = ((C9LJ) activeDrawable3).A03;
            float f3 = f / ((float) (elapsedRealtime - this.A0W));
            Path path = this.A0x;
            RectF rectF = this.A0j;
            activeDrawable3.Are(path, rectF);
            activeDrawable3.Ecu(this.A0o.A05(rectF.centerX(), rectF.centerY(), f3, f2, f));
            this.A0W = elapsedRealtime;
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) ((AnonymousClass051) this.A18).A00;
    }

    public final InterfaceC1818784x getDelegate() {
        return this.A08;
    }

    public final boolean getDetectGestureOnLongPress() {
        return this.A0F;
    }

    public final List getInteractiveDrawables() {
        AnonymousClass848 anonymousClass848 = this.A0D;
        if (anonymousClass848 != null) {
            return ((ClipsCreationViewModel) anonymousClass848).A0N.A00;
        }
        return this.A0r;
    }

    public final boolean getTouchEnabled() {
        return this.A0S;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x036e, code lost:
    
        if (r5 != X.C05F.A00) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x039c, code lost:
    
        if (r1.A05 != X.C05F.A00) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x048a, code lost:
    
        if (r7.left >= r0.A03) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x049a, code lost:
    
        if (r7.right <= r0.A06) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04c7, code lost:
    
        if (r7.bottom > r1.A00) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x019d, code lost:
    
        if ((r77.A07 instanceof X.C81V) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c3, code lost:
    
        if (java.lang.Boolean.valueOf(X.C18U.A06(r6, r5, 36320180485300346L)).booleanValue() == false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x050b  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScroll(android.view.MotionEvent r78, android.view.MotionEvent r79, float r80, float r81) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public final void setAlignmentGuideAlignBottomMarginToFooter(boolean z) {
        this.A0o.A0G = z;
    }

    public final void setAlignmentGuideAlignTopMarginToHeader(boolean z) {
        this.A0o.A0H = z;
    }

    public final void setLongPressEnabled(boolean z) {
        this.A12.setIsLongpressEnabled(z);
    }

    public final void setMarginAlignmentGuideEnabled(boolean z) {
        this.A0o.A0K = z;
    }

    public final void setSelectedDrawable(Drawable drawable) {
        BEd bEd;
        if (drawable != null) {
            bEd = A00(drawable, this);
        } else {
            bEd = null;
        }
        this.A0B = bEd;
    }

    public static final BEd A00(Drawable drawable, InteractiveDrawableContainer interactiveDrawableContainer) {
        ListIterator drawableIterator = interactiveDrawableContainer.getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BEd bEd = (BEd) drawableIterator.next();
            if (((C9LJ) bEd).A0B == drawable || bEd.Afg() == drawable) {
                return bEd;
            }
        }
        return null;
    }

    public static final BEd A02(InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        ListIterator drawableIterator = interactiveDrawableContainer.getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BEd bEd = (BEd) drawableIterator.next();
            if (((C9LJ) bEd).A0f == i) {
                return bEd;
            }
        }
        return null;
    }

    private final void A05() {
        BEd activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            C9LJ c9lj = (C9LJ) activeDrawable;
            String str = c9lj.A0I;
            if (str != null) {
                ListIterator drawableIterator = getDrawableIterator();
                while (drawableIterator.hasNext()) {
                    C9LJ c9lj2 = (C9LJ) ((BEd) drawableIterator.next());
                    if (C14360o3.A0K(c9lj2.A0I, str)) {
                        c9lj2.A09 = getMaxZ() + 1;
                    }
                }
            }
            c9lj.A09 = getMaxZ() + 1;
            A08(this);
            invalidate();
        }
    }

    public static final void A07(InteractiveDrawableContainer interactiveDrawableContainer) {
        C80Q c80q;
        int drawableWithEffectCount = interactiveDrawableContainer.getDrawableWithEffectCount();
        UserSession userSession = interactiveDrawableContainer.A06;
        if (drawableWithEffectCount > 0 && userSession != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36323075293391778L) || C18U.A06(c06090Tz, userSession, 36323075293785000L)) {
                if (interactiveDrawableContainer.A0Y == null) {
                    Context context = interactiveDrawableContainer.getContext();
                    C14360o3.A07(context);
                    AnonymousClass815 anonymousClass815 = new AnonymousClass815(userSession, context, true);
                    interactiveDrawableContainer.A0Y = anonymousClass815;
                    C80Q c80q2 = anonymousClass815.A00;
                    if (c80q2 != null) {
                        c80q2.Enz();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        AnonymousClass815 anonymousClass8152 = interactiveDrawableContainer.A0Y;
        if (anonymousClass8152 != null) {
            synchronized (anonymousClass8152) {
                C80Q c80q3 = anonymousClass8152.A00;
                if (c80q3 != null) {
                    c80q3.Eoh();
                }
            }
        }
        AnonymousClass815 anonymousClass8153 = interactiveDrawableContainer.A0Y;
        if (anonymousClass8153 != null && (c80q = anonymousClass8153.A00) != null) {
            c80q.cleanup();
        }
        interactiveDrawableContainer.A0Y = null;
    }

    public static final void A0A(InteractiveDrawableContainer interactiveDrawableContainer, String str) {
        ListIterator drawableIterator = interactiveDrawableContainer.getDrawableIterator();
        while (drawableIterator.hasNext()) {
            ((C9LJ) ((BEd) drawableIterator.next())).A09 = interactiveDrawableContainer.getMaxZ() + 1;
        }
        ListIterator drawableIterator2 = interactiveDrawableContainer.getDrawableIterator();
        int i = 0;
        while (drawableIterator2.hasNext()) {
            C9LJ c9lj = (C9LJ) ((BEd) drawableIterator2.next());
            if (C14360o3.A0K(c9lj.A0I, str)) {
                i = Math.max(i, c9lj.A09);
            }
        }
        ListIterator drawableIterator3 = interactiveDrawableContainer.getDrawableIterator();
        while (drawableIterator3.hasNext()) {
            C9LJ c9lj2 = (C9LJ) ((BEd) drawableIterator3.next());
            if (c9lj2.A09 > i || C14360o3.A0K(c9lj2.A0I, str)) {
                c9lj2.A09 = interactiveDrawableContainer.getMaxZ() + 1;
            }
        }
        A08(interactiveDrawableContainer);
        interactiveDrawableContainer.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (java.lang.Boolean.valueOf(X.C18U.A06(X.C06090Tz.A05, r8.A06, 36320923514577914L)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0E(com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8, float r9, float r10, boolean r11) {
        /*
            java.util.List r0 = r8.getInteractiveDrawables()
            int r0 = r0.size()
            r7 = 0
            r4 = 1
            if (r0 <= r4) goto L28
            boolean r0 = r8.A0Q
            if (r0 == 0) goto L28
            com.instagram.common.session.UserSession r3 = r8.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320923514577914(0x8109b0000023fa, double:3.0328365110144585E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 == 0) goto L29
        L28:
            r6 = 0
        L29:
            r5 = 0
            java.util.List r0 = r8.getInteractiveDrawables()
            int r1 = r0.size()
            java.util.List r0 = r8.getInteractiveDrawables()
            java.util.ListIterator r3 = r0.listIterator(r1)
        L3a:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L6e
            java.lang.Object r2 = r3.previous()
            X.BEd r2 = (X.BEd) r2
            r1 = r2
            X.9LJ r1 = (X.C9LJ) r1
            android.graphics.drawable.Drawable r0 = r1.A0B
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L3a
            boolean r0 = r1.A0O
            if (r0 == 0) goto L3a
            boolean r0 = r1.A0N
            if (r0 == 0) goto L3a
            int r0 = r2.AJl(r9, r10)
            if (r0 != 0) goto L65
            if (r11 == 0) goto L6b
            r8.A0D(r2, r6)
            return r4
        L65:
            if (r0 != r4) goto L3a
            if (r5 != 0) goto L3a
            r5 = r2
            goto L3a
        L6b:
            r8.A0C = r2
            return r4
        L6e:
            if (r5 == 0) goto L79
            if (r11 == 0) goto L76
            r8.A0D(r5, r6)
            return r4
        L76:
            r8.A0C = r5
            return r4
        L79:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A0E(com.instagram.ui.widget.interactive.InteractiveDrawableContainer, float, float, boolean):boolean");
    }

    private final int getDrawableWithEffectCount() {
        C6RB c6rb;
        List<BEd> interactiveDrawables = getInteractiveDrawables();
        int i = 0;
        if (!(interactiveDrawables instanceof Collection) || !interactiveDrawables.isEmpty()) {
            for (BEd bEd : interactiveDrawables) {
                if (((C9LJ) bEd).A0B.isVisible()) {
                    Drawable Afg = bEd.Afg();
                    if ((Afg instanceof C6RB) && (c6rb = (C6RB) Afg) != null && c6rb.A0I != null && (i = i + 1) < 0) {
                        AbstractC16960so.A1T();
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
        return i;
    }

    private final int getNextAvailableZ() {
        return getMaxZ() + 1;
    }

    public final float A0F(Drawable drawable) {
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            return ((C9LJ) A00).A01;
        }
        return 0.0f;
    }

    public final float A0G(Drawable drawable) {
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            return ((C9LJ) A00).A02;
        }
        return 0.0f;
    }

    public final int A0H(int i) {
        ListIterator drawableIterator = getDrawableIterator();
        int i2 = 0;
        while (drawableIterator.hasNext()) {
            if (((C9LJ) ((BD4) drawableIterator.next())).A0f != i) {
                i2++;
            } else {
                return i2;
            }
        }
        return -1;
    }

    public final C202278x7 A0L(int i) {
        BEd A02 = A02(this, i);
        UserSession userSession = this.A06;
        if (A02 != null) {
            return new C202278x7(userSession, A02);
        }
        return null;
    }

    public final C202278x7 A0M(Drawable drawable) {
        BEd A00 = A00(drawable, this);
        UserSession userSession = this.A06;
        if (A00 != null) {
            return new C202278x7(userSession, A00);
        }
        return null;
    }

    public final BEd A0N(int i) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BEd bEd = (BEd) drawableIterator.next();
            if (((C9LJ) bEd).A0f == i) {
                return bEd;
            }
        }
        return null;
    }

    public final Boolean A0O(int i) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C9LJ c9lj = (C9LJ) ((BEd) drawableIterator.next());
            if (c9lj.A0f == i) {
                return Boolean.valueOf(c9lj.A0J);
            }
        }
        return null;
    }

    public final Float A0P(Drawable drawable) {
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            C9LJ c9lj = (C9LJ) A00;
            return Float.valueOf(c9lj.A04 * c9lj.A00);
        }
        return null;
    }

    public final Integer A0Q(Drawable drawable) {
        BEd bEd;
        ListIterator drawableIterator = getDrawableIterator();
        while (true) {
            if (drawableIterator.hasNext()) {
                bEd = (BEd) drawableIterator.next();
                if (((C9LJ) bEd).A0B == drawable || bEd.Afg() == drawable) {
                    break;
                }
            } else {
                bEd = null;
                break;
            }
        }
        A0B(bEd);
        if (bEd == null) {
            return null;
        }
        return Integer.valueOf(((C9LJ) bEd).A0f);
    }

    public final void A0Y() {
        BEd activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            activeDrawable.AEC();
        }
    }

    public final void A0a() {
        BEd activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            activeDrawable.EED();
        }
    }

    public final void A0b() {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C5RQ A02 = AbstractC209069Mo.A02(((C9LJ) ((BD4) drawableIterator.next())).A0B);
            if (A02 != null) {
                A02.Egu();
            }
        }
    }

    public final void A0c(int i, int i2) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C5RQ A02 = AbstractC209069Mo.A02(((C9LJ) ((BD4) drawableIterator.next())).A0B);
            if (A02 != null) {
                A02.EUp(i, i2);
            }
        }
        invalidate();
    }

    public final void A0d(int i, int i2) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C5RQ A02 = AbstractC209069Mo.A02(((C9LJ) ((BD4) drawableIterator.next())).A0B);
            if ((A02 instanceof AbstractC202988yG) || ((A02 instanceof C5RO) && (((C5RO) A02).Afg() instanceof AbstractC202988yG))) {
                A02.EUp(i, i2);
            }
        }
        invalidate();
    }

    public final void A0e(int i, boolean z) {
        BEd A02 = A02(this, i);
        if (A02 != null) {
            C9LJ c9lj = (C9LJ) A02;
            c9lj.A0R = z;
            c9lj.A0Q = z;
            c9lj.A0P = z;
            c9lj.A0S = z;
        }
    }

    public final void A0h(Drawable drawable) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            BEd bEd = (BEd) drawableIterator.next();
            C9LJ c9lj = (C9LJ) bEd;
            if (c9lj.A0B == drawable) {
                A0C(bEd);
                this.A0u.remove(Integer.valueOf(c9lj.A0f));
                invalidate();
                return;
            }
        }
    }

    public final void A0k(Drawable drawable) {
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            Drawable drawable2 = ((C9LJ) A00).A0B;
            int centerX = drawable2.getBounds().centerX();
            int centerY = drawable2.getBounds().centerY();
            Rect rect = new Rect(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            rect.offset(centerX - rect.centerX(), centerY - rect.centerY());
            drawable2.setBounds(rect);
        }
    }

    public final void A0l(Drawable drawable, float f) {
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            A00.Ecu(f);
        }
    }

    public final void A0m(Drawable drawable, float f) {
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            A00.Ed5(f);
        }
    }

    public final void A0n(Drawable drawable, float f, float f2) {
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            A00.EZk(f);
            A00.EZl(f2);
        }
    }

    public final void A0o(Drawable drawable, Drawable drawable2) {
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            C9LJ c9lj = (C9LJ) A00;
            drawable2.setVisible(c9lj.A0B.isVisible(), false);
            int centerX = c9lj.A0B.getBounds().centerX();
            int centerY = c9lj.A0B.getBounds().centerY();
            Rect rect = new Rect(0, 0, c9lj.A0B.getIntrinsicWidth(), c9lj.A0B.getIntrinsicHeight());
            rect.offset(centerX - rect.centerX(), centerY - rect.centerY());
            drawable2.setBounds(rect);
            c9lj.A0B = drawable2;
        }
        A07(this);
    }

    public final void A0p(Drawable drawable, boolean z) {
        float f;
        Float A0P = A0P(drawable);
        if (A0P != null) {
            f = A0P.floatValue();
        } else {
            f = 0.0f;
        }
        BEd A00 = A00(drawable, this);
        if (A00 != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(A00, "scaleFactor", 0.1f + f).setDuration(240L);
            C14360o3.A07(duration);
            duration.setRepeatCount(1);
            duration.setRepeatMode(2);
            duration.addListener(new AN9(A00, f));
            if (z) {
                duration.start();
            } else {
                duration.end();
            }
        }
    }

    public final void A0r(C2n2 c2n2) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            c2n2.apply(Integer.valueOf(((C9LJ) ((BD4) drawableIterator.next())).A0f));
        }
    }

    public final void A0u(InterfaceC28041Xi interfaceC28041Xi, int i) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C9LJ c9lj = (C9LJ) ((BEd) drawableIterator.next());
            if (interfaceC28041Xi.apply(c9lj.A0B)) {
                c9lj.A08 = i;
            }
        }
        A08(this);
        invalidate();
    }

    public final boolean A0x() {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            Drawable drawable = ((C9LJ) ((BD4) drawableIterator.next())).A0B;
            if ((drawable instanceof C221009pO) || ((drawable instanceof C194808jg) && (((C194808jg) drawable).A04() instanceof C8P8))) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0y(int i) {
        BEd A0N = A0N(i);
        if (A0N != null) {
            ListIterator drawableIterator = getDrawableIterator();
            while (drawableIterator.hasNext()) {
                if (((C9LJ) ((BEd) drawableIterator.next())).A08 < ((C9LJ) A0N).A08) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A0z(int i) {
        BEd A0N = A0N(i);
        if (A0N != null) {
            ListIterator drawableIterator = getDrawableIterator();
            while (drawableIterator.hasNext()) {
                if (((C9LJ) ((BEd) drawableIterator.next())).A08 > ((C9LJ) A0N).A08) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC131365wR
    public final boolean DhW(C124425jy c124425jy) {
        BEd activeDrawable = getActiveDrawable();
        boolean z = false;
        if (activeDrawable != null) {
            C9LJ c9lj = (C9LJ) activeDrawable;
            if (c9lj.A0Q) {
                z = true;
                if (c9lj.A0U) {
                    c9lj.A0P = true;
                    c9lj.A0S = true;
                }
            }
        }
        return z;
    }

    public final Integer getActiveDrawableHeight() {
        BEd activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            return Integer.valueOf(((C9LJ) activeDrawable).A0B.getIntrinsicHeight());
        }
        return null;
    }

    public final int getActiveDrawableId() {
        BEd activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            return ((C9LJ) activeDrawable).A0f;
        }
        return -1;
    }

    public final C09530e4 getActiveDrawableLocation() {
        BEd activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            return new C09530e4(Float.valueOf(activeDrawable.BdX()), Float.valueOf(activeDrawable.BdY()));
        }
        return null;
    }

    public final List getAllDrawables() {
        ArrayList arrayList = new ArrayList(getInteractiveDrawables().size());
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            arrayList.add(((C9LJ) ((BD4) drawableIterator.next())).A0B);
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final int getDrawableCount() {
        return getInteractiveDrawables().size();
    }

    public final int getMaxZ() {
        ListIterator drawableIterator = getDrawableIterator();
        int i = 0;
        while (drawableIterator.hasNext()) {
            int i2 = ((C9LJ) ((BEd) drawableIterator.next())).A09;
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Rect rect = this.A0h;
            rect.set(i, i2, i3, i4);
            if (this.A0M) {
                this.A0o.A07(rect);
            }
        }
        List list = this.A0s;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0223, code lost:
    
        if (r2.contains((int) r1, (int) r3) == false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDelegate(InterfaceC1818784x interfaceC1818784x) {
        this.A08 = interfaceC1818784x;
    }

    public final void setDetectGestureOnLongPress(boolean z) {
        this.A0F = z;
    }

    public final void setDisableRotate(boolean z) {
        this.A0G = z;
    }

    public final void setDisableScale(boolean z) {
        this.A0H = z;
    }

    public final void setDisableScroll(boolean z) {
        this.A0I = z;
    }

    public final void setDrawableUpdateListener(InterfaceC187268Rt interfaceC187268Rt) {
        this.A09 = interfaceC187268Rt;
    }

    public final void setInteractiveDrawableDataSource(AnonymousClass848 anonymousClass848) {
        this.A0D = anonymousClass848;
    }

    public final void setOnlyHandleTouchesOnActiveDrawables(boolean z) {
        this.A0O = z;
    }

    public final void setShouldBringDrawableToFrontWhenActivated(boolean z) {
        this.A0Q = z;
    }

    public final void setTouchEnabled(boolean z) {
        this.A0S = z;
    }

    public final void setTrashCanEnabled(boolean z) {
        this.A0T = z;
    }

    public final void setUserSession(UserSession userSession) {
        this.A06 = userSession;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.5jz, X.3uM] */
    public InteractiveDrawableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0q = new C131375wS(this);
        Paint paint = new Paint();
        this.A0v = paint;
        Paint paint2 = new Paint();
        this.A0w = paint2;
        this.A0i = new Rect();
        this.A0r = new CopyOnWriteArrayList();
        this.A0t = new CopyOnWriteArraySet();
        this.A16 = new C668630d() { // from class: X.5wT
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnj(C55982hj c55982hj) {
                BEd activeDrawable;
                int height;
                C14360o3.A0B(c55982hj, 0);
                if (c55982hj.A01 == 1.0d) {
                    InteractiveDrawableContainer interactiveDrawableContainer = InteractiveDrawableContainer.this;
                    activeDrawable = interactiveDrawableContainer.getActiveDrawable();
                    if (activeDrawable != null) {
                        interactiveDrawableContainer.A02 = activeDrawable.BdX();
                        interactiveDrawableContainer.A03 = activeDrawable.BdY();
                        C9LJ c9lj = (C9LJ) activeDrawable;
                        interactiveDrawableContainer.A00 = c9lj.A04 * c9lj.A00;
                        View view = interactiveDrawableContainer.A0l;
                        float height2 = view.getHeight() / 2.0f;
                        View view2 = interactiveDrawableContainer.A0k;
                        float x = view2.getX() + view.getX() + height2;
                        float y = view2.getY() + view.getY() + height2;
                        interactiveDrawableContainer.A04 = x;
                        interactiveDrawableContainer.A05 = y;
                        float sqrt = (height2 / ((float) Math.sqrt(2.0d))) * 2.0f * 1.3f;
                        Rect bounds = c9lj.A0B.getBounds();
                        C14360o3.A07(bounds);
                        if (bounds.width() > bounds.height()) {
                            height = bounds.width();
                        } else {
                            height = bounds.height();
                        }
                        interactiveDrawableContainer.A01 = sqrt / height;
                        C2UY.A01.A05(20L);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                BEd activeDrawable;
                BD3 bd3;
                C14360o3.A0B(c55982hj, 0);
                InteractiveDrawableContainer interactiveDrawableContainer = InteractiveDrawableContainer.this;
                activeDrawable = interactiveDrawableContainer.getActiveDrawable();
                if (activeDrawable != null) {
                    C55992hk c55992hk = c55982hj.A09;
                    C9LJ c9lj = (C9LJ) activeDrawable;
                    c9lj.EZk(c9lj.A01 + (((float) AbstractC70163Da.A04(c55992hk.A00, 0.0d, 1.0d, interactiveDrawableContainer.A02, interactiveDrawableContainer.A04)) - activeDrawable.BdX()));
                    c9lj.EZl(c9lj.A02 + (((float) AbstractC70163Da.A04(c55992hk.A00, 0.0d, 1.0d, interactiveDrawableContainer.A03, interactiveDrawableContainer.A05)) - activeDrawable.BdY()));
                    float A04 = (float) AbstractC70163Da.A04(c55992hk.A00, 0.0d, 1.0d, interactiveDrawableContainer.A00, interactiveDrawableContainer.A01);
                    float f = c9lj.A04;
                    c9lj.A04 = f * (A04 / (c9lj.A00 * f));
                    C9LJ.A04(c9lj);
                    c9lj.A0E.DiN(c9lj.A04 * c9lj.A00);
                    C8FD c8fd = c9lj.A0D;
                    if (c8fd != null && (bd3 = c8fd.A02) != null) {
                        bd3.DiN(c9lj.A04 * c9lj.A00);
                    }
                }
                float A042 = (float) AbstractC70163Da.A04(c55982hj.A09.A00, 0.0d, 1.0d, 1.0d, 1.2999999523162842d);
                View view = interactiveDrawableContainer.A0l;
                view.setScaleX(A042);
                view.setScaleY(A042);
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
                InteractiveDrawableContainer interactiveDrawableContainer = InteractiveDrawableContainer.this;
                if (interactiveDrawableContainer.A0J) {
                    InteractiveDrawableContainer.A06(interactiveDrawableContainer);
                }
            }
        };
        this.A0p = new C131395wU(this);
        this.A0h = new Rect();
        this.A0j = new RectF();
        this.A0x = new Path();
        this.A0g = new Matrix();
        this.A0f = new Matrix();
        this.A0z = new PointF();
        this.A0y = new PointF();
        this.A0s = new ArrayList();
        this.A0Q = true;
        this.A0S = true;
        this.A0E = new ArrayList();
        this.A10 = new PointF();
        this.A0u = new HashSet();
        this.A07 = C128535rM.A00;
        setWillNotDraw(false);
        this.A0o = new C131405wV(context);
        Handler handler = new Handler(Looper.getMainLooper());
        this.A11 = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.5jx
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                C14360o3.A0B(motionEvent, 0);
                Iterator it = InteractiveDrawableContainer.this.A0t.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1829489p) it.next()).Dmm(null, motionEvent.getX(), motionEvent.getY(), motionEvent.getX(), motionEvent.getY(), -1);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return !InteractiveDrawableContainer.this.A0O;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                Iterator it = InteractiveDrawableContainer.this.A0t.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1829489p) it.next()).DQk();
                }
            }
        }, handler);
        GestureDetector gestureDetector = new GestureDetector(context, this, handler);
        gestureDetector.setIsLongpressEnabled(false);
        this.A13 = gestureDetector;
        this.A12 = new GestureDetector(context, this, handler);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this, handler);
        this.A14 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.A17 = new C124425jy(context, this);
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(A1A);
        this.A15 = A02;
        C55982hj A022 = AbstractC13560mi.A00().A02();
        A022.A09(A19);
        this.A0n = A022;
        Resources resources = context.getResources();
        this.A0e = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.A0d = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(resources.getColor(R.color.sticker_boundaries_background));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(resources.getColor(R.color.sticker_contour_stroke_color));
        paint2.setStrokeWidth(5.0f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.trash_can, (ViewGroup) this, false);
        this.A0k = inflate;
        this.A0m = inflate.requireViewById(R.id.trash_can_label);
        this.A0l = inflate.requireViewById(R.id.trash_can_circle);
        addView(inflate);
        this.A18 = new AbstractC87043uM(this);
    }

    public /* synthetic */ InteractiveDrawableContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractiveDrawableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
