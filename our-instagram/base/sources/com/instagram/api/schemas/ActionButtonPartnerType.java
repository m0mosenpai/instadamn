package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ActionButtonPartnerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ActionButtonPartnerType[] A03;
    public static final ActionButtonPartnerType A04;
    public static final ActionButtonPartnerType A05;
    public static final ActionButtonPartnerType A06;
    public static final ActionButtonPartnerType A07;
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
        ActionButtonPartnerType actionButtonPartnerType = new ActionButtonPartnerType("UNRECOGNIZED", 0, "ActionButtonPartnerType_unspecified");
        A07 = actionButtonPartnerType;
        ActionButtonPartnerType actionButtonPartnerType2 = new ActionButtonPartnerType("FBE", 1, "FBE");
        A04 = actionButtonPartnerType2;
        ActionButtonPartnerType actionButtonPartnerType3 = new ActionButtonPartnerType("FIRST_PARTY", 2, "FIRST_PARTY");
        A05 = actionButtonPartnerType3;
        ActionButtonPartnerType actionButtonPartnerType4 = new ActionButtonPartnerType("SMB", 3, "SMB");
        A06 = actionButtonPartnerType4;
        ActionButtonPartnerType[] actionButtonPartnerTypeArr = {actionButtonPartnerType, actionButtonPartnerType2, actionButtonPartnerType3, actionButtonPartnerType4};
        A03 = actionButtonPartnerTypeArr;
        A02 = AbstractC12190kN.A00(actionButtonPartnerTypeArr);
        ActionButtonPartnerType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ActionButtonPartnerType actionButtonPartnerType5 : values) {
            linkedHashMap.put(actionButtonPartnerType5.A00, actionButtonPartnerType5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(41);
    }

    public static ActionButtonPartnerType valueOf(String str) {
        return (ActionButtonPartnerType) Enum.valueOf(ActionButtonPartnerType.class, str);
    }

    public static ActionButtonPartnerType[] values() {
        return (ActionButtonPartnerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ActionButtonPartnerType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
