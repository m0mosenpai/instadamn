package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class LA7 {
    public final InterfaceC11380iw A00;
    public final C163947Vi A01;
    public final InterfaceC164947Zj A02;
    public final FragmentActivity A03;
    public final C42221xC A04;
    public final UserSession A05;
    public final L7K A06;
    public final C47920LEp A07;
    public final InterfaceC83713oG A08;

    public final C42221xC A00(EnumC46188KcQ enumC46188KcQ) {
        InterfaceC2056098k A04;
        C14360o3.A0B(enumC46188KcQ, 0);
        AbstractC46812Kn7 abstractC46812Kn7 = AbstractC46812Kn7.$redex_init_class;
        if (enumC46188KcQ.ordinal() == 1 && (A04 = AbstractC140946Yw.A04(this.A08)) != null && (A04 instanceof MsysThreadId)) {
            C47920LEp c47920LEp = this.A07;
            UserSession userSession = c47920LEp.A03;
            C44109JeZ.A00(C43597JQd.A01(((C47430KxL) AbstractC41851wZ.A00(userSession).A01(C47430KxL.class, new C50159MDm(userSession, 7))).A00.A01, new C50261MHq(A04, 41), 67).A0P(AbstractC142856cl.A00), c47920LEp.A02, A04, c47920LEp, 17);
            C42221xC A09 = C42221xC.A09(true);
            C14360o3.A0A(A09);
            return A09;
        }
        return C42221xC.A09(false);
    }

    public final C42221xC A01(EnumC46205Kch enumC46205Kch) {
        C14360o3.A0B(enumC46205Kch, 0);
        AbstractC46812Kn7 abstractC46812Kn7 = AbstractC46812Kn7.$redex_init_class;
        if (enumC46205Kch.ordinal() == 11) {
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(this.A05);
            String A00 = AbstractC111324zv.A00(1358);
            AbstractC167007dF.A18(A0x, A00, A0x.getInt(A00, 0) + 1);
            C42221xC A09 = C42221xC.A09(true);
            C14360o3.A0A(A09);
            return A09;
        }
        return C42221xC.A09(false);
    }

    public final C42221xC A02(EnumC46205Kch enumC46205Kch) {
        InterfaceC2056098k A04;
        MsysThreadId msysThreadId;
        C14360o3.A0B(enumC46205Kch, 0);
        AbstractC46812Kn7 abstractC46812Kn7 = AbstractC46812Kn7.$redex_init_class;
        if (enumC46205Kch.ordinal() == 9 && (A04 = AbstractC140946Yw.A04(this.A08)) != null && (A04 instanceof MsysThreadId) && (msysThreadId = (MsysThreadId) A04) != null) {
            C47920LEp c47920LEp = this.A07;
            JUk.A00(EnumC46292KeO.PROACTIVE_WARNING_BANNER_DISMISS, c47920LEp.A04);
            C47920LEp.A00(c47920LEp, msysThreadId);
            C42221xC A09 = C42221xC.A09(true);
            C14360o3.A0A(A09);
            return A09;
        }
        return C42221xC.A09(false);
    }

    public LA7(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C42221xC c42221xC, UserSession userSession, C163947Vi c163947Vi, InterfaceC164947Zj interfaceC164947Zj, L7K l7k, C47920LEp c47920LEp, InterfaceC83713oG interfaceC83713oG) {
        this.A02 = interfaceC164947Zj;
        this.A04 = c42221xC;
        this.A08 = interfaceC83713oG;
        this.A03 = fragmentActivity;
        this.A00 = interfaceC11380iw;
        this.A07 = c47920LEp;
        this.A05 = userSession;
        this.A01 = c163947Vi;
        this.A06 = l7k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    public final C42221xC A03(String str, InterfaceC16820sZ interfaceC16820sZ) {
        InterfaceC2056098k A04;
        MsysThreadId msysThreadId;
        InterfaceC2056098k A042;
        MsysThreadId msysThreadId2;
        C42221xC A02;
        Boolean A0a = AbstractC166997dE.A0a();
        if (str != null) {
            switch (str.hashCode()) {
                case -1282209724:
                    if (str.equals("proactive_warning_negative") && (A04 = AbstractC140946Yw.A04(this.A08)) != null && (A04 instanceof MsysThreadId) && (msysThreadId = (MsysThreadId) A04) != null) {
                        C47920LEp c47920LEp = this.A07;
                        JUk.A00(EnumC46292KeO.PROACTIVE_WARNING_BANNER_SECONDARY_ACTION, c47920LEp.A04);
                        C47920LEp.A00(c47920LEp, msysThreadId);
                        A02 = C42221xC.A09(true);
                        C14360o3.A0A(A02);
                        return A02;
                    }
                    break;
                case -291004589:
                    if (str.equals("proactive_warning_affirmative") && (A042 = AbstractC140946Yw.A04(this.A08)) != null && (A042 instanceof MsysThreadId) && (msysThreadId2 = (MsysThreadId) A042) != null) {
                        C47920LEp c47920LEp2 = this.A07;
                        FragmentActivity fragmentActivity = this.A03;
                        InterfaceC11380iw interfaceC11380iw = this.A00;
                        UserSession userSession = c47920LEp2.A03;
                        c47920LEp2.A02.A02(C43597JQd.A01(((C47430KxL) AbstractC41851wZ.A00(userSession).A01(C47430KxL.class, new C50159MDm(userSession, 7))).A00.A01, new C50261MHq(msysThreadId2, 41), 67).A0P(AbstractC142856cl.A00), new C49798Lz5(13, interfaceC11380iw, fragmentActivity, c47920LEp2));
                        C47920LEp.A00(c47920LEp2, msysThreadId2);
                        A02 = C42221xC.A09(true);
                        C14360o3.A0A(A02);
                        return A02;
                    }
                    break;
                case 303969528:
                    if (str.equals("global_delete_mitigation_learn_more")) {
                        A02 = C43597JQd.A02(this.A04, C50367MLu.A01(this, 1), 33);
                        C14360o3.A0A(A02);
                        return A02;
                    }
                    break;
                case 320799635:
                    if (str.equals("non_addressable_users_see_group_members")) {
                        return C43597JQd.A02(C43601JQh.A00(this.A04, MKM.A00, 5).A0G(), C50367MLu.A01(this, 0), 33);
                    }
                    break;
                case 1863137100:
                    if (str.equals("thread_banner_dismiss")) {
                        interfaceC16820sZ.invoke();
                        A02 = C42221xC.A09(true);
                        C14360o3.A0A(A02);
                        return A02;
                    }
                    break;
            }
        }
        return C42221xC.A09(A0a);
    }
}
