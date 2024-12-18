package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class T07 implements InterfaceC65542TmH {
    public final /* synthetic */ IntentModule A00;

    @Override // X.InterfaceC65542TmH
    public final void onHostDestroy() {
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostPause() {
    }

    public T07(IntentModule intentModule) {
        this.A00 = intentModule;
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostResume() {
        IntentModule intentModule = this.A00;
        AbstractC58321PtD.A0b(intentModule).A0B(this);
        synchronized (intentModule) {
            Iterator it = intentModule.mPendingOpenURLPromises.iterator();
            while (it.hasNext()) {
                intentModule.getInitialURL((InterfaceC65622ToD) it.next());
            }
            intentModule.mInitialURLListener = null;
            intentModule.mPendingOpenURLPromises.clear();
        }
    }
}
