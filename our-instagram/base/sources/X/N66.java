package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class N66 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenCustomQuestionBaseFragment";
    public View A00;
    public IgFormField A01;
    public IgFormField A02;
    public C55089Oav A03;
    public AnonymousClass195 A04;
    public final List A05 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean z;
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC50993Mg0 A01 = A01();
        if (A01 instanceof C52596NOr) {
            z = ((C52596NOr) A01).A04;
        } else {
            z = ((C52597NOs) A01).A05;
        }
        int i = 2131964968;
        if (z) {
            i = 2131964967;
        }
        interfaceC56362iU.Efu(i);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        C55089Oav A00 = C55089Oav.A00(this, interfaceC56362iU);
        this.A03 = A00;
        A00.A02(new ViewOnClickListenerC55461OkG(this, 16));
        Boolean bool = (Boolean) A01().A01.A02();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            C55089Oav c55089Oav = this.A03;
            if (c55089Oav != null) {
                c55089Oav.A03(booleanValue);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x01dc, code lost:
    
        X.AbstractC16960so.A1U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x01e3, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N66.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C51753Mtc c51753Mtc, C54543O7v c54543O7v, N66 n66) {
        int A0H = AbstractC166987dD.A0H(c51753Mtc.A02);
        if (A0H != 1) {
            if (A0H != 2) {
                if (A0H != 0) {
                    throw B4Z.A00();
                }
                return;
            } else {
                c54543O7v.A01 = "error";
                c54543O7v.A00 = n66.getString(c51753Mtc.A01);
                return;
            }
        }
        c54543O7v.A01 = "confirmed";
    }

    public final AbstractC50993Mg0 A01() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52567NNn) {
            interfaceC09390do = ((C52567NNn) this).A04;
        } else {
            interfaceC09390do = ((C52566NNm) this).A00;
        }
        return (AbstractC50993Mg0) interfaceC09390do.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        AbstractC50993Mg0 A01 = A01();
        if (A01 instanceof C52596NOr) {
            return ((C52596NOr) A01).A01;
        }
        return ((C52597NOs) A01).A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC50993Mg0 A01 = A01();
        if (A01.A00) {
            O3S o3s = A01.A04;
            String A00 = A01.A00();
            C14360o3.A0B(A00, 0);
            InterfaceC58268PsC.A02(o3s.A00, A00, "lead_gen_custom_question", "cancel");
        }
        A01.A00 = true;
        AbstractC13880nE.A0O(AbstractC50522MSa.A0J(this));
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1168684077);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_custom_question, viewGroup, false);
        C0f9.A09(-1787772570, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(-1279013319);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        this.A05.clear();
        C0f9.A09(1736587163, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-405417542);
        super.onResume();
        IgFormField igFormField = this.A02;
        if (igFormField != null) {
            igFormField.post(new PN6(this));
        }
        C0f9.A09(-23182297, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int A02 = C0f9.A02(-1700199599);
        super.onStart();
        this.A04 = PZH.A01(this, A01().A07, 25);
        C0f9.A09(-1338879988, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int A02 = C0f9.A02(-908425150);
        super.onStop();
        this.A04 = MSY.A0r(this.A04);
        C0f9.A09(1636808011, A02);
    }
}
