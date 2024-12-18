package X;

import com.instagram.api.schemas.ElectionAddYoursInfoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VOE {
    public static Map A00(ElectionAddYoursInfoDictIntf electionAddYoursInfoDictIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (electionAddYoursInfoDictIntf.Axo() != null) {
            linkedHashMap.put("disable_bottom_sheet", electionAddYoursInfoDictIntf.Axo());
        }
        if (electionAddYoursInfoDictIntf.C91() != null) {
            linkedHashMap.put("title_options", electionAddYoursInfoDictIntf.C91());
        }
        if (electionAddYoursInfoDictIntf.CAs() != null) {
            linkedHashMap.put("tray_title", electionAddYoursInfoDictIntf.CAs());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
