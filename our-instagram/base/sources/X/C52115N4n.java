package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.facebook.R;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.N4n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52115N4n extends AbstractC59962oe {
    public static final SparseArray A01;
    public static final Map A02;
    public static final String __redex_internal_original_name = "ProfileLiveNotificationsSettingsFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_video_notifications_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        User A022 = AbstractC31176DnK.A0h(this.A00).A02(requireArguments().getString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID"));
        if (A022 != null) {
            String string = requireArguments().getString("ProfileLiveNotificationsSettingsFragment.CLICK_POINT", "following_sheet");
            IgdsFooterCell igdsFooterCell = (IgdsFooterCell) AbstractC166997dE.A0R(view, R.id.profile_follow_sheet_footer);
            String A0c = AbstractC31178DnM.A0c(requireContext(), A022, 2131976458);
            C14360o3.A07(A0c);
            igdsFooterCell.A00(A0c);
            Map map = A02;
            Number A0Q = AbstractC37300Gc1.A0Q(A022.A09(), map);
            if (A0Q == null && (A0Q = (Number) map.get(IGLiveNotificationPreference.A05)) == null) {
                throw AbstractC166997dE.A0g();
            }
            ((CompoundButton) AbstractC166997dE.A0R(view, A0Q.intValue())).setChecked(true);
            ((RadioGroup) AbstractC166997dE.A0R(view, R.id.follow_sheet_radio_group)).setOnCheckedChangeListener(new C55527OlL(this, A022, string));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.follow_sheet_all_notifications, IGLiveNotificationPreference.A04);
        sparseArray.put(R.id.follow_sheet_some_notifications, IGLiveNotificationPreference.A05);
        sparseArray.put(R.id.follow_sheet_no_notifications, IGLiveNotificationPreference.A06);
        A01 = sparseArray;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            SparseArray sparseArray2 = A01;
            AbstractC37301Gc2.A1T(sparseArray2.valueAt(i), A1I, sparseArray2.keyAt(i));
        }
        A02 = A1I;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C0f9.A02(-1109292034);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_profile_follow_sheet_multi_options_notifications, viewGroup, false);
        C0f9.A09(2134730071, A022);
        return inflate;
    }
}
