package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC72049XLp;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class CowatchSuggestedContentQueueModel {
    public static C2N9 CONVERTER = YAN.A00(38);
    public static long sMcfTypeId;
    public final ArrayList nextMediaInfoModels;
    public final ArrayList previousMediaInfoModels;

    public static native CowatchSuggestedContentQueueModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchSuggestedContentQueueModel)) {
            return false;
        }
        CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel = (CowatchSuggestedContentQueueModel) obj;
        return this.previousMediaInfoModels.equals(cowatchSuggestedContentQueueModel.previousMediaInfoModels) && this.nextMediaInfoModels.equals(cowatchSuggestedContentQueueModel.nextMediaInfoModels);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.nextMediaInfoModels, AbstractC72049XLp.A02(this.previousMediaInfoModels));
    }

    public CowatchSuggestedContentQueueModel(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.previousMediaInfoModels = arrayList;
        this.nextMediaInfoModels = arrayList2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchSuggestedContentQueueModel{previousMediaInfoModels=");
        A1C.append(this.previousMediaInfoModels);
        A1C.append(",nextMediaInfoModels=");
        return JQ0.A0l(this.nextMediaInfoModels, A1C);
    }
}
