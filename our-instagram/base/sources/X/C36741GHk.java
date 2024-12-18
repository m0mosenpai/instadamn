package X;

import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;

/* renamed from: X.GHk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36741GHk implements MQH {
    public final /* synthetic */ C32727Eas A00;

    public C36741GHk(C32727Eas c32727Eas) {
        this.A00 = c32727Eas;
    }

    @Override // X.MQH
    public final void Cup(Integer num) {
        C32727Eas c32727Eas = this.A00;
        InterfaceC09390do interfaceC09390do = ((EOD) c32727Eas).A05;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        AbstractC31171DnF.A0L(c32727Eas.getActivity(), AbstractC166987dD.A0b(), A0o, ModalActivity.class, AbstractC111324zv.A00(2262)).A0C(c32727Eas.getContext());
        ChannelDiscoveryViewModel channelDiscoveryViewModel = (ChannelDiscoveryViewModel) c32727Eas.A01.getValue();
        if (channelDiscoveryViewModel.A09) {
            C05A A09 = channelDiscoveryViewModel.A09();
            Iterable<Object> A0w = AbstractC31172DnG.A0w(A09);
            ArrayList A0q = AbstractC167017dG.A0q(A0w);
            for (Object obj : A0w) {
                if (obj instanceof C32099E8x) {
                    C32099E8x c32099E8x = (C32099E8x) obj;
                    if (c32099E8x.A09) {
                        obj = ChannelDiscoveryViewModel.A01(c32099E8x);
                    }
                }
                A0q.add(obj);
            }
            A09.Egh(A0q);
        }
        C35267Fh2 A00 = F3T.A00(AbstractC166987dD.A0r(interfaceC09390do));
        InterfaceC02590Ai A002 = C35267Fh2.A00(A00);
        if (A002.isSampled()) {
            C35267Fh2.A04(A002, A00);
            AbstractC31171DnF.A1B(A002, "all_channel_invites_sheet_rendered");
            AbstractC31171DnF.A1E(A002, "inbox_directory_sheet");
            AbstractC25232BEp.A1K(A002, "see_all_button");
            AbstractC31173DnH.A1L(A002, A00.A00);
            A002.Cht();
        }
    }

    @Override // X.MQH
    public final void DKK() {
        C32727Eas c32727Eas = this.A00;
        InterfaceC09390do interfaceC09390do = ((EOD) c32727Eas).A05;
        C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
        A0g.A17 = true;
        A0g.A00().A02(c32727Eas.requireActivity(), F2F.A00(AbstractC166987dD.A0r(interfaceC09390do), 0));
    }
}
