package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.7CH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7CH {
    public final Activity A00;
    public final Context A01;
    public final UserSession A02;
    public final C7FR A03;
    public final C23031Ai A04;

    public C7CH(Activity activity, Context context, UserSession userSession, C7FR c7fr) {
        C14360o3.A0B(context, 3);
        C14360o3.A0B(c7fr, 4);
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = context;
        this.A03 = c7fr;
        this.A04 = AbstractC23021Ah.A00(userSession);
    }

    public final void A01(DirectShareTarget directShareTarget, String str) {
        C14360o3.A0B(str, 0);
        C7FR c7fr = this.A03;
        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
        interfaceC83713oG.getClass();
        C18920wW c18920wW = c7fr.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_composer_plus_overflow_menu_tap");
        if (A00.isSampled()) {
            A00.AAP("open_thread_id", AbstractC92784Dr.A02(interfaceC83713oG));
            A00.AAP("overflow_menu_selection", "igd_location_sharing");
            A00.Cht();
        }
        C23031Ai c23031Ai = this.A04;
        boolean booleanValue = ((Boolean) c23031Ai.A3n.CES(c23031Ai, C23031Ai.A8c[206])).booleanValue();
        boolean A08 = AbstractC23451Ch.A08(this.A00, AbstractC43591JPw.A00(293));
        if (booleanValue && A08) {
            A00(this, directShareTarget, str);
        } else {
            AbstractC61813Ru7.A00(this.A02).A01(this.A01, new C67600UsL(this, directShareTarget, str), "live_location_sharing_device_permission", "ig4a", null, null, null);
        }
    }

    public static final void A00(C7CH c7ch, DirectShareTarget directShareTarget, String str) {
        Activity activity = c7ch.A00;
        AbstractC13880nE.A0K(activity);
        UserSession userSession = c7ch.A02;
        if (!str.isEmpty()) {
            Bundle bundle = new Bundle(0);
            bundle.putString("arg_thread_id", str);
            bundle.putParcelable("bundle_extra_share_target", directShareTarget);
            AbstractC03240Dh.A00(bundle, userSession);
            V7T v7t = new V7T();
            v7t.setArguments(bundle);
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0a = true;
            c189448aO.A0x = true;
            c189448aO.A03 = 0.7f;
            c189448aO.A04 = 0.7f;
            c189448aO.A0T = v7t;
            c189448aO.A0k = true;
            c189448aO.A13 = true;
            c189448aO.A0y = true;
            c189448aO.A1R = true;
            c189448aO.A00().A02(activity, v7t);
            return;
        }
        throw new RuntimeException("Expected a non-empty string");
    }
}
