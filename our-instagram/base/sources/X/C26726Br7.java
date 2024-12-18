package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.Br7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26726Br7 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ShareToFriendsStoryConsumptionFragment";
    public CPK A00;
    public User A01;
    public String A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(-975588360);
        Bundle requireArguments = requireArguments();
        User user = (User) requireArguments.getParcelable(AbstractC111324zv.A00(3761));
        if (user == null) {
            i = 449187496;
        } else {
            this.A01 = user;
            String string = requireArguments.getString(AbstractC111324zv.A00(3760));
            if (string == null) {
                i = -178290480;
            } else {
                this.A02 = string;
                super.onCreate(bundle);
                i = -117994544;
            }
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(733098785);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.share_to_friends_story_consumption_fragment, viewGroup, false);
        boolean A06 = C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(this.A03), 36321627889215121L);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(inflate, R.id.avatar);
        User user = this.A01;
        String str = "producer";
        if (user != null) {
            gradientSpinnerAvatarView.A0F(null, this, user.Bhu());
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            TextView A0N = AbstractC167007dF.A0N(inflate, R.id.description_text);
            String str2 = this.A02;
            if (str2 == null) {
                str = "reelOwnerUsername";
            } else {
                User user2 = this.A01;
                if (user2 != null) {
                    Spanned fromHtml = Html.fromHtml(getString(2131956640, str2, user2.getUsername()), 0);
                    C14360o3.A07(fromHtml);
                    SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) fromHtml);
                    if (A06) {
                        String A0v = AbstractC25227BEk.A0v(this, 2131973776);
                        append.append((CharSequence) AnonymousClass001.A0D(A0v, ' '));
                        AnonymousClass773.A03(append, new AnonymousClass522(Integer.valueOf(requireContext().getColor(AbstractC53242c7.A0H(getContext(), R.attr.igds_color_gradient_blue)))), A0v);
                        A0N.setText(append);
                        ViewOnClickListenerC28666ClE.A01(A0N, 39, this);
                    } else {
                        A0N.setText(append);
                    }
                    TextView A0T = AbstractC166997dE.A0T(inflate, R.id.username);
                    User user3 = this.A01;
                    if (user3 != null) {
                        A0T.setText(user3.getUsername());
                        TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.user_fullname);
                        User user4 = this.A01;
                        if (user4 != null) {
                            if (user4.getFullName() != null) {
                                User user5 = this.A01;
                                if (user5 != null) {
                                    A0N2.setText(user5.getFullName());
                                }
                            } else {
                                A0N2.setVisibility(8);
                            }
                            View requireViewById = inflate.requireViewById(R.id.follow_list_container);
                            Context context = requireViewById.getContext();
                            requireViewById.setBackgroundColor(context.getColor(AbstractC53242c7.A02(context)));
                            ViewOnClickListenerC28666ClE.A01(requireViewById, 38, this);
                            if (!A06) {
                                inflate.requireViewById(R.id.feature_unavailable_text).setVisibility(0);
                            }
                            C0f9.A09(-1222195711, A02);
                            return inflate;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
