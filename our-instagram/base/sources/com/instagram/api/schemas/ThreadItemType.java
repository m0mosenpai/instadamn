package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ThreadItemType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ThreadItemType[] A03;
    public static final ThreadItemType A04;
    public static final ThreadItemType A05;
    public static final ThreadItemType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ThreadItemType threadItemType = new ThreadItemType("UNRECOGNIZED", 0, "ThreadItemType_unspecified");
        A06 = threadItemType;
        ThreadItemType threadItemType2 = new ThreadItemType("COLLAPSED", 1, "collapsed");
        A04 = threadItemType2;
        ThreadItemType threadItemType3 = new ThreadItemType("DEFAULT", 2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A05 = threadItemType3;
        ThreadItemType[] threadItemTypeArr = {threadItemType, threadItemType2, threadItemType3};
        A03 = threadItemTypeArr;
        A02 = AbstractC12190kN.A00(threadItemTypeArr);
        ThreadItemType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ThreadItemType threadItemType4 : values) {
            A18.put(threadItemType4.A00, threadItemType4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(67);
    }

    public static ThreadItemType valueOf(String str) {
        return (ThreadItemType) Enum.valueOf(ThreadItemType.class, str);
    }

    public static ThreadItemType[] values() {
        return (ThreadItemType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ThreadItemType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}