package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class EZP extends C3PD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public EZP(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        List A1E;
        C193328hC A0O;
        String A0k;
        String quantityString;
        int i;
        switch (this.A00) {
            case 0:
                C31993E3v c31993E3v = (C31993E3v) this.A02;
                AbstractC31177DnL.A0u(AbstractC166997dE.A0L(c31993E3v.itemView), c31993E3v.A07, C2Fb.A49, ((C38686GzR) this.A01).A02);
                return true;
            case 1:
                String str = ((C26046BfZ) this.A01).A03;
                ELE ele = (ELE) this.A02;
                if (str == null) {
                    ELE.A03(ele);
                    return true;
                }
                InterfaceC09390do interfaceC09390do = ele.A04;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                FragmentActivity requireActivity = ele.requireActivity();
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A18, AbstractC166987dD.A0r(interfaceC09390do));
                c116875Qr.A1D = str;
                c116875Qr.A1h = true;
                c116875Qr.A1d = false;
                AbstractC31173DnH.A1J(requireActivity, c116875Qr, A0r);
                return true;
            case 2:
                ((EYT) this.A02).A00.DcC((C32098E8w) this.A01);
                return true;
            case 3:
                Fragment fragment = (Fragment) this.A02;
                C41181vS c41181vS = ((FOJ) this.A01).A00;
                if (c41181vS == null) {
                    return true;
                }
                InterfaceC37274GbR A05 = c41181vS.A05();
                if (A05 != null && A05.AsA() != null) {
                    A1E = A05.AsA();
                } else {
                    A1E = AbstractC166987dD.A1E();
                }
                A0O = AbstractC31175DnJ.A0O(fragment);
                A0O.A05 = AbstractC31174DnI.A0w(fragment, Integer.valueOf(A1E.size()), 2131952528);
                A0O.A0r(new C71473Il("\n").A02(A1E));
                A0O.A07();
                A0O.A0s(true);
                A0O.A0t(true);
                break;
                break;
            case 4:
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A02;
                C41181vS c41181vS2 = ((FOJ) this.A01).A00;
                if (c41181vS2 == null) {
                    return true;
                }
                int A00 = AbstractC34833FWq.A00(reelDashboardFragment.A06, c41181vS2);
                boolean A1K = c41181vS2.A1K();
                Resources A0N = AbstractC166997dE.A0N(reelDashboardFragment);
                if (A1K) {
                    Integer valueOf = Integer.valueOf(A00);
                    A0k = AbstractC31175DnJ.A0W(A0N, valueOf, R.plurals.remove_videos_from_highlight_dialog_title, A00);
                    quantityString = AbstractC31175DnJ.A0W(AbstractC166997dE.A0N(reelDashboardFragment), valueOf, R.plurals.remove_videos_from_highlight_dialog_message, A00);
                    i = 2131972171;
                } else {
                    A0k = AbstractC167017dG.A0k(A0N, A00, R.plurals.delete_videos_dialog_title);
                    quantityString = AbstractC166997dE.A0N(reelDashboardFragment).getQuantityString(R.plurals.delete_videos_dialog_message, A00);
                    i = 2131957640;
                }
                Context requireContext = reelDashboardFragment.requireContext();
                DialogInterfaceOnClickListenerC35455FkC A002 = DialogInterfaceOnClickListenerC35455FkC.A00(reelDashboardFragment, c41181vS2, 70);
                A0O = AbstractC31176DnK.A0a(requireContext, quantityString, A0k);
                A0O.A0J(A002, i);
                A0O.A06();
                break;
            default:
                AbstractC41776Ies.A03(AbstractC31172DnG.A07(this.A02), "https://help.instagram.com/1445818549016877");
                return true;
        }
        AbstractC166987dD.A1W(A0O);
        return true;
    }
}
