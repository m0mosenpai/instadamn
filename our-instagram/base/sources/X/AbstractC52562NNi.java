package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NNi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52562NNi extends N4B implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenMultiStepFormBaseFragment";
    public ViewPager2 A00;
    public IgdsPeopleCell A01;
    public N43 A02;
    public C51116MiL A03;
    public LeadGenFormStaticHeaderView A04;
    public boolean A05;
    public IgdsStepperHeader A06;
    public AnonymousClass195 A07;
    public AnonymousClass195 A08;

    public static final void A03(AbstractC52562NNi abstractC52562NNi, List list) {
        Object obj;
        List list2;
        String str;
        AbstractC50967Mfa abstractC50967Mfa = (AbstractC50967Mfa) ((C52573NNt) abstractC52562NNi).A02.getValue();
        if (abstractC50967Mfa != null) {
            abstractC50967Mfa.A00(MSW.A0d(abstractC52562NNi).A01(), list, MSW.A0d(abstractC52562NNi).A0V);
        }
        List A01 = MSW.A0d(abstractC52562NNi).A01();
        ArrayList<LeadGenFormBaseQuestion> A1E = AbstractC166987dD.A1E();
        for (Object obj2 : A01) {
            VEF vef = ((LeadGenFormBaseQuestion) obj2).A03;
            if (vef == VEF.A0Z || vef == VEF.A0P) {
                A1E.add(obj2);
            }
        }
        for (LeadGenFormBaseQuestion leadGenFormBaseQuestion : A1E) {
            OV6 ov6 = OV6.A00;
            Context context = abstractC52562NNi.getContext();
            Iterator it = AbstractC31172DnG.A0w(MSW.A0d(abstractC52562NNi).A0a).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C51654Mrl) obj).A03 == EnumC53189Nfl.A03) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C51654Mrl c51654Mrl = (C51654Mrl) obj;
            if (c51654Mrl == null || (list2 = c51654Mrl.A08) == null) {
                list2 = C16930sl.A00;
            }
            boolean A00 = ov6.A00(context, leadGenFormBaseQuestion, list2, false, true);
            String A06 = C55205OeH.A00.A06(leadGenFormBaseQuestion);
            if (A06 != null) {
                C54976OTi A02 = AbstractC51040Mgq.A02(abstractC52562NNi);
                String A002 = A00(abstractC52562NNi);
                if (A00) {
                    str = "success";
                } else {
                    str = RealtimeConstants.SEND_FAIL;
                }
                A02.A00.Ci4(C54976OTi.A00(A02, A002, A06), A02.A01, "lead_gen_multi_step_consumer_questions", "pii_validation_result", str);
            }
        }
    }

    public final void A07(String str) {
        C52573NNt c52573NNt = (C52573NNt) this;
        Activity A04 = AbstractC31172DnG.A04(c52573NNt);
        InterfaceC09390do interfaceC09390do = c52573NNt.A04;
        UserSession userSession = MSW.A0e(interfaceC09390do).A0H;
        String str2 = MSW.A0e(interfaceC09390do).A0W;
        Bundle requireArguments = c52573NNt.requireArguments();
        C14360o3.A0B(A04, 0);
        AbstractC167017dG.A1P(userSession, str2);
        C55046OZv.A00(requireArguments, userSession, c52573NNt, str2, str);
        if (str != null) {
            C63397SjR c63397SjR = new C63397SjR(A04, userSession, C2Fb.A2D, AbstractC08820cl.A03(str).toString(), false);
            c63397SjR.A0S = c52573NNt.getModuleName();
            c63397SjR.A0A();
        }
    }

    public final void A08(boolean z) {
        C52573NNt c52573NNt = (C52573NNt) this;
        InterfaceC09390do interfaceC09390do = c52573NNt.A04;
        if (MSW.A0e(interfaceC09390do).A0g) {
            if (AbstractC50523MSb.A01(c52573NNt) != 0 && !z) {
                AbstractC25226BEj.A1P(c52573NNt);
                return;
            }
            UserSession userSession = MSW.A0e(interfaceC09390do).A0H;
            Activity A04 = AbstractC31172DnG.A04(c52573NNt);
            AbstractC167017dG.A1N(userSession, A04);
            C55772hI.A00(userSession).A09(A04, null);
            A04.finish();
            return;
        }
        C55137Oc5 c55137Oc5 = C55137Oc5.A00;
        if (z) {
            C55137Oc5.A01(c52573NNt.requireActivity(), MSW.A0e(interfaceC09390do).A0H, ((AbstractC52562NNi) c52573NNt).A02, MSW.A0e(interfaceC09390do).A0f);
            return;
        }
        c55137Oc5.A03(c52573NNt, MSW.A0e(interfaceC09390do).A0H, MSW.A0e(interfaceC09390do).A0f, MSW.A0e(interfaceC09390do).A09);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle("");
        AbstractC50523MSb.A1E(interfaceC56362iU);
        C55089Oav A00 = C55089Oav.A00(this, interfaceC56362iU);
        String A0v = AbstractC25227BEk.A0v(this, 2131956237);
        ViewOnClickListenerC55461OkG viewOnClickListenerC55461OkG = new ViewOnClickListenerC55461OkG(this, 28);
        InterfaceC56362iU interfaceC56362iU2 = A00.A01;
        interfaceC56362iU2.Ect(A0v, viewOnClickListenerC55461OkG);
        interfaceC56362iU2.ARk(0, false);
        interfaceC56362iU2.ARk(0, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC52562NNi.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final String A00(AbstractC52562NNi abstractC52562NNi) {
        ViewPager2 viewPager2 = abstractC52562NNi.A00;
        if (viewPager2 != null) {
            return MSW.A0d(abstractC52562NNi).A00(viewPager2.A00);
        }
        return "Unknown";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (X.MSW.A0d(r3).A05 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.AbstractC52562NNi r3, int r4, boolean r5) {
        /*
            X.MiL r0 = r3.A03
            if (r0 == 0) goto L3f
            int r1 = r0.getItemCount()
        L8:
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r2 = r3.A06
            if (r2 == 0) goto L1d
            r0 = 1
            if (r1 <= r0) goto L18
            X.NOW r0 = X.MSW.A0d(r3)
            boolean r1 = r0.A05
            r0 = 0
            if (r1 == 0) goto L1a
        L18:
            r0 = 8
        L1a:
            r2.setVisibility(r0)
        L1d:
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r2 = r3.A06
            if (r2 == 0) goto L35
            X.NOW r0 = X.MSW.A0d(r3)
            X.05A r0 = r0.A0a
            java.util.List r0 = X.MSW.A1A(r0)
            if (r0 == 0) goto L3d
            int r1 = r0.size()
        L31:
            r0 = 1
            r2.A03(r4, r1, r0, r5)
        L35:
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r0 = r3.A06
            if (r0 == 0) goto L3c
            r0.A01()
        L3c:
            return
        L3d:
            r1 = 0
            goto L31
        L3f:
            r1 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC52562NNi.A01(X.NNi, int, boolean):void");
    }

    public final void A09(boolean z) {
        OH5 oh5;
        Integer num;
        C26086BgF c26086BgF;
        InterfaceC58268PsC interfaceC58268PsC;
        String str;
        Bundle A00;
        String str2;
        String str3;
        Integer num2;
        AbstractC13880nE.A0O(AbstractC50522MSa.A0J(this));
        NOW A0d = MSW.A0d(this);
        C14360o3.A0B(A0d, 0);
        if (A0d.A06) {
            oh5 = new OH5(A0d);
        } else if (A0d.A08) {
            oh5 = new OH5(A0d);
        } else {
            A08(z);
            return;
        }
        FragmentActivity requireActivity = requireActivity();
        String A002 = A00(this);
        O3U o3u = new O3U(this);
        boolean z2 = oh5 instanceof C52558NNe;
        NOW now = oh5.A00;
        boolean z3 = now.A0f;
        if (z2) {
            if (z3) {
                num2 = C05F.A01;
            } else {
                num2 = C05F.A0C;
            }
            int i = 2131964895;
            int i2 = 2131964893;
            if (now.A06()) {
                i = 2131964896;
                i2 = 2131964894;
            }
            C38687GzS c38687GzS = new C38687GzS(AbstractC166997dE.A0p(requireActivity, i2), new C57259Pbh(A002, oh5, 3));
            C38687GzS c38687GzS2 = new C38687GzS(AbstractC166997dE.A0p(requireActivity, 2131964892), new C57262Pbk(o3u, oh5, A002, 22));
            String string = requireActivity.getString(2131964897);
            String str4 = now.A03;
            if (str4 == null) {
                str4 = "";
            }
            String A0f = AbstractC167007dF.A0f(requireActivity, str4, i);
            C38687GzS c38687GzS3 = c38687GzS2;
            if (num2 == C05F.A0C) {
                c38687GzS3 = c38687GzS;
                c38687GzS = c38687GzS2;
            }
            c26086BgF = new C26086BgF(c38687GzS3, c38687GzS, num2, string, A0f);
        } else {
            if (!z3 && !now.A09) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
            boolean A06 = now.A06();
            int i3 = 2131964890;
            if (A06) {
                i3 = 2131964891;
            }
            C38687GzS c38687GzS4 = new C38687GzS(AbstractC166997dE.A0p(requireActivity, 2131964892), new C57264Pbm(oh5, o3u, A002, 0, A1X));
            int i4 = 2131964893;
            if (A06) {
                i4 = 2131964894;
            }
            c26086BgF = new C26086BgF(c38687GzS4, new C38687GzS(AbstractC166997dE.A0p(requireActivity, i4), new D8R(oh5, A002, 5, A1X)), num, requireActivity.getString(i3));
        }
        int A0H = AbstractC166987dD.A0H(c26086BgF.A00);
        if (A0H != 2) {
            if (A0H != 1) {
                if (A0H == 0) {
                    String str5 = c26086BgF.A03;
                    String str6 = c26086BgF.A04;
                    if (str5 != null) {
                        str6 = AbstractC43592JPx.A10(str6, str5);
                    }
                    C15370ps A1F = AbstractC25225BEi.A1F();
                    C50674MYs c50674MYs = new C50674MYs(requireActivity, now.A0H);
                    c50674MYs.A07(str6);
                    C38687GzS c38687GzS5 = (C38687GzS) c26086BgF.A01;
                    if (c38687GzS5 != null) {
                        c50674MYs.A0B(c38687GzS5.A01, ViewOnClickListenerC55465OkK.A00(A1F, c26086BgF, 42));
                    }
                    C38687GzS c38687GzS6 = (C38687GzS) c26086BgF.A02;
                    if (c38687GzS6 != null) {
                        c50674MYs.A0B(c38687GzS6.A01, ViewOnClickListenerC55465OkK.A00(A1F, c26086BgF, 43));
                    }
                    C31727DwY c31727DwY = new C31727DwY(c50674MYs);
                    A1F.A00 = c31727DwY;
                    c31727DwY.A05(requireActivity);
                } else {
                    throw B4Z.A00();
                }
            } else {
                String str7 = c26086BgF.A03;
                String str8 = c26086BgF.A04;
                if (str7 != null) {
                    str8 = AbstractC43592JPx.A10(str8, str7);
                }
                C193328hC A0H2 = AbstractC31171DnF.A0H(requireActivity);
                A0H2.A05 = str8;
                C38687GzS c38687GzS7 = (C38687GzS) c26086BgF.A01;
                if (c38687GzS7 != null) {
                    A0H2.A0e(DialogInterfaceOnClickListenerC55320Ogi.A00(c26086BgF, 8), c38687GzS7.A01);
                }
                C38687GzS c38687GzS8 = (C38687GzS) c26086BgF.A02;
                if (c38687GzS8 != null) {
                    A0H2.A0b(DialogInterfaceOnClickListenerC55320Ogi.A00(c26086BgF, 9), c38687GzS8.A01);
                }
                AbstractC166987dD.A1W(A0H2);
            }
        } else {
            UserSession userSession = now.A0H;
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            C38687GzS c38687GzS9 = (C38687GzS) c26086BgF.A01;
            if (c38687GzS9 != null) {
                A0y.A0g = c38687GzS9.A01;
                A0y.A1J = true;
                A0y.A0K = ViewOnClickListenerC55465OkK.A00(requireActivity, c26086BgF, 44);
            }
            C38687GzS c38687GzS10 = (C38687GzS) c26086BgF.A02;
            if (c38687GzS10 != null) {
                A0y.A0h = c38687GzS10.A01;
                A0y.A1N = true;
                A0y.A0L = ViewOnClickListenerC55465OkK.A00(requireActivity, c26086BgF, 45);
            }
            A0y.A0U = new C36730GGz(c26086BgF, oh5, A002, 2);
            C189478aR A003 = A0y.A00();
            String str9 = c26086BgF.A04;
            String str10 = c26086BgF.A03;
            N4A n4a = new N4A();
            AbstractC25227BEk.A1C(n4a, AbstractC167007dF.A1b("confirmation_description", str10, MSY.A0n(userSession), AbstractC166987dD.A1L("confirmation_title", str9)));
            A003.A02(requireActivity, n4a);
        }
        Integer num3 = (Integer) c26086BgF.A00;
        if (z2) {
            C14360o3.A0B(num3, 0);
            if (num3 == C05F.A0C) {
                C54975OTh c54975OTh = now.A0L;
                InterfaceC58268PsC.A01(C54975OTh.A00(c54975OTh, A002), c54975OTh.A00, c54975OTh.A01, "lead_gen_gated_content_confirmation_bottom_sheet", "bottom_sheet_impression");
                return;
            }
            return;
        }
        C14360o3.A0B(num3, 0);
        int intValue = num3.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return;
            }
            C54976OTi c54976OTi = now.A0M;
            interfaceC58268PsC = c54976OTi.A00;
            str = c54976OTi.A01;
            A00 = C54976OTi.A00(c54976OTi, A002, null);
            str2 = "lead_gen_multi_step_consumer_questions";
            str3 = "discard_confirmation_pop_up_dialog_impression";
        } else {
            C54976OTi c54976OTi2 = now.A0M;
            interfaceC58268PsC = c54976OTi2.A00;
            str = c54976OTi2.A01;
            A00 = C54976OTi.A00(c54976OTi2, A002, null);
            str2 = "lead_gen_multi_step_consumer_questions";
            str3 = "discard_confirmation_dialog_impression";
        }
        InterfaceC58268PsC.A01(A00, interfaceC58268PsC, str, str2, str3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 == null) {
            return false;
        }
        if (viewPager2.A00 > MSW.A0d(this).A07) {
            AbstractC51040Mgq A05 = A05();
            C57155PYz.A00(A05, AbstractC141776au.A00(A05), viewPager2.A00, 25);
            return true;
        }
        C54976OTi A02 = AbstractC51040Mgq.A02(this);
        String A00 = A00(this);
        InterfaceC58268PsC.A00(C54976OTi.A00(A02, A00, null), A02.A00, A02.A01, "lead_gen_multi_step_consumer_questions", "cancel");
        A09(false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r1 == X.C05F.A00) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.AbstractC52562NNi r4, com.instagram.leadgen.core.model.LeadGenProfileContentInfo r5) {
        /*
            java.lang.String r1 = A00(r4)
            com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView r3 = r4.A04
            if (r3 == 0) goto L2d
            r2 = 0
            if (r5 == 0) goto L2e
            X.Nfl r0 = X.EnumC53189Nfl.A05
            boolean r0 = X.AbstractC31174DnI.A1a(r0, r1)
            if (r0 != 0) goto L2e
            X.Nfl r0 = X.EnumC53189Nfl.A06
            boolean r0 = X.AbstractC31174DnI.A1a(r0, r1)
            if (r0 != 0) goto L2e
            r4.A05()
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r0 = r5.A01
            if (r0 == 0) goto L2e
            java.lang.Integer r1 = r0.A04
            if (r1 == 0) goto L2e
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L2e
        L2a:
            r3.setVisibility(r2)
        L2d:
            return
        L2e:
            r2 = 8
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC52562NNi.A02(X.NNi, com.instagram.leadgen.core.model.LeadGenProfileContentInfo):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return MSW.A0d(this).A0H;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1330719214);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_multi_step_form, viewGroup, false);
        C0f9.A09(419109169, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(92514587);
        super.onDestroyView();
        this.A06 = null;
        this.A01 = null;
        this.A04 = null;
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            viewPager2.setAdapter(null);
        }
        this.A03 = null;
        this.A00 = null;
        C0f9.A09(1122628441, A02);
    }

    @Override // X.N4B, androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1694801973);
        super.onStart();
        AbstractC50967Mfa abstractC50967Mfa = (AbstractC50967Mfa) ((C52573NNt) this).A02.getValue();
        AnonymousClass195 anonymousClass195 = null;
        if (abstractC50967Mfa != null) {
            anonymousClass195 = PZH.A01(this, abstractC50967Mfa.A01, 31);
        }
        this.A08 = anonymousClass195;
        this.A07 = PZH.A01(this, MSW.A0d(this).A0Y, 32);
        C0f9.A09(1206710616, A02);
    }

    @Override // X.N4B, androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1196813727);
        super.onStop();
        AnonymousClass195 anonymousClass195 = this.A08;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A08 = null;
        AnonymousClass195 anonymousClass1952 = this.A07;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A07 = null;
        C0f9.A09(1210327010, A02);
    }
}
