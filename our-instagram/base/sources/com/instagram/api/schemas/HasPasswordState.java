package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HasPasswordState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ HasPasswordState[] A03;
    public static final HasPasswordState A04;
    public static final HasPasswordState A05;
    public static final HasPasswordState A06;
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
        HasPasswordState hasPasswordState = new HasPasswordState("UNRECOGNIZED", 0, "HasPasswordState_unspecified");
        A06 = hasPasswordState;
        HasPasswordState hasPasswordState2 = new HasPasswordState("FALSE", 1, "2");
        A04 = hasPasswordState2;
        HasPasswordState hasPasswordState3 = new HasPasswordState("TRUE", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A05 = hasPasswordState3;
        HasPasswordState[] hasPasswordStateArr = {hasPasswordState, hasPasswordState2, hasPasswordState3, new HasPasswordState("UNKNOWN", 3, "0")};
        A03 = hasPasswordStateArr;
        A02 = AbstractC12190kN.A00(hasPasswordStateArr);
        HasPasswordState[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (HasPasswordState hasPasswordState4 : values) {
            linkedHashMap.put(hasPasswordState4.A00, hasPasswordState4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(99);
    }

    public static HasPasswordState valueOf(String str) {
        return (HasPasswordState) Enum.valueOf(HasPasswordState.class, str);
    }

    public static HasPasswordState[] values() {
        return (HasPasswordState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public HasPasswordState(String str, int i, String str2) {
        this.A00 = str2;
    }
}
