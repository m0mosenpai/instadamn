package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;

/* loaded from: classes6.dex */
public final class G2N implements InterfaceC37168GZf {
    public final /* synthetic */ ELR A00;

    public G2N(ELR elr) {
        this.A00 = elr;
    }

    @Override // X.InterfaceC37168GZf
    public final void DTF(DirectMessageSearchMessage directMessageSearchMessage, int i, int i2, int i3, int i4) {
        ELR elr = this.A00;
        C36294Fzo c36294Fzo = elr.A05;
        if (c36294Fzo != null) {
            if (AbstractC167007dF.A1W(c36294Fzo.A02)) {
                C36303Fzy A00 = C36303Fzy.A00(AbstractC166987dD.A0r(elr.A0D));
                C14360o3.A07(A00);
                String str = elr.A07;
                if (str != null) {
                    long j = i;
                    long j2 = i2;
                    A00.A0A(directMessageSearchMessage, str, 25, j, j2);
                    A00.A08(null, directMessageSearchMessage, 25, j, j2, i3);
                    A00.A09(directMessageSearchMessage);
                }
                C14360o3.A0F("query");
                throw C00O.createAndThrow();
            }
            C36294Fzo c36294Fzo2 = elr.A05;
            if (c36294Fzo2 != null) {
                String str2 = elr.A07;
                if (str2 != null) {
                    String str3 = directMessageSearchMessage.A0A;
                    c36294Fzo2.A04(str2, str3, "thread_list", directMessageSearchMessage.A02);
                    C36294Fzo c36294Fzo3 = elr.A05;
                    if (c36294Fzo3 != null) {
                        String str4 = elr.A07;
                        if (str4 != null) {
                            c36294Fzo3.A03(str4, str3);
                            C36881nl A01 = C36881nl.A01(elr.requireActivity(), elr, AbstractC166987dD.A0r(elr.A0D), "direct_message_search");
                            AbstractC31179DnN.A1R(A01, directMessageSearchMessage.A09);
                            A01.A0X = directMessageSearchMessage.A07;
                            A01.A0J = Long.valueOf(directMessageSearchMessage.A01);
                            A01.A0j = directMessageSearchMessage.A03;
                            A01.A06();
                            return;
                        }
                    }
                }
                C14360o3.A0F("query");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F("messageSearchLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37168GZf
    public final void DTL(DirectMessageSearchThread directMessageSearchThread, int i, int i2, int i3, int i4) {
        ELR elr = this.A00;
        C36294Fzo c36294Fzo = elr.A05;
        String str = "messageSearchLogger";
        if (c36294Fzo != null) {
            if (c36294Fzo.A02 != null) {
                C36303Fzy A00 = C36303Fzy.A00(AbstractC166987dD.A0r(elr.A0D));
                C14360o3.A07(A00);
                A00.A08(null, directMessageSearchThread, 25, i, i2, i3);
            }
            C36294Fzo c36294Fzo2 = elr.A05;
            if (c36294Fzo2 != null) {
                String str2 = elr.A07;
                str = "query";
                if (str2 != null) {
                    String str3 = directMessageSearchThread.A0A;
                    c36294Fzo2.A03(str2, str3);
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID", directMessageSearchThread.A08);
                    A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME", directMessageSearchThread.A09);
                    String str4 = elr.A07;
                    if (str4 != null) {
                        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", str4);
                        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE", str3);
                        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY", directMessageSearchThread.A07);
                        A0b.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i3);
                        AbstractC31173DnH.A1I(elr, AbstractC31174DnI.A0a(elr.requireActivity(), A0b, AbstractC166987dD.A0o(elr.A0D), ModalActivity.class, AbstractC111324zv.A00(882)));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37168GZf
    public final void Dh4(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        String str;
        ELR elr = this.A00;
        if (view != null) {
            if (directSearchResult instanceof DirectMessageSearchMessage) {
                str = ((DirectMessageSearchMessage) directSearchResult).A07;
            } else if (directSearchResult instanceof DirectMessageSearchThread) {
                str = ((DirectMessageSearchThread) directSearchResult).A08;
            } else {
                return;
            }
            C59072n8 A00 = C59062n7.A00(directSearchResult, null, str);
            A00.A00(new G0Z(elr.A0C));
            C59062n7 A01 = A00.A01();
            C57112jm c57112jm = elr.A04;
            if (c57112jm == null) {
                C14360o3.A0F("viewpointManager");
                throw C00O.createAndThrow();
            }
            c57112jm.A05(view, A01);
        }
    }
}
