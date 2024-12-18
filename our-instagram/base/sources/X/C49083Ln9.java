package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Arrays;

/* renamed from: X.Ln9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49083Ln9 implements InterfaceC165777b4 {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final FPB A03;
    public final C7XS A04;
    public final InterfaceC08830cm A05;
    public final InterfaceC09390do A06;
    public final LEK A07;
    public final InterfaceC163877Vb A08;
    public final InterfaceC08830cm A09;

    public C49083Ln9(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, FPB fpb, LEK lek, C7XS c7xs, InterfaceC163877Vb interfaceC163877Vb, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        C14360o3.A0B(interfaceC08830cm, 3);
        AbstractC25234BEr.A0k(4, interfaceC08830cm2, interfaceC11380iw, fpb, lek);
        AbstractC167007dF.A1J(interfaceC163877Vb, 8, c7xs);
        this.A02 = userSession;
        this.A00 = activity;
        this.A05 = interfaceC08830cm;
        this.A09 = interfaceC08830cm2;
        this.A01 = interfaceC11380iw;
        this.A03 = fpb;
        this.A07 = lek;
        this.A08 = interfaceC163877Vb;
        this.A04 = c7xs;
        this.A06 = C37059GUt.A01(this, 30);
    }

    @Override // X.InterfaceC165777b4
    public final void EHs(MessageIdentifier messageIdentifier) {
        String str;
        C26084BgD c26084BgD;
        this.A08.CMc();
        C3o9 c3o9 = (C3o9) this.A09.get();
        if (c3o9 instanceof MsysThreadId) {
            MsysThreadId msysThreadId = (MsysThreadId) c3o9;
            InterfaceC08830cm interfaceC08830cm = this.A05;
            Object obj = interfaceC08830cm.get();
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.msys.MsysClientInfra");
            String str2 = messageIdentifier.A01;
            C160787Im Bko = ((C48712Lgg) obj).Bko(str2);
            if (Bko == null) {
                String BtL = AbstractC43593JPy.A0Z(interfaceC08830cm).BtL(messageIdentifier);
                Object obj2 = interfaceC08830cm.get();
                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.msys.MsysClientInfra");
                InterfaceC66482zP A01 = ((C48712Lgg) obj2).A00.A01(messageIdentifier);
                boolean z = false;
                if (A01 instanceof InterfaceC162797Qq) {
                    InterfaceC129555tK ArC = ((InterfaceC162797Qq) A01).ArC();
                    if ((ArC instanceof AnonymousClass781) && (c26084BgD = ((AnonymousClass781) ArC).A02.A01) != null && ((InterfaceC50520MRx) c26084BgD.A03).B0J(c26084BgD.A01) > 0) {
                        z = true;
                    }
                }
                if (BtL != null) {
                    Activity activity = this.A00;
                    UserSession userSession = this.A02;
                    C14360o3.A0B(msysThreadId, 0);
                    LL1.A02(activity, this.A01, userSession, (C47373KwO) this.A06.getValue(), str2, BtL, String.valueOf(msysThreadId.A00), AbstractC31176DnK.A0X(interfaceC08830cm).CX1(), true, z);
                    return;
                }
                return;
            }
            C83403nh c83403nh = Bko.A0e;
            String A0h = c83403nh.A0h();
            String str3 = c83403nh.A1u;
            C14360o3.A07(str3);
            InterfaceC83733oI interfaceC83733oI = Bko.A0G.A0P;
            if (interfaceC83733oI != null) {
                str = AbstractC31171DnF.A0c(interfaceC83733oI);
            } else {
                str = null;
            }
            if (A0h != null && str != null) {
                LL1.A02(this.A00, this.A01, this.A02, (C47373KwO) this.A06.getValue(), A0h, str3, str, Bko.A0G.A0y, false, false);
                return;
            } else {
                this.A03.A00(AnonymousClass001.A0R("DirectThreadFragment.reportMessage", ": null_direct_threadkey"));
                C0w9.A04("ThreadKey is null", "DirectThreadFragment.reportMessage", 1);
                return;
            }
        }
        C14360o3.A0A(c3o9);
        InterfaceC163837Ux A0X = AbstractC31176DnK.A0X(this.A05);
        C7TT C7W = A0X.C7W();
        Integer BuZ = A0X.BuZ();
        if (BuZ == null || BuZ.intValue() != 4) {
            UserSession userSession2 = this.A02;
            C14360o3.A0A(C7W);
            if (!C6X6.A0B(userSession2, C7W, c3o9 instanceof DirectThreadKey) && !C161857Mv.A02.A03(userSession2, C7W.A0G)) {
                A00(this, messageIdentifier);
                return;
            }
        }
        DirectThreadKey A012 = JRE.A01(c3o9);
        UserSession userSession3 = this.A02;
        String str4 = A012.A00;
        if (str4 != null) {
            String str5 = messageIdentifier.A01;
            C50364MLq c50364MLq = new C50364MLq(17, messageIdentifier, A012, this);
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            A00.ATO(new KMM(userSession3, str4, str5, c50364MLq));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(C49083Ln9 c49083Ln9, MessageIdentifier messageIdentifier) {
        InterfaceC08830cm interfaceC08830cm = c49083Ln9.A05;
        if (AbstractC31176DnK.A0X(interfaceC08830cm).AlV().A00(EnumC2054697t.A0i)) {
            LEK lek = c49083Ln9.A07;
            UserSession userSession = c49083Ln9.A02;
            C83403nh A00 = LEK.A00(lek, messageIdentifier.A01, "DirectThreadFragment.reportMessage", true);
            if (A00 != null) {
                DirectMessageIdentifier directMessageIdentifier = A00.A13;
                if (directMessageIdentifier == null || (A00 = LEK.A00(lek, ((MessageIdentifier) directMessageIdentifier).A01, "DirectThreadFragment.reportMessage", true)) != null) {
                    String A0h = A00.A0h();
                    InterfaceC163837Ux A0X = AbstractC31176DnK.A0X(interfaceC08830cm);
                    if (A0h != null && A00.A1u != null && A0X.CeQ()) {
                        LL1.A02(c49083Ln9.A00, c49083Ln9.A01, userSession, (C47373KwO) c49083Ln9.A06.getValue(), A0h, A00.A1u, A0X.C7I(), A0X.CX1(), false, AbstractC167007dF.A1O(A00.A01));
                        if (AbstractC31172DnG.A00(A0X) == 29) {
                            C142846ck A002 = AbstractC147806l5.A00(userSession);
                            String C7I = A0X.C7I();
                            String C7q = A0X.C7q();
                            C25531Mh A0I = AbstractC31172DnG.A0I(A002);
                            if (AbstractC25226BEj.A1Z(A0I)) {
                                AbstractC31175DnJ.A1B(A0I, A002);
                                AbstractC31174DnI.A1I(A0I, "user_initiate_message_report");
                                AbstractC43593JPy.A1N(A0I, "message_options");
                                A0I.A0h(AbstractC31179DnN.A0Z(A0I, "instagram", C7I, C7q));
                                AbstractC31178DnM.A1G(A0I, "mid", A0h);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    c49083Ln9.A03.A00(AnonymousClass001.A0R("DirectThreadFragment.reportMessage", ": null_direct_threadkey"));
                    C0w9.A04("ThreadKey is null", "DirectThreadFragment.reportMessage", 1);
                    return;
                }
                return;
            }
            return;
        }
        C0w9.A03("pseudo_capability_disabled", AbstractC166997dE.A0z("Capability id: %s(%d)", Arrays.copyOf(AbstractC25228BEl.A1Z("PSEUDO_REPORT_MESSAGE", -17), 2)));
    }
}
