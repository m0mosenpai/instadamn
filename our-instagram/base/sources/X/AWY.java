package X;

import com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider;
import java.io.File;

/* loaded from: classes4.dex */
public final class AWY implements SlamLibraryProvider {
    @Override // com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider
    public String getLibraryPath() {
        C09170dP.A0C("slam-native");
        try {
            File A01 = C09170dP.A01("slam-native");
            A01.getAbsolutePath();
            return A01.getAbsolutePath();
        } catch (Exception e) {
            C0K8.A0F("SLAMManager", "Fail to unpack SLAM library", e);
            return "";
        }
    }
}
