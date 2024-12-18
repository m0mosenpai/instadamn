package X;

import com.facebook.tigon.TigonErrorException;

/* loaded from: classes10.dex */
public abstract class S1U {
    public static final int A00(Throwable th) {
        if (th instanceof TigonErrorException) {
            return ((TigonErrorException) th).tigonError.category.value;
        }
        if ("GraphServicesException".equals(MSY.A0h(th))) {
            C0K8.A0K("GraphServicesException", "Unhandled GraphServicesException detected.", new Exception("Unhandled GraphServicesException detected."));
            return -1;
        }
        return -1;
    }
}
