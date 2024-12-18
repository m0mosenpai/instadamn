package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.user.model.User;

/* renamed from: X.N4c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52104N4c extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IgLiveModeratorViewerWarningFragment";
    public User A00;
    public String A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("args.broadcaster_id")) != null) {
            this.A01 = string;
        }
        User A02 = AbstractC31176DnK.A0h(this.A02).A02(this.A01);
        this.A00 = A02;
        if (A02 != null) {
            ((IgdsHeadline) AbstractC166997dE.A0R(view, R.id.moderator_viewer_warning_headline)).setBody(AbstractC31174DnI.A0w(this, A02.getUsername(), 2131965443));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-414454675);
        super.onCreate(bundle);
        requireArguments();
        C0f9.A09(-341089181, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1769732199);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_iglive_moderator_viewer_warning_fragment, viewGroup, false);
        C0f9.A09(871788802, A02);
        return inflate;
    }
}
