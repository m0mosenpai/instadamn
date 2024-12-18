package com.facebook.rsys.callcontext.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class CallContext {
    public static C2N9 CONVERTER = new LSW(1);
    public static long sMcfTypeId;
    public final McfReference appContext;
    public final int roomType;
    public final String selfActorId;
    public final String selfId;

    public static native CallContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallContext)) {
                return false;
            }
            CallContext callContext = (CallContext) obj;
            if (this.selfId.equals(callContext.selfId)) {
                String str = this.selfActorId;
                String str2 = callContext.selfActorId;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
                if (this.roomType != callContext.roomType || !this.appContext.equals(callContext.appContext)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.appContext, (((JQ0.A01(this.selfId.hashCode()) + AbstractC167017dG.A0O(this.selfActorId)) * 31) + this.roomType) * 31);
    }

    public CallContext(String str, String str2, int i, McfReference mcfReference) {
        str.getClass();
        mcfReference.getClass();
        this.selfId = str;
        this.selfActorId = str2;
        this.roomType = i;
        this.appContext = mcfReference;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CallContext{selfId=");
        A1C.append(this.selfId);
        A1C.append(",selfActorId=");
        A1C.append(this.selfActorId);
        A1C.append(",roomType=");
        A1C.append(this.roomType);
        A1C.append(",appContext=");
        return JQ0.A0l(this.appContext, A1C);
    }
}
