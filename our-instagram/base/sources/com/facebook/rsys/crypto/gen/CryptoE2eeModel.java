package com.facebook.rsys.crypto.gen;

import X.C2N9;
import X.JQ0;
import X.WV3;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class CryptoE2eeModel {
    public static C2N9 CONVERTER = new WV3(0);
    public static long sMcfTypeId;
    public final int mode;
    public final ArrayList participantIdentities;

    public static native CryptoE2eeModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoE2eeModel)) {
            return false;
        }
        CryptoE2eeModel cryptoE2eeModel = (CryptoE2eeModel) obj;
        return this.mode == cryptoE2eeModel.mode && this.participantIdentities.equals(cryptoE2eeModel.participantIdentities);
    }

    public int hashCode() {
        return ((527 + this.mode) * 31) + this.participantIdentities.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CryptoE2eeModel{mode=");
        sb.append(this.mode);
        sb.append(",participantIdentities=");
        return JQ0.A0l(this.participantIdentities, sb);
    }

    public CryptoE2eeModel(int i, ArrayList arrayList) {
        arrayList.getClass();
        this.mode = i;
        this.participantIdentities = arrayList;
    }
}
