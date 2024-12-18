package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common;

import X.A4C;
import X.C05F;
import X.C14360o3;
import X.EnumC223229t6;
import X.InterfaceC150596qC;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class ARExperimentConfigImpl extends ARExperimentConfig {
    public final InterfaceC150596qC arExperimentUtil;

    private final native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    public String getString(int i, String str) {
        Integer num;
        C14360o3.A0B(str, 1);
        InterfaceC150596qC interfaceC150596qC = this.arExperimentUtil;
        if (interfaceC150596qC != null) {
            if (i >= 0) {
                Integer[] numArr = A4C.A03;
                if (i < numArr.length) {
                    num = numArr[i];
                    return interfaceC150596qC.C2n(num, str);
                }
            }
            num = C05F.A00;
            return interfaceC150596qC.C2n(num, str);
        }
        return str;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    public boolean getBool(int i, boolean z) {
        EnumC223229t6 enumC223229t6;
        InterfaceC150596qC interfaceC150596qC = this.arExperimentUtil;
        if (interfaceC150596qC != null) {
            if (i >= 0) {
                EnumC223229t6[] enumC223229t6Arr = A4C.A00;
                if (i < enumC223229t6Arr.length) {
                    enumC223229t6 = enumC223229t6Arr[i];
                    return interfaceC150596qC.Ah6(enumC223229t6, z);
                }
            }
            enumC223229t6 = EnumC223229t6.A03;
            return interfaceC150596qC.Ah6(enumC223229t6, z);
        }
        return z;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    public boolean getBoolWithoutLogging(int i, boolean z) {
        EnumC223229t6 enumC223229t6;
        InterfaceC150596qC interfaceC150596qC = this.arExperimentUtil;
        if (interfaceC150596qC != null) {
            if (i >= 0) {
                EnumC223229t6[] enumC223229t6Arr = A4C.A00;
                if (i < enumC223229t6Arr.length) {
                    enumC223229t6 = enumC223229t6Arr[i];
                    return interfaceC150596qC.Ah8(enumC223229t6, z);
                }
            }
            enumC223229t6 = EnumC223229t6.A03;
            return interfaceC150596qC.Ah8(enumC223229t6, z);
        }
        return z;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    public double getDouble(int i, double d) {
        Integer num;
        InterfaceC150596qC interfaceC150596qC = this.arExperimentUtil;
        if (interfaceC150596qC != null) {
            if (i >= 0) {
                Integer[] numArr = A4C.A01;
                if (i < numArr.length) {
                    num = numArr[i];
                    return interfaceC150596qC.Az4(num, d);
                }
            }
            num = C05F.A00;
            return interfaceC150596qC.Az4(num, d);
        }
        return d;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    public long getLong(int i, long j) {
        Integer num;
        InterfaceC150596qC interfaceC150596qC = this.arExperimentUtil;
        if (interfaceC150596qC != null) {
            if (i >= 0) {
                Integer[] numArr = A4C.A02;
                if (i < numArr.length) {
                    num = numArr[i];
                    return interfaceC150596qC.BP5(num, j);
                }
            }
            num = C05F.A00;
            return interfaceC150596qC.BP5(num, j);
        }
        return j;
    }

    public ARExperimentConfigImpl(InterfaceC150596qC interfaceC150596qC) {
        this.mHybridData = initHybrid();
        this.arExperimentUtil = interfaceC150596qC;
    }

    public ARExperimentConfigImpl() {
        this(null);
    }
}
