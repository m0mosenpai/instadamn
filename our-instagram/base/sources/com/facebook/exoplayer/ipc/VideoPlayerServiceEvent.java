package com.facebook.exoplayer.ipc;

import X.C63475SlG;
import X.EnumC61171RgX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class VideoPlayerServiceEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(89);

    @Override // android.os.Parcelable
    public final int describeContents() {
        EnumC61171RgX enumC61171RgX;
        if (this instanceof VpsVideoCacheDatabaseFullEvent) {
            enumC61171RgX = EnumC61171RgX.DATABASE_FULL;
        } else if (this instanceof VpsPrefetchStartEvent) {
            enumC61171RgX = EnumC61171RgX.PREFETCH_START;
        } else if (this instanceof VpsPrefetchCacheEvictEvent) {
            enumC61171RgX = EnumC61171RgX.PREFETCH_CACHE_EVICT;
        } else if (this instanceof VpsManifestParseErrorEvent) {
            enumC61171RgX = EnumC61171RgX.MANIFEST_PARSE_ERROR;
        } else if (this instanceof VpsCacheErrorEvent) {
            enumC61171RgX = EnumC61171RgX.CACHE_ERROR;
        } else {
            throw new AbstractMethodError("describeContents");
        }
        return enumC61171RgX.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(describeContents());
    }
}
