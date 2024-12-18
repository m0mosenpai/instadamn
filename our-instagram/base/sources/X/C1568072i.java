package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.text.LinkTextView;
import com.instagram.ui.dynamiclayout.DynamicConstraintLayout;

/* renamed from: X.72i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1568072i implements InterfaceC1568172j {
    public InterfaceC1568572n A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final UserSession A05;
    public final C57012jc A06;
    public final C57012jc A07;
    public final C57012jc A08;
    public final C57012jc A09;
    public final C57012jc A0A;
    public final C57012jc A0B;
    public final C57012jc A0C;
    public final C57012jc A0D;
    public final C57012jc A0E;
    public final C57012jc A0F;
    public final C57012jc A0G;
    public final C57012jc A0H;
    public final C57012jc A0I;
    public final C57012jc A0J;
    public final C57012jc A0K;
    public final C57012jc A0L;
    public final C57012jc A0M;
    public final C57012jc A0N;
    public final C57012jc A0O;
    public final InterfaceC56392iX A0P;
    public final LinkTextView A0Q;
    public final DynamicConstraintLayout A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;
    public final InterfaceC09390do A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final InterfaceC09390do A0i;
    public final InterfaceC09390do A0j;
    public final InterfaceC09390do A0k;
    public final InterfaceC09390do A0l;
    public final InterfaceC09390do A0m;
    public final InterfaceC09390do A0n;
    public final InterfaceC09390do A0o;
    public final C57012jc A0p;
    public final C57012jc A0q;
    public final InterfaceC09390do A0r;

    public C1568072i(View view, UserSession userSession) {
        View view2;
        int i;
        View view3;
        int i2;
        C14360o3.A0B(view, 1);
        this.A02 = view;
        this.A05 = userSession;
        this.A0B = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_metrics_clean));
        this.A0R = (DynamicConstraintLayout) view;
        int ordinal = AbstractC1568272k.A00(userSession).ordinal();
        if (ordinal != 2) {
            if (ordinal != 0 && ordinal != 1 && ordinal != 3) {
                throw new RuntimeException();
            }
            view2 = this.A02;
            i = R.id.profile_header_full_name;
        } else {
            view2 = this.A02;
            i = R.id.profile_header_full_name_above_vanity;
        }
        View requireViewById = view2.requireViewById(i);
        C14360o3.A07(requireViewById);
        this.A04 = (TextView) requireViewById;
        int ordinal2 = AbstractC1568272k.A00(userSession).ordinal();
        if (ordinal2 != 2) {
            if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 3) {
                throw new RuntimeException();
            }
            view3 = this.A02;
            i2 = R.id.profile_header_pronouns;
        } else {
            view3 = this.A02;
            i2 = R.id.profile_header_pronouns_above_vanity;
        }
        this.A0L = new C57012jc((ViewStub) view3.findViewById(i2));
        C06090Tz c06090Tz = C06090Tz.A06;
        C57012jc c57012jc = new C57012jc((ViewStub) view.findViewById(C18U.A06(c06090Tz, userSession, 36327700972976933L) ? R.id.profile_header_barcelona_badge_below_bio : R.id.profile_header_barcelona_badge));
        this.A06 = c57012jc;
        this.A0E = new C57012jc((ViewStub) view.findViewById(R.id.internal_badge));
        this.A0F = new C57012jc((ViewStub) view.findViewById(R.id.internal_only_hip_badge));
        this.A0O = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_verified_label));
        this.A09 = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_business_category));
        View requireViewById2 = view.requireViewById(R.id.profile_header_bio_text);
        C14360o3.A07(requireViewById2);
        this.A0Q = (LinkTextView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.profile_header_bio_translation_link);
        C14360o3.A07(requireViewById3);
        this.A03 = (TextView) requireViewById3;
        this.A0G = new C57012jc((ViewStub) view.findViewById(R.id.profile_memorialized_tag));
        View requireViewById4 = view.requireViewById(R.id.profile_header_bio_translation_spinner);
        C14360o3.A07(requireViewById4);
        this.A01 = requireViewById4;
        this.A0A = new C57012jc((ViewStub) view.findViewById(R.id.profile_chats_links_view));
        this.A08 = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_business_address));
        this.A0p = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_channel));
        this.A0N = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_restrict_indicator));
        this.A0H = new C57012jc((ViewStub) this.A02.findViewById(C18U.A06(C06090Tz.A05, userSession, 36327700974484271L) ? R.id.profile_header_metrics_linear_layout : R.id.profile_header_metrics));
        this.A0D = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_interest));
        this.A0M = new C57012jc((ViewStub) view.findViewById(C18U.A06(c06090Tz, userSession, 36327700972976933L) ? R.id.quiet_mode_profile_indicator_below_bio : R.id.quiet_mode_profile_indicator));
        this.A0J = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_name_and_bio_upsell));
        this.A0I = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_name_and_bio_banner));
        this.A0K = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_profile_card_nux_banner));
        this.A0q = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_h2g_inset_banner));
        this.A0P = AbstractC56372iV.A01(view.findViewById(R.id.banner_row), false, false);
        this.A07 = new C57012jc((ViewStub) c57012jc.A01().findViewById(R.id.blue_dot_stub));
        this.A0C = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_follow_context));
        this.A0i = AbstractC09440dt.A01(new C9EY(this, 1));
        this.A0h = AbstractC09440dt.A01(new C9EY(this, 0));
        this.A0l = AbstractC09440dt.A01(new C9EY(this, 4));
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0j = AbstractC09440dt.A00(enumC09460dv, new C9EY(this, 2));
        this.A0m = AbstractC09440dt.A01(new C9EY(this, 5));
        this.A0k = AbstractC09440dt.A00(enumC09460dv, new C9EY(this, 3));
        this.A0e = AbstractC09440dt.A01(new C9EQ(this, 47));
        this.A0g = AbstractC09440dt.A01(new C9EQ(this, 49));
        this.A0f = AbstractC09440dt.A01(new C9EQ(this, 48));
        this.A0d = AbstractC09440dt.A01(new C9EQ(this, 46));
        this.A0o = AbstractC09440dt.A01(new C9EY(this, 7));
        this.A0n = AbstractC09440dt.A01(new C9EY(this, 6));
        this.A0U = AbstractC09440dt.A01(new C9EQ(this, 37));
        this.A0W = AbstractC09440dt.A01(new C9EQ(this, 39));
        this.A0V = AbstractC09440dt.A01(new C9EQ(this, 38));
        this.A0X = AbstractC09440dt.A01(new C9EQ(this, 40));
        this.A0Z = AbstractC09440dt.A01(new C9EQ(this, 42));
        this.A0Y = AbstractC09440dt.A01(new C9EQ(this, 41));
        this.A0a = AbstractC09440dt.A01(new C9EQ(this, 43));
        this.A0c = AbstractC09440dt.A01(new C9EQ(this, 45));
        this.A0b = AbstractC09440dt.A01(new C9EQ(this, 44));
        this.A0S = AbstractC09440dt.A01(new C9EQ(this, 35));
        this.A0T = AbstractC09440dt.A01(new C9EQ(this, 36));
        this.A0r = AbstractC09440dt.A01(new C9EQ(this, 34));
    }

    @Override // X.InterfaceC1568172j
    public final InterfaceC1568572n Ael() {
        InterfaceC1568572n interfaceC1568572n = this.A00;
        if (interfaceC1568572n != null) {
            return interfaceC1568572n;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
