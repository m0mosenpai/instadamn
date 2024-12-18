package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EkY extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "NudityPreSendEducationBottomSheetContentFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.setBackgroundResource(AbstractC53242c7.A02(getContext()));
        ArrayList A1E = AbstractC166987dD.A1E();
        int A03 = AbstractC167017dG.A03(AbstractC31173DnH.A07(this, new C34940FaQ(AbstractC56412ia.A00(AbstractC166997dE.A0N(this), R.drawable.ig_illustrations_illo_nudity_detection_refresh)), A1E));
        int A06 = AbstractC167017dG.A06(requireContext());
        C34626FNj c34626FNj = new C34626FNj(0, A06, 0, A06, A03, A03);
        C34965Fap c34965Fap = new C34965Fap(requireContext().getString(2131969897));
        c34965Fap.A02 = 4;
        c34965Fap.A03 = R.style.igds_headline_1_bold;
        c34965Fap.A05 = c34626FNj;
        C34965Fap c34965Fap2 = new C34965Fap(AbstractC31173DnH.A07(this, c34965Fap, A1E).getString(2131969893));
        c34965Fap2.A02 = 4;
        c34965Fap2.A03 = R.style.igds_body_1;
        c34965Fap2.A05 = c34626FNj;
        Context A07 = AbstractC31173DnH.A07(this, c34965Fap2, A1E);
        String A0p = AbstractC166997dE.A0p(A07, 2131953639);
        String A0T = AnonymousClass001.A0T(A07.getString(2131969894), A0p, ' ');
        Em1 em1 = new Em1(this, AbstractC31174DnI.A02(A07));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0T);
        AnonymousClass773.A04(A0H, em1, A0p);
        C34965Fap c34965Fap3 = new C34965Fap(A0H);
        c34965Fap3.A02 = 4;
        c34965Fap3.A03 = R.style.igds_body_1;
        c34965Fap3.A05 = c34626FNj;
        A1E.add(c34965Fap3);
        setItems(A1E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(794809697);
        super.onCreate(bundle);
        C0f9.A09(1436917867, A02);
    }
}
