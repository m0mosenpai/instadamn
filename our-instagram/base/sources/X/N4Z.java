package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.mediakit.config.MediaKitSectionActionSheetConfig;

/* loaded from: classes9.dex */
public final class N4Z extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MediaKitSectionActionSheetFragment";
    public RecyclerView A00;
    public MediaKitSectionActionSheetConfig A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31176DnK.A0F(view);
        C66362zD A0R = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new NEJ(this));
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            recyclerView.setAdapter(A0R);
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            MediaKitSectionActionSheetConfig mediaKitSectionActionSheetConfig = this.A01;
            if (mediaKitSectionActionSheetConfig == null) {
                str = "sheetConfig";
            } else {
                A0E.A01(mediaKitSectionActionSheetConfig.A00);
                A0R.A05(A0E);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1077894163);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("mk_section_action_sheet_config");
        if (parcelable != null) {
            this.A01 = (MediaKitSectionActionSheetConfig) parcelable;
            C0f9.A09(-725451622, A02);
        } else {
            IllegalStateException A14 = AbstractC166987dD.A14("MediaKitSectionActionSheetConfig expected but was null");
            C0f9.A09(-1841301458, A02);
            throw A14;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-83008321);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_simple_recycler_fragment, false);
        C0f9.A09(-1834072066, A02);
        return A0R;
    }
}
