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
public final class TappableComponentFeedRole implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TappableComponentFeedRole[] A03;
    public static final TappableComponentFeedRole A04;
    public static final TappableComponentFeedRole A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TappableComponentFeedRole tappableComponentFeedRole = new TappableComponentFeedRole("UNRECOGNIZED", 0, "TappableComponentFeedRole_unspecified");
        A05 = tappableComponentFeedRole;
        TappableComponentFeedRole tappableComponentFeedRole2 = new TappableComponentFeedRole("CTA", 1, "cta");
        A04 = tappableComponentFeedRole2;
        TappableComponentFeedRole[] tappableComponentFeedRoleArr = {tappableComponentFeedRole, tappableComponentFeedRole2, new TappableComponentFeedRole("THUMBNAIL", 2, "thumbnail")};
        A03 = tappableComponentFeedRoleArr;
        A02 = AbstractC12190kN.A00(tappableComponentFeedRoleArr);
        TappableComponentFeedRole[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TappableComponentFeedRole tappableComponentFeedRole3 : values) {
            A18.put(tappableComponentFeedRole3.A00, tappableComponentFeedRole3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(41);
    }

    public static TappableComponentFeedRole valueOf(String str) {
        return (TappableComponentFeedRole) Enum.valueOf(TappableComponentFeedRole.class, str);
    }

    public static TappableComponentFeedRole[] values() {
        return (TappableComponentFeedRole[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TappableComponentFeedRole(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
