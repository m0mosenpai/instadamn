package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.io.IOException;
import java.util.LinkedHashSet;

/* renamed from: X.6Al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC135366Al implements InterfaceC77833eB {
    public final long A00;

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC68323VMj.A00(this);
    }

    public Object A00(Context context, View view, Object obj, Object obj2) {
        int i;
        Paint paint;
        C126555nq c126555nq = (C126555nq) view;
        C135296Ae c135296Ae = (C135296Ae) obj;
        if (c135296Ae.A06 != null) {
            try {
                C6FG c6fg = c135296Ae.A0B;
                c6fg.getClass();
                C131635wz c131635wz = (C131635wz) c126555nq;
                final C102884kP c102884kP = c135296Ae.A06;
                C14360o3.A0B(c131635wz, 1);
                C14360o3.A0B(c102884kP, 2);
                C135346Aj c135346Aj = c135296Ae.A07;
                C14360o3.A06(c135346Aj);
                c135346Aj.A00 = c131635wz.getOutlineAmbientShadowColor();
                c135346Aj.A01 = c131635wz.getOutlineSpotShadowColor();
                String A0L = c102884kP.A0L(48);
                if (A0L != null) {
                    float A01 = C6BE.A01(A0L);
                    if (A01 != 0.0f) {
                        c131635wz.setElevation(A01);
                        c131635wz.setOutlineProvider(new U7E(c102884kP));
                        if (c102884kP.A08(68) != null) {
                            int i2 = c135346Aj.A00;
                            C102884kP A08 = c102884kP.A08(68);
                            if (A08 != null) {
                                i2 = C6BK.A00(c6fg, A08, i2);
                            }
                            c131635wz.setOutlineAmbientShadowColor(i2);
                        }
                        if (c102884kP.A08(69) != null) {
                            int i3 = c135346Aj.A01;
                            C102884kP A082 = c102884kP.A08(69);
                            if (A082 != null) {
                                i3 = C6BK.A00(c6fg, A082, i3);
                            }
                            c131635wz.setOutlineSpotShadowColor(i3);
                        }
                    }
                }
                String A0L2 = c102884kP.A0L(46);
                final float f = 0.0f;
                if (A0L2 != null) {
                    f = C6BE.A01(A0L2);
                }
                if (c102884kP.A0S(43, false)) {
                    if (f != 0.0f) {
                        c131635wz.setOutlineProvider(new ViewOutlineProvider() { // from class: X.5x4
                            @Override // android.view.ViewOutlineProvider
                            public final void getOutline(View view2, Outline outline) {
                                C14360o3.A0B(view2, 0);
                                C14360o3.A0B(outline, 1);
                                outline.setRoundRect(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight(), f);
                                Drawable background = view2.getBackground();
                                if (background != null) {
                                    C102884kP c102884kP2 = c102884kP;
                                    background.getOutline(outline);
                                    outline.setAlpha(c102884kP2.A02(65, 1.0f));
                                }
                            }
                        });
                        String A0L3 = c102884kP.A0L(40);
                        float f2 = 0.0f;
                        if (A0L3 != null) {
                            f2 = C6BE.A01(A0L3);
                        }
                        int A00 = AbstractC135616Bm.A00(c102884kP.A0O(56), 0);
                        if (f2 == 0.0f && AbstractC135616Bm.A02(A00)) {
                            c131635wz.setClipToOutline(true);
                        } else {
                            C131645x0 c131645x0 = c131635wz.A00;
                            c131645x0.A04 = true;
                            c131645x0.A0B.setLayerType(2, null);
                            C102884kP A083 = c102884kP.A08(45);
                            String A0L4 = c102884kP.A0L(44);
                            if (A0L4 != null) {
                                i = C6BE.A03(A0L4);
                            } else {
                                i = 0;
                            }
                            if (A083 != null) {
                                try {
                                    String A0L5 = A083.A0L(35);
                                    if (A0L5 == null || C6BE.A03(A0L5) == 0) {
                                        String A0G = A083.A0G();
                                        if (A0G != null) {
                                            if (C6BE.A03(A0G) == 0) {
                                            }
                                        }
                                    }
                                } catch (C41M unused) {
                                    AbstractC25241Le.A02("ThemedColorUtils", "Error parsing themed color");
                                }
                                i = C6BK.A00(c6fg, A083, 0);
                            }
                            int A002 = AbstractC135596Bk.A00(c6fg, c102884kP);
                            float[] A02 = AbstractC135596Bk.A02(c102884kP.A0O(62));
                            String A0L6 = c102884kP.A0L(63);
                            float f3 = 0.0f;
                            if (A0L6 != null) {
                                f3 = C6BE.A01(A0L6);
                            }
                            c131645x0.A03 = A00;
                            c131645x0.A02 = f;
                            Paint paint2 = c131645x0.A06;
                            paint2.setColor(i);
                            if (i == 0) {
                                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            }
                            if (f2 == 0.0f) {
                                paint = c131645x0.A05;
                                paint.setColor(0);
                            } else {
                                paint = c131645x0.A05;
                                paint.setColor(A002);
                            }
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(f2);
                            if (f2 > 0.0f && A02 != null) {
                                paint.setPathEffect(new DashPathEffect(A02, f3));
                            }
                            Path path = c131645x0.A08;
                            path.setFillType(Path.FillType.EVEN_ODD);
                            float f4 = f2 / 2.0f;
                            c131645x0.A00 = f4;
                            c131645x0.A01 = c131645x0.A02 - f4;
                            path.reset();
                        }
                    }
                } else if (f != 0.0f) {
                    c131635wz.setOutlineProvider(new ViewOutlineProvider() { // from class: X.5xI
                        @Override // android.view.ViewOutlineProvider
                        public final void getOutline(View view2, Outline outline) {
                            float f5;
                            C14360o3.A0B(view2, 0);
                            C14360o3.A0B(outline, 1);
                            Drawable background = view2.getBackground();
                            if (background != null) {
                                background.getOutline(outline);
                                f5 = C102884kP.this.A02(65, 1.0f);
                            } else {
                                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                                f5 = 0.0f;
                            }
                            outline.setAlpha(f5);
                        }
                    });
                }
                Object obj3 = c135296Ae.A04;
                Object obj4 = c135296Ae.A03;
                if (obj3 instanceof Animatable) {
                    ((Animatable) obj3).start();
                }
                if (obj4 instanceof Animatable) {
                    ((Animatable) obj4).start();
                    return null;
                }
            } catch (IOException e) {
                AbstractC25241Le.A00(null, "HostWithDecoratorRenderUnit", "Parse exception while binding Box Decoration", e);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.6Vr, java.lang.Object] */
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        long[] jArr;
        View view = (View) obj;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(view, 1);
        long j = this.A00;
        C103054kg A00 = AbstractC103044kf.A00();
        if (A00 == null) {
            return A00(context, view, obj2, obj3);
        }
        ?? obj4 = new Object();
        Object obj5 = C103054kg.A00()[1];
        C103054kg.A00()[1] = obj4;
        try {
            Object obj6 = obj5;
            if (!(obj5 instanceof C140136Vr)) {
                obj6 = null;
            }
            C140136Vr c140136Vr = (C140136Vr) obj6;
            Object A002 = A00(context, view, obj2, obj3);
            if (!obj4.A01() && c140136Vr != null) {
                c140136Vr.A00(j);
            }
            C103054kg.A00()[1] = obj5;
            if (obj4.A01()) {
                return A002;
            }
            C140056Vj c140056Vj = A00.A03;
            LinkedHashSet linkedHashSet = obj4.A00;
            if (linkedHashSet != null) {
                jArr = AbstractC001800i.A0y(linkedHashSet);
            } else {
                jArr = null;
            }
            c140056Vj.A01(new C140126Vq(null, null, jArr), j, false);
            return A002;
        } catch (Throwable th) {
            C103054kg.A00()[1] = obj5;
            throw th;
        }
    }

    public AbstractC135366Al(long j) {
        this.A00 = AbstractC135376Am.A00(getClass(), j);
    }

    public boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        if (AbstractC103044kf.A00() != null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        Object A01;
        C103054kg A00 = AbstractC103044kf.A00();
        if (A00 == null) {
            A01 = Boolean.valueOf(A01(obj, obj2, obj3, obj4));
        } else {
            A01 = AbstractC103044kf.A01(EnumC103014kc.A05, A00, new MEB(13, obj3, obj, this, obj4, obj2));
        }
        if (!((Boolean) A01).booleanValue()) {
            long j = this.A00;
            if (!VSG.A00(j)) {
                if (AbstractC103044kf.A00() != null) {
                    Object obj5 = C103054kg.A00()[1];
                    if (obj5 == null) {
                        obj5 = null;
                    }
                    C140136Vr c140136Vr = (C140136Vr) obj5;
                    if (c140136Vr != null) {
                        c140136Vr.A00(j);
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
