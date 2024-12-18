package X;

import android.app.Activity;
import android.content.res.Resources;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.FtT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35909FtT implements C53O {
    public final int A00;
    public final Object A01;

    public C35909FtT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C53O
    public final void CyY() {
        switch (this.A00) {
            case 0:
                C34394FEk c34394FEk = ((EEF) this.A01).A04;
                if (c34394FEk == null) {
                    return;
                }
                EKX ekx = c34394FEk.A00;
                InterfaceC09390do interfaceC09390do = ekx.A0K;
                if (((C143266dR) interfaceC09390do.getValue()).A02()) {
                    C07S c07s = C07S.STARTED;
                    C07X viewLifecycleOwner = ekx.getViewLifecycleOwner();
                    AbstractC166987dD.A1Z(new MCQ(viewLifecycleOwner, c07s, ekx, null, 30), C07Y.A00(viewLifecycleOwner));
                    ((C143266dR) interfaceC09390do.getValue()).A00();
                    return;
                }
                EKX.A03(ekx, true);
                return;
            case 1:
            case 2:
            case 3:
            default:
                return;
            case 4:
                EMM emm = (EMM) this.A01;
                IgTextView igTextView = emm.A02;
                if (igTextView == null) {
                    return;
                }
                Resources A0N = AbstractC166997dE.A0N(emm);
                boolean z = emm.A0B;
                int i = 2131953497;
                if (z) {
                    i = 2131953496;
                }
                AbstractC31173DnH.A19(A0N, igTextView, i);
                return;
        }
    }

    @Override // X.C53O
    public final /* synthetic */ void Cya() {
        switch (this.A00) {
            case 1:
                EKa eKa = (EKa) this.A01;
                eKa.A0E.putExtra(AbstractC111324zv.A00(3977), true);
                EKa.A04(eKa);
                return;
            case 2:
            case 3:
            case 5:
            default:
                return;
            case 4:
                EMM emm = (EMM) this.A01;
                IgTextView igTextView = emm.A02;
                if (igTextView != null) {
                    AbstractC31173DnH.A19(AbstractC166997dE.A0N(emm), igTextView, 2131953495);
                }
                IgTextView igTextView2 = emm.A02;
                if (igTextView2 == null) {
                    return;
                }
                ViewOnClickListenerC35687FpM.A00(igTextView2, 27, emm, this);
                return;
            case 6:
                AbstractC31176DnK.A1Y(this.A01);
                return;
        }
    }

    @Override // X.C53O
    public final void Cyb() {
        C189478aR c189478aR;
        switch (this.A00) {
            case 0:
                c189478aR = ((EEF) this.A01).A06;
                break;
            case 1:
            case 2:
            case 4:
            case 6:
            default:
                return;
            case 3:
                AbstractC167017dG.A0y(AbstractC31172DnG.A0C(this.A01), C3DN.A00);
                return;
            case 5:
                c189478aR = ((EEE) this.A01).A02;
                break;
            case 7:
                ((Activity) this.A01).finish();
                return;
        }
        AbstractC167007dF.A16(c189478aR);
    }

    @Override // X.C53O
    public final /* synthetic */ void Cym() {
        switch (this.A00) {
            case 1:
                EKa eKa = (EKa) this.A01;
                ((C31370Dqa) eKa.A0K.getValue()).A02(null, false);
                ((C31475DsJ) eKa.A0I.getValue()).A05(false, false);
                eKa.A0E.putExtra("avatar_updated", true);
                return;
            case 6:
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((C33219El7) this.A01).A07);
                AbstractC166987dD.A1Z(new PZL((InterfaceC23621Ds) null, A0Z, 28), AbstractC141776au.A00(A0Z));
                return;
            default:
                return;
        }
    }
}
