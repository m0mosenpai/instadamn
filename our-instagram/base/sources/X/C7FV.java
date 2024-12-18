package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashMap;

/* renamed from: X.7FV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FV {
    public String A00;
    public boolean A01;
    public final UserSession A02;

    public final void A00(Context context, C2EE c2ee) {
        String C7I;
        C14360o3.A0B(context, 0);
        if (c2ee != null && (C7I = c2ee.C7I()) != null) {
            UserSession userSession = this.A02;
            C006802i.A0p.markerStart(619714951, 0);
            String A04 = C18U.A04(C06090Tz.A05, userSession, 36884942914912860L);
            HashMap A02 = AbstractC06930Yk.A02(new C09530e4("igd_thread_id", C7I), new C09530e4("entrypoint", "ig_direct"), new C09530e4("creation_session_id", this.A00));
            if (A04.length() > 0) {
                A02.put("qe_variant", A04);
            }
            C66277U6x A01 = C66277U6x.A01("com.bloks.www.bloks.imagine_create.bottomsheet", A02);
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
            igBloksScreenConfig.A0P = C05F.A01;
            igBloksScreenConfig.A00 = 16;
            A01.A05(context, igBloksScreenConfig);
        }
    }

    public final boolean A02(Activity activity, C2EE c2ee) {
        String str;
        String C7I;
        C14360o3.A0B(activity, 0);
        UserSession userSession = this.A02;
        C48255LXe c48255LXe = (C48255LXe) userSession.A01(C48255LXe.class, new MHS(userSession, 5));
        String str2 = this.A00;
        String str3 = "";
        if (c2ee == null || (str = c2ee.C7I()) == null) {
            str = "";
        }
        C18920wW c18920wW = c48255LXe.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "gen_ai_imagine_create_ig_mobile_event");
        A00.AAP("event_type", "imagine_button_click");
        A00.AAP("creation_session_id", str2);
        A00.A9K("ig_user_id", Long.valueOf(c48255LXe.A00()));
        A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A00.Cht();
        if (AbstractC162267Oo.A02(userSession)) {
            return true;
        }
        this.A01 = true;
        C48255LXe c48255LXe2 = (C48255LXe) userSession.A01(C48255LXe.class, new MHS(userSession, 5));
        String str4 = this.A00;
        if (c2ee != null && (C7I = c2ee.C7I()) != null) {
            str3 = C7I;
        }
        C18920wW c18920wW2 = c48255LXe2.A00;
        InterfaceC02590Ai A002 = c18920wW2.A00(c18920wW2.A00, "gen_ai_imagine_create_ig_mobile_event");
        A002.AAP("event_type", "nux_impression");
        A002.AAP("creation_session_id", str4);
        A002.A9K("ig_user_id", Long.valueOf(c48255LXe2.A00()));
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        A002.Cht();
        AbstractC31265Don.A00().A01(activity, EnumC33519Ers.A0C, userSession, null, true, false);
        return false;
    }

    public final void A01(C2EE c2ee, String str) {
        String str2;
        if (str == null) {
            str = C0HM.A00().toString();
            C14360o3.A07(str);
        }
        this.A00 = str;
        UserSession userSession = this.A02;
        C48255LXe c48255LXe = (C48255LXe) userSession.A01(C48255LXe.class, new MHS(userSession, 5));
        String str3 = this.A00;
        if (c2ee == null || (str2 = c2ee.C7I()) == null) {
            str2 = "";
        }
        C18920wW c18920wW = c48255LXe.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "gen_ai_imagine_create_ig_mobile_event");
        A00.AAP("event_type", "imagine_button_impression");
        A00.AAP("creation_session_id", str3);
        A00.A9K("ig_user_id", Long.valueOf(c48255LXe.A00()));
        A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A00.Cht();
    }

    public C7FV(UserSession userSession) {
        this.A02 = userSession;
        String obj = C0HM.A00().toString();
        C14360o3.A07(obj);
        this.A00 = obj;
    }
}
