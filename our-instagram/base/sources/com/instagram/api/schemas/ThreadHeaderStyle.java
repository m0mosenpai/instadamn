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
public final class ThreadHeaderStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ThreadHeaderStyle[] A03;
    public static final ThreadHeaderStyle A04;
    public static final ThreadHeaderStyle A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ThreadHeaderStyle threadHeaderStyle = new ThreadHeaderStyle("UNRECOGNIZED", 0, "ThreadHeaderStyle_unspecified");
        A05 = threadHeaderStyle;
        ThreadHeaderStyle threadHeaderStyle2 = new ThreadHeaderStyle("BOLD", 1, "bold");
        A04 = threadHeaderStyle2;
        ThreadHeaderStyle[] threadHeaderStyleArr = {threadHeaderStyle, threadHeaderStyle2};
        A03 = threadHeaderStyleArr;
        A02 = AbstractC12190kN.A00(threadHeaderStyleArr);
        ThreadHeaderStyle[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ThreadHeaderStyle threadHeaderStyle3 : values) {
            A18.put(threadHeaderStyle3.A00, threadHeaderStyle3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(66);
    }

    public static ThreadHeaderStyle valueOf(String str) {
        return (ThreadHeaderStyle) Enum.valueOf(ThreadHeaderStyle.class, str);
    }

    public static ThreadHeaderStyle[] values() {
        return (ThreadHeaderStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ThreadHeaderStyle(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
