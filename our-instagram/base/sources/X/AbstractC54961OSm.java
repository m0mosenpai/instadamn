package X;

import android.app.Activity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;

/* renamed from: X.OSm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54961OSm {
    public static O79 A00;
    public static C38321qM A01;
    public static C189478aR A02;
    public static String A03;
    public static String A04;

    public static final String A00(AudioOverlayTrack audioOverlayTrack, String str) {
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel != null) {
            return AbstractC23129AMi.A04(AbstractC50522MSa.A0Y(MusicProduct.A04, audioOverlayTrack, musicAssetModel, str));
        }
        return null;
    }

    public static final void A01(Activity activity, O79 o79, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        VG4 vg4;
        String str2 = str;
        if (A02 == null) {
            if (str == null) {
                str2 = AbstractC167017dG.A0j();
            }
            A04 = str2;
            A01 = c38321qM;
            A00 = o79;
            A03 = null;
            if (!C1H6.A03()) {
                activity.getTheme().applyStyle(R.style.MusicCreationLightOverlayTheme, true);
            }
            EnumC1810381f enumC1810381f = EnumC1810381f.A05;
            MusicProduct musicProduct = MusicProduct.A04;
            ImmutableList of = ImmutableList.of((Object) AudioTrackType.A03, (Object) AudioTrackType.A04);
            C14360o3.A07(of);
            C52166N6v A012 = OPX.A01(null, of, musicProduct, userSession, MusicOverlaySearchTab.A03, enumC1810381f, str2, null);
            A012.A05 = new P61(activity, userSession, A012, z);
            C70399WUb A002 = C70399WUb.A00(userSession);
            if (z) {
                vg4 = VG4.A0F;
            } else {
                vg4 = VG4.A0J;
            }
            A002.A0R(vg4.toString());
            C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
            A0X.A03 = 1.0f;
            A0X.A06 = activity.getColor(AbstractC53242c7.A0D(activity));
            A0X.A0T = A012;
            A02 = C189478aR.A00(activity, activity, A012, A0X.A00(), null);
        }
    }
}
