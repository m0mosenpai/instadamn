package com.instagram.direct.msys.plugins.msysanalyticsplugin;

import X.AbstractC11060iN;
import X.AbstractC126045mw;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC16850sd;
import X.AbstractC19330xH;
import X.AbstractC25225BEi;
import X.C14360o3;
import com.facebook.msys.mci.PrivacyContext;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class MsysAnalyticsPluginPremailbox extends Premailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysAnalyticsPluginPremailbox(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
    }

    @Override // com.instagram.direct.msys.plugins.msysanalyticsplugin.Premailbox
    public void MsysAnalyticsPluginPremailboxExtensionsDestroy() {
    }

    @Override // com.instagram.direct.msys.plugins.msysanalyticsplugin.Premailbox
    public void MsysAnalyticsImpl_MsysAnalyticsLog(PrivacyContext privacyContext, int i, int i2, boolean z, int i3, String str, String str2, long j, Map map, Map map2, List list) {
        LinkedHashMap linkedHashMap;
        AbstractC167017dG.A1T(str, str2);
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        AbstractC19330xH A00 = AbstractC11060iN.A00(userSession);
        LinkedHashMap linkedHashMap2 = null;
        if (map != null) {
            linkedHashMap = AbstractC25225BEi.A18(AbstractC16850sd.A0L(map.size()));
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                linkedHashMap.put(String.valueOf(A1K.getKey()), A1K.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        if (map2 != null) {
            linkedHashMap2 = AbstractC25225BEi.A18(AbstractC16850sd.A0L(map2.size()));
            Iterator A152 = AbstractC166997dE.A15(map2);
            while (A152.hasNext()) {
                Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                linkedHashMap2.put(String.valueOf(A1K2.getKey()), A1K2.getValue());
            }
        }
        A00.EHW(AbstractC126045mw.A00(str, str2, list, linkedHashMap, linkedHashMap2, i, i2, j, z));
    }
}
