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
public final class ThreadHeaderContextType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ThreadHeaderContextType[] A03;
    public static final ThreadHeaderContextType A04;
    public static final ThreadHeaderContextType A05;
    public static final ThreadHeaderContextType A06;
    public static final ThreadHeaderContextType A07;
    public static final ThreadHeaderContextType A08;
    public static final ThreadHeaderContextType A09;
    public static final ThreadHeaderContextType A0A;
    public static final ThreadHeaderContextType A0B;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ThreadHeaderContextType threadHeaderContextType = new ThreadHeaderContextType("UNRECOGNIZED", 0, "ThreadHeaderContextType_unspecified");
        A0B = threadHeaderContextType;
        ThreadHeaderContextType threadHeaderContextType2 = new ThreadHeaderContextType("FIRST_POST", 1, "first_post");
        A04 = threadHeaderContextType2;
        ThreadHeaderContextType threadHeaderContextType3 = new ThreadHeaderContextType("REPOST", 2, "repost");
        A05 = threadHeaderContextType3;
        ThreadHeaderContextType threadHeaderContextType4 = new ThreadHeaderContextType("SIMILAR_FOLLOWED_AUTHOR", 3, "similar_followed_author");
        A06 = threadHeaderContextType4;
        ThreadHeaderContextType threadHeaderContextType5 = new ThreadHeaderContextType("SIMILAR_LIKED_AUTHOR", 4, "similar_liked_author");
        A07 = threadHeaderContextType5;
        ThreadHeaderContextType threadHeaderContextType6 = new ThreadHeaderContextType("SOCIAL_FOLLOW", 5, "social_follow");
        A08 = threadHeaderContextType6;
        ThreadHeaderContextType threadHeaderContextType7 = new ThreadHeaderContextType("SOCIAL_FOLLOW_CHAIN", 6, "social_follow_chain");
        A09 = threadHeaderContextType7;
        ThreadHeaderContextType threadHeaderContextType8 = new ThreadHeaderContextType("SOCIAL_FOLLOW_MUTUAL_FOLLOWEE", 7, "social_follow_mutual_followee");
        A0A = threadHeaderContextType8;
        ThreadHeaderContextType[] threadHeaderContextTypeArr = {threadHeaderContextType, threadHeaderContextType2, threadHeaderContextType3, threadHeaderContextType4, threadHeaderContextType5, threadHeaderContextType6, threadHeaderContextType7, threadHeaderContextType8, new ThreadHeaderContextType("SOCIAL_FOLLOW_PRIORITY_CREATOR", 8, "social_follow_priority_creator")};
        A03 = threadHeaderContextTypeArr;
        A02 = AbstractC12190kN.A00(threadHeaderContextTypeArr);
        ThreadHeaderContextType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ThreadHeaderContextType threadHeaderContextType9 : values) {
            A18.put(threadHeaderContextType9.A00, threadHeaderContextType9);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(65);
    }

    public static ThreadHeaderContextType valueOf(String str) {
        return (ThreadHeaderContextType) Enum.valueOf(ThreadHeaderContextType.class, str);
    }

    public static ThreadHeaderContextType[] values() {
        return (ThreadHeaderContextType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ThreadHeaderContextType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
