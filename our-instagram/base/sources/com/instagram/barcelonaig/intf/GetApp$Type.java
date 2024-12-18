package com.instagram.barcelonaig.intf;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class GetApp$Type implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ GetApp$Type[] A01;
    public static final GetApp$Type A02;
    public static final GetApp$Type A03;
    public static final GetApp$Type A04;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this);
    }

    static {
        GetApp$Type getApp$Type = new GetApp$Type("NOTIFICATION", 0);
        A02 = getApp$Type;
        GetApp$Type getApp$Type2 = new GetApp$Type("OTHER_PROFILE", 1);
        A03 = getApp$Type2;
        GetApp$Type getApp$Type3 = new GetApp$Type("SELF_PROFILE", 2);
        A04 = getApp$Type3;
        GetApp$Type[] getApp$TypeArr = {getApp$Type, getApp$Type2, getApp$Type3};
        A01 = getApp$TypeArr;
        A00 = AbstractC12190kN.A00(getApp$TypeArr);
        CREATOR = new C70220WId(21);
    }

    public static GetApp$Type valueOf(String str) {
        return (GetApp$Type) Enum.valueOf(GetApp$Type.class, str);
    }

    public static GetApp$Type[] values() {
        return (GetApp$Type[]) A01.clone();
    }

    public GetApp$Type(String str, int i) {
    }
}
