package com.facebook.cameracore.mediapipeline.services.memoryinfo;

import X.AbstractC12290kX;
import X.C14360o3;
import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes4.dex */
public final class MemoryInfoServiceImpl {
    public final long getAvailableMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        Object systemService = context.getSystemService("activity");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }
}
