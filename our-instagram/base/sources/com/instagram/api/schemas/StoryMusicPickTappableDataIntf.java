package com.instagram.api.schemas;

import X.C1DV;
import X.C1DY;
import X.C41483IXk;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public interface StoryMusicPickTappableDataIntf extends Parcelable {
    public static final C41483IXk A00 = C41483IXk.A00;

    TrackData Adc();

    String AeC();

    StoryPromptDisablementState Ay6();

    List B48();

    OriginalSoundDataIntf BZw();

    int BbW();

    String Bfc();

    StoryTemplateAssetDictIntf C5d();

    StoryMusicPickTappableDataIntf EAP(C1DY c1dy);

    StoryMusicPickTappableData F0z(C1DY c1dy);

    StoryMusicPickTappableData F10(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getId();

    String getMediaId();
}
