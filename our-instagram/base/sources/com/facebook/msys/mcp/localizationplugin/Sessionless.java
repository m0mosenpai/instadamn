package com.facebook.msys.mcp.localizationplugin;

import java.util.List;

/* loaded from: classes10.dex */
public abstract class Sessionless {
    private String MsysLocalizationImpl_MsysLocalizationCopyJNI(String str, String str2, List list) {
        if (list == null) {
            list = null;
        }
        String MsysLocalizationImpl_MsysLocalizationCopy = MsysLocalizationImpl_MsysLocalizationCopy(str, str2, list);
        if (MsysLocalizationImpl_MsysLocalizationCopy != null) {
            return MsysLocalizationImpl_MsysLocalizationCopy;
        }
        return null;
    }

    private String MsysLocalizationImpl_MsysLocalizationCopyV2JNI(long j, List list) {
        if (list == null) {
            list = null;
        }
        String MsysLocalizationImpl_MsysLocalizationCopyV2 = MsysLocalizationImpl_MsysLocalizationCopyV2(j, list);
        if (MsysLocalizationImpl_MsysLocalizationCopyV2 != null) {
            return MsysLocalizationImpl_MsysLocalizationCopyV2;
        }
        return null;
    }

    public abstract String MsysLocalizationImpl_MsysLocalizationCopy(String str, String str2, List list);

    public abstract String MsysLocalizationImpl_MsysLocalizationCopyV2(long j, List list);
}
