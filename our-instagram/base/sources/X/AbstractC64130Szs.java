package X;

import com.facebook.react.DebugCorePackage;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Szs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64130Szs implements InterfaceC65493TlF {
    @Override // X.InterfaceC65493TlF
    public final List ANV(R3M r3m) {
        List emptyList;
        if (this instanceof DebugCorePackage) {
            DebugCorePackage debugCorePackage = (DebugCorePackage) this;
            Map map = debugCorePackage.A00;
            Map map2 = map;
            if (map == null) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put(DebuggingOverlayManager.REACT_CLASS, new C63137Sdi(new C64812TVb(2)));
                debugCorePackage.A00 = A1G;
                map2 = A1G;
            }
            emptyList = AbstractC31180DnO.A0n(map2);
        } else {
            emptyList = Collections.emptyList();
        }
        if (emptyList != null && !emptyList.isEmpty()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                A1E.add(((C63137Sdi) it.next()).A01.get());
            }
            return A1E;
        }
        return Collections.emptyList();
    }

    public static void A00(AbstractMap abstractMap, Class[] clsArr, int i) {
        Class cls = clsArr[i];
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        String name = reactModule.name();
        abstractMap.put(name, new SX2(name, cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
    }

    @Override // X.InterfaceC65493TlF
    public final List AMb(R3M r3m) {
        throw AbstractC166987dD.A1D("createNativeModules method is not supported. Use getModule() method instead.");
    }
}
