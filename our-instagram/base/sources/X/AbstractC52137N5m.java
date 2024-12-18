package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.N5m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52137N5m extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenAdvancedSettingsBaseFragment";
    public AnonymousClass195 A00;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131964921);
        AbstractC50523MSb.A1E(interfaceC56362iU);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC50891MeM A00 = A00();
        O3R o3r = A00.A00;
        if (A00 instanceof NOU) {
            str = ((NOU) A00).A02;
        } else {
            str = ((NOT) A00).A02;
        }
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC.A03(o3r.A00, str, "lead_gen_advanced_setting", "advanced_setting_screen_impression");
        ViewOnClickListenerC55455Ok9.A01(view.requireViewById(R.id.form_name_clickable_area), 67, this);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.form_name_text);
        AbstractC50891MeM A002 = A00();
        if (A002 instanceof NOU) {
            str2 = ((NOU) A002).A01.A04;
        } else {
            str2 = ((NOT) A002).A00.A1N;
            C14360o3.A06(str2);
        }
        A0T.setText(str2);
    }

    public final AbstractC50891MeM A00() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52560NNg) {
            interfaceC09390do = ((C52560NNg) this).A00;
        } else {
            interfaceC09390do = ((C52559NNf) this).A00;
        }
        return (AbstractC50891MeM) interfaceC09390do.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        AbstractC50891MeM A00 = A00();
        if (A00 instanceof NOU) {
            return ((NOU) A00).A00;
        }
        return ((NOT) A00).A01;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        AbstractC50891MeM A00 = A00();
        O3R o3r = A00.A00;
        if (A00 instanceof NOU) {
            str = ((NOU) A00).A02;
        } else {
            str = ((NOT) A00).A02;
        }
        C14360o3.A0B(str, 0);
        InterfaceC58268PsC.A02(o3r.A00, str, "lead_gen_advanced_setting", "cancel");
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1481709357);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_advanced_settings, viewGroup, false);
        C0f9.A09(352504896, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1348356583);
        super.onStart();
        this.A00 = PZH.A01(this, A00().A02, 21);
        C0f9.A09(1490952239, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(826989659);
        super.onStop();
        this.A00 = MSY.A0r(this.A00);
        C0f9.A09(-1284722311, A02);
    }
}
