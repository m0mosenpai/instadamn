package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.config.MediaKitConfig;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

/* renamed from: X.1ZH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZH implements InterfaceC11380iw, C1ZI {
    public static final String __redex_internal_original_name = "MediaKitPluginImpl";
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C1ZJ.A00);

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, MediaKitConfig mediaKitConfig, C1ZH c1zh) {
        Integer num;
        C54780OIu A00 = Nv6.A00(userSession);
        MediaKitEntryPoint mediaKitEntryPoint = mediaKitConfig.A00;
        A00.A00(mediaKitEntryPoint);
        String str = mediaKitConfig.A01;
        if (str != null) {
            A00.A01 = str;
        }
        C56454P4q c56454P4q = new C56454P4q(c1zh, A00);
        if (str == null && mediaKitConfig.A02 == null) {
            num = C05F.A00;
        } else {
            num = C05F.A1I;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("short_code", mediaKitConfig.A02);
        AbstractC55033OXz.A02(c56454P4q, num, hashMap);
        C6XJ c6xj = new C6XJ(fragmentActivity, AbstractC61636Rr0.A00(new C09530e4("media_kit_config", mediaKitConfig)), userSession, ModalActivity.class, "media_kit");
        c6xj.A07();
        c6xj.A0C = true;
        if (mediaKitEntryPoint == MediaKitEntryPoint.A0A || mediaKitEntryPoint == MediaKitEntryPoint.A06) {
            c6xj.A08 = true;
        }
        c6xj.A0C(fragmentActivity);
    }

    @Override // X.C1ZI
    public final void E2l(FragmentActivity fragmentActivity, UserSession userSession, MediaKitConfig mediaKitConfig) {
        C14360o3.A0B(userSession, 1);
        A00(fragmentActivity, userSession, mediaKitConfig, this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "MediaKitPlugin";
    }
}
