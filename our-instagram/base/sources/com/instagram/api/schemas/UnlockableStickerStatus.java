package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class UnlockableStickerStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UnlockableStickerStatus[] A03;
    public static final UnlockableStickerStatus A04;
    public static final UnlockableStickerStatus A05;
    public static final UnlockableStickerStatus A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        UnlockableStickerStatus unlockableStickerStatus = new UnlockableStickerStatus("UNRECOGNIZED", 0, "UnlockableStickerStatus_unspecified");
        A06 = unlockableStickerStatus;
        UnlockableStickerStatus unlockableStickerStatus2 = new UnlockableStickerStatus("LOCKED", 1, "locked");
        A04 = unlockableStickerStatus2;
        UnlockableStickerStatus unlockableStickerStatus3 = new UnlockableStickerStatus("UNLOCKED", 2, "unlocked");
        A05 = unlockableStickerStatus3;
        UnlockableStickerStatus[] unlockableStickerStatusArr = {unlockableStickerStatus, unlockableStickerStatus2, unlockableStickerStatus3};
        A03 = unlockableStickerStatusArr;
        A02 = AbstractC12190kN.A00(unlockableStickerStatusArr);
        UnlockableStickerStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (UnlockableStickerStatus unlockableStickerStatus4 : values) {
            A18.put(unlockableStickerStatus4.A00, unlockableStickerStatus4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(73);
    }

    public static UnlockableStickerStatus valueOf(String str) {
        return (UnlockableStickerStatus) Enum.valueOf(UnlockableStickerStatus.class, str);
    }

    public static UnlockableStickerStatus[] values() {
        return (UnlockableStickerStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public UnlockableStickerStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
