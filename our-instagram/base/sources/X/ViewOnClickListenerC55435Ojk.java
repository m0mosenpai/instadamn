package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;

/* renamed from: X.Ojk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55435Ojk implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ InterfaceC145276gm A02;
    public final /* synthetic */ InterfaceC57980PnQ A03;
    public final /* synthetic */ C55909Os0 A04;
    public final /* synthetic */ C145286gn A05;
    public final /* synthetic */ C145236gi A06;
    public final /* synthetic */ C145246gj A07;
    public final /* synthetic */ CharSequence A08;

    public ViewOnClickListenerC55435Ojk(DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, InterfaceC145276gm interfaceC145276gm, InterfaceC57980PnQ interfaceC57980PnQ, C55909Os0 c55909Os0, C145286gn c145286gn, C145236gi c145236gi, C145246gj c145246gj, CharSequence charSequence) {
        this.A04 = c55909Os0;
        this.A08 = charSequence;
        this.A00 = onDismissListener;
        this.A06 = c145236gi;
        this.A07 = c145246gj;
        this.A03 = interfaceC57980PnQ;
        this.A02 = interfaceC145276gm;
        this.A05 = c145286gn;
        this.A01 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        FragmentActivity activity;
        int A05 = C0f9.A05(1924865506);
        C55909Os0 c55909Os0 = this.A04;
        CharSequence charSequence = this.A08;
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        C145236gi c145236gi = this.A06;
        C145246gj c145246gj = this.A07;
        InterfaceC57980PnQ interfaceC57980PnQ = this.A03;
        InterfaceC145276gm interfaceC145276gm = this.A02;
        C145286gn c145286gn = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C41181vS c41181vS = c55909Os0.A0F;
        C38321qM c38321qM = c41181vS.A0b;
        Resources resources = c55909Os0.A05;
        if (AbstractC50523MSb.A1X(resources, charSequence, 2131961652)) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("edit_highlights_reel_id", c41181vS.A0k);
            A0b.putBoolean("archive_multi_select_mode", true);
            A0b.putSerializable("highlight_management_source", AbstractC50558MTp.A01(c55909Os0.A0I));
            AbstractC31171DnF.A0L(c55909Os0.A04, A0b, c55909Os0.A0B, ModalActivity.class, "manage_highlights").A0D(c55909Os0.A06, 201);
        } else if (MSY.A1U(resources, charSequence, 2131957713)) {
            C55165OdT.A03(interfaceC11380iw, c41181vS, interfaceC145276gm, c55909Os0);
        } else if (!AbstractC50523MSb.A1X(resources, charSequence, 2131972230) && !AbstractC50523MSb.A1X(resources, charSequence, 2131972234)) {
            if (AbstractC50523MSb.A1X(resources, charSequence, 2131973297)) {
                interfaceC57980PnQ.Dkl(c41181vS);
            } else if (c55909Os0.A0R.contentEquals(charSequence)) {
                C55909Os0.A0F(c55909Os0);
            } else if (c55909Os0.A0O.contentEquals(charSequence)) {
                C55909Os0.A0D(c55909Os0);
            } else if (c38321qM != null && (AbstractC50523MSb.A1X(resources, charSequence, AbstractC138316On.A00(ProductType.STORY, false)) || AbstractC50523MSb.A1X(resources, charSequence, 2131953994))) {
                C1Y6 A00 = AbstractC69888VxF.A00();
                UserSession userSession = c55909Os0.A0B;
                InterfaceC11380iw interfaceC11380iw2 = c55909Os0.A09;
                A00.A07(c55909Os0.A06, new C42150Ily(onDismissListener, 2), null, interfaceC11380iw2, userSession, c38321qM, interfaceC11380iw2.getModuleName(), null, true);
            } else if (AbstractC50523MSb.A1X(resources, charSequence, 2131963269)) {
                AbstractC50522MSa.A1U(c55909Os0);
            } else if (AbstractC50523MSb.A1X(resources, charSequence, 2131970881)) {
                C145176gc.A08(c145236gi.A00);
            } else if ("[INTERNAL] Pause Playback".contentEquals(charSequence)) {
                c145246gj.A00.A18.EJE("user_paused_video");
            } else if ("[INTERNAL] Resume Playback".contentEquals(charSequence)) {
                c145246gj.A00.A18.EJJ();
            } else if (c55909Os0.A0S.contentEquals(charSequence)) {
                C55909Os0.A0H(c55909Os0);
            } else if (AbstractC50523MSb.A1X(resources, charSequence, 2131953166)) {
                Reel reel = c55909Os0.A0G.A0H;
                C145176gc c145176gc = c145286gn.A00;
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) c145176gc.A1B.get();
                if (abstractC59962oe != null && (activity = abstractC59962oe.getActivity()) != null) {
                    UserSession userSession2 = c145176gc.A09;
                    str = "userSession";
                    if (userSession2 != null) {
                        C1571673v.A05(abstractC59962oe, userSession2, EnumC1571773w.A05, "archive_highlight_option_tap", userSession2.userId);
                        UserSession userSession3 = c145176gc.A09;
                        if (userSession3 != null) {
                            AbstractC1571873x.A09(new C55830Oqg(0, activity, reel, c145176gc), userSession3, AbstractC37301Gc2.A0i(reel));
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            } else if (AbstractC50523MSb.A1X(resources, charSequence, 2131976056)) {
                Reel reel2 = c55909Os0.A0G.A0H;
                C145176gc c145176gc2 = c145286gn.A00;
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) c145176gc2.A1B.get();
                if (abstractC59962oe2 != null) {
                    Context requireContext = abstractC59962oe2.requireContext();
                    UserSession userSession4 = c145176gc2.A09;
                    if (userSession4 == null) {
                        str = "userSession";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    new C54838OLx(requireContext, abstractC59962oe2.getParentFragmentManager(), AbstractC018607g.A00(abstractC59962oe2), abstractC59962oe2, userSession4).A02(new C55841Oqr(abstractC59962oe2, reel2, c145176gc2));
                }
            }
        } else if (c38321qM != null) {
            AbstractC54894OPp.A00(c55909Os0.A04, onDismissListener, c55909Os0.A08, c55909Os0.A0B, c38321qM, c55909Os0.A0G.A0H, c55909Os0.A0I);
        }
        c55909Os0.A01 = null;
        C55909Os0.A0I(c55909Os0, AbstractC167017dG.A0n(charSequence, "", AbstractC166987dD.A1C()));
        C0f9.A0C(-1309295770, A05);
    }
}
