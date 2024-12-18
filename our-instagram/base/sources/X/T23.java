package X;

import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.Systrace;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class T23 implements C0f2 {
    public final WeakReference A00;

    @Override // X.C0f2
    public final void DuR() {
        CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.A00.get();
        if (catalystInstanceImpl != null) {
            ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
        }
    }

    @Override // X.C0f2
    public final void DuT() {
        CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.A00.get();
        if (catalystInstanceImpl != null) {
            ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
        }
    }

    public T23(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = AbstractC25225BEi.A16(catalystInstanceImpl);
    }
}
