package X;

import com.instagram.api.schemas.IGRFSurveyContextDict;
import com.instagram.api.schemas.IGRFSurveyContextMappingDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hp0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40019Hp0 {
    public static Map A00(IGRFSurveyContextDict iGRFSurveyContextDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGRFSurveyContextDict.ArK() != null) {
            List<IGRFSurveyContextMappingDict> ArK = iGRFSurveyContextDict.ArK();
            ArrayList arrayList = null;
            if (ArK != null) {
                arrayList = AbstractC166987dD.A1E();
                for (IGRFSurveyContextMappingDict iGRFSurveyContextMappingDict : ArK) {
                    if (iGRFSurveyContextMappingDict != null) {
                        arrayList.add(iGRFSurveyContextMappingDict.F7o());
                    }
                }
            }
            A1I.put("context_data", arrayList);
        }
        if (iGRFSurveyContextDict.BIk() != null) {
            A1I.put("integration_point_id", iGRFSurveyContextDict.BIk());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
