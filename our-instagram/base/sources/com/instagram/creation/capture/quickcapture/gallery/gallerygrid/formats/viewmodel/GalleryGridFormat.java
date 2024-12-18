package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel;

import X.AbstractC12190kN;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GalleryGridFormat implements Parcelable {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ GalleryGridFormat[] A05;
    public static final GalleryGridFormat A06;
    public static final GalleryGridFormat A07;
    public static final GalleryGridFormat A08;
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(name());
    }

    public static GalleryGridFormat valueOf(String str) {
        return (GalleryGridFormat) Enum.valueOf(GalleryGridFormat.class, str);
    }

    public static GalleryGridFormat[] values() {
        return (GalleryGridFormat[]) A05.clone();
    }

    static {
        GalleryGridFormat galleryGridFormat = new GalleryGridFormat("COLLAGE", "collage", 0, R.id.gallery_grid_format_collage, 2131963065, R.drawable.instagram_collections_pano_outline_24);
        A06 = galleryGridFormat;
        GalleryGridFormat galleryGridFormat2 = new GalleryGridFormat("LAYOUT", "layout", 1, R.id.gallery_grid_format_layout, 2131963070, R.drawable.instagram_layout_pano_outline_24);
        A07 = galleryGridFormat2;
        GalleryGridFormat galleryGridFormat3 = new GalleryGridFormat("SEPARATE", "separate", 2, R.id.gallery_grid_format_separate, 2131963075, R.drawable.instagram_story_pano_outline_24);
        A08 = galleryGridFormat3;
        GalleryGridFormat[] galleryGridFormatArr = {galleryGridFormat, galleryGridFormat2, galleryGridFormat3};
        A05 = galleryGridFormatArr;
        A04 = AbstractC12190kN.A00(galleryGridFormatArr);
        CREATOR = new C206139Av(68);
    }

    public GalleryGridFormat(String str, String str2, int i, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A03 = str2;
    }
}
