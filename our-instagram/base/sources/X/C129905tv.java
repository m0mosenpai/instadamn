package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129905tv extends ImageView implements C5M3 {
    public float A00;
    public int A01;
    public CUM A02;
    public C5M0 A03;
    public C66198U3o A04;
    public C6PV A05;
    public C130055uA A06;
    public Map A07;
    public boolean A08;
    public C5M2 A09;
    public ImmutableMap A0A;
    public final C5SZ A0B;
    public final C129925tx A0C;
    public final InterfaceC09390do A0D;

    public final boolean A00(X9A x9a) {
        C5M2 c5m2;
        if (this.A05 == null) {
            if (!(x9a instanceof C70449WWc)) {
                C66198U3o c66198U3o = this.A04;
                if (c66198U3o != null && (!c66198U3o.A04.isEmpty()) && (c5m2 = this.A09) != null) {
                    this.A05 = new C6PV(c66198U3o, c5m2);
                }
            }
            return false;
        }
        C6PV c6pv = this.A05;
        if (c6pv != null) {
            c6pv.A01.A02.A01(x9a);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5M3
    public final void EWr(C5M0 c5m0, C66198U3o c66198U3o, C5M2 c5m2, Map map, boolean z, boolean z2) {
        setLayerType(0, null);
        InterfaceC58682mR interfaceC58682mR = c66198U3o.A00;
        interfaceC58682mR.FEB(0.0f, 1.0f).EMk(0.0f);
        setImageDrawable((Drawable) interfaceC58682mR);
        this.A07 = map;
        this.A03 = c5m0;
        this.A04 = c66198U3o;
        this.A08 = z2;
        this.A09 = c5m2;
        interfaceC58682mR.EEv();
        interfaceC58682mR.A8x(new U3q(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        List list;
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        CUM cum = this.A02;
        if (cum != null) {
            cum.A00(canvas, getWidth(), getHeight());
        }
        C130055uA c130055uA = this.A06;
        if (c130055uA != null && (list = c130055uA.A00) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                canvas.drawRect((RectF) it.next(), c130055uA.A01);
            }
        }
    }

    public final void setClickableLayersIndicatorEnabled(boolean z) {
        this.A06 = null;
        if (z) {
            this.A06 = new C130055uA();
        }
    }

    public final void setPlaceholderDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        setImageDrawable(drawable);
        this.A04 = null;
        this.A0A = null;
        this.A07 = null;
    }

    private final GestureDetector getTapDetector() {
        return (GestureDetector) this.A0D.getValue();
    }

    public final ImmutableMap getRenderingComponentInfos() {
        C66198U3o c66198U3o;
        boolean z;
        List list;
        float f;
        float f2;
        C66198U3o c66198U3o2;
        ImmutableMap immutableMap = this.A0A;
        if (immutableMap == null && (c66198U3o = this.A04) != null) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            InterfaceC58682mR interfaceC58682mR = c66198U3o.A00;
            List<C26069Bfx> list2 = (List) c66198U3o.A01.A00;
            AnonymousClass693 anonymousClass693 = (AnonymousClass693) interfaceC58682mR;
            float f3 = anonymousClass693.A03.A03;
            if (!list2.isEmpty() && f3 != 1.0f && this.A08) {
                z = true;
                anonymousClass693.EMk(1.0f);
            } else {
                z = false;
            }
            for (C26069Bfx c26069Bfx : list2) {
                String str = c26069Bfx.A02;
                String str2 = c26069Bfx.A01;
                String str3 = c26069Bfx.A03;
                String str4 = c26069Bfx.A00;
                Map map = anonymousClass693.A02.A0F;
                if (map != null && (list = (List) map.get(str)) != null && (!list.isEmpty())) {
                    AbstractC56722j5 abstractC56722j5 = (AbstractC56722j5) list.get(0);
                    C14360o3.A0A(abstractC56722j5);
                    C14360o3.A0B(abstractC56722j5, 1);
                    C14360o3.A0B(str2, 2);
                    C14360o3.A0B(str3, 3);
                    RectF rectF = abstractC56722j5.A0A;
                    C14360o3.A07(rectF);
                    Rect bounds = anonymousClass693.getBounds();
                    C14360o3.A07(bounds);
                    int width = bounds.width();
                    int height = bounds.height();
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float f4 = 0.0f;
                    if (width * height2 > width2 * height) {
                        f = height2 / height;
                        f4 = (width2 - (width * f)) * 0.5f;
                        f2 = 0.0f;
                    } else {
                        f = width2 / width;
                        f2 = (height2 - (height * f)) * 0.5f;
                    }
                    int i = (int) ((rectF.left * f) + f4);
                    int i2 = (int) ((rectF.top * f) + f2);
                    int height3 = (int) (rectF.height() * f);
                    int width3 = (int) (f * rectF.width());
                    String str5 = null;
                    if ("image".equals(str3) && (c66198U3o2 = this.A04) != null) {
                        for (MUD mud : c66198U3o2.A03) {
                            if (C14360o3.A0K(mud.A01, str4)) {
                                str5 = mud.A02;
                            }
                        }
                    }
                    builder.put(str3, new C62672SLk(new SMV(i, i2, width3, height3, str5), str2, str3));
                }
            }
            if (z) {
                anonymousClass693.EMk(f3);
            }
            ImmutableMap buildOrThrow = builder.buildOrThrow();
            C14360o3.A07(buildOrThrow);
            this.A0A = buildOrThrow;
            return buildOrThrow;
        }
        return immutableMap;
    }

    public final float getTopMargin$fbandroid_java_com_facebook_showreelnativesdk_core_ui_ui() {
        return this.A00;
    }

    public final int getVerticalScrollPosition$fbandroid_java_com_facebook_showreelnativesdk_core_ui_ui() {
        return this.A01;
    }

    public final void setDebugIndicatorEnabled(boolean z) {
        if (z && this.A02 == null) {
            Context context = getContext();
            C14360o3.A07(context);
            this.A02 = new CUM(context);
        }
        CUM cum = this.A02;
        if (cum != null) {
            cum.A02 = z;
        }
    }

    public final void setDebugInfoText(String str) {
        if (str != null && this.A02 == null) {
            Context context = getContext();
            C14360o3.A07(context);
            this.A02 = new CUM(context);
        }
        CUM cum = this.A02;
        if (cum != null) {
            cum.A01 = str;
        }
    }

    public C129905tv(Context context) {
        super(context);
        this.A0B = new C5SZ() { // from class: X.5tw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                float f;
                float f2;
                RectF rectF;
                C14360o3.A0B(motionEvent, 0);
                C129905tv c129905tv = C129905tv.this;
                C129925tx c129925tx = c129905tv.A0C;
                Map map = c129905tv.A07;
                InterfaceC58682mR keyframesAnimatable = c129905tv.getKeyframesAnimatable();
                C5M0 c5m0 = c129905tv.A03;
                C14360o3.A0B(c5m0, 4);
                c129925tx.A02 = null;
                c129925tx.A00 = null;
                c129925tx.A01 = null;
                if (c5m0.AFh() && map != null && !map.isEmpty() && keyframesAnimatable != 0) {
                    Drawable drawable = (Drawable) keyframesAnimatable;
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
                    if (drawable.getBounds().width() != 0 && drawable.getBounds().height() != 0) {
                        float f4 = f3 / f;
                        float f5 = f2 / f;
                        C27859CPw CN4 = keyframesAnimatable.CN4((String[]) AbstractC001800i.A0Y(map.keySet()).toArray(new String[0]), (motionEvent.getX() / f) - f4, (motionEvent.getY() / f) - f5);
                        if (CN4 != null && map.containsKey(CN4.A01) && map.containsKey(CN4.A01) && (rectF = CN4.A00) != null) {
                            float f6 = (rectF.left + f4) * f;
                            float f7 = (rectF.top + f5) * f;
                            float f8 = (rectF.right + f4) * f;
                            float f9 = (rectF.bottom + f5) * f;
                            float top = (c129905tv.getTop() + c129905tv.A00) - c129905tv.A01;
                            RectF rectF2 = new RectF(f6, f7 + top, f8, f9 + top);
                            c129925tx.A02 = (C206409Bx) map.get(CN4.A01);
                            c129925tx.A00 = new PointF(motionEvent.getX(), motionEvent.getY());
                            c129925tx.A01 = rectF2;
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                float f;
                float f2;
                C14360o3.A0B(motionEvent, 0);
                C129905tv c129905tv = C129905tv.this;
                C129925tx c129925tx = c129905tv.A0C;
                Map map = c129905tv.A07;
                InterfaceC58682mR keyframesAnimatable = c129905tv.getKeyframesAnimatable();
                C5M0 c5m0 = c129905tv.A03;
                C14360o3.A0B(c5m0, 4);
                if (c5m0.AFh() && map != null && !map.isEmpty() && keyframesAnimatable != 0) {
                    C206409Bx c206409Bx = c129925tx.A02;
                    PointF pointF = c129925tx.A00;
                    RectF rectF = c129925tx.A01;
                    if (c206409Bx != null && pointF != null && rectF != null) {
                        Drawable drawable = (Drawable) keyframesAnimatable;
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
                        if (drawable.getBounds().width() != 0 && drawable.getBounds().height() != 0) {
                            C27859CPw CN4 = keyframesAnimatable.CN4((String[]) AbstractC001800i.A0Y(map.keySet()).toArray(new String[0]), (motionEvent.getX() / f) - (f3 / f), (motionEvent.getY() / f) - (f2 / f));
                            if (CN4 != null && map.containsKey(CN4.A01)) {
                                c5m0.DK0(pointF, rectF, c206409Bx, C05F.A0C);
                                Integer num = c129925tx.A03;
                                Integer num2 = C05F.A01;
                                if (num != num2) {
                                    c129925tx.A03 = num2;
                                }
                            }
                        }
                    }
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                PointF pointF;
                RectF rectF;
                C14360o3.A0B(motionEvent, 0);
                C129905tv c129905tv = C129905tv.this;
                C129925tx c129925tx = c129905tv.A0C;
                C5M0 c5m0 = c129905tv.A03;
                C14360o3.A0B(c5m0, 1);
                c129925tx.A03 = C05F.A00;
                C206409Bx c206409Bx = c129925tx.A02;
                if (c206409Bx != null && (pointF = c129925tx.A00) != null && (rectF = c129925tx.A01) != null) {
                    return c5m0.DK0(pointF, rectF, c206409Bx, C05F.A01);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                PointF pointF;
                RectF rectF;
                C14360o3.A0B(motionEvent, 0);
                C129905tv c129905tv = C129905tv.this;
                C129925tx c129925tx = c129905tv.A0C;
                C5M0 c5m0 = c129905tv.A03;
                C14360o3.A0B(c5m0, 1);
                Integer num = C05F.A00;
                c129925tx.A03 = num;
                C206409Bx c206409Bx = c129925tx.A02;
                if (c206409Bx != null && (pointF = c129925tx.A00) != null && (rectF = c129925tx.A01) != null) {
                    return c5m0.DK0(pointF, rectF, c206409Bx, num);
                }
                return true;
            }
        };
        this.A0D = AbstractC09440dt.A01(new C206979Ec(this, 34));
        this.A0C = new C129925tx();
        this.A03 = C5M0.A01;
    }

    public final float getDuration() {
        InterfaceC58682mR keyframesAnimatable = getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            return keyframesAnimatable.Aze();
        }
        return 0.0f;
    }

    public final InterfaceC58682mR getKeyframesAnimatable() {
        if (getDrawable() instanceof InterfaceC58682mR) {
            Object drawable = getDrawable();
            C14360o3.A0C(drawable, "null cannot be cast to non-null type com.facebook.keyframes.common.KeyframesAnimatable");
            return (InterfaceC58682mR) drawable;
        }
        return null;
    }

    public final float getProgress() {
        InterfaceC58682mR keyframesAnimatable = getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            return keyframesAnimatable.BiI();
        }
        return 0.0f;
    }

    public final int getRepeatsRemaining() {
        InterfaceC58682mR keyframesAnimatable = getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            return keyframesAnimatable.Bmx();
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = C0f9.A05(692525514);
        C14360o3.A0B(motionEvent, 0);
        if (this.A07 == null) {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -2062769215;
        } else {
            C129925tx c129925tx = this.A0C;
            C5M0 c5m0 = this.A03;
            C14360o3.A0B(c5m0, 1);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (c129925tx.A03 == C05F.A01) {
                    C206409Bx c206409Bx = c129925tx.A02;
                    PointF pointF = c129925tx.A00;
                    RectF rectF = c129925tx.A01;
                    if (c206409Bx != null && pointF != null && rectF != null) {
                        c5m0.DK0(pointF, rectF, c206409Bx, C05F.A0N);
                    }
                }
                c129925tx.A03 = C05F.A00;
            }
            onTouchEvent = getTapDetector().onTouchEvent(motionEvent);
            i = -714951262;
        }
        C0f9.A0C(i, A05);
        return onTouchEvent;
    }

    public final void setTopMargin(float f) {
        this.A00 = f;
    }

    public final void setVerticalScrollPosition(int i) {
        this.A01 = i;
    }
}
