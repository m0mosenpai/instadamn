package X;

import android.widget.TextView;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC149836oc extends InterfaceC11380iw, InterfaceC13050lr {
    public static final String __redex_internal_original_name = "IgCameraEffectManagerInterface";

    void A8Z(InterfaceC142616cN interfaceC142616cN);

    C177797vD AMy(C203678zW c203678zW, AudioGraphClientProvider audioGraphClientProvider, C1814883b c1814883b, InterfaceC1815083d interfaceC1815083d, C200478tq c200478tq, EnumC150616qF enumC150616qF, CameraControlServiceDelegate cameraControlServiceDelegate, InterfaceC149876og interfaceC149876og, C83W c83w, C83Y c83y, C8zr c8zr, AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer, C83P c83p, CameraAREffect cameraAREffect, UserSession userSession, Integer num, Integer num2, String str, String str2, boolean z);

    C177797vD ANP(String str);

    C142626cO B0c();

    boolean CLs(CameraAREffect cameraAREffect);

    boolean CSw(CameraAREffect cameraAREffect);

    InterfaceC150176pN ChO(C203708zZ c203708zZ, C1819185b c1819185b, CameraAREffect cameraAREffect, InterfaceC203668zV interfaceC203668zV);

    void Cki(String str);

    void Cln(C203678zW c203678zW, C1819185b c1819185b, CameraAREffect cameraAREffect);

    void E5F(String str, List list);

    void EP3(TextView textView);

    void EUu(GalleryPickerServiceDataSource galleryPickerServiceDataSource);

    void EoY(String str);

    @Override // X.InterfaceC11380iw
    String getModuleName();
}
