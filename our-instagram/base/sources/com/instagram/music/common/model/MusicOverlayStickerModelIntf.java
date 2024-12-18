package com.instagram.music.common.model;

import X.C1DV;
import X.C1DY;
import X.C73243Xyh;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes2.dex */
public interface MusicOverlayStickerModelIntf extends Parcelable {
    public static final C73243Xyh A00 = C73243Xyh.A00;

    String Aal();

    Boolean AbG();

    Integer Adg();

    Integer Adh();

    List Ado();

    AudioMutingInfoIntf Adu();

    String AiR();

    Boolean Aql();

    ImageUrl AsE();

    ImageUrl AsF();

    String AvV();

    Integer Awp();

    List AyW();

    Integer Azi();

    Boolean BC4();

    Boolean BDn();

    List BE6();

    User BFU();

    String BOF();

    MusicProduct BVj();

    Integer BaR();

    Boolean Bd5();

    String Bkl();

    String BqC();

    Boolean Buu();

    MusicMuteAudioReason BvC();

    Boolean BvQ();

    Boolean Bvn();

    Integer CAx();

    String CHM();

    Boolean CQj();

    Boolean CT1();

    Boolean CTb();

    Boolean CXk();

    Boolean CZu();

    Boolean Cer();

    MusicOverlayStickerModelIntf EBy(C1DY c1dy);

    MusicOverlayStickerModel F6j(C1DY c1dy);

    MusicOverlayStickerModel F6k(C1DV c1dv);

    TreeUpdaterJNI F7o();

    boolean getAllowsSaving();

    String getArtistId();

    String getAudioAssetId();

    String getAudioClusterId();

    String getDashManifest();

    String getDerivedContentId();

    String getDisplayArtist();

    String getFastStartProgressiveDownloadUrl();

    String getFormattedClipsMediaCount();

    String getId();

    String getIgUsername();

    String getOriginalMediaId();

    String getPlaceholderProfilePicUrl();

    String getProgressiveDownloadUrl();

    boolean getShouldMuteAudio();

    String getShouldMuteAudioReason();

    String getSubtitle();

    String getTag();

    String getTitle();

    boolean isExplicit();
}
