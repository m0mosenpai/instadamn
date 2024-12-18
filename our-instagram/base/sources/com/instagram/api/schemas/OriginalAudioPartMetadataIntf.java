package com.instagram.api.schemas;

import X.C1DY;
import X.C73063Xuq;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes3.dex */
public interface OriginalAudioPartMetadataIntf extends Parcelable {
    public static final C73063Xuq A00 = C73063Xuq.A00;

    List Ado();

    int Ae3();

    MusicCanonicalType Ae6();

    User BFU();

    int BbS();

    ImageUrl C88();

    Boolean CT1();

    OriginalAudioPartMetadataIntf E9U(C1DY c1dy);

    OriginalAudioPartMetadata Exg(C1DY c1dy);

    TreeUpdaterJNI F7o();

    String getDisplayArtist();

    String getDisplayTitle();

    int getDurationInMs();

    String getMusicCanonicalId();

    boolean isBookmarked();

    boolean isExplicit();
}
