package X;

import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Duq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31624Duq implements MQH {
    public final /* synthetic */ JR2 A00;

    public C31624Duq(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.MQH
    public final void Cup(Integer num) {
        int i;
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
        JR2 jr2 = this.A00;
        UserSession A0p = jr2.A0p();
        if (A1X) {
            i = 2262;
        } else {
            i = 879;
        }
        String A00 = AbstractC111324zv.A00(i);
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        AbstractC31173DnH.A1I(abstractC59962oe, AbstractC31171DnF.A0L(abstractC59962oe.requireActivity(), abstractC59962oe.requireArguments(), A0p, ModalActivity.class, A00));
        C35267Fh2 A002 = F3T.A00(jr2.A0p());
        InterfaceC02590Ai A003 = C35267Fh2.A00(A002);
        boolean isSampled = A003.isSampled();
        if (A1X) {
            if (isSampled) {
                C35267Fh2.A04(A003, A002);
                AbstractC31171DnF.A1B(A003, "all_channel_invites_sheet_rendered");
                AbstractC31171DnF.A1E(A003, "inbox");
                AbstractC25232BEp.A1K(A003, "see_all_button");
                AbstractC31173DnH.A1L(A003, A002.A00);
                A003.Cht();
                return;
            }
            return;
        }
        if (!isSampled) {
            return;
        }
        C35267Fh2.A04(A003, A002);
        AbstractC31177DnL.A1D(A003, "inbox_directory_sheet_rendered");
        AbstractC25232BEp.A1K(A003, "see_all_button");
        AbstractC31173DnH.A1L(A003, A002.A00);
        A003.Cht();
    }

    @Override // X.MQH
    public final void DKK() {
        JR2 jr2 = this.A00;
        EI6 A00 = F2F.A00(jr2.A0p(), C18U.A06(C06090Tz.A05, jr2.A0p(), 36317908448319143L) ? 1 : 0);
        C189448aO A0y = AbstractC25225BEi.A0y(jr2.A0p());
        A0y.A17 = true;
        AbstractC31173DnH.A1G(jr2.A1L, A00, A0y.A00());
    }
}
