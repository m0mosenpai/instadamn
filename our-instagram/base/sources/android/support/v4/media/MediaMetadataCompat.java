package android.support.v4.media;

import X.AbstractC61268Rke;
import X.C005001p;
import X.C20030yX;
import X.MSY;
import X.Py5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final C20030yX A01;
    public static final Parcelable.Creator CREATOR;
    public final Bundle A00;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.01p, X.0yX] */
    static {
        ?? c005001p = new C005001p(0);
        A01 = c005001p;
        c005001p.put("android.media.metadata.TITLE", 1);
        c005001p.put("android.media.metadata.ARTIST", 1);
        c005001p.put("android.media.metadata.DURATION", 0);
        c005001p.put("android.media.metadata.ALBUM", 1);
        c005001p.put("android.media.metadata.AUTHOR", 1);
        c005001p.put("android.media.metadata.WRITER", 1);
        c005001p.put("android.media.metadata.COMPOSER", 1);
        c005001p.put("android.media.metadata.COMPILATION", 1);
        c005001p.put("android.media.metadata.DATE", 1);
        c005001p.put("android.media.metadata.YEAR", 0);
        c005001p.put("android.media.metadata.GENRE", 1);
        c005001p.put("android.media.metadata.TRACK_NUMBER", 0);
        c005001p.put("android.media.metadata.NUM_TRACKS", 0);
        c005001p.put("android.media.metadata.DISC_NUMBER", 0);
        c005001p.put("android.media.metadata.ALBUM_ARTIST", 1);
        c005001p.put("android.media.metadata.ART", 2);
        c005001p.put("android.media.metadata.ART_URI", 1);
        c005001p.put("android.media.metadata.ALBUM_ART", 2);
        c005001p.put("android.media.metadata.ALBUM_ART_URI", 1);
        c005001p.put("android.media.metadata.USER_RATING", 3);
        c005001p.put("android.media.metadata.RATING", 3);
        c005001p.put("android.media.metadata.DISPLAY_TITLE", 1);
        c005001p.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c005001p.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c005001p.put("android.media.metadata.DISPLAY_ICON", 2);
        c005001p.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c005001p.put("android.media.metadata.MEDIA_ID", 1);
        c005001p.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c005001p.put("android.media.metadata.MEDIA_URI", 1);
        c005001p.put("android.media.metadata.ADVERTISEMENT", 0);
        c005001p.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = Py5.A00(2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A00 = MSY.A08(parcel, AbstractC61268Rke.class);
    }
}
