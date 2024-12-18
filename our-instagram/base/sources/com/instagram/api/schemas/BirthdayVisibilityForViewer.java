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
public final class BirthdayVisibilityForViewer implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BirthdayVisibilityForViewer[] A03;
    public static final BirthdayVisibilityForViewer A04;
    public static final BirthdayVisibilityForViewer A05;
    public static final BirthdayVisibilityForViewer A06;
    public static final BirthdayVisibilityForViewer A07;
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
        BirthdayVisibilityForViewer birthdayVisibilityForViewer = new BirthdayVisibilityForViewer("UNRECOGNIZED", 0, "BirthdayVisibilityForViewer_unspecified");
        A05 = birthdayVisibilityForViewer;
        BirthdayVisibilityForViewer birthdayVisibilityForViewer2 = new BirthdayVisibilityForViewer("NOT_VISIBLE", 1, "NOT_VISIBLE");
        A04 = birthdayVisibilityForViewer2;
        BirthdayVisibilityForViewer birthdayVisibilityForViewer3 = new BirthdayVisibilityForViewer("VISIBLE_WITHOUT_EFFECTS", 2, "VISIBLE_WITHOUT_EFFECTS");
        A06 = birthdayVisibilityForViewer3;
        BirthdayVisibilityForViewer birthdayVisibilityForViewer4 = new BirthdayVisibilityForViewer("VISIBLE_WITH_EFFECTS", 3, "VISIBLE_WITH_EFFECTS");
        A07 = birthdayVisibilityForViewer4;
        BirthdayVisibilityForViewer[] birthdayVisibilityForViewerArr = {birthdayVisibilityForViewer, birthdayVisibilityForViewer2, birthdayVisibilityForViewer3, birthdayVisibilityForViewer4};
        A03 = birthdayVisibilityForViewerArr;
        A02 = AbstractC12190kN.A00(birthdayVisibilityForViewerArr);
        BirthdayVisibilityForViewer[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (BirthdayVisibilityForViewer birthdayVisibilityForViewer5 : values) {
            linkedHashMap.put(birthdayVisibilityForViewer5.A00, birthdayVisibilityForViewer5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(52);
    }

    public static BirthdayVisibilityForViewer valueOf(String str) {
        return (BirthdayVisibilityForViewer) Enum.valueOf(BirthdayVisibilityForViewer.class, str);
    }

    public static BirthdayVisibilityForViewer[] values() {
        return (BirthdayVisibilityForViewer[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BirthdayVisibilityForViewer(String str, int i, String str2) {
        this.A00 = str2;
    }
}
