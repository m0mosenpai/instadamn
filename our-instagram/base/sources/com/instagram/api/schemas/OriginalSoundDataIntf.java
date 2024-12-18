package com.instagram.api.schemas;

import X.C1DV;
import X.C1DY;
import X.C73065Xus;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes2.dex */
public interface OriginalSoundDataIntf extends Parcelable {
    public static final C73065Xus A00 = C73065Xus.A00;

    Integer Adg();

    List Ado();

    List Adv();

    List Adw();

    Boolean Akf();

    Boolean Akg();

    OriginalSoundConsumptionInfoIntf AqX();

    Integer Azi();

    User BFU();

    Boolean BYR();

    OriginalAudioSubtype BZj();

    Integer BaR();

    Integer Bg7();

    Integer C8O();

    Integer CAx();

    XpostOriginalSoundFBCreatorInfo CIV();

    Boolean CT1();

    Boolean CTb();

    Boolean CZr();

    Boolean Cc7();

    Boolean CgF();

    OriginalSoundDataIntf E9V(C1DY c1dy);

    OriginalSoundData Exi(C1DY c1dy);

    OriginalSoundData Exj(C1DV c1dv);

    TreeUpdaterJNI F7o();

    boolean getAllowCreatorToRename();

    String getAudioAssetId();

    String getDashManifest();

    String getFormattedClipsMediaCount();

    boolean getHideRemixing();

    String getMusicCanonicalId();

    String getOriginalAudioTitle();

    String getOriginalMediaId();

    String getProgressiveDownloadUrl();

    boolean getShouldMuteAudio();

    boolean isAudioAutomaticallyAttributed();

    boolean isExplicit();
}
