package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PublisherPlatform implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PublisherPlatform[] A03;
    public static final PublisherPlatform A04;
    public static final PublisherPlatform A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PublisherPlatform publisherPlatform = new PublisherPlatform("UNRECOGNIZED", 0, "PublisherPlatform_unspecified");
        A05 = publisherPlatform;
        PublisherPlatform publisherPlatform2 = new PublisherPlatform("FACEBOOK", 1, "FACEBOOK");
        A04 = publisherPlatform2;
        PublisherPlatform[] publisherPlatformArr = {publisherPlatform, publisherPlatform2, new PublisherPlatform("INSTAGRAM", 2, "INSTAGRAM")};
        A03 = publisherPlatformArr;
        A02 = AbstractC12190kN.A00(publisherPlatformArr);
        PublisherPlatform[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (PublisherPlatform publisherPlatform3 : values) {
            linkedHashMap.put(publisherPlatform3.A00, publisherPlatform3);
        }
        A01 = linkedHashMap;
        CREATOR = new C41855Ig9(78);
    }

    public static PublisherPlatform valueOf(String str) {
        return (PublisherPlatform) Enum.valueOf(PublisherPlatform.class, str);
    }

    public static PublisherPlatform[] values() {
        return (PublisherPlatform[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PublisherPlatform(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
