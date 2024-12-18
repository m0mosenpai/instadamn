package com.instagram.api.schemas;

import X.IWV;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public interface PopularReelWithFollowersInsightMetadata extends Parcelable {
    public static final IWV A00 = IWV.A00;

    List BR1();

    PopularReelWithFollowersInsightMetadataImpl Ey4();

    TreeUpdaterJNI F7o();

    int getLikeCount();

    int getPlayCount();

    int getReshareCount();
}
