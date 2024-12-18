package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import java.util.HashMap;

/* renamed from: X.91k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2041591k {
    public static HashMap A00(ModelPathsHolder modelPathsHolder) {
        HashMap hashMap = new HashMap();
        hashMap.put("face_tracker_model.bin", modelPathsHolder.getModelPath(EnumC1825988f.A06));
        hashMap.put("face_detector_model.bin", modelPathsHolder.getModelPath(EnumC1825988f.A08));
        hashMap.put("features_model.bin", modelPathsHolder.getModelPath(EnumC1825988f.A07));
        hashMap.put("pdm_multires.bin", modelPathsHolder.getModelPath(EnumC1825988f.A09));
        return hashMap;
    }
}
