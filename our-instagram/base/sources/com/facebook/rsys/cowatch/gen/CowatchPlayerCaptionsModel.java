package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class CowatchPlayerCaptionsModel {
    public final ArrayList captions;

    public static native CowatchPlayerCaptionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchPlayerCaptionsModel)) {
            return false;
        }
        return this.captions.equals(((CowatchPlayerCaptionsModel) obj).captions);
    }

    public final int hashCode() {
        return 527 + this.captions.hashCode();
    }

    public CowatchPlayerCaptionsModel(ArrayList arrayList) {
        arrayList.getClass();
        this.captions = arrayList;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchPlayerCaptionsModel{captions=");
        return JQ0.A0l(this.captions, A1C);
    }
}
