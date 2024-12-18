package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* loaded from: classes6.dex */
public final class GHN implements InterfaceC1571373s {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    public GHN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC1571373s
    public final void DDR() {
        EnumC39551HdN enumC39551HdN;
        C6XJ A0L;
        Context requireContext;
        C140966Yy A0c;
        Fragment A00;
        String Aj5;
        switch (this.A00) {
            case 0:
                ArchiveReelFragment archiveReelFragment = (ArchiveReelFragment) this.A01;
                A0c = AbstractC25225BEi.A0r(archiveReelFragment.requireActivity(), archiveReelFragment.A04);
                A00 = AbstractC86593tX.A0D();
                A0c.A0E(A00);
                A0c.A04();
                return;
            case 1:
                LLk lLk = (LLk) this.A01;
                KXD kxd = lLk.A0o;
                kxd.A00 = true;
                kxd.A04("enter_hidden_words_settings", null);
                FragmentActivity requireActivity = lLk.A0b.requireActivity();
                UserSession userSession = lLk.A0h;
                A0c = AbstractC31173DnH.A0P(requireActivity, userSession);
                A00 = F78.A00().A00.A00(lLk.A0Y, userSession, C05F.A0C);
                A0c.A0E(A00);
                A0c.A04();
                return;
            case 2:
                C26871BtY c26871BtY = (C26871BtY) this.A01;
                A0c = AbstractC25231BEo.A0c(c26871BtY.requireActivity(), c26871BtY.A07);
                A0c.A0F = true;
                A0c.A0D(new C33209Ekx());
                A0c.A04();
                return;
            case 3:
                Bundle A0b = AbstractC166987dD.A0b();
                EM6 em6 = (EM6) this.A01;
                if (em6.A0T) {
                    enumC39551HdN = EnumC39551HdN.A04;
                } else {
                    enumC39551HdN = EnumC39551HdN.A03;
                }
                A0b.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", enumC39551HdN);
                A0b.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", em6.A0C);
                A0L = AbstractC31171DnF.A0L(em6.requireActivity(), A0b, em6.A05, ModalActivity.class, "saved_feed");
                requireContext = em6.requireContext();
                A0L.A0C(requireContext);
                return;
            case 4:
                return;
            default:
                ENZ enz = (ENZ) this.A01;
                EQM eqm = enz.A0A;
                if (eqm == null) {
                    AbstractC31171DnF.A0t();
                    throw C00O.createAndThrow();
                }
                GraphGuardianContent graphGuardianContent = eqm.A02;
                if (graphGuardianContent != null && (Aj5 = graphGuardianContent.Aj5()) != null) {
                    SimpleWebViewActivity.A02.A02(enz.requireContext(), AbstractC166987dD.A0o(enz.A0T), new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, (String) null, AbstractC63260SgI.A01(enz.requireContext(), Aj5)));
                    return;
                }
                AbstractC12990ll A0o = AbstractC166987dD.A0o(enz.A0T);
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putString("analytics_module", enz.getModuleName());
                A0b2.putString("location", "IG_PROFILE");
                A0L = AbstractC31171DnF.A0L(enz.getActivity(), A0b2, A0o, ModalActivity.class, "account_status");
                requireContext = enz.getActivity();
                A0L.A0C(requireContext);
                return;
        }
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }
}
