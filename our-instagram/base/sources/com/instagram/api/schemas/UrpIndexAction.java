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
public final class UrpIndexAction implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UrpIndexAction[] A03;
    public static final UrpIndexAction A04;
    public static final UrpIndexAction A05;
    public static final UrpIndexAction A06;
    public static final UrpIndexAction A07;
    public static final UrpIndexAction A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        UrpIndexAction urpIndexAction = new UrpIndexAction("UNRECOGNIZED", 0, "UrpIndexAction_unspecified");
        A08 = urpIndexAction;
        UrpIndexAction urpIndexAction2 = new UrpIndexAction("APPEND", 1, "APPEND");
        A04 = urpIndexAction2;
        UrpIndexAction urpIndexAction3 = new UrpIndexAction("INSERT", 2, "INSERT");
        A05 = urpIndexAction3;
        UrpIndexAction urpIndexAction4 = new UrpIndexAction("PREPEND", 3, "PREPEND");
        A06 = urpIndexAction4;
        UrpIndexAction urpIndexAction5 = new UrpIndexAction("REPLACE", 4, "REPLACE");
        A07 = urpIndexAction5;
        UrpIndexAction[] urpIndexActionArr = {urpIndexAction, urpIndexAction2, urpIndexAction3, urpIndexAction4, urpIndexAction5, new UrpIndexAction("TRANSFORM_TO_CAROUSEL_AND_REPLACE", 5, "TRANSFORM_TO_CAROUSEL_AND_REPLACE")};
        A03 = urpIndexActionArr;
        A02 = AbstractC12190kN.A00(urpIndexActionArr);
        UrpIndexAction[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (UrpIndexAction urpIndexAction6 : values) {
            A18.put(urpIndexAction6.A00, urpIndexAction6);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(77);
    }

    public static UrpIndexAction valueOf(String str) {
        return (UrpIndexAction) Enum.valueOf(UrpIndexAction.class, str);
    }

    public static UrpIndexAction[] values() {
        return (UrpIndexAction[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public UrpIndexAction(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
