package com.instagram.guides.intf;

import X.AbstractC12190kN;
import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class GuideCreationType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ GuideCreationType[] A03;
    public static final GuideCreationType A04;
    public static final GuideCreationType A05;
    public static final GuideCreationType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        GuideCreationType guideCreationType = new GuideCreationType("POSTS", 0, "posts");
        A05 = guideCreationType;
        GuideCreationType guideCreationType2 = new GuideCreationType("PLACES", 1, "places");
        A04 = guideCreationType2;
        GuideCreationType guideCreationType3 = new GuideCreationType("PRODUCTS", 2, "products");
        A06 = guideCreationType3;
        GuideCreationType[] guideCreationTypeArr = {guideCreationType, guideCreationType2, guideCreationType3, new GuideCreationType("UNSELECTED", 3, "unselected")};
        A03 = guideCreationTypeArr;
        A02 = AbstractC12190kN.A00(guideCreationTypeArr);
        A01 = AbstractC166987dD.A1G();
        CREATOR = new LNL(93);
        for (GuideCreationType guideCreationType4 : values()) {
            A01.put(guideCreationType4.A00, guideCreationType4);
        }
    }

    public static GuideCreationType valueOf(String str) {
        return (GuideCreationType) Enum.valueOf(GuideCreationType.class, str);
    }

    public static GuideCreationType[] values() {
        return (GuideCreationType[]) A03.clone();
    }

    public GuideCreationType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
