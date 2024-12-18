package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ContentAppreciationFeatureStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ContentAppreciationFeatureStatus[] A03;
    public static final ContentAppreciationFeatureStatus A04;
    public static final ContentAppreciationFeatureStatus A05;
    public static final ContentAppreciationFeatureStatus A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ContentAppreciationFeatureStatus contentAppreciationFeatureStatus = new ContentAppreciationFeatureStatus("UNRECOGNIZED", 0, "ContentAppreciationFeatureStatus_unspecified");
        A06 = contentAppreciationFeatureStatus;
        ContentAppreciationFeatureStatus contentAppreciationFeatureStatus2 = new ContentAppreciationFeatureStatus("OFF", 1, "off");
        A04 = contentAppreciationFeatureStatus2;
        ContentAppreciationFeatureStatus contentAppreciationFeatureStatus3 = new ContentAppreciationFeatureStatus("ON", 2, "on");
        A05 = contentAppreciationFeatureStatus3;
        ContentAppreciationFeatureStatus[] contentAppreciationFeatureStatusArr = {contentAppreciationFeatureStatus, contentAppreciationFeatureStatus2, contentAppreciationFeatureStatus3};
        A03 = contentAppreciationFeatureStatusArr;
        A02 = AbstractC12190kN.A00(contentAppreciationFeatureStatusArr);
        ContentAppreciationFeatureStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ContentAppreciationFeatureStatus contentAppreciationFeatureStatus4 : values) {
            A18.put(contentAppreciationFeatureStatus4.A00, contentAppreciationFeatureStatus4);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(33);
    }

    public static ContentAppreciationFeatureStatus valueOf(String str) {
        return (ContentAppreciationFeatureStatus) Enum.valueOf(ContentAppreciationFeatureStatus.class, str);
    }

    public static ContentAppreciationFeatureStatus[] values() {
        return (ContentAppreciationFeatureStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ContentAppreciationFeatureStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
