package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EIC extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UnfollowChainingBottomSheetFragment";
    public FL8 A00;
    public String A01 = "";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "unfollow_chaining_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1322041663);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString(AbstractC58410Puo.A01(43, 8, 117))) == null) {
            str = "";
        }
        this.A01 = str;
        C0f9.A09(-1720742949, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-145746771);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.unfollow_chaining_bottom_sheet, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(inflate, R.id.unfollow_chaining_headline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_qp_confirm_refresh);
        String A0w = AbstractC31174DnI.A0w(this, this.A01, 2131976081);
        C14360o3.A07(A0w);
        String str = this.A01;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0w);
        AbstractC31174DnI.A1B(A0H, str);
        igdsHeadline.setHeadline(A0H);
        igdsHeadline.EPC(ViewOnClickListenerC31723DwS.A00(this, 26), 2131976080);
        C0f9.A09(322018022, A02);
        return inflate;
    }
}
