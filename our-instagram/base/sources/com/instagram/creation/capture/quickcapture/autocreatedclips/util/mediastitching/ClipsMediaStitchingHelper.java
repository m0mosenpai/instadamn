package com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching;

import X.AbstractC166987dD;
import X.AbstractC54918OQs;
import X.AbstractC55153OdH;
import X.C14360o3;
import X.MSY;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class ClipsMediaStitchingHelper {
    public static final ClipsMediaStitchingHelper A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.api.schemas.ACRType r16, com.instagram.common.session.UserSession r17, com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching.ClipsMediaStitchingHelper r18, com.instagram.music.common.model.AudioOverlayTrack r19, java.lang.String r20, java.util.List r21, java.util.List r22, java.util.List r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching.ClipsMediaStitchingHelper.A01(com.instagram.api.schemas.ACRType, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching.ClipsMediaStitchingHelper, com.instagram.music.common.model.AudioOverlayTrack, java.lang.String, java.util.List, java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }

    public static final MediaComposition A00(ACRType aCRType, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, List list, List list2, int i) {
        if (i == list.size()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list2) {
                if (MSY.A06(((Medium) obj).A0X) > 0) {
                    A1E.add(obj);
                }
            }
            MediaComposition A002 = AbstractC54918OQs.A00(null, userSession, audioOverlayTrack, AbstractC166987dD.A1F(AbstractC54918OQs.A01(aCRType, str, AbstractC166987dD.A1F(A1E), AbstractC166987dD.A1F(list), AbstractC55153OdH.A00(aCRType, str, 1), true)), 0.0f);
            C14360o3.A07(A002);
            return A002;
        }
        throw AbstractC166987dD.A18("Original Video list size differs from size of video durations");
    }
}
