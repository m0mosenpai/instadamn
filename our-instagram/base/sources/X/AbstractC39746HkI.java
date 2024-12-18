package X;

import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.IGAdScreenshotURLDataDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HkI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39746HkI {
    public static Map A00(AppstoreMetadataDict appstoreMetadataDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (appstoreMetadataDict.Aen() != null) {
            A1I.put("average_rating", AbstractC166997dE.A0f(appstoreMetadataDict.Aen()));
        }
        if (appstoreMetadataDict.BIT() != null) {
            A1I.put(AbstractC111324zv.A00(4707), appstoreMetadataDict.BIT());
        }
        if (appstoreMetadataDict.BXz() != null) {
            A1I.put("num_reviews", appstoreMetadataDict.BXz());
        }
        if (appstoreMetadataDict.BY0() != null) {
            A1I.put(AbstractC111324zv.A00(5005), appstoreMetadataDict.BY0());
        }
        if (appstoreMetadataDict.Bqw() != null) {
            List<IGAdScreenshotURLDataDict> Bqw = appstoreMetadataDict.Bqw();
            ArrayList arrayList = null;
            if (Bqw != null) {
                arrayList = AbstractC166987dD.A1E();
                for (IGAdScreenshotURLDataDict iGAdScreenshotURLDataDict : Bqw) {
                    if (iGAdScreenshotURLDataDict != null) {
                        arrayList.add(iGAdScreenshotURLDataDict.F7o());
                    }
                }
            }
            A1I.put("screenshots", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
