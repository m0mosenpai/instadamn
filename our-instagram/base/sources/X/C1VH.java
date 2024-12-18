package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: X.1VH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VH {
    public final Fragment A00(UserSession userSession, EnumC33408Epf enumC33408Epf) {
        C14360o3.A0B(userSession, 1);
        C461329x.A02(userSession, enumC33408Epf, C05F.A0V, null, null, Long.valueOf(C455127l.A03(userSession).A0P()), "", null);
        if (C18U.A06(C06090Tz.A05, userSession, 2342161673576257934L)) {
            return FBR.A00(EnumC72365Xc1.A0K, null);
        }
        return new V0T();
    }

    public final C72743Nv A01(UserSession userSession, EnumC33408Epf enumC33408Epf) {
        C14360o3.A0B(userSession, 1);
        C461329x.A02(userSession, enumC33408Epf, C05F.A0V, null, null, Long.valueOf(C455127l.A03(userSession).A0P()), "", null);
        C72743Nv c72743Nv = new C72743Nv();
        c72743Nv.setArguments(W6d.A00(new IgBloksScreenConfig(userSession), C66277U6x.A01("com.instagram.mental_well_being.time_spent_screen_shell.component", A03(userSession, enumC33408Epf))));
        return c72743Nv;
    }

    public final C189478aR A02(Context context, Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC1119153d interfaceC1119153d, AbstractC33235ElU abstractC33235ElU) {
        C189448aO c189448aO = new C189448aO(userSession);
        long A01 = new C29W(userSession).A01();
        c189448aO.A0d = context.getString(2131975200);
        c189448aO.A0K = new ViewOnClickListenerC35606Fnx(fragment, fragmentActivity, userSession, (C33206Ekt) abstractC33235ElU);
        c189448aO.A1J = true;
        if (A01 <= 0) {
            c189448aO.A0g = context.getString(2131975202);
        } else {
            c189448aO.A0g = context.getString(2131961124);
            c189448aO.A0v = true;
        }
        c189448aO.A0U = interfaceC1119153d;
        c189448aO.A0k = true;
        return c189448aO.A00();
    }

    public final HashMap A03(UserSession userSession, EnumC33408Epf enumC33408Epf) {
        Boolean CPj;
        boolean z;
        ArrayList A02;
        String str;
        User A01 = C17060sy.A01.A01(userSession);
        if ((C18U.A06(C06090Tz.A05, userSession, 36314335035263509L) && C461529z.A0B(userSession)) || ((CPj = A01.A03.CPj()) != null && CPj.booleanValue())) {
            z = true;
            A02 = C123815iv.A00.A04(userSession);
        } else {
            z = false;
            A02 = C123815iv.A02();
        }
        C09530e4 c09530e4 = new C09530e4("serialized_daily_time_spent_in_secs", new JSONArray((Collection) A02).toString());
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        return AbstractC06930Yk.A02(c09530e4, new C09530e4("serialized_is_aggregated", str), new C09530e4(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33408Epf.A00));
    }
}
