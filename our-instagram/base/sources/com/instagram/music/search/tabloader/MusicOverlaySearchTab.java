package com.instagram.music.search.tabloader;

import X.C14360o3;
import X.C41856IgA;
import X.C50535MSo;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicBrowserCategoryModel;

/* loaded from: classes9.dex */
public final class MusicOverlaySearchTab implements Parcelable {
    public final int A00;
    public final MusicBrowseCategory A01;
    public final MusicBrowserCategoryModel A02;
    public static final Parcelable.Creator CREATOR = new C41856IgA(87);
    public static final MusicOverlaySearchTab A0D = new MusicOverlaySearchTab(2131967993, "trending");
    public static final MusicOverlaySearchTab A0C = new MusicOverlaySearchTab(2131967993, "stories_browse");
    public static final MusicOverlaySearchTab A08 = new MusicOverlaySearchTab(2131967988, "moods");
    public static final MusicOverlaySearchTab A06 = new MusicOverlaySearchTab(2131967986, "genres");
    public static final MusicOverlaySearchTab A04 = new MusicOverlaySearchTab(2131967984, "browse");
    public static final MusicOverlaySearchTab A05 = new MusicOverlaySearchTab(2131967993, "clips_browse");
    public static final MusicOverlaySearchTab A09 = new MusicOverlaySearchTab(C50535MSo.A03("playlists", "bookmarked", "Saved"), null, 2131967991);
    public static final MusicOverlaySearchTab A0A = new MusicOverlaySearchTab(2131967989, "saved_music");
    public static final MusicOverlaySearchTab A0B = new MusicOverlaySearchTab(2131967990, "saved_original_audio");
    public static final MusicOverlaySearchTab A07 = new MusicOverlaySearchTab(2131967987, "gallery");
    public static final MusicOverlaySearchTab A03 = new MusicOverlaySearchTab(2131967992, "boost_audio_browser");

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public MusicOverlaySearchTab(MusicBrowseCategory musicBrowseCategory, MusicBrowserCategoryModel musicBrowserCategoryModel, int i) {
        this.A00 = i;
        this.A01 = musicBrowseCategory;
        this.A02 = musicBrowserCategoryModel;
    }

    public MusicOverlaySearchTab(int i, String str) {
        this(C50535MSo.A01(str), null, i);
    }
}
