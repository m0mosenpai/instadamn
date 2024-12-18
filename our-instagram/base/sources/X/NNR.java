package X;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NNR extends AbstractC39705Hjb {
    public final int A00;
    public final Object A01;

    public NNR(NMW nmw, int i) {
        this.A00 = i;
        this.A01 = nmw;
    }

    @Override // X.AbstractC39705Hjb
    public final void A00() {
        if (2 - this.A00 == 0) {
            NMW.A04((NMW) this.A01, true);
        }
    }

    @Override // X.AbstractC39705Hjb
    public final void A01(AbstractC115105If abstractC115105If) {
        switch (this.A00) {
            case 0:
                C9GR.A0F(AbstractC31171DnF.A09(this.A01), "igtv_add_to_series_error", 2131964163);
                return;
            case 1:
                NMW nmw = (NMW) this.A01;
                InterfaceC56392iX interfaceC56392iX = nmw.A0B;
                if (interfaceC56392iX == null) {
                    C14360o3.A0F("captionsStubHolder");
                    throw C00O.createAndThrow();
                }
                interfaceC56392iX.getView().setVisibility(0);
                C9GR.A01(nmw.requireActivity(), "igtv_remove_captions_error", 2131964222, 0);
                return;
            default:
                C14360o3.A0B(abstractC115105If, 0);
                NMW nmw2 = (NMW) this.A01;
                if (nmw2.A0S) {
                    String A01 = AbstractC172137li.A01(abstractC115105If);
                    FragmentActivity activity = nmw2.getActivity();
                    if (A01 == null) {
                        A01 = AbstractC25227BEk.A0v(nmw2, 2131961661);
                    }
                    C9GR.A03(activity, A01, "save_edits_failed", 0);
                }
                NMW.A04(nmw2, false);
                return;
        }
    }

    @Override // X.AbstractC39705Hjb
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        FragmentActivity A0C;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                C52095N2v c52095N2v = (C52095N2v) obj;
                C14360o3.A0B(c52095N2v, 0);
                NMW nmw = (NMW) this.A01;
                C25671My c25671My = nmw.A08;
                if (c25671My == null) {
                    str = "eventBus";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                String str2 = c52095N2v.A00;
                if (str2 == null) {
                    str2 = "";
                }
                c25671My.E4s(new LYM(str2, C05F.A0N));
                A0C = nmw.getActivity();
                i = 2131964164;
                break;
            case 1:
                A0C = AbstractC31172DnG.A0C(this.A01);
                i = 2131964224;
                break;
            default:
                N3N n3n = (N3N) obj;
                C14360o3.A0B(n3n, 0);
                NMW nmw2 = (NMW) this.A01;
                NMW.A04(nmw2, false);
                InterfaceC09390do interfaceC09390do = nmw2.A0Y;
                AbstractC31176DnK.A0Z(interfaceC09390do).A03(n3n.A00());
                Handler handler = nmw2.A01;
                if (handler == null) {
                    str = "handler";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                handler.post(new RunnableC56904PMx(nmw2));
                C38321qM A00 = n3n.A00();
                C186808Px A002 = AbstractC186788Pv.A00(AbstractC166987dD.A0r(interfaceC09390do));
                String id = A00.getId();
                if (id != null) {
                    List A003 = A002.A00(id);
                    List A3g = A00.A3g();
                    C28531Zo.A04.A0G(AbstractC166987dD.A0r(interfaceC09390do), "FEED", A3g, A003);
                    Iterator it = A3g.iterator();
                    while (it.hasNext()) {
                        User A15 = AbstractC25226BEj.A15(it);
                        if (AbstractC186788Pv.A01(AbstractC166987dD.A0r(interfaceC09390do)) || (A003 != null && AbstractC31175DnJ.A1X(A15, A003))) {
                            DirectShareTarget directShareTarget = new DirectShareTarget(A15);
                            C28531Zo c28531Zo = C28531Zo.A04;
                            nmw2.requireContext();
                            c28531Zo.A0B(AbstractC166987dD.A0r(interfaceC09390do), A00, directShareTarget);
                        }
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
        }
        C9GR.A07(A0C, i);
    }
}
