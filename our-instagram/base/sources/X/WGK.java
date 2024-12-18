package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.transition.Transition;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes11.dex */
public abstract class WGK {
    public static final RectF A00 = new RectF();

    public static RectF A03(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r3, view.getHeight() + r2);
    }

    public static float A00(float f, float f2, float f3, float f4, float f5) {
        if (f5 >= f3) {
            if (f5 > f4) {
                return f2;
            }
            return f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
        }
        return f;
    }

    public static float A01(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0N("Motion easing control point value must be between 0 and 1; instead got: ", parseFloat));
    }

    public static int A02(float f, float f2, float f3, int i, int i2) {
        if (f3 >= f) {
            if (f3 > f2) {
                return i2;
            }
            float f4 = i;
            return (int) (f4 + (((f3 - f) / (f2 - f)) * (i2 - f4)));
        }
        return i;
    }

    public static C65Q A04(RectF rectF, C65Q c65q) {
        C72G c72g = new C72G(c65q);
        C65U c65u = c65q.A02;
        if (!(c65u instanceof C72H)) {
            c65u = new C72H(c65u.Art(rectF) / rectF.height());
        }
        c72g.A02 = c65u;
        C65U c65u2 = c65q.A03;
        if (!(c65u2 instanceof C72H)) {
            c65u2 = new C72H(c65u2.Art(rectF) / rectF.height());
        }
        c72g.A03 = c65u2;
        C65U c65u3 = c65q.A00;
        if (!(c65u3 instanceof C72H)) {
            c65u3 = new C72H(c65u3.Art(rectF) / rectF.height());
        }
        c72g.A00 = c65u3;
        C65U c65u4 = c65q.A01;
        if (!(c65u4 instanceof C72H)) {
            c65u4 = new C72H(c65u4.Art(rectF) / rectF.height());
        }
        c72g.A01 = c65u4;
        return new C65Q(c72g);
    }

    public static void A05(TimeInterpolator timeInterpolator, Context context, Transition transition, int i) {
        if (i != 0 && transition.getInterpolator() == null) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(i, typedValue, true)) {
                if (typedValue.type == 3) {
                    String valueOf = String.valueOf(typedValue.string);
                    if (valueOf.startsWith(AnonymousClass001.A0R("cubic-bezier", "(")) && valueOf.endsWith(")")) {
                        String[] split = valueOf.substring("cubic-bezier".length() + 1, valueOf.length() - 1).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        int length = split.length;
                        if (length == 4) {
                            timeInterpolator = new PathInterpolator(A01(split, 0), A01(split, 1), A01(split, 2), A01(split, 3));
                        } else {
                            throw AbstractC25230BEn.A0n("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ", length);
                        }
                    } else if (valueOf.startsWith(AnonymousClass001.A0R("path", "(")) && valueOf.endsWith(")")) {
                        timeInterpolator = new PathInterpolator(AbstractC63041SbH.A00(valueOf.substring("path".length() + 1, valueOf.length() - 1)));
                    } else {
                        throw AbstractC167007dF.A0c("Invalid motion easing type: ", valueOf);
                    }
                } else {
                    throw new IllegalArgumentException("Motion easing theme attribute must be a string");
                }
            }
            transition.setInterpolator(timeInterpolator);
        }
    }

    public static void A06(Context context, Transition transition, int i) {
        TypedValue A02;
        int i2;
        if (i != 0 && transition.getDuration() == -1 && (A02 = AbstractC1343565e.A02(context, i)) != null && A02.type == 16 && (i2 = A02.data) != -1) {
            transition.setDuration(i2);
        }
    }
}
