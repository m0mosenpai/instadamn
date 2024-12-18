package X;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.facebook.R;

/* renamed from: X.Rsv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61740Rsv {
    public static final C62473SDa A00(Context context) {
        int i;
        int i2;
        C62473SDa c62473SDa = new C62473SDa(context, null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            C14360o3.A0B(activity, 0);
            if (activity.getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_DARK_MODE", false)) {
                Context context2 = c62473SDa.A00;
                C62776SQt c62776SQt = AbstractC62354S8b.A00;
                boolean AhA = C62776SQt.A00().AhA(AbstractC62400S9z.A00);
                boolean AhA2 = C62776SQt.A00().AhA(AbstractC62400S9z.A01);
                if (C62776SQt.A00().AhA(S6V.A00)) {
                    i = R.style.FDSDarkModeAccessible;
                } else {
                    if (AhA && AhA2) {
                        C0RG A00 = C62776SQt.A00();
                        long j = AbstractC62400S9z.A02;
                        if (A00.AhA(j) && C62776SQt.A00().AhA(AbstractC62400S9z.A03)) {
                            i = R.style.FDSDarkModeOneDotOV1TextAndWash;
                        } else {
                            C0RG A002 = C62776SQt.A00();
                            long j2 = AbstractC62400S9z.A04;
                            if (A002.AhA(j2) && C62776SQt.A00().AhA(AbstractC62400S9z.A05)) {
                                i = R.style.FDSDarkModeOneDotOV2TextAndWash;
                            } else {
                                C0RG A003 = C62776SQt.A00();
                                long j3 = AbstractC62400S9z.A06;
                                if (A003.AhA(j3) && C62776SQt.A00().AhA(AbstractC62400S9z.A05)) {
                                    i = R.style.FDSDarkModeOneDotOV3TextAndWash;
                                } else if (C62776SQt.A00().AhA(j)) {
                                    i = R.style.FDSDarkModeOneDotOV1Text;
                                } else if (C62776SQt.A00().AhA(j2)) {
                                    i = R.style.FDSDarkModeOneDotOV2Text;
                                } else if (C62776SQt.A00().AhA(j3)) {
                                    i = R.style.FDSDarkModeOneDotOV3Text;
                                } else if (C62776SQt.A00().AhA(AbstractC62400S9z.A03)) {
                                    i = R.style.FDSDarkModeOneDotOV1Wash;
                                } else {
                                    boolean AhA3 = C62776SQt.A00().AhA(AbstractC62400S9z.A05);
                                    i = R.style.FDSDarkModeOneDotO;
                                    if (AhA3) {
                                        i = R.style.FDSDarkModeOneDotOV2Wash;
                                    }
                                }
                            }
                        }
                    }
                    i2 = R.style.FDSDarkMode;
                    return new C62473SDa(new ContextThemeWrapper(context2, i2), c62473SDa.A01);
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    i2 = valueOf.intValue();
                    return new C62473SDa(new ContextThemeWrapper(context2, i2), c62473SDa.A01);
                }
                i2 = R.style.FDSDarkMode;
                return new C62473SDa(new ContextThemeWrapper(context2, i2), c62473SDa.A01);
            }
            return c62473SDa;
        }
        return c62473SDa;
    }
}
