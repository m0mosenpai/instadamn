package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* renamed from: X.Q7g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58754Q7g extends AbstractC59972of {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC60733ROs abstractC60733ROs;
        C14360o3.A0B(view, 0);
        A00(this, C05F.A15, C05F.A01, new C09530e4[0]);
        try {
            InterfaceC09390do interfaceC09390do = this.A00;
            TextView textView = (TextView) AbstractC166987dD.A0c(view, ((QId) Q8Y.A00(interfaceC09390do).A07).A00);
            ViewOnClickListenerC63508Sob.A01(textView, 20, this);
            ProgressBar progressBar = (ProgressBar) AbstractC166987dD.A0c(view, ((QId) Q8Y.A00(interfaceC09390do).A07).A07);
            TextView textView2 = (TextView) AbstractC166987dD.A0c(view, ((QId) Q8Y.A00(interfaceC09390do).A07).A03);
            TextView textView3 = (TextView) AbstractC166987dD.A0c(view, ((QId) Q8Y.A00(interfaceC09390do).A07).A02);
            View A0c = AbstractC166987dD.A0c(view, ((QId) Q8Y.A00(interfaceC09390do).A07).A05);
            TextView textView4 = (TextView) AbstractC166987dD.A0c(view, ((QId) Q8Y.A00(interfaceC09390do).A07).A04);
            ViewOnClickListenerC63508Sob.A01(textView4, 21, this);
            TextView textView5 = (TextView) AbstractC166987dD.A0c(view, ((QId) Q8Y.A00(interfaceC09390do).A07).A06);
            InterfaceC09390do interfaceC09390do2 = this.A01;
            AbstractC31180DnO.A1F(this, AbstractC58318PtA.A0L(interfaceC09390do2).A05, new C50372MLz(9, textView5, this, textView4, A0c), 6);
            AbstractC31180DnO.A1F(this, AbstractC58318PtA.A0L(interfaceC09390do2).A07, new MIL(2, textView, this, textView3, textView2, progressBar), 6);
        } catch (Throwable th) {
            AbstractC58318PtA.A0L(this.A01).A09.EmQ("OxygenInstallSDK_UnexpectedException", th);
            Fragment fragment = this.mParentFragment;
            if ((fragment instanceof AbstractC60733ROs) && (abstractC60733ROs = (AbstractC60733ROs) fragment) != null) {
                abstractC60733ROs.A0G();
            }
        }
    }

    public static final void A00(C58754Q7g c58754Q7g, Integer num, Integer num2, C09530e4... c09530e4Arr) {
        AbstractC58323PtF.A1I(AbstractC58318PtA.A0L(c58754Q7g.A01), num, num2, C05F.A01, c09530e4Arr);
    }

    public C58754Q7g() {
        C57238PbM c57238PbM = new C57238PbM(this, 17);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A13 = AbstractC58322PtE.A13(c57238PbM, enumC09460dv, 18);
        C0YZ c0yz = new C0YZ(C44455JlN.class);
        this.A01 = new C60842q8(new C57238PbM(A13, 19), new C57254Pbc(43, A13, this), new C57254Pbc(42, null, A13), c0yz);
        InterfaceC09390do A132 = AbstractC58322PtE.A13(new C57238PbM(this, 16), enumC09460dv, 20);
        C0YZ c0yz2 = new C0YZ(Q8Y.class);
        this.A00 = new C60842q8(new C57238PbM(A132, 21), new C57254Pbc(45, A132, this), new C57254Pbc(44, null, A132), c0yz2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(496752354);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(((QId) Q8Y.A00(this.A00).A07).A01, viewGroup, false);
        C0f9.A09(1611802033, A02);
        return inflate;
    }
}
