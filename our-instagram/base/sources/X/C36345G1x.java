package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.G1x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36345G1x implements C7EJ {
    public final /* synthetic */ C32256EIq A00;

    @Override // X.C7EJ
    public final /* synthetic */ void DBf() {
    }

    @Override // X.C7EJ
    public final void Dkn(MessagingUser messagingUser) {
        C32256EIq c32256EIq = this.A00;
        DirectThreadKey directThreadKey = c32256EIq.A0C;
        if (directThreadKey == null) {
            C14360o3.A0F("threadKey");
            throw C00O.createAndThrow();
        }
        String str = directThreadKey.A00;
        if (str != null) {
            InterfaceC09390do interfaceC09390do = c32256EIq.A0I;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            String str2 = messagingUser.A03;
            C14360o3.A07(str2);
            C162337Ov.A0K(c32256EIq, A0o, str, str2);
            F3L.A00(c32256EIq.requireActivity(), c32256EIq, AbstractC166987dD.A0r(interfaceC09390do), messagingUser, "direct_prompt_viewer", null, false, false);
        }
    }

    @Override // X.C7EJ
    public final /* synthetic */ void DlH() {
    }

    public C36345G1x(C32256EIq c32256EIq) {
        this.A00 = c32256EIq;
    }

    @Override // X.C7EJ
    public final void Cyq() {
        AbstractC31177DnL.A12(this.A00);
    }

    @Override // X.C7EJ
    public final void D9c() {
        C32256EIq c32256EIq = this.A00;
        C193328hC A0b = AbstractC31176DnK.A0b(c32256EIq);
        A0b.A0A(2131960205);
        A0b.A09(2131960208);
        DialogInterfaceOnClickListenerC35452Fk9.A01(A0b, c32256EIq, 44, 2131960204);
        A0b.A0D(DialogInterfaceOnClickListenerC35400FjJ.A00);
        AbstractC31178DnM.A1R(A0b, true);
    }

    @Override // X.C7EJ
    public final void Dfa() {
        String str;
        C32050E6c c32050E6c;
        User user;
        C32256EIq c32256EIq = this.A00;
        C31835Dyu c31835Dyu = c32256EIq.A04;
        if (c31835Dyu == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        FragmentActivity requireActivity = c32256EIq.requireActivity();
        String str2 = (String) c31835Dyu.A08.getValue();
        if (str2 != null) {
            C45024JwF c45024JwF = (C45024JwF) c31835Dyu.A00.A02();
            if (c45024JwF != null && (c32050E6c = c45024JwF.A00) != null && (user = c32050E6c.A02) != null) {
                str = user.getId();
            } else {
                str = null;
            }
            String str3 = c31835Dyu.A03.A00;
            if (str != null && str3 != null) {
                LL1.A03(requireActivity, c32256EIq, c31835Dyu.A01, DirectPromptTypes.A07, EnumC65855TvH.A0j, VG2.A0T, str2, c31835Dyu.A05, str, str3);
            }
        }
    }
}
