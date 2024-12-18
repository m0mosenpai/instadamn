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
public final class CommentAudienceControlType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CommentAudienceControlType[] A03;
    public static final CommentAudienceControlType A04;
    public static final CommentAudienceControlType A05;
    public static final CommentAudienceControlType A06;
    public static final CommentAudienceControlType A07;
    public static final CommentAudienceControlType A08;
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
        CommentAudienceControlType commentAudienceControlType = new CommentAudienceControlType("UNRECOGNIZED", 0, "CommentAudienceControlType_unspecified");
        A08 = commentAudienceControlType;
        CommentAudienceControlType commentAudienceControlType2 = new CommentAudienceControlType("EVERYONE", 1, "any");
        A04 = commentAudienceControlType2;
        CommentAudienceControlType commentAudienceControlType3 = new CommentAudienceControlType("PEOPLE_FOLLOW_ME", 2, "follower");
        A06 = commentAudienceControlType3;
        CommentAudienceControlType commentAudienceControlType4 = new CommentAudienceControlType("PEOPLE_I_FOLLOW", 3, "following");
        A07 = commentAudienceControlType4;
        CommentAudienceControlType commentAudienceControlType5 = new CommentAudienceControlType("FOLLOWING_AND_FOLLOWER", 4, "following_and_follower");
        A05 = commentAudienceControlType5;
        CommentAudienceControlType[] commentAudienceControlTypeArr = {commentAudienceControlType, commentAudienceControlType2, commentAudienceControlType3, commentAudienceControlType4, commentAudienceControlType5, new CommentAudienceControlType("OFF", 5, "off")};
        A03 = commentAudienceControlTypeArr;
        A02 = AbstractC12190kN.A00(commentAudienceControlTypeArr);
        CommentAudienceControlType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (CommentAudienceControlType commentAudienceControlType6 : values) {
            linkedHashMap.put(commentAudienceControlType6.A00, commentAudienceControlType6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(73);
    }

    public static CommentAudienceControlType valueOf(String str) {
        return (CommentAudienceControlType) Enum.valueOf(CommentAudienceControlType.class, str);
    }

    public static CommentAudienceControlType[] values() {
        return (CommentAudienceControlType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CommentAudienceControlType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
