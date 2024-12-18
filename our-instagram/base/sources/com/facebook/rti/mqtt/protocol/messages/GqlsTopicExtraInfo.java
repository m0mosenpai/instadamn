package com.facebook.rti.mqtt.protocol.messages;

import X.AbstractC166987dD;
import X.AbstractC31177DnL;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class GqlsTopicExtraInfo implements TopicExtraInfo {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(55);
    public final Boolean A00;
    public final String A01;
    public final Map A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1.equals(r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L40
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo r5 = (com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo) r5
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == 0) goto L1f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
        L1e:
            return r2
        L1f:
            if (r0 == 0) goto L22
            return r2
        L22:
            java.util.Map r1 = r4.A02
            java.util.Map r0 = r5.A02
            if (r1 == 0) goto L2f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L32
            return r2
        L2f:
            if (r0 == 0) goto L32
            return r2
        L32:
            java.lang.Boolean r1 = r4.A00
            java.lang.Boolean r0 = r5.A00
            if (r1 == 0) goto L3d
            boolean r3 = r1.equals(r0)
            return r3
        L3d:
            if (r0 == 0) goto L40
            r3 = 0
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int A04 = AbstractC31177DnL.A04(this.A01) * 31;
        Map map = this.A02;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        int i3 = (A04 + i) * 31;
        Boolean bool = this.A00;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i3 + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeMap(this.A02);
        parcel.writeValue(this.A00);
    }

    public GqlsTopicExtraInfo(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readHashMap(HashMap.class.getClassLoader());
        this.A00 = (Boolean) parcel.readValue(null);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GqlsTopicExtraInfo{DESCRIPTION='GraphQL Subscription Infomation', subscription='");
        AbstractC58319PtB.A1K(A1C, this.A01);
        A1C.append(", queryParams=");
        A1C.append(this.A02);
        A1C.append(", forceLogEnabled=");
        return AbstractC58320PtC.A11(this.A00, A1C);
    }
}
