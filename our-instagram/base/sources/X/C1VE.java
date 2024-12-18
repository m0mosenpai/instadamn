package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener;

/* renamed from: X.1VE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VE {
    public static C1VE A02;
    public final Context A00;
    public final InterfaceC09390do A01;

    public static final C1VH A00(C1VE c1ve) {
        return (C1VH) c1ve.A01.getValue();
    }

    public final void A01(UserSession userSession, Runnable runnable) {
        IgTimeInAppActivityListener A00 = IgTimeInAppActivityListener.A00(this.A00, userSession);
        if (A00.A03) {
            runnable.run();
        } else {
            A00.A06.add(new CPP(runnable));
        }
    }

    public C1VE(Context context) {
        this.A00 = context;
        this.A01 = AbstractC09440dt.A01(C1VF.A00);
    }

    public C1VE() {
    }
}
