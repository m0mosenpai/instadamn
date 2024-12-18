package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Os0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55909Os0 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "ReelOptionsOverflowHelper";
    public Dialog A00;
    public DialogInterface.OnDismissListener A01;
    public CharSequence A02;
    public CharSequence A03;
    public final Activity A04;
    public final Resources A05;
    public final Fragment A06;
    public final AbstractC10360h2 A07;
    public final AbstractC018607g A08;
    public final InterfaceC11380iw A09;
    public final C18920wW A0A;
    public final UserSession A0B;
    public final InterfaceC69973Cg A0C;
    public final C5H9 A0D;
    public final InterfaceC60442pS A0E;
    public final C41181vS A0F;
    public final C41551w4 A0G;
    public final ReelViewerConfig A0H;
    public final C3G2 A0I;
    public final C71023Go A0J;
    public final C54802OJw A0K;
    public final ODG A0L;
    public final C141596ac A0M;
    public final C145186gd A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final InterfaceC16820sZ A0T;
    public final C57332k8 A0U;
    public final C145776ha A0V;
    public final C145876hk A0W;
    public static final C55165OdT A0Y = new Object();
    public static final DialogInterface A0X = new DialogInterfaceC55328Ogq();

    public static final void A03(DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, InterfaceC145276gm interfaceC145276gm, C55909Os0 c55909Os0, C145236gi c145236gi, O9W o9w, O6R o6r, CharSequence charSequence) {
        C41181vS c41181vS = c55909Os0.A0F;
        C38321qM c38321qM = c41181vS.A0b;
        Resources resources = c55909Os0.A05;
        if (MSY.A1U(resources, charSequence, 2131957640)) {
            C55165OdT.A03(interfaceC11380iw, c41181vS, interfaceC145276gm, c55909Os0);
        } else if (!MSY.A1U(resources, charSequence, 2131972785) && !MSY.A1U(resources, charSequence, 2131972769)) {
            if (MSY.A1U(resources, charSequence, 2131973643)) {
                UserSession userSession = c55909Os0.A0B;
                AbstractC10360h2 abstractC10360h2 = c55909Os0.A07;
                AbstractC018607g abstractC018607g = c55909Os0.A08;
                DialogInterface.OnDismissListener onDismissListener2 = c55909Os0.A01;
                InterfaceC69973Cg interfaceC69973Cg = c55909Os0.A0C;
                if (interfaceC69973Cg != null) {
                    Activity activity = c55909Os0.A04;
                    C14360o3.A0B(abstractC018607g, 3);
                    AbstractC35084Fcv.A00(activity, c41181vS, new P96(activity, onDismissListener2, abstractC10360h2, abstractC018607g, userSession, interfaceC69973Cg, c41181vS));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else if (c38321qM != null && (MSY.A1U(resources, charSequence, AbstractC138316On.A00(ProductType.STORY, false)) || MSY.A1U(resources, charSequence, 2131953994))) {
                C1Y6 A00 = AbstractC69888VxF.A00();
                UserSession userSession2 = c55909Os0.A0B;
                InterfaceC11380iw interfaceC11380iw2 = c55909Os0.A09;
                A00.A07(c55909Os0.A06, new C42150Ily(onDismissListener, 1), null, interfaceC11380iw2, userSession2, c38321qM, interfaceC11380iw2.getModuleName(), null, true);
            } else if (MSY.A1U(resources, charSequence, 2131969368)) {
                c55909Os0.A0K.A00(onDismissListener, true);
            } else if (AbstractC43592JPx.A13(resources.getString(2131961605), resources.getString(2131952336)).contains(charSequence.toString())) {
                A06(onDismissListener, c55909Os0, charSequence);
            } else if (MSY.A1U(resources, charSequence, 2131963269)) {
                AbstractC50522MSa.A1U(c55909Os0);
            } else if (MSY.A1U(resources, charSequence, 2131970881)) {
                C145176gc.A08(c145236gi.A00);
            } else if (MSY.A1U(resources, charSequence, 2131973639)) {
                o9w.A00.CxG(c41181vS, o9w.A01);
            } else if (MSY.A1U(resources, charSequence, 2131973297)) {
                C41551w4 c41551w4 = c55909Os0.A0G;
                o6r.A00.Dga(c41181vS, c41551w4.A0H.A0P, c41551w4, null);
            } else if (MSY.A1U(resources, charSequence, 2131974525)) {
                AbstractC54136NwY.A00(c55909Os0.A04, DialogInterfaceOnClickListenerC55320Ogi.A00(c55909Os0, 24), interfaceC11380iw, c55909Os0.A0B, c41181vS);
            } else if (MSY.A1U(resources, charSequence, 2131974483)) {
                AbstractC54131NwT.A00(c55909Os0.A04, c55909Os0.A07, c55909Os0.A0B, c41181vS);
            }
        } else {
            Activity activity2 = c55909Os0.A04;
            UserSession userSession3 = c55909Os0.A0B;
            C55165OdT.A01(activity2, c55909Os0.A01, c55909Os0.A07, c55909Os0.A08, userSession3, c41181vS);
        }
        c55909Os0.A01 = null;
    }

    public static final void A04(DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, InterfaceC58312Pt4 interfaceC58312Pt4, C55909Os0 c55909Os0) {
        String str;
        C105824pt c105824pt;
        EnumC65855TvH enumC65855TvH;
        List BQh;
        C38321qM c38321qM;
        InterfaceC11380iw interfaceC11380iw2 = interfaceC11380iw;
        C53024Ncw c53024Ncw = new C53024Ncw(4, onDismissListener, interfaceC58312Pt4);
        long A06 = AbstractC31177DnL.A06();
        UserSession userSession = c55909Os0.A0B;
        Activity activity = c55909Os0.A04;
        C41181vS c41181vS = c55909Os0.A0F;
        boolean A1W = c41181vS.A1W();
        if (A1W) {
            interfaceC11380iw2 = AbstractC31171DnF.A0D("ig_threads_in_stories_unit");
        }
        if (A1W) {
            C105794pq c105794pq = c41181vS.A0D;
            C18C.A07(c105794pq, AbstractC111324zv.A00(43));
            if (c105794pq != null && (BQh = c105794pq.A00.BQh()) != null && (c38321qM = (C38321qM) AbstractC166987dD.A16(BQh)) != null) {
                str = c38321qM.getId();
            } else {
                str = null;
            }
        } else if (c41181vS.A0e.ordinal() == 3 && (c105824pt = c41181vS.A0c) != null) {
            str = c105824pt.A0e;
            str.getClass();
        } else {
            str = c41181vS.A0j;
            C14360o3.A07(str);
        }
        if (c41181vS.A18()) {
            enumC65855TvH = EnumC65855TvH.A15;
        } else if (A1W) {
            enumC65855TvH = EnumC65855TvH.A0A;
        } else {
            enumC65855TvH = EnumC65855TvH.A1D;
        }
        WEz A01 = AbstractC69993VzD.A01(activity, interfaceC11380iw2, userSession, enumC65855TvH, VG2.A0d, str);
        A01.A01 = c41181vS.A0i;
        A01.A08(c53024Ncw);
        A01.A09("reporting_timestamp", String.valueOf(A06));
        WEz.A00(null, A01);
    }

    public final void A0W(Context context, DialogInterface.OnDismissListener onDismissListener, View view, InterfaceC11380iw interfaceC11380iw, InterfaceC145226gh interfaceC145226gh, InterfaceC145276gm interfaceC145276gm, InterfaceC58312Pt4 interfaceC58312Pt4, InterfaceC57978PnO interfaceC57978PnO, InterfaceC57979PnP interfaceC57979PnP, InterfaceC57980PnQ interfaceC57980PnQ, InterfaceC1119153d interfaceC1119153d, C145326gr c145326gr, C145296go c145296go, C145246gj c145246gj, C145316gq c145316gq, C145306gp c145306gp) {
        AbstractC25234BEr.A0k(4, onDismissListener, interfaceC145276gm, c145326gr, c145246gj);
        C14360o3.A0B(c145296go, 8);
        AbstractC25229BEm.A1J(c145306gp, 9, c145316gq);
        User user = this.A0F.A0i;
        if (user != null && user.A0M() == C05F.A00) {
            C25621Ms A0M = AbstractC31177DnL.A0M(this.A0B);
            A0M.A0R(C2045893s.class, C2046093u.class);
            A0M.A0B("users/{user_id}/info/");
            A0M.A0A = "users/{user_id}/info/";
            A0M.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId());
            A0M.A9s("from_module", "ReelOptionsDialog");
            A0M.A04();
            C52232N9v c52232N9v = new C52232N9v(context, onDismissListener, view, interfaceC11380iw, interfaceC145226gh, interfaceC145276gm, interfaceC58312Pt4, interfaceC57978PnO, interfaceC57979PnP, interfaceC57980PnQ, this, interfaceC1119153d, user, c145326gr, c145296go, c145246gj, c145316gq, c145306gp);
            Activity activity = this.A04;
            AbstractC018607g abstractC018607g = this.A08;
            C1ON A0N = A0M.A0N();
            A0N.A00 = c52232N9v;
            C1GJ.A00(activity, abstractC018607g, A0N);
            return;
        }
        A0X(context, onDismissListener, view, interfaceC11380iw, interfaceC145226gh, interfaceC145276gm, interfaceC58312Pt4, interfaceC57978PnO, interfaceC57979PnP, interfaceC1119153d, c145326gr, c145296go, c145246gj, c145316gq, c145306gp);
    }

    public final void A0X(Context context, DialogInterface.OnDismissListener onDismissListener, View view, InterfaceC11380iw interfaceC11380iw, InterfaceC145226gh interfaceC145226gh, InterfaceC145276gm interfaceC145276gm, InterfaceC58312Pt4 interfaceC58312Pt4, InterfaceC57978PnO interfaceC57978PnO, InterfaceC57979PnP interfaceC57979PnP, InterfaceC1119153d interfaceC1119153d, C145326gr c145326gr, C145296go c145296go, C145246gj c145246gj, C145316gq c145316gq, C145306gp c145306gp) {
        this.A01 = onDismissListener;
        UserSession userSession = this.A0B;
        C50674MYs c50674MYs = new C50674MYs(context, userSession);
        for (CharSequence charSequence : A0V(this)) {
            Resources resources = this.A05;
            if (!AbstractC50523MSb.A1X(resources, charSequence, 2131972401) && !AbstractC50523MSb.A1X(resources, charSequence, 2131957640) && !AbstractC50523MSb.A1X(resources, charSequence, 2131965442) && !AbstractC50523MSb.A1X(resources, charSequence, 2131974483)) {
                c50674MYs.A0B(charSequence.toString(), new ViewOnClickListenerC55454Ok8(onDismissListener, interfaceC11380iw, interfaceC145276gm, interfaceC58312Pt4, interfaceC57978PnO, interfaceC57979PnP, this, interfaceC1119153d, c145326gr, c145296go, c145246gj, c145316gq, c145306gp, charSequence, 1));
            } else {
                c50674MYs.A09(charSequence.toString(), new ViewOnClickListenerC55454Ok8(onDismissListener, interfaceC11380iw, interfaceC145276gm, interfaceC58312Pt4, interfaceC57978PnO, interfaceC57979PnP, this, interfaceC1119153d, c145326gr, c145296go, c145246gj, c145316gq, c145306gp, charSequence, 0));
            }
        }
        if (view != null && !this.A0F.CdW() && C18U.A06(C06090Tz.A05, userSession, 36327945786178537L)) {
            C8QJ c8qj = new C8QJ(context, userSession, null, false);
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1M = AbstractC16960so.A1M("[INTERNAL] Pause Playback", "[INTERNAL] Resume Playback", "[INTERNAL] Bulk Like (Flaky)", "[INTERNAL] Clear EQR cache", "[INTERNAL] Show Reel Ranker Score", null);
            List list = c50674MYs.A09;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj : list) {
                AbstractC25228BEl.A1Q(obj, A1E2, A1M.contains(((C50676MYu) obj).A04) ? 1 : 0);
            }
            Iterator it = A1E2.iterator();
            while (it.hasNext()) {
                C50676MYu c50676MYu = (C50676MYu) it.next();
                String str = c50676MYu.A04;
                if (str == null) {
                    str = AbstractC166997dE.A0p(context, c50676MYu.A02);
                }
                A1E.add(new C199928sw(null, null, null, new C56408P2v(c50676MYu, 0), Integer.valueOf(c50676MYu.A08), str, 0, 0, 0, false, false, false, true, false, false, false));
            }
            c8qj.A02(A1E);
            c8qj.A01(view);
            return;
        }
        c50674MYs.A03 = interfaceC145226gh;
        C31727DwY.A01(context, c50674MYs);
    }

    public final void A0Y(Context context, DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, InterfaceC145226gh interfaceC145226gh, InterfaceC145276gm interfaceC145276gm, InterfaceC57980PnQ interfaceC57980PnQ, C145286gn c145286gn, C145236gi c145236gi, C145246gj c145246gj) {
        C41181vS c41181vS;
        int i;
        AbstractC167027dH.A0a(1, interfaceC145226gh, onDismissListener, c145236gi, c145246gj);
        AbstractC167017dG.A1U(interfaceC145276gm, c145286gn);
        this.A01 = onDismissListener;
        UserSession userSession = this.A0B;
        C50674MYs c50674MYs = new C50674MYs(context, userSession);
        Resources resources = this.A05;
        String A0q = AbstractC166997dE.A0q(resources, 2131972230);
        String A0q2 = AbstractC166997dE.A0q(resources, 2131957713);
        C3G2 c3g2 = this.A0I;
        C3G2 c3g22 = C3G2.A12;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c3g2 == c3g22) {
            A07(resources, A1E, 2131972230);
            if (this.A0G.A0H.A09 != HighlightReelTypeStr.A06) {
                A07(resources, A1E, 2131961652);
            }
            A07(resources, A1E, 2131976056);
            A0P(this, A1E);
        } else {
            C41551w4 c41551w4 = this.A0G;
            Reel reel = c41551w4.A0H;
            if (reel.A0l()) {
                A07(resources, A1E, 2131957713);
                A07(resources, A1E, 2131972234);
                c41181vS = this.A0F;
                if (c41181vS.A1h() && !C141446aN.A05(c41181vS, c41551w4, this.A0H, c3g2)) {
                    i = 2131973297;
                    A07(resources, A1E, i);
                }
                A0P(this, A1E);
                A0A(c41181vS.A0b, this, A1E);
            } else {
                A07(resources, A1E, 2131972230);
                if (reel.A09 != HighlightReelTypeStr.A06) {
                    A07(resources, A1E, 2131961652);
                }
                c41181vS = this.A0F;
                if (c41181vS.A1h() && !C141446aN.A05(c41181vS, c41551w4, this.A0H, c3g2)) {
                    A07(resources, A1E, 2131973297);
                }
                A0K(this, "story_highlight_action_sheet", A1E);
                A0J(this, "story_highlight_action_sheet", A1E);
                A0L(this, "story_highlight_action_sheet", A1E);
                if (C18U.A06(C06090Tz.A05, userSession, 36328925039771513L)) {
                    i = 2131953166;
                    A07(resources, A1E, i);
                }
                A0P(this, A1E);
                A0A(c41181vS.A0b, this, A1E);
            }
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            ViewOnClickListenerC55435Ojk viewOnClickListenerC55435Ojk = new ViewOnClickListenerC55435Ojk(onDismissListener, interfaceC11380iw, interfaceC145276gm, interfaceC57980PnQ, this, c145286gn, c145236gi, c145246gj, charSequence);
            if (!C14360o3.A0K(charSequence, A0q) && !C14360o3.A0K(charSequence, A0q2)) {
                c50674MYs.A0B(charSequence.toString(), viewOnClickListenerC55435Ojk);
            } else {
                c50674MYs.A09(charSequence.toString(), viewOnClickListenerC55435Ojk);
            }
        }
        c50674MYs.A03 = interfaceC145226gh;
        C31727DwY.A01(context, c50674MYs);
    }

    public final void A0Z(DialogInterface.OnDismissListener onDismissListener, InterfaceC58312Pt4 interfaceC58312Pt4) {
        C14360o3.A0B(onDismissListener, 1);
        Dialog A00 = A00(DialogInterfaceOnClickListenerC55321Ogj.A00(interfaceC58312Pt4, this, 43), onDismissListener, this, A0V(this));
        C0fJ.A00(A00);
        this.A00 = A00;
    }

    public static final Dialog A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, C55909Os0 c55909Os0, CharSequence[] charSequenceArr) {
        c55909Os0.A01 = onDismissListener;
        C193328hC A0H = AbstractC31171DnF.A0H(c55909Os0.A04);
        A0H.A0m(c55909Os0.A06, c55909Os0.A0B);
        A0H.A0f(onClickListener, charSequenceArr);
        AbstractC31175DnJ.A1O(A0H);
        DialogInterfaceOnDismissListenerC55324Ogm.A00(A0H, c55909Os0, 16);
        return A0H.A02();
    }

    private final String A01(String str) {
        Resources resources = this.A05;
        if (MSY.A1U(resources, str, 2131953166)) {
            return "archive_highlight_option";
        }
        if (MSY.A1U(resources, str, 2131954754)) {
            return "cancel";
        }
        if (MSY.A1U(resources, str, 2131956837)) {
            return "copy_link_url";
        }
        if (MSY.A1U(resources, str, 2131957640)) {
            return "delete";
        }
        if (MSY.A1U(resources, str, 2131957692)) {
            return "delete_photo_message";
        }
        if (MSY.A1U(resources, str, 2131957693)) {
            return "delete_photo_title";
        }
        if (MSY.A1U(resources, str, 2131957724)) {
            return "delete_video_message";
        }
        if (MSY.A1U(resources, str, 2131957725)) {
            return "delete_video_title";
        }
        if (MSY.A1U(resources, str, 2131961606)) {
            return "edit_partner";
        }
        if (MSY.A1U(resources, str, 2131961652)) {
            return "edit_story_option";
        }
        if (MSY.A1U(resources, str, 2131961880)) {
            return "error";
        }
        if (MSY.A1U(resources, str, 2131963269)) {
            return "go_to_promo_manager";
        }
        if (MSY.A1U(resources, str, 2131963556)) {
            return "hide_this";
        }
        if (MSY.A1U(resources, str, 2131964513)) {
            return "inline_removed_notif_title";
        }
        if (MSY.A1U(resources, str, 2131971770)) {
            return "leave_group";
        }
        if (MSY.A1U(resources, str, 2131965615)) {
            return "live_videos_show_less";
        }
        if (MSY.A1U(resources, str, 2131966092)) {
            return "media_logging_title";
        }
        if (MSY.A1U(resources, str, 2131966095)) {
            return "media_option_share_link";
        }
        if (MSY.A1U(resources, str, 2131967973)) {
            return "music_overlay_cant_save_story_alert";
        }
        if (MSY.A1U(resources, str, 2131968687)) {
            return "not_now";
        }
        if (MSY.A1U(resources, str, 2131968948)) {
            return "ok";
        }
        if (MSY.A1U(resources, str, AbstractC138316On.A00(ProductType.STORY, false))) {
            return "promote";
        }
        if (MSY.A1U(resources, str, 2131953994)) {
            return "promote_again";
        }
        if (MSY.A1U(resources, str, 2131971826)) {
            return "reel_settings_title";
        }
        if (MSY.A1U(resources, str, 2131972171)) {
            return "remove";
        }
        if (MSY.A1U(resources, str, 2131972195)) {
            return "remove_business_partner";
        }
        if (MSY.A1U(resources, str, 2131972196)) {
            return "remove_business_partner_description";
        }
        if (!MSY.A1U(resources, str, 2131972230) && !MSY.A1U(resources, str, 2131972234)) {
            if (MSY.A1U(resources, str, 2131957713)) {
                return "delete_story";
            }
            if (MSY.A1U(resources, str, 2131972235)) {
                return "remove_from_paid_partnership_label";
            }
            if (MSY.A1U(resources, str, 2131972282)) {
                return "remove_photo_highlight_button";
            }
            if (MSY.A1U(resources, str, 2131972283)) {
                return "remove_photo_highlight_message";
            }
            if (MSY.A1U(resources, str, 2131972284)) {
                return "remove_photo_highlight_message_active";
            }
            if (MSY.A1U(resources, str, 2131972285)) {
                return "remove_photo_highlight_title";
            }
            if (MSY.A1U(resources, str, 2131972286)) {
                return "remove_photo_lately_title";
            }
            if (!MSY.A1U(resources, str, 2131972301) && !MSY.A1U(resources, str, 2131972303)) {
                if (MSY.A1U(resources, str, 2131972304)) {
                    return "remove_sponsor_tag_title";
                }
                if (MSY.A1U(resources, str, 2131972323)) {
                    return "remove_video_highlight_button";
                }
                if (MSY.A1U(resources, str, 2131972324)) {
                    return "remove_video_highlight_message";
                }
                if (MSY.A1U(resources, str, 2131972325)) {
                    return "remove_video_highlight_message_active";
                }
                if (MSY.A1U(resources, str, 2131972326)) {
                    return "remove_video_highlight_title";
                }
                if (MSY.A1U(resources, str, 2131972327)) {
                    return "remove_video_lately_title";
                }
                if (MSY.A1U(resources, str, 2131972340)) {
                    return "removing_from_highlights_progress";
                }
                if (MSY.A1U(resources, str, 2131972401)) {
                    return "report_options";
                }
                if (MSY.A1U(resources, str, 2131972410)) {
                    return "report_thanks_toast_msg_ads";
                }
                if (MSY.A1U(resources, str, 2131972699)) {
                    return "save";
                }
                if (MSY.A1U(resources, str, 2131972769)) {
                    return "save_photo";
                }
                if (MSY.A1U(resources, str, 2131972785)) {
                    return "save_video";
                }
                if (MSY.A1U(resources, str, 2131972833)) {
                    return "saved_to_camera_roll";
                }
                if (!MSY.A1U(resources, str, 2131973297) && !MSY.A1U(resources, str, 2131973298)) {
                    if (MSY.A1U(resources, str, 2131973639)) {
                        return "share";
                    }
                    if (MSY.A1U(resources, str, 2131973643)) {
                        return "share_as_post";
                    }
                    if (MSY.A1U(resources, str, 2131973688)) {
                        return "share_photo_to_facebook_message";
                    }
                    if (MSY.A1U(resources, str, 2131973762)) {
                        return "share_to_facebook_title";
                    }
                    if (MSY.A1U(resources, str, 2131973801)) {
                        return "share_video_to_facebook_message";
                    }
                    if (MSY.A1U(resources, str, 2131974336)) {
                        return "sponsor_tag_dialog_title";
                    }
                    if (MSY.A1U(resources, str, 2131974339)) {
                        return "sponsored_label_dialog_title";
                    }
                    if (MSY.A1U(resources, str, 2131968678)) {
                        return "not_interested";
                    }
                    if (MSY.A1U(resources, str, 2131975134)) {
                        return "tag_business_partner";
                    }
                    if (MSY.A1U(resources, str, 2131976035)) {
                        return "unable_to_delete_promoted_story";
                    }
                    if (MSY.A1U(resources, str, 2131976036)) {
                        return "unable_to_delete_story";
                    }
                    if (MSY.A1U(resources, str, 2131976056)) {
                        return "unarchive_highlight_option";
                    }
                    if (MSY.A1U(resources, str, 2131976159)) {
                        return AbstractC43591JPw.A00(1381);
                    }
                    if (MSY.A1U(resources, str, 2131970881)) {
                        return "view_ad_insights";
                    }
                    if (MSY.A1U(resources, str, 2131973214)) {
                        return "see_why_button_misinformation";
                    }
                    if (MSY.A1U(resources, str, 2131969368)) {
                        return "partnership_label_and_ads";
                    }
                    if (MSY.A1U(resources, str, 2131972430)) {
                        return "request_mentions";
                    }
                    if (MSY.A1U(resources, str, 2131969970)) {
                        return "producer_delete_story";
                    }
                    if (MSY.A1U(resources, str, 2131961591)) {
                        return "edit_gen_ai_label";
                    }
                    if (MSY.A1U(resources, str, 2131974589)) {
                        return "story_comments_disable_title";
                    }
                    if (MSY.A1U(resources, str, 2131974591)) {
                        return "story_comments_enable_title";
                    }
                    return "unknown_menu_option";
                }
                return "send_to_direct";
            }
            return "remove_sponsor_tag_subtitle";
        }
        return "remove_from_highlight_option";
    }

    public static final void A05(DialogInterface.OnDismissListener onDismissListener, C55909Os0 c55909Os0) {
        Fragment A00;
        if (c55909Os0.A0F.A0b != null) {
            Fragment fragment = c55909Os0.A06;
            Context requireContext = fragment.requireContext();
            UserSession userSession = c55909Os0.A0B;
            boolean z = false;
            if (AbstractC75343a1.A05(userSession)) {
                A00 = CFO.A00(false);
            } else {
                A00 = AbstractC34031F0k.A00(userSession, "video_overflow_menu", null, false, true, false, false, false);
            }
            if (AbstractC75373a4.A04(userSession) || AbstractC75373a4.A02(userSession)) {
                z = true;
            }
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            Resources resources = requireContext.getResources();
            int i = 2131954790;
            if (z) {
                i = 2131954792;
            }
            AbstractC31172DnG.A1G(resources, A0y, i);
            C189478aR A002 = A0y.A00();
            AbstractC35091Fd2.A01(null, userSession, "video_overflow_menu", "video_subtitles_settings_entered", null);
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                A002.A02(activity, A00);
                C3DN A0r = AbstractC31172DnG.A0r(activity);
                if (A0r != null) {
                    ((C3DP) A0r).A0H = new C56767PHk(onDismissListener);
                }
            }
        }
    }

    public static final void A06(DialogInterface.OnDismissListener onDismissListener, C55909Os0 c55909Os0, CharSequence charSequence) {
        Resources resources = c55909Os0.A05;
        String A0q = AbstractC166997dE.A0q(resources, 2131961605);
        String A0q2 = AbstractC166997dE.A0q(resources, 2131952336);
        C38321qM c38321qM = c55909Os0.A0F.A0b;
        if (A0q.equals(charSequence) || A0q2.equals(charSequence)) {
            if (c38321qM != null && c38321qM.A0C.getBoostedBySponsor() != null) {
                C54802OJw c54802OJw = c55909Os0.A0K;
                FragmentActivity fragmentActivity = c54802OJw.A07;
                AbstractC55199Oe9.A04(fragmentActivity, DialogInterfaceOnClickListenerC55321Ogj.A00(c54802OJw, onDismissListener, 42), c54802OJw.A0B, fragmentActivity.getString(2131954777), fragmentActivity.getString(2131954775));
            } else {
                c55909Os0.A0K.A00(onDismissListener, false);
            }
        }
        UserSession userSession = c55909Os0.A0B;
        LL0.A02(c55909Os0, userSession, C05F.A0H, C05F.A0Y, LB9.A00(userSession));
    }

    public static final void A08(InterfaceC11380iw interfaceC11380iw, C55909Os0 c55909Os0) {
        String str;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        String str2;
        Activity activity = c55909Os0.A04;
        UserSession userSession = c55909Os0.A0B;
        String moduleName = interfaceC11380iw.getModuleName();
        C38321qM c38321qM = c55909Os0.A0F.A0b;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2 = null;
        if (c38321qM != null) {
            str = c38321qM.A2u();
        } else {
            str = null;
        }
        EnumC124565kK enumC124565kK = EnumC124565kK.STORY;
        if (c38321qM != null) {
            mediaGenAIDetectionMethod = c38321qM.A1J();
        } else {
            mediaGenAIDetectionMethod = null;
        }
        C124575kL.A00(activity, enumC124565kK, mediaGenAIDetectionMethod, userSession, moduleName, str, false);
        String moduleName2 = interfaceC11380iw.getModuleName();
        if (c38321qM != null) {
            str2 = c38321qM.A2u();
            mediaGenAIDetectionMethod2 = c38321qM.A1J();
        } else {
            str2 = null;
        }
        AbstractC86593tX.A0e(enumC124565kK, mediaGenAIDetectionMethod2, userSession, null, moduleName2, "genai_transparency_menu_item_click", str2);
    }

    public static final void A09(C38321qM c38321qM, C55909Os0 c55909Os0, List list) {
        if (c38321qM != null && !AbstractC25230BEn.A1P(((c38321qM.A1B() + SandboxRepository.CACHE_TTL) > AbstractC31177DnL.A06() ? 1 : ((c38321qM.A1B() + SandboxRepository.CACHE_TTL) == AbstractC31177DnL.A06() ? 0 : -1))) && c38321qM.A5W() && C180377zR.A08(c55909Os0.A0B)) {
            return;
        }
        if (!C18U.A06(C06090Tz.A05, c55909Os0.A0B, 36318879110142703L)) {
            return;
        }
        list.add(AbstractC166997dE.A0q(c55909Os0.A05, 2131953174));
    }

    public static final void A0A(C38321qM c38321qM, C55909Os0 c55909Os0, List list) {
        String str;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        UserSession userSession = c55909Os0.A0B;
        if (C124575kL.A02(userSession, c38321qM)) {
            String moduleName = c55909Os0.A09.getModuleName();
            if (c38321qM != null) {
                str = c38321qM.A2u();
            } else {
                str = null;
            }
            EnumC124565kK enumC124565kK = EnumC124565kK.STORY;
            if (c38321qM != null) {
                mediaGenAIDetectionMethod = c38321qM.A1J();
            } else {
                mediaGenAIDetectionMethod = null;
            }
            AbstractC86593tX.A0e(enumC124565kK, mediaGenAIDetectionMethod, userSession, null, moduleName, "genai_transparency_menu_item_impression", str);
            list.add(AbstractC166997dE.A0q(c55909Os0.A05, 2131952641));
        }
    }

    public static final void A0B(C38321qM c38321qM, C55909Os0 c55909Os0, List list) {
        if (c38321qM != null && AbstractC41653Ibl.A02(c38321qM)) {
            list.add(AbstractC166997dE.A0q(c55909Os0.A05, 2131973214));
        }
    }

    public static final void A0C(InterfaceC58312Pt4 interfaceC58312Pt4, C55909Os0 c55909Os0, CharSequence charSequence) {
        CharSequence charSequence2 = c55909Os0.A02;
        if (charSequence2 != null && charSequence2.equals(charSequence)) {
            UserSession userSession = c55909Os0.A0B;
            InterfaceC60442pS interfaceC60442pS = c55909Os0.A0E;
            C1NI A09 = c55909Os0.A0F.A09();
            if (A09 != null) {
                C32U.A0N(userSession, c55909Os0.A0D, A09, interfaceC60442pS, null, "hide_button");
                interfaceC58312Pt4.DKe();
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        c55909Os0.A01 = null;
    }

    public static final void A0D(C55909Os0 c55909Os0) {
        Activity activity = c55909Os0.A04;
        AbstractC10360h2 abstractC10360h2 = c55909Os0.A07;
        C41181vS c41181vS = c55909Os0.A0F;
        String str = c41181vS.A0k;
        String str2 = c41181vS.A0j;
        InterfaceC60442pS interfaceC60442pS = c55909Os0.A0E;
        AbstractC018607g abstractC018607g = c55909Os0.A08;
        UserSession userSession = c55909Os0.A0B;
        String str3 = c55909Os0.A0P;
        AbstractC31510Dsu.A0D(activity, abstractC10360h2, abstractC018607g, new C35871Fsl(activity, null, 0, false), userSession, interfaceC60442pS, true, C05F.A00, null, str, str2, str3, "story_highlight_action_sheet", "copy_link", null, true);
    }

    public static final void A0E(C55909Os0 c55909Os0) {
        Activity activity = c55909Os0.A04;
        AbstractC10360h2 abstractC10360h2 = c55909Os0.A07;
        C41181vS c41181vS = c55909Os0.A0F;
        AbstractC31510Dsu.A07(activity, null, abstractC10360h2, c55909Os0.A08, c55909Os0.A0B, c55909Os0.A0E, c41181vS, null, "location_story_action_sheet", false);
    }

    public static final void A0F(C55909Os0 c55909Os0) {
        Activity activity = c55909Os0.A04;
        AbstractC10360h2 abstractC10360h2 = c55909Os0.A07;
        C41181vS c41181vS = c55909Os0.A0F;
        String str = c41181vS.A0k;
        String str2 = c41181vS.A0j;
        User user = c41181vS.A0i;
        if (user != null) {
            AbstractC31510Dsu.A0J(activity, abstractC10360h2, c55909Os0.A08, c55909Os0.A0B, c55909Os0.A0E, user, null, str, str2, "story_highlight_action_sheet");
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0G(C55909Os0 c55909Os0) {
        Activity activity = c55909Os0.A04;
        AbstractC10360h2 abstractC10360h2 = c55909Os0.A07;
        C41181vS c41181vS = c55909Os0.A0F;
        AbstractC31510Dsu.A0G(activity, abstractC10360h2, c55909Os0.A08, c55909Os0.A0B, c55909Os0.A0E, c41181vS, null, "location_story_action_sheet");
    }

    public static final void A0H(C55909Os0 c55909Os0) {
        UserSession userSession = c55909Os0.A0B;
        ReelStore A03 = ReelStore.A03(userSession);
        C41181vS c41181vS = c55909Os0.A0F;
        String str = c41181vS.A0k;
        Reel A0M = A03.A0M(str);
        String str2 = null;
        if (A0M != null) {
            C1NB c1nb = A0M.A0W;
            if (c1nb != null) {
                str2 = c1nb.getName();
            }
            if (A0M.A0h() && str2 != null) {
                String str3 = A0M.A0r;
                if (str3 == null) {
                    str3 = AbstractC166997dE.A0q(c55909Os0.A04.getResources(), 2131971191);
                }
                Activity activity = c55909Os0.A04;
                AbstractC10360h2 abstractC10360h2 = c55909Os0.A07;
                String str4 = c41181vS.A0j;
                String A0r = AbstractC166997dE.A0r(activity.getResources(), AnonymousClass001.A0D(str2, '@'), 2131971180);
                String str5 = c55909Os0.A0P;
                AbstractC31510Dsu.A0K(activity, abstractC10360h2, c55909Os0.A08, userSession, c55909Os0.A0E, str, str4, str3, A0r, str5, "story_highlight_action_sheet");
            }
        }
    }

    public static final void A0I(C55909Os0 c55909Os0, String str) {
        String str2;
        if (!C14360o3.A0K(c55909Os0.A0R, str) && !C14360o3.A0K(c55909Os0.A0O, str)) {
            C41181vS c41181vS = c55909Os0.A0F;
            if (c41181vS.A1K()) {
                str2 = "story_highlight_action_sheet";
            } else {
                str2 = "location_story_action_sheet";
            }
            String A01 = c55909Os0.A01(str);
            AbstractC73317Y7a.A08(c55909Os0.A0E, c55909Os0.A0B, null, null, null, c41181vS.A0j, c55909Os0.A0P, str2, A01, null, null, null, false);
        }
    }

    public static final void A0L(C55909Os0 c55909Os0, String str, List list) {
        UserSession userSession = c55909Os0.A0B;
        Reel A0M = ReelStore.A03(userSession).A0M(c55909Os0.A0F.A0k);
        if (A0M != null && A0M.A0h() && c55909Os0.A0U() && AbstractC54241NyM.A00(userSession)) {
            list.add(c55909Os0.A0S);
            c55909Os0.A0T(str, "qr_code");
        }
    }

    public static final void A0M(C55909Os0 c55909Os0, List list) {
        boolean A1o = c55909Os0.A0F.A1o();
        Resources resources = c55909Os0.A05;
        int i = 2131972769;
        if (A1o) {
            i = 2131972785;
        }
        String string = resources.getString(i);
        C14360o3.A0A(string);
        list.add(string);
    }

    public static final void A0N(C55909Os0 c55909Os0, List list) {
        C41181vS c41181vS = c55909Os0.A0F;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && c41181vS.CdW()) {
            UserSession userSession = c55909Os0.A0B;
            boolean Cff = c38321qM.Cff();
            boolean A5A = c38321qM.A5A();
            boolean A4T = c38321qM.A4T();
            String A0t = AbstractC25231BEo.A0t(AbstractC25226BEj.A14(c38321qM));
            if (Cff && A5A) {
                if (!C2TN.A05(userSession, A0t) || A4T) {
                    list.add(AbstractC166997dE.A0q(c55909Os0.A05, 2131954796));
                }
            }
        }
    }

    public static final void A0O(C55909Os0 c55909Os0, List list) {
        list.add(AbstractC166997dE.A0q(c55909Os0.A05, 2131957640));
    }

    public static final void A0Q(C55909Os0 c55909Os0, List list) {
        if (c55909Os0.A0F.A14()) {
            if (C18U.A06(C06090Tz.A05, c55909Os0.A0B, 36319909902753603L)) {
                list.add(1, AbstractC166997dE.A0q(c55909Os0.A05, 2131974525));
            }
        }
    }

    public static final void A0R(C55909Os0 c55909Os0, List list) {
        C41181vS c41181vS = c55909Os0.A0F;
        if (c41181vS.A0j() && !c41181vS.A0k()) {
            if (C18U.A06(C06090Tz.A05, c55909Os0.A0B, 36318221980145700L)) {
                list.add(AbstractC166997dE.A0q(c55909Os0.A05, 2131974589));
            }
        }
    }

    public static final void A0S(C55909Os0 c55909Os0, List list) {
        C41181vS c41181vS = c55909Os0.A0F;
        if (c41181vS.A0j() && c41181vS.A0k()) {
            if (C18U.A06(C06090Tz.A05, c55909Os0.A0B, 36318221980145700L)) {
                list.add(AbstractC166997dE.A0q(c55909Os0.A05, 2131974591));
            }
        }
    }

    private final void A0T(String str, String str2) {
        AbstractC73317Y7a.A0A(this.A0E, this.A0B, null, this.A0F.A0j, this.A0P, str, str2);
    }

    private final boolean A0U() {
        C41551w4 c41551w4 = this.A0G;
        C41181vS c41181vS = this.A0F;
        if (AbstractC54250NyV.A00(this.A0B, c41181vS, c41551w4) && c41181vS.A0B() != EnumC76383bi.A0A && !c41181vS.A1v(EnumC75383a5.A1B)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0197, code lost:
    
        if (X.AbstractC166997dE.A1Z(r0.A03.Cdp(), true) == false) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence[] A0V(X.C55909Os0 r13) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55909Os0.A0V(X.Os0):java.lang.CharSequence[]");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ReelOptionsDialog";
    }

    public static void A07(Resources resources, AbstractCollection abstractCollection, int i) {
        String string = resources.getString(i);
        C14360o3.A07(string);
        abstractCollection.add(string);
    }

    public static final void A0J(C55909Os0 c55909Os0, String str, List list) {
        if (c55909Os0.A0U()) {
            if (!C18U.A06(C06090Tz.A05, c55909Os0.A0B, 36328985168265132L)) {
                list.add(c55909Os0.A0O);
                c55909Os0.A0T(str, "copy_link");
            }
        }
    }

    public static final void A0K(C55909Os0 c55909Os0, String str, List list) {
        if (c55909Os0.A0U()) {
            if (!C18U.A06(C06090Tz.A05, c55909Os0.A0B, 36328985168199595L)) {
                list.add(c55909Os0.A0R);
                c55909Os0.A0T(str, "system_share_sheet");
            }
        }
    }

    public static final void A0P(C55909Os0 c55909Os0, List list) {
        for (Object obj : list) {
            if (!C14360o3.A0K(c55909Os0.A0R, obj) && !C14360o3.A0K(c55909Os0.A0O, obj)) {
                c55909Os0.A0T("location_story_action_sheet", c55909Os0.A01(AbstractC167017dG.A0n(obj, "", AbstractC166987dD.A1C())));
            }
        }
    }

    public C55909Os0(Activity activity, Resources resources, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC69973Cg interfaceC69973Cg, C5H9 c5h9, InterfaceC60442pS interfaceC60442pS, C57332k8 c57332k8, C41181vS c41181vS, C41551w4 c41551w4, ReelViewerConfig reelViewerConfig, C3G2 c3g2, C145776ha c145776ha, C141596ac c141596ac, C145876hk c145876hk, C145186gd c145186gd, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c145186gd, 14);
        this.A04 = activity;
        this.A06 = fragment;
        this.A09 = interfaceC11380iw;
        this.A05 = resources;
        this.A0V = c145776ha;
        this.A0G = c41551w4;
        this.A0F = c41181vS;
        this.A0E = interfaceC60442pS;
        this.A0I = c3g2;
        this.A0Q = str;
        this.A0B = userSession;
        this.A0D = c5h9;
        this.A0N = c145186gd;
        this.A0U = c57332k8;
        this.A0C = interfaceC69973Cg;
        this.A0H = reelViewerConfig;
        this.A0W = c145876hk;
        this.A0M = c141596ac;
        this.A0T = interfaceC16820sZ;
        this.A07 = fragment.getParentFragmentManager();
        this.A08 = AbstractC018607g.A00(fragment);
        this.A0R = AbstractC166997dE.A0q(resources, 2131973639);
        this.A0O = AbstractC166997dE.A0q(resources, 2131956837);
        this.A0S = AbstractC166997dE.A0q(resources, 2131971200);
        this.A0K = new C54802OJw(fragment, interfaceC11380iw, userSession, c41181vS, c145186gd);
        this.A0L = new ODG(fragment, userSession, c41181vS);
        this.A0P = AbstractC25231BEo.A0t(c41181vS.A0i);
        this.A0A = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A0J = AbstractC145786hb.A00(userSession, interfaceC60442pS, str2);
    }

    public static final void A02(DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, InterfaceC145276gm interfaceC145276gm, InterfaceC58312Pt4 interfaceC58312Pt4, InterfaceC57978PnO interfaceC57978PnO, InterfaceC57979PnP interfaceC57979PnP, C55909Os0 c55909Os0, InterfaceC1119153d interfaceC1119153d, C145326gr c145326gr, C145296go c145296go, C145246gj c145246gj, C145316gq c145316gq, C145306gp c145306gp, CharSequence charSequence) {
        Context context;
        C105824pt c105824pt;
        Resources resources = c55909Os0.A05;
        if (MSY.A1U(resources, charSequence, 2131972401)) {
            A04(onDismissListener, interfaceC11380iw, interfaceC58312Pt4, c55909Os0);
        } else if (MSY.A1U(resources, charSequence, 2131954796)) {
            A05(onDismissListener, c55909Os0);
        } else if (MSY.A1U(resources, charSequence, 2131968678)) {
            UserSession userSession = c55909Os0.A0B;
            C41181vS c41181vS = c55909Os0.A0F;
            User user = c41181vS.A0i;
            if (user != null) {
                Reel reel = c55909Os0.A0G.A0H;
                String A0H = reel.A0H(userSession);
                C25621Ms c25621Ms = new C25621Ms(userSession);
                Integer num = C05F.A01;
                c25621Ms.A09(num);
                c25621Ms.A0L("friendships/mute_friend_reel/%s/", user.getId());
                c25621Ms.A9s(CacheBehaviorLogger.SOURCE, "explore_viewer");
                c25621Ms.A9s("reel_type", A0H);
                c25621Ms.A0S(C151516rx.class, C151526ry.class);
                C1GJ.A00(c55909Os0.A04, c55909Os0.A08, AbstractC31172DnG.A0U(c25621Ms, true));
                InterfaceC60442pS interfaceC60442pS = c55909Os0.A0E;
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    String str = reel.A0n;
                    String str2 = c55909Os0.A0Q;
                    String loggingInfoToken = c38321qM.A0C.getLoggingInfoToken();
                    String id = c38321qM.getId();
                    if (id != null) {
                        C41771Ien.A06(interfaceC60442pS, null, userSession, c38321qM.BRp(), id, c38321qM.getId(), "sfplt_in_viewer", str2, str, c38321qM.A0C.getMezqlToken(), null, null, null, loggingInfoToken, -1);
                    }
                    C41771Ien.A08(interfaceC60442pS, userSession, null, c38321qM.BRp(), null, "explore_see_less", c38321qM.getId(), c38321qM.getId(), "sfplt_in_viewer", str2, str, c38321qM.A0C.getLoggingInfoToken(), null, null, null, c38321qM.A0C.Bl8(), null, null, null, null, -1, true, false);
                    C1NB c1nb = reel.A0W;
                    if (c1nb != null) {
                        if (c1nb.CBs() == num) {
                            User CDj = c1nb.CDj();
                            if (CDj != null) {
                                if (CDj.equals(user)) {
                                    reel.A1Y = true;
                                    interfaceC58312Pt4.DKe();
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                        interfaceC58312Pt4.DKc(EnumC75193Zm.A0J);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (MSY.A1U(resources, charSequence, 2131965615)) {
            C105824pt c105824pt2 = c55909Os0.A0F.A0c;
            if (c105824pt2 != null) {
                UserSession userSession2 = c55909Os0.A0B;
                InterfaceC60442pS interfaceC60442pS2 = c55909Os0.A0E;
                String str3 = c105824pt2.A0e;
                str3.getClass();
                String A0g = MSX.A0g(c105824pt2);
                String str4 = c55909Os0.A0G.A0H.A0n;
                String str5 = c55909Os0.A0Q;
                EnumC40111tc enumC40111tc = EnumC40111tc.A0L;
                C41771Ien.A06(interfaceC60442pS2, null, userSession2, enumC40111tc, str3, A0g, "sfplt_in_viewer", str5, str4, null, null, null, null, null, -1);
                C41771Ien.A08(interfaceC60442pS2, userSession2, null, enumC40111tc, null, "explore_see_less", str3, A0g, "sfplt_in_viewer", str5, str4, null, null, null, null, null, null, null, null, null, -1, true, false);
                interfaceC58312Pt4.DKc(EnumC75193Zm.A0J);
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else if (MSY.A1U(resources, charSequence, 2131974336)) {
            UserSession userSession3 = c55909Os0.A0B;
            InterfaceC60442pS interfaceC60442pS3 = c55909Os0.A0E;
            C1NI A09 = c55909Os0.A0F.A09();
            if (A09 != null) {
                C5H9 c5h9 = c55909Os0.A0D;
                AbstractC11060iN.A00(userSession3);
                if (AbstractC75423a9.A00(A09, interfaceC60442pS3)) {
                    C82713mZ A01 = C32U.A01(c5h9, A09, interfaceC60442pS3, "branded_content_click");
                    A01.A76 = "about";
                    C32U.A0C(userSession3, A01, A09, interfaceC60442pS3, null);
                }
                C63397SjR c63397SjR = new C63397SjR(c55909Os0.A04, userSession3, C2Fb.A0X, "https://help.instagram.com/1199202110205564", false);
                c63397SjR.A0S = "ReelOptionsDialog";
                c63397SjR.A0A();
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else if (MSY.A1U(resources, charSequence, 2131972235)) {
            C54802OJw c54802OJw = c55909Os0.A0K;
            C193328hC A0H2 = AbstractC31171DnF.A0H(c54802OJw.A07);
            A0H2.A0A(2131972235);
            C38321qM c38321qM2 = c54802OJw.A0C.A0b;
            c38321qM2.getClass();
            A0H2.A09(c38321qM2.A4e() ? 2131972303 : 2131972301);
            A0H2.A0L(DialogInterfaceOnClickListenerC55320Ogi.A00(c54802OJw, 21), 2131972171);
            AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC55321Ogj.A00(c54802OJw, onDismissListener, 41), A0H2);
        } else if (MSY.A1U(resources, charSequence, 2131976855)) {
            C41181vS c41181vS2 = c55909Os0.A0F;
            if (c41181vS2.A0z()) {
                c55909Os0.A0W.A07(c41181vS2, c55909Os0.A0G, null, C2Fb.A3f);
            } else if (c41181vS2.A0x()) {
                c55909Os0.A0W.A06(c41181vS2, c55909Os0.A0G, null, C2Fb.A3f);
            } else if (c41181vS2.A0y()) {
                c55909Os0.A0W.A05(onDismissListener, c41181vS2, c55909Os0.A0G, null, C2Fb.A3f);
            } else if (c41181vS2.A0w()) {
                c55909Os0.A0W.A04(onDismissListener, c41181vS2, c55909Os0.A0G, null, interfaceC1119153d, C2Fb.A3f);
            }
        } else if (MSY.A1U(resources, charSequence, 2131972430)) {
            interfaceC57979PnP.Dg9(c55909Os0.A0F);
        } else if (MSY.A1U(resources, charSequence, 2131969970)) {
            interfaceC57978PnO.Db3(c55909Os0.A0F);
        } else if (MSY.A1U(resources, charSequence, 2131973214)) {
            c145326gr.A00(c55909Os0.A0F);
        } else if ("[INTERNAL] Pause Playback".equals(charSequence)) {
            c145246gj.A00.A18.EJE("user_paused_video");
        } else if (!"[INTERNAL] Resume Playback".equals(charSequence)) {
            if (!C14360o3.A0K(c55909Os0.A0R, charSequence)) {
                if (!C14360o3.A0K(c55909Os0.A0O, charSequence)) {
                    if (C14360o3.A0K(c55909Os0.A0S, charSequence)) {
                        A0H(c55909Os0);
                    } else if (MSY.A1U(resources, charSequence, 2131968091)) {
                        C145176gc c145176gc = c145296go.A00;
                        Object obj = c145176gc.A1B.get();
                        if (obj != null) {
                            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) obj;
                            Context context2 = abstractC59962oe.getContext();
                            if (context2 != null) {
                                InterfaceC1118853a interfaceC1118853a = c145176gc.A18;
                                C41181vS AuU = interfaceC1118853a.AuU();
                                if (AuU != null) {
                                    User user2 = AuU.A0i;
                                    String str6 = AuU.A0k;
                                    C14360o3.A07(str6);
                                    C41551w4 Aun = interfaceC1118853a.Aun(str6);
                                    if (user2 == null) {
                                        C9GR.A03(context2, context2.getString(2131968098), "mute_story_failure", 0);
                                    } else {
                                        UserSession userSession4 = c145176gc.A09;
                                        if (userSession4 != null) {
                                            Dialog A00 = AbstractC34859FXt.A00(context2, c145176gc.A16, userSession4, user2, new C43047J1n(context2, abstractC59962oe, Aun, c145176gc), C05F.A0C, null, "reel_overflow");
                                            c145176gc.A02 = A00;
                                            if (A00 != null) {
                                                A00.setOnCancelListener(new DialogInterfaceOnCancelListenerC55251OfP(c145176gc, 14));
                                                A00.setOnDismissListener(new DialogInterfaceOnDismissListenerC55324Ogm(c145176gc, 22));
                                            } else {
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                        }
                                        AbstractC31171DnF.A0y();
                                        throw C00O.createAndThrow();
                                    }
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else if (MSY.A1U(resources, charSequence, 2131952641)) {
                        A08(interfaceC11380iw, c55909Os0);
                    } else if (MSY.A1U(resources, charSequence, 2131968092)) {
                        C145176gc c145176gc2 = c145296go.A00;
                        Object obj2 = c145176gc2.A1B.get();
                        if (obj2 != null) {
                            Fragment fragment = (Fragment) obj2;
                            Context context3 = fragment.getContext();
                            if (context3 != null) {
                                C41181vS AuU2 = c145176gc2.A18.AuU();
                                if (AuU2 != null) {
                                    User user3 = AuU2.A0i;
                                    if (user3 == null) {
                                        C9GR.A03(context3, context3.getString(2131968098), "mute_story_failure", 0);
                                    } else {
                                        UserSession userSession5 = c145176gc2.A09;
                                        if (userSession5 != null) {
                                            InterfaceC60442pS interfaceC60442pS4 = c145176gc2.A16;
                                            FCG.A00(interfaceC60442pS4, userSession5, user3, C05F.A00, null, "reel_overflow");
                                            UserSession userSession6 = c145176gc2.A09;
                                            if (userSession6 != null) {
                                                FCG.A00(interfaceC60442pS4, userSession6, user3, C05F.A1I, null, "reel_overflow");
                                                NAD nad = new NAD(13, context3, fragment, c145176gc2);
                                                UserSession userSession7 = c145176gc2.A09;
                                                if (userSession7 != null) {
                                                    AbstractC35095Fd6.A02(nad, userSession7, user3, interfaceC60442pS4.getModuleName());
                                                }
                                            }
                                        }
                                        C14360o3.A0F("userSession");
                                        throw C00O.createAndThrow();
                                    }
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else if (MSY.A1U(resources, charSequence, 2131968077)) {
                        Context requireContext = c55909Os0.A06.requireContext();
                        User user4 = c55909Os0.A0F.A0i;
                        if (user4 != null) {
                            C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
                            A0I.A05 = AbstractC31178DnM.A0c(requireContext, user4, 2131962169);
                            A0I.A09(2131962168);
                            A0I.A0P(new DialogInterfaceOnClickListenerC55317Ogf(4, requireContext, c55909Os0, user4), EnumC193348hE.A05, 2131968091);
                            A0I.A06();
                            A0I.A0g(onDismissListener);
                            AbstractC166987dD.A1W(A0I);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else if (MSY.A1U(resources, charSequence, 2131976172)) {
                        Fragment fragment2 = c55909Os0.A06;
                        Context requireContext2 = fragment2.requireContext();
                        User user5 = c55909Os0.A0F.A0i;
                        if (user5 != null) {
                            AbstractC166987dD.A1Z(new C57165PZj(requireContext2, c55909Os0, user5, null, 37), AbstractC25229BEm.A0a(fragment2));
                            onDismissListener.onDismiss(null);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else if (MSY.A1U(resources, charSequence, 2131965618)) {
                        c145306gp.A00(true);
                    } else if (MSY.A1U(resources, charSequence, 2131965617)) {
                        c145306gp.A00(false);
                    } else if (MSY.A1U(resources, charSequence, 2131965442)) {
                        C41181vS c41181vS3 = c55909Os0.A0F;
                        C145176gc c145176gc3 = c145316gq.A00;
                        Fragment fragment3 = (Fragment) c145176gc3.A1B.get();
                        if (fragment3 != null && (context = fragment3.getContext()) != null && (c105824pt = c41181vS3.A0c) != null) {
                            C61972ry c61972ry = new C61972ry(fragment3.requireContext(), AbstractC018607g.A00(fragment3), null);
                            String str7 = c105824pt.A0X;
                            str7.getClass();
                            UserSession userSession8 = c145176gc3.A09;
                            if (userSession8 != null) {
                                C25621Ms A0c = AbstractC167017dG.A0c(userSession8);
                                A0c.A0L("live/%s/moderator/resign/", str7);
                                C1ON A0U = MSZ.A0U(A0c);
                                A0U.A00 = new NAD(14, context, c105824pt, c145176gc3);
                                c61972ry.schedule(A0U);
                            }
                            AbstractC31171DnF.A0y();
                            throw C00O.createAndThrow();
                        }
                        onDismissListener.onDismiss(A0X);
                    } else if (MSY.A1U(resources, charSequence, 2131957640)) {
                        A0Y.A04(c55909Os0.A04, c55909Os0.A01, c55909Os0.A06, c55909Os0.A07, c55909Os0.A09, interfaceC11380iw, c55909Os0.A0B, c55909Os0.A0G.A0H, c55909Os0.A0F, interfaceC145276gm);
                    } else if ("[INTERNAL] Clear EQR cache".equals(charSequence)) {
                        C148196lp.A03.A00(c55909Os0.A0B);
                    } else if ("[INTERNAL] Show Reel Ranker Score".equals(charSequence)) {
                        C41181vS c41181vS4 = c55909Os0.A0F;
                        FragmentActivity requireActivity = c55909Os0.A06.requireActivity();
                        UserSession userSession9 = c55909Os0.A0B;
                        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession9);
                        Bundle A06 = AbstractC31178DnM.A06("reel_id", c41181vS4.A0k);
                        AbstractC03240Dh.A00(A06, userSession9);
                        HC6 hc6 = new HC6();
                        hc6.setArguments(A06);
                        A0r.A0B(null, hc6);
                        A0r.A04();
                    } else if (MSY.A1U(resources, charSequence, 2131974483)) {
                        AbstractC54131NwT.A00(c55909Os0.A04, c55909Os0.A07, c55909Os0.A0B, c55909Os0.A0F);
                    }
                } else {
                    C41181vS c41181vS5 = c55909Os0.A0F;
                    if (c41181vS5.A1K()) {
                        A0D(c55909Os0);
                    } else if (c41181vS5.A18()) {
                        C105824pt c105824pt3 = c41181vS5.A0c;
                        if (c105824pt3 != null) {
                            Activity activity = c55909Os0.A04;
                            AbstractC10360h2 abstractC10360h2 = c55909Os0.A07;
                            AbstractC018607g abstractC018607g = c55909Os0.A08;
                            User user6 = c105824pt3.A09;
                            user6.getClass();
                            String str8 = c105824pt3.A0X;
                            str8.getClass();
                            String str9 = c105824pt3.A0e;
                            str9.getClass();
                            InterfaceC60442pS interfaceC60442pS5 = c55909Os0.A0E;
                            UserSession userSession10 = c55909Os0.A0B;
                            NSv nSv = new NSv(activity, abstractC10360h2, interfaceC60442pS5, userSession10, str9);
                            C1ON A012 = AbstractC35242Fgb.A01(userSession10, C05F.A00, user6.getUsername(), str8, interfaceC60442pS5.getModuleName());
                            A012.A00 = nSv;
                            C1GJ.A00(activity, abstractC018607g, A012);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        A0E(c55909Os0);
                    }
                    c55909Os0.A0V.DPQ();
                }
            } else {
                C41181vS c41181vS6 = c55909Os0.A0F;
                if (c41181vS6.A1K()) {
                    A0F(c55909Os0);
                } else if (c41181vS6.A18()) {
                    C105824pt c105824pt4 = c41181vS6.A0c;
                    if (c105824pt4 != null) {
                        Activity activity2 = c55909Os0.A04;
                        AbstractC10360h2 abstractC10360h22 = c55909Os0.A07;
                        AbstractC018607g abstractC018607g2 = c55909Os0.A08;
                        User user7 = c105824pt4.A09;
                        user7.getClass();
                        String str10 = c105824pt4.A0X;
                        str10.getClass();
                        String str11 = c105824pt4.A0e;
                        str11.getClass();
                        InterfaceC60442pS interfaceC60442pS6 = c55909Os0.A0E;
                        UserSession userSession11 = c55909Os0.A0B;
                        C33129EjY c33129EjY = new C33129EjY(abstractC10360h22, activity2, user7, interfaceC60442pS6, userSession11, str10, str11, 3);
                        C1ON A013 = AbstractC35242Fgb.A01(userSession11, C05F.A0Y, user7.getUsername(), str10, interfaceC60442pS6.getModuleName());
                        A013.A00 = c33129EjY;
                        C1GJ.A00(activity2, abstractC018607g2, A013);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    A0G(c55909Os0);
                }
                c55909Os0.A0V.DPR();
            }
        } else {
            c145246gj.A00.A18.EJJ();
        }
        c55909Os0.A01 = null;
        if (AbstractC54250NyV.A00(c55909Os0.A0B, c55909Os0.A0F, c55909Os0.A0G)) {
            A0I(c55909Os0, AbstractC167017dG.A0n(charSequence, "", AbstractC166987dD.A1C()));
        }
    }
}
