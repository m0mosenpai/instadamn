package X;

import android.app.Activity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.IAz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40927IAz {
    public static final void A00(Activity activity, Fragment fragment, C22P c22p, C24H c24h, UserSession userSession, C38321qM c38321qM, ArrayList arrayList, boolean z) {
        String str;
        String str2;
        C110204xp c110204xp;
        MusicAssetModel musicAssetModel;
        C14360o3.A0B(userSession, 0);
        AbstractC37302Gc3.A1U(c38321qM, c22p);
        if (c38321qM.A6J()) {
            IEK iek = (IEK) userSession.A01(IEK.class, new MHO(userSession, 41));
            long j = 0;
            if (iek.A00 == 0) {
                Long flowStartIfNotOngoingForMarker = ((UserFlowLoggerImpl) iek.A01.getValue()).flowStartIfNotOngoingForMarker(357639549, UUID.randomUUID().hashCode(), PublicKeyCredentialControllerUtility.JSON_KEY_USER, false, 30000L);
                if (flowStartIfNotOngoingForMarker != null) {
                    j = flowStartIfNotOngoingForMarker.longValue();
                }
                iek.A00 = j;
            }
            MusicAttributionConfig A0E = C37855Gl9.A00.A0E(activity, c38321qM);
            String id = c38321qM.getId();
            if (id != null) {
                str = C38801rC.A06(id);
            } else {
                str = null;
            }
            C5JK c5jk = C5JK.A05;
            java.util.Set A0n = AbstractC37304Gc5.A0n(c22p);
            String id2 = c38321qM.getId();
            EnumC189548aZ enumC189548aZ = EnumC189548aZ.A08;
            if (A0E != null && (musicAssetModel = A0E.A02) != null) {
                str2 = musicAssetModel.A0E;
            } else {
                str2 = null;
            }
            String A1G = AbstractC25226BEj.A1G(c38321qM);
            InterfaceC110214xq A1R = c38321qM.A1R();
            if (A1R != null) {
                c110204xp = A1R.F4L();
            } else {
                c110204xp = null;
            }
            C6XJ A02 = C6XJ.A02(activity, ALh.A01(c22p, c24h, c110204xp, c5jk, enumC189548aZ, A0E, null, null, null, str2, str, A1G, id2, arrayList, A0n, false, true, true), userSession, TransparentModalActivity.class, "clips_camera");
            A02.A0D = z;
            AbstractC31179DnN.A1S(A02);
            A02.A0D(fragment, 9587);
        }
    }
}
