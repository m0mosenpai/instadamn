package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KB2 extends AbstractC72473Mu {
    public TextView A00;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC16820sZ A03 = new MHP(this, 11);

    @Override // X.AbstractC72483Mv
    public final void A0K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        InterfaceC09390do interfaceC09390do = this.A02;
        ((C44525JmV) interfaceC09390do.getValue()).A00();
        AbstractC18560vj.A03(AbstractC25229BEm.A0a(this), new C15340po(new PYw(this, null, 29), ((C44525JmV) interfaceC09390do.getValue()).A05));
        AbstractC43593JPy.A1E(this, ((C44525JmV) interfaceC09390do.getValue()).A01, new MM0(this, 36), 28);
    }

    public KB2() {
        MHP mhp = new MHP(this, 10);
        InterfaceC09390do A00 = MHP.A00(new MHP(this, 7), EnumC09460dv.A02, 8);
        this.A02 = AbstractC25225BEi.A0a(new MHP(A00, 9), mhp, new C50172MDz(9, null, A00), AbstractC25225BEi.A1D(C44525JmV.class));
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        View A0C = AbstractC25227BEk.A0C(AbstractC31175DnJ.A06(this), R.layout.encrypted_backups_display_code_v2_fragment);
        this.A00 = AbstractC166987dD.A0e(A0C, R.id.dialog_code_text);
        C193328hC A0P = AbstractC31180DnO.A0P(this);
        A0P.A0l(A0C);
        A0P.A0S(DialogInterfaceOnClickListenerC48023LMs.A00(this, 24), EnumC193348hE.A03, 2131961795);
        A0P.A0h(new DialogInterfaceOnShowListenerC48027LMw(this, 4));
        return A0P.A02();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(679067513);
        super.onDestroy();
        ((C44525JmV) this.A02.getValue()).A03.A02();
        C0f9.A09(1570622708, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-182729231);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(-1001728655, A02);
    }
}
