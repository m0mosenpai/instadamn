package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* loaded from: classes6.dex */
public final class GGQ implements GYK {
    public final Integer A00;

    public GGQ(Integer num) {
        this.A00 = num;
    }

    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        Fragment c33233ElS;
        AbstractC167017dG.A1P(userSession, fragmentActivity);
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        Integer num = this.A00;
        switch (num.intValue()) {
            case 1:
                c33233ElS = new C27275C2a();
                break;
            case 3:
                c33233ElS = new C33226ElG();
                break;
            case 7:
                c33233ElS = new C68096VAq();
                break;
            case 8:
                c33233ElS = OPZ.A00().A00(AbstractC166987dD.A1J(UserMonetizationProductType.A0G));
                break;
            case 10:
                c33233ElS = AbstractC31412DrH.A01().CsH(userSession);
                break;
            case 11:
                FT2.A01();
                c33233ElS = new C32301EKo();
                c33233ElS.setArguments(AbstractC166987dD.A0b());
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGTERM /* 15 */:
                c33233ElS = new C33232ElR();
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Bundle A08 = AbstractC31176DnK.A08(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
                c33233ElS = new C33208Ekw();
                c33233ElS.setArguments(A08);
                break;
            case 16:
                c33233ElS = new C68095VAp();
                break;
            case 17:
                c33233ElS = new AbstractC60672pq();
                break;
            case Process.SIGSTOP /* 19 */:
                c33233ElS = new C33209Ekx();
                break;
            case 23:
                c33233ElS = FBN.A00(userSession);
                break;
            case 28:
                c33233ElS = AbstractC31364DqT.A02().A08(EnumC33341Eoa.A04, C05F.A0Y, userSession.userId, AbstractC166997dE.A0Y(userSession).getUsername(), false);
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c33233ElS = new C31717DwM();
                break;
            case 31:
                c33233ElS = new C33233ElS();
                break;
            case 37:
                IgFragmentFactoryImpl.A00();
                c33233ElS = new C33227ElJ();
                break;
            default:
                throw AbstractC31175DnJ.A0V("No default navigator implementation for native screen with ID ", XjZ.A00(num));
        }
        A0r.A0D(c33233ElS);
        A0r.A04();
    }
}
