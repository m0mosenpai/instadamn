package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.meta.foa.session.FoaUserSession;
import java.util.List;

/* renamed from: X.FdE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35103FdE {
    public static final void A02(FoaUserSession foaUserSession, String str, String str2, String str3, List list, boolean z) {
        C14360o3.A0B(foaUserSession, 0);
        AbstractC167027dH.A13(str, str2, list);
        CJ7.A00(AbstractC28057CYl.A00(foaUserSession), str, str2, str3, list.size(), list.size(), 0, z);
    }

    public static final void A00(EnumC31511Dsv enumC31511Dsv, FoaUserSession foaUserSession, String str, String str2, long j, boolean z, boolean z2) {
        String str3;
        UserSession A00 = AbstractC28057CYl.A00(foaUserSession);
        C14360o3.A0B(A00, 0);
        EnumC31512Dsw A002 = C31514Dsy.A00(str);
        Long A0j = AbstractC25231BEo.A0j(0, A00.userId);
        EnumC31511Dsv enumC31511Dsv2 = EnumC31511Dsv.INSTAGRAM;
        if (enumC31511Dsv == enumC31511Dsv2) {
            str3 = "intra_app";
        } else {
            str3 = "inter_app";
        }
        boolean A1a = AbstractC31175DnJ.A1a(A002);
        double A003 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A00), "switch_user_tapped");
        if (A0f.isSampled()) {
            A0f.A9K("raw_initiator_account_id", A0j);
            A0f.A9K("initiator_identity_id", A0j);
            AbstractC31176DnK.A1J(A0f, A003);
            A0f.AAP("event_session_id", str2);
            A0f.A8R(A002, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A7v("is_cds", Boolean.valueOf(A1a));
            A0f.A7v("is_badge_shown", AbstractC31173DnH.A0d(A0f, AbstractC31173DnH.A0e(A0f, "switch_type", str3, z), "is_logged_in", z2));
            A0f.A9K("badge_count", Long.valueOf(j));
            A0f.A8R(enumC31511Dsv2, "initiator_account_type");
            A0f.A8R(enumC31511Dsv, "target_account_type");
            A0f.Cht();
        }
    }

    public static final void A01(FoaUserSession foaUserSession, int i, boolean z) {
        EnumC58162lY enumC58162lY;
        EnumC54222eY enumC54222eY;
        UserSession A00 = AbstractC28057CYl.A00(foaUserSession);
        C14360o3.A0B(A00, 0);
        boolean z2 = C31514Dsy.A04;
        AbstractC31173DnH.A0b(A00).A00.AHj();
        if (z) {
            enumC58162lY = EnumC58162lY.A08;
            enumC54222eY = EnumC54222eY.A0R;
        } else {
            enumC58162lY = EnumC58162lY.A09;
            enumC54222eY = EnumC54222eY.A0p;
        }
        C54432ex c54432ex = new C54432ex(EnumC54222eY.A06, null, i, i);
        C54392et A0b = AbstractC31173DnH.A0b(A00);
        EnumC58122lU enumC58122lU = EnumC58122lU.A05;
        C54392et.A00(A0b, enumC58122lU, enumC58162lY, c54432ex, C05F.A0C, "click", null, 0, 0, 0, 0);
        C54412ev A0c = AbstractC31174DnI.A0c(A00);
        C54432ex c54432ex2 = new C54432ex(enumC54222eY, null, i, i);
        EnumC58162lY enumC58162lY2 = EnumC58162lY.A07;
        C14360o3.A0B(enumC58162lY2, 0);
        A0c.A03(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex2, false);
    }
}
