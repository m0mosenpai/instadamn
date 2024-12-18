package com.meta.arfx.engine.interfaces;

import android.os.IInterface;
import android.view.Surface;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import java.util.List;

/* loaded from: classes4.dex */
public interface IAREngineServiceController extends IInterface {
    void AHT();

    void AQ3(List list, int i, int i2, int i3, long j, long j2, boolean z);

    void EGr(IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARExperimentUtilBinding iARExperimentUtilBinding, IARNetworkClientWorkerHost iARNetworkClientWorkerHost, int i, int i2, boolean z, boolean z2, boolean z3);

    void EGs();

    void EJd();

    void EQq(int i);

    void EQv(int i);

    void ETe(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z);

    void Edj(IAREngineServiceCallback iAREngineServiceCallback);

    void EfF(Surface surface, int i, int i2);

    void Ehn(VersionedSharedMemory versionedSharedMemory);

    void Eho(int i, int i2, int i3, int i4, boolean z);

    void EoW();

    void FB4(int[] iArr, int[] iArr2, int[] iArr3, float f, float f2, float f3, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2);
}
