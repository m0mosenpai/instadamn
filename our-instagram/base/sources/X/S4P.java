package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes10.dex */
public abstract class S4P {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        char c;
        FragmentActivity activity;
        C64483TFt c64483TFt;
        String[] strArr;
        String A00;
        Object A10 = MSW.A10(c6fw, 4);
        if (A10 instanceof String) {
            String str = (String) A10;
            if (!str.equals("MEDIA_PICKER")) {
                if (str.equals("CAMERA")) {
                    Context context = C6BQ.A09(c6fq).A00;
                    c = 0;
                    A00 = "android.permission.CAMERA";
                    if (AbstractC23451Ch.A07(context, "android.permission.CAMERA")) {
                        AbstractC63088ScB.A01(context, c6fq, c6fw);
                    } else {
                        activity = C6BQ.A01(c6fq).getActivity();
                        if (activity != null) {
                            c64483TFt = new C64483TFt(1, activity, context, c6fw, c6fq);
                            strArr = new String[1];
                            strArr[c] = A00;
                            AbstractC23451Ch.A04(activity, c64483TFt, strArr);
                            return null;
                        }
                    }
                }
            } else {
                Context context2 = C6BQ.A09(c6fq).A00;
                c = 0;
                if (AbstractC23451Ch.A07(context2, AbstractC63088ScB.A00(context2))) {
                    AbstractC63088ScB.A02(context2, c6fq, c6fw);
                    return null;
                }
                activity = C6BQ.A01(c6fq).getActivity();
                if (activity != null) {
                    c64483TFt = new C64483TFt(2, activity, context2, c6fw, c6fq);
                    strArr = new String[1];
                    A00 = AbstractC63088ScB.A00(context2);
                    strArr[c] = A00;
                    AbstractC23451Ch.A04(activity, c64483TFt, strArr);
                    return null;
                }
            }
        }
        return null;
    }
}
