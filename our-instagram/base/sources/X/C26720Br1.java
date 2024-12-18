package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.Br1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26720Br1 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsTemplateBrowserMoreInfoBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final String A01 = "clips_template_browser_more_info_bottom_sheet";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC166987dD.A0e(view, R.id.bottom_sheet_description).setText(requireArguments().getString(DevServerEntity.COLUMN_DESCRIPTION));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1896707636);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_template_browser_bottom_sheet_layout, viewGroup, false);
        C0f9.A09(-323235446, A02);
        return inflate;
    }
}
