package com.facebook.react.uimanager;

import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.AnonymousClass001;
import X.InterfaceC65543TmI;
import X.InterfaceC65589TnT;
import X.Q21;
import X.Q59;
import X.R3N;
import X.TXX;
import X.X9J;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactSoftExceptionLogger;

/* loaded from: classes10.dex */
public final class UIManagerHelper {
    public static X9J A05(Q21 q21, int i) {
        X9J A04 = A04(q21, i % 2 != 0 ? 1 : 2);
        if (A04 == null) {
            ReactSoftExceptionLogger.logSoftException("com.facebook.react.uimanager.UIManagerHelper", AbstractC31175DnJ.A0U("Cannot get EventDispatcher for reactTag ", i));
        }
        return A04;
    }

    public static int A00(Context context) {
        if (context instanceof R3N) {
            return ((R3N) context).A00;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int A01(View view) {
        if (view instanceof InterfaceC65543TmI) {
            Q59 q59 = (Q59) ((InterfaceC65543TmI) view);
            if (q59.A02 != 2) {
                return -1;
            }
            return q59.A01;
        }
        int id = view.getId();
        if (id % 2 != 0) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof R3N) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int A00 = A00(context);
        if (A00 == -1) {
            ReactSoftExceptionLogger.logSoftException("com.facebook.react.uimanager.UIManagerHelper", AbstractC166987dD.A14(AnonymousClass001.A0c("Fabric View [", "] does not have SurfaceId associated with it", id)));
        }
        return A00;
    }

    public static Q21 A02(View view) {
        Context context = view.getContext();
        if (!(context instanceof Q21) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Q21) context;
    }

    public static InterfaceC65589TnT A03(Q21 q21, int i, boolean z) {
        if (q21.A0I()) {
            InterfaceC65589TnT A05 = q21.A05();
            if (A05 == null) {
                TXX.A00("Cannot get UIManager because the instance hasn't been initialized yet.", "com.facebook.react.uimanager.UIManagerHelper");
                return null;
            }
            return A05;
        }
        if (!q21.A0G()) {
            TXX.A00("Cannot get UIManager because the context doesn't contain a CatalystInstance.", "com.facebook.react.uimanager.UIManagerHelper");
            return null;
        }
        if (!q21.A0F()) {
            TXX.A00("Cannot get UIManager because the context doesn't contain an active CatalystInstance.", "com.facebook.react.uimanager.UIManagerHelper");
            if (z) {
                return null;
            }
        }
        CatalystInstance A02 = q21.A02();
        try {
            if (i == 2) {
                return q21.A05();
            }
            return (InterfaceC65589TnT) A02.getNativeModule(UIManagerModule.class);
        } catch (IllegalArgumentException unused) {
            TXX.A00(AnonymousClass001.A0O("Cannot get UIManager for UIManagerType: ", i), "com.facebook.react.uimanager.UIManagerHelper");
            return (InterfaceC65589TnT) A02.getNativeModule(UIManagerModule.class);
        }
    }

    public static X9J A04(Q21 q21, int i) {
        if (q21.A0I()) {
            throw AbstractC166987dD.A15("getEventDispatcher");
        }
        InterfaceC65589TnT A03 = A03(q21, i, false);
        if (A03 == null) {
            TXX.A00(AnonymousClass001.A0O("Unable to find UIManager for UIManagerType ", i), "com.facebook.react.uimanager.UIManagerHelper");
            return null;
        }
        X9J x9j = ((UIManagerModule) A03).mEventDispatcher;
        if (x9j != null) {
            return x9j;
        }
        ReactSoftExceptionLogger.logSoftException("com.facebook.react.uimanager.UIManagerHelper", AbstractC31175DnJ.A0U("Cannot get EventDispatcher for UIManagerType ", i));
        return x9j;
    }
}
