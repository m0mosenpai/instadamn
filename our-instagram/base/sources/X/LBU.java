package X;

import android.app.Activity;
import android.location.Location;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LBU {
    public static final void A00(Activity activity, Location location, android.net.Uri uri, C22P c22p, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, CropInfo cropInfo, AnonymousClass840 anonymousClass840, MediaCaptureConfig mediaCaptureConfig, PendingRecipient pendingRecipient, String str, String str2, int i, int i2, boolean z, boolean z2) {
        C14360o3.A0B(activity, 0);
        AbstractC25229BEm.A1M(userSession, 1, c22p);
        if (i2 == 1) {
            MX1.A01(userSession).A06(c22p, 1, false);
        }
        C69963Cf A00 = AbstractC69933Cc.A00(activity, userSession, new C56326Ozn(activity, location, uri, c22p, mediaUploadMetadata, cropInfo, anonymousClass840, mediaCaptureConfig, pendingRecipient, str, str2, i2, i, z, z2));
        EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
        C69963Cf.A03(null, EnumC33447EqK.A0a, A00, new MediaCaptureConfig(new C43846JaA(enumC69983Ch)), enumC69983Ch, null, null, null, -1, 10001, false, false);
    }

    public static final void A01(Activity activity, C22P c22p, UserSession userSession, AnonymousClass840 anonymousClass840, int i) {
        PendingRecipient pendingRecipient;
        Boolean bool;
        MediaCaptureConfig mediaCaptureConfig;
        String str;
        C14360o3.A0B(activity, 0);
        AbstractC167017dG.A1P(userSession, anonymousClass840);
        AnonymousClass841 anonymousClass841 = anonymousClass840.A00;
        List list = null;
        if (anonymousClass841 != null) {
            CreationSession creationSession = ((MX5) anonymousClass841).A01;
            pendingRecipient = creationSession.A0B;
            bool = Boolean.valueOf(creationSession.A0L);
        } else {
            pendingRecipient = null;
            bool = null;
        }
        C69963Cf A00 = AbstractC69933Cc.A00(activity, userSession, new C56325Ozm(activity, c22p, anonymousClass840, pendingRecipient, bool));
        EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
        C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
        c43846JaA.A09 = false;
        c43846JaA.A0A = false;
        if (anonymousClass841 != null) {
            mediaCaptureConfig = ((MX5) anonymousClass841).A01.A09;
            if (mediaCaptureConfig != null) {
                MusicAttributionConfig musicAttributionConfig = mediaCaptureConfig.A00;
                if (musicAttributionConfig != null) {
                    c43846JaA.A00 = musicAttributionConfig;
                }
                boolean z = mediaCaptureConfig.A04;
                if (Boolean.valueOf(z) != null) {
                    c43846JaA.A04 = z;
                }
            }
        } else {
            mediaCaptureConfig = null;
        }
        MediaCaptureConfig mediaCaptureConfig2 = new MediaCaptureConfig(c43846JaA);
        EnumC33447EqK enumC33447EqK = EnumC33447EqK.A0a;
        if (mediaCaptureConfig != null) {
            str = mediaCaptureConfig.A01;
            list = mediaCaptureConfig.A02;
        } else {
            str = null;
        }
        C69963Cf.A03(null, enumC33447EqK, A00, mediaCaptureConfig2, enumC69983Ch, null, str, list, -1, i, false, AbstractC31177DnL.A1a(bool));
    }
}
