package X;

import android.app.Activity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengePromptShareInfo;
import com.instagram.direct.fragment.prompts.dailyprompt.model.DailyPromptsShareInfo;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* loaded from: classes6.dex */
public final class G4F implements InterfaceC165097Zy {
    public final Activity A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final LEK A03;
    public final C7XS A04;
    public final InterfaceC163877Vb A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC09390do A08;
    public final InterfaceC08830cm A09;

    public G4F(Activity activity, AbstractC59962oe abstractC59962oe, UserSession userSession, LEK lek, C7XS c7xs, InterfaceC163877Vb interfaceC163877Vb, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        C14360o3.A0B(abstractC59962oe, 2);
        AbstractC25234BEr.A0k(4, interfaceC08830cm, lek, interfaceC08830cm2, interfaceC08830cm3);
        AbstractC167007dF.A1J(c7xs, 8, interfaceC163877Vb);
        this.A00 = activity;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A06 = interfaceC08830cm;
        this.A03 = lek;
        this.A09 = interfaceC08830cm2;
        this.A07 = interfaceC08830cm3;
        this.A04 = c7xs;
        this.A05 = interfaceC163877Vb;
        this.A08 = C37059GUt.A00(this, 19);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0284, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ec, code lost:
    
        if (r14 == null) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC165097Zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AWb(X.C2EY r26, com.instagram.model.direct.messageid.DirectMessageIdentifier r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4F.AWb(X.2EY, com.instagram.model.direct.messageid.DirectMessageIdentifier, int, boolean):void");
    }

    @Override // X.InterfaceC165097Zy
    public final void Ehz(MessageIdentifier messageIdentifier) {
        C910143t c910143t;
        C2EY c2ey;
        C910143t c910143t2;
        String str;
        C3o9 c3o9 = (C3o9) this.A07.get();
        LEK lek = this.A03;
        UserSession userSession = this.A02;
        C83403nh A00 = LEK.A00(lek, messageIdentifier.A01, "DirectThreadFragment.forwardMessage", true);
        if (A00 != null) {
            ImmutableList A0H = A00.A0H();
            int i = 0;
            if (A0H != null) {
                c910143t = (C910143t) AbstractC001800i.A0O(A0H, 0);
            } else {
                c910143t = null;
            }
            if (c910143t != null) {
                String str2 = c910143t.A0w;
                if (str2 != null) {
                    String queryParameter = AbstractC08820cl.A03(str2).getQueryParameter("collection_type");
                    if (queryParameter != null) {
                        if (queryParameter.equals("challenges")) {
                            c2ey = C2EY.A0R;
                        } else if (!queryParameter.equals("daily_prompt")) {
                            return;
                        } else {
                            c2ey = C2EY.A0f;
                        }
                        Long l = c910143t.A0o;
                        ImmutableList A0H2 = A00.A0H();
                        if (A0H2 != null && (c910143t2 = (C910143t) AbstractC001800i.A0O(A0H2, 0)) != null && (str = c910143t2.A1Q) != null) {
                            String str3 = A00.A1u;
                            C14360o3.A07(str3);
                            C34726FRp A07 = C28531Zo.A04.A02.A07(AbstractC31171DnF.A0D("direct_thread"), userSession, c2ey);
                            InterfaceC163837Ux A0X = AbstractC31176DnK.A0X(this.A06);
                            C142846ck A002 = AbstractC147806l5.A00(userSession);
                            String A15 = AbstractC31172DnG.A15(c3o9);
                            C14360o3.A0A(c3o9);
                            A002.A0U(A15, JRE.A08(c3o9), A00.A0h(), A00.A0g(), C160857It.A00(A0X.Bj4(), userSession.userId, 29), A0X.C7W().A01);
                            String A152 = AbstractC31172DnG.A15(c3o9);
                            if (A152 != null) {
                                C81543kP Bj4 = A0X.Bj4();
                                if (Bj4 != null) {
                                    i = Bj4.A00;
                                }
                                String A003 = C160857It.A00(Bj4, userSession.userId, 29);
                                if (c2ey == C2EY.A0R) {
                                    A07.A07.putParcelable("DirectShareSheetConstants.channel_challenge", new ChannelChallengePromptShareInfo(Integer.valueOf(i), A152, JRE.A08(c3o9), String.valueOf(l), str, str3, A00.A0h(), A00.A0g(), A003, null, "channel_challenge_share_xma"));
                                    C36298Fzs A004 = AbstractC34063F1q.A00(userSession);
                                    String A08 = JRE.A08(c3o9);
                                    Integer valueOf = Integer.valueOf(A0X.AdZ());
                                    String valueOf2 = String.valueOf(l);
                                    C14360o3.A0B(valueOf2, 3);
                                    C36298Fzs.A03(null, A004, valueOf, A152, A08, AbstractC111324zv.A00(793), "tap", "challenge_pill", "thread_view", C36298Fzs.A02(valueOf2, A003, null, "share_challenge"));
                                } else if (c2ey == C2EY.A0f) {
                                    AbstractC34062F1p.A00(userSession).A04(A152, JRE.A08(c3o9), A003, String.valueOf(l), A00.A0h(), A00.A0g(), "channel_daily_prompt_xma", i, !c910143t.A05());
                                    A07.A07.putParcelable("DirectShareSheetConstants.daily_prompt", new DailyPromptsShareInfo(AbstractC31172DnG.A0s(c910143t.A05()), Integer.valueOf(i), A152, JRE.A08(c3o9), String.valueOf(l), A00.A0h(), A00.A0g(), A003, "channel_daily_prompt_xma"));
                                }
                                C3DN A005 = C3DN.A00.A00(this.A00);
                                if (A005 != null) {
                                    A005.A0K(A07.A00());
                                    return;
                                }
                                return;
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(AbstractC59962oe abstractC59962oe, G4F g4f) {
        C3DN A0r;
        GXV gxv;
        Activity activity = g4f.A00;
        if (((activity instanceof GXV) && (gxv = (GXV) activity) != null && (A0r = gxv.Ahc()) != null) || (A0r = AbstractC31172DnG.A0r(activity)) != null) {
            ((C3DP) A0r).A0H = new GH6(g4f, 3);
            A0r.A0K(abstractC59962oe);
            g4f.A04.D0E();
        }
        C23031Ai A00 = AbstractC23021Ah.A00(g4f.A02);
        C14360o3.A0B(A00, 0);
        AbstractC167007dF.A17(AbstractC166987dD.A0w(A00), "direct_forwarding_has_forwarded");
    }

    public static final void A01(G4F g4f, C83403nh c83403nh, InterfaceC163837Ux interfaceC163837Ux, InterfaceC83733oI interfaceC83733oI, Integer num, String str) {
        Integer num2;
        C19270xB A0D;
        Integer num3;
        String str2;
        String str3;
        String str4;
        InterfaceC08830cm interfaceC08830cm;
        InterfaceC08830cm interfaceC08830cm2;
        g4f.A05.CMc();
        C64842wi c64842wi = ((C685336q) g4f.A08.getValue()).A01;
        EnumSet of = EnumSet.of(Trigger.A0t);
        C14360o3.A07(of);
        c64842wi.AVr(of);
        int A00 = AbstractC31172DnG.A00(interfaceC163837Ux);
        Activity activity = g4f.A00;
        UserSession userSession = g4f.A02;
        if (A00 == 29) {
            InterfaceC08830cm interfaceC08830cm3 = g4f.A06;
            InterfaceC08830cm interfaceC08830cm4 = g4f.A09;
            str2 = c83403nh.A0g();
            str3 = JRE.A08((C3o9) AbstractC31172DnG.A0y(g4f.A07));
            num2 = Integer.valueOf(AbstractC31172DnG.A00(interfaceC163837Ux));
            num3 = Integer.valueOf(interfaceC163837Ux.C7W().A01);
            str4 = C160857It.A00(interfaceC163837Ux.Bj4(), userSession.userId, 29);
            A0D = AbstractC31171DnF.A0D("direct_thread");
            interfaceC08830cm = interfaceC08830cm3;
            interfaceC08830cm2 = interfaceC08830cm4;
        } else {
            InterfaceC08830cm interfaceC08830cm5 = g4f.A06;
            InterfaceC08830cm interfaceC08830cm6 = g4f.A09;
            num2 = null;
            A0D = AbstractC31171DnF.A0D("direct_thread");
            num3 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            interfaceC08830cm = interfaceC08830cm5;
            interfaceC08830cm2 = interfaceC08830cm6;
        }
        A00(AbstractC34113F3p.A00(activity, A0D, userSession, c83403nh, interfaceC83733oI, num, num2, num3, str, str2, str3, str4, interfaceC08830cm, interfaceC08830cm2), g4f);
    }
}
