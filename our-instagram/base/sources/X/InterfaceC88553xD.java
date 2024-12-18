package X;

import android.content.Context;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC88553xD extends InterfaceC88563xE, InterfaceC88573xF {
    String AD3(Context context);

    String Ach();

    User Ade();

    long Adf();

    ImageUrl Adk();

    List Adv();

    List Adw();

    OriginalAudioSubtype Ae4();

    AudioType Ae7();

    List AyW();

    String BZi();

    MusicMuteAudioReason BvC();

    Integer CAx();

    boolean CQ8();

    boolean CQ9();

    boolean CQA();

    boolean CS2();

    boolean Cat(String str);

    boolean Ceq();

    boolean CfD();

    MusicAttributionConfig Cq1(Context context);

    String getArtistId();

    String getAssetId();

    String getAudioAssetId();

    boolean isEligibleForAudioEffects();
}
