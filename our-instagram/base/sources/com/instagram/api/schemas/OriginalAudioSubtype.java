package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OriginalAudioSubtype implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OriginalAudioSubtype[] A03;
    public static final OriginalAudioSubtype A04;
    public static final OriginalAudioSubtype A05;
    public static final OriginalAudioSubtype A06;
    public static final OriginalAudioSubtype A07;
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
        OriginalAudioSubtype originalAudioSubtype = new OriginalAudioSubtype("UNRECOGNIZED", 0, "OriginalAudioSubtype_unspecified");
        A07 = originalAudioSubtype;
        OriginalAudioSubtype originalAudioSubtype2 = new OriginalAudioSubtype("CONTAINS", 1, "contains");
        A04 = originalAudioSubtype2;
        OriginalAudioSubtype originalAudioSubtype3 = new OriginalAudioSubtype("DEFAULT", 2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A05 = originalAudioSubtype3;
        OriginalAudioSubtype originalAudioSubtype4 = new OriginalAudioSubtype("MIX", 3, "mix");
        A06 = originalAudioSubtype4;
        OriginalAudioSubtype[] originalAudioSubtypeArr = {originalAudioSubtype, originalAudioSubtype2, originalAudioSubtype3, originalAudioSubtype4, new OriginalAudioSubtype("WITH_SOUND_EFFECTS", 4, "with_sound_effects")};
        A03 = originalAudioSubtypeArr;
        A02 = AbstractC12190kN.A00(originalAudioSubtypeArr);
        OriginalAudioSubtype[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (OriginalAudioSubtype originalAudioSubtype5 : values) {
            linkedHashMap.put(originalAudioSubtype5.A00, originalAudioSubtype5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(74);
    }

    public static OriginalAudioSubtype valueOf(String str) {
        return (OriginalAudioSubtype) Enum.valueOf(OriginalAudioSubtype.class, str);
    }

    public static OriginalAudioSubtype[] values() {
        return (OriginalAudioSubtype[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OriginalAudioSubtype(String str, int i, String str2) {
        this.A00 = str2;
    }
}
