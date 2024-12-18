package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ReplyControlStr implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ReplyControlStr[] A03;
    public static final ReplyControlStr A04;
    public static final ReplyControlStr A05;
    public static final ReplyControlStr A06;
    public static final ReplyControlStr A07;
    public static final ReplyControlStr A08;
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
        ReplyControlStr replyControlStr = new ReplyControlStr("UNRECOGNIZED", 0, "ReplyControlStr_unspecified");
        A08 = replyControlStr;
        ReplyControlStr replyControlStr2 = new ReplyControlStr("ACCOUNTS_YOU_FOLLOW", 1, "accounts_you_follow");
        A04 = replyControlStr2;
        ReplyControlStr replyControlStr3 = new ReplyControlStr("EVERYONE", 2, "everyone");
        A05 = replyControlStr3;
        ReplyControlStr replyControlStr4 = new ReplyControlStr("MENTIONED_ONLY", 3, "mentioned_only");
        A06 = replyControlStr4;
        ReplyControlStr replyControlStr5 = new ReplyControlStr("PARENT_POST_AUTHOR_ONLY", 4, "parent_post_author_only");
        A07 = replyControlStr5;
        ReplyControlStr[] replyControlStrArr = {replyControlStr, replyControlStr2, replyControlStr3, replyControlStr4, replyControlStr5};
        A03 = replyControlStrArr;
        A02 = AbstractC12190kN.A00(replyControlStrArr);
        ReplyControlStr[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ReplyControlStr replyControlStr6 : values) {
            linkedHashMap.put(replyControlStr6.A00, replyControlStr6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(99);
    }

    public static ReplyControlStr valueOf(String str) {
        return (ReplyControlStr) Enum.valueOf(ReplyControlStr.class, str);
    }

    public static ReplyControlStr[] values() {
        return (ReplyControlStr[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ReplyControlStr(String str, int i, String str2) {
        this.A00 = str2;
    }
}
