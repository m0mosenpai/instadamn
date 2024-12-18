package X;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.ui.swipenavigation.PositionConfig;

/* loaded from: classes6.dex */
public final class GEI implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("entrypoint");
        String queryParameter2 = uri.getQueryParameter("sticker_id");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter(AbstractC111324zv.A00(2637), false);
        UserSession userSession = this.A01;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC31171DnF.A1S(A00, queryParameter2, A00.A86, C23031Ai.A8c, 264);
        Fragment fragment = this.A00;
        ComponentCallbacks componentCallbacks = fragment.mParentFragment;
        if (!(componentCallbacks instanceof InterfaceC53892dT)) {
            if (fragment instanceof AbstractC59962oe) {
                String A002 = AbstractC43591JPw.A00(0);
                C14360o3.A0C(fragment, A002);
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) fragment;
                if (abstractC59962oe.getRootActivity() instanceof InterfaceC53892dT) {
                    C14360o3.A0C(fragment, A002);
                    componentCallbacks = abstractC59962oe.getRootActivity();
                    C14360o3.A0C(componentCallbacks, AbstractC43591JPw.A00(22));
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        InterfaceC53892dT interfaceC53892dT = (InterfaceC53892dT) componentCallbacks;
        if (interfaceC53892dT != null) {
            String str2 = null;
            String str3 = null;
            if ("SHOPPING_PRODUCT_STICKER_NUDGE".equals(queryParameter)) {
                str = AbstractC111324zv.A00(1186);
            } else {
                str = "megaphone_main_feed";
            }
            C5GJ c5gj = C5GJ.FEED_MEGAPHONE;
            if (booleanQueryParameter) {
                AbstractC23021Ah.A00(userSession).A1d(true);
                str2 = queryParameter2;
            } else {
                str3 = queryParameter2;
            }
            interfaceC53892dT.FBp(new PositionConfig(c5gj, null, null, str, null, null, null, null, null, null, str3, str2, null, -1.0f, 0, true));
        }
    }

    public GEI(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
