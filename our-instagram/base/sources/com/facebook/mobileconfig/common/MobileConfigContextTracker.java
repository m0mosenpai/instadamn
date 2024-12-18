package com.facebook.mobileconfig.common;

import java.util.Map;

/* loaded from: classes.dex */
public interface MobileConfigContextTracker {
    boolean checkExitForSubkeyInNamespace(String str, String str2);

    boolean getBoolForKey(String str);

    int getIntForKey(String str);

    long getLongForKey(String str);

    String getStringForKey(String str);

    String getStringForSubkeyInNamespace(String str, String str2);

    void removeForKey(String str);

    void removeForNamespace(String str);

    void setBoolForKey(String str, boolean z);

    void setIntForKey(String str, int i);

    void setLongForKey(String str, long j);

    void setStringForKey(String str, String str2);

    void setStringForKeysInNamespace(String str, Map map, String str2);
}
