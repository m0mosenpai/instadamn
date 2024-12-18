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
public final class PromoteErrorLevel implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PromoteErrorLevel[] A01;
    public static final PromoteErrorLevel A02;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PromoteErrorLevel promoteErrorLevel = new PromoteErrorLevel("ERROR", 0);
        A02 = promoteErrorLevel;
        PromoteErrorLevel[] promoteErrorLevelArr = {promoteErrorLevel, new PromoteErrorLevel("WARNING", 1)};
        A01 = promoteErrorLevelArr;
        A00 = AbstractC12190kN.A00(promoteErrorLevelArr);
        CREATOR = new C70220WId(73);
    }

    public static PromoteErrorLevel valueOf(String str) {
        return (PromoteErrorLevel) Enum.valueOf(PromoteErrorLevel.class, str);
    }

    public static PromoteErrorLevel[] values() {
        return (PromoteErrorLevel[]) A01.clone();
    }

    public PromoteErrorLevel(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
