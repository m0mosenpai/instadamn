package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.wonderwall.model.WallLaunchConfig;

/* renamed from: X.1Za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28391Za implements InterfaceC28401Zb {
    @Override // X.InterfaceC28401Zb
    public final void Cgh(Activity activity, UserSession userSession) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 1);
        if (C18U.A06(C06090Tz.A05, userSession, 36322297904113774L)) {
            C6XJ c6xj = new C6XJ(activity, new Bundle(0), userSession, ModalActivity.class, "wonder_wall_aggregated_feed");
            c6xj.A07();
            c6xj.A0C(activity);
        }
    }

    @Override // X.InterfaceC28401Zb
    public final void Cgt(Activity activity, UserSession userSession, WallLaunchConfig wallLaunchConfig) {
        C14360o3.A0B(activity, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36322297904113774L)) {
            C6XJ c6xj = new C6XJ(activity, AbstractC61636Rr0.A00(new C09530e4("arg_wall_launch_config", wallLaunchConfig)), userSession, ModalActivity.class, "wonder_wall");
            c6xj.A07();
            c6xj.A0C(activity);
        }
    }
}
