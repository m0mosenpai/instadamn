package com.instagram.wellbeing.timeinapp.instrumentation;

import X.C2A1;
import X.C2A3;
import X.C2OL;
import X.C54372O1e;
import X.EnumC49762Qj;
import X.InterfaceC13000lm;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.instagram.common.app.AbstractActivityLifecycleCallbacks;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class IgTimeInAppActivityListener extends AbstractActivityLifecycleCallbacks implements InterfaceC13000lm {
    public Context A00;
    public UserSession A01;
    public ScheduledExecutorService A02;
    public final C2A1 A04 = C2A1.A01;
    public boolean A03 = false;
    public final List A06 = Collections.synchronizedList(new ArrayList());
    public final C2OL A05 = new C2OL(this);

    public static synchronized IgTimeInAppActivityListener A00(Context context, UserSession userSession) {
        IgTimeInAppActivityListener igTimeInAppActivityListener;
        synchronized (IgTimeInAppActivityListener.class) {
            igTimeInAppActivityListener = (IgTimeInAppActivityListener) userSession.A00(IgTimeInAppActivityListener.class);
            if (igTimeInAppActivityListener == null) {
                igTimeInAppActivityListener = new IgTimeInAppActivityListener(context, userSession);
                ((Application) context).registerActivityLifecycleCallbacks(igTimeInAppActivityListener);
                userSession.A04(IgTimeInAppActivityListener.class, igTimeInAppActivityListener);
            }
        }
        return igTimeInAppActivityListener;
    }

    @Override // com.instagram.common.app.AbstractActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.A04.A01(EnumC49762Qj.BACKGROUND);
    }

    @Override // com.instagram.common.app.AbstractActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.A04.A01(EnumC49762Qj.FOREGROUND);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        ((Application) this.A00).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.A01.A00(IgTimeInAppActivityListener.class));
        C2A3 c2a3 = (C2A3) this.A04.A00.getAndSet(new C2A3());
        if (c2a3 != null) {
            synchronized (c2a3) {
                TimeInAppControllerWrapper timeInAppControllerWrapper = c2a3.A00;
                if (timeInAppControllerWrapper != null) {
                    timeInAppControllerWrapper.dispatch(EnumC49762Qj.BACKGROUND, null);
                    c2a3.A00 = null;
                } else {
                    c2a3.A01.add(new C54372O1e(EnumC49762Qj.BACKGROUND));
                }
            }
        }
    }

    public IgTimeInAppActivityListener(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
