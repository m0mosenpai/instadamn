package com.instagram.api.schemas;

import X.Xx2;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes2.dex */
public interface TrackData extends Parcelable {
    public static final Xx2 A00 = Xx2.A00;

    ImageUrl AsE();

    ImageUrl AsF();

    String AvV();

    Integer Azi();

    Boolean BC4();

    List BE6();

    LyricsIntf BPT();

    String Bkl();

    String BqC();

    String CHM();

    Boolean CT1();

    Boolean CTb();

    TrackDataImpl F3P();

    TreeUpdaterJNI F7o();

    boolean getAllowsSaving();

    String getArtistId();

    String getAudioAssetId();

    String getAudioClusterId();

    String getDashManifest();

    String getDisplayArtist();

    String getFastStartProgressiveDownloadUrl();

    String getId();

    String getIgUsername();

    String getProgressiveDownloadUrl();

    String getSubtitle();

    String getTitle();

    boolean isExplicit();
}
