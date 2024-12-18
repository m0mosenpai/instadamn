package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PromoteButtonActionType implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ PromoteButtonActionType[] A02;
    public static final PromoteButtonActionType A03;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PromoteButtonActionType promoteButtonActionType = new PromoteButtonActionType("OPEN_WEB_LINK", 0, "open_web_link");
        A03 = promoteButtonActionType;
        PromoteButtonActionType[] promoteButtonActionTypeArr = {promoteButtonActionType, new PromoteButtonActionType("OPEN_INTERNAL_DEEPLINK", 1, "open_internal_deeplink")};
        A02 = promoteButtonActionTypeArr;
        A01 = AbstractC12190kN.A00(promoteButtonActionTypeArr);
        CREATOR = new C70220WId(65);
    }

    public static PromoteButtonActionType valueOf(String str) {
        return (PromoteButtonActionType) Enum.valueOf(PromoteButtonActionType.class, str);
    }

    public static PromoteButtonActionType[] values() {
        return (PromoteButtonActionType[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PromoteButtonActionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
