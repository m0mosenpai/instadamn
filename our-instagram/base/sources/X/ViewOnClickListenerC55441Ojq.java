package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.Ojq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55441Ojq implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ InterfaceC57975PnL A02;
    public final /* synthetic */ InterfaceC57976PnM A03;
    public final /* synthetic */ InterfaceC145276gm A04;
    public final /* synthetic */ InterfaceC146916jT A05;
    public final /* synthetic */ InterfaceC57977PnN A06;
    public final /* synthetic */ InterfaceC57980PnQ A07;
    public final /* synthetic */ C55909Os0 A08;
    public final /* synthetic */ C145236gi A09;
    public final /* synthetic */ C145326gr A0A;
    public final /* synthetic */ C145256gk A0B;
    public final /* synthetic */ C145246gj A0C;
    public final /* synthetic */ CharSequence A0D;

    public ViewOnClickListenerC55441Ojq(DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, InterfaceC57975PnL interfaceC57975PnL, InterfaceC57976PnM interfaceC57976PnM, InterfaceC145276gm interfaceC145276gm, InterfaceC146916jT interfaceC146916jT, InterfaceC57977PnN interfaceC57977PnN, InterfaceC57980PnQ interfaceC57980PnQ, C55909Os0 c55909Os0, C145236gi c145236gi, C145326gr c145326gr, C145256gk c145256gk, C145246gj c145246gj, CharSequence charSequence) {
        this.A08 = c55909Os0;
        this.A0D = charSequence;
        this.A00 = onDismissListener;
        this.A04 = interfaceC145276gm;
        this.A07 = interfaceC57980PnQ;
        this.A0A = c145326gr;
        this.A09 = c145236gi;
        this.A0C = c145246gj;
        this.A0B = c145256gk;
        this.A05 = interfaceC146916jT;
        this.A06 = interfaceC57977PnN;
        this.A02 = interfaceC57975PnL;
        this.A03 = interfaceC57976PnM;
        this.A01 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        Activity activity;
        int i;
        C140966Yy A0r;
        Fragment hc6;
        C193328hC A0H;
        int i2;
        int A05 = C0f9.A05(1720773047);
        C55909Os0 c55909Os0 = this.A08;
        CharSequence charSequence = this.A0D;
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        InterfaceC145276gm interfaceC145276gm = this.A04;
        InterfaceC57980PnQ interfaceC57980PnQ = this.A07;
        C145326gr c145326gr = this.A0A;
        C145236gi c145236gi = this.A09;
        C145246gj c145246gj = this.A0C;
        C145256gk c145256gk = this.A0B;
        InterfaceC146916jT interfaceC146916jT = this.A05;
        InterfaceC57977PnN interfaceC57977PnN = this.A06;
        InterfaceC57975PnL interfaceC57975PnL = this.A02;
        InterfaceC57976PnM interfaceC57976PnM = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C41181vS c41181vS = c55909Os0.A0F;
        C38321qM c38321qM = c41181vS.A0b;
        Resources resources = c55909Os0.A05;
        if (MSY.A1U(resources, charSequence, 2131971715) && c38321qM != null && c38321qM.A2O() == C05F.A0C && c55909Os0.A0H.A0B) {
            Activity activity2 = c55909Os0.A04;
            AbstractC10360h2 abstractC10360h2 = c55909Os0.A07;
            UserSession userSession = c55909Os0.A0B;
            DialogInterface.OnDismissListener onDismissListener2 = c55909Os0.A01;
            if (onDismissListener2 != null) {
                A0H = AbstractC31171DnF.A0H(activity2);
                A0H.A0A(2131971651);
                A0H.A09(2131971650);
                A0H.A0J(new DialogInterfaceOnClickListenerC55318Ogg(activity2, onDismissListener2, abstractC10360h2, userSession, c41181vS, 2), 2131971715);
                AbstractC31175DnJ.A1O(A0H);
                A0H.A0D(DialogInterfaceOnClickListenerC55320Ogi.A00(c145256gk, 22));
                i2 = 6;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (MSY.A1U(resources, charSequence, 2131971792)) {
            Activity activity3 = c55909Os0.A04;
            AbstractC10360h2 abstractC10360h22 = c55909Os0.A07;
            UserSession userSession2 = c55909Os0.A0B;
            DialogInterface.OnDismissListener onDismissListener3 = c55909Os0.A01;
            if (onDismissListener3 != null) {
                A0H = AbstractC31171DnF.A0H(activity3);
                A0H.A0A(2131971653);
                A0H.A09(2131971652);
                A0H.A0J(new DialogInterfaceOnClickListenerC55318Ogg(activity3, onDismissListener3, abstractC10360h22, userSession2, c41181vS, 3), 2131971792);
                AbstractC31175DnJ.A1O(A0H);
                A0H.A0D(DialogInterfaceOnClickListenerC55320Ogi.A00(c145256gk, 23));
                i2 = 7;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            if (MSY.A1U(resources, charSequence, 2131957640)) {
                C55165OdT.A03(interfaceC11380iw, c41181vS, interfaceC145276gm, c55909Os0);
            } else if (MSY.A1U(resources, charSequence, 2131954796)) {
                C55909Os0.A05(onDismissListener, c55909Os0);
            } else if (MSY.A1U(resources, charSequence, 2131973214)) {
                c145326gr.A00(c41181vS);
            } else if (!MSY.A1U(resources, charSequence, 2131972785) && !MSY.A1U(resources, charSequence, 2131972769)) {
                if (MSY.A1U(resources, charSequence, 2131953174)) {
                    interfaceC57976PnM.CxE(c41181vS);
                } else if (!MSY.A1U(resources, charSequence, 2131973297) && !MSY.A1U(resources, charSequence, 2131973298)) {
                    if (MSY.A1U(resources, charSequence, 2131973762)) {
                        interfaceC146916jT.Dln(c41181vS, c55909Os0.A0G, C05F.A01, AbstractC25231BEo.A0p());
                    } else if (MSY.A1U(resources, charSequence, 2131973643)) {
                        UserSession userSession3 = c55909Os0.A0B;
                        AbstractC10360h2 abstractC10360h23 = c55909Os0.A07;
                        AbstractC018607g abstractC018607g = c55909Os0.A08;
                        DialogInterface.OnDismissListener onDismissListener4 = c55909Os0.A01;
                        InterfaceC69973Cg interfaceC69973Cg = c55909Os0.A0C;
                        if (interfaceC69973Cg != null) {
                            Activity activity4 = c55909Os0.A04;
                            C14360o3.A0B(abstractC018607g, 3);
                            AbstractC35084Fcv.A00(activity4, c41181vS, new P96(activity4, onDismissListener4, abstractC10360h23, abstractC018607g, userSession3, interfaceC69973Cg, c41181vS));
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else if (MSY.A1U(resources, charSequence, 2131969368)) {
                        c55909Os0.A0K.A00(onDismissListener, true);
                    } else if (AbstractC43592JPx.A13(resources.getString(2131961605), resources.getString(2131952336)).contains(charSequence.toString())) {
                        C55909Os0.A06(onDismissListener, c55909Os0, charSequence);
                    } else if (MSY.A1U(resources, charSequence, 2131952316)) {
                        interfaceC57975PnL.CvR(c41181vS);
                    } else {
                        if (MSY.A1U(resources, charSequence, 2131971826)) {
                            A0r = AbstractC25225BEi.A0r(c55909Os0.A06.requireActivity(), c55909Os0.A0B);
                            hc6 = AbstractC86593tX.A0E();
                        } else if (c38321qM != null && (MSY.A1U(resources, charSequence, AbstractC138316On.A00(ProductType.STORY, false)) || MSY.A1U(resources, charSequence, 2131953994))) {
                            C1Y6 A00 = AbstractC69888VxF.A00();
                            UserSession userSession4 = c55909Os0.A0B;
                            InterfaceC11380iw interfaceC11380iw2 = c55909Os0.A09;
                            A00.A07(c55909Os0.A06, new C42150Ily(onDismissListener, 3), null, interfaceC11380iw2, userSession4, c38321qM, interfaceC11380iw2.getModuleName(), null, true);
                        } else if (MSY.A1U(resources, charSequence, 2131963270)) {
                            AbstractC50522MSa.A1U(c55909Os0);
                        } else if (MSY.A1U(resources, charSequence, 2131970881)) {
                            C145176gc.A08(c145236gi.A00);
                        } else if (C14360o3.A0K(c55909Os0.A0R, charSequence)) {
                            C55909Os0.A0G(c55909Os0);
                        } else if (C14360o3.A0K(c55909Os0.A0O, charSequence)) {
                            C55909Os0.A0E(c55909Os0);
                        } else if (C14360o3.A0K(c55909Os0.A0S, charSequence)) {
                            C55909Os0.A0H(c55909Os0);
                        } else if ("[INTERNAL] Pause Playback".equals(charSequence)) {
                            c145246gj.A00.A18.EJE("user_paused_video");
                        } else if ("[INTERNAL] Resume Playback".equals(charSequence)) {
                            c145246gj.A00.A18.EJJ();
                        } else if (MSY.A1U(resources, charSequence, 2131971665)) {
                            interfaceC57977PnN.DKp(c41181vS);
                        } else if ("[INTERNAL] Bulk Like (Flaky)".equals(charSequence)) {
                            C50689MZh c50689MZh = new C50689MZh(c55909Os0.A04, 18);
                            UserSession userSession5 = c55909Os0.A0B;
                            String str2 = c41181vS.A0j;
                            C25621Ms A0M = AbstractC31173DnH.A0M(userSession5);
                            A0M.A0B("story_interactions/bulk_story_like/");
                            AbstractC31176DnK.A1P(A0M, "media_id", str2);
                            C1ON A0N = A0M.A0N();
                            A0N.A00 = c50689MZh;
                            C1GJ.A03(A0N);
                        } else if ("[INTERNAL] Show Reel Ranker Score".equals(charSequence)) {
                            FragmentActivity requireActivity = c55909Os0.A06.requireActivity();
                            UserSession userSession6 = c55909Os0.A0B;
                            A0r = AbstractC25225BEi.A0r(requireActivity, userSession6);
                            Bundle A06 = AbstractC31178DnM.A06("reel_id", c41181vS.A0k);
                            AbstractC03240Dh.A00(A06, userSession6);
                            hc6 = new HC6();
                            hc6.setArguments(A06);
                        } else if (MSY.A1U(resources, charSequence, 2131974589)) {
                            if (c38321qM != null) {
                                activity = c55909Os0.A04;
                                IQQ.A01(activity, c55909Os0.A0B, c38321qM, AbstractC37303Gc4.A0E(c38321qM));
                                c55909Os0.A0T.invoke();
                                i = 2131974587;
                                C9GR.A07(activity, i);
                            }
                        } else if (MSY.A1U(resources, charSequence, 2131974591)) {
                            if (c38321qM != null) {
                                activity = c55909Os0.A04;
                                IQQ.A00(activity, c55909Os0.A0B, c38321qM);
                                c55909Os0.A0T.invoke();
                                i = 2131974588;
                                C9GR.A07(activity, i);
                            }
                        } else if (MSY.A1U(resources, charSequence, 2131974525)) {
                            AbstractC54136NwY.A00(c55909Os0.A04, DialogInterfaceOnClickListenerC55320Ogi.A00(c55909Os0, 25), interfaceC11380iw, c55909Os0.A0B, c41181vS);
                        } else if (MSY.A1U(resources, charSequence, 2131974483)) {
                            AbstractC54131NwT.A00(c55909Os0.A04, c55909Os0.A07, c55909Os0.A0B, c41181vS);
                        } else if (MSY.A1U(resources, charSequence, 2131961591)) {
                            PJW pjw = new PJW(0, onDismissListener, c55909Os0);
                            Context requireContext = c55909Os0.A06.requireContext();
                            UserSession userSession7 = c55909Os0.A0B;
                            String moduleName = c55909Os0.A09.getModuleName();
                            if (c38321qM != null) {
                                str = c38321qM.A2u();
                                mediaGenAIDetectionMethod = c38321qM.A1J();
                            } else {
                                str = null;
                                mediaGenAIDetectionMethod = null;
                            }
                            AbstractC86593tX.A0P(requireContext, EnumC124565kK.STORY, mediaGenAIDetectionMethod, userSession7, pjw, moduleName, str);
                        } else if (MSY.A1U(resources, charSequence, 2131952641)) {
                            C55909Os0.A08(interfaceC11380iw, c55909Os0);
                        }
                        A0r.A0B(null, hc6);
                        A0r.A04();
                    }
                } else {
                    interfaceC57980PnQ.Dkl(c41181vS);
                }
            } else {
                C55165OdT.A01(c55909Os0.A04, c55909Os0.A01, c55909Os0.A07, c55909Os0.A08, c55909Os0.A0B, c41181vS);
            }
            c55909Os0.A01 = null;
            C55909Os0.A0I(c55909Os0, AbstractC167017dG.A0n(charSequence, "", AbstractC166987dD.A1C()));
            C0f9.A0C(-1177719495, A05);
        }
        DialogInterfaceOnCancelListenerC55251OfP.A00(A0H, c145256gk, i2);
        AbstractC166987dD.A1W(A0H);
        c55909Os0.A01 = null;
        C55909Os0.A0I(c55909Os0, AbstractC167017dG.A0n(charSequence, "", AbstractC166987dD.A1C()));
        C0f9.A0C(-1177719495, A05);
    }
}
