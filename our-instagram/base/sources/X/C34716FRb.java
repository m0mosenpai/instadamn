package X;

import android.text.SpannableString;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FRb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34716FRb {
    public static boolean A09;
    public EnumC31507Dsr A00;
    public String A01;
    public String A02;
    public List A03;
    public final BusinessFlowAnalyticsLogger A04;
    public final OnboardingCheckListFragment A05;
    public final C31500Dsk A06;
    public final UserSession A07;
    public final String A08;

    public C34716FRb(BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, OnboardingCheckListFragment onboardingCheckListFragment, C31500Dsk c31500Dsk, UserSession userSession, String str) {
        AbstractC167007dF.A1G(userSession, 1, str);
        this.A07 = userSession;
        this.A05 = onboardingCheckListFragment;
        this.A06 = c31500Dsk;
        this.A04 = businessFlowAnalyticsLogger;
        this.A08 = str;
        this.A02 = "";
        this.A01 = "";
    }

    public final void A01(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
        if (businessFlowAnalyticsLogger != null && str != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("onboarding_checklist", this.A08, str, null, null, null, null, null));
        }
    }

    public final void A00() {
        SpannableString spannableString;
        int A0H;
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        List<FRF> list = this.A03;
        if (list == null) {
            list = C16930sl.A00;
        }
        for (FRF frf : list) {
            if ("complete".equals(frf.A03)) {
                builder2.add((Object) frf);
            } else {
                builder.add((Object) frf);
            }
        }
        ImmutableList build = builder.build();
        ImmutableList build2 = builder2.build();
        OnboardingCheckListFragment onboardingCheckListFragment = this.A05;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        build.getClass();
        C1LC it = build.iterator();
        while (it.hasNext()) {
            A0E.A00(new C36179Fxt((FRF) it.next()));
        }
        build2.getClass();
        if (!build2.isEmpty()) {
            A0E.A00(new C36180Fxu(onboardingCheckListFragment.getString(2131956560)));
            C1LC it2 = build2.iterator();
            while (it2.hasNext()) {
                A0E.A00(new C36179Fxt((FRF) it2.next()));
            }
        }
        onboardingCheckListFragment.A06.A05(A0E);
        int size = build2.size();
        int size2 = build2.size() + build.size();
        String string = onboardingCheckListFragment.getString(2131956561, AbstractC25228BEl.A1Z(Integer.valueOf(size), size2));
        if (AbstractC31178DnM.A1X(C06090Tz.A05, onboardingCheckListFragment.A07, 36326167669782239L)) {
            spannableString = new SpannableString(AnonymousClass001.A0g(string, " ", onboardingCheckListFragment.getString(2131974405)));
            A0H = AbstractC53242c7.A07(onboardingCheckListFragment.requireContext());
            onboardingCheckListFragment.mStepsCompletedTextView.setAllCaps(false);
        } else {
            spannableString = new SpannableString(AnonymousClass001.A0g(string, " ", onboardingCheckListFragment.getString(2131974404)));
            if (size <= size2 / 2) {
                A0H = R.color.clips_gradient_redesign_color_1;
            } else {
                A0H = AbstractC53242c7.A0H(onboardingCheckListFragment.requireContext(), R.attr.igds_color_success);
            }
        }
        C13680mu.A02(spannableString, spannableString.toString(), onboardingCheckListFragment.requireContext().getColor(AbstractC53242c7.A09(onboardingCheckListFragment.requireContext())));
        C13680mu.A02(spannableString, string, onboardingCheckListFragment.requireContext().getColor(A0H));
        onboardingCheckListFragment.mStepsCompletedTextView.setText(spannableString);
        onboardingCheckListFragment.mHeadline.setHeadline(onboardingCheckListFragment.A04.A02);
        onboardingCheckListFragment.mHeadline.setBody(onboardingCheckListFragment.A04.A01);
        if (onboardingCheckListFragment.A0A) {
            onboardingCheckListFragment.A0A = false;
            FKC fkc = onboardingCheckListFragment.A02;
            AnonymousClass693 anonymousClass693 = fkc.A01;
            ImageView imageView = fkc.A00;
            if (imageView != null && anonymousClass693 != null && !anonymousClass693.isPlaying()) {
                imageView.setVisibility(0);
                anonymousClass693.EMk(0.0f);
                anonymousClass693.E4S();
            }
        }
        if (build.isEmpty()) {
            onboardingCheckListFragment.mBusinessNavBar.setVisibility(0);
            AbstractC167007dF.A0x(onboardingCheckListFragment.mSkipOcContainer);
        } else {
            CallerContext callerContext = C35792FrU.A00;
        }
    }

    public final void A02(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            String str = ((FRF) obj).A05;
            C14360o3.A07(str);
            if (F0R.A00(str) != null) {
                A1E.add(obj);
            }
        }
        this.A03 = A1E;
        A00();
    }
}
