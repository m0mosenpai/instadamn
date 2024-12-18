package com.instagram.api.schemas;

import X.C1DV;
import X.C1DY;
import X.C73047Xua;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.music.common.model.MusicConsumptionModel;

/* loaded from: classes2.dex */
public interface MusicInfo extends Parcelable {
    public static final C73047Xua A00 = C73047Xua.A00;

    TrackData BVV();

    Long BVZ();

    MusicConsumptionModel BVa();

    MusicInfo E9O(C1DY c1dy);

    MusicInfoImpl Ewy(C1DY c1dy);

    MusicInfoImpl Ewz(C1DV c1dv);

    TreeUpdaterJNI F7o();
}
