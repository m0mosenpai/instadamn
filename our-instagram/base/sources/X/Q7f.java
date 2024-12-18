package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.fragment.app.Fragment;

/* loaded from: classes10.dex */
public final class Q7f extends AbstractC59972of {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC60733ROs abstractC60733ROs;
        C14360o3.A0B(view, 0);
        A00(this, C05F.A15, C05F.A01, new C09530e4[0]);
        try {
            InterfaceC09390do interfaceC09390do = this.A00;
            CheckBox checkBox = (CheckBox) AbstractC166987dD.A0c(view, ((UQ7) Q8Y.A00(interfaceC09390do).A06).A02);
            int intValue = ((Q8Y) interfaceC09390do.getValue()).A00.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    AbstractC31180DnO.A1F(this, AbstractC58318PtA.A0L(this.A01).A04, new C65076Td9(28, this, checkBox), 5);
                } else {
                    throw B4Z.A00();
                }
            } else {
                checkBox.setVisibility(0);
            }
            View findViewById = view.findViewById(((UQ7) Q8Y.A00(interfaceC09390do).A06).A00);
            ViewOnClickListenerC63509Soc.A00(findViewById, 14, this, checkBox);
            ViewOnClickListenerC63508Sob.A01(view.findViewById(((UQ7) Q8Y.A00(interfaceC09390do).A06).A03), 19, this);
            AbstractC31180DnO.A1F(this, AbstractC58318PtA.A0L(this.A01).A07, new DHZ(28, findViewById, this, checkBox), 5);
        } catch (Throwable th) {
            AbstractC58318PtA.A0L(this.A01).A09.EmQ("OxygenInstallSDK_UnexpectedException", th);
            Fragment fragment = this.mParentFragment;
            if ((fragment instanceof AbstractC60733ROs) && (abstractC60733ROs = (AbstractC60733ROs) fragment) != null) {
                abstractC60733ROs.A0G();
            }
        }
    }

    public static final void A00(Q7f q7f, Integer num, Integer num2, C09530e4... c09530e4Arr) {
        AbstractC58323PtF.A1I(AbstractC58318PtA.A0L(q7f.A01), num, num2, C05F.A00, c09530e4Arr);
    }

    public Q7f() {
        C57238PbM c57238PbM = new C57238PbM(this, 11);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A13 = AbstractC58322PtE.A13(c57238PbM, enumC09460dv, 12);
        C0YZ c0yz = new C0YZ(C44455JlN.class);
        this.A01 = new C60842q8(new C57238PbM(A13, 13), new C57254Pbc(39, A13, this), new C57254Pbc(38, null, A13), c0yz);
        InterfaceC09390do A132 = AbstractC58322PtE.A13(new C57238PbM(this, 10), enumC09460dv, 14);
        C0YZ c0yz2 = new C0YZ(Q8Y.class);
        this.A00 = new C60842q8(new C57238PbM(A132, 15), new C57254Pbc(41, A132, this), new C57254Pbc(40, null, A132), c0yz2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(72621059);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(((UQ7) Q8Y.A00(this.A00).A06).A01, viewGroup, false);
        C0f9.A09(-1105035308, A02);
        return inflate;
    }
}
