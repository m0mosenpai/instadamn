package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EfA extends AbstractC32317ELg {
    public static final String __redex_internal_original_name = "ConsentIntroFragment";
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TextView A03;
    public EVF A04;
    public ProgressButton A05;
    public final View.OnClickListener A06 = ViewOnClickListenerC35685FpK.A00(this, 28);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    @Override // X.AbstractC32317ELg, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        int A02 = C0f9.A02(-1116650716);
        super.onCreate(bundle);
        String string = requireArguments().getString("GDPR.Fragment.EntryPoint");
        if (string == null) {
            string = "unknown";
        }
        String string2 = requireArguments().getString("GDPR.Fragment.UserState");
        Integer[] A00 = C05F.A00(3);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                if (C14360o3.A0K(FVT.A01(num), string2)) {
                    break;
                } else {
                    i++;
                }
            } else {
                num = C05F.A0C;
                break;
            }
        }
        synchronized (C35154Few.A00()) {
            C35154Few c35154Few = C35154Few.A0B;
            c35154Few.A06 = string;
            c35154Few.A04 = num;
        }
        C35208Fg0.A00().A03(string, num);
        C0f9.A09(1687580611, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RegFlowExtras regFlowExtras;
        int A02 = C0f9.A02(229151491);
        View inflate = layoutInflater.inflate(R.layout.gdpr_intro_layout, viewGroup, false);
        this.A00 = inflate.requireViewById(R.id.container);
        this.A01 = inflate.requireViewById(R.id.loading_indicator);
        this.A03 = AbstractC166997dE.A0T(this.A00, R.id.content_title);
        AbstractC35175FfS.A03(this.A03, requireContext());
        this.A02 = AbstractC31172DnG.A0B(this.A00, R.id.paragraphs_container);
        C0fQ.A00(this.A06, this.A00.requireViewById(R.id.data_policy_link));
        ProgressButton A0U = AbstractC31180DnO.A0U(this.A00);
        this.A05 = A0U;
        EVF evf = new EVF(this, A0U, null);
        this.A04 = evf;
        registerLifecycleListener(evf);
        this.A01.setVisibility(0);
        Ef7 ef7 = new Ef7(this, this);
        Context context = getContext();
        Integer num = C35154Few.A00().A04;
        Integer num2 = C05F.A00;
        if (num == num2 && context == null) {
            throw AbstractC166987dD.A14("Context cannot be null if UserState is NEW_USER");
        }
        Context context2 = getContext();
        Integer num3 = C35154Few.A00().A04;
        String str = C35154Few.A00().A07;
        AbstractC18680vv abstractC18680vv = super.A00;
        C25621Ms c25621Ms = new C25621Ms(abstractC18680vv);
        if (C35154Few.A00().A04 == num2 && (regFlowExtras = super.A01) != null) {
            String str2 = regFlowExtras.A08;
            String str3 = regFlowExtras.A0Q;
            c25621Ms.A0H("email", str2);
            c25621Ms.A0H("phone", str3);
        }
        C1ON A00 = FVR.A00(context2, c25621Ms, abstractC18680vv, null, num3, str);
        A00.A00 = ef7;
        C1GJ.A03(A00);
        C0f9.A09(-891409667, A02);
        return inflate;
    }

    @Override // X.AbstractC32317ELg, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(498162851);
        super.onDestroy();
        EVF evf = this.A04;
        if (evf != null) {
            unregisterLifecycleListener(evf);
        }
        C0f9.A09(1238380305, A02);
    }
}
