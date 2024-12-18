package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class P3X implements InterfaceC190658cN {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public P3X(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C52679NSc A00(P3X p3x) {
        return ((C50976Mfj) ((C52169N6y) p3x.A02).A06.getValue()).A00;
    }

    public static InterfaceC23621Ds A01(C52679NSc c52679NSc, User user) {
        UserSession userSession = c52679NSc.A00;
        user.A0c(userSession);
        AnonymousClass189.A00(userSession).A01(user, true, false);
        return null;
    }

    public static void A02(P3X p3x, int i) {
        if (i != 0) {
            C52169N6y c52169N6y = (C52169N6y) p3x.A02;
            c52169N6y.A03.A04(c52169N6y.getContext(), (UserSession) c52169N6y.A05.getValue(), ((User) p3x.A01).getUsername());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        String str;
        String str2;
        boolean z2;
        int i;
        EnumC154216wW enumC154216wW;
        C52679NSc A00;
        InterfaceC23621Ds A01;
        String str3;
        C19L c19l;
        int i2;
        String str4;
        String str5;
        String str6;
        InterfaceC16620sF pzk;
        String str7;
        Object value;
        String str8;
        C211819a8 c211819a8;
        C5Hb c5Hb;
        Drawable drawable;
        String str9;
        switch (this.A00) {
            case 0:
                Object obj = this.A01;
                C52251NAq c52251NAq = (C52251NAq) this.A02;
                O3I o3i = c52251NAq.A08;
                if (o3i != null) {
                    AbstractC52180N7p abstractC52180N7p = o3i.A00;
                    if (abstractC52180N7p instanceof NMX) {
                        NMX nmx = (NMX) abstractC52180N7p;
                        if (MSW.A0c(nmx).A0U) {
                            C54966OSw c54966OSw = nmx.A0A;
                            if (c54966OSw != null) {
                                C54966OSw.A00(c54966OSw, 2131961963, 2131961934);
                                return false;
                            }
                            return false;
                        }
                    }
                    TextView textView = c52251NAq.A03;
                    if (textView != null) {
                        textView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
                    }
                    C70399WUb c70399WUb = c52251NAq.A0B;
                    String str10 = c52251NAq.A0E;
                    String str11 = c52251NAq.A09;
                    String obj2 = obj.toString();
                    if (z) {
                        str = "create_promotion_toggle_on";
                    } else {
                        str = "create_promotion_toggle_off";
                    }
                    c70399WUb.A01 = str10;
                    c70399WUb.A02 = str11;
                    c70399WUb.A0S(obj2, str);
                    O3I o3i2 = c52251NAq.A08;
                    if (o3i2 != null) {
                        AbstractC52180N7p abstractC52180N7p2 = o3i2.A00;
                        if (abstractC52180N7p2 instanceof NMX) {
                            NMX nmx2 = (NMX) abstractC52180N7p2;
                            nmx2.A0O = z;
                            NMX.A09(nmx2);
                        }
                    }
                    return true;
                }
                return false;
            case 1:
                C54397O2d c54397O2d = (C54397O2d) this.A01;
                if (z) {
                    str2 = ((Reel) this.A02).getId();
                } else {
                    str2 = null;
                }
                c54397O2d.A00.A01(str2, null);
                return true;
            case 2:
                if (C196068lw.A03((C131995xZ) this.A01)) {
                    if (!z) {
                        return true;
                    }
                    P1D p1d = (P1D) this.A02;
                    UserSession userSession = p1d.A05;
                    if (C18U.A06(C06090Tz.A05, userSession, 36328246433824127L)) {
                        return true;
                    }
                    C200018t5 c200018t5 = new C200018t5(userSession);
                    AbstractC59962oe abstractC59962oe = p1d.A04;
                    C54804OJy A002 = AbstractC54221Nxz.A00(abstractC59962oe.requireActivity(), C82G.A08, userSession);
                    A002.A0A = C6WI.A02();
                    A002.A01 = abstractC59962oe;
                    c200018t5.A01(null, A002, PGX.A00);
                    return true;
                }
                P1D p1d2 = (P1D) this.A02;
                UserSession userSession2 = p1d2.A05;
                if (userSession2 != null && AbstractC08690cX.A01(userSession2) == EnumC222416a.A05 && C18U.A06(C06090Tz.A05, userSession2, 36322177645029422L)) {
                    return true;
                }
                p1d2.A06.A06("ig_fb_share_advanced_settings", null);
                return false;
            case 3:
                P0S p0s = (P0S) this.A02;
                UserSession userSession3 = p0s.A02;
                AnonymousClass229.A01(userSession3).A1C(p0s.A00, p0s.A01);
                C1QT A003 = C1QS.A00(userSession3);
                InterfaceC19610xo A0w = AbstractC166987dD.A0w((C23031Ai) this.A01);
                if (z) {
                    A0w.E7D("high_quality_media_upload", 1);
                    A0w.apply();
                    z2 = false;
                    AbstractC35091Fd2.A01(null, userSession3, "reels_advanced_setting", "high_quality_upload_on", null);
                    i = 681252206;
                } else {
                    A0w.E7D("high_quality_media_upload", 0);
                    A0w.apply();
                    z2 = false;
                    AbstractC35091Fd2.A01(null, userSession3, "reels_advanced_setting", "high_quality_upload_off", null);
                    i = 681257100;
                }
                long flowStartForMarker = A003.flowStartForMarker(i, "reels_advanced_setting", z2);
                A003.flowAnnotate(flowStartForMarker, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "reels_advanced_setting");
                A003.flowEndSuccess(flowStartForMarker);
                return true;
            case 4:
                P1B p1b = (P1B) this.A02;
                NKG nkg = p1b.A05;
                C0UO c0uo = nkg.A06;
                if (((C52461NJf) c0uo.getValue()).A04) {
                    P1B.A01(p1b);
                    return false;
                }
                if (z) {
                    UserSession userSession4 = p1b.A04;
                    AbstractC59962oe abstractC59962oe2 = p1b.A02;
                    Context requireContext = abstractC59962oe2.requireContext();
                    OJ6 A004 = AbstractC54315NzZ.A00(userSession4);
                    C23031Ai c23031Ai = A004.A01;
                    InterfaceC16530ry interfaceC16530ry = c23031Ai.A4F;
                    C0YR[] c0yrArr = C23031Ai.A8c;
                    if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 50) && (drawable = requireContext.getDrawable(R.drawable.riffs_qp_riffs_qp)) != null) {
                        C54844OMp c54844OMp = new C54844OMp(requireContext);
                        InterfaceC58202Pr8 interfaceC58202Pr8 = A004.A00;
                        c54844OMp.A07 = AbstractC166997dE.A0p(requireContext, interfaceC58202Pr8.Ash());
                        c54844OMp.A05 = AbstractC166997dE.A0p(requireContext, interfaceC58202Pr8.Asg());
                        c54844OMp.A04(drawable);
                        c54844OMp.A06 = C05F.A01;
                        c54844OMp.A02(DialogInterfaceOnClickListenerC55320Ogi.A00(A004, 58), AbstractC166997dE.A0p(requireContext, 2131955858));
                        c54844OMp.A03(DialogInterfaceOnClickListenerC55321Ogj.A00(requireContext, A004, 64), AbstractC166997dE.A0p(requireContext, 2131965052));
                        c54844OMp.A0B = true;
                        c54844OMp.A01();
                        C448424o c448424o = ((C22C) A004.A02.A02.getValue()).A0C;
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448424o.A01, "ig_camera_nux");
                        if (A0f.isSampled()) {
                            MSW.A1R(A0f, "SPINS_INVITE_PARTICIPATION");
                            A0f.AAP("nux_step", "OPEN");
                            AbstractC50522MSa.A1E(A0f, "camera_session_id", MSX.A0f(c448424o.A04));
                            MSW.A1Q(A0f);
                            MSW.A1M(EnumC50631MWs.A0L, A0f);
                            A0f.A8R(EnumC53336Nim.SPINNABLE_REEL, "spin_type");
                            A0f.Cht();
                        }
                        AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 50, true);
                    }
                    C25862BcH c25862BcH = p1b.A03;
                    String str12 = ((C52461NJf) c0uo.getValue()).A01;
                    C05A c05a = c25862BcH.A00;
                    do {
                        value = c05a.getValue();
                        MUW muw = (MUW) value;
                        str8 = muw.A03;
                        c211819a8 = (C211819a8) muw.A01;
                        c5Hb = (C5Hb) muw.A00;
                        C14360o3.A0B(c5Hb, 3);
                    } while (!c05a.AIi(value, new MUW(c211819a8, str12, str8, c5Hb)));
                    C52461NJf c52461NJf = (C52461NJf) c0uo.getValue();
                    List<C93094Fl> list = c52461NJf.A02;
                    if (list != null) {
                        int i3 = c52461NJf.A00;
                        ArrayList A0q = AbstractC167017dG.A0q(list);
                        for (C93094Fl c93094Fl : list) {
                            A0q.add(new C211819a8(c93094Fl, MSY.A1S((int) (c93094Fl.A00 - c93094Fl.A07), i3)));
                        }
                        C25862BcH.A00(c25862BcH, AbstractC133095zb.A03(A0q));
                    }
                    CND.A00(abstractC59962oe2.requireActivity(), userSession4, (InterfaceC16820sZ) this.A01, C57525Pfz.A00(p1b, 38), C57525Pfz.A00(p1b, 39), MSW.A1F(nkg, 17), MSW.A1F(nkg, 18));
                    return false;
                }
                C25862BcH.A00(p1b.A03, C5HZ.A01);
                P1B.A02(p1b, false);
                C448924t c448924t = P1B.A00(p1b).A0H;
                C25531Mh A0B = C25531Mh.A0B(c448924t.A01);
                if (AbstractC25226BEj.A1Z(A0B)) {
                    A0B.A0M(C81X.A2S, "tool_type");
                    C448924t.A00(A0B, c448924t);
                    A0B.A0a(EnumC114925Hg.CLIPS);
                    MSW.A1P(EnumC50631MWs.A0L, A0B);
                    A0B.Cht();
                    return false;
                }
                return false;
            case 5:
                if (this.A01 == EnumC53382NjX.A05) {
                    P1E p1e = (P1E) this.A02;
                    UserSession userSession5 = p1e.A0J;
                    if (C196218mC.A00(userSession5) != z && p1e.A0F) {
                        if (p1e.A0E) {
                            str9 = "tooltip_shown_only";
                        } else {
                            str9 = null;
                        }
                        AbstractC54208Nxm.A00(userSession5, "click", str9, z);
                        if (!AbstractC49092Nc.A00(userSession5).A00(CallerContext.A00(C50808McV.class), "ig_android_linking_cache_feed_composer")) {
                            AbstractC35174FfR.A00(EnumC72435Xdf.A0E, userSession5, "upsell_primary_click");
                        }
                        p1e.A0F = false;
                    }
                }
                View view = ((P1E) this.A02).A01;
                if (view != null) {
                    view.performClick();
                    return false;
                }
                return false;
            case 6:
                C52169N6y c52169N6y = (C52169N6y) this.A02;
                Context context = c52169N6y.getContext();
                if (z) {
                    c52169N6y.A03.A04(context, AbstractC166987dD.A0r(c52169N6y.A05), ((User) this.A01).getUsername());
                }
                if (context != null) {
                    if (z) {
                        enumC154216wW = EnumC154216wW.A03;
                    } else {
                        enumC154216wW = EnumC154216wW.A04;
                    }
                    InterfaceC09390do interfaceC09390do = c52169N6y.A05;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    User user = (User) this.A01;
                    OQF.A00(AbstractC166987dD.A0O(context), A0r, enumC154216wW, user);
                    AbstractC147806l5.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0I(enumC154216wW, user.getId(), true);
                }
                return true;
            case 7:
                A02(this, z ? 1 : 0);
                A00 = A00(this);
                if (A00 != null) {
                    User user2 = A00.A02;
                    user2.A03.EUD(Boolean.valueOf(z));
                    A01 = A01(A00, user2);
                    if (z) {
                        str3 = "turn_on_clips_notifications";
                    } else {
                        str3 = "turn_off_clips_notifications";
                    }
                    C52679NSc.A01(A00, str3);
                    C52679NSc.A00(A00);
                    c19l = ((C4A7) A00).A01;
                    i2 = 8;
                    pzk = new PZK(A00, A01, i2, z);
                    AbstractC166987dD.A1Z(pzk, c19l);
                }
                return true;
            case 8:
                A02(this, z ? 1 : 0);
                A00 = A00(this);
                if (A00 != null) {
                    User user3 = A00.A02;
                    user3.A03.EUF(Boolean.valueOf(z));
                    A01 = A01(A00, user3);
                    if (z) {
                        str4 = "turn_on_igtv_notifications";
                    } else {
                        str4 = "turn_off_igtv_notifications";
                    }
                    C52679NSc.A01(A00, str4);
                    C52679NSc.A00(A00);
                    c19l = ((C4A7) A00).A01;
                    i2 = 6;
                    pzk = new PZK(A00, A01, i2, z);
                    AbstractC166987dD.A1Z(pzk, c19l);
                }
                return true;
            case 9:
                A02(this, z ? 1 : 0);
                A00 = A00(this);
                if (A00 != null) {
                    User user4 = A00.A02;
                    user4.A03.EUE(Boolean.valueOf(z));
                    A01 = A01(A00, user4);
                    if (z) {
                        str5 = "turn_on_exclusive_content_notifications";
                    } else {
                        str5 = "turn_off_exclusive_content_notifications";
                    }
                    C52679NSc.A01(A00, str5);
                    C52679NSc.A00(A00);
                    c19l = ((C4A7) A00).A01;
                    i2 = 5;
                    pzk = new PZK(A00, A01, i2, z);
                    AbstractC166987dD.A1Z(pzk, c19l);
                }
                return true;
            case 10:
                A02(this, z ? 1 : 0);
                A00 = A00(this);
                if (A00 != null) {
                    User user5 = A00.A02;
                    user5.A03.EUC(Boolean.valueOf(z));
                    A01 = A01(A00, user5);
                    if (z) {
                        str6 = "turn_on_post_notifications";
                    } else {
                        str6 = "turn_off_post_notifications";
                    }
                    C52679NSc.A01(A00, str6);
                    C52679NSc.A00(A00);
                    c19l = ((C4A7) A00).A01;
                    i2 = 7;
                    pzk = new PZK(A00, A01, i2, z);
                    AbstractC166987dD.A1Z(pzk, c19l);
                }
                return true;
            case 11:
                A02(this, z ? 1 : 0);
                A00 = A00(this);
                if (A00 != null) {
                    User user6 = A00.A02;
                    user6.A03.EUG(Boolean.valueOf(z));
                    A01 = A01(A00, user6);
                    if (z) {
                        str7 = "turn_on_story_notifications";
                    } else {
                        str7 = "turn_off_story_notifications";
                    }
                    C52679NSc.A01(A00, str7);
                    C52679NSc.A00(A00);
                    c19l = ((C4A7) A00).A01;
                    i2 = 9;
                    pzk = new PZK(A00, A01, i2, z);
                    AbstractC166987dD.A1Z(pzk, c19l);
                }
                return true;
            default:
                Fragment fragment = (Fragment) this.A02;
                Object obj3 = this.A01;
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = fragment.getViewLifecycleOwner();
                c19l = C07Y.A00(viewLifecycleOwner);
                pzk = new C50528MSh(viewLifecycleOwner, obj3, fragment, c07s, null, 3, z);
                AbstractC166987dD.A1Z(pzk, c19l);
                return true;
        }
    }
}
