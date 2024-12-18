package com.instagram.api.schemas;

import X.IY5;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public interface StoryUnlockableStickerData extends Parcelable {
    public static final IY5 A00 = IY5.A00;

    ImageURIDict C83();

    UnlockableStickerStatus CCl();

    StoryUnlockableStickerDataImpl F2M();

    TreeUpdaterJNI F7o();

    String getId();

    String getName();
}
