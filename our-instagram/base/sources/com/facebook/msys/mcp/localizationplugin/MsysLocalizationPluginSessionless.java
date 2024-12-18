package com.facebook.msys.mcp.localizationplugin;

import X.AbstractC31173DnH;
import X.AbstractC58318PtA;
import com.facebook.msys.mci.Localization;
import java.util.List;

/* loaded from: classes10.dex */
public class MsysLocalizationPluginSessionless extends Sessionless {
    @Override // com.facebook.msys.mcp.localizationplugin.Sessionless
    public String MsysLocalizationImpl_MsysLocalizationCopy(String str, String str2, List list) {
        String[] A1b;
        if (list == null) {
            A1b = new String[0];
        } else {
            A1b = AbstractC31173DnH.A1b(list, list.size());
        }
        return Localization.getLocalizedString(str, str2, A1b);
    }

    @Override // com.facebook.msys.mcp.localizationplugin.Sessionless
    public String MsysLocalizationImpl_MsysLocalizationCopyV2(long j, List list) {
        Object[] array;
        if (list == null) {
            array = AbstractC58318PtA.A1b();
        } else {
            array = list.toArray();
        }
        return Localization.getLocalizedStringV2(j, array);
    }
}
