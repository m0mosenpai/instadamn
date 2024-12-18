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
/* loaded from: classes2.dex */
public final class BizUserInboxState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BizUserInboxState[] A03;
    public static final BizUserInboxState A04;
    public static final BizUserInboxState A05;
    public static final BizUserInboxState A06;
    public static final BizUserInboxState A07;
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
        BizUserInboxState bizUserInboxState = new BizUserInboxState("UNRECOGNIZED", 0, "BizUserInboxState_unspecified");
        A07 = bizUserInboxState;
        BizUserInboxState bizUserInboxState2 = new BizUserInboxState("GENERAL_FOLDER_THROTTLED", 1, "2");
        A04 = bizUserInboxState2;
        BizUserInboxState bizUserInboxState3 = new BizUserInboxState("NEW_API_THREADS_THROTTLED", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A05 = bizUserInboxState3;
        BizUserInboxState bizUserInboxState4 = new BizUserInboxState("NORMAL", 3, "0");
        A06 = bizUserInboxState4;
        BizUserInboxState[] bizUserInboxStateArr = {bizUserInboxState, bizUserInboxState2, bizUserInboxState3, bizUserInboxState4};
        A03 = bizUserInboxStateArr;
        A02 = AbstractC12190kN.A00(bizUserInboxStateArr);
        BizUserInboxState[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (BizUserInboxState bizUserInboxState5 : values) {
            linkedHashMap.put(bizUserInboxState5.A00, bizUserInboxState5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(53);
    }

    public static BizUserInboxState valueOf(String str) {
        return (BizUserInboxState) Enum.valueOf(BizUserInboxState.class, str);
    }

    public static BizUserInboxState[] values() {
        return (BizUserInboxState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BizUserInboxState(String str, int i, String str2) {
        this.A00 = str2;
    }
}
