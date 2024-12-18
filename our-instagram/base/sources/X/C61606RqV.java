package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.browser.helium.webview.HeliumLoader;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.RqV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61606RqV {
    public final Object A01(Context context, Resources resources, InterfaceC02550Ad interfaceC02550Ad, SVR svr, SJ8 sj8, QuickPerformanceLogger quickPerformanceLogger, C19L c19l) {
        return HeliumLoader.getInstance().load(context, resources, svr, quickPerformanceLogger, (InterfaceC65603Tns) null, sj8, interfaceC02550Ad, c19l);
    }

    public final EnumC61128Rfi A00() {
        return HeliumLoader.getInstance().getInitState();
    }

    public final void A02(Context context) {
        HeliumLoader.getInstance().warmUpChildProcess(context);
    }

    public final void A03(Context context) {
        HeliumLoader.getInstance().warmUpChildProcessWithDependencies(context);
    }
}
