package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC50523MSb;
import X.AbstractC72049XLp;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CowatchReelsMediaHashtagModel {
    public static C2N9 CONVERTER = YAN.A00(37);
    public static long sMcfTypeId;
    public final String hashtagId;
    public final int length;
    public final String name;
    public final int offset;

    public static native CowatchReelsMediaHashtagModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchReelsMediaHashtagModel)) {
            return false;
        }
        CowatchReelsMediaHashtagModel cowatchReelsMediaHashtagModel = (CowatchReelsMediaHashtagModel) obj;
        return this.hashtagId.equals(cowatchReelsMediaHashtagModel.hashtagId) && this.name.equals(cowatchReelsMediaHashtagModel.name) && this.offset == cowatchReelsMediaHashtagModel.offset && this.length == cowatchReelsMediaHashtagModel.length;
    }

    public int hashCode() {
        return ((AbstractC166997dE.A0K(this.name, AbstractC50523MSb.A02(this.hashtagId)) + this.offset) * 31) + this.length;
    }

    public CowatchReelsMediaHashtagModel(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.hashtagId = str;
        this.name = str2;
        this.offset = i;
        this.length = i2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchReelsMediaHashtagModel{hashtagId=");
        A1C.append(this.hashtagId);
        A1C.append(",name=");
        A1C.append(this.name);
        A1C.append(",offset=");
        A1C.append(this.offset);
        A1C.append(",length=");
        return AbstractC72049XLp.A0B(A1C, this.length);
    }
}
