package com.instagram.music.common.model;

import X.C1DV;
import X.C1DY;
import X.C69486Vo9;
import X.C73242Xyg;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes2.dex */
public interface MusicConsumptionModel extends Parcelable {
    public static final C73242Xyg A00 = C73242Xyg.A00;

    C69486Vo9 AKo();

    Boolean AbG();

    Integer Adg();

    List Ado();

    AudioMutingInfoIntf Adu();

    Boolean Aql();

    List AyW();

    User BFU();

    Integer BaR();

    Integer Bg7();

    Boolean Buu();

    MusicMuteAudioReason BvC();

    Boolean BvQ();

    Integer CAx();

    Boolean CQj();

    Boolean Cer();

    MusicConsumptionModel EBx(C1DY c1dy);

    MusicConsumptionModelImpl F6h(C1DY c1dy);

    MusicConsumptionModelImpl F6i(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getDerivedContentId();

    String getFormattedClipsMediaCount();

    String getPlaceholderProfilePicUrl();

    boolean getShouldMuteAudio();

    String getShouldMuteAudioReason();
}
