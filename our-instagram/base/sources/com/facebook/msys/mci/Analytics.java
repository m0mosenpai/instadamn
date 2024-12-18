package com.facebook.msys.mci;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface Analytics {
    EventLogSubscriber getTalEventSubscriber();

    void log(int i, int i2, boolean z, String str, String str2, long j, Map map, Map map2, List list);
}
