package com.facebook.rsys.stream.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31180DnO;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes12.dex */
public class StreamModel {
    public static C2N9 CONVERTER = YAM.A00(55);
    public static long sMcfTypeId;
    public final HashSet allowedCustomVideoContentTypes;
    public final ArrayList localVideoStreams;

    @Deprecated
    public final HashSet processedUserIds;

    @Deprecated
    public final ArrayList supportedCustomVideoCodecs;

    public static native StreamModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StreamModel)) {
                return false;
            }
            StreamModel streamModel = (StreamModel) obj;
            ArrayList arrayList = this.supportedCustomVideoCodecs;
            ArrayList arrayList2 = streamModel.supportedCustomVideoCodecs;
            if (arrayList != null) {
                if (!arrayList.equals(arrayList2)) {
                    return false;
                }
            } else if (arrayList2 != null) {
                return false;
            }
            if (!this.allowedCustomVideoContentTypes.equals(streamModel.allowedCustomVideoContentTypes) || !this.processedUserIds.equals(streamModel.processedUserIds) || !this.localVideoStreams.equals(streamModel.localVideoStreams)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.localVideoStreams, AbstractC166997dE.A0J(this.processedUserIds, AbstractC166997dE.A0J(this.allowedCustomVideoContentTypes, JQ0.A01(AbstractC167017dG.A0M(this.supportedCustomVideoCodecs)))));
    }

    public StreamModel(ArrayList arrayList, HashSet hashSet, HashSet hashSet2, ArrayList arrayList2) {
        AbstractC31180DnO.A1U(hashSet, hashSet2, arrayList2);
        this.supportedCustomVideoCodecs = arrayList;
        this.allowedCustomVideoContentTypes = hashSet;
        this.processedUserIds = hashSet2;
        this.localVideoStreams = arrayList2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StreamModel{supportedCustomVideoCodecs=");
        A1C.append(this.supportedCustomVideoCodecs);
        A1C.append(",allowedCustomVideoContentTypes=");
        A1C.append(this.allowedCustomVideoContentTypes);
        A1C.append(",processedUserIds=");
        A1C.append(this.processedUserIds);
        A1C.append(",localVideoStreams=");
        return JQ0.A0l(this.localVideoStreams, A1C);
    }
}
