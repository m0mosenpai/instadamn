package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ActionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ActionType[] A03;
    public static final ActionType A04;
    public static final ActionType A05;
    public static final ActionType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ActionType actionType = new ActionType("UNRECOGNIZED", 0, "ActionType_unspecified");
        A06 = actionType;
        ActionType actionType2 = new ActionType("OPEN_REEL_CREATION", 1, "open_reel_creation");
        A05 = actionType2;
        ActionType actionType3 = new ActionType("OPEN_LINK", 2, "open_link");
        A04 = actionType3;
        ActionType[] actionTypeArr = {actionType, actionType2, actionType3, new ActionType("REFRESH_TIPS", 3, "refresh_tips")};
        A03 = actionTypeArr;
        A02 = AbstractC12190kN.A00(actionTypeArr);
        ActionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ActionType actionType4 : values) {
            A18.put(actionType4.A00, actionType4);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(33);
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ActionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
