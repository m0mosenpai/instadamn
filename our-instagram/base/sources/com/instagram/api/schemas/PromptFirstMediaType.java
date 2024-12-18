package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class PromptFirstMediaType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PromptFirstMediaType[] A03;
    public static final PromptFirstMediaType A04;
    public static final PromptFirstMediaType A05;
    public static final PromptFirstMediaType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PromptFirstMediaType promptFirstMediaType = new PromptFirstMediaType("UNRECOGNIZED", 0, "PromptFirstMediaType_unspecified");
        A06 = promptFirstMediaType;
        PromptFirstMediaType promptFirstMediaType2 = new PromptFirstMediaType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 1, NetInfoModule.CONNECTION_TYPE_NONE);
        A04 = promptFirstMediaType2;
        PromptFirstMediaType promptFirstMediaType3 = new PromptFirstMediaType("ORIGINAL", 2, "original");
        A05 = promptFirstMediaType3;
        PromptFirstMediaType[] promptFirstMediaTypeArr = {promptFirstMediaType, promptFirstMediaType2, promptFirstMediaType3, new PromptFirstMediaType("POPULAR", 3, "popular")};
        A03 = promptFirstMediaTypeArr;
        A02 = AbstractC12190kN.A00(promptFirstMediaTypeArr);
        PromptFirstMediaType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (PromptFirstMediaType promptFirstMediaType4 : values) {
            A18.put(promptFirstMediaType4.A00, promptFirstMediaType4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(77);
    }

    public static PromptFirstMediaType valueOf(String str) {
        return (PromptFirstMediaType) Enum.valueOf(PromptFirstMediaType.class, str);
    }

    public static PromptFirstMediaType[] values() {
        return (PromptFirstMediaType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PromptFirstMediaType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
