package X;

import com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AWO implements BBV {
    @Override // X.BBV
    public final ArrayList AEi(AnonymousClass904 anonymousClass904) {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(anonymousClass904.A03(AbstractC166987dD.A1F(Arrays.asList(AnonymousClass901.A01, C2039490h.A01))));
        C0K8.A0O("AREngineService", "Configuration size: %d", Integer.valueOf(A1E.size()));
        C203848zt c203848zt = C9Y3.A02;
        if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
            A1E.add(new JavascriptModulesDataProviderConfigurationHybrid((C9Y3) anonymousClass904.A02(c203848zt)));
        }
        Iterator it = AbstractC001800i.A0X(Collections.unmodifiableMap(anonymousClass904.A00).values()).iterator();
        while (it.hasNext()) {
            A1E.add(new ServiceMessageChannelHybrid((C22859A6c) it.next()));
        }
        return A1E;
    }
}
