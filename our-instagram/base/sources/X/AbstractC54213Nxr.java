package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nxr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54213Nxr {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.NVl, androidx.fragment.app.Fragment, X.N7F, X.2oe] */
    public static final NVl A00(Bundle bundle, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        UserSession A07 = C023409i.A0A.A07(bundle);
        if (A07 != null) {
            userSession = A07;
        }
        ?? abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.A04 = userSession;
        C82G valueOf = C82G.valueOf(AbstractC153636vY.A01(bundle, "args_entrypoint"));
        C14360o3.A0B(valueOf, 0);
        abstractC59962oe.A02 = valueOf;
        C82H valueOf2 = C82H.valueOf(AbstractC153636vY.A01(bundle, "args_upsell_variant"));
        C14360o3.A0B(valueOf2, 0);
        abstractC59962oe.A03 = valueOf2;
        abstractC59962oe.A00 = bundle.getInt("args_num_of_views", -1);
        abstractC59962oe.A00 = bundle.getBoolean("args_is_story_enabled", false);
        bundle.getBoolean("args_is_post_enabled", false);
        abstractC59962oe.A09 = bundle.getBoolean("args_is_after_fbc", false);
        NVj nVj = (NVj) userSession.A01(NVj.class, new C43205J8c(userSession, 16));
        InterfaceC58075Pp0 interfaceC58075Pp0 = nVj.A05;
        if (interfaceC58075Pp0 == null) {
            interfaceC58075Pp0 = new PG6(nVj);
            nVj.A05 = interfaceC58075Pp0;
        }
        abstractC59962oe.A05 = interfaceC58075Pp0;
        abstractC59962oe.A01 = bundle.getInt("arg_nux_attempt_qpl_instance_key", 0);
        AbstractC50523MSb.A0i(bundle, abstractC59962oe);
        abstractC59962oe.setArguments(bundle);
        return abstractC59962oe;
    }
}
