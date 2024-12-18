package X;

import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EfP extends C33H {
    public final int A00;
    public final Object A01;

    public EfP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C5SW A00(C5SU c5su, Object obj, int i) {
        c5su.A04 = new EfP(obj, i);
        return c5su.A00();
    }

    @Override // X.C33H, X.C33I
    public final boolean Dtk(C5SW c5sw) {
        switch (this.A00) {
            case 1:
                ViewOnLongClickListenerC70244WNo viewOnLongClickListenerC70244WNo = (ViewOnLongClickListenerC70244WNo) this.A01;
                A5M a5m = ((UGe) viewOnLongClickListenerC70244WNo.A01).A04;
                String A0R = AnonymousClass001.A0R("@", ((C66438UHo) viewOnLongClickListenerC70244WNo.A02).A05);
                if (A0R != null) {
                    C218069ke c218069ke = a5m.A00;
                    C88Y c88y = c218069ke.A0E;
                    c88y.A0H(c218069ke.A03);
                    c88y.A0I(A0R);
                    C218069ke.A02(c218069ke, A0R);
                    return true;
                }
                return true;
            case 2:
                C48624Lf0 c48624Lf0 = (C48624Lf0) this.A01;
                C45486KCa c45486KCa = new C45486KCa();
                c45486KCa.A01 = new C48612Leo(c48624Lf0);
                C189448aO A0y = AbstractC25225BEi.A0y(c48624Lf0.A0B);
                A0y.A06 = AbstractC167007dF.A09(c48624Lf0.A09, R.attr.igds_color_dimmer);
                A0y.A0T = c45486KCa;
                A0y.A0k = true;
                AbstractC25225BEi.A1Q(A0y, true);
                A0y.A00().A02(c48624Lf0.A08, c45486KCa);
                return false;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            default:
                return super.Dtk(c5sw);
            case 8:
                C14360o3.A0B(c5sw, 0);
                InterfaceC19610xo ARD = ((C2056398n) this.A01).A00.ARD();
                ARD.E7D("thread_translation_tooltip_impression", 3);
                ARD.apply();
                return true;
            case 11:
                C14360o3.A0B(c5sw, 0);
                ((EditProfileFieldsController) this.A01).A07().getMEditText().callOnClick();
                return true;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(c5sw, 0);
                EditProfileFieldsController editProfileFieldsController = (EditProfileFieldsController) this.A01;
                C140966Yy A0r = AbstractC25225BEi.A0r(editProfileFieldsController.A06(), editProfileFieldsController.A0C);
                AbstractC31364DqT.A03();
                AbstractC31175DnJ.A0t(AbstractC166987dD.A0b(), new C32287EJz(), A0r);
                return true;
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(c5sw, 0);
                ((InterfaceC144586fe) this.A01).Cvj();
                return true;
            case 16:
            case 17:
                c5sw.A08(true);
                return false;
        }
    }

    @Override // X.C33H, X.C33I
    public final void Dtq(C5SW c5sw) {
        if (9 - this.A00 != 0) {
            super.Dtq(c5sw);
            return;
        }
        C18720vz c18720vz = AbstractC12960li.A00;
        C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A00);
        A0P.E7G("long_press_account_switcher_row_to_create_shortcut_tooltip_last_impression_time", currentTimeMillis);
        A0P.apply();
        InterfaceC19630xq A0q = AbstractC31172DnG.A0q(c18720vz);
        AbstractC167017dG.A1L(A0q.ARD(), A0q, "long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", 0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC19630xq A0x;
        String A00;
        int A01;
        InterfaceC19610xo ARD;
        int i;
        boolean z;
        String A002;
        switch (this.A00) {
            case 0:
                A0x = AbstractC166987dD.A0x((UserSession) this.A01);
                A00 = AbstractC111324zv.A00(2723);
                i = AbstractC31172DnG.A01(A0x, A00) + 1;
                ARD = A0x.ARD();
                ARD.E7D(A00, i);
                ARD.apply();
                return;
            case 1:
            case 2:
            case 8:
            case 9:
            case Process.SIGTERM /* 15 */:
            default:
                super.Dtt(c5sw);
                return;
            case 3:
                AbstractC152666tt.A01((UserSession) this.A01);
                return;
            case 4:
                InterfaceC19630xq interfaceC19630xq = ((C23031Ai) this.A01).A01;
                A00 = "channel_inbox_directory_nux_seen_count";
                A01 = AbstractC31172DnG.A01(interfaceC19630xq, "channel_inbox_directory_nux_seen_count");
                ARD = interfaceC19630xq.ARD();
                i = A01 + 1;
                ARD.E7D(A00, i);
                ARD.apply();
                return;
            case 5:
                C14360o3.A0B(c5sw, 0);
                FKL fkl = (FKL) this.A01;
                InterfaceC19610xo A0e = AbstractC31176DnK.A0e(fkl.A01);
                A0e.E77("should_show_tool_tip_new_moderators_in_broadcast_channel", false);
                A0e.apply();
                Map map = fkl.A02;
                if (!map.containsValue(c5sw)) {
                    return;
                }
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    if (C14360o3.A0K(A1K.getValue(), c5sw)) {
                        AbstractC31177DnL.A1S(A1K, A1I);
                    }
                }
                map.remove(AbstractC001800i.A09(A1I.keySet()));
                return;
            case 6:
                ARD = AbstractC166987dD.A0w((C23031Ai) this.A01);
                ARD.E77(AbstractC111324zv.A00(4005), true);
                ARD.apply();
                return;
            case 7:
                InterfaceC19630xq interfaceC19630xq2 = ((GQC) this.A01).A03.A00;
                ARD = interfaceC19630xq2.ARD();
                A00 = AbstractC111324zv.A00(5103);
                A01 = AbstractC31172DnG.A01(interfaceC19630xq2, A00);
                i = A01 + 1;
                ARD.E7D(A00, i);
                ARD.apply();
                return;
            case 10:
                z = true;
                ARD = AbstractC166987dD.A0w(AbstractC23021Ah.A00((UserSession) this.A01));
                A002 = MSV.A00(461);
                ARD.E77(A002, z);
                ARD.apply();
                return;
            case 11:
                z = false;
                ARD = AbstractC166987dD.A0w(AbstractC23021Ah.A00(((EditProfileFieldsController) this.A01).A0C));
                A002 = "should_show_bio_linking_tooltip";
                ARD.E77(A002, z);
                ARD.apply();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                z = false;
                ARD = AbstractC166987dD.A0w(AbstractC23021Ah.A00(((EditProfileFieldsController) this.A01).A0C));
                A002 = "should_show_multiple_links_tooltip";
                ARD.E77(A002, z);
                ARD.apply();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                z = false;
                ARD = AbstractC166987dD.A0w(AbstractC23021Ah.A00(((C53Z) this.A01).getSession()));
                A002 = "should_show_bio_accessory_buttons_tooltip";
                ARD.E77(A002, z);
                ARD.apply();
                return;
            case 14:
                C23031Ai c23031Ai = (C23031Ai) this.A01;
                AbstractC167007dF.A1L(c23031Ai, c23031Ai.A51, C23031Ai.A8c, 262, true);
                return;
            case 16:
                z = true;
                ARD = AbstractC166987dD.A0w(AbstractC23021Ah.A00(((EM6) this.A01).A05));
                A002 = AbstractC111324zv.A00(2443);
                ARD.E77(A002, z);
                ARD.apply();
                return;
            case 17:
                z = true;
                ARD = AbstractC166987dD.A0w(AbstractC23021Ah.A00(((EM6) this.A01).A05));
                A002 = "has_seen_liked_nux_public_collections";
                ARD.E77(A002, z);
                ARD.apply();
                return;
            case 18:
                UserSession userSession = (UserSession) this.A01;
                C2056398n A003 = AbstractC2056298m.A00(userSession);
                AbstractC167007dF.A1L(A003, A003.A0K, C2056398n.A0d, 28, true);
                C142846ck A004 = AbstractC147806l5.A00(userSession);
                C25531Mh A0I = AbstractC31172DnG.A0I(A004);
                if (!AbstractC25226BEj.A1Z(A0I)) {
                    return;
                }
                AbstractC31175DnJ.A1B(A0I, A004);
                AbstractC31174DnI.A1K(A0I, "bc_live_tool_tip_rendered");
                A0I.A0o("go_live_tooltip");
                A0I.A0p("thread_view");
                A0I.A0n("broadcast");
                A0I.A0r(null);
                AbstractC31177DnL.A1H(A0I, A004, null);
                return;
            case Process.SIGSTOP /* 19 */:
                A0x = ((RunnableC36973GQq) this.A01).A03.A01;
                A00 = "zero_rating_video_setting_banner_tooltip";
                i = AbstractC31172DnG.A01(A0x, A00) + 1;
                ARD = A0x.ARD();
                ARD.E7D(A00, i);
                ARD.apply();
                return;
        }
    }
}
