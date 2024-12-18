package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC72049XLp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class CowatchAddMediaDialogPrefetchModel {
    public final ArrayList logs;
    public final int pageToPrefetch;

    public static native CowatchAddMediaDialogPrefetchModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchAddMediaDialogPrefetchModel)) {
            return false;
        }
        CowatchAddMediaDialogPrefetchModel cowatchAddMediaDialogPrefetchModel = (CowatchAddMediaDialogPrefetchModel) obj;
        return this.logs.equals(cowatchAddMediaDialogPrefetchModel.logs) && this.pageToPrefetch == cowatchAddMediaDialogPrefetchModel.pageToPrefetch;
    }

    public final int hashCode() {
        return AbstractC72049XLp.A02(this.logs) + this.pageToPrefetch;
    }

    public CowatchAddMediaDialogPrefetchModel(ArrayList arrayList, int i) {
        arrayList.getClass();
        this.logs = arrayList;
        this.pageToPrefetch = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchAddMediaDialogPrefetchModel{logs=");
        A1C.append(this.logs);
        A1C.append(",pageToPrefetch=");
        return AbstractC72049XLp.A0B(A1C, this.pageToPrefetch);
    }
}
