package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.N4a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52102N4a extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "RtcCallSurveyFragment";
    public final InterfaceC09390do A00;
    public final C51911Mwt A01;
    public final InterfaceC16660sJ A02;

    public C52102N4a(C51911Mwt c51911Mwt, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c51911Mwt, 1);
        this.A01 = c51911Mwt;
        this.A02 = interfaceC16660sJ;
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "rtc_call_survey_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        boolean A1V = AbstractC167007dF.A1V(interfaceC16660sJ);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.survey_question);
        Context context = view.getContext();
        C66362zD A0R = AbstractC31173DnH.A0R(C66362zD.A00(context), new EXB(interfaceC16660sJ));
        C1XM.A00(new C57543PgH(view, 41));
        RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.survey_options_recycler_view);
        AbstractC31174DnI.A16(A0B.getContext(), A0B, A1V ? 1 : 0, false);
        A0B.setAdapter(A0R);
        A0B.A0S = A1V;
        C51911Mwt c51911Mwt = this.A01;
        List<EnumC53248Ngm> list = c51911Mwt.A01;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (EnumC53248Ngm enumC53248Ngm : list) {
            A0q.add(new C32078E8c(enumC53248Ngm, AbstractC166997dE.A0p(context, enumC53248Ngm.A00)));
        }
        String str = c51911Mwt.A00;
        C14360o3.A0B(str, 0);
        A0e.setText(str);
        AbstractC010103p.A0I(A0e, A1V);
        A0R.A05(AbstractC43593JPy.A0L(A0q));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1083896348);
        super.onCreate(bundle);
        requireArguments();
        C0f9.A09(-2044728300, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1009348244);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_call_survey_fragment, false);
        C0f9.A09(-173852878, A02);
        return A0R;
    }
}
