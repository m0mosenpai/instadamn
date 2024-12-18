package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.facebook.R;
import java.util.Random;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.2bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53172bz {
    public static final Context A01(Context context) {
        int i;
        C14360o3.A0B(context, 0);
        if (AbstractC53242c7.A0L(context, R.attr.igds_dark_mode, false)) {
            return context;
        }
        if (C14640oc.A07()) {
            boolean A00 = AbstractC53182c0.A00();
            i = R.style.IgdsPrismSemanticColorsExperimentDark;
            if (A00) {
                i = R.style.IgdsPrismSemanticColorsAXExperimentDark;
            }
        } else {
            i = R.style.IgdsSemanticColorsDark;
        }
        return new ContextThemeWrapper(context, i);
    }

    public static final Context A02(Context context) {
        int i;
        C14360o3.A0B(context, 0);
        if (!AbstractC53242c7.A0L(context, R.attr.igds_dark_mode, false)) {
            return context;
        }
        if (C14640oc.A07()) {
            boolean A00 = AbstractC53182c0.A00();
            i = R.style.IgdsPrismSemanticColorsExperimentLight;
            if (A00) {
                i = R.style.IgdsPrismSemanticColorsAXExperimentLight;
            }
        } else {
            i = R.style.IgdsSemanticColorsLight;
        }
        return new ContextThemeWrapper(context, i);
    }

    public static final void A03(Context context, Exception exc) {
        C14360o3.A0B(context, 0);
        String obj = context.getTheme().toString();
        C14360o3.A07(obj);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        C1KE c1ke = new C1KE(c006802i, new Random(), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        StringBuilder sb = new StringBuilder();
        sb.append("Missing color theme in this context: ");
        sb.append(context);
        C0f5 AEp = c1ke.AEp(sb.toString(), 825229313);
        AEp.ERI(exc);
        AEp.ABW("themeMap", obj);
        AEp.report();
    }

    public static final int A00() {
        if (C14640oc.A07()) {
            if (!AbstractC53182c0.A00()) {
                return R.style.IgdsPrismSemanticColorsExperiment;
            }
            return R.style.IgdsPrismSemanticColorsAXExperiment;
        }
        return R.style.IgdsSemanticColors;
    }
}
