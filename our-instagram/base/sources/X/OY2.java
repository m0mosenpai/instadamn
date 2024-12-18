package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OY2 {
    public static final void A00(Context context, UserSession userSession, MediaCaptureConfig mediaCaptureConfig, AudioOverlayTrack audioOverlayTrack, C47Z c47z, InterfaceC189598ae interfaceC189598ae, String str, List list, boolean z, boolean z2) {
        C47Z BcC;
        MusicAssetModel musicAssetModel;
        C47Z BcC2;
        AbstractC167007dF.A1H(userSession, 3, str);
        if (mediaCaptureConfig != null) {
            mediaCaptureConfig.A00 = null;
        }
        if (audioOverlayTrack != null && (musicAssetModel = audioOverlayTrack.A08) != null) {
            MusicOverlayStickerModel A0Y = AbstractC50522MSa.A0Y(MusicProduct.A0G, audioOverlayTrack, musicAssetModel, str);
            A01(context, userSession, c47z, interfaceC189598ae, list, z, true, z2);
            if (c47z != null) {
                c47z.A1J = A0Y;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VideoSession videoSession = (VideoSession) it.next();
                if (interfaceC189598ae != null && (BcC2 = interfaceC189598ae.BcC(videoSession.A0G)) != null) {
                    BcC2.A5C = true;
                }
            }
            return;
        }
        A01(context, userSession, c47z, interfaceC189598ae, list, z, false, z2);
        if (c47z != null) {
            c47z.A1J = null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            VideoSession videoSession2 = (VideoSession) it2.next();
            if (interfaceC189598ae != null && (BcC = interfaceC189598ae.BcC(videoSession2.A0G)) != null) {
                BcC.A5C = false;
            }
        }
    }

    public static final boolean A02(UserSession userSession, EnumC69983Ch enumC69983Ch, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        if ((z || C36A.A0K(userSession, z2, true)) && enumC69983Ch == EnumC69983Ch.A02 && C36A.A04(userSession)) {
            return true;
        }
        return false;
    }

    public static final void A01(Context context, UserSession userSession, C47Z c47z, InterfaceC189598ae interfaceC189598ae, List list, boolean z, boolean z2, boolean z3) {
        MusicOverlayStickerModel musicOverlayStickerModel;
        if (interfaceC189598ae != null) {
            EnumC40111tc enumC40111tc = null;
            if (c47z != null) {
                musicOverlayStickerModel = c47z.A1J;
            } else {
                musicOverlayStickerModel = null;
            }
            boolean z4 = true;
            boolean A1W = AbstractC167007dF.A1W(musicOverlayStickerModel);
            if (A1W != z2 || z3) {
                if (c47z != null) {
                    enumC40111tc = c47z.A1G;
                }
                if (enumC40111tc != EnumC40111tc.A09) {
                    z4 = false;
                }
                if (C36A.A0K(userSession, z4, z)) {
                    if (A1W != z2) {
                        int i = 2131976685;
                        if (z2) {
                            i = 2131976684;
                        }
                        if (z3) {
                            C9GR.A07(context, i);
                        } else {
                            C146106i8 A0K = AbstractC31171DnF.A0K();
                            AbstractC25226BEj.A1N(context, A0K, i);
                            AbstractC31178DnM.A1S(A0K);
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C47Z BcC = interfaceC189598ae.BcC(((VideoSession) it.next()).A0G);
                        if (BcC != null) {
                            BcC.A5F = z2;
                        }
                    }
                }
            }
        }
    }
}
