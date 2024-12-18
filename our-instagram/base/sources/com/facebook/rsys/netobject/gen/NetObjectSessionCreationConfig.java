package com.facebook.rsys.netobject.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class NetObjectSessionCreationConfig {
    public static C2N9 CONVERTER = YAM.A00(18);
    public static long sMcfTypeId;
    public final long autoPublishIntervalMs;
    public final String clientVersion;
    public final boolean notifyOnLocalChanges;

    public static native NetObjectSessionCreationConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof NetObjectSessionCreationConfig)) {
                return false;
            }
            NetObjectSessionCreationConfig netObjectSessionCreationConfig = (NetObjectSessionCreationConfig) obj;
            if (this.autoPublishIntervalMs == netObjectSessionCreationConfig.autoPublishIntervalMs) {
                String str = this.clientVersion;
                String str2 = netObjectSessionCreationConfig.clientVersion;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
                if (this.notifyOnLocalChanges != netObjectSessionCreationConfig.notifyOnLocalChanges) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((JQ0.A01(AbstractC25228BEl.A03(this.autoPublishIntervalMs)) + AbstractC167017dG.A0O(this.clientVersion)) * 31) + (this.notifyOnLocalChanges ? 1 : 0);
    }

    public NetObjectSessionCreationConfig(long j, String str, boolean z) {
        this.autoPublishIntervalMs = j;
        this.clientVersion = str;
        this.notifyOnLocalChanges = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NetObjectSessionCreationConfig{autoPublishIntervalMs=");
        A1C.append(this.autoPublishIntervalMs);
        A1C.append(",clientVersion=");
        A1C.append(this.clientVersion);
        A1C.append(",notifyOnLocalChanges=");
        return AbstractC50523MSb.A0X(A1C, this.notifyOnLocalChanges);
    }
}
