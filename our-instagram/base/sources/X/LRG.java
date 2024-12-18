package X;

import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes8.dex */
public final class LRG implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C46054Ka9 A00;
    public final /* synthetic */ C36731GHa A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public LRG(C46054Ka9 c46054Ka9, C36731GHa c36731GHa, boolean z, boolean z2) {
        this.A00 = c46054Ka9;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = c36731GHa;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C14360o3.A0B(compoundButton, 0);
        if (z) {
            C46054Ka9 c46054Ka9 = this.A00;
            InterfaceC09390do interfaceC09390do = c46054Ka9.A0B;
            Jn4 A0T = AbstractC43594JPz.A0T(Jn4.A00(interfaceC09390do), "TURN_ON_3P", interfaceC09390do);
            FragmentActivity requireActivity = c46054Ka9.requireActivity();
            LGY lgy = A0T.A08;
            EnumC46208Kck enumC46208Kck = EnumC46208Kck.A07;
            Integer num = C05F.A0N;
            lgy.A01(requireActivity, AbstractC166987dD.A0b(), enumC46208Kck, EnumC46149Kbn.A04, num, C05F.A00, null);
            return;
        }
        if (this.A02 && !this.A03) {
            C46054Ka9 c46054Ka92 = this.A00;
            Jn4.A00(c46054Ka92.A0B).A05("TURN_OFF_3P_STOPPED_NEED_MORE_THAN_ONE_METHOD");
            LLQ.A06(c46054Ka92, EnumC193348hE.A03, 2131973347, null, null, null, new C50172MDz(19, compoundButton, this.A01), null, C50195MFc.A00, 2131973346, 2131973345);
            return;
        }
        C46054Ka9 c46054Ka93 = this.A00;
        InterfaceC09390do interfaceC09390do2 = c46054Ka93.A0B;
        Jn4.A00(interfaceC09390do2).A05("TURN_OFF_3P");
        Jn4.A00(interfaceC09390do2).A05("TURN_OFF_3P_DIALOG_IMPRESSION");
        LLQ.A06(c46054Ka93, EnumC193348hE.A06, 2131961842, 2131961839, null, null, new ME5(43, compoundButton, c46054Ka93, this.A01), null, new C50168MDv(26, c46054Ka93, z), 2131961841, 2131961840);
    }
}
