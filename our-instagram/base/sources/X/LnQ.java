package X;

import android.app.Activity;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class LnQ implements InterfaceC164997Zo {
    public final Activity A00;
    public final UserSession A01;
    public final FPB A02;
    public final LEK A03;
    public final InterfaceC165087Zx A04;
    public final C48514LdB A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC11380iw A08;
    public final InterfaceC08830cm A09;

    public LnQ(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, FPB fpb, LEK lek, InterfaceC165087Zx interfaceC165087Zx, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        AbstractC25233BEq.A0x(3, interfaceC08830cm, interfaceC08830cm2, interfaceC11380iw);
        AbstractC25233BEq.A0y(6, fpb, lek, interfaceC165087Zx);
        this.A01 = userSession;
        this.A00 = activity;
        this.A06 = interfaceC08830cm;
        this.A07 = interfaceC08830cm2;
        this.A08 = interfaceC11380iw;
        this.A02 = fpb;
        this.A09 = interfaceC08830cm3;
        this.A03 = lek;
        this.A04 = interfaceC165087Zx;
        this.A05 = (C48514LdB) userSession.A01(C48514LdB.class, new C50164MDr(userSession, 20));
    }

    public static final void A00(View view, InterfaceC129525tH interfaceC129525tH, LnQ lnQ, AbstractC46511KiA abstractC46511KiA, C3o9 c3o9, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16600sD interfaceC16600sD, boolean z) {
        C38321qM c38321qM;
        List Bs0;
        C7TH Bt9 = ((C7U0) lnQ.A06.get()).Bt9();
        boolean z2 = abstractC46511KiA instanceof KWh;
        if (z2) {
            C83403nh c83403nh = ((KWh) abstractC46511KiA).A00;
            Integer num = c83403nh.A1F;
            if (C4GU.A01(num) || num == C05F.A0Y) {
                Bt9.AGT(lnQ.A08, c83403nh, JRE.A01(c3o9));
                return;
            }
        }
        if ((z2 && (c38321qM = ((KWh) abstractC46511KiA).A00.A0s) != null && (Bs0 = c38321qM.A0C.Bs0()) != null && AbstractC166987dD.A1b(Bs0) && !z) || AbstractC166987dD.A1a(interfaceC16600sD.invoke(c3o9, abstractC46511KiA, view, interfaceC129525tH))) {
            return;
        }
        AbstractRunnableC133325zz.A02(new C44289Jhf(new C43752JWo(11, lnQ, interfaceC16620sF, interfaceC16820sZ, c3o9, abstractC46511KiA, interfaceC16660sJ), 5), Bt9.F9r(abstractC46511KiA, c3o9, null), C1M8.A01);
    }

    @Override // X.InterfaceC164997Zo
    public final void AAx(MessageIdentifier messageIdentifier, long j) {
        C83403nh A00;
        if (C18U.A06(C06090Tz.A05, this.A01, 36315859748130448L)) {
            C48514LdB c48514LdB = this.A05;
            String str = messageIdentifier.A01;
            C48514LdB.A00(c48514LdB, "remove_message_initiation", "tap", "message_options_dialog", str, AbstractC167007dF.A0n("message_id", str));
            C3o9 c3o9 = (C3o9) this.A07.get();
            if ((c3o9 instanceof DirectThreadKey) && (A00 = LEK.A00(this.A03, str, null, true)) != null) {
                C14360o3.A0A(c3o9);
                KWh kWh = new KWh(A00, c3o9);
                ((AbstractC46511KiA) kWh).A00 = ((C7IP) this.A09.get()).A00();
                A00(null, null, this, kWh, c3o9, null, AbstractC43592JPx.A18(this, 25), new C43887Jau(this, 6), new MCZ(this, 0), false);
            }
        }
    }

    public static final void A01(LnQ lnQ, String str) {
        C23031Ai A00 = AbstractC23021Ah.A00(lnQ.A01);
        if (str != null) {
            AbstractC31177DnL.A1M(AbstractC166987dD.A0w(A00), AbstractC111324zv.A00(1357), str, true);
        }
        if (AbstractC31172DnG.A01(A00.A01, AbstractC111324zv.A00(1358)) < 2) {
            AbstractC167007dF.A1L(A00, A00.A7z, C23031Ai.A8c, 406, true);
        }
    }

    @Override // X.InterfaceC164997Zo
    public final void F9q(View view, InterfaceC129525tH interfaceC129525tH, MessageIdentifier messageIdentifier, InterfaceC16820sZ interfaceC16820sZ, long j) {
        C3o9 c3o9;
        String str = messageIdentifier.A01;
        InterfaceC08830cm interfaceC08830cm = this.A06;
        InterfaceC163837Ux A0X = AbstractC31176DnK.A0X(interfaceC08830cm);
        if (AbstractC31172DnG.A00(A0X) == 29) {
            C142846ck A00 = AbstractC147806l5.A00(this.A01);
            int AdZ = A0X.AdZ();
            String C7I = A0X.C7I();
            String C7q = A0X.C7q();
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("mid", str);
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1I(A0I, "unsend_message_attempt");
                A0I.A0o("message_options_dialog");
                AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0a(A0I, "thread_view", C7I, C7q, AdZ), A1G);
            }
        }
        AbstractC46511KiA E5u = ((C7U0) interfaceC08830cm.get()).E5u(str);
        if (E5u != null) {
            E5u.A00 = ((C7IP) this.A09.get()).A00();
            if (E5u instanceof KWh) {
                c3o9 = ((KWh) E5u).A01;
            } else {
                c3o9 = ((KWg) E5u).A01;
            }
            MCZ mcz = new MCZ(this, 3);
            A00(view, interfaceC129525tH, this, E5u, c3o9, interfaceC16820sZ, MKL.A00, new C25344BJn(this, 33), mcz, false);
        }
    }

    @Override // X.InterfaceC164997Zo
    public final void F9s(MessageIdentifier messageIdentifier) {
        int i;
        int i2;
        C910143t c910143t = null;
        C83403nh A00 = LEK.A00(this.A03, messageIdentifier.A01, null, true);
        if (A00 != null) {
            ImmutableList A0H = A00.A0H();
            if (A0H != null) {
                c910143t = (C910143t) AbstractC001800i.A0I(A0H);
            }
            if (c910143t != null) {
                String str = c910143t.A0w;
                if (str != null) {
                    String queryParameter = AbstractC08820cl.A03(str).getQueryParameter("collection_type");
                    if (queryParameter != null) {
                        Long l = c910143t.A0o;
                        if (queryParameter.equals("challenges")) {
                            i = 2131954988;
                            i2 = 2131954987;
                        } else {
                            if (!queryParameter.equals(AbstractC111324zv.A00(201))) {
                                return;
                            }
                            i = 2131959002;
                            i2 = 2131959001;
                        }
                        C193328hC A0H2 = AbstractC31171DnF.A0H(this.A00);
                        A0H2.A0A(i);
                        A0H2.A09(i2);
                        A0H2.A0L(new LMH(l, this, queryParameter, 3), 2131960774);
                        A0H2.A0D(DialogInterfaceOnClickListenerC48015LMk.A00);
                        AbstractC31178DnM.A1R(A0H2, true);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
