package com.facebook.rsys.mosaicgrid.gen;

import X.AbstractC166987dD;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes12.dex */
public class MosaicGridModel {
    public static C2N9 CONVERTER = YAM.A00(13);
    public static long sMcfTypeId;
    public final Map gridParticipants;

    public static native MosaicGridModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MosaicGridModel)) {
                return false;
            }
            Map map = this.gridParticipants;
            Map map2 = ((MosaicGridModel) obj).gridParticipants;
            if (map != null) {
                if (!map.equals(map2)) {
                    return false;
                }
            } else if (map2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        Map map = this.gridParticipants;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return 527 + hashCode;
    }

    public MosaicGridModel(Map map) {
        this.gridParticipants = map;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MosaicGridModel{gridParticipants=");
        return JQ0.A0l(this.gridParticipants, A1C);
    }
}
