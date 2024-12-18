package X;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.SdE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63110SdE {
    public static final Interpolator A02 = new LinearInterpolator();
    public static C63136Sdh A01 = C63136Sdh.A01("t", "s", "e", "o", "i", "h", "to", "ti");
    public static C63136Sdh A00 = C63136Sdh.A00("x", "y");

    public static BaseInterpolator A00(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        PointF pointF3 = AbstractC63251Sg7.A00;
        pointF.x = AbstractC58322PtE.A01(1.0f, f, -1.0f);
        pointF.y = AbstractC58322PtE.A01(100.0f, pointF.y, -100.0f);
        float A012 = AbstractC58322PtE.A01(1.0f, pointF2.x, -1.0f);
        pointF2.x = A012;
        float A013 = AbstractC58322PtE.A01(100.0f, pointF2.y, -100.0f);
        pointF2.y = A013;
        try {
            return new PathInterpolator(pointF.x, pointF.y, A012, A013);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                return new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    public static C63366SiP A01(SQ2 sq2, InterfaceC65311Thn interfaceC65311Thn, THX thx, float f, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        PointF pointF;
        PointF pointF2;
        float f2;
        Interpolator A002;
        C63366SiP c63366SiP;
        if (z) {
            if (z2) {
                thx.A0J();
                pointF2 = null;
                boolean z3 = false;
                PointF pointF3 = null;
                PointF pointF4 = null;
                PointF pointF5 = null;
                obj2 = null;
                PointF pointF6 = null;
                PointF pointF7 = null;
                PointF pointF8 = null;
                f2 = 0.0f;
                pointF = null;
                obj = null;
                while (thx.A0Q()) {
                    switch (thx.A0D(A01)) {
                        case 0:
                            f2 = AbstractC58321PtD.A03(thx);
                            continue;
                        case 1:
                            obj2 = interfaceC65311Thn.E3O(thx, f);
                            continue;
                        case 2:
                            obj = interfaceC65311Thn.E3O(thx, f);
                            continue;
                        case 3:
                            if (thx.A0E() == C05F.A0C) {
                                thx.A0J();
                                float f3 = 0.0f;
                                float f4 = 0.0f;
                                float f5 = 0.0f;
                                float f6 = 0.0f;
                                while (thx.A0Q()) {
                                    int A0D = thx.A0D(A00);
                                    if (A0D != 0) {
                                        if (A0D != 1) {
                                            thx.A0N();
                                        } else {
                                            Integer A0E = thx.A0E();
                                            Integer num = C05F.A0u;
                                            if (A0E == num) {
                                                f6 = AbstractC58321PtD.A03(thx);
                                                f4 = f6;
                                            } else {
                                                thx.A0I();
                                                f4 = AbstractC58321PtD.A03(thx);
                                                if (thx.A0E() == num) {
                                                    f6 = AbstractC58321PtD.A03(thx);
                                                } else {
                                                    f6 = f4;
                                                }
                                                thx.A0K();
                                            }
                                        }
                                    } else {
                                        Integer A0E2 = thx.A0E();
                                        Integer num2 = C05F.A0u;
                                        if (A0E2 == num2) {
                                            f5 = AbstractC58321PtD.A03(thx);
                                            f3 = f5;
                                        } else {
                                            thx.A0I();
                                            f3 = AbstractC58321PtD.A03(thx);
                                            if (thx.A0E() == num2) {
                                                f5 = AbstractC58321PtD.A03(thx);
                                            } else {
                                                f5 = f3;
                                            }
                                            thx.A0K();
                                        }
                                    }
                                }
                                pointF5 = new PointF(f3, f4);
                                pointF6 = new PointF(f5, f6);
                                break;
                            } else {
                                pointF3 = AbstractC63319ShS.A02(thx, f);
                                break;
                            }
                        case 4:
                            if (thx.A0E() == C05F.A0C) {
                                thx.A0J();
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                float f9 = 0.0f;
                                float f10 = 0.0f;
                                while (thx.A0Q()) {
                                    int A0D2 = thx.A0D(A00);
                                    if (A0D2 != 0) {
                                        if (A0D2 != 1) {
                                            thx.A0N();
                                        } else {
                                            Integer A0E3 = thx.A0E();
                                            Integer num3 = C05F.A0u;
                                            if (A0E3 == num3) {
                                                f10 = AbstractC58321PtD.A03(thx);
                                                f8 = f10;
                                            } else {
                                                thx.A0I();
                                                f8 = AbstractC58321PtD.A03(thx);
                                                if (thx.A0E() == num3) {
                                                    f10 = AbstractC58321PtD.A03(thx);
                                                } else {
                                                    f10 = f8;
                                                }
                                                thx.A0K();
                                            }
                                        }
                                    } else {
                                        Integer A0E4 = thx.A0E();
                                        Integer num4 = C05F.A0u;
                                        if (A0E4 == num4) {
                                            f9 = AbstractC58321PtD.A03(thx);
                                            f7 = f9;
                                        } else {
                                            thx.A0I();
                                            f7 = AbstractC58321PtD.A03(thx);
                                            if (thx.A0E() == num4) {
                                                f9 = AbstractC58321PtD.A03(thx);
                                            } else {
                                                f9 = f7;
                                            }
                                            thx.A0K();
                                        }
                                    }
                                }
                                pointF7 = new PointF(f7, f8);
                                pointF8 = new PointF(f9, f10);
                                break;
                            } else {
                                pointF4 = AbstractC63319ShS.A02(thx, f);
                                break;
                            }
                        case 5:
                            z3 = AbstractC167007dF.A1P(thx.A0C(), 1);
                            continue;
                        case 6:
                            pointF = AbstractC63319ShS.A02(thx, f);
                            continue;
                        case 7:
                            pointF2 = AbstractC63319ShS.A02(thx, f);
                            continue;
                        default:
                            thx.A0N();
                            continue;
                    }
                    thx.A0L();
                }
                thx.A0L();
                if (!z3) {
                    if (pointF3 != null && pointF4 != null) {
                        A002 = A00(pointF3, pointF4);
                        c63366SiP = new C63366SiP(A002, sq2, (Float) null, obj2, obj, f2);
                        c63366SiP.A05 = pointF;
                        c63366SiP.A06 = pointF2;
                        return c63366SiP;
                    }
                    if (pointF5 != null && pointF6 != null && pointF7 != null && pointF8 != null) {
                        c63366SiP = new C63366SiP(A00(pointF5, pointF7), A00(pointF6, pointF8), sq2, obj2, obj, f2);
                        c63366SiP.A05 = pointF;
                        c63366SiP.A06 = pointF2;
                        return c63366SiP;
                    }
                    A002 = A02;
                    c63366SiP = new C63366SiP(A002, sq2, (Float) null, obj2, obj, f2);
                    c63366SiP.A05 = pointF;
                    c63366SiP.A06 = pointF2;
                    return c63366SiP;
                }
                A002 = A02;
                obj = obj2;
                c63366SiP = new C63366SiP(A002, sq2, (Float) null, obj2, obj, f2);
                c63366SiP.A05 = pointF;
                c63366SiP.A06 = pointF2;
                return c63366SiP;
            }
            thx.A0J();
            PointF pointF9 = null;
            PointF pointF10 = null;
            obj = null;
            obj2 = null;
            pointF = null;
            pointF2 = null;
            boolean z4 = false;
            f2 = 0.0f;
            while (thx.A0Q()) {
                switch (thx.A0D(A01)) {
                    case 0:
                        f2 = AbstractC58321PtD.A03(thx);
                        break;
                    case 1:
                        obj2 = interfaceC65311Thn.E3O(thx, f);
                        break;
                    case 2:
                        obj = interfaceC65311Thn.E3O(thx, f);
                        break;
                    case 3:
                        pointF9 = AbstractC63319ShS.A02(thx, 1.0f);
                        break;
                    case 4:
                        pointF10 = AbstractC63319ShS.A02(thx, 1.0f);
                        break;
                    case 5:
                        z4 = AbstractC167007dF.A1P(thx.A0C(), 1);
                        break;
                    case 6:
                        pointF = AbstractC63319ShS.A02(thx, f);
                        break;
                    case 7:
                        pointF2 = AbstractC63319ShS.A02(thx, f);
                        break;
                    default:
                        thx.A0N();
                        break;
                }
            }
            thx.A0L();
            if (!z4) {
                if (pointF9 != null && pointF10 != null) {
                    A002 = A00(pointF9, pointF10);
                    c63366SiP = new C63366SiP(A002, sq2, (Float) null, obj2, obj, f2);
                    c63366SiP.A05 = pointF;
                    c63366SiP.A06 = pointF2;
                    return c63366SiP;
                }
                A002 = A02;
                c63366SiP = new C63366SiP(A002, sq2, (Float) null, obj2, obj, f2);
                c63366SiP.A05 = pointF;
                c63366SiP.A06 = pointF2;
                return c63366SiP;
            }
            A002 = A02;
            obj = obj2;
            c63366SiP = new C63366SiP(A002, sq2, (Float) null, obj2, obj, f2);
            c63366SiP.A05 = pointF;
            c63366SiP.A06 = pointF2;
            return c63366SiP;
        }
        return new C63366SiP(interfaceC65311Thn.E3O(thx, f));
    }
}
