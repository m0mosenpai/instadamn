package com.facebook.rsys.livevideo.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class LiveVideoCreationParameters {
    public static C2N9 CONVERTER = YAN.A00(59);
    public static long sMcfTypeId;
    public final int audience;
    public final boolean autoStart;
    public final ArrayList friendsList;
    public final String funnelSessionId;
    public final ArrayList shareSurfaces;
    public final int target;
    public final String targetId;
    public final String title;

    public static native LiveVideoCreationParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveVideoCreationParameters)) {
                return false;
            }
            LiveVideoCreationParameters liveVideoCreationParameters = (LiveVideoCreationParameters) obj;
            if (this.audience == liveVideoCreationParameters.audience && this.target == liveVideoCreationParameters.target && this.targetId.equals(liveVideoCreationParameters.targetId)) {
                ArrayList arrayList = this.friendsList;
                ArrayList arrayList2 = liveVideoCreationParameters.friendsList;
                if (arrayList == null) {
                    if (arrayList2 != null) {
                        return false;
                    }
                } else if (!arrayList.equals(arrayList2)) {
                    return false;
                }
                String str = this.title;
                String str2 = liveVideoCreationParameters.title;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (!this.funnelSessionId.equals(liveVideoCreationParameters.funnelSessionId) || this.autoStart != liveVideoCreationParameters.autoStart) {
                    return false;
                }
                ArrayList arrayList3 = this.shareSurfaces;
                ArrayList arrayList4 = liveVideoCreationParameters.shareSurfaces;
                if (arrayList3 != null) {
                    if (!arrayList3.equals(arrayList4)) {
                        return false;
                    }
                } else if (arrayList4 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC166997dE.A0K(this.funnelSessionId, (((AbstractC166997dE.A0K(this.targetId, (JQ0.A01(this.audience) + this.target) * 31) + AbstractC167017dG.A0M(this.friendsList)) * 31) + AbstractC167017dG.A0O(this.title)) * 31) + (this.autoStart ? 1 : 0)) * 31) + AbstractC166997dE.A0I(this.shareSurfaces);
    }

    public LiveVideoCreationParameters(int i, int i2, String str, ArrayList arrayList, String str2, String str3, boolean z, ArrayList arrayList2) {
        str.getClass();
        str3.getClass();
        this.audience = i;
        this.target = i2;
        this.targetId = str;
        this.friendsList = arrayList;
        this.title = str2;
        this.funnelSessionId = str3;
        this.autoStart = z;
        this.shareSurfaces = arrayList2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LiveVideoCreationParameters{audience=");
        A1C.append(this.audience);
        A1C.append(",target=");
        A1C.append(this.target);
        A1C.append(",targetId=");
        A1C.append(this.targetId);
        A1C.append(",friendsList=");
        A1C.append(this.friendsList);
        A1C.append(",title=");
        A1C.append(this.title);
        A1C.append(",funnelSessionId=");
        A1C.append(this.funnelSessionId);
        A1C.append(",autoStart=");
        A1C.append(this.autoStart);
        A1C.append(",shareSurfaces=");
        return JQ0.A0l(this.shareSurfaces, A1C);
    }
}
