package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CowatchPmvCounterModel {
    public final int currentCount;
    public final String lastMediaId;
    public final String lastMediaSource;
    public final boolean needsUpdatePeer;

    public static native CowatchPmvCounterModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchPmvCounterModel)) {
                return false;
            }
            CowatchPmvCounterModel cowatchPmvCounterModel = (CowatchPmvCounterModel) obj;
            String str = this.lastMediaId;
            String str2 = cowatchPmvCounterModel.lastMediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.lastMediaSource;
            String str4 = cowatchPmvCounterModel.lastMediaSource;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            if (this.currentCount != cowatchPmvCounterModel.currentCount || this.needsUpdatePeer != cowatchPmvCounterModel.needsUpdatePeer) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((527 + AbstractC167017dG.A0O(this.lastMediaId)) * 31) + AbstractC25227BEk.A07(this.lastMediaSource)) * 31) + this.currentCount) * 31) + (this.needsUpdatePeer ? 1 : 0);
    }

    public CowatchPmvCounterModel(String str, String str2, int i, boolean z) {
        this.lastMediaId = str;
        this.lastMediaSource = str2;
        this.currentCount = i;
        this.needsUpdatePeer = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchPmvCounterModel{lastMediaId=");
        A1C.append(this.lastMediaId);
        A1C.append(",lastMediaSource=");
        A1C.append(this.lastMediaSource);
        A1C.append(",currentCount=");
        A1C.append(this.currentCount);
        A1C.append(",needsUpdatePeer=");
        A1C.append(this.needsUpdatePeer);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
