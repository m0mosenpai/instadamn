package com.facebook.rsys.call.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class AddUsersOptions {
    public static C2N9 CONVERTER = YAN.A00(18);
    public static long sMcfTypeId;
    public final ArrayList customDataMessages;
    public final CallContext newCallContext;

    public static native AddUsersOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AddUsersOptions)) {
                return false;
            }
            AddUsersOptions addUsersOptions = (AddUsersOptions) obj;
            CallContext callContext = this.newCallContext;
            CallContext callContext2 = addUsersOptions.newCallContext;
            if (callContext == null) {
                if (callContext2 != null) {
                    return false;
                }
            } else if (!callContext.equals(callContext2)) {
                return false;
            }
            ArrayList arrayList = this.customDataMessages;
            ArrayList arrayList2 = addUsersOptions.customDataMessages;
            if (arrayList != null) {
                if (!arrayList.equals(arrayList2)) {
                    return false;
                }
            } else if (arrayList2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return JQ0.A01(AbstractC167017dG.A0M(this.newCallContext)) + AbstractC166997dE.A0I(this.customDataMessages);
    }

    public AddUsersOptions(CallContext callContext, ArrayList arrayList) {
        this.newCallContext = callContext;
        this.customDataMessages = arrayList;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AddUsersOptions{newCallContext=");
        A1C.append(this.newCallContext);
        A1C.append(",customDataMessages=");
        return JQ0.A0l(this.customDataMessages, A1C);
    }
}
