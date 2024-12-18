package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.EKh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32294EKh extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "UnderAgeFragment";
    public UserSession A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "under_age_challenge";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle(getString(2131976062));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(288114806);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A04 = AbstractC31173DnH.A0j(requireArguments, "headline");
        this.A03 = AbstractC31173DnH.A0j(requireArguments, "content");
        this.A02 = AnonymousClass001.A0R("https://i.instagram.com", requireArguments.getString("download_data_link"));
        this.A01 = AbstractC31173DnH.A0j(requireArguments, "appeal_link");
        C0f9.A09(-1352444677, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(139295354);
        View inflate = layoutInflater.inflate(R.layout.challenge_under_age_layout, viewGroup, false);
        AbstractC166997dE.A0T(inflate, R.id.content_title).setText(this.A04);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.content_body);
        String str = this.A03;
        Em1 em1 = new Em1(AbstractC31174DnI.A0q(requireContext(), R.color.badge_color), this, 7);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
        Matcher matcher = Pattern.compile("\\^\\*.*\\^\\*").matcher(A0H.toString());
        if (matcher.find()) {
            A0H.setSpan(em1, matcher.start(), matcher.end(), 33);
            A0H.replace(matcher.end() - 2, matcher.end(), (CharSequence) "");
            A0H.replace(matcher.start(), matcher.start() + 2, (CharSequence) "");
        }
        AbstractC31176DnK.A1G(A0T, A0H);
        ViewOnClickListenerC35679FpE.A01(inflate.requireViewById(R.id.appeal_button), 4, this);
        ViewOnClickListenerC35679FpE.A01(inflate.requireViewById(R.id.logout_button), 5, this);
        C35208Fg0.A00().A03("unknown", C05F.A01);
        C35208Fg0 A00 = C35208Fg0.A00();
        UserSession userSession = this.A00;
        Integer num = C05F.A06;
        AbstractC167007dF.A1K(userSession, num);
        C35208Fg0.A01(this, userSession, A00, num, null);
        C0f9.A09(1737213427, A02);
        return inflate;
    }
}
