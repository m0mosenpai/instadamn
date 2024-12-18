package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Map;

/* renamed from: X.Tte, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65763Tte {
    public final C18920wW A00;

    public static final void A00(C65763Tte c65763Tte, String str, String str2, String str3, Map map) {
        C18920wW c18920wW = c65763Tte.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_in_thread_ctd_banner");
        if (A00.isSampled()) {
            A00.AAP("action", str);
            A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A00.AAk(AbstractC43591JPw.A00(444), AbstractC166987dD.A1J(str3));
            A00.A9M(AbstractC111324zv.A00(2338), map);
            A00.Cht();
        }
    }

    public C65763Tte(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
