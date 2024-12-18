package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.P3n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56426P3n implements InterfaceC57951Pmx, InterfaceC57827Pkt {
    public static final C56426P3n A00 = new Object();

    @Override // X.InterfaceC57951Pmx
    public final Fragment B8N(Object obj) {
        C14360o3.A0B(obj, 0);
        C52548NMu c52548NMu = (C52548NMu) obj;
        String str = c52548NMu.A01;
        UserSession userSession = c52548NMu.A00;
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        Bundle A09 = AbstractC167027dH.A09("IgReactFragment.ARGUMENT_SHOULD_INSET_ACTION_BAR_HEIGHT", true, AbstractC166987dD.A1L("settingType", "feed"), AbstractC166987dD.A1L("enableGeoGating", Boolean.valueOf(A002.A25("feed"))), AbstractC166987dD.A1L("selectedRegions", AbstractC166987dD.A1F(A002.A0I("feed"))));
        AbstractC27401Ut.getInstance().getFragmentFactory();
        AbstractC27401Ut.getInstance();
        C64501TGn c64501TGn = new C64501TGn(userSession, "IgMediaGeoGatingSettingsApp");
        c64501TGn.A07 = str;
        c64501TGn.A00(A09);
        Bundle AEf = c64501TGn.AEf();
        Rb1 rb1 = new Rb1();
        rb1.setArguments(AEf);
        return rb1;
    }
}
