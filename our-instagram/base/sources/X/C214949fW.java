package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9fW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214949fW extends AbstractC59962oe implements InterfaceC1119153d {
    public static final String __redex_internal_original_name = "MentionThreadSettingNuxBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "mention_thread_setting_bottomsheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C23031Ai A00 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(this.A00));
        AbstractC167007dF.A1L(A00, A00.A5E, C23031Ai.A8c, 235, true);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (parcelableArrayList = bundle2.getParcelableArrayList("potential_thread_members")) != null) {
            ImageView imageView = (ImageView) AbstractC166997dE.A0R(view, R.id.facepile_holder);
            ArrayList A0q = AbstractC167017dG.A0q(parcelableArrayList);
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                A0q.add(((User) it.next()).Bhu());
            }
            imageView.setImageDrawable(AbstractC28320Ce8.A02(requireContext(), "mention_thread_setting_bottomsheet", A0q, 3, R.dimen.abc_list_item_height_material, R.dimen.abc_action_bar_elevation_material));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(781252584);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_mention_thread_setting_nux_bottomsheet_fragment, viewGroup, false);
        C14360o3.A07(inflate);
        C0f9.A09(1018715290, A02);
        return inflate;
    }
}
