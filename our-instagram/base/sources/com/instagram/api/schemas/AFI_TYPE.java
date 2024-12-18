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
/* loaded from: classes3.dex */
public final class AFI_TYPE implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AFI_TYPE[] A03;
    public static final AFI_TYPE A04;
    public static final AFI_TYPE A05;
    public static final AFI_TYPE A06;
    public static final AFI_TYPE A07;
    public static final AFI_TYPE A08;
    public static final AFI_TYPE A09;
    public static final AFI_TYPE A0A;
    public static final AFI_TYPE A0B;
    public static final AFI_TYPE A0C;
    public static final AFI_TYPE A0D;
    public static final AFI_TYPE A0E;
    public static final AFI_TYPE A0F;
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
        AFI_TYPE afi_type = new AFI_TYPE("UNRECOGNIZED", 0, "AFI_TYPE_unspecified");
        A0F = afi_type;
        AFI_TYPE afi_type2 = new AFI_TYPE("DWELL_FEED_REPETITION", 1, "dwell_feed_repetition");
        A04 = afi_type2;
        AFI_TYPE afi_type3 = new AFI_TYPE("DWELL_FEED_SEE_MORE_LESS", 2, "dwell_feed_see_more_less");
        A05 = afi_type3;
        AFI_TYPE afi_type4 = new AFI_TYPE("DWELL_REELS_SEE_MORE_LESS", 3, "dwell_reels_see_more_less");
        A06 = afi_type4;
        AFI_TYPE afi_type5 = new AFI_TYPE("DWELL_STORY_SEE_MORE_LESS", 4, "dwell_story_see_more_less");
        A07 = afi_type5;
        AFI_TYPE afi_type6 = new AFI_TYPE("FEED_INTERESTS_PICKER", 5, "feed_interests_picker");
        A08 = afi_type6;
        AFI_TYPE afi_type7 = new AFI_TYPE("PERSISTENT_FEED_SEE_MORE_LESS", 6, "persistent_feed_see_more_less");
        A09 = afi_type7;
        AFI_TYPE afi_type8 = new AFI_TYPE("PERSISTENT_REELS_SEE_MORE_LESS", 7, "persistent_reels_see_more_less");
        A0A = afi_type8;
        AFI_TYPE afi_type9 = new AFI_TYPE("PERSISTENT_SEE_MORE_LESS", 8, "persistent_see_more_less");
        A0B = afi_type9;
        AFI_TYPE afi_type10 = new AFI_TYPE("PERSISTENT_STORY_SEE_MORE_LESS", 9, "persistent_story_see_more_less");
        A0C = afi_type10;
        AFI_TYPE afi_type11 = new AFI_TYPE("SEE_MORE_LESS", 10, "see_more_less");
        A0D = afi_type11;
        AFI_TYPE afi_type12 = new AFI_TYPE("UFI_REELS_SEE_MORE_LESS", 11, "ufi_reels_see_more_less");
        A0E = afi_type12;
        AFI_TYPE[] afi_typeArr = {afi_type, afi_type2, afi_type3, afi_type4, afi_type5, afi_type6, afi_type7, afi_type8, afi_type9, afi_type10, afi_type11, afi_type12};
        A03 = afi_typeArr;
        A02 = AbstractC12190kN.A00(afi_typeArr);
        AFI_TYPE[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (AFI_TYPE afi_type13 : values) {
            linkedHashMap.put(afi_type13.A00, afi_type13);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(40);
    }

    public static AFI_TYPE valueOf(String str) {
        return (AFI_TYPE) Enum.valueOf(AFI_TYPE.class, str);
    }

    public static AFI_TYPE[] values() {
        return (AFI_TYPE[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AFI_TYPE(String str, int i, String str2) {
        this.A00 = str2;
    }
}
