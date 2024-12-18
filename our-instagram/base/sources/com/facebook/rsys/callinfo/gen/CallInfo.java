package com.facebook.rsys.callinfo.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class CallInfo {
    public static C2N9 CONVERTER = YAN.A00(20);
    public static long sMcfTypeId;
    public final int expansionBehavior;
    public final boolean isAdminAddOnly;
    public final String name;
    public final int state;
    public final ArrayList threadAdminIds;
    public final String threadPhotoURL;

    public static native CallInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallInfo)) {
                return false;
            }
            CallInfo callInfo = (CallInfo) obj;
            if (this.state == callInfo.state) {
                String str = this.name;
                String str2 = callInfo.name;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.expansionBehavior != callInfo.expansionBehavior) {
                    return false;
                }
                ArrayList arrayList = this.threadAdminIds;
                ArrayList arrayList2 = callInfo.threadAdminIds;
                if (arrayList == null) {
                    if (arrayList2 != null) {
                        return false;
                    }
                } else if (!arrayList.equals(arrayList2)) {
                    return false;
                }
                if (this.isAdminAddOnly != callInfo.isAdminAddOnly) {
                    return false;
                }
                String str3 = this.threadPhotoURL;
                String str4 = callInfo.threadPhotoURL;
                if (str3 != null) {
                    if (!str3.equals(str4)) {
                        return false;
                    }
                } else if (str4 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((JQ0.A01(this.state) + AbstractC167017dG.A0O(this.name)) * 31) + this.expansionBehavior) * 31) + AbstractC167017dG.A0M(this.threadAdminIds)) * 31) + (this.isAdminAddOnly ? 1 : 0)) * 31) + AbstractC25227BEk.A07(this.threadPhotoURL);
    }

    public CallInfo(int i, String str, int i2, ArrayList arrayList, boolean z, String str2) {
        this.state = i;
        this.name = str;
        this.expansionBehavior = i2;
        this.threadAdminIds = arrayList;
        this.isAdminAddOnly = z;
        this.threadPhotoURL = str2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CallInfo{state=");
        A1C.append(this.state);
        A1C.append(",name=");
        A1C.append(this.name);
        A1C.append(",expansionBehavior=");
        A1C.append(this.expansionBehavior);
        A1C.append(",threadAdminIds=");
        A1C.append(this.threadAdminIds);
        A1C.append(",isAdminAddOnly=");
        A1C.append(this.isAdminAddOnly);
        A1C.append(",threadPhotoURL=");
        return AbstractC50523MSb.A0W(this.threadPhotoURL, A1C);
    }
}
