package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GalleryMediaFolderEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ GalleryMediaFolderEnum[] A03;
    public static final GalleryMediaFolderEnum A04;
    public static final GalleryMediaFolderEnum A05;
    public static final GalleryMediaFolderEnum A06;
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
        GalleryMediaFolderEnum galleryMediaFolderEnum = new GalleryMediaFolderEnum("UNRECOGNIZED", 0, "GalleryMediaFolderEnum_unspecified");
        A05 = galleryMediaFolderEnum;
        GalleryMediaFolderEnum galleryMediaFolderEnum2 = new GalleryMediaFolderEnum("DEFAULT", 1, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A04 = galleryMediaFolderEnum2;
        GalleryMediaFolderEnum galleryMediaFolderEnum3 = new GalleryMediaFolderEnum("VIDEOS", 2, "videos");
        A06 = galleryMediaFolderEnum3;
        GalleryMediaFolderEnum[] galleryMediaFolderEnumArr = {galleryMediaFolderEnum, galleryMediaFolderEnum2, galleryMediaFolderEnum3};
        A03 = galleryMediaFolderEnumArr;
        A02 = AbstractC12190kN.A00(galleryMediaFolderEnumArr);
        GalleryMediaFolderEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (GalleryMediaFolderEnum galleryMediaFolderEnum4 : values) {
            linkedHashMap.put(galleryMediaFolderEnum4.A00, galleryMediaFolderEnum4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(94);
    }

    public static GalleryMediaFolderEnum valueOf(String str) {
        return (GalleryMediaFolderEnum) Enum.valueOf(GalleryMediaFolderEnum.class, str);
    }

    public static GalleryMediaFolderEnum[] values() {
        return (GalleryMediaFolderEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public GalleryMediaFolderEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
