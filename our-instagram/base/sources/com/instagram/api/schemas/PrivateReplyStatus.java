package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PrivateReplyStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PrivateReplyStatus[] A03;
    public static final PrivateReplyStatus A04;
    public static final PrivateReplyStatus A05;
    public static final PrivateReplyStatus A06;
    public static final PrivateReplyStatus A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        PrivateReplyStatus privateReplyStatus = new PrivateReplyStatus("UNRECOGNIZED", 0, "PrivateReplyStatus_unspecified");
        A07 = privateReplyStatus;
        PrivateReplyStatus privateReplyStatus2 = new PrivateReplyStatus("DISABLED", 1, "0");
        A04 = privateReplyStatus2;
        PrivateReplyStatus privateReplyStatus3 = new PrivateReplyStatus("MESSAGE", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A05 = privateReplyStatus3;
        PrivateReplyStatus privateReplyStatus4 = new PrivateReplyStatus("SEE_RESPONSE", 3, "2");
        A06 = privateReplyStatus4;
        PrivateReplyStatus[] privateReplyStatusArr = {privateReplyStatus, privateReplyStatus2, privateReplyStatus3, privateReplyStatus4};
        A03 = privateReplyStatusArr;
        A02 = AbstractC12190kN.A00(privateReplyStatusArr);
        PrivateReplyStatus[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (PrivateReplyStatus privateReplyStatus5 : values) {
            linkedHashMap.put(privateReplyStatus5.A00, privateReplyStatus5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(84);
    }

    public static PrivateReplyStatus valueOf(String str) {
        return (PrivateReplyStatus) Enum.valueOf(PrivateReplyStatus.class, str);
    }

    public static PrivateReplyStatus[] values() {
        return (PrivateReplyStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PrivateReplyStatus(String str, int i, String str2) {
        this.A00 = str2;
    }
}
