package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.EIk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32251EIk extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "NuxSurveyFragment";
    public LinearLayout A00;
    public InterfaceC37264GbH A01;
    public ProgressButton A02;
    public List A03;
    public long A05;
    public boolean A04 = true;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final void A00(C32251EIk c32251EIk, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(AbstractC166987dD.A0o(c32251EIk.A06)), "ig_nux_survey_event");
        if (A0f.isSampled()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            LinearLayout linearLayout = c32251EIk.A00;
            if (linearLayout != null) {
                C12500ku c12500ku = new C12500ku(linearLayout);
                while (c12500ku.hasNext()) {
                    View view = (View) c12500ku.next();
                    if (view instanceof IgdsListCell) {
                        IgdsListCell igdsListCell = (IgdsListCell) view;
                        if (igdsListCell.A0H) {
                            A1E.add(igdsListCell.getTag().toString());
                        }
                    }
                }
            }
            A0f.AAP("survey_id", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A0f.AAP("question_id", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A0f.AAP("question_text", c32251EIk.getString(2131968905));
            List list = c32251EIk.A03;
            if (list == null) {
                C14360o3.A0F("surveyOptions");
                throw C00O.createAndThrow();
            }
            A0f.AAk("answer_options_array", list);
            A0f.A9K(TraceFieldType.StartTime, Long.valueOf(c32251EIk.A05));
            A0f.A9K("end_time", AbstractC31173DnH.A0g());
            A0f.AAk("user_answers_array", A1E);
            A0f.A7v("user_skipped", Boolean.valueOf(z));
            A0f.AAP("screen_name", __redex_internal_original_name);
            A0f.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1776537817);
        this.A01 = AbstractC34275F9v.A00(this);
        this.A03 = AbstractC16960so.A1Q(getString(2131975029), getString(2131975030), getString(2131975031), getString(2131975032), getString(2131975033), getString(2131975034), getString(2131975035), getString(2131975036));
        super.onCreate(bundle);
        C0f9.A09(-940042679, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1495759243);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_survey_fragment, viewGroup, false);
        InterfaceC09390do interfaceC09390do = this.A06;
        this.A04 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36330114744599235L);
        C14360o3.A0A(inflate);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.nux_survey_title);
        igdsHeadline.setHeadline(2131968905);
        if (this.A04) {
            igdsHeadline.setBody(2131968904);
        } else {
            igdsHeadline.setBody((CharSequence) null);
        }
        this.A00 = AbstractC31172DnG.A0B(inflate, R.id.options_container);
        List list = this.A03;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List list2 = this.A03;
                if (list2 != null) {
                    String str = (String) AbstractC001800i.A0O(list2, i);
                    if (str != null && str.length() != 0) {
                        IgdsListCell igdsListCell = new IgdsListCell(requireContext(), null);
                        igdsListCell.A0I(str);
                        igdsListCell.setTag(AnonymousClass001.A0O("option", i));
                        if (this.A04) {
                            igdsListCell.setTextCellType(EnumC53237Nga.A03);
                            igdsListCell.setCheckBoxAlignmentContrib(EnumC53106NeJ.A02);
                        } else {
                            igdsListCell.setTextCellType(EnumC53237Nga.A07);
                        }
                        igdsListCell.A0C(new ViewOnClickListenerC35684FpJ(38, igdsListCell, this, igdsListCell));
                        LinearLayout linearLayout = this.A00;
                        if (linearLayout != null) {
                            linearLayout.addView(igdsListCell);
                        }
                    }
                }
            }
            ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
            ViewOnClickListenerC31724DwT.A00(A0U, 44, this);
            this.A02 = A0U;
            ViewOnClickListenerC31724DwT.A00(AbstractC166997dE.A0S(inflate, R.id.skip_button), 45, this);
            C35203Ffv.A01(AbstractC166987dD.A0o(interfaceC09390do), "nux_uxr_survey");
            this.A05 = System.currentTimeMillis();
            C0f9.A09(-1376168241, A02);
            return inflate;
        }
        C14360o3.A0F("surveyOptions");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1250085247);
        super.onDestroyView();
        this.A00 = null;
        this.A02 = null;
        C0f9.A09(-123610608, A02);
    }
}
