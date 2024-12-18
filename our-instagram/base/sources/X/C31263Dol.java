package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.util.ArrayList;

/* renamed from: X.Dol, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31263Dol {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final JR2 A02;
    public final C31255Dod A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;

    public C31263Dol(AbstractC59962oe abstractC59962oe, UserSession userSession, JR2 jr2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = abstractC59962oe;
        this.A02 = jr2;
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A05 = C37058GUs.A01(this, 37);
        this.A04 = C37058GUs.A01(this, 36);
        this.A03 = new C31255Dod(abstractC59962oe, userSession);
    }

    public final void A06(View view) {
        C14360o3.A0B(view, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, this.A01, 36325360215995413L);
        C35019Fbs c35019Fbs = (C35019Fbs) this.A04.getValue();
        C22P c22p = C22P.A03;
        if (A06) {
            c35019Fbs.A01(view, c22p);
        } else {
            c35019Fbs.A02(c22p);
        }
    }

    public final void A08(View view) {
        C14360o3.A0B(view, 0);
        FNS fns = (FNS) this.A05.getValue();
        C34922Fa8.A00(fns.A02, "direct_inbox_options_button_click");
        Context A0L = AbstractC166997dE.A0L(view);
        ArrayList A1E = AbstractC166987dD.A1E();
        if (fns.A03 != null) {
            int i = 2131959661;
            if (C14360o3.A0K(fns.A05.invoke(), C47062Du.A00)) {
                i = 2131959660;
            }
            A1E.add(new C199928sw(null, A0L.getDrawable(R.drawable.instagram_edit_list_pano_outline_24), null, new G85(fns, 9), null, AbstractC166997dE.A0p(A0L, i), 0, 0, 0, false, false, false, true, false, false, false));
        }
        UserSession userSession = fns.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        int i2 = 2131959658;
        if (C18U.A06(c06090Tz, userSession, 36326373828081494L)) {
            i2 = 2131959659;
        }
        String A0u = AbstractC25227BEk.A0u(A0L, i2);
        A1E.add(new C199928sw(null, A0L.getDrawable(R.drawable.instagram_toolbox_pano_outline_24), null, new G86(fns, A0u), null, A0u, 0, 0, 0, false, false, false, true, false, false, false));
        if (C18U.A06(c06090Tz, userSession, 36315894107868857L)) {
            A1E.add(new C199928sw(null, A0L.getDrawable(R.drawable.instagram_promote_pano_outline_24), null, new G85(fns, 8), null, AbstractC166997dE.A0p(A0L, 2131959657), 0, 0, 0, false, false, false, true, false, false, false));
        }
        if (AbstractC31268Doq.A02(userSession)) {
            AbstractC31265Don.A00();
            A1E.add(new C199928sw(null, A0L.getDrawable(R.drawable.instagram_gen_ai_home_pano_outline_24), null, new G85(fns, 7), null, AbstractC166997dE.A0p(A0L, 2131952563), 0, 0, 0, false, false, false, true, false, false, false));
        }
        C8QJ A0X = AbstractC31174DnI.A0X(A0L, userSession, A1E, false);
        A0X.getContentView().measure(0, 0);
        view.measure(0, 0);
        A0X.showAsDropDown(view, -(A0X.getContentView().getMeasuredWidth() - view.getMeasuredWidth()), 0);
    }

    public final void A00() {
        JR2 jr2 = this.A02;
        AbstractC31179DnN.A1N(AbstractC31176DnK.A0N(jr2.A0p()), "click_create_ad_button_on_inbox_surface");
        F0J.A00().A01(jr2.A1L.requireActivity(), jr2.A0p(), AbstractC43591JPw.A00(145));
    }

    public final void A01() {
        JR2 jr2 = this.A02;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("ChannelDiscoverySuggestionsFragment.ARG_SHOW_INVITES_SECTION", C18U.A06(C06090Tz.A05, jr2.A0p(), 36317908449302197L));
        UserSession A0p = jr2.A0p();
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        AbstractC31173DnH.A1I(abstractC59962oe, C6XJ.A03(abstractC59962oe.requireActivity(), A0b, A0p, ModalActivity.class, AbstractC111324zv.A00(879)));
        UserSession userSession = this.A01;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC167007dF.A1L(A00, A00.A5d, C23031Ai.A8c, 226, true);
        C35267Fh2 A002 = F3T.A00(userSession);
        InterfaceC02590Ai A003 = C35267Fh2.A00(A002);
        if (A003.isSampled()) {
            C35267Fh2.A04(A003, A002);
            AbstractC31177DnL.A1D(A003, "inbox_directory_sheet_rendered");
            AbstractC25232BEp.A1K(A003, "directory_button");
            AbstractC31173DnH.A1L(A003, A002.A00);
            A003.Cht();
        }
    }

    public final void A02() {
        C31665DvV c31665DvV = (C31665DvV) this.A07.invoke();
        if (c31665DvV != null) {
            UserSession userSession = c31665DvV.A0A;
            if (C18U.A06(C06090Tz.A05, userSession, 36328332333170130L) || C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36328332333694422L)) {
                C31665DvV.A04(c31665DvV);
            }
            C31665DvV.A07(c31665DvV, true);
        }
        AbstractC167007dF.A0x(this.A02.A0D);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.FLk, java.lang.Object] */
    public final void A03() {
        String str;
        UserSession userSession = this.A01;
        Context requireContext = this.A00.requireContext();
        ?? obj = new Object();
        obj.A03 = userSession;
        obj.A00 = requireContext;
        obj.A02 = new C148676mc(EnumC143386dd.THREAD, userSession);
        obj.A01 = new C148686md(userSession, requireContext);
        UserSession userSession2 = obj.A03;
        if (userSession2 == null) {
            str = "userSession";
        } else {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession2, 36317990052435717L) || C18U.A06(c06090Tz, userSession2, 36322418163919077L)) {
                C148686md c148686md = obj.A01;
                if (c148686md == null) {
                    str = "rollingDeprecationUtil";
                } else if (c148686md.A00()) {
                    Context context = obj.A00;
                    str = "context";
                    if (context != null) {
                        C193328hC A0I = AbstractC31171DnF.A0I(context);
                        UserSession userSession3 = obj.A03;
                        str = "userSession";
                        if (userSession3 != null) {
                            A0I.A05 = C18U.A04(c06090Tz, userSession3, 36885368117461609L);
                            A0I.A0r(C18U.A04(c06090Tz, userSession3, 36885368117396072L));
                            AbstractC31173DnH.A15(context, A0I, R.drawable.instagram_icons_exceptions_illo_restore_on_refresh_outline_96);
                            DialogInterfaceOnClickListenerC35452Fk9.A02(A0I, obj, 7, 2131976274);
                            A0I.A0I(DialogInterfaceOnClickListenerC35452Fk9.A00(obj, 6), 2131954767);
                            Dialog A02 = A0I.A02();
                            C148676mc c148676mc = obj.A02;
                            if (c148676mc == null) {
                                str = "audLogging";
                            } else {
                                c148676mc.A01();
                                C0fJ.A00(A02);
                                return;
                            }
                        }
                    }
                }
            }
            this.A02.A12();
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A04(View view) {
        AbstractC31179DnN.A1N(AbstractC12220kQ.A02(this.A01), "create_ad_button_on_inbox_surface_impression");
        JR2 jr2 = this.A02;
        ((C64742wY) jr2.A2X.getValue()).A00(view, QPTooltipAnchor.A0Z, (AbstractC55352ga) jr2.A2W.getValue());
    }

    public final void A05(View view) {
        FragmentActivity requireActivity = this.A00.requireActivity();
        C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
        if (AbstractC31172DnG.A01(A00.A01, "channel_inbox_directory_nux_seen_count") < 2 && !AbstractC167017dG.A1b(A00, A00.A5d, C23031Ai.A8c, 226)) {
            view.postDelayed(new GPH(requireActivity, view, A00), 1000L);
        }
    }

    public final void A07(View view) {
        UserSession userSession;
        Integer A00;
        AbstractC59962oe abstractC59962oe = this.A00;
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (activity != null && (A00 = AbstractC152666tt.A00((userSession = this.A01))) != null) {
            view.postDelayed(new GQ7(activity, view, userSession, A00), 1000L);
        }
        UserSession userSession2 = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36325235661943712L) || C18U.A06(c06090Tz, userSession2, 36325235662271394L)) {
            AbstractC34048F1b.A00(abstractC59962oe.requireActivity(), view, userSession2);
        }
    }
}
