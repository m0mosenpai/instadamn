package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import kotlin.Deprecated;

/* renamed from: X.2lE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58002lE {
    public static TargetViewSizeProvider A00;
    public static InterfaceC1812882f A01;

    @Deprecated(message = "")
    public static final TargetViewSizeProvider A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        if (A00 == null) {
            synchronized (TargetViewSizeProvider.class) {
                if (A00 == null) {
                    Context applicationContext = context.getApplicationContext();
                    C14360o3.A07(applicationContext);
                    A00 = new NineSixteenLayoutConfigImpl(applicationContext, C18U.A06(C06090Tz.A05, userSession, 36324960783839852L));
                }
            }
        }
        TargetViewSizeProvider targetViewSizeProvider = A00;
        if (targetViewSizeProvider != null) {
            return targetViewSizeProvider;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Deprecated(message = "")
    public static final InterfaceC1812882f A01(Context context) {
        if (A01 == null) {
            synchronized (InterfaceC1812882f.class) {
                if (A01 == null) {
                    Context applicationContext = context.getApplicationContext();
                    C14360o3.A07(applicationContext);
                    A01 = new C1812782e(AbstractC13890nF.A01(applicationContext), AbstractC13890nF.A00(applicationContext));
                }
            }
        }
        InterfaceC1812882f interfaceC1812882f = A01;
        if (interfaceC1812882f != null) {
            return interfaceC1812882f;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A02() {
        synchronized (TargetViewSizeProvider.class) {
            A00 = null;
        }
    }

    public static final void A03(Activity activity, UserSession userSession, MOT mot) {
        C57992lC c57992lC = C57982lB.A0B;
        if (C57992lC.A03()) {
            mot.DsR(A00(activity, userSession));
        } else {
            c57992lC.A05(activity, new M5B(activity, userSession, mot));
        }
    }
}
