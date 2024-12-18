package com.facebook.papaya.client.platform;

import X.AbstractC167007dF;
import X.TV6;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public class PlatformThreadUtil {
    public static ScheduledExecutorService createExecutor(String str) {
        if (!str.equals("scheduling_thread")) {
            if (str.equals("random_thread")) {
                return Executors.newScheduledThreadPool(5, new TV6(2));
            }
            throw AbstractC167007dF.A0c("No executor for type ", str);
        }
        return Executors.newSingleThreadScheduledExecutor(new TV6(1));
    }
}
