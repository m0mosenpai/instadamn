package com.instagram.model.reels;

import X.AbstractC12190kN;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ReelViewerContextButtonType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ReelViewerContextButtonType[] A01;
    public static final ReelViewerContextButtonType A02;
    public static final ReelViewerContextButtonType A03;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(name());
    }

    static {
        ReelViewerContextButtonType reelViewerContextButtonType = new ReelViewerContextButtonType("VIEW_DAY", 0);
        A02 = reelViewerContextButtonType;
        ReelViewerContextButtonType reelViewerContextButtonType2 = new ReelViewerContextButtonType("VIEW_ON_MAP", 1);
        A03 = reelViewerContextButtonType2;
        ReelViewerContextButtonType[] reelViewerContextButtonTypeArr = {reelViewerContextButtonType, reelViewerContextButtonType2};
        A01 = reelViewerContextButtonTypeArr;
        A00 = AbstractC12190kN.A00(reelViewerContextButtonTypeArr);
        CREATOR = new C55343Oh9(93);
    }

    public static ReelViewerContextButtonType valueOf(String str) {
        return (ReelViewerContextButtonType) Enum.valueOf(ReelViewerContextButtonType.class, str);
    }

    public static ReelViewerContextButtonType[] values() {
        return (ReelViewerContextButtonType[]) A01.clone();
    }

    public ReelViewerContextButtonType(String str, int i) {
    }
}
