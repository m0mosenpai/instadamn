package com.facebook.rsys.netobject.gen;

import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class NetObjectPeerMetadata {
    public static C2N9 CONVERTER = YAM.A00(15);
    public static long sMcfTypeId;
    public final String clientVersion;

    public static native NetObjectPeerMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof NetObjectPeerMetadata)) {
                return false;
            }
            String str = this.clientVersion;
            String str2 = ((NetObjectPeerMetadata) obj).clientVersion;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 527 + AbstractC167017dG.A0O(this.clientVersion);
    }

    public String toString() {
        return AnonymousClass001.A0g("NetObjectPeerMetadata{clientVersion=", this.clientVersion, "}");
    }

    public NetObjectPeerMetadata(String str) {
        this.clientVersion = str;
    }
}
