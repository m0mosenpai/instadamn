package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SjY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63403SjY {
    public static final C63403SjY A00 = new Object();

    public static final void A03(Canvas canvas, View view) {
        Q2R q2r;
        Q2N q2n;
        C14360o3.A0B(canvas, 1);
        Rect A0U = AbstractC166987dD.A0U();
        view.getDrawingRect(A0U);
        Drawable background = view.getBackground();
        if ((background instanceof Q2R) && (q2r = (Q2R) background) != null && (q2n = q2r.A03) != null) {
            if (q2n.A0E.A02()) {
                Q2N.A05(q2n);
                Path path = q2n.A04;
                path.getClass();
                Path path2 = new Path(path);
                path2.offset(A0U.left, A0U.top);
                canvas.clipPath(path2);
                return;
            }
            RectF A09 = q2n.A09();
            RectF rectF = new RectF(A09.left, A09.top, AbstractC166997dE.A0H(q2n) - A09.right, AbstractC166997dE.A0G(q2n) - A09.bottom);
            rectF.offset(A0U.left, A0U.top);
            canvas.clipRect(rectF);
            return;
        }
        canvas.clipRect(A0U);
    }

    public static final void A04(Drawable drawable, View view) {
        C14360o3.A0B(view, 0);
        Q2R A01 = A01(view);
        Drawable drawable2 = A01.A02;
        List list = A01.A06;
        view.setBackground(new Q2R(drawable2, drawable, A01.A03, A01.A04, list, A01.A05));
    }

    public static final void A05(View view, float f) {
        C14360o3.A0B(view, 0);
        if (C62797SRr.A00(view) == 2) {
            Q2M A02 = A02(view);
            float A01 = WF1.A01(f);
            A02.A09.Egi(A02, Float.valueOf(A01), Q2M.A0B[1]);
        }
    }

    public static final void A06(View view, float f) {
        C14360o3.A0B(view, 0);
        if (C62797SRr.A00(view) == 2) {
            Q2M A02 = A02(view);
            float A01 = WF1.A01(f);
            if (A01 != A02.A00) {
                A02.A00 = A01;
                Paint paint = A02.A06;
                paint.setStrokeWidth(A01);
                paint.setPathEffect(Q2M.A01(A02.A04, A01));
                A02.invalidateSelf();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.0sl] */
    public static final void A07(View view, ReadableArray readableArray) {
        ?? A1E;
        Integer num;
        Float f;
        Float f2;
        int i;
        float f3;
        float f4;
        C14360o3.A0B(view, 0);
        if (readableArray == null) {
            A1E = C16930sl.A00;
        } else {
            A1E = AbstractC166987dD.A1E();
            int size = readableArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                ReadableMap map = readableArray.getMap(i2);
                Context A0L = AbstractC166997dE.A0L(view);
                C14360o3.A0B(map, 0);
                Boolean bool = null;
                if (map.hasKey("offsetX") && map.hasKey("offsetY")) {
                    float f5 = (float) map.getDouble("offsetX");
                    float f6 = (float) map.getDouble("offsetY");
                    if (map.hasKey("color")) {
                        ReadableType type = map.getType("color");
                        int ordinal = type.ordinal();
                        if (ordinal != 2) {
                            if (ordinal == 4) {
                                num = C63233Sfl.A00(A0L, map.getMap("color"));
                            } else {
                                throw new RuntimeException(AbstractC167017dG.A0n(type, "Unsupported color type ", AbstractC166987dD.A1C()));
                            }
                        } else {
                            num = Integer.valueOf(map.getInt("color"));
                        }
                    } else {
                        num = null;
                    }
                    if (map.hasKey("blurRadius")) {
                        f = Float.valueOf((float) map.getDouble("blurRadius"));
                    } else {
                        f = null;
                    }
                    if (map.hasKey("spreadDistance")) {
                        f2 = Float.valueOf((float) map.getDouble("spreadDistance"));
                    } else {
                        f2 = null;
                    }
                    if (map.hasKey("inset")) {
                        bool = Boolean.valueOf(map.getBoolean("inset"));
                    }
                    A1E.add(new SPJ(bool, f, f2, num, f5, f6));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        if (C62797SRr.A00(view) == 2) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            ArrayList A1E3 = AbstractC166987dD.A1E();
            SBS sbs = A01(view).A00;
            for (SPJ spj : A1E) {
                float f7 = spj.A00;
                float f8 = spj.A01;
                Integer num2 = spj.A05;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = -16777216;
                }
                Float f9 = spj.A03;
                if (f9 != null) {
                    f3 = f9.floatValue();
                } else {
                    f3 = 0.0f;
                }
                Float f10 = spj.A04;
                if (f10 != null) {
                    f4 = f10.floatValue();
                } else {
                    f4 = 0.0f;
                }
                Boolean bool2 = spj.A02;
                if (bool2 != null && bool2.booleanValue()) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        A1E3.add(new Q2L(AbstractC166997dE.A0L(view), sbs, A00(view).A0E, f7, f8, f3, f4, i));
                    }
                } else {
                    A1E2.add(new Q2I(AbstractC166997dE.A0L(view), A00(view).A0E, f7, f8, f3, f4, i));
                }
            }
            Q2R A01 = A01(view);
            view.setBackground(new Q2R(A01.A02, A01.A01, A01.A03, A01.A04, A1E2, A1E3));
        }
    }

    public static final void A08(View view, C63011Saa c63011Saa, VDC vdc) {
        C63011Saa c63011Saa2;
        boolean A1R = AbstractC167007dF.A1R(0, view, vdc);
        Q2N A002 = A00(view);
        C63025Sav c63025Sav = A002.A0E;
        switch (vdc.ordinal()) {
            case 0:
                c63011Saa2 = c63025Sav.A0C;
                break;
            case 1:
                c63011Saa2 = c63025Sav.A09;
                break;
            case 2:
                c63011Saa2 = c63025Sav.A0A;
                break;
            case 3:
                c63011Saa2 = c63025Sav.A02;
                break;
            case 4:
                c63011Saa2 = c63025Sav.A01;
                break;
            case 5:
                c63011Saa2 = c63025Sav.A0B;
                break;
            case 6:
                c63011Saa2 = c63025Sav.A08;
                break;
            case 7:
                c63011Saa2 = c63025Sav.A03;
                break;
            case 8:
                c63011Saa2 = c63025Sav.A00;
                break;
            case 9:
                c63011Saa2 = c63025Sav.A04;
                break;
            case 10:
                c63011Saa2 = c63025Sav.A05;
                break;
            case 11:
                c63011Saa2 = c63025Sav.A06;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c63011Saa2 = c63025Sav.A07;
                break;
            default:
                throw B4Z.A00();
        }
        if (!C2I7.A00(c63011Saa, c63011Saa2)) {
            c63025Sav.A01(vdc, c63011Saa);
            A002.A0H = A1R;
            A002.invalidateSelf();
        }
        Q2R A01 = A01(view);
        for (Drawable drawable : A01.A06) {
            if (drawable instanceof Q2I) {
                Q2I q2i = (Q2I) drawable;
                Object obj = q2i.A00;
                C63025Sav c63025Sav2 = obj;
                if (obj == null) {
                    c63025Sav2 = new C63025Sav(null, null, null, null, null, null, null, null, null, null, null, null, null);
                }
                if (!c63025Sav2.equals(obj)) {
                    q2i.A00 = c63025Sav2;
                    q2i.invalidateSelf();
                }
                C63025Sav c63025Sav3 = q2i.A00;
                if (c63025Sav3 != null) {
                    c63025Sav3.A01(vdc, c63011Saa);
                }
                drawable.invalidateSelf();
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            for (Drawable drawable2 : A01.A05) {
                if (drawable2 instanceof Q2L) {
                    Q2L q2l = (Q2L) drawable2;
                    C63025Sav A02 = q2l.A02();
                    if (A02 == null) {
                        A02 = new C63025Sav(null, null, null, null, null, null, null, null, null, null, null, null, null);
                    }
                    q2l.A04(A02);
                    C63025Sav A022 = q2l.A02();
                    if (A022 != null) {
                        A022.A01(vdc, c63011Saa);
                    }
                    drawable2.invalidateSelf();
                }
            }
        }
        Q2M q2m = A01.A04;
        if (q2m != null) {
            InterfaceC16530ry interfaceC16530ry = q2m.A08;
            C0YR[] c0yrArr = Q2M.A0B;
            Object CES = interfaceC16530ry.CES(q2m, c0yrArr[0]);
            if (CES == null) {
                CES = new C63025Sav(null, null, null, null, null, null, null, null, null, null, null, null, null);
            }
            interfaceC16530ry.Egi(q2m, CES, c0yrArr[0]);
            C63025Sav c63025Sav4 = (C63025Sav) interfaceC16530ry.CES(q2m, c0yrArr[0]);
            if (c63025Sav4 != null) {
                c63025Sav4.A01(vdc, c63011Saa);
            }
            q2m.invalidateSelf();
        }
    }

    public static final void A0A(View view, EnumC61190Rgq enumC61190Rgq, Integer num) {
        float f;
        C14360o3.A0B(view, 0);
        Q2N A002 = A00(view);
        int A003 = enumC61190Rgq.A00();
        float f2 = Float.NaN;
        if (num == null) {
            f = Float.NaN;
        } else {
            int intValue = num.intValue();
            f = 16777215 & intValue;
            f2 = intValue >>> 24;
        }
        C63191Set c63191Set = A002.A0C;
        if (c63191Set == null) {
            c63191Set = new C63191Set(0.0f);
            A002.A0C = c63191Set;
        }
        if (!C62795SRp.A00(c63191Set.A03[A003], f)) {
            c63191Set.A01(f, A003);
            A002.invalidateSelf();
        }
        C63191Set c63191Set2 = A002.A0B;
        if (c63191Set2 == null) {
            c63191Set2 = new C63191Set(255.0f);
            A002.A0B = c63191Set2;
        }
        if (!C62795SRp.A00(c63191Set2.A03[A003], f2)) {
            c63191Set2.A01(f2, A003);
            A002.invalidateSelf();
        }
        A002.A0H = true;
    }

    public static final void A0B(View view, Integer num) {
        int i;
        C14360o3.A0B(view, 0);
        if ((num == null || num.intValue() == 0) && !(view.getBackground() instanceof Q2R)) {
            return;
        }
        Q2N A002 = A00(view);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        A002.A01 = i;
        A002.invalidateSelf();
    }

    public static final void A0C(View view, Integer num) {
        C14360o3.A0B(view, 0);
        Q2N A002 = A00(view);
        if (A002.A0F != num) {
            A002.A0F = num;
            A002.A0H = true;
            A002.invalidateSelf();
        }
    }

    public static final void A0D(View view, Integer num) {
        int intValue;
        C14360o3.A0B(view, 0);
        if (C62797SRr.A00(view) == 2) {
            Q2M A02 = A02(view);
            if (num != null && (intValue = num.intValue()) != A02.A01) {
                A02.A01 = intValue;
                A02.A06.setColor(intValue);
                A02.invalidateSelf();
            }
        }
    }

    public static final Q2N A00(View view) {
        Q2R A01 = A01(view);
        Q2N q2n = A01.A03;
        if (q2n == null) {
            Q2N q2n2 = new Q2N(view.getContext());
            Drawable drawable = A01.A02;
            List list = A01.A06;
            view.setBackground(new Q2R(drawable, A01.A01, q2n2, A01.A04, list, A01.A05));
            return q2n2;
        }
        return q2n;
    }

    public static final Q2R A01(View view) {
        if (view.getBackground() instanceof Q2R) {
            Drawable background = view.getBackground();
            C14360o3.A0C(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (Q2R) background;
        }
        Drawable background2 = view.getBackground();
        C16930sl c16930sl = C16930sl.A00;
        Q2R q2r = new Q2R(background2, null, null, null, c16930sl, c16930sl);
        view.setBackground(q2r);
        return q2r;
    }

    public static final Q2M A02(View view) {
        Q2R A01 = A01(view);
        Q2M q2m = A01.A04;
        if (q2m == null) {
            Context A0L = AbstractC166997dE.A0L(view);
            C63025Sav c63025Sav = A00(view).A0E;
            C14360o3.A07(c63025Sav);
            Q2M q2m2 = new Q2M(A0L, new C63025Sav(c63025Sav.A0C, c63025Sav.A09, c63025Sav.A0A, c63025Sav.A01, c63025Sav.A02, c63025Sav.A0B, c63025Sav.A08, c63025Sav.A03, c63025Sav.A00, c63025Sav.A07, c63025Sav.A06, c63025Sav.A05, c63025Sav.A04), C05F.A00);
            Drawable drawable = A01.A02;
            List list = A01.A06;
            view.setBackground(new Q2R(drawable, A01.A01, A01.A03, q2m2, list, A01.A05));
            return q2m2;
        }
        return q2m;
    }

    public static final void A09(View view, EnumC61190Rgq enumC61190Rgq, Float f) {
        float f2;
        boolean A1a = AbstractC167017dG.A1a(view, enumC61190Rgq);
        Q2N A002 = A00(view);
        int A003 = enumC61190Rgq.A00();
        if (f != null) {
            f2 = WF1.A01(f.floatValue());
        } else {
            f2 = Float.NaN;
        }
        C63191Set c63191Set = A002.A0D;
        if (c63191Set == null) {
            c63191Set = new C63191Set();
            A002.A0D = c63191Set;
        }
        if (!C62795SRp.A00(c63191Set.A03[A003], f2)) {
            c63191Set.A01(f2, A003);
            if (A003 == 0 || A003 == A1a || A003 == 2 || A003 == 3 || A003 == 4 || A003 == 5 || A003 == 8) {
                A002.A0H = A1a;
            }
            A002.invalidateSelf();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Q2R A01 = A01(view);
            SBS sbs = A01.A00;
            if (sbs == null) {
                sbs = new SBS();
            }
            A01.A00 = sbs;
            if (sbs != null) {
                sbs.A00[enumC61190Rgq.ordinal()] = f;
            }
            for (Drawable drawable : A01.A05) {
                C14360o3.A0C(drawable, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable");
                ((Q2L) drawable).A03(A01.A00);
                drawable.invalidateSelf();
            }
        }
    }
}
