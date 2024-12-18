package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IGUserProfileGridType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGUserProfileGridType[] A03;
    public static final IGUserProfileGridType A04;
    public static final IGUserProfileGridType A05;
    public static final IGUserProfileGridType A06;
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
        IGUserProfileGridType iGUserProfileGridType = new IGUserProfileGridType("UNRECOGNIZED", 0, "IGUserProfileGridType_unspecified");
        A06 = iGUserProfileGridType;
        IGUserProfileGridType iGUserProfileGridType2 = new IGUserProfileGridType("DEFAULT", 1, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A04 = iGUserProfileGridType2;
        IGUserProfileGridType iGUserProfileGridType3 = new IGUserProfileGridType("EMPTY", 2, "");
        A05 = iGUserProfileGridType3;
        IGUserProfileGridType[] iGUserProfileGridTypeArr = {iGUserProfileGridType, iGUserProfileGridType2, iGUserProfileGridType3, new IGUserProfileGridType("TALL_GRID", 3, "tall_grid")};
        A03 = iGUserProfileGridTypeArr;
        A02 = AbstractC12190kN.A00(iGUserProfileGridTypeArr);
        IGUserProfileGridType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGUserProfileGridType iGUserProfileGridType4 : values) {
            linkedHashMap.put(iGUserProfileGridType4.A00, iGUserProfileGridType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(28);
    }

    public static IGUserProfileGridType valueOf(String str) {
        return (IGUserProfileGridType) Enum.valueOf(IGUserProfileGridType.class, str);
    }

    public static IGUserProfileGridType[] values() {
        return (IGUserProfileGridType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGUserProfileGridType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
