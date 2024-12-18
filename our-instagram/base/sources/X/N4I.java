package X;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class N4I extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DefaultNudgeFragment";
    public C54709OEl A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "nudging";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0Q = AbstractC25230BEn.A0Q(view, R.id.learn_more_tv);
        C57511Pfl c57511Pfl = new C57511Pfl(this, 27);
        getResources();
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        ArrayDeque arrayDeque = new ArrayDeque();
        A01.append((CharSequence) getString(2131972488));
        AbstractC31423DrT.A00(A01, getString(2131972489), "[[learn_more]]", arrayDeque, new Object[]{new NY0(c57511Pfl, AbstractC25233BEq.A04(this), 26)}, 33);
        AbstractC25227BEk.A11(A0Q);
        A0Q.setHighlightColor(MSX.A02(requireContext()));
        A0Q.setText(new SpannableString(A01));
        ViewOnClickListenerC55463OkI.A00(AbstractC166987dD.A0c(view, R.id.nudge_cta), 16, this);
        C54709OEl c54709OEl = this.A00;
        if (c54709OEl != null) {
            C38321qM c38321qM = c54709OEl.A01;
            String str2 = c54709OEl.A03;
            String str3 = c54709OEl.A04;
            boolean z = c54709OEl.A05;
            C18920wW c18920wW = c54709OEl.A00;
            if (str2 == null) {
                num = C05F.A0Y;
            } else {
                num = C05F.A0N;
            }
            LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b("is_launched_from_bottomsheet", String.valueOf(z)));
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_wellbeing_nudging");
            if (3 - num.intValue() != 0) {
                str = "heated_thread_ig_led";
            } else {
                str = "comment_reply";
            }
            A0f.AAP("source_of_action", str);
            A0f.A9M("extra_values", A07);
            A0f.A9K("parent_comment_id", AbstractC37302Gc3.A0W(str3));
            A0f.A9K("replied_to_comment_id", AbstractC37302Gc3.A0V(str2));
            MSW.A1S(A0f, c38321qM.getId());
            AbstractC31171DnF.A1A(A0f, "impression");
            A0f.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-347911257);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nudge_bottom_sheet, viewGroup, false);
        C0f9.A09(1880015821, A02);
        return inflate;
    }
}
