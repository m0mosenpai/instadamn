package X;

import android.app.Dialog;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public class G9Q implements InterfaceC37227Gac {
    public final FragmentActivity A00;

    @Override // X.InterfaceC37227Gac
    public final void Cut(String str, String str2) {
    }

    @Override // X.InterfaceC37227Gac
    public final void DQP() {
    }

    @Override // X.InterfaceC37227Gac
    public final void DV5() {
    }

    @Override // X.InterfaceC37227Gac
    public final void Dkh() {
    }

    @Override // X.InterfaceC37227Gac
    public final void Dki() {
    }

    @Override // X.InterfaceC37227Gac
    public final void Dkj() {
    }

    @Override // X.InterfaceC37227Gac
    public final void Do2(C34691FQc c34691FQc) {
    }

    @Override // X.InterfaceC37227Gac
    public final /* synthetic */ void DoC() {
    }

    @Override // X.InterfaceC37227Gac
    public final /* synthetic */ void DRA(FQD fqd) {
        boolean z;
        Dialog dialog;
        if (this instanceof C32981Efn) {
            C32981Efn c32981Efn = (C32981Efn) this;
            C193328hC A0I = AbstractC31171DnF.A0I(c32981Efn.A01);
            A0I.A09(2131972831);
            A0I.A07();
            Dialog A02 = A0I.A02();
            c32981Efn.A00 = A02;
            if (A02 != null) {
                A02.setOnDismissListener(new DialogInterfaceOnDismissListenerC35463FkK(c32981Efn, 5));
            }
            if (c32981Efn.A02.getLifecycle().A07().A00(C07S.RESUMED) && (dialog = c32981Efn.A00) != null) {
                C32981Efn.A00(dialog, c32981Efn);
            }
            z = true;
        } else {
            z = false;
        }
        fqd.A00(z);
    }

    @Override // X.InterfaceC37227Gac
    public final void DoB(final C07270a1 c07270a1, final C32196ECr c32196ECr) {
        new Handler().post(new Runnable() { // from class: X.GPX
            @Override // java.lang.Runnable
            public final void run() {
                G9Q g9q = this;
                C32196ECr c32196ECr2 = c32196ECr;
                C07270a1 c07270a12 = c07270a1;
                C34643FOa c34643FOa = c32196ECr2.A01;
                C34717FRd A0R = AbstractC31175DnJ.A0R();
                String str = c34643FOa.A05;
                String str2 = c34643FOa.A06;
                String str3 = c34643FOa.A01;
                String str4 = c34643FOa.A00;
                boolean z = c34643FOa.A0D;
                boolean z2 = c34643FOa.A0A;
                boolean z3 = c34643FOa.A0E;
                boolean z4 = c34643FOa.A0F;
                boolean z5 = c34643FOa.A0B;
                C32262EIw A02 = A0R.A02(C35002FbZ.A00(c32196ECr2.A00), str, str2, str3, str4, c34643FOa.A02, z, z2, z3, z4, z5, false, c34643FOa.A09, c34643FOa.A07, c34643FOa.A08);
                FragmentActivity fragmentActivity = g9q.A00;
                fragmentActivity.getClass();
                AbstractC31177DnL.A15(A02, fragmentActivity, c07270a12);
            }
        });
    }

    public G9Q(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }
}
