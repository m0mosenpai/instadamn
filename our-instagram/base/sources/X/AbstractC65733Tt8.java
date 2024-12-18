package X;

import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Tt8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65733Tt8 {
    public static Map A00(MediaCroppingCoordinatesIntf mediaCroppingCoordinatesIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mediaCroppingCoordinatesIntf.AtD();
        linkedHashMap.put("crop_bottom", AnonymousClass010.A0m(String.valueOf(mediaCroppingCoordinatesIntf.AtD())));
        mediaCroppingCoordinatesIntf.AtG();
        linkedHashMap.put("crop_left", AnonymousClass010.A0m(String.valueOf(mediaCroppingCoordinatesIntf.AtG())));
        mediaCroppingCoordinatesIntf.AtI();
        linkedHashMap.put("crop_right", AnonymousClass010.A0m(String.valueOf(mediaCroppingCoordinatesIntf.AtI())));
        mediaCroppingCoordinatesIntf.AtJ();
        linkedHashMap.put("crop_top", AnonymousClass010.A0m(String.valueOf(mediaCroppingCoordinatesIntf.AtJ())));
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
