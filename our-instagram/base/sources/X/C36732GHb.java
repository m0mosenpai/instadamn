package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GHb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36732GHb implements GYQ {
    public final /* synthetic */ ENA A00;

    public C36732GHb(ENA ena) {
        this.A00 = ena;
    }

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
        C14360o3.A0B(c31335Dq0, 0);
        ENA ena = this.A00;
        E70 e70 = ena.A0A;
        if (e70 != null) {
            InterfaceC09390do interfaceC09390do = ena.A0L;
            if (AbstractC34097F2z.A00(AbstractC166987dD.A0r(interfaceC09390do), e70, c31335Dq0.A0C)) {
                Context requireContext = ena.requireContext();
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                FragmentActivity requireActivity = ena.requireActivity();
                C32056E6i c32056E6i = ena.A09;
                if (c32056E6i != null) {
                    AbstractC35172FfP.A00(requireContext, requireActivity, ena, A0r, c32056E6i, c31335Dq0.A0C, C05F.A0N);
                    int ordinal = c31335Dq0.A0C.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            C142846ck c142846ck = ena.A01;
                            if (c142846ck == null) {
                                C14360o3.A0F("broadcastChatLogger");
                                throw C00O.createAndThrow();
                            }
                            int A06 = e70.A06();
                            String A03 = E70.A03(e70);
                            String str = e70.A0Q;
                            C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
                            if (AbstractC25226BEj.A1Z(A0I)) {
                                AbstractC31175DnJ.A1B(A0I, c142846ck);
                                AbstractC31174DnI.A1I(A0I, AbstractC111324zv.A00(1899));
                                A0I.A0o("add_collaborator_button");
                                A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_details_people", A03, str, A06));
                                A0I.Cht();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C36267FzK A00 = AbstractC34061F1o.A00(AbstractC166987dD.A0r(interfaceC09390do));
                    int A062 = e70.A06();
                    AbstractC34065F1s.A00(A00.A00, E70.A03(e70), e70.A0Q, "add_moderators_sheet_rendered", "tap", "add_moderator_button", "thread_details_people", null, A062);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
