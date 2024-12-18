package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.location.implementation.LocationDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.platformtexture.implementation.PlatformTextureDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid;
import com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkPolicyConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import com.facebook.cameracore.mediapipeline.services.persistence.implementation.PersistenceServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation.PlatformAlgorithmDataServiceConfigurationHybrid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AWN implements BBV {
    @Override // X.BBV
    public final ArrayList AEi(AnonymousClass904 anonymousClass904) {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(anonymousClass904.A03(AbstractC166987dD.A1F(Arrays.asList(C9Y5.A05, C203888zz.A01, C9Y0.A01, AnonymousClass901.A01, C90L.A01, GalleryPickerServiceConfiguration.A01, C90X.A01, AnonymousClass909.A01, C90T.A01, C90U.A01, C8zr.A02, C9Xz.A00, C2039490h.A01, C90a.A01))));
        AnonymousClass910 anonymousClass910 = anonymousClass904.A01;
        if (anonymousClass910 != null) {
            A1E.add(new FaceTrackerDataProviderConfigurationHybrid(anonymousClass910));
        }
        C203848zt c203848zt = C90B.A01;
        HashMap hashMap = anonymousClass904.A08;
        if (hashMap.containsKey(c203848zt)) {
            A1E.add(new MotionDataProviderConfigurationHybrid((C90B) anonymousClass904.A02(c203848zt)));
        }
        C2040490t c2040490t = anonymousClass904.A04;
        if (c2040490t != null) {
            A1E.add(new WorldTrackerDataProviderConfigurationHybrid(c2040490t));
        }
        C203848zt c203848zt2 = C90O.A02;
        if (hashMap.containsKey(c203848zt2)) {
            A1E.add(new PlatformEventsDataProviderConfigurationHybrid((C90O) anonymousClass904.A02(c203848zt2)));
        }
        C203848zt c203848zt3 = C2040090p.A01;
        if (hashMap.containsKey(c203848zt3)) {
            A1E.add(new PlatformTextureDataProviderConfigurationHybrid((C2040090p) anonymousClass904.A02(c203848zt3)));
        }
        C203848zt c203848zt4 = C90P.A05;
        if (hashMap.containsKey(c203848zt4)) {
            A1E.add(new PersistenceServiceConfigurationHybrid((C90P) anonymousClass904.A02(c203848zt4)));
        }
        C2039190d c2039190d = anonymousClass904.A03;
        if (c2039190d != null) {
            A1E.add(new LocationDataProviderConfigurationHybrid(c2039190d));
        }
        NetworkPolicyConfiguration networkPolicyConfiguration = anonymousClass904.A07;
        if (networkPolicyConfiguration != null) {
            A1E.add(new NetworkPolicyConfigurationHybrid(networkPolicyConfiguration));
        }
        C203848zt c203848zt5 = C2039290e.A01;
        if (hashMap.containsKey(c203848zt5)) {
            A1E.add(new PlatformAlgorithmDataServiceConfigurationHybrid((C2039290e) anonymousClass904.A02(c203848zt5)));
        }
        C203848zt c203848zt6 = C9Y3.A02;
        if (hashMap.containsKey(c203848zt6)) {
            A1E.add(new JavascriptModulesDataProviderConfigurationHybrid((C9Y3) anonymousClass904.A02(c203848zt6)));
        }
        Iterator A16 = AbstractC166997dE.A16(Collections.unmodifiableMap(anonymousClass904.A00));
        while (A16.hasNext()) {
            A1E.add(new ServiceMessageChannelHybrid((C22859A6c) A16.next()));
        }
        return A1E;
    }
}
